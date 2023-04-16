package ki0.c;
import ki0.c$a;
import nsd.u;
import java.util.concurrent.Executor;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.lang.ref.ReferenceQueue;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.ref.Reference;
import ki0.a;
import java.util.Map;

public final class c	// class@002d3e
{
    public final Set a;
    public final Map b;
    public final ReferenceQueue c;
    public final Executor d;
    public final a e;
    public static final c$a f;

    static {
       c.f = new c$a(null);
    }
    public void c(Executor p0,a p1){
       a.p(p0, "checkRetainedExecutor");
       a.p(p1, "isEnabled");
       super();
       this.d = p0;
       this.e = p1;
       this.a = new LinkedHashSet();
       this.b = new LinkedHashMap();
       this.c = new ReferenceQueue();
    }
    public final void a(){
       a uoa;
       if (PatchProxy.applyVoid(null, this, c.class, "11")) {
          return;
       }
       do {
          uoa = this.c.poll();
          if (uoa != null) {
             this.b.remove(uoa.b);
          }
       } while (uoa == null);
       return;
    }
}
