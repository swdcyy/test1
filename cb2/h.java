package cb2.h;
import c12.f;
import cb2.h$a;
import cb2.h$b;
import cb2.h$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import androidx.viewpager.widget.ViewPager$i;
import f12.d;
import androidx.fragment.app.c$b;
import kq5.b;
import wq5.a;
import kp3.e;
import ekd.k1;
import cb2.w;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveSideBarModel;
import com.kuaishou.live.core.basic.activity.x;
import mq5.b;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import android.app.Activity;
import d61.y;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import pm8.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import cb2.j;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import cb2.h$d;
import java.util.Objects;
import android.view.View;
import android.view.ViewStub;
import cb2.t;
import ekd.f$j;
import android.view.View$OnTouchListener;
import com.airbnb.lottie.LottieAnimationView;
import d61.c0;
import cb2.v;
import android.animation.Animator$AnimatorListener;
import tq5.c;
import za2.a0;
import f12.c;
import cb2.e;
import java.lang.Runnable;
import cb2.b;
import cb2.a;
import com.kwai.feature.api.live.base.service.quitlive.AudienceQuitLiveCheckOrder;
import tq5.a;

public class h extends f	// class@00050b
{
    public e K;
    public x L;
    public LiveBizParam M;
    public c N;
    public b O;
    public a0 P;
    public m Q;
    public d R;
    public LiveStreamFeedWrapper S;
    public boolean T;
    public w U;
    public final a V;
    public final ViewPager$i W;
    public final c$b X;
    public static final boolean Y = false;
    public static String sLivePresenterClassName;

    public void h(){
       super();
       this.V = new h$a(this);
       this.W = new h$b(this);
       this.X = new h$c(this);
    }
    public void Q(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "3")) {
          return;
       }
       if (p0) {
          this.R.g(this.W);
       }
       if (this.K != null && this.P != null) {
          this.a9();
          this.O.a(this.X);
          this.K.y(this.V);
       }
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       this.a9();
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, h.class, "8")) {
          return;
       }
       k1.n(this);
       if (this.T != null) {
          this.U.c();
          this.K.o();
          this.T = false;
       }
       return;
    }
    public final boolean b9(){
       LiveStreamFeed obj = PatchProxy.apply(null, this, h.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.S.mEntity.mLiveSideBarModel;
       if (obj == null || obj.mLiveSideType != 5) {
          return false;
       }
       if (!this.L.a()) {
          return false;
       }
       if (this.z.U0()) {
          return false;
       }
       if (n.n(this.getContext()) > 0) {
          return false;
       }
       if (y.d(this.getActivity())) {
          return false;
       }
       if (this.M.mHasShownLiveSlideGuide != null) {
          return false;
       }
       if (a.c0()) {
          return false;
       }
       return true;
    }
    public void c9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "6")) {
          return;
       }
       if (!this.b9()) {
          return;
       }
       a.C1(true);
       this.M.mHasShownLiveSlideGuide = true;
       this.T = true;
       ClientContent$LiveStreamPackage liveStreamPa = this.Q.a();
       if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, j.class, "2")) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_LEFT_PULL_GUIDE_CARD";
          u1.u0(9, uElementPack, uContentPack);
       }
       h tU = this.U;
       h$d uod = new h$d(this);
       Objects.requireNonNull(tU);
       if (!PatchProxy.applyVoidOneRefs(uod, tU, w.class, "3")) {
          if (tU.c == null) {
             ViewStub viewStub = tU.a.findViewById(R.id.live_square_fullscreen_slide_guide_view_stub);
             viewStub.setLayoutResource(R.layout.arg_RES_7f0d0dcf);
             tU.c = viewStub.inflate();
          }
          tU.c.setVisibility(0);
          tU.c.setOnTouchListener(new t(tU, uod));
          LottieAnimationView lottieAnimat = tU.c.findViewById(R.id.live_square_fullscreen_slide_guide_animation_view);
          tU.d = lottieAnimat;
          lottieAnimat.setAnimationFromUrl(c0.a.b("udata/pkg/kwai-client-image/live_common/lottie_live_swipe_left.json"));
          tU.d.setRepeatCount(0);
          tU.d.a(new v(tU, uod));
          tU.d.s();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.t8("LIVE_SIDE_BAR_SWIPE_MOVEMENT");
       this.L = this.r8("LIVE_FRAGMENT_SERVICE");
       this.M = this.q8(LiveBizParam.class);
       this.N = this.r8("LIVE_QUIT_LIVE_SERVICE");
       this.O = this.r8("FRAGMENT_LIFE_CYCLE_SERVICE");
       this.P = this.s8(a0.class);
       this.Q = this.r8("LIVE_BASIC_CONTEXT");
       this.S = this.r8("LIVE_PHOTO");
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       this.a9();
       return;
    }
    public void x(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "2")) {
          return;
       }
       if (this.K != null && this.P != null) {
          d uod = c.b(this.getActivity());
          this.R = uod;
          if (p0) {
             uod.i(this.W);
          }
          this.K.k(this.V);
          if (this.U == null) {
             this.U = new w(this.m8());
          }
          k1.s(new e(this), this, 4000);
          k1.s(new b(this), this, 5000);
          this.N.Ci(new a(this), AudienceQuitLiveCheckOrder.LIVE_SQUARE_LEFT_GUIDE);
          this.O.c(this.X);
       }
       return;
    }
}
