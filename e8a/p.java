package e8a.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e8a.p$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import e8a.p$b;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import ro5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class p extends PresenterV2	// class@0020cd
{
    public QPhoto p;
    public BaseFragment q;
    public boolean r;
    public p$b s;
    public SlidePlayViewModel t;
    public final a u;

    public void p(){
       super();
       this.u = new p$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q.getParentFragment());
       this.t = slidePlayVie;
       slidePlayVie.P(this.q, this.u);
       p$b uob = new p$b(this);
       this.s = uob;
       a.a(this.q, uob);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       this.t.D(this.q, this.u);
       p ts = this.s;
       if (ts != null) {
          a.l(this.q, ts);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
