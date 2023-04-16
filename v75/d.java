package v75.d;
import v75.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.kwailink.base.b;
import java.nio.channels.FileLock;
import v75.a;
import v75.d$a;
import v75.b;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.ScheduledExecutorService;
import g85.a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.lang.Runnable;

public class d	// class@002679
{
    public static File a;
    public static FileOutputStream b;
    public static FileLock c;
    public static long d;
    public static d$a e;
    public static final Runnable f;
    public static ScheduledExecutorService g;

    static {
       d.f = c.b;
    }
    public void d(){
       super();
    }
    public static void a(){
       if (PatchProxy.applyVoid(null, null, d.class, "3")) {
          return;
       }
       if (!b.h()) {
          return;
       }
       FileLock c = d.c;
       if (c != null && c.isValid()) {
          return;
       }
       d.c(a.a);
       return;
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, d.class, "4")) {
          return;
       }
       if (!b.i()) {
          return;
       }
       d.c(b.a);
       return;
    }
    public static void c(d$a p0){
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, uod, "2")) {
          return;
       }
       d.e = p0;
       ScheduledExecutorService scheduledExe = PatchProxy.apply(null, null, uod, "1");
       if (scheduledExe != PatchProxyResult.class) {
       }else if(d.g == null){
          _monitor_enter(uod);
          if (d.g == null) {
             d.g = Executors.newSingleThreadScheduledExecutor(new a("FileLocker"));
          }
          _monitor_exit(uod);
       }
       scheduledExe = d.g;
       scheduledExe.execute(d.f);
       return;
    }
}
