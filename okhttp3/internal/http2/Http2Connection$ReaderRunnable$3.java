package okhttp3.internal.http2.Http2Connection$ReaderRunnable$3;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.Http2Connection$ReaderRunnable;
import java.lang.String;
import java.lang.Object;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Connection$Listener;

public class Http2Connection$ReaderRunnable$3 extends NamedRunnable	// class@001fad
{
    public final Http2Connection$ReaderRunnable this$1;

    public void Http2Connection$ReaderRunnable$3(Http2Connection$ReaderRunnable p0,String p1,Object[] p2){
       this.this$1 = p0;
       super(p1, p2);
    }
    public void execute(){
       Http2Connection$ReaderRunnable this$0 = this.this$1.this$0;
       this$0.listener.onSettings(this$0);
    }
}
