package a1d.r$b;
import erd.g;
import u07.u;
import a1d.r;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import crd.b;
import android.content.Intent;
import ekd.j0;
import java.io.File;
import a1d.t;
import java.lang.Runnable;
import ekd.k1;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u07.j;

public class r$b implements g, u	// class@00004e
{
    public final r b;

    public void r$b(r p0){
       this.b = p0;
       super();
    }
    public void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r$b.class, "2")) {
          return;
       }
       this.b.P8().subscribe(this);
       return;
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$b.class, "1")) {
       }else {
          int i = 0;
          int i1 = 480;
          if (j0.b(p0, "outputX", i) < i1 || j0.b(p0, "outputY", i) < i1) {
             p0 = new t$a(this.b.getActivity());
             p0.W0(R.string.arg_RES_7f103e99);
             p0.u0(this);
             p0.S0(R.string.arg_RES_7f103e98);
             j.d(p0);
          }else {
             p0 = this.b.A;
             if (p0 != null && (p0.exists() && this.b.A.length() - 100 >= 0)) {
                p0.C = true;
                k1.o(new t(this));
             }
          }
       }
       return;
    }
}
