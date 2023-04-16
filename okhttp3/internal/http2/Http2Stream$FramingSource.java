package okhttp3.internal.http2.Http2Stream$FramingSource;
import okio.n;
import okhttp3.internal.http2.Http2Stream;
import java.lang.Object;
import okio.b;
import java.util.Deque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import okhttp3.Headers;
import okhttp3.internal.http2.Header$Listener;
import okio.a;
import java.lang.Math;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.Http2Stream$StreamTimeout;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.http2.ErrorCode;
import java.io.IOException;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import okio.d;
import java.io.EOFException;
import okio.o;

public final class Http2Stream$FramingSource implements n	// class@001fb4
{
    public boolean closed;
    public boolean finished;
    public final long maxByteCount;
    public final b readBuffer;
    public final b receiveBuffer;
    public final Http2Stream this$0;
    public static final boolean $assertionsDisabled;

    public void Http2Stream$FramingSource(Http2Stream p0,long p1){
       this.this$0 = p0;
       super();
       this.receiveBuffer = new b();
       this.readBuffer = new b();
       this.maxByteCount = p1;
    }
    public void close(){
       ArrayList uArrayList1;
       Http2Stream$FramingSource tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       this.closed = true;
       long l = this.readBuffer.p();
       this.readBuffer.a();
       ArrayList uArrayList = null;
       if (!this.this$0.headersQueue.isEmpty() && this.this$0.headersListener != null) {
          this.this$0.headersQueue.clear();
          uArrayList = this.this$0.headersListener;
          uArrayList1 = new ArrayList(this.this$0.headersQueue);
       }else {
          uArrayList1 = uArrayList;
       }
       this.this$0.notifyAll();
       _monitor_exit(tthis$0);
       if (l > 0) {
          this.updateConnectionFlowControl(l);
       }
       this.this$0.cancelStreamIfNecessary();
       if (uArrayList != null) {
          Iterator iterator = uArrayList1.iterator();
          while (iterator.hasNext()) {
             uArrayList.onHeaders(iterator.next());
          }
       }
       return;
    }
    public long read(b p0,long p1){
       Object obj;
       Http2Stream http2Stream;
       Http2Stream http2Stream1;
       Http2Stream$FramingSource uFramingSour = this;
       long l = p1;
       long l1 = 0;
       if (l - l1 < 0) {
       label_00d6 :
          throw new IllegalArgumentException("byteCount < 0: "+l);
       }
       while (true) {
          Http2Stream$FramingSource this$0 = uFramingSour.this$0;
          _monitor_enter(this$0);
          uFramingSour.this$0.readTimeout.enter();
          Http2Stream$FramingSource this$01 = uFramingSour.this$0;
          Http2Stream errorCode = this$01.errorCode;
          if (errorCode != null) {
          label_001c :
             if (uFramingSour.closed != null) {
                throw new IOException("stream closed");
             }
             if (!this$01.headersQueue.isEmpty()) {
                this$01 = uFramingSour.this$0;
                if (this$01.headersListener != null) {
                   obj = this$01.headersQueue.removeFirst();
                   http2Stream = uFramingSour.this$0.headersListener;
                label_009c :
                   http2Stream1 = -1;
                label_009e :
                   uFramingSour.this$0.readTimeout.exitAndThrowIfTimedOut();
                   _monitor_exit(this$0);
                   if (obj != null && http2Stream != null) {
                      http2Stream.onHeaders(obj);
                   }else if(http2Stream1 - -1){
                      break ;
                   }else if(errorCode == null){
                      return -1;
                   }else {
                      throw new StreamResetException(errorCode);
                   }
                }
             }
             if (uFramingSour.readBuffer.p() - l1 > 0) {
                this$01 = uFramingSour.readBuffer;
                http2Stream1 = this$01.read(p0, Math.min(l, this$01.p()));
                this$01 = uFramingSour.this$0;
                long l2 = this$01.unacknowledgedBytesRead + http2Stream1;
                this$01.unacknowledgedBytesRead = l2;
                if (errorCode == null) {
                   int i = this$01.connection.okHttpSettings.getInitialWindowSize() / 2;
                   if (l2 - (long)i >= 0) {
                      this$01 = uFramingSour.this$0;
                      this$01.connection.writeWindowUpdateLater(this$01.id, this$01.unacknowledgedBytesRead);
                      uFramingSour.this$0.unacknowledgedBytesRead = l1;
                   }
                }
                obj = null;
                http2Stream = null;
                goto label_009e ;
             }else if(uFramingSour.finished == null && errorCode == null){
                uFramingSour.this$0.waitForIo();
                uFramingSour.this$0.readTimeout.exitAndThrowIfTimedOut();
                _monitor_exit(this$0);
             }else {
                obj = null;
                http2Stream = null;
                goto label_009c ;
             }
          }else {
             errorCode = null;
             goto label_001c ;
          }
       }
       uFramingSour.updateConnectionFlowControl(http2Stream1);
       return http2Stream1;
    }
    public void receive(d p0,long p1){
       long l2;
       while (true) {
          if (p1 <= 0) {
             return;
          }
          Http2Stream$FramingSource tthis$0 = this.this$0;
          _monitor_enter(tthis$0);
          Http2Stream$FramingSource tfinished = this.finished;
          long l = this.readBuffer.p() + p1;
          int i = 1;
          l = (l - this.maxByteCount > 0)? 1: 0;
          _monitor_exit(tthis$0);
          if (l) {
             break ;
          }else if(tfinished != null){
             p0.skip(p1);
             return;
          }else {
             long l1 = p0.read(this.receiveBuffer, p1);
             if (l1 - -1) {
                p1 = p1 - l1;
                tthis$0 = this.this$0;
                _monitor_enter(tthis$0);
                if (this.closed != null) {
                   l2 = this.receiveBuffer.p();
                   this.receiveBuffer.a();
                }else if(!this.readBuffer.p()){
                   i = 0;
                }
                this.readBuffer.x1(this.receiveBuffer);
                if (i) {
                   this.this$0.notifyAll();
                }
                l2 = 0;
                _monitor_exit(tthis$0);
                if (l2 > 0) {
                   this.updateConnectionFlowControl(l2);
                }
             }else {
                throw new EOFException();
             }
          }
       }
       p0.skip(p1);
       this.this$0.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
       return;
    }
    public o timeout(){
       return this.this$0.readTimeout;
    }
    public final void updateConnectionFlowControl(long p0){
       this.this$0.connection.updateConnectionFlowControl(p0);
    }
}
