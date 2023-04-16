package csa.a;
import asa.g;
import wq6.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import csa.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wq6.h;
import wq6.g;
import fr6.i;
import android.view.View;
import java.lang.Integer;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup$LayoutParams;

public final class a extends g	// class@0023a3
{
    public final i t;
    public final f u;

    public void a(f p0){
       a.p(p0, "containerController");
       super();
       this.u = p0;
       this.t = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       super.E8();
       this.t.c(this.u.j(), this.u.B());
       this.u.W(this.t);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       super.J8();
       this.u.b(this.t);
       return;
    }
    public void V8(int p0,View p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       a.p(p1, "view");
       p1 = this.m8();
       a.o(p1, "rootView");
       p1.height = p0;
       this.m8().requestLayout();
       return;
    }
}
