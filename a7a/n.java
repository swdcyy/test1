package a7a.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a7a.n$a;
import a7a.n$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.lang.Integer;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import io.reactivex.subjects.PublishSubject;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;

public class n extends PresenterV2	// class@00006f
{
    public BaseFragment p;
    public SlidePlayViewModel q;
    public SlideHorizontalAtlasPlayer r;
    public t s;
    public a t;
    public final a u;
    public final i v;
    public MilanoContainerEventBus w;

    public void n(){
       super();
       this.u = new n$a(this);
       this.v = new n$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, n.class, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.p.getParentFragment());
       this.q = slidePlayVie;
       slidePlayVie.P(this.p, this.u);
       PatchProxy.onMethodExit(n.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, n.class, "6")) {
          return;
       }
       this.q.D(this.p, this.u);
       PatchProxy.onMethodExit(n.class, "6");
       return;
    }
    public void P8(int p0){
       if (PatchProxy.isSupport2(n.class, "7") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, n.class, "7")) {
          return;
       }
       this.w.T.onNext(Integer.valueOf(p0));
       PatchProxy.onMethodExit(n.class, "7");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, n.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a032f);
       PatchProxy.onMethodExit(n.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, n.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_FRAGMENT");
       this.s = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVABLE");
       this.w = this.s8(MilanoContainerEventBus.class);
       PatchProxy.onMethodExit(n.class, "1");
       return;
    }
}
