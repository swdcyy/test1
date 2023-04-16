package b8a.t0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.t0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import im8.f;

public class t0 extends PresenterV2	// class@0003f5
{
    public SlidePlayViewModel p;
    public BaseFragment q;
    public PhotoDetailParam r;
    public NasaBizParam s;
    public f t;
    public final a u;

    public void t0(){
       super();
       this.u = new t0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q.getParentFragment());
       this.p = slidePlayVie;
       slidePlayVie.P(this.q, this.u);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "3")) {
          return;
       }
       this.p.D(this.q, this.u);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "1")) {
          return;
       }
       this.q = this.r8("DETAIL_FRAGMENT");
       this.r = this.q8(PhotoDetailParam.class);
       this.s = this.q8(NasaBizParam.class);
       this.t = this.x8("AGGREGATE_ACTIVITY_OPACITY_HAS_CHANGED");
       return;
    }
}
