package jz0.e$a;
import sk1.a;
import jz0.e;
import java.lang.Object;
import uk1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashSet;
import java.lang.Boolean;
import java.lang.Integer;
import pk1.a;
import mk1.w;
import jz0.l;

public class e$a implements a	// class@002c44
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "3")) {
          return;
       }
       this.a.v.remove(p0);
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "2")) {
          return;
       }
       this.a.v.add(p0);
       return;
    }
    public void c(boolean p0,int p1){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uoa, "4")) {
          return;
       }
       this.a.V8(p0, p1);
       return;
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       this.a.P8(p0);
       if (w.b()) {
          e y = this.a.y;
          if (y != null) {
             y.a();
          }
       }
       return;
    }
}
