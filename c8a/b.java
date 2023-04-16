package c8a.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import c8a.b$a;
import nsd.u;
import c8a.b$b;
import c8a.b$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i3a.b;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import lnc.i3;
import lnc.a1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import android.app.Activity;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import com.kwai.feature.api.feed.home.common.SlideGuideManager$a;
import uh5.e;
import hn5.n;
import hn5.m;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import za5.a;
import com.kwai.library.widget.popup.common.f;
import c8a.b$d;
import c8a.b$e;
import com.yxcorp.gifshow.widget.h$a;
import com.yxcorp.gifshow.widget.h$b;
import e17.i$b;
import com.yxcorp.gifshow.widget.h;
import e17.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public final class b extends PresenterV2	// class@000575
{
    public BaseFragment p;
    public SlidePlayViewModel q;
    public a r;
    public PhotoDetailParam s;
    public QPhoto t;
    public int u;
    public boolean v;
    public final a w;
    public final IMediaPlayer$OnInfoListener x;
    public static final b$a y;

    static {
       b.y = new b$a(null);
    }
    public void b(){
       super();
       this.w = new b$b(this);
       this.x = new b$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (!b.b()) {
          return;
       }
       b tp = this.p;
       String str = "mFragment";
       if (tp == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tp.getParentFragment());
       this.q = slidePlayVie;
       if (slidePlayVie != null) {
          b tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          slidePlayVie.P(tp1, this.w);
       }
       tp = this.r;
       if (tp != null) {
          e player = tp.getPlayer();
          if (player != null) {
             player.addOnInfoListener(this.x);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b tq = this.q;
       if (tq != null) {
          b tp = this.p;
          if (tp == null) {
             a.S("mFragment");
          }
          tq.D(tp, this.w);
       }
       tq = this.r;
       if (tq != null) {
          e player = tq.getPlayer();
          if (player != null) {
             player.removeOnInfoListener(this.x);
          }
       }
       return;
    }
    public final void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("click_type", p0);
       oi3.d("toast_content", a1.p(R.string.arg_RES_7f1005c8));
       p0 = oi3.e();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "TOAST_INFO_CARD";
       uElementPack.params = p0;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       b tt = this.t;
       if (tt == null) {
          a.S("mPhoto");
       }
       uContentPack.photoPackage = w1.f(tt.mEntity);
       b tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       u1.M("", tp, 3, uElementPack, uContentPack, null);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       if (!b.b()) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity == null || (!activity.isFinishing() && !activity.isDestroyed())) {
          if (SlideGuideManager.m.a().b(activity)) {
             return;
          }else {
             int i = e.c();
             if (m.a().U3(activity)) {
                a uoa = a.o0(activity);
                a.o(uoa, "HomeDataViewModel.get\(ac\x20\x02ity as FragmentActivity?\)\x00");
                if (uoa.p0() == 3) {
                   i = e.c() + f.h(activity);
                }
             }
             i$b uob = h.d(a1.p(R.string.arg_RES_7f1005c8), new b$d(this), new b$e(this), 3000, i, false, false);
             uob.v(false);
             a.o(uob, "BottomSkipToast.buildBot¡­     \).setResidual\(false\)");
             uob.s(R.layout.arg_RES_7f0d00e8);
             i.z(uob);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.p = obj;
       this.r = this.q8(a.class);
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.s = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.t = obj;
       return;
    }
}
