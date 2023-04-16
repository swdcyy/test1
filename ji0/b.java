package ji0.b;
import android.os.HandlerThread;
import android.os.Handler;
import android.os.Looper;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class b extends HandlerThread	// class@002bb0
{
    public static final Handler b;
    public static boolean c;
    public static final b d;

    static {
       b uob = new b();
       b.d = uob;
       uob.start();
       b.b = new Handler(uob.getLooper());
    }
    public void b(){
       super("KdsLoopThread", 10);
    }
    public void onLooperPrepared(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.onLooperPrepared();
       b.c = true;
       return;
    }
}
