package com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter$a;
import java.lang.reflect.Type;
import el.a;
import java.util.HashSet;
import java.util.BitSet;
import com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter$f;
import t37.g;
import com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter$b;
import com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter$c;
import t37.f;
import t37.e;
import com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter$d;
import t37.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y43.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import ds5.e;
import com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter$e;
import h47.b;
import j47.d;
import oq5.c;
import oq5.a;
import mw1.d;
import mw1.b;
import iq5.b;
import iq5.a;
import lt5.b;
import lt5.a;
import mq5.h;
import mq5.b;
import j77.f;
import j77.a;
import aq5.d;
import fq5.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import ekd.k1;
import java.util.Set;
import android.animation.ValueAnimator;
import nq5.a;
import java.lang.Integer;
import android.widget.RelativeLayout;
import com.kwai.live.gzone.bean.LiveGzoneActivityBanner;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import yr5.b;
import lp3.c;
import lp3.i;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.animation.TimeInterpolator;
import t37.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import t37.n;
import android.animation.Animator$AnimatorListener;
import android.widget.FrameLayout;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import t37.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import d71.a;
import com.kwai.feature.api.live.base.service.pendant.LivePendantContainerHideFlags;
import pq5.c;
import mrd.a;
import c77.p;
import java.util.Iterator;
import uxc.e$a;
import java.lang.Boolean;
import w37.a;
import java.util.List;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import uxc.e;
import j47.c;
import z53.i;
import bt5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService$DisableSlidePlayFunction;
import com.kwai.feature.api.live.service.show.rebroadcastbanner.BannerLocation;
import lnc.a1;
import t37.i;
import java.lang.Runnable;
import ekd.m1;
import android.view.ViewStub;
import f37.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import t37.u;
import java.util.Map;
import java.util.HashMap;
import com.kwai.video.waynelive.LivePlayerController;

public class LiveGzoneAudienceActivityBannerPresenter extends PresenterV2 implements g	// class@000c58
{
    public TextView A;
    public TextView B;
    public KwaiImageView C;
    public WebViewFragment D;
    public View E;
    public boolean F;
    public Set G;
    public boolean H;
    public BitSet I;
    public a J;
    public a K;
    public c L;
    public LivePlayerController M;
    public a N;
    public i O;
    public b P;
    public Set Q;
    public ValueAnimator R;
    public int S;
    public WebViewFragment$a T;
    public final b U;
    public LiveGzoneActivityBanner U0;
    public c V;
    public boolean V0;
    public b W;
    public int W0;
    public b X;
    public h X0;
    public b Y;
    public f Y0;
    public d Z;
    public e Z0;
    public List p;
    public LinkedHashMap q;
    public ViewStub r;
    public KwaiImageView s;
    public View t;
    public View u;
    public View v;
    public View w;
    public RelativeLayout x;
    public RelativeLayout y;
    public FrameLayout z;
    public static final Type a1;

    static {
       LiveGzoneAudienceActivityBannerPresenter.a1 = new LiveGzoneAudienceActivityBannerPresenter$a().getType();
    }
    public void LiveGzoneAudienceActivityBannerPresenter(){
       super();
       this.G = new HashSet();
       this.I = new BitSet();
       this.P = new LiveGzoneAudienceActivityBannerPresenter$f(this);
       this.Q = new HashSet();
       this.S = 0;
       this.U = new g(this);
       this.V = new LiveGzoneAudienceActivityBannerPresenter$b(this);
       this.W = new LiveGzoneAudienceActivityBannerPresenter$c(this);
       this.X = new f(this);
       this.Z = new e(this);
       this.X0 = new LiveGzoneAudienceActivityBannerPresenter$d(this);
       this.Y0 = new h(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceActivityBannerPresenter.class, "4")) {
          return;
       }
       if (this.J.F.C0().mIsFromLiveMate != null && this.J.F.C0().mLandscape != null) {
          this.I.set(2, true);
          this.F = false;
          LiveGzoneAudienceActivityBannerPresenter$e uoe = new LiveGzoneAudienceActivityBannerPresenter$e(this);
          this.Y = uoe;
          a u = this.J.u;
          if (u != null) {
             u.Q1(uoe);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceActivityBannerPresenter.class, "6")) {
          return;
       }
       this.Z8();
       a u = this.J.u;
       if (u != null) {
          u.H8(this.Y);
       }
       this.K.Q0(this.V);
       u = this.J.A;
       if (u != null) {
          u.X0(this.Z);
       }
       u = this.J.W0;
       if (u != null) {
          u.c(this.W);
       }
       LiveGzoneAudienceActivityBannerPresenter tN = this.N;
       if (tN != null) {
          tN.R1(this.U);
       }
       int i = 0;
       this.W0 = i;
       this.J.z.le(this.X0);
       a l = this.J.l;
       if (l != null) {
          l.t(this.Y0);
       }
       a[] uoaArray = new a[]{AudienceBizRelation.PK};
       this.J.m.A0().G5(this.X, uoaArray);
       k1.n(this);
       this.Q.clear();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceActivityBannerPresenter.class, "27")) {
          return;
       }
       LiveGzoneAudienceActivityBannerPresenter tR = this.R;
       if (tR != null) {
          tR.cancel();
       }
       return;
    }
    public void R8(int p0){
       a uoa = a.class;
       LiveGzoneAudienceActivityBannerPresenter liveGzoneAud = LiveGzoneAudienceActivityBannerPresenter.class;
       if (PatchProxy.isSupport(liveGzoneAud) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveGzoneAud, "10")) {
          return;
       }
       LiveGzoneAudienceActivityBannerPresenter tx = this.x;
       if (tx != null && !tx.getVisibility()) {
          tx = this.S;
          if (p0 == tx || (this.t != null && this.U0.mEnableImageBanner == null)) {
             tx = (tx == null)? 1: null;
             this.S = p0;
             RelativeLayout$LayoutParams layoutParams = this.y.getLayoutParams();
             LiveGzoneAudienceActivityBannerPresenter tS = this.S;
             if (tS == 1) {
                this.P8();
                layoutParams.height = this.W0;
                a w = this.J.w;
                if (w != null) {
                   w.h(1);
                }
                liveGzoneAud = this.O;
                if (liveGzoneAud != null) {
                   liveGzoneAud.a(uoa).j1(4);
                }
                LiveGzoneAudienceActivityBannerPresenter tD = this.D;
                if (tD != null && tD.eh() != null) {
                   this.D.eh().scrollTo(0, 0);
                }
                this.b9(1);
                this.a9(1);
                this.A.setVisibility(0);
                this.C.setVisibility(0);
                this.B.setVisibility(8);
                this.E.setVisibility(8);
                this.c9(this.U0.mEnableHalfUnfoldInteraction);
                this.W8(1);
                this.v.setVisibility(0);
             }else if(tS == 2){
                layoutParams.height = -1;
                tS = this.D;
                if (tS != null && (tS.eh() != null && (this.U0.mEnableUnfoldAutoRefresh != null && !tx))) {
                   this.D.eh().loadUrl(this.U0.mContentLink);
                }
             label_00ca :
                a w1 = this.J.w;
                if (w1 != null) {
                   w1.r(1);
                }
                tx = this.O;
                if (tx != null) {
                   tx.a(uoa).S0(4);
                }
                this.b9(0);
                this.a9(0);
                this.A.setVisibility(8);
                this.C.setVisibility(8);
                this.v.setVisibility(8);
                this.B.setVisibility(0);
                this.E.setVisibility(0);
                this.c9(1);
                if (!PatchProxy.applyVoid(null, this, liveGzoneAud, "23")) {
                   this.P8();
                   int[] ointArray = new int[]{this.y.getHeight(),this.x.getParent().getHeight() - this.y.getLayoutParams().topMargin};
                   ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
                   this.R = valueAnimato;
                   valueAnimato.setDuration(200);
                   this.R.setInterpolator(new AccelerateInterpolator());
                   this.R.addUpdateListener(new b(this));
                   this.R.addListener(new n(this));
                   this.R.start();
                }
                this.W8(2);
             }
             this.y.setLayoutParams(layoutParams);
             this.z.setVisibility(0);
             a.e(this.S, 0, this.J.m.a(), this.U0);
          }
       }
    label_017c :
       return;
    }
    public void S8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGzoneAudienceActivityBannerPresenter.class, "19")) {
          return;
       }
       this.R8(1);
       ClientContent$LiveStreamPackage liveStreamPa = this.J.m.a();
       LiveGzoneAudienceActivityBannerPresenter tU0 = this.U0;
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, tU0, objArray, a.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLICK_LIVE_WATCH_WEBVIEW_CLOSE";
          uElementPack.params = a.b(tU0);
          u1.u(1, uElementPack, a.c(liveStreamPa));
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceActivityBannerPresenter.class, "13")) {
          return;
       }
       LiveGzoneAudienceActivityBannerPresenter tx = this.x;
       if (tx != null) {
          tx.setVisibility(8);
          this.X8(false);
          this.J.o.j();
       }
       return;
    }
    public final void W8(int p0){
       LiveGzoneAudienceActivityBannerPresenter liveGzoneAud = LiveGzoneAudienceActivityBannerPresenter.class;
       if (PatchProxy.isSupport(liveGzoneAud) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveGzoneAud, "11")) {
          return;
       }
       if (p0 == 2) {
          this.J.r.a8(LivePendantContainerHideFlags.GZONE_ACTIVITY_BANNER);
       }else {
          this.J.r.Gm(LivePendantContainerHideFlags.GZONE_ACTIVITY_BANNER);
       }
       a p = this.J.p;
       if (p != null) {
          p.Yf().onNext(Integer.valueOf(p0));
       }
       boolean b = false;
       if (p0) {
          Iterator iterator = this.G.iterator();
          while (iterator.hasNext()) {
             e$a uoa = iterator.next();
             int i = (p0 == 2)? 0: 1;
             uoa.a(i);
          }
       }
       if (p0 == 1) {
          b = true;
       }
       this.X8(b);
       return;
    }
    public final void X8(boolean p0){
       LiveGzoneAudienceActivityBannerPresenter liveGzoneAud = LiveGzoneAudienceActivityBannerPresenter.class;
       if (PatchProxy.isSupport(liveGzoneAud) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveGzoneAud, "12")) {
          return;
       }
       Iterator iterator = this.Q.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceActivityBannerPresenter.class, "24")) {
          return;
       }
       if (this.x == null) {
          return;
       }
       if (this.I.get(2)) {
          this.e9(2, false);
       }
       return;
    }
    public void Z8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGzoneAudienceActivityBannerPresenter.class, "28")) {
          return;
       }
       this.P8();
       int i = 0;
       this.S = i;
       this.H = i;
       LiveGzoneAudienceActivityBannerPresenter tp = this.p;
       if (tp != null) {
          tp.clear();
       }
       tp = this.q;
       if (tp != null) {
          tp.clear();
       }
       this.W8(this.S);
       this.V0 = i;
       this.V8();
       LiveGzoneAudienceActivityBannerPresenter tD = this.D;
       if (tD != null) {
          tD.fh(this.T);
          this.T = objArray;
          this.D.qh(objArray);
       }
       this.G.clear();
       this.I.clear();
       this.I.set(2, true);
       return;
    }
    public final void a9(boolean p0){
       LiveGzoneAudienceActivityBannerPresenter liveGzoneAud = LiveGzoneAudienceActivityBannerPresenter.class;
       if (PatchProxy.isSupport(liveGzoneAud) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveGzoneAud, "9")) {
          return;
       }
       int i = 4;
       if (p0) {
          this.J.o.j();
       }else {
          this.J.o.d(i);
       }
       if (!this.L.l()) {
          return;
       }else {
          a p = this.J.p;
          if (p != null && !p.Q6()) {
             return;
          }else {
             p = this.J.q;
             if (p != null) {
                View view = p.b();
                if (p0) {
                   i = 0;
                }
                view.setVisibility(i);
             }
             return;
          }
       }
    }
    public final void b9(boolean p0){
       LiveGzoneAudienceActivityBannerPresenter liveGzoneAud = LiveGzoneAudienceActivityBannerPresenter.class;
       if (PatchProxy.isSupport(liveGzoneAud) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveGzoneAud, "15")) {
          return;
       }
       liveGzoneAud = this.O;
       if (liveGzoneAud != null) {
          liveGzoneAud.a(b.class).Q3(LiveSlidePlayService$DisableSlidePlayFunction.GZONE_ACTIVITY_BANNER, p0);
       }
       return;
    }
    public final void c9(boolean p0){
       this.V0 = p0;
    }
    public void d9(){
       LiveGzoneAudienceActivityBannerPresenter tN;
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceActivityBannerPresenter.class, "8")) {
          return;
       }
       if (this.x == null) {
          return;
       }
       if (this.L.l()) {
          tN = this.N;
          if (tN != null && tN.a(BannerLocation.RIGHT_TOP_LOCATION)) {
             this.x.getLayoutParams().topMargin = a1.d(0x7f0707e7);
          }
          return;
       }else if(this.U0.mEnableImageBanner != null){
          tN = this.s;
       }else {
          tN = this.y;
       }
       RelativeLayout$LayoutParams layoutParams = tN.getLayoutParams();
       LiveGzoneAudienceActivityBannerPresenter tN1 = this.N;
       int i = 0;
       int i1 = (tN1 != null && tN1.a(BannerLocation.RIGHT_TOP_LOCATION))? a1.d(R.dimen.arg_RES_7f0707e8): 0;
       layoutParams.addRule(3, i);
       LiveGzoneAudienceActivityBannerPresenter tu = this.u;
       if (tu != null) {
          layoutParams.topMargin = (int)(tu.getY() + (float)this.u.getHeight()) + i1;
       }
       k1.s(new i(tN), this, 0);
       this.v.getLayoutParams().topMargin = layoutParams.topMargin + a1.e(6.00f);
       this.w.getLayoutParams().topMargin = layoutParams.topMargin;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAudienceActivityBannerPresenter.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a30e6);
       this.r = m1.f(p0, 0x7f0a1dd5);
       return;
    }
    public void e9(int p0,boolean p1){
       LiveGzoneAudienceActivityBannerPresenter liveGzoneAud = LiveGzoneAudienceActivityBannerPresenter.class;
       if (PatchProxy.isSupport(liveGzoneAud) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, liveGzoneAud, "7")) {
          return;
       }
       if (p1) {
          this.I.set(p0);
       }else {
          this.I.clear(p0);
       }
       if (!this.I.cardinality()) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, liveGzoneAud, "25") && (this.U0 != null && this.x != null)) {
             if (!PatchProxy.applyVoid(objArray, this, liveGzoneAud, "26") && this.H == null) {
                this.H = true;
                LiveGzoneAudienceActivityBannerPresenter tU0 = this.U0;
                if (tU0.mMaxDisplayTimes > null) {
                   LiveGzoneAudienceActivityBannerPresenter tq = this.q;
                   if (tq != null) {
                      tU0 = (tq.containsKey(tU0.mBannerId))? this.q.get(this.U0.mBannerId).intValue(): 0;
                      this.q.put(this.U0.mBannerId, Integer.valueOf((tU0 + true)));
                      SharedPreferences$Editor uEditor = a.a.edit();
                      uEditor.putString(b.d("user")+"live_gzone_banner_displayed_times_map", b.e(this.q));
                      g.a(uEditor);
                   }
                }
             }
             this.x.setVisibility(0);
             if (this.S == null) {
                objArray = (this.U0.mEnableEnterUnfold != null)? 2: 1;
                this.R8(objArray);
             }
             this.X8(true);
          }
       }else {
          this.V8();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAudienceActivityBannerPresenter.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAudienceActivityBannerPresenter.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveGzoneAudienceActivityBannerPresenter.class, new u());
       }else {
          obj.put(LiveGzoneAudienceActivityBannerPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceActivityBannerPresenter.class, "1")) {
          return;
       }
       this.J = this.q8(a.class);
       this.K = this.r8("LIVE_CONFIGURATION_SERVICE");
       this.O = this.t8("LIVE_SERVICE_MANAGER");
       this.N = this.t8("LIVE_AUDIENCE_REBROADCAST_BANNER_SERVICE");
       this.L = this.q8(c.class);
       this.M = this.r8("LIVE_PLAYER_CONTROLLER");
       return;
    }
}
