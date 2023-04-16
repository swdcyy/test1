package g19.o0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g19.o0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.lang.Boolean;
import jz8.n;
import jf5.a;
import rf5.u;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class o0 extends PresenterV2	// class@0023cf
{
    public QPhoto p;
    public n q;
    public boolean r;
    public BaseFragment s;
    public final a t;

    public void o0(){
       super();
       this.t = new o0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o0.class, "4")) {
          return;
       }
       SlidePlayViewModel.B0(this.s.getParentFragment()).P(this.s, this.t);
       return;
    }
    public void P8(boolean p0){
       o0 oo0 = o0.class;
       if (PatchProxy.isSupport(oo0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo0, "3")) {
          return;
       }
       if (this.R8()) {
          this.q.L.R.F(p0, 8);
       }
       return;
    }
    public final boolean R8(){
       n l = this.q.L;
       boolean b = (l != null && l.R != null)? true: false;
       return b;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o0.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(n.class);
       this.r = this.r8("HAS_PROFILE_AD").booleanValue();
       this.s = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
