package b8a.x1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.x1$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import im8.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class x1 extends PresenterV2	// class@000416
{
    public f p;
    public SlidePlayViewModel q;
    public BaseFragment r;
    public final a s;

    public void x1(){
       super();
       this.s = new x1$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, x1.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.r.getParentFragment());
       this.q = slidePlayVie;
       slidePlayVie.r0(this.r, this.s);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x1.class, "1")) {
          return;
       }
       this.p = this.x8("DETAIL_LOGGER");
       this.r = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
