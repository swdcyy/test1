package ar6.e$a;
import zq6.q;
import ar6.e;
import java.lang.Object;
import zq6.p;
import msd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ar6.f;
import nsd.u;
import java.util.Map;

public final class e$a implements q	// class@0003a0
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(p p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$a.class, "2")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "value");
       f uof = new f(null, p1, this.a.a, null, false, 25, null);
       this.a.b.put(p0, v9);
       return;
    }
    public void b(p p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$a.class, "1")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "value");
       f uof = new f(p1, null, this.a.a, null, false, 26, null);
       this.a.b.put(p0, v9);
       return;
    }
    public void c(p p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$a.class, "3")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "value");
       f uof = new f(p1, null, this.a.a, null, true, 10, null);
       this.a.b.put(p0, v9);
       return;
    }
}
