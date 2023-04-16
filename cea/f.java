package cea.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e50.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import cea.e;
import erd.g;
import crd.b;
import eda.l;
import cea.d;
import g50.i;
import cea.c;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import cea.a;
import uw9.l0;
import cea.b;
import yw6.g;
import rda.b;
import e50.o;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class f extends PresenterV2	// class@0004eb
{
    public l0 p;
    public BaseFragment q;
    public final g r;
    public SlidePlayViewModel s;

    public void f(g p0){
       super();
       this.r = p0;
    }
    public void E8(){
       RxBus f;
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(n.class, mAIN).subscribe(new e(this)));
       this.X7(f.g(l.class, mAIN).subscribe(new d(this)));
       this.X7(f.g(i.class, mAIN).subscribe(new c(this)));
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q);
       this.s = slidePlayVie;
       slidePlayVie.T1(1);
       this.P8();
       f tp = this.p;
       tp.O1 = new a(this);
       tp.M1 = new b(this);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.r.h();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       this.r.g(this.s.O0());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(l0.class);
       this.q = this.r8("FRAGMENT");
       return;
    }
}
