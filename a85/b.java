package a85.b;
import a85.c$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;

public class b implements c$b	// class@000039
{
    public final long[] a;

    public void b(long[] p0){
       this.a = p0;
       super();
    }
    public void a(long p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, b.class, "2")) {
          return;
       }
       b ta = this.a;
       _monitor_enter(ta);
       this.a.notifyAll();
       _monitor_exit(ta);
       return;
    }
    public void b(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.a;
       _monitor_enter(uob);
       b ta = this.a;
       ta[0] = p0;
       ta.notifyAll();
       _monitor_exit(uob);
       return;
    }
    public void c(long p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, b.class, "3")) {
          return;
       }
       b ta = this.a;
       _monitor_enter(ta);
       this.a.notifyAll();
       _monitor_exit(ta);
       return;
    }
}
