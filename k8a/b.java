package k8a.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper;
import com.yxcorp.gifshow.detail.common.traffic.SlidePlayTrafficViewModelImpl;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.detail.common.traffic.SlidePlayTrafficViewModelImpl$b;
import k8a.b$a;
import io.reactivex.internal.functions.Functions;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import erd.g;
import brd.t;
import com.yxcorp.gifshow.util.rx.RxBus;
import ub6.a;
import t45.d;
import brd.z;
import k8a.b$b;
import ekd.k1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import uw9.t3;
import de5.a;

public final class b extends PresenterV2	// class@002c18
{
    public BaseFragment p;
    public QPhoto q;
    public a r;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (!PlayerPanelConfigHelper.a().isSaveTrafficEnable()) {
          return;
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       SlidePlayTrafficViewModelImpl slidePlayTra = SlidePlayTrafficViewModelImpl.h.a(activity);
       b$a uoa = new b$a(this);
       g e = Functions.e;
       a.o(e, "Functions.ERROR_CONSUMER");
       Objects.requireNonNull(slidePlayTra);
       b uob = PatchProxy.applyTwoRefs(uoa, e, slidePlayTra, SlidePlayTrafficViewModelImpl.class, "4");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(uoa, "onNext");
          a.p(e, "onError");
          uob = slidePlayTra.d.subscribe(uoa, e);
          a.o(uob, "mSaveTrafficSubject.subscribe\(onNext, onError\)");
       }
       this.X7(uob);
       this.X7(RxBus.f.f(a.class).observeOn(d.a).subscribe(new b$b(this), e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       k1.n(this);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       b tp = this.p;
       if (tp == null) {
          a.S("mBaseFragment");
       }
       b tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       int i = t3.a(tp, tq);
       tq = this.r;
       if (tq == null) {
          a.S("mDetailPlayModule");
       }
       tq.e(i);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
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
