package qh.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qh.i$a;
import qh.i$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import lnc.r3;
import hka.f;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qw6.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class i extends PresenterV2	// class@0029e6
{
    public BaseFragment p;
    public QPhoto q;
    public SlidePlayViewModel r;
    public boolean s;
    public final f t;
    public final a u;

    public void i(){
       super();
       this.s = false;
       this.t = new i$a(this);
       this.u = new i$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       if (this.getActivity() != null && this.getActivity() instanceof r3) {
          this.getActivity().R(this.t);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.p);
       this.r = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.h(this.u);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       if (this.getActivity() != null && this.getActivity() instanceof r3) {
          this.getActivity().G1(this.t);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
}
