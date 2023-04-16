package okhttp3.internal.http2.Http2Connection$2;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.Http2Connection;
import java.lang.String;
import java.lang.Object;
import okhttp3.internal.http2.Http2Writer;

public class Http2Connection$2 extends NamedRunnable	// class@001fa1
{
    public final Http2Connection this$0;
    public final int val$streamId;
    public final long val$unacknowledgedBytesRead;

    public void Http2Connection$2(Http2Connection p0,String p1,Object[] p2,int p3,long p4){
       this.this$0 = p0;
       this.val$streamId = p3;
       this.val$unacknowledgedBytesRead = p4;
       super(p1, p2);
    }
    public void execute(){
       try{
          this.this$0.writer.windowUpdate(this.val$streamId, this.val$unacknowledgedBytesRead);
       }catch(java.io.IOException e0){
          this.this$0.failConnection();
       }
       return;
    }
}
