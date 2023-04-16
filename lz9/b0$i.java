package lz9.b0$i;
import qp7.b1;
import lz9.b0;
import java.lang.Object;
import qp7.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.kwai.library.widget.popup.common.c;
import crd.b;
import lnc.b9;
import qp7.x0;
import qp7.b;
import ks7.h0;
import android.view.View;
import androidx.fragment.app.Fragment;
import g9a.f;
import qp7.d;
import ks7.a;

public class b0$i implements b1	// class@002ed3
{
    public final b0 a;

    public void b0$i(b0 p0){
       this.a = p0;
       super();
    }
    public void a(){
       a1.a(this);
    }
    public void b(){
       a1.g(this);
    }
    public void c(boolean p0){
       b0$i oi = b0$i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "3")) {
          return;
       }
       this.a.o0();
       p0.F = false;
       return;
    }
    public void d(boolean p0){
       if (PatchProxy.isSupport(b0$i.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, b0$i.class, "4")) {
          return;
       }
       Objects.requireNonNull(this.a);
       return;
    }
    public void e(boolean p0){
       b0$i oi = b0$i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "2")) {
          return;
       }
       b0 t = this.a.T;
       if (t != null) {
          t.o();
          t.T = null;
       }
       b9.a(this.a.N);
       this.a.E().i(false);
       if (this.a.A.getView() instanceof f && this.a.C() != null) {
          this.a.A.getView().t2(this.a.C().f);
       }
       return;
    }
    public void f(boolean p0){
       b0$i oi = b0$i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "1")) {
          return;
       }
       this.a.s0();
       this.a.E().i(false);
       if (this.a.A.getView() instanceof f && this.a.C() != null) {
          this.a.A.getView().J1(this.a.C().f);
       }
       return;
    }
    public void g(){
       a1.e(this);
    }
    public void h(){
       a1.c(this);
    }
}
