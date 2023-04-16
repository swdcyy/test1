package okhttp3.internal.http2.Http2Connection$4;
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

public class Http2Connection$4 extends NamedRunnable	// class@001fa3
{
    public final Http2Connection this$0;
    public final List val$requestHeaders;
    public final int val$streamId;

    public void Http2Connection$4(Http2Connection p0,String p1,Object[] p2,int p3,List p4){
       this.this$0 = p0;
       this.val$streamId = p3;
       this.val$requestHeaders = p4;
       super(p1, p2);
    }
    public void execute(){
       try{
          if (this.this$0.pushObserver.onRequest(this.val$streamId, this.val$requestHeaders)) {
             this.this$0.writer.rstStream(this.val$streamId, ErrorCode.CANCEL);
             Http2Connection$4 tthis$0 = this.this$0;
             _monitor_enter(tthis$0);
             this.this$0.currentPushRequests.remove(Integer.valueOf(this.val$streamId));
             _monitor_exit(tthis$0);
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
}
