package pwb.d;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pwb.a;
import java.util.Objects;
import com.kwai.performance.stability.crash.monitor.excluded.a;
import com.kwai.performance.stability.crash.monitor.excluded.a$a;
import sg7.d;
import kotlin.jvm.internal.a;
import android.os.Handler$Callback;
import java.lang.NullPointerException;

public final class d implements Runnable	// class@002209
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       a c = a.c;
       Objects.requireNonNull(c);
       Handler b = a.b;
       if (b != null) {
          d uod = new a$a().build();
          if (uod != null) {
             uod.g = b;
             uod.d();
             a h = uod.h;
             a.o(h, "callback");
             c.a(uod.f, h);
          }else {
             throw new NullPointerException("null cannot be cast to non-null type com.kwai.performance.stability.crash.monitor.excluded.ExcludeRemoteServiceException");
          }
       }
       return;
    }
}
