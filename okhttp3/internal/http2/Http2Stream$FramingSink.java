package okhttp3.internal.http2.Http2Stream$FramingSink;
import okio.m;
import okhttp3.internal.http2.Http2Stream;
import java.lang.Object;
import okio.b;
import okhttp3.internal.http2.Http2Connection;
import okio.a;
import okhttp3.internal.http2.Http2Stream$StreamTimeout;
import java.lang.Math;
import okio.o;

public final class Http2Stream$FramingSink implements m	// class@001fb3
{
    public boolean closed;
    public boolean finished;
    public final b sendBuffer;
    public final Http2Stream this$0;
    public static final boolean $assertionsDisabled;

    public void Http2Stream$FramingSink(Http2Stream p0){
       this.this$0 = p0;
       super();
       this.sendBuffer = new b();
    }
    public void close(){
       Http2Stream$FramingSink tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       if (this.closed != null) {
          _monitor_exit(tthis$0);
          return;
       }else {
          _monitor_exit(tthis$0);
          if (this.this$0.sink.finished == null) {
             int i = 0;
             if (this.sendBuffer.p() - i > 0) {
                while (this.sendBuffer.p() - i > 0) {
                   this.emitFrame(true);
                }
             }else {
                tthis$0 = this.this$0;
                tthis$0.connection.writeData(tthis$0.id, true, null, 0);
             }
          }
          Http2Stream$FramingSink tthis$01 = this.this$0;
          _monitor_enter(tthis$01);
          this.closed = true;
          _monitor_exit(tthis$01);
          this.this$0.connection.flush();
          this.this$0.cancelStreamIfNecessary();
          return;
       }
    }
    public final void emitFrame(boolean p0){
       Http2Stream$FramingSink tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       this.this$0.writeTimeout.enter();
       Http2Stream$FramingSink tthis$01 = this.this$0;
       while (tthis$01.bytesLeftInWriteWindow <= 0 && (this.finished == null && (this.closed == null && tthis$01.errorCode == null))) {
          tthis$01.waitForIo();
       }
       tthis$01.writeTimeout.exitAndThrowIfTimedOut();
       this.this$0.checkOutNotClosed();
       long l = Math.min(this.this$0.bytesLeftInWriteWindow, this.sendBuffer.p());
       tthis$01 = this.this$0;
       tthis$01.bytesLeftInWriteWindow = tthis$01.bytesLeftInWriteWindow - l;
       _monitor_exit(tthis$0);
       tthis$01.writeTimeout.enter();
       tthis$0 = this.this$0;
       Http2Stream connection = tthis$0.connection;
       Http2Stream id = tthis$0.id;
       boolean b = (p0 && !l - this.sendBuffer.p())? true: false;
       connection.writeData(id, b, this.sendBuffer, l);
       this.this$0.writeTimeout.exitAndThrowIfTimedOut();
       return;
    }
    public void flush(){
       Http2Stream$FramingSink tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       this.this$0.checkOutNotClosed();
       _monitor_exit(tthis$0);
       while (this.sendBuffer.p() > 0) {
          this.emitFrame(false);
          this.this$0.connection.flush();
       }
       return;
    }
    public o timeout(){
       return this.this$0.writeTimeout;
    }
    public void write(b p0,long p1){
       this.sendBuffer.write(p0, p1);
       while (this.sendBuffer.p() - 0x4000 >= 0) {
          this.emitFrame(false);
       }
       return;
    }
}
