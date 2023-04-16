package okhttp3.internal.http2.Http2Connection$3;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.Http2Connection;
import java.lang.String;
import java.lang.Object;

public class Http2Connection$3 extends NamedRunnable	// class@001fa2
{
    public final Http2Connection this$0;

    public void Http2Connection$3(Http2Connection p0,String p1,Object[] p2){
       this.this$0 = p0;
       super(p1, p2);
    }
    public void execute(){
       this.this$0.writePing(false, 2, false);
    }
}
