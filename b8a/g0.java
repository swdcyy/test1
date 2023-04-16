package b8a.g0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.g0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qvb.q;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class g0 extends PresenterV2	// class@0003a6
{
    public BaseFragment p;
    public SlidePlayViewModel q;
    public final q r;

    public void g0(){
       super();
       this.r = new g0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g0.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.p);
       this.q = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.e(this.r);
       }
       this.P8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g0.class, "3")) {
          return;
       }
       g0 tq = this.q;
       if (tq != null) {
          tq.b(this.r);
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, g0.class, "4")) {
          return;
       }
       List list = this.q.e0();
       if (!q.f(list)) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             iterator.next().startSyncWithFragment(this.p.m());
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g0.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
}
