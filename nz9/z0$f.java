package nz9.z0$f;
import qp7.y0;
import nz9.z0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import androidx.fragment.app.Fragment;
import g9a.f;
import qp7.d;
import qp7.b;
import qp7.x0;
import os7.a;
import java.util.Objects;
import pp7.b;
import com.kwai.slide.play.detail.rightactionbar.follow.element.f;

public class z0$f extends y0	// class@00325d
{
    public final z0 a;

    public void z0$f(z0 p0){
       this.a = p0;
       super();
    }
    public void e(boolean p0){
       z0$f uof = z0$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "2")) {
          return;
       }
       if (this.a.q0() && (this.a.G.getView() instanceof f && this.a.C() != null)) {
          a uoa = this.a.E();
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoid(null, uoa, a.class, "24")) {
             uoa.B.f(Boolean.TRUE);
          }
          this.a.G.getView().t2(this.a.C().f);
       }
    label_0066 :
       return;
    }
    public void f(boolean p0){
       z0$f uof = z0$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "1")) {
          return;
       }
       if (this.a.q0() && (this.a.G.getView() instanceof f && this.a.C() != null)) {
          this.a.G.getView().J1(this.a.C().f);
       }
    label_0048 :
       return;
    }
}
