package okhttp3.internal.http2.Http2Connection$ReaderRunnable$2;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.Http2Connection$ReaderRunnable;
import java.lang.String;
import java.lang.Object;
import okhttp3.internal.http2.Settings;

public class Http2Connection$ReaderRunnable$2 extends NamedRunnable	// class@001fac
{
    public final Http2Connection$ReaderRunnable this$1;
    public final boolean val$clearPrevious;
    public final Settings val$settings;

    public void Http2Connection$ReaderRunnable$2(Http2Connection$ReaderRunnable p0,String p1,Object[] p2,boolean p3,Settings p4){
       this.this$1 = p0;
       this.val$clearPrevious = p3;
       this.val$settings = p4;
       super(p1, p2);
    }
    public void execute(){
       this.this$1.applyAndAckSettings(this.val$clearPrevious, this.val$settings);
    }
}
