package nz9.z0$i;
import qp7.y0;
import nz9.z0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import nz9.e1;
import androidx.fragment.app.Fragment;
import java.lang.Runnable;
import k2b.n;
import nz9.u1;
import ekd.k1;
import nz9.d1;

public class z0$i extends y0	// class@003260
{
    public final z0 a;

    public void z0$i(z0 p0){
       this.a = p0;
       super();
    }
    public void a(){
       PatchProxy.applyVoid(null, this, z0$i.class, "3");
    }
    public void b(){
       PatchProxy.applyVoid(null, this, z0$i.class, "4");
    }
    public void e(boolean p0){
       z0$i oi = z0$i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "2")) {
          return;
       }
       z0$i ta = this.a;
       if (ta.J == null) {
          return;
       }
       ta.J = false;
       ta.L = true;
       n.a(ta.G, new e1(this));
       ta = this.a;
       ta.K = false;
       ta.U0 = false;
       z0 b = ta.B;
       if (b != null) {
          b.b();
       }
       k1.m(this.a.l1);
       k1.m(this.a.k1);
       this.a.x0();
       return;
    }
    public void f(boolean p0){
       z0$i oi = z0$i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "1")) {
          return;
       }
       z0$i ta = this.a;
       ta.J = true;
       n.a(ta.G, new d1(this));
       ta = this.a;
       if (ta.B == null || (ta.o0() || (this.a.D0() || (!this.a.B.c() && this.a.b1 == null)))) {
          this.a.B.d();
       }
    label_0050 :
       return;
    }
}
