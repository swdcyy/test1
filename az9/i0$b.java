package az9.i0$b;
import qp7.y0;
import az9.i0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import qp7.b;
import hka.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import bz9.h;
import crd.a;
import sz9.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm5.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import az9.j0;
import erd.g;
import crd.b;
import java.util.Objects;

public class i0$b extends y0	// class@00032b
{
    public final i0 a;

    public void i0$b(i0 p0){
       this.a = p0;
       super();
    }
    public void e(boolean p0){
       i0$b uob = i0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       super.e(p0);
       i0$b ta = this.a;
       ta.U0 = false;
       if (ta.m != null) {
          ta.o0();
       }
       ta = this.a;
       ta.v.l3(ta.W0);
       this.a.Y.b();
       this.a.V0.d();
       i0 z = this.a.Z;
       if (z != null) {
          z.g();
       }
       return;
    }
    public void f(boolean p0){
       i0$b uob = i0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       super.f(p0);
       i0$b ta = this.a;
       ta.U0 = false;
       if (ta.m != null) {
          ta.b0();
       }
       ta = this.a;
       ta.v.F2(ta.W0);
       this.a.V0.c(RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new j0(this)));
       i0 z = this.a.Z;
       if (z != null) {
          Objects.requireNonNull(z);
       }
       return;
    }
}
