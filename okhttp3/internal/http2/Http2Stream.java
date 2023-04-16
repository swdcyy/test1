package okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.Headers;
import java.lang.Object;
import java.util.ArrayDeque;
import okhttp3.internal.http2.Http2Stream$StreamTimeout;
import java.lang.String;
import java.util.Objects;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.Http2Stream$FramingSource;
import okhttp3.internal.http2.Http2Stream$FramingSink;
import java.util.Deque;
import java.lang.IllegalStateException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import java.io.IOException;
import okio.m;
import okio.n;
import okio.o;
import okio.d;
import java.util.List;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header$Listener;
import okio.a;
import java.lang.Thread;
import java.io.InterruptedIOException;

public final class Http2Stream	// class@001fb6
{
    public long bytesLeftInWriteWindow;
    public final Http2Connection connection;
    public ErrorCode errorCode;
    public boolean hasResponseHeaders;
    public Header$Listener headersListener;
    public final Deque headersQueue;
    public final int id;
    public final Http2Stream$StreamTimeout readTimeout;
    public final Http2Stream$FramingSink sink;
    public final Http2Stream$FramingSource source;
    public long unacknowledgedBytesRead;
    public final Http2Stream$StreamTimeout writeTimeout;
    public static final boolean $assertionsDisabled;

    public void Http2Stream(int p0,Http2Connection p1,boolean p2,boolean p3,Headers p4){
       super();
       this.unacknowledgedBytesRead = 0;
       ArrayDeque uArrayDeque = new ArrayDeque();
       this.headersQueue = uArrayDeque;
       this.readTimeout = new Http2Stream$StreamTimeout(this);
       this.writeTimeout = new Http2Stream$StreamTimeout(this);
       this.errorCode = null;
       Objects.requireNonNull(p1, "connection == null");
       this.id = p0;
       this.connection = p1;
       this.bytesLeftInWriteWindow = (long)p1.peerSettings.getInitialWindowSize();
       Http2Stream$FramingSource uFramingSour = new Http2Stream$FramingSource(this, (long)p1.okHttpSettings.getInitialWindowSize());
       this.source = uFramingSour;
       Http2Stream$FramingSink uFramingSink = new Http2Stream$FramingSink(this);
       this.sink = uFramingSink;
       uFramingSour.finished = p3;
       uFramingSink.finished = p2;
       if (p4 != null) {
          uArrayDeque.add(p4);
       }
       if (!this.isLocallyInitiated() || p4 == null) {
          if (this.isLocallyInitiated() || p4 != null) {
             return;
          }else {
             throw new IllegalStateException("remotely-initiated streams should have headers");
          }
       }else {
          throw new IllegalStateException("locally-initiated streams shouldn\'t have headers yet");
       }
    }
    public void addBytesToWriteWindow(long p0){
       this.bytesLeftInWriteWindow = this.bytesLeftInWriteWindow + p0;
       if (p0 > 0) {
          this.notifyAll();
       }
       return;
    }
    public void cancelStreamIfNecessary(){
       ErrorCode uErrorCode;
       _monitor_enter(this);
       Http2Stream tsource = this.source;
       if (tsource.finished == null && tsource.closed != null) {
          tsource = this.sink;
          if (tsource.finished != null || tsource.closed != null) {
             uErrorCode = 1;
          label_0018 :
             boolean b = this.isOpen();
             _monitor_exit(this);
             if (uErrorCode) {
                this.close(ErrorCode.CANCEL);
             }else if(!b){
                this.connection.removeStream(this.id);
             }
             return;
          }
       }
       uErrorCode = null;
       goto label_0018 ;
    }
    public void checkOutNotClosed(){
       Http2Stream tsink = this.sink;
       if (tsink.closed != null) {
          throw new IOException("stream closed");
       }
       if (tsink.finished != null) {
          throw new IOException("stream finished");
       }
       if (this.errorCode == null) {
          return;
       }
       throw new StreamResetException(this.errorCode);
    }
    public void close(ErrorCode p0){
       if (!this.closeInternal(p0)) {
          return;
       }
       this.connection.writeSynReset(this.id, p0);
       return;
    }
    public final boolean closeInternal(ErrorCode p0){
       _monitor_enter(this);
       if (this.errorCode != null) {
          _monitor_exit(this);
          return false;
       }else if(this.source.finished != null && this.sink.finished != null){
          _monitor_exit(this);
          return false;
       }else {
          this.errorCode = p0;
          this.notifyAll();
          _monitor_exit(this);
          this.connection.removeStream(this.id);
          return true;
       }
    }
    public void closeLater(ErrorCode p0){
       if (!this.closeInternal(p0)) {
          return;
       }
       this.connection.writeSynResetLater(this.id, p0);
       return;
    }
    public Http2Connection getConnection(){
       return this.connection;
    }
    public synchronized ErrorCode getErrorCode(){
       return this.errorCode;
    }
    public int getId(){
       return this.id;
    }
    public m getSink(){
       _monitor_enter(this);
       if (this.hasResponseHeaders == null && !this.isLocallyInitiated()) {
          throw new IllegalStateException("reply before requesting the sink");
       }
       _monitor_exit(this);
       return this.sink;
    }
    public n getSource(){
       return this.source;
    }
    public boolean isLocallyInitiated(){
       int i = 1;
       int i1 = ((this.id & i) == i)? 1: 0;
       if (this.connection.client != i1) {
          i = false;
       }
       return i;
    }
    public synchronized boolean isOpen(){
       if (this.errorCode != null) {
          return false;
       }
       Http2Stream tsource = this.source;
       if (tsource.finished != null || tsource.closed != null) {
          tsource = this.sink;
          if (tsource.finished != null || (tsource.closed != null && this.hasResponseHeaders != null)) {
             return false;
          }
       }
       return true;
    }
    public o readTimeout(){
       return this.readTimeout;
    }
    public void receiveData(d p0,int p1){
       this.source.receive(p0, (long)p1);
    }
    public void receiveFin(){
       _monitor_enter(this);
       this.source.finished = true;
       this.notifyAll();
       _monitor_exit(this);
       if (!this.isOpen()) {
          this.connection.removeStream(this.id);
       }
       return;
    }
    public void receiveHeaders(List p0){
       _monitor_enter(this);
       this.hasResponseHeaders = true;
       this.headersQueue.add(Util.toHeaders(p0));
       this.notifyAll();
       _monitor_exit(this);
       if (!this.isOpen()) {
          this.connection.removeStream(this.id);
       }
       return;
    }
    public synchronized void receiveRstStream(ErrorCode p0){
       if (this.errorCode == null) {
          this.errorCode = p0;
          this.notifyAll();
       }
       return;
    }
    public synchronized void setHeadersListener(Header$Listener p0){
       this.headersListener = p0;
       if (!this.headersQueue.isEmpty() && p0 != null) {
          this.notifyAll();
       }
       return;
    }
    public synchronized Headers takeHeaders(){
       this.readTimeout.enter();
       while (this.headersQueue.isEmpty() && this.errorCode == null) {
          this.waitForIo();
       }
       this.readTimeout.exitAndThrowIfTimedOut();
       if (!this.headersQueue.isEmpty()) {
          return this.headersQueue.removeFirst();
       }
       throw new StreamResetException(this.errorCode);
    }
    public void waitForIo(){
       try{
          this.wait();
          return;
       }catch(java.lang.InterruptedException e0){
          Thread.currentThread().interrupt();
          throw new InterruptedIOException();
       }
    }
    public void writeHeaders(List p0,boolean p1){
       Http2Stream http2Stream;
       boolean b1;
       Objects.requireNonNull(p0, "headers == null");
       _monitor_enter(this);
       boolean b = true;
       this.hasResponseHeaders = b;
       if (!p1) {
          p1.finished = b;
          http2Stream = 1;
          b1 = true;
       }else {
          http2Stream = null;
          b1 = false;
       }
       _monitor_exit(this);
       if (!http2Stream) {
          Http2Stream tconnection = this.connection;
          _monitor_enter(tconnection);
          if (this.connection.bytesLeftInWriteWindow) {
             b = null;
          }
          _monitor_exit(tconnection);
          http2Stream = b;
       }
       this.connection.writeSynReply(this.id, b1, p0);
       if (http2Stream) {
          this.connection.flush();
       }
       return;
    }
    public o writeTimeout(){
       return this.writeTimeout;
    }
}
