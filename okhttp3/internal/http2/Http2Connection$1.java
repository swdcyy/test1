package okhttp3.internal.http2.Http2Connection$1;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.Http2Connection;
import java.lang.String;
import java.lang.Object;
import okhttp3.internal.http2.ErrorCode;

public class Http2Connection$1 extends NamedRunnable	// class@001fa0
{
    public final Http2Connection this$0;
    public final ErrorCode val$errorCode;
    public final int val$streamId;

    public void Http2Connection$1(Http2Connection p0,String p1,Object[] p2,int p3,ErrorCode p4){
       this.this$0 = p0;
       this.val$streamId = p3;
       this.val$errorCode = p4;
       super(p1, p2);
    }
    public void execute(){
       try{
          this.this$0.writeSynReset(this.val$streamId, this.val$errorCode);
       }catch(java.io.IOException e0){
          this.this$0.failConnection();
       }
       return;
    }
}
