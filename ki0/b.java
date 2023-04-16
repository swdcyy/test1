package ki0.b;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.apm.memory.KdsLeakDetector;
import android.os.SystemClock;
import java.util.Objects;

public final class b implements Runnable	// class@002d3c
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       Objects.requireNonNull(KdsLeakDetector.g);
       KdsLeakDetector.e = SystemClock.uptimeMillis();
       return;
    }
}
