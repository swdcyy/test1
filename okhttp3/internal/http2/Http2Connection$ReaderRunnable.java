package okhttp3.internal.http2.Http2Connection$ReaderRunnable;
import okhttp3.internal.http2.Http2Reader$Handler;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import java.lang.Object;
import java.lang.String;
import okio.ByteString;
import okhttp3.internal.http2.Settings;
import java.util.Map;
import java.util.Collection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Writer;
import okhttp3.internal.http2.Http2Connection$ReaderRunnable$3;
import java.lang.Runnable;
import java.util.concurrent.ExecutorService;
import okio.d;
import okhttp3.internal.http2.ErrorCode;
import java.io.Closeable;
import okhttp3.internal.Util;
import java.util.List;
import okhttp3.Headers;
import java.lang.Integer;
import okhttp3.internal.http2.Http2Connection$ReaderRunnable$1;
import okhttp3.internal.http2.Http2Connection$PingRunnable;
import java.util.concurrent.ScheduledExecutorService;
import okhttp3.internal.http2.Http2Connection$ReaderRunnable$2;

public class Http2Connection$ReaderRunnable extends NamedRunnable implements Http2Reader$Handler	// class@001fae
{
    public final Http2Reader reader;
    public final Http2Connection this$0;

    public void Http2Connection$ReaderRunnable(Http2Connection p0,Http2Reader p1){
       this.this$0 = p0;
       Object[] objArray = new Object[]{p0.hostname};
       super("OkHttp %s", objArray);
       this.reader = p1;
    }
    public void ackSettings(){
    }
    public void alternateService(int p0,String p1,ByteString p2,String p3,int p4,long p5){
    }
    public void applyAndAckSettings(boolean p0,Settings p1){
       long l;
       Http2Stream[] http2StreamA;
       Http2Connection writer = this.this$0.writer;
       _monitor_enter(writer);
       Http2Connection$ReaderRunnable tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       int initialWindo = this.this$0.peerSettings.getInitialWindowSize();
       if (p0) {
          this.this$0.peerSettings.clear();
       }
       this.this$0.peerSettings.merge(p1);
       int initialWindo1 = this.this$0.peerSettings.getInitialWindowSize();
       Http2Connection$ReaderRunnable readerRunnab = null;
       if (initialWindo1 != -1 && initialWindo1 != initialWindo) {
          l = (long)(initialWindo1 - initialWindo);
          if (!this.this$0.streams.isEmpty()) {
             http2StreamA = new Http2Stream[this.this$0.streams.size()];
             http2StreamA = this.this$0.streams.values().toArray(http2StreamA);
          }
       }else {
          l = 0;
       }
       _monitor_exit(tthis$0);
       try{
          tthis$0 = this.this$0;
          tthis$0.writer.applyAndAckSettings(tthis$0.peerSettings);
       }catch(java.io.IOException e0){
          this.this$0.failConnection();
       }
       _monitor_exit(e0);
       if (http2StreamA != null) {
          int len = http2StreamA.length;
          for (initialWindo = 0; initialWindo < len; initialWindo = initialWindo + 1) {
             object oobject = http2StreamA[initialWindo];
             _monitor_enter(oobject);
             oobject.addBytesToWriteWindow(l);
             _monitor_exit(oobject);
          }
       }
       Object[] objArray = new Object[]{this.this$0.hostname};
       Http2Connection.listenerExecutor.execute(new Http2Connection$ReaderRunnable$3(this, "OkHttp %s settings", objArray));
       return;
    }
    public void data(boolean p0,int p1,d p2,int p3){
       if (this.this$0.pushedStream(p1)) {
          this.this$0.pushDataLater(p1, p2, p3, p0);
          return;
       }else {
          Http2Stream stream = this.this$0.getStream(p1);
          if (stream == null) {
             this.this$0.writeSynResetLater(p1, ErrorCode.PROTOCOL_ERROR);
             long l = (long)p3;
             this.this$0.updateConnectionFlowControl(l);
             p2.skip(l);
             return;
          }else {
             stream.receiveData(p2, p3);
             if (p0) {
                stream.receiveFin();
             }
             return;
          }
       }
    }
    public void execute(){
       ErrorCode uErrorCode;
       ErrorCode iNTERNAL_ERR = ErrorCode.INTERNAL_ERROR;
       try{
          this.reader.readConnectionPreface(this);
          do {
          } while (this.reader.nextFrame(false, this));
          uErrorCode = ErrorCode.NO_ERROR;
          try{
             iNTERNAL_ERR = ErrorCode.CANCEL;
             this.this$0.close(uErrorCode, iNTERNAL_ERR);
          }catch(java.io.IOException e0){
             this.this$0.close(ErrorCode.PROTOCOL_ERROR, ErrorCode.PROTOCOL_ERROR);
          }
       }catch(java.io.IOException e0){
          uErrorCode = e0;
          goto label_001f ;
       }catch(java.io.IOException e0){
       }
    }
    public void goAway(int p0,ErrorCode p1,ByteString p2){
       p2.size();
       Http2Connection$ReaderRunnable tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       Http2Stream[] http2StreamA = new Http2Stream[this.this$0.streams.size()];
       Http2Stream[] http2StreamA1 = this.this$0.streams.values().toArray(http2StreamA);
       this.this$0.shutdown = true;
       _monitor_exit(tthis$0);
       int len = http2StreamA1.length;
       int i = 0;
       while (i < len) {
          object oobject = http2StreamA1[i];
          if (oobject.getId() > p0 && oobject.isLocallyInitiated()) {
             oobject.receiveRstStream(ErrorCode.REFUSED_STREAM);
             this.this$0.removeStream(oobject.getId());
          }
          i = i + 1;
       }
       return;
    }
    public void headers(boolean p0,int p1,int p2,List p3){
       if (this.this$0.pushedStream(p1)) {
          this.this$0.pushHeadersLater(p1, p3, p0);
          return;
       }else {
          Http2Connection$ReaderRunnable tthis$0 = this.this$0;
          _monitor_enter(tthis$0);
          Http2Stream stream = this.this$0.getStream(p1);
          if (stream == null) {
             Http2Connection$ReaderRunnable tthis$01 = this.this$0;
             if (tthis$01.shutdown != null) {
                _monitor_exit(tthis$0);
                return;
             }else if(p1 <= tthis$01.lastGoodStreamId){
                _monitor_exit(tthis$0);
                return;
             }else {
                int i = 2;
                if ((p1 % 2) == (tthis$01.nextStreamId % i)) {
                   _monitor_exit(tthis$0);
                   return;
                }else {
                   Http2Stream http2Stream = new Http2Stream(p1, this.this$0, false, p0, Util.toHeaders(p3));
                   Http2Connection$ReaderRunnable tthis$02 = this.this$0;
                   tthis$02.lastGoodStreamId = p1;
                   tthis$02.streams.put(Integer.valueOf(p1), p3);
                   Object[] objArray = new Object[i];
                   objArray[0] = this.this$0.hostname;
                   objArray[1] = Integer.valueOf(p1);
                   Http2Connection.listenerExecutor.execute(new Http2Connection$ReaderRunnable$1(this, "OkHttp %s stream %d", objArray, p3));
                   _monitor_exit(tthis$0);
                   return;
                }
             }
          }else {
             _monitor_exit(tthis$0);
             stream.receiveHeaders(p3);
             if (p0) {
                stream.receiveFin();
             }
             return;
          }
       }
    }
    public void ping(boolean p0,int p1,int p2){
       Http2Connection$ReaderRunnable tthis$0;
       Http2Connection$ReaderRunnable tthis$01;
       try{
          if (p0) {
             tthis$0 = this.this$0;
             _monitor_enter(tthis$0);
             if (p1 == 1) {
                tthis$01 = this.this$0;
                tthis$01.intervalPongsReceived = tthis$01.intervalPongsReceived + 1;
             }else if(p1 == 2){
                tthis$01 = this.this$0;
                tthis$01.degradedPongsReceived = tthis$01.degradedPongsReceived + 1;
             }else if(p1 == 3){
                tthis$01 = this.this$0;
                tthis$01.awaitPongsReceived = tthis$01.awaitPongsReceived + 1;
                tthis$01.notifyAll();
             }
             _monitor_exit(tthis$0);
          }else {
             tthis$0 = this.this$0;
             tthis$0.writerExecutor.execute(new Http2Connection$PingRunnable(tthis$0, 1, p1, p2));
          }
          return;
       }catch(java.util.concurrent.RejectedExecutionException e0){
       }
    }
    public void priority(int p0,int p1,int p2,boolean p3){
    }
    public void pushPromise(int p0,int p1,List p2){
       this.this$0.pushRequestLater(p1, p2);
    }
    public void rstStream(int p0,ErrorCode p1){
       if (this.this$0.pushedStream(p0)) {
          this.this$0.pushResetLater(p0, p1);
          return;
       }else {
          Http2Stream http2Stream = this.this$0.removeStream(p0);
          if (http2Stream != null) {
             http2Stream.receiveRstStream(p1);
          }
          return;
       }
    }
    public void settings(boolean p0,Settings p1){
       try{
          Http2Connection$ReaderRunnable tthis$0 = this.this$0;
          Object[] objArray = new Object[]{tthis$0.hostname};
          Http2Connection$ReaderRunnable$2 readerRunnab = new Http2Connection$ReaderRunnable$2(this, "OkHttp %s ACK Settings", objArray, p0, p1);
          tthis$0.writerExecutor.execute(v8);
          return;
       }catch(java.util.concurrent.RejectedExecutionException e0){
       }
    }
    public void windowUpdate(int p0,long p1){
       if (!p0) {
          Http2Connection$ReaderRunnable tthis$0 = this.this$0;
          _monitor_enter(tthis$0);
          Http2Connection$ReaderRunnable tthis$01 = this.this$0;
          tthis$01.bytesLeftInWriteWindow = tthis$01.bytesLeftInWriteWindow + p1;
          tthis$01.notifyAll();
          _monitor_exit(tthis$0);
       }else {
          Http2Stream stream = this.this$0.getStream(p0);
          if (stream != null) {
             _monitor_enter(stream);
             stream.addBytesToWriteWindow(p1);
             _monitor_exit(stream);
          }
       }
       return;
    }
}
