package com.kuaishou.live.core.show.floatingwindow.e;
import im8.g;
import a51.c;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import com.kuaishou.live.core.show.floatingwindow.e$a;
import com.kuaishou.live.core.show.floatingwindow.e$b;
import com.kuaishou.live.core.show.floatingwindow.e$c;
import com.kuaishou.live.core.show.floatingwindow.e$d;
import com.kuaishou.live.core.show.floatingwindow.e$e;
import com.kuaishou.live.core.show.floatingwindow.e$f;
import s82.h;
import com.kuaishou.live.core.show.floatingwindow.e$g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import t82.e;
import t02.a0;
import s82.i;
import com.kwai.feature.api.live.base.service.quitlive.AudienceQuitLiveCheckOrder;
import tq5.a;
import tq5.c;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kwai.framework.activitycontext.ActivityContext;
import androidx.fragment.app.c$b;
import kq5.b;
import q12.b;
import q12.c;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import mq5.d$b;
import mq5.d;
import mq5.d$a;
import w02.g;
import com.kuaishou.live.core.show.floatingwindow.z;
import com.yxcorp.gifshow.util.rx.RxBus;
import s82.x;
import brd.t;
import t45.d;
import brd.z;
import s82.j;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import f12.d;
import f12.c;
import java.util.Objects;
import x61.c;
import lp3.c;
import lp3.e;
import wkd.b;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import s82.o;
import java.lang.ref.WeakReference;
import ty1.b;
import ty1.c;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import p91.m;
import com.kuaishou.live.basic.model.StreamType;
import s82.g;
import android.view.View$OnClickListener;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import com.kuaishou.live.core.show.floatingwindow.y$a;
import com.kuaishou.android.live.model.LiveFloatingWindowType;
import com.kuaishou.live.core.show.floatingwindow.y;
import xl8.b;
import og1.a;
import java.lang.Boolean;
import com.kuaishou.live.core.show.floatingwindow.u;
import java.util.Map;
import tj3.e;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$m;
import s82.m;
import java.util.HashMap;
import com.kuaishou.live.core.basic.activity.x;
import d92.p;
import pp.d;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import nl8.o;
import nl8.n;
import m56.f;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.live.core.show.floatingwindow.e$h;
import android.os.Handler;
import s82.k;
import java.lang.Runnable;
import tj3.i;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.framework.model.user.QCurrentUser;
import co2.i0;

public class e extends c implements g	// class@000b83
{
    public LiveSlidePlayService A;
    public LiveStreamFeedWrapper B;
    public p C;
    public LivePlayerController D;
    public c E;
    public d F;
    public LivePlayFragment G;
    public LiveAudienceParam H;
    public LiveBizParam I;
    public d J;
    public e K;
    public c L;
    public d M;
    public boolean N;
    public final boolean O;
    public final e$h P;
    public final ActivityContext$b Q;
    public final c$b R;
    public final c S;
    public final d$b T;
    public final b U;
    public final b V;
    public e W;
    public final d$a X;
    public int v;
    public a0 w;
    public x x;
    public b y;
    public x z;
    public static String sLivePresenterClassName = "LiveAudienceFloatingWindowPresenter";

    public void e(){
       super();
       this.O = a.t().u("SOURCE_LIVE").d("enableReleaseFloatingWindowPlayerWhenNewLiveComeIn", false);
       this.P = new e$a(this);
       this.Q = new e$b(this);
       this.R = new e$c(this);
       this.S = new e$d(this);
       this.T = new e$e(this);
       this.U = new e$f(this);
       this.V = new h(this);
       this.X = new e$g(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.W8().b();
       this.w.w1.Ci(new i(this), AudienceQuitLiveCheckOrder.FLOATING_WINDOW);
       ActivityContext.i(this.Q);
       this.y.c(this.R);
       this.E.c(this.U);
       this.A.P4(this.S);
       this.J.Mn(this.T);
       this.J.cb(this.X);
       this.w.I2.a(this);
       if (z.d()) {
          this.X7(RxBus.f.f(x.class).observeOn(d.a).subscribe(new j(this)));
       }
       this.W8().b();
       this.M = c.b(this.getActivity());
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "5")) {
          return;
       }
       super.J8();
       e uoe = this.W8();
       Objects.requireNonNull(uoe);
       if (!PatchProxy.applyVoid(objArray, uoe, e.class, "4")) {
          uoe.a.a(c.class).O0(1030);
       }
       this.y.a(this.R);
       this.E.b(this.U);
       this.A.d5(this.S);
       this.J.ng(this.T);
       this.J.yf(this.X);
       LiveFloatingWindowManager liveFloating = b.a(0x432c5e03);
       e tG = this.G;
       Objects.requireNonNull(liveFloating);
       if (!PatchProxy.applyVoidOneRefs(tG, liveFloating, LiveFloatingWindowManager.class, "10")) {
          liveFloating = liveFloating.D;
          Objects.requireNonNull(liveFloating);
          if (!PatchProxy.applyVoidOneRefs(tG, liveFloating, o.class, "2")) {
             o a = liveFloating.a;
             if (a == null || (tG == null || (tG == a.get() && !PatchProxy.applyVoid(objArray, liveFloating, o.class, "3")))) {
                liveFloating.b.clear();
                liveFloating.c.clear();
                liveFloating.d.clear();
                liveFloating.a.clear();
                liveFloating.e = 0;
             }
          }
       }
       this.w.I2.b(this);
       uoe = this.L;
       if (uoe != null) {
          uoe.a(this.V);
       }
       ActivityContext.k(this.Q);
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       LiveFloatingWindowManager liveFloating = b.a(0x432c5e03);
       e tD = this.D;
       e tK = this.K;
       e tB = this.B;
       a0 l = this.w.l;
       e tG = this.G;
       Objects.requireNonNull(liveFloating);
       LiveFloatingWindowManager liveFloating1 = LiveFloatingWindowManager.class;
       int i = 4;
       int i1 = 2;
       if (PatchProxy.isSupport(liveFloating1)) {
          Object[] objArray = new Object[]{tD,tK,tB,Integer.valueOf(l),tG};
          if (!PatchProxy.applyVoid(objArray, liveFloating, liveFloating1, "11")) {
          label_004b :
             liveFloating = liveFloating.D;
             Objects.requireNonNull(liveFloating);
             o oo = o.class;
             if (PatchProxy.isSupport(oo)) {
                objArray = new Object[]{tD,tK,tB,Integer.valueOf(l),tG};
                if (!PatchProxy.applyVoid(objArray, liveFloating, oo, "1")) {
                }
             }else {
             }
          }
       }else {
          goto label_004b ;
       }
       return;
    }
    public final int V8(){
       int i;
       e obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.X8();
       if (this.w.Z2.B0() == StreamType.AUDIO.toInt()) {
          i = 2;
       }else {
          obj = this.L;
          i = (obj != null && (obj.c() != 3 && (this.L.c() == 5 || this.L.c() == 6)))? 1: 0;
       }
       return i;
    }
    public final e W8(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.W == null) {
          this.W = new e(new g(this));
       }
       return this.W;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       if (this.L == null) {
          c uoc = this.w.Z2.w();
          this.L = uoc;
          if (uoc != null) {
             uoc.b(this.V);
          }
       }
       return;
    }
    public void Y8(LivePlayerController p0,LiveStreamFeedWrapper p1,int p2,LiveSlidePlayEnterParam p3){
       y b;
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, e.class, "9")) {
          return;
       }
       int i = 0x432c5e03;
       b.a(i).A(this.V8());
       y$a uoa = new y$a();
       uoa.c = p2;
       uoa.d = this.K;
       e tw = this.w;
       uoa.h = tw;
       uoa.a = p0;
       uoa.f = p3;
       uoa.e = tw.l;
       uoa.j = LiveFloatingWindowType.OUT_LIVE;
       uoa.g = this.N;
       uoa.b = p1;
       y oy = PatchProxy.apply(null, uoa, y$a.class, "1");
       if (oy != PatchProxyResult.class) {
       }else {
          oy = new y(uoa);
       }
       LiveSlidePlayEnterParam liveSlidePla = b.a(i);
       Objects.requireNonNull(liveSlidePla);
       if (!PatchProxy.applyVoidOneRefs(oy, liveSlidePla, LiveFloatingWindowManager.class, "12") && !a.a().a().booleanValue()) {
          liveSlidePla.H = oy.f;
          liveSlidePla.I = oy.e;
          liveSlidePla.E = oy.c;
          b = oy.b;
          u ou = new u(liveSlidePla);
          LiveFloatingWindowManager o = liveSlidePla.o;
          if (o != null) {
             liveSlidePla.Q.remove(o);
             liveSlidePla.N = false;
          }
          if (liveSlidePla.N == null) {
             liveSlidePla.o = ou;
             liveSlidePla.Q.put(ou, Boolean.TRUE);
             liveSlidePla.N = true;
          }
          liveSlidePla.B(oy.a, oy.d, b, liveSlidePla.P, true, oy.i, oy.j, null);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new m());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.w = this.q8(a0.class);
       this.x = this.r8("LIVE_FRAGMENT_SERVICE");
       this.y = this.r8("FRAGMENT_LIFE_CYCLE_SERVICE");
       this.z = this.r8("LIVE_FRAGMENT_SERVICE");
       this.A = this.r8("LIVE_SLIDE_PLAY_SERVICE");
       this.B = this.r8("LIVE_PHOTO");
       this.C = this.q8(p.class);
       this.D = this.r8("LIVE_PLAYER_CONTROLLER");
       this.E = this.r8("LIVE_PLAYER_SERVICE");
       this.F = this.r8("LIVE_CONTEXT_DEBUG_LOGGER");
       this.G = this.r8("LIVE_FRAGMENT");
       this.H = this.r8("LIVE_AUDIENCE_PARAM");
       this.J = this.r8("LIVE_AUDIENCE_OFFLINE_SERVICE");
       this.K = this.r8("LIVE_LOG_REPORTER");
       this.I = this.q8(LiveBizParam.class);
       this.W8().i(n.a(this));
       return;
    }
    public void onEventMainThread(f p0){
       a0 a1;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "12")) {
          return;
       }
       if (!z.c()) {
          return;
       }
       this.X8();
       e tL = this.L;
       int i = 0x7f11066a;
       if (tL != null && tL.c() == 4) {
          i.d(i, a1.p(R.string.arg_RES_7f100f7e));
       }else if(this.w.E.isPlaying()){
          i = 1;
          boolean b = (this.getContext() != null && SystemUtil.T(this.getContext()))? true: false;
          if (b) {
             int i1 = 3;
             if (z.d()) {
                this.P.c(i1);
                RxBus.f.b(new x(x.a(this.getActivity())));
                new Handler().post(new k(this));
             }else {
                this.Y8(this.w.E, this.B, i1, null);
             }
             this.K.h().p(i);
             this.K.h().A(i);
          }else {
             b.Z(LiveLogTag.FLOATING_WINDOW, "OnAppBackgroundEvent, but screen is not on");
          }
       }else if(this.w.Z2.B0() == StreamType.VOICEPARTY.toInt()){
          a1 = this.w.a1;
          if (a1 != null && a1.L2(QCurrentUser.ME.getId())) {
             i.d(i, a1.p(R.string.arg_RES_7f100f7f));
          }
       }
       return;
    }
}
