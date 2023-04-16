package okhttp3.internal.http2.Http2Connection$5;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.Http2Connection;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import okhttp3.internal.http2.PushObserver;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Writer;
import java.lang.Integer;
import java.util.Set;

public class Http2Connection$5 extends NamedRunnable	// class@001fa4
{
    public final Http2Connection this$0;
    public final boolean val$inFinished;
    public final List val$requestHeaders;
    public final int val$streamId;

    public void Http2Connection$5(Http2Connection p0,String p1,Object[] p2,int p3,List p4,boolean p5){
       this.this$0 = p0;
       this.val$streamId = p3;
       this.val$requestHeaders = p4;
       this.val$inFinished = p5;
       super(p1, p2);
    }
    public void execute(){
       try{
          boolean b = this.this$0.pushObserver.onHeaders(this.val$streamId, this.val$requestHeaders, this.val$inFinished);
          if (b) {
             this.this$0.writer.rstStream(this.val$streamId, ErrorCode.CANCEL);
          }
          if (b || this.val$inFinished != null) {
             Http2Connection$5 tthis$0 = this.this$0;
             _monitor_enter(tthis$0);
             this.this$0.currentPushRequests.remove(Integer.valueOf(this.val$streamId));
             _monitor_exit(tthis$0);
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
}
