package okhttp3.internal.http2.Http2Connection$PingRunnable;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.Http2Connection;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public final class Http2Connection$PingRunnable extends NamedRunnable	// class@001faa
{
    public final int payload1;
    public final int payload2;
    public final boolean reply;
    public final Http2Connection this$0;

    public void Http2Connection$PingRunnable(Http2Connection p0,boolean p1,int p2,int p3){
       this.this$0 = p0;
       Object[] objArray = new Object[]{p0.hostname,Integer.valueOf(p2),Integer.valueOf(p3)};
       super("OkHttp %s ping %08x%08x", objArray);
       this.reply = p1;
       this.payload1 = p2;
       this.payload2 = p3;
    }
    public void execute(){
       this.this$0.writePing(this.reply, this.payload1, this.payload2);
    }
}
