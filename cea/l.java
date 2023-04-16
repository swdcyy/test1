package cea.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ff6.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import cea.k;
import erd.g;
import crd.b;
import eda.l;
import cea.j;
import g50.i;
import cea.i;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import cea.g;
import uw9.l0;
import cea.h;
import androidx.fragment.app.FragmentActivity;
import yw6.g;
import rda.b;
import e50.o;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class l extends PresenterV2	// class@0004f1
{
    public l0 p;
    public BaseFragment q;
    public final d r;
    public SlidePlayViewModel s;

    public void l(d p0){
       super();
       this.r = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(n.class, mAIN).subscribe(new k(this)));
       this.X7(f.g(l.class, mAIN).subscribe(new j(this)));
       this.X7(f.g(i.class, mAIN).subscribe(new i(this)));
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q);
       this.s = slidePlayVie;
       slidePlayVie.T1(1);
       this.P8();
       l tp = this.p;
       tp.O1 = new g(this);
       tp.M1 = new h(this);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       this.r.g(this.q.getActivity(), this.s.O0());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.q8(l0.class);
       this.q = this.r8("FRAGMENT");
       return;
    }
}
