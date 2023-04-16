package f85.f;
import java.util.concurrent.ConcurrentHashMap;
import f85.e;
import java.lang.Object;
import java.util.concurrent.ScheduledExecutorService;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g85.a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;

public class f	// class@0015e7
{
    public static final Map a;
    public static boolean b;
    public static int c;
    public static ScheduledExecutorService d;
    public static ScheduledFuture e;
    public static final Runnable f;

    static {
       f.a = new ConcurrentHashMap();
       f.b = true;
       f.c = -1;
       f.f = e.b;
    }
    public void f(){
       super();
    }
    public static ScheduledExecutorService a(){
       f uof = f.class;
       Object obj = PatchProxy.apply(null, null, uof, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (f.d == null) {
          _monitor_enter(uof);
          if (f.d == null) {
             f.d = Executors.newSingleThreadScheduledExecutor(new a("TagManager"));
          }
          _monitor_exit(uof);
       }
       return f.d;
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, f.class, "3")) {
          return;
       }
       if (f.b && f.c == 2) {
          boolean b = false;
          f.b = b;
          ScheduledFuture e = f.e;
          if (e != null) {
             e.cancel(b);
          }
          f.e = f.a().schedule(f.f, 5000, TimeUnit.MILLISECONDS);
       }
       return;
    }
    public static void c(){
       if (PatchProxy.applyVoid(null, null, f.class, "4")) {
          return;
       }
       f.b = true;
       ScheduledFuture e = f.e;
       if (e != null) {
          e.cancel(false);
       }
       return;
    }
}
