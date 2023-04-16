package okhttp3.internal.http2.Http2Connection$6;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.Http2Connection;
import java.lang.String;
import java.lang.Object;
import okio.b;
import okio.d;
import okhttp3.internal.http2.PushObserver;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Writer;
import java.lang.Integer;
import java.util.Set;

public class Http2Connection$6 extends NamedRunnable	// class@001fa5
{
    public final Http2Connection this$0;
    public final b val$buffer;
    public final int val$byteCount;
    public final boolean val$inFinished;
    public final int val$streamId;

    public void Http2Connection$6(Http2Connection p0,String p1,Object[] p2,int p3,b p4,int p5,boolean p6){
       this.this$0 = p0;
       this.val$streamId = p3;
       this.val$buffer = p4;
       this.val$byteCount = p5;
       this.val$inFinished = p6;
       super(p1, p2);
    }
    public void execute(){
       try{
          boolean b = this.this$0.pushObserver.onData(this.val$streamId, this.val$buffer, this.val$byteCount, this.val$inFinished);
          if (b) {
             this.this$0.writer.rstStream(this.val$streamId, ErrorCode.CANCEL);
          }
          if (b || this.val$inFinished != null) {
             Http2Connection$6 tthis$0 = this.this$0;
             _monitor_enter(tthis$0);
             this.this$0.currentPushRequests.remove(Integer.valueOf(this.val$streamId));
             _monitor_exit(tthis$0);
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
}
