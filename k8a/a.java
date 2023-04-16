package k8a.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k8a.a$a;
import nsd.u;
import k8a.a$b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.detail.common.traffic.SlidePlayTrafficViewModelImpl;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.detail.common.traffic.SlidePlayTrafficViewModelImpl$b;
import vy6.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import de5.a;

public final class a extends PresenterV2	// class@002c15
{
    public BaseFragment p;
    public QPhoto q;
    public a r;
    public c s;
    public SlidePlayViewModel t;
    public boolean u;
    public final a v;
    public static final a$a w;

    static {
       a.w = new a$a(null);
    }
    public void a(){
       super();
       this.v = new a$b(this);
    }
    public static final QPhoto P8(a p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.u = false;
       if (!PlayerPanelConfigHelper.a().isSaveTrafficEnable()) {
          return;
       }
       a tp = this.p;
       String str = "mBaseFragment";
       if (tp == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tp.getParentFragment());
       a.m(slidePlayVie);
       this.t = slidePlayVie;
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.s = SlidePlayTrafficViewModelImpl.h.a(activity);
       tp = this.t;
       if (tp == null) {
          a.S("mSlidePlayViewModel");
       }
       a tp1 = this.p;
       if (tp1 == null) {
          a.S(str);
       }
       tp.P(tp1, this.v);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.p = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailPlayModule::class.java\)");
       this.r = obj;
       return;
    }
}
