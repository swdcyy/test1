package com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$a;
import nsd.u;
import lq7.c;
import rp7.a;
import jh5.a;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$j;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$i;
import crd.a;
import rm5.a;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$mState$1;
import x19.h;
import msd.l;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$mState$2;
import x19.i;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$mState$3;
import z0.a;
import z1.a;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$mTranslateYToDownRunnable$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$g;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$h;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$d;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$e;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$f;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus$b;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import de5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil;
import tw6.e;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.List;
import qp7.c;
import qp7.b;
import mq7.d;
import x19.m;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm5.f;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import x19.n;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import x19.o;
import com.kwai.feature.api.feed.detail.router.DetailDanmakuParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import jta.c;
import g19.l;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import java.lang.Number;
import p5a.e;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.framework.player.core.b;
import usd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$sendDanmaku$1;
import im5.d;
import qm5.t;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$showEditor$1;
import qm5.p;
import qm5.m;
import java.lang.StringBuilder;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$l;
import erd.a;
import lm5.e;
import qp7.g;
import lq7.d;
import qrd.l1;
import qp7.a;
import w19.d;
import androidx.fragment.app.Fragment;
import jf5.a;
import rq7.a;
import mq7.e;
import qp7.x0;
import km5.i;
import qp7.b1;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils;
import x19.b;
import com.kwai.slide.play.detail.danmaku.content.DanmakuPositionType;
import lq7.a;
import x19.k;
import x19.l;
import x19.c;
import x19.r;
import com.kwai.feature.api.danmaku.c;
import x19.d;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$doInBind$5;
import x19.j;
import x19.e;
import lm5.d;
import x19.f;
import x19.g;
import io.reactivex.internal.functions.Functions;
import qp7.d;
import mq7.a;
import lm5.g;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$b;
import jm5.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$c;
import mm5.a;
import java.lang.Throwable;
import kotlin.Pair;
import qrd.r0;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$k;
import ok.h;
import lnc.b9;

public final class AdDanmakuElement extends DispatchBaseElement	// class@00170a
{
    public PhotoDetailParam A;
    public SlidePlayViewModel B;
    public MilanoContainerEventBus C;
    public t D;
    public float E;
    public float F;
    public PublishSubject G;
    public PublishSubject H;
    public List I;
    public l J;
    public boolean K;
    public e L;
    public final c M;
    public final a N;
    public final a O;
    public a P;
    public b Q;
    public b R;
    public d S;
    public boolean T;
    public boolean U;
    public final AdDanmakuElement$h U0;
    public boolean V;
    public final AdDanmakuElement$d V0;
    public boolean W;
    public final AdDanmakuElement$e W0;
    public boolean X;
    public final AdDanmakuElement$f X0;
    public final p Y;
    public final IMediaPlayer$OnPreparedListener Z;
    public BaseFragment t;
    public Activity u;
    public QPhoto v;
    public a w;
    public c x;
    public r y;
    public x z;
    public static final AdDanmakuElement$a Y0;

    static {
       AdDanmakuElement.Y0 = new AdDanmakuElement$a(null);
    }
    public void AdDanmakuElement(){
       super(c.c, null);
       this.L = new AdDanmakuElement$j(this);
       this.M = new AdDanmakuElement$i(this);
       this.N = new a();
       this.O = new a(new h(new AdDanmakuElement$mState$1(this)), new i(new AdDanmakuElement$mState$2(this)), new i(new AdDanmakuElement$mState$3(this)));
       this.Y = s.c(new AdDanmakuElement$mTranslateYToDownRunnable$2(this));
       this.Z = new AdDanmakuElement$g(this);
       this.U0 = new AdDanmakuElement$h(this);
       this.V0 = new AdDanmakuElement$d(this);
       this.W0 = new AdDanmakuElement$e(this);
       this.X0 = new AdDanmakuElement$f(this);
    }
    public static void F0(AdDanmakuElement p0,boolean p1,MilanoContainerEventBus$b p2,int p3,Object p4){
       p0.E0(p1, null);
    }
    public static final BaseFragment n0(AdDanmakuElement p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public static final QPhoto o0(AdDanmakuElement p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public static final a p0(AdDanmakuElement p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mPlayModule");
       }
       return p0;
    }
    public final boolean A0(){
       AdDanmakuElement uAdDanmakuEl = AdDanmakuElement.class;
       Object[] objArray = null;
       AdDanmakuElement obj = PatchProxy.apply(objArray, this, uAdDanmakuEl, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       if (obj == null) {
          a.S("mPhoto");
       }
       boolean b = false;
       if (!DanmakuSwitchUtil.b(obj)) {
          return b;
       }else {
          this.U = b;
          obj = this.B;
          if (obj == null) {
             a.S("mSlidePlayViewModel");
          }
          obj.c0(this.U0);
          obj = this.I;
          if (obj != null) {
             obj.add(this.L);
          }
          boolean b1 = true;
          if (!PatchProxy.applyVoid(objArray, this, uAdDanmakuEl, "12")) {
             this.y0("subscribeEvent", "enter");
             this.N.c(this.A().a(new m(this)));
             this.N.c(RxBus.f.k(f.class, b1).observeOn(a.c()).subscribe(new n(this)));
             uAdDanmakuEl = this.N;
             obj = this.C;
             if (obj == null) {
                a.S("mMilanoEventBus");
             }
             uAdDanmakuEl.c(obj.t.subscribe(new o(this)));
          }
          uAdDanmakuEl = this.A;
          if (uAdDanmakuEl == null) {
             a.S("mDetailParam");
          }
          if (uAdDanmakuEl.getDetailDanmakuParam().forceOpenDanmaku != null) {
             DanmakuSwitchUtils.h.a(b1);
          }
          uAdDanmakuEl = this.J;
          if (uAdDanmakuEl != null) {
             uAdDanmakuEl.a(this.M);
          }
          this.C0();
          return DanmakuSwitchUtils.h.d();
       }
    }
    public String B(){
       return "AdDanmakuElement";
    }
    public final void B0(){
       if (PatchProxy.applyVoid(null, this, AdDanmakuElement.class, "16")) {
          return;
       }
       a uoa = a.d();
       AdDanmakuElement tv = this.v;
       if (tv == null) {
          a.S("mPhoto");
       }
       uoa.k(new PlayEvent(tv, PlayEvent$Status.RESUME, 1, "AdDanmakuElement"));
       return;
    }
    public final void C0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdDanmakuElement.class, "9")) {
          return;
       }
       AdDanmakuElement tA = this.A;
       if (tA == null) {
          a.S("mDetailParam");
       }
       if (tA.getDetailDanmakuParam().forceDanmakuId != null) {
          tA = this.A;
          if (tA == null) {
             a.S("mDetailParam");
          }
          DetailDanmakuParam forceDanmaku = tA.getDetailDanmakuParam().forceDanmakuPosition;
          if (forceDanmaku != null) {
             long l = forceDanmaku.longValue();
             tA = this.w;
             String str = "mPlayModule";
             if (tA == null) {
                a.S(str);
             }
             tA.getPlayer().removeOnPreparedListener(this.Z);
             tA = this.w;
             if (tA == null) {
                a.S(str);
             }
             e player = tA.getPlayer();
             a.o(player, "mPlayModule.player");
             if (player.isPrepared()) {
                tA = this.w;
                if (tA == null) {
                   a.S(str);
                }
                tA.getPlayer().seekTo(q.o((l - (long)1000), 0));
                tA = this.A;
                if (tA == null) {
                   a.S("mDetailParam");
                }
                tA.getDetailDanmakuParam().forceDanmakuId = objArray;
                tA = this.A;
                if (tA == null) {
                   a.S("mDetailParam");
                }
                tA.getDetailDanmakuParam().forceDanmakuPosition = objArray;
             }else {
                tA = this.w;
                if (tA == null) {
                   a.S(str);
                }
                tA.getPlayer().addOnPreparedListener(this.Z);
             }
          }
       }
       return;
    }
    public final void D0(CharSequence p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdDanmakuElement.class, "19")) {
          return;
       }
       if (this.T == null || (!TextUtils.x(p0) && !this.r0(true, new AdDanmakuElement$sendDanmaku$1(this, p0, p1)))) {
          AdDanmakuElement tS = this.S;
          if (tS != null && !tS.isRunning()) {
             this.q0();
          }
          if (p0 != null) {
             String str = p0.toString();
             if (str != null) {
                tS = this.S;
                if (tS != null) {
                   t ot = tS.E();
                   if (ot != null) {
                      ot.f(str, p1);
                   }
                }
             }
          }
       }
    label_0044 :
       return;
    }
    public final void E0(boolean p0,MilanoContainerEventBus$b p1){
       AdDanmakuElement uAdDanmakuEl = AdDanmakuElement.class;
       if (PatchProxy.isSupport(uAdDanmakuEl) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uAdDanmakuEl, "18")) {
          return;
       }
       if (this.T != null) {
          boolean b = true;
          if (!this.r0(b, new AdDanmakuElement$showEditor$1(this, p0, p1))) {
             uAdDanmakuEl = this.S;
             if (uAdDanmakuEl != null && !uAdDanmakuEl.isRunning()) {
                this.q0();
             }
             MilanoContainerEventBus$b a = (p1 != null)? p1.a: null;
             if (a != null) {
                uAdDanmakuEl = this.S;
                if (uAdDanmakuEl != null) {
                   p op = uAdDanmakuEl.a(p.class);
                   if (op != null) {
                      MilanoContainerEventBus$b a1 = p1.a;
                      a.o(a1, "defaultTextModel.mText");
                      op.x0(a1, p1.b);
                   }
                }
             }
             AdDanmakuElement tS = this.S;
             if (tS != null) {
                t ot = tS.E();
                if (ot != null) {
                   ot.C((DanmakuSwitchUtils.h.d() ^ b), p0, false);
                }
             }
          }
       }
       return;
    }
    public final void G0(boolean p0){
       AdDanmakuElement tu1;
       AdDanmakuElement uAdDanmakuEl = AdDanmakuElement.class;
       if (PatchProxy.isSupport(uAdDanmakuEl) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAdDanmakuEl, "13")) {
          return;
       }
       StringBuilder str = "enter. mIsAttach: "+this.T+", manual: "+p0+"£¬ ActivityContext"+".getInstance\(\).currentActivity == mActivity£º ";
       ActivityContext uActivityCon = ActivityContext.g();
       String str1 = "ActivityContext.getInstance\(\)";
       a.o(uActivityCon, str1);
       Activity uActivity = uActivityCon.e();
       AdDanmakuElement tu = this.u;
       String str2 = "mActivity";
       if (tu == null) {
          a.S(str2);
       }
       this.y0("updateVisible", str+a.g(uActivity, tu));
       if (this.T != null) {
          ActivityContext uActivityCon1 = ActivityContext.g();
          a.o(uActivityCon1, str1);
          Activity uActivity1 = uActivityCon1.e();
          tu1 = this.u;
          if (tu1 == null) {
             a.S(str2);
          }
          if (a.g(uActivity1, tu1) && this.v0(this.S, new AdDanmakuElement$l(this, p0))) {
             return;
          }else if(this.S == null){
             return;
          }
       }
       boolean b = true;
       if (p0 && this.T != null) {
          this.y0("updateVisible", "post DanmakuSwitchSuccessfulEvent\(true\)");
          RxBus.f.b(new e(b));
       }
       this.z0(p0);
       tu1 = this.A;
       if (tu1 == null) {
          a.S("mDetailParam");
       }
       tu = this.W;
       tu1.showDanmkuSwitch = tu ^ 0x01;
       if (tu == null && DanmakuSwitchUtils.h.d()) {
          if (p0) {
             this.U = p0;
          }
          this.y0("updateVisible", "tryShow");
          this.c0();
          this.D().d(b);
          this.q0();
       }else {
          this.y0("updateVisible", "tryHide");
          this.b0();
          b = false;
          this.D().d(b);
          this.s0(b);
       }
       AdDanmakuElement tP = this.P;
       this.P = null;
       if (tP != null) {
          tP.invoke();
       }
       return;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDanmakuElement.class, "4")) {
       }else {
          a.p(p0, "callerContext");
          this.J = p0.q;
          this.I = p0.r;
          d b = p0.b;
          a.o(b, "callerContext.mFragment");
          this.t = b;
          b = p0.a;
          a.o(b, "callerContext.mActivity");
          this.u = b;
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.v = mPhoto;
          b = p0.f;
          a.o(b, "callerContext.mPlayModule");
          this.w = b;
          this.x = p0.s;
          b = p0.i;
          a.o(b, "callerContext.mLogger");
          this.z = b;
          b = p0.c;
          a.o(b, "callerContext.mPhotoDetailParam");
          this.A = b;
          AdDanmakuElement tt = this.t;
          if (tt == null) {
             a.S("mFragment");
          }
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tt.getParentFragment());
          a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment.parentFragment\)");
          this.B = slidePlayVie;
          a x = p0.d.X;
          a.o(x, "callerContext.mPhotoDeta¡­.mMilanoContainerEventBus");
          this.C = x;
          b = p0.t;
          a.o(b, "callerContext.mChangeCom¡­tFragmentVisiblePublisher");
          this.D = b;
          b = p0.u;
          a.o(b, "callerContext.mAdPrivacyHeightChangePublisher");
          this.G = b;
          d v = p0.v;
          a.o(v, "callerContext.mAdDisclaimerHeightChangePublisher");
          this.H = v;
       }
       return;
    }
    public a f0(a p0){
       e uoe = PatchProxy.applyOneRefs(p0, this, AdDanmakuElement.class, "27");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(p0);
       }
       return uoe;
    }
    public void j0(boolean p0){
       b uob;
       AdDanmakuElement uAdDanmakuEl = AdDanmakuElement.class;
       if (PatchProxy.isSupport(uAdDanmakuEl) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAdDanmakuEl, "5")) {
          return;
       }
       this.E = 0;
       this.F = 0;
       this.E().i(0);
       AdDanmakuElement tA = this.A;
       String str = "mDetailParam";
       if (tA == null) {
          a.S(str);
       }
       tA.showDanmkuSwitch = true;
       tA = this.A;
       if (tA == null) {
          a.S(str);
       }
       int i = 0;
       AdDanmakuElement obj = null;
       if (!i.f(tA, i, 2, obj)) {
          this.i(this.W0);
          this.b0();
          this.D().d(i);
          this.y0("onBind", "tryHide, because of \'isSupportDanmakuOfPhoto\' is false");
          return;
       }else if(PatchProxy.applyVoid(obj, this, uAdDanmakuEl, "7")){
          if (this.x0()) {
             this.z0(i);
          }else if(DanmakuExperimentUtils.U.Q()){
             uob = RxBus.f.f(f.class).observeOn(a.c()).subscribe(new b(this));
             a.o(uob, "RxBus.INSTANCE\n         ¡­            }\n          }");
             this.j(uob);
          }
          if (!PatchProxy.applyVoid(obj, this, uAdDanmakuEl, "8")) {
             this.E().h(DanmakuPositionType.NORMAL);
             int i1 = 17;
             uAdDanmakuEl = this.G;
             if (uAdDanmakuEl == null) {
                a.S("mAdPrivacyHeightChangePublisher");
             }
             b uob1 = uAdDanmakuEl.subscribe(new k(this, i1));
             a.o(uob1, "mAdPrivacyHeightChangePu¡­cyHeightDp\)\n      }\n    }");
             this.j(uob1);
             uAdDanmakuEl = this.H;
             if (uAdDanmakuEl == null) {
                a.S("mAdDisclaimerHeightChangePublisher");
             }
             uob = uAdDanmakuEl.subscribe(new l(this, i1));
             a.o(uob, "mAdDisclaimerHeightChang¡­erHeightDp\)\n      }\n    }");
             this.j(uob);
          }
          this.j(this.D().i(new c(this)));
          AdDanmakuElement tx = this.x;
          if (tx != null) {
             AdDanmakuElement tt = this.t;
             if (tt == null) {
                a.S("mFragment");
             }
             obj = this.v;
             if (obj == null) {
                a.S("mPhoto");
             }
             AdDanmakuElement tw = this.w;
             if (tw == null) {
                a.S("mPlayModule");
             }
             uAdDanmakuEl = this.A;
             if (uAdDanmakuEl == null) {
                a.S(str);
             }
             PhotoDetailParam mDetailDanma = uAdDanmakuEl.mDetailDanmakuParam;
             a.o(mDetailDanma, "mDetailParam.mDetailDanmakuParam");
             r or = new r(tt, obj, tw, tx, mDetailDanma);
             this.y = this.D().i(new c(this));
          }
          this.i(this.V0);
          this.j(this.A().a(new d(this)));
          this.j(this.D().l(new j(new AdDanmakuElement$doInBind$5(this))));
          tA = this.D;
          if (tA == null) {
             a.S("mCommentVisibleObservable");
          }
          uob = tA.subscribe(new e(this));
          a.o(uob, "mCommentVisibleObservabl¡­IsCommentPanelShow = it }");
          this.j(uob);
          uob = RxBus.f.f(d.class).observeOn(a.c()).subscribe(new f(this));
          a.o(uob, "RxBus.INSTANCE\n        .¡­e { updateVisible\(true\) }");
          this.j(uob);
          g e = Functions.e;
          a.o(e, "Functions.ERROR_CONSUMER");
          this.j(this.D().k(new g(this), e));
       }
       return;
    }
    public void l0(boolean p0){
       AdDanmakuElement uAdDanmakuEl = AdDanmakuElement.class;
       if (PatchProxy.isSupport(uAdDanmakuEl) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAdDanmakuEl, "26")) {
          return;
       }
       AdDanmakuElement ty = this.y;
       if (ty != null && !PatchProxy.applyVoid(null, ty, r.class, "2")) {
          ty.e.g();
       }
       return;
    }
    public d q(){
       a uoa = PatchProxy.apply(null, this, AdDanmakuElement.class, "28");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public final void q0(){
       if (PatchProxy.applyVoid(null, this, AdDanmakuElement.class, "20")) {
          return;
       }
       if (this.T == null) {
          return;
       }
       this.y0("attach", "enter");
       AdDanmakuElement tS = this.S;
       if (tS != null) {
          tS.h();
       }
       tS = this.B;
       if (tS == null) {
          a.S("mSlidePlayViewModel");
       }
       if (!tS.b1() - null) {
          this.O.b(1, 1, 1);
       }else {
          this.O.b(1, false, 1);
       }
       RxBus.f.b(new g());
       return;
    }
    public c r(){
       d uod = PatchProxy.apply(null, this, AdDanmakuElement.class, "29");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d();
       }
       return uod;
    }
    public final boolean r0(boolean p0,a p1){
       AdDanmakuElement uAdDanmakuEl = AdDanmakuElement.class;
       if (PatchProxy.isSupport(uAdDanmakuEl)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, uAdDanmakuEl, "17");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.v0(this.S, new AdDanmakuElement$b(this, p0, p1));
    }
    public final void s0(boolean p0){
       AdDanmakuElement uAdDanmakuEl = AdDanmakuElement.class;
       if (PatchProxy.isSupport(uAdDanmakuEl) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAdDanmakuEl, "24")) {
          return;
       }
       this.y0("detach", "release: "+p0);
       a.c(this.O, 1, false, false, 4, null);
       if (p0) {
          AdDanmakuElement tS = this.S;
          if (tS != null) {
             tS.release();
          }
       }
       return;
    }
    public final void t0(d p0,boolean p1){
       AdDanmakuElement uAdDanmakuEl = AdDanmakuElement.class;
       if (PatchProxy.isSupport(uAdDanmakuEl) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uAdDanmakuEl, "11")) {
          return;
       }
       this.y0("execute", "enter");
       p0.m(this.X0);
       this.S = p0;
       this.G0(p1);
       return;
    }
    public final Runnable u0(){
       Object obj = PatchProxy.apply(null, this, AdDanmakuElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Y.getValue();
    }
    public final boolean v0(Object p0,a p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AdDanmakuElement.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          b = false;
       }else {
          p1.run();
          b = true;
       }
       return b;
    }
    public final void w0(boolean p0){
       l1 a;
       AdDanmakuElement uAdDanmakuEl = AdDanmakuElement.class;
       if (PatchProxy.isSupport(uAdDanmakuEl) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAdDanmakuEl, "10")) {
          return;
       }
       uAdDanmakuEl = this.x;
       if (uAdDanmakuEl != null) {
          this.y0("initKit", "enter");
          d uod = uAdDanmakuEl.a();
          if (uod != null) {
             a.o(uod, "it");
             this.t0(uod, p0);
             a = l1.a;
          }else {
             uod = null;
          }
          this.v0(uod, new AdDanmakuElement$c(this, uAdDanmakuEl, p0));
       }
       return;
    }
    public final boolean x0(){
       Object obj = PatchProxy.apply(null, this, AdDanmakuElement.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return DanmakuExperimentUtils.U.n();
    }
    public final void y0(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdDanmakuElement.class, "30")) {
          return;
       }
       a a = a.a;
       AdDanmakuElement tv = this.v;
       if (tv == null) {
          a.S("mPhoto");
       }
       a.i(a, "AdDanmakuElement", p1, tv, null, p0, null, 40, null);
       return;
    }
    public final void z0(boolean p0){
       AdDanmakuElement uAdDanmakuEl = AdDanmakuElement.class;
       if (PatchProxy.isSupport(uAdDanmakuEl) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAdDanmakuEl, "14")) {
          return;
       }
       String str = "notifyDanmakuInputVisible";
       if (this.W != null) {
          this.y0(str, "hide because of mDisableShow: "+this.W+'.');
          this.D().c(r0.a(Boolean.FALSE, Boolean.valueOf(p0)));
          return;
       }else if(this.X != null){
          this.y0(str, "hide immediately");
          this.D().c(r0.a(Boolean.FALSE, Boolean.valueOf(p0)));
       }
       this.R = b9.c(this.R, new AdDanmakuElement$k(this, p0));
       return;
    }
}
