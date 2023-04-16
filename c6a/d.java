package c6a.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.util.rx.RxBus;
import c6a.c;
import brd.t;
import c6a.d$a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class d extends PresenterV2	// class@000564
{
    public SlidePlayViewModel p;
    public BaseFragment q;

    public void d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.p = SlidePlayViewModel.B0(this.q);
       this.X7(RxBus.f.f(c.class).subscribe(new d$a(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       return;
    }
}
