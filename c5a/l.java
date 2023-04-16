package c5a.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import c5a.l$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.viewpager.widget.ViewPager$i;
import hf5.h;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import c5a.j;
import erd.g;
import crd.b;
import zv6.t;
import c5a.k;
import java.lang.Runnable;

public class l extends PresenterV2	// class@000555
{
    public BaseFragment p;
    public SlidePlayViewModel q;
    public h r;
    public BaseFeed s;
    public final ViewPager$i t;

    public void l(){
       super();
       this.t = new l$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       this.q = SlidePlayViewModel.B0(this.p);
       this.r.b(this.t, true);
       this.X7(this.p.Vg().j().subscribe(new j(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       l tq = this.q;
       if (tq != null) {
          tq.g(this.t);
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       l tq = this.q;
       if (tq != null) {
          tq.t1().b(this.p, new k(this), "NasaCameraBubblePresenter getRealPositionInAdapter");
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.r = this.r8("MILANO_SLIDE_PLAY_VM_PROTOCOL");
       return;
    }
}
