package okhttp3.internal.http2.Http2Connection;
import java.io.Closeable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.SynchronousQueue;
import java.lang.String;
import java.util.concurrent.ThreadFactory;
import okhttp3.internal.Util;
import java.util.concurrent.BlockingQueue;
import okhttp3.internal.http2.Http2Connection$Builder;
import java.lang.Object;
import java.util.LinkedHashMap;
import okhttp3.internal.http2.Settings;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import okhttp3.internal.http2.Http2Connection$IntervalPingRunnable;
import java.lang.Runnable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import okhttp3.internal.http2.Http2Writer;
import okio.c;
import okhttp3.internal.http2.Http2Connection$ReaderRunnable;
import okhttp3.internal.http2.Http2Reader;
import okio.d;
import okhttp3.internal.http2.ErrorCode;
import java.util.Map;
import java.util.Collection;
import okhttp3.internal.http2.Http2Stream;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import okhttp3.Protocol;
import java.lang.Integer;
import java.util.List;
import okhttp3.Headers;
import java.lang.IllegalArgumentException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okio.b;
import okio.n;
import okhttp3.internal.http2.Http2Connection$6;
import okhttp3.internal.NamedRunnable;
import java.io.IOException;
import java.lang.StringBuilder;
import okhttp3.internal.http2.Http2Connection$5;
import java.util.Set;
import okhttp3.internal.http2.Http2Connection$4;
import okhttp3.internal.http2.Http2Connection$7;
import java.lang.IllegalStateException;
import java.lang.System;
import okhttp3.internal.http2.Http2Connection$3;
import java.lang.Thread;
import java.lang.Math;
import java.io.InterruptedIOException;
import okhttp3.internal.http2.Http2Connection$1;
import okhttp3.internal.http2.Http2Connection$2;

public final class Http2Connection implements Closeable	// class@001faf
{
    public long awaitPingsSent;
    public long awaitPongsReceived;
    public long bytesLeftInWriteWindow;
    public final boolean client;
    public final Set currentPushRequests;
    public long degradedPingsSent;
    public long degradedPongDeadlineNs;
    public long degradedPongsReceived;
    public final String hostname;
    public long intervalPingsSent;
    public long intervalPongsReceived;
    public int lastGoodStreamId;
    public final Http2Connection$Listener listener;
    public int nextStreamId;
    public Settings okHttpSettings;
    public final Settings peerSettings;
    public final ExecutorService pushExecutor;
    public final PushObserver pushObserver;
    public final Http2Connection$ReaderRunnable readerRunnable;
    public boolean shutdown;
    public final Socket socket;
    public final Map streams;
    public long unacknowledgedBytesRead;
    public final Http2Writer writer;
    public final ScheduledExecutorService writerExecutor;
    public static final boolean $assertionsDisabled;
    public static final ExecutorService listenerExecutor;

    static {
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Http2Connection", true));
       Http2Connection.listenerExecutor = v0;
    }
    public void Http2Connection(Http2Connection$Builder p0){
       Http2Connection http2Connect = this;
       Http2Connection$Builder uBuilder = p0;
       super();
       http2Connect.streams = new LinkedHashMap();
       http2Connect.intervalPingsSent = 0;
       http2Connect.intervalPongsReceived = 0;
       http2Connect.degradedPingsSent = 0;
       http2Connect.degradedPongsReceived = 0;
       http2Connect.awaitPingsSent = 0;
       http2Connect.awaitPongsReceived = 0;
       http2Connect.degradedPongDeadlineNs = 0;
       http2Connect.unacknowledgedBytesRead = 0;
       http2Connect.okHttpSettings = new Settings();
       Settings settings = new Settings();
       http2Connect.peerSettings = settings;
       http2Connect.currentPushRequests = new LinkedHashSet();
       http2Connect.pushObserver = uBuilder.pushObserver;
       Http2Connection$Builder client = uBuilder.client;
       http2Connect.client = client;
       http2Connect.listener = uBuilder.listener;
       int i = 2;
       int i1 = 1;
       int i2 = (client != null)? 1: 2;
       http2Connect.nextStreamId = i2;
       if (client != null) {
          http2Connect.nextStreamId = i2 + i;
       }
       i = 7;
       if (client != null) {
          http2Connect.okHttpSettings.set(i, 0x1000000);
       }
       Http2Connection$Builder hostname = uBuilder.hostname;
       http2Connect.hostname = hostname;
       Object[] objArray = new Object[i1];
       objArray[0] = hostname;
       ScheduledThreadPoolExecutor scheduledThr = new ScheduledThreadPoolExecutor(i1, Util.threadFactory(Util.format("OkHttp %s Writer", objArray), 0));
       http2Connect.writerExecutor = scheduledThr;
       if (uBuilder.pingIntervalMillis != null) {
          Http2Connection$Builder pingInterval = uBuilder.pingIntervalMillis;
          long l = (long)pingInterval;
          scheduledThr.scheduleAtFixedRate(new Http2Connection$IntervalPingRunnable(http2Connect), (long)pingInterval, l, TimeUnit.MILLISECONDS);
       }
       objArray = new Object[i1];
       objArray[0] = hostname;
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory(Util.format("OkHttp %s Push Observer", objArray), i1));
       http2Connect.pushExecutor = scheduledThr;
       settings.set(i, 0xffff);
       settings.set(5, 0x4000);
       http2Connect.bytesLeftInWriteWindow = (long)settings.getInitialWindowSize();
       http2Connect.socket = uBuilder.socket;
       http2Connect.writer = new Http2Writer(uBuilder.sink, client);
       http2Connect.readerRunnable = new Http2Connection$ReaderRunnable(http2Connect, new Http2Reader(uBuilder.source, client));
       return;
    }
    public synchronized void awaitPong(){
       while (this.awaitPongsReceived - this.awaitPingsSent < 0) {
          this.wait();
       }
       return;
    }
    public void close(){
       this.close(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }
    public void close(ErrorCode p0,ErrorCode p1){
       void ovoid;
       Http2Connection http2Connect = null;
       try{
          this.shutdown(p0);
          ovoid = http2Connect;
       }catch(java.io.IOException e5){
       }
       _monitor_enter(this);
       if (!this.streams.isEmpty()) {
          Http2Stream[] http2StreamA = new Http2Stream[this.streams.size()];
          http2Connect = this.streams.values().toArray(http2StreamA);
          this.streams.clear();
       }
       _monitor_exit(this);
       if (http2Connect != null) {
          int len = http2Connect.length;
          int i = 0;
          while (i < len) {
             object oobject = http2Connect[i];
             try{
                oobject.close(p1);
             }catch(java.io.IOException e3){
                if (e5) {
                   ovoid = e3;
                }
             }
             i = i + 1;
          }
       }
       try{
          this.writer.close();
       }catch(java.io.IOException e6){
          if (!e5) {
             ovoid = e6;
          }
       }
       try{
          this.socket.close();
       }catch(java.io.IOException e5){
       }
       this.writerExecutor.shutdown();
       this.pushExecutor.shutdown();
       if (!e5) {
          return;
       }else {
          throw e5;
       }
    }
    public void failConnection(){
       try{
          this.close(ErrorCode.PROTOCOL_ERROR, ErrorCode.PROTOCOL_ERROR);
          return;
       }catch(java.io.IOException e0){
       }
    }
    public void flush(){
       this.writer.flush();
    }
    public Protocol getProtocol(){
       return Protocol.HTTP_2;
    }
    public synchronized Http2Stream getStream(int p0){
       return this.streams.get(Integer.valueOf(p0));
    }
    public synchronized boolean isHealthy(long p0){
       if (this.shutdown != null) {
          return false;
       }
       if (this.degradedPongsReceived - this.degradedPingsSent < 0 && p0 - this.degradedPongDeadlineNs >= 0) {
          return false;
       }
       return true;
    }
    public synchronized int maxConcurrentStreams(){
       return this.peerSettings.getMaxConcurrentStreams(Integer.MAX_VALUE);
    }
    public final Http2Stream newStream(int p0,List p1,boolean p2){
       int i = p2 ^ 0x01;
       Http2Connection twriter = this.writer;
       _monitor_enter(twriter);
       _monitor_enter(this);
       if (this.nextStreamId > 0x3fffffff) {
          this.shutdown(ErrorCode.REFUSED_STREAM);
       }
       if (this.shutdown == null) {
          Http2Connection tnextStreamI = this.nextStreamId;
          this.nextStreamId = tnextStreamI + 2;
          Http2Stream http2Stream = new Http2Stream(tnextStreamI, this, i, false, null);
          int i1 = (p2 && (!this.bytesLeftInWriteWindow || !v9.bytesLeftInWriteWindow))? 1: 0;
          if (v9.isOpen()) {
             this.streams.put(Integer.valueOf(tnextStreamI), v9);
          }
          _monitor_exit(this);
          if (!p0) {
             this.writer.synStream(i, tnextStreamI, p0, p1);
          }else if(this.client == null){
             this.writer.pushPromise(p0, tnextStreamI, p1);
          }else {
             throw new IllegalArgumentException("client streams shouldn\'t have associated stream IDs");
          }
          _monitor_exit(twriter);
          if (i1) {
             this.writer.flush();
          }
          return v9;
       }else {
          throw new ConnectionShutdownException();
       }
    }
    public Http2Stream newStream(List p0,boolean p1){
       return this.newStream(0, p0, p1);
    }
    public synchronized int openStreamCount(){
       return this.streams.size();
    }
    public void pushDataLater(int p0,d p1,int p2,boolean p3){
       b uob = new b();
       long l = (long)p2;
       p1.require(l);
       p1.read(uob, l);
       if (uob.p() - l) {
          throw new IOException(uob.p()+" != "+p2);
       }
       Object[] objArray = new Object[]{this.hostname,Integer.valueOf(p0)};
       Http2Connection$6 u6 = new Http2Connection$6(this, "OkHttp %s Push Data[%s]", objArray, p0, uob, p2, p3);
       this.pushExecutorExecute(uob.p() - l);
       return;
    }
    public synchronized final void pushExecutorExecute(NamedRunnable p0){
       if (this.shutdown == null) {
          this.pushExecutor.execute(p0);
       }
       return;
    }
    public void pushHeadersLater(int p0,List p1,boolean p2){
       try{
          Object[] objArray = new Object[]{this.hostname,Integer.valueOf(p0)};
          Http2Connection$5 u5 = new Http2Connection$5(this, "OkHttp %s Push Headers[%s]", objArray, p0, p1, p2);
          this.pushExecutorExecute(v7);
          return;
       }catch(java.util.concurrent.RejectedExecutionException e0){
       }
    }
    public void pushRequestLater(int p0,List p1){
       _monitor_enter(this);
       if (this.currentPushRequests.contains(Integer.valueOf(p0))) {
          this.writeSynResetLater(p0, ErrorCode.PROTOCOL_ERROR);
          _monitor_exit(this);
          return;
       }else {
          this.currentPushRequests.add(Integer.valueOf(p0));
          try{
             _monitor_exit(this);
             Object[] objArray = new Object[]{this.hostname,Integer.valueOf(p0)};
             Http2Connection$4 u4 = new Http2Connection$4(this, "OkHttp %s Push Request[%s]", objArray, p0, p1);
             this.pushExecutorExecute(v0);
             return;
          }catch(java.util.concurrent.RejectedExecutionException e0){
          }
       }
    }
    public void pushResetLater(int p0,ErrorCode p1){
       Object[] objArray = new Object[]{this.hostname,Integer.valueOf(p0)};
       Http2Connection$7 u7 = new Http2Connection$7(this, "OkHttp %s Push Reset[%s]", objArray, p0, p1);
       this.pushExecutorExecute(v6);
    }
    public Http2Stream pushStream(int p0,List p1,boolean p2){
       if (this.client == null) {
          return this.newStream(p0, p1, p2);
       }
       throw new IllegalStateException("Client cannot push requests.");
    }
    public boolean pushedStream(int p0){
       int i = 1;
       if (!p0 || (p0 & i)) {
          i = false;
       }
       return i;
    }
    public synchronized Http2Stream removeStream(int p0){
       this.notifyAll();
       return this.streams.remove(Integer.valueOf(p0));
    }
    public void sendDegradedPingLater(){
       _monitor_enter(this);
       Http2Connection tdegradedPin = this.degradedPingsSent;
       if (this.degradedPongsReceived - tdegradedPin < 0) {
          _monitor_exit(this);
          return;
       }else {
          this.degradedPingsSent = tdegradedPin + 1;
          this.degradedPongDeadlineNs = System.nanoTime() + 0x3b9aca00;
          try{
             _monitor_exit(this);
             Object[] objArray = new Object[]{this.hostname};
             this.writerExecutor.execute(new Http2Connection$3(this, "OkHttp %s ping", objArray));
             return;
          }catch(java.util.concurrent.RejectedExecutionException e0){
          }
       }
    }
    public void setSettings(Settings p0){
       Http2Connection twriter = this.writer;
       _monitor_enter(twriter);
       _monitor_enter(this);
       if (this.shutdown != null) {
          throw new ConnectionShutdownException();
       }
       this.okHttpSettings.merge(p0);
       _monitor_exit(this);
       this.writer.settings(p0);
       _monitor_exit(twriter);
       return;
    }
    public void shutdown(ErrorCode p0){
       Http2Connection twriter = this.writer;
       _monitor_enter(twriter);
       _monitor_enter(this);
       if (this.shutdown != null) {
          _monitor_exit(this);
          _monitor_exit(twriter);
          return;
       }else {
          this.shutdown = true;
          _monitor_exit(this);
          this.writer.goAway(this.lastGoodStreamId, p0, Util.EMPTY_BYTE_ARRAY);
          _monitor_exit(twriter);
          return;
       }
    }
    public void start(){
       this.start(true);
    }
    public void start(boolean p0){
       if (p0) {
          this.writer.connectionPreface();
          this.writer.settings(this.okHttpSettings);
          int initialWindo = this.okHttpSettings.getInitialWindowSize();
          int i = 0xffff;
          if (initialWindo != i) {
             this.writer.windowUpdate(0, (long)(initialWindo - i));
          }
       }
       new Thread(this.readerRunnable).start();
       return;
    }
    public synchronized void updateConnectionFlowControl(long p0){
       long l = this.unacknowledgedBytesRead + p0;
       this.unacknowledgedBytesRead = l;
       if (l - (long)(this.okHttpSettings.getInitialWindowSize() / 2) >= 0) {
          this.writeWindowUpdateLater(0, this.unacknowledgedBytesRead);
          this.unacknowledgedBytesRead = 0;
       }
       return;
    }
    public void writeData(int p0,boolean p1,b p2,long p3){
       if (!p3) {
          this.writer.data(p1, p0, p2, 0);
          return;
       }else {
          while (true) {
             if (p3 <= 0) {
                return;
             }
             _monitor_enter(this);
             try{
                while (true) {
                   Http2Connection tbytesLeftIn = this.bytesLeftInWriteWindow;
                   if (tbytesLeftIn <= 0) {
                      if (this.streams.containsKey(Integer.valueOf(p0))) {
                         this.wait();
                      }else {
                         break ;
                      }
                   }else {
                      int i = Math.min((int)Math.min(p3, tbytesLeftIn), this.writer.maxDataLength());
                      long l = (long)i;
                      long l1 = this.bytesLeftInWriteWindow - l;
                      this.bytesLeftInWriteWindow = l1;
                      _monitor_exit(this);
                      p3 = p3 - l;
                      Http2Connection twriter = this.writer;
                      boolean b = (p1 && !p3)? true: false;
                      twriter.data(b, p0, p2, i);
                   }
                }
                throw new IOException("stream closed");
             }catch(java.lang.InterruptedException e0){
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
             }
          }
       }
    }
    public void writePing(){
       _monitor_enter(this);
       this.awaitPingsSent = this.awaitPingsSent + 1;
       _monitor_exit(this);
       this.writePing(false, 3, 0x4f4b6f6b);
    }
    public void writePing(boolean p0,int p1,int p2){
       try{
          this.writer.ping(p0, p1, p2);
       }catch(java.io.IOException e0){
          this.failConnection();
       }
       return;
    }
    public void writePingAndAwaitPong(){
       this.writePing();
       this.awaitPong();
    }
    public void writeSynReply(int p0,boolean p1,List p2){
       this.writer.synReply(p1, p0, p2);
    }
    public void writeSynReset(int p0,ErrorCode p1){
       this.writer.rstStream(p0, p1);
    }
    public void writeSynResetLater(int p0,ErrorCode p1){
       try{
          Object[] objArray = new Object[]{this.hostname,Integer.valueOf(p0)};
          Http2Connection$1 u1 = new Http2Connection$1(this, "OkHttp %s stream %d", objArray, p0, p1);
          this.writerExecutor.execute(v7);
          return;
       }catch(java.util.concurrent.RejectedExecutionException e0){
       }
    }
    public void writeWindowUpdateLater(int p0,long p1){
       try{
          Object[] objArray = new Object[]{this.hostname,Integer.valueOf(p0)};
          Http2Connection$2 u2 = new Http2Connection$2(this, "OkHttp Window Update %s stream %d", objArray, p0, p1);
          this.writerExecutor.execute(v8);
          return;
       }catch(java.util.concurrent.RejectedExecutionException e0){
       }
    }
}
