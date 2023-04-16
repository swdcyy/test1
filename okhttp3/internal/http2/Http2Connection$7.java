package okhttp3.internal.http2.Http2Connection$7;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.Http2Connection;
import java.lang.String;
import java.lang.Object;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.PushObserver;
import java.lang.Integer;
import java.util.Set;

public class Http2Connection$7 extends NamedRunnable	// class@001fa6
{
    public final Http2Connection this$0;
    public final ErrorCode val$errorCode;
    public final int val$streamId;

    public void Http2Connection$7(Http2Connection p0,String p1,Object[] p2,int p3,ErrorCode p4){
       this.this$0 = p0;
       this.val$streamId = p3;
       this.val$errorCode = p4;
       super(p1, p2);
    }
    public void execute(){
       this.this$0.pushObserver.onReset(this.val$streamId, this.val$errorCode);
       Http2Connection$7 tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       this.this$0.currentPushRequests.remove(Integer.valueOf(this.val$streamId));
       _monitor_exit(tthis$0);
    }
}
