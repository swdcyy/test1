package okhttp3.internal.ws.WebSocketWriter$FrameSink;
import okio.m;
import okhttp3.internal.ws.WebSocketWriter;
import java.lang.Object;
import okio.b;
import java.io.IOException;
import java.lang.String;
import okio.o;

public final class WebSocketWriter$FrameSink implements m	// class@001fe0
{
    public boolean closed;
    public long contentLength;
    public int formatOpcode;
    public boolean isFirstFrame;
    public final WebSocketWriter this$0;

    public void WebSocketWriter$FrameSink(WebSocketWriter p0){
       this.this$0 = p0;
       super();
    }
    public void close(){
       if (this.closed != null) {
          throw new IOException("closed");
       }
       WebSocketWriter$FrameSink tthis$0 = this.this$0;
       tthis$0.writeMessageFrame(this.formatOpcode, tthis$0.buffer.p(), this.isFirstFrame, true);
       this.closed = true;
       this.this$0.activeWriter = false;
       return;
    }
    public void flush(){
       if (this.closed != null) {
          throw new IOException("closed");
       }
       WebSocketWriter$FrameSink tthis$0 = this.this$0;
       tthis$0.writeMessageFrame(this.formatOpcode, tthis$0.buffer.p(), this.isFirstFrame, false);
       this.isFirstFrame = false;
       return;
    }
    public o timeout(){
       return this.this$0.sink.timeout();
    }
    public void write(b p0,long p1){
       if (this.closed != null) {
          throw new IOException("closed");
       }
       this.this$0.buffer.write(p0, p1);
       int i = (this.isFirstFrame != null && (this.contentLength - -1 && this.this$0.buffer.p() - (this.contentLength - 8192) > 0))? 1: 0;
       long l = this.this$0.buffer.e();
       if (l - null > 0 && !i) {
          this.this$0.writeMessageFrame(this.formatOpcode, l, this.isFirstFrame, false);
          this.isFirstFrame = false;
       }
       return;
    }
}
