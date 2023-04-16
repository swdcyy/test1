package cf7.a$a;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import cf7.a;
import android.view.Choreographer;
import cf7.a$b;
import android.view.Choreographer$FrameCallback;
import com.yxcorp.utility.Log;

public final class a$a extends Handler	// class@000540
{
    public static final a$a a;

    static {
       a$a.a = new a$a();
    }
    public void a$a(){
       super(Looper.getMainLooper());
    }
    public void handleMessage(Message p0){
       a.p(p0, "msg");
       if (p0.what == null) {
          a.a.c();
          Choreographer.getInstance().removeFrameCallback(a$b.b);
          Log.g("BarrierJankFixer", "Timeout - removeAllSyncBarriers");
       }
       return;
    }
}
