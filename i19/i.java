package i19.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i19.i$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import zz5.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class i extends PresenterV2	// class@00260e
{
    public QPhoto p;
    public BaseFragment q;
    public List r;
    public SlidePlayViewModel s;
    public final a t;

    public void i(){
       super();
       this.t = new i$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.q.getParentFragment());
       this.s = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.q, this.t);
       }else {
          i tr = this.r;
          if (tr != null) {
             tr.add(this.t);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       i ts = this.s;
       if (ts != null) {
          ts.D(this.q, this.t);
       }else {
          ts = this.r;
          if (ts != null) {
             ts.remove(this.t);
          }
       }
       d.f(this.p, this.q);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("DETAIL_FRAGMENT");
       this.r = this.t8("DETAIL_ATTACH_LISTENERS");
       return;
    }
}
