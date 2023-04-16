package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$a;
import nsd.u;
import jh5.a;
import lq7.c;
import rp7.a;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$j;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$i;
import crd.a;
import rm5.a;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$mState$1;
import sx9.j;
import msd.l;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$mState$2;
import sx9.k;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$mState$3;
import z0.a;
import z1.a;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$mTranslateYToDownRunnable$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$g;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$h;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$mLifecycleObserver$1;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$d;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$e;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$f;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus$b;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import de5.a;
import brd.y;
import zm5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.StringBuilder;
import qp7.g;
import qp7.b;
import lq7.d;
import kotlin.Pair;
import qrd.r0;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$k;
import crd.b;
import ok.h;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil;
import tw6.e;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.List;
import qp7.c;
import mq7.d;
import sx9.m;
import erd.g;
import sx9.n;
import brd.t;
import com.yxcorp.gifshow.util.rx.RxBus;
import bz9.b;
import brd.z;
import io.reactivex.android.schedulers.a;
import sx9.o;
import nn6.b;
import sx9.p;
import lm5.f;
import sx9.q;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import sx9.r;
import com.kwai.feature.api.feed.detail.router.DetailDanmakuParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import jta.c;
import r7a.f;
import im5.d;
import qm5.n;
import com.kwai.feature.api.danmaku.model.DanmakuSettingAnchorViewType;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import java.lang.Number;
import p5a.e;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.framework.player.core.b;
import usd.q;
import java.lang.Integer;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$l;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$sendDanmaku$1;
import qm5.t;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$showEditor$1;
import qm5.p;
import qm5.m;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$m;
import erd.a;
import qrd.l1;
import lm5.e;
import f6a.a;
import qp7.a;
import v6a.m0;
import jf5.a;
import le5.a;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import androidx.fragment.app.Fragment;
import uw9.l0;
import m3a.d;
import rq7.a;
import mq7.e;
import km5.i;
import qp7.b1;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils;
import sx9.e;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.feature.api.danmaku.model.DanmakuInfo;
import nm5.e;
import nm5.m;
import qp7.x0;
import com.kwai.slide.play.detail.danmaku.content.DanmakuPositionType;
import lq7.a;
import sx9.f;
import jf5.l;
import sx9.s;
import com.kwai.feature.api.danmaku.c;
import sx9.g;
import sx9.h;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$doInBind$7;
import sx9.l;
import sx9.i;
import sx9.b;
import lm5.d;
import sx9.c;
import sx9.d;
import io.reactivex.internal.functions.Functions;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import qp7.d;
import mq7.a;
import pm5.b;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$createDanmakuLaunchParams$1;
import lm5.g;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$b;
import jm5.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$c;
import mm5.a;
import java.lang.Throwable;

public final class DanmakuElement extends DispatchBaseElement	// class@0013ef
{
    public x A;
    public PhotoDetailParam B;
    public SlidePlayViewModel C;
    public a D;
    public MilanoContainerEventBus E;
    public t F;
    public y G;
    public t H;
    public y I;
    public t J;
    public t K;
    public y L;
    public b M;
    public f N;
    public List O;
    public f P;
    public boolean Q;
    public boolean R;
    public l S;
    public e T;
    public final c U;
    public d U0;
    public final a V;
    public boolean V0;
    public final a W;
    public boolean W0;
    public a X;
    public boolean X0;
    public b Y;
    public boolean Y0;
    public b Z;
    public boolean Z0;
    public final p a1;
    public final IMediaPlayer$OnPreparedListener b1;
    public final DanmakuElement$h c1;
    public final DanmakuElement$mLifecycleObserver$1 d1;
    public final DanmakuElement$d e1;
    public final DanmakuElement$e f1;
    public final DanmakuElement$f g1;
    public BaseFragment t;
    public Activity u;
    public QPhoto v;
    public a w;
    public c x;
    public s y;
    public d z;
    public static final DanmakuElement$a h1;

    static {
       DanmakuElement.h1 = new DanmakuElement$a(null);
    }
    public void DanmakuElement(){
       super(null);
    }
    public void DanmakuElement(a p0){
       super(c.c, p0);
       this.R = true;
       this.T = new DanmakuElement$j(this);
       this.U = new DanmakuElement$i(this);
       this.V = new a();
       this.W = new a(new j(new DanmakuElement$mState$1(this)), new k(new DanmakuElement$mState$2(this)), new k(new DanmakuElement$mState$3(this)));
       this.a1 = s.c(new DanmakuElement$mTranslateYToDownRunnable$2(this));
       this.b1 = new DanmakuElement$g(this);
       this.c1 = new DanmakuElement$h(this);
       this.d1 = new DanmakuElement$mLifecycleObserver$1(this);
       this.e1 = new DanmakuElement$d(this);
       this.f1 = new DanmakuElement$e(this);
       this.g1 = new DanmakuElement$f(this);
    }
    public static void H0(DanmakuElement p0,boolean p1,MilanoContainerEventBus$b p2,int p3,Object p4){
       p0.G0(p1, null);
    }
    public static void J0(DanmakuElement p0,boolean p1,a p2,int p3,Object p4){
       p0.I0(p1, null);
    }
    public static final BaseFragment n0(DanmakuElement p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public static final QPhoto o0(DanmakuElement p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public static final a p0(DanmakuElement p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mPlayModule");
       }
       return p0;
    }
    public static final y q0(DanmakuElement p0){
       p0 = p0.G;
       if (p0 == null) {
          a.S("mPlayPauseObserver");
       }
       return p0;
    }
    public static final a r0(DanmakuElement p0){
       p0 = p0.D;
       if (p0 == null) {
          a.S("mSlidePlaySceneRecord");
       }
       return p0;
    }
    public final void A0(boolean p0){
       DanmakuElement uDanmakuElem = DanmakuElement.class;
       if (PatchProxy.isSupport(uDanmakuElem) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDanmakuElem, "15")) {
          return;
       }
       String str = "notifyDanmakuInputVisible";
       if (this.Y0 != null) {
          this.z0(str, "hide because of mDisableShow: "+this.Y0+'.');
          this.D().c(r0.a(Boolean.FALSE, Boolean.valueOf(p0)));
          return;
       }else if(this.Z0 != null){
          this.z0(str, "hide immediately");
          this.D().c(r0.a(Boolean.FALSE, Boolean.valueOf(p0)));
       }
       this.Z = b9.c(this.Z, new DanmakuElement$k(this, p0));
       return;
    }
    public String B(){
       return "DanmakuElement";
    }
    public final boolean B0(){
       DanmakuElement uDanmakuElem = DanmakuElement.class;
       Object[] objArray = null;
       DanmakuElement obj = PatchProxy.apply(objArray, this, uDanmakuElem, "2");
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
          this.W0 = b;
          obj = this.C;
          if (obj == null) {
             a.S("mSlidePlayViewModel");
          }
          obj.c0(this.c1);
          obj = this.O;
          if (obj != null) {
             obj.add(this.T);
          }
          boolean b1 = true;
          if (!PatchProxy.applyVoid(objArray, this, uDanmakuElem, "12")) {
             this.z0("subscribeEvent", "enter");
             this.V.c(this.A().a(new m(this)));
             uDanmakuElem = this.V;
             obj = this.H;
             if (obj == null) {
                a.S("mNoAudioSingleImgPlayObservable");
             }
             uDanmakuElem.c(obj.subscribe(new n(this)));
             RxBus f = RxBus.f;
             this.V.c(f.f(b.class).observeOn(a.c()).subscribe(new o(this)));
             this.V.c(f.f(b.class).subscribe(new p(this)));
             this.V.c(f.k(f.class, b1).observeOn(a.c()).subscribe(new q(this)));
             uDanmakuElem = this.V;
             obj = this.E;
             if (obj == null) {
                a.S("mMilanoEventBus");
             }
             uDanmakuElem.c(obj.t.subscribe(new r(this)));
          }
          uDanmakuElem = this.B;
          if (uDanmakuElem == null) {
             a.S("mDetailParam");
          }
          if (uDanmakuElem.getDetailDanmakuParam().forceOpenDanmaku != null) {
             DanmakuSwitchUtils.h.a(b1);
          }
          uDanmakuElem = this.P;
          if (uDanmakuElem != null) {
             uDanmakuElem.a(this.U);
          }
          this.E0();
          return DanmakuSwitchUtils.h.d();
       }
    }
    public final void C0(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuElement.class, "13")) {
          return;
       }
       this.X = null;
       DanmakuElement tU0 = this.U0;
       if (tU0 != null && !tU0.isRunning()) {
          this.s0();
       }
       tU0 = this.U0;
       if (tU0 != null) {
          n on = tU0.n();
          if (on != null) {
             on.O(p0.a, p0.b);
          }
       }
       return;
    }
    public final void D0(){
       if (PatchProxy.applyVoid(null, this, DanmakuElement.class, "17")) {
          return;
       }
       a uoa = a.d();
       DanmakuElement tv = this.v;
       if (tv == null) {
          a.S("mPhoto");
       }
       uoa.k(new PlayEvent(tv, PlayEvent$Status.RESUME, 1, "DanmakuElement"));
       return;
    }
    public final void E0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DanmakuElement.class, "9")) {
          return;
       }
       DanmakuElement tB = this.B;
       if (tB == null) {
          a.S("mDetailParam");
       }
       if (tB.getDetailDanmakuParam().forceDanmakuId != null) {
          tB = this.B;
          if (tB == null) {
             a.S("mDetailParam");
          }
          DetailDanmakuParam forceDanmaku = tB.getDetailDanmakuParam().forceDanmakuPosition;
          if (forceDanmaku != null) {
             long l = forceDanmaku.longValue();
             tB = this.w;
             String str = "mPlayModule";
             if (tB == null) {
                a.S(str);
             }
             tB.getPlayer().removeOnPreparedListener(this.b1);
             tB = this.w;
             if (tB == null) {
                a.S(str);
             }
             e player = tB.getPlayer();
             a.o(player, "mPlayModule.player");
             if (player.isPrepared()) {
                tB = this.w;
                if (tB == null) {
                   a.S(str);
                }
                tB.getPlayer().seekTo(q.o((l - (long)1000), 0));
                tB = this.B;
                if (tB == null) {
                   a.S("mDetailParam");
                }
                tB.getDetailDanmakuParam().forceDanmakuId = objArray;
                tB = this.B;
                if (tB == null) {
                   a.S("mDetailParam");
                }
                tB.getDetailDanmakuParam().forceDanmakuPosition = objArray;
                tB = this.L;
                if (tB != null) {
                   tB.onNext(Boolean.TRUE);
                }
                this.M = t.just(Integer.valueOf(1)).delay(3, TimeUnit.SECONDS).subscribe(new DanmakuElement$l(this));
             }else {
                tB = this.w;
                if (tB == null) {
                   a.S(str);
                }
                tB.getPlayer().addOnPreparedListener(this.b1);
             }
          }
       }
       return;
    }
    public final void F0(CharSequence p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DanmakuElement.class, "20")) {
          return;
       }
       if (this.V0 == null || (!TextUtils.x(p0) && !this.t0(true, new DanmakuElement$sendDanmaku$1(this, p0, p1)))) {
          DanmakuElement tU0 = this.U0;
          if (tU0 != null && !tU0.isRunning()) {
             this.s0();
          }
          if (p0 != null) {
             String str = p0.toString();
             if (str != null) {
                tU0 = this.U0;
                if (tU0 != null) {
                   t ot = tU0.E();
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
    public final void G0(boolean p0,MilanoContainerEventBus$b p1){
       DanmakuElement uDanmakuElem = DanmakuElement.class;
       if (PatchProxy.isSupport(uDanmakuElem) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uDanmakuElem, "19")) {
          return;
       }
       if (this.V0 != null) {
          boolean b = true;
          if (!this.t0(b, new DanmakuElement$showEditor$1(this, p0, p1))) {
             uDanmakuElem = this.U0;
             if (uDanmakuElem != null && !uDanmakuElem.isRunning()) {
                this.s0();
             }
             MilanoContainerEventBus$b a = (p1 != null)? p1.a: null;
             if (a != null) {
                uDanmakuElem = this.U0;
                if (uDanmakuElem != null) {
                   p op = uDanmakuElem.a(p.class);
                   if (op != null) {
                      MilanoContainerEventBus$b a1 = p1.a;
                      a.o(a1, "defaultTextModel.mText");
                      op.x0(a1, p1.b);
                   }
                }
             }
             DanmakuElement tU0 = this.U0;
             if (tU0 != null) {
                t ot = tU0.E();
                if (ot != null) {
                   ot.C((DanmakuSwitchUtils.h.d() ^ b), p0, false);
                }
             }
          }
       }
       return;
    }
    public final void I0(boolean p0,a p1){
       DanmakuElement tI;
       DanmakuElement uDanmakuElem = DanmakuElement.class;
       if (PatchProxy.isSupport(uDanmakuElem) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uDanmakuElem, "14")) {
          return;
       }
       StringBuilder str = "enter. mIsAttach: "+this.V0+", manual: "+p0+"£¬ ActivityContext"+".getInstance\(\).currentActivity == mActivity£º ";
       ActivityContext uActivityCon = ActivityContext.g();
       String str1 = "ActivityContext.getInstance\(\)";
       a.o(uActivityCon, str1);
       Activity uActivity = uActivityCon.e();
       DanmakuElement tu = this.u;
       String str2 = "mActivity";
       if (tu == null) {
          a.S(str2);
       }
       String str3 = "updateVisible";
       this.z0(str3, str+a.g(uActivity, tu));
       this.z = null;
       if (this.V0 != null) {
          ActivityContext uActivityCon1 = ActivityContext.g();
          a.o(uActivityCon1, str1);
          Activity uActivity1 = uActivityCon1.e();
          tu = this.u;
          if (tu == null) {
             a.S(str2);
          }
          if (a.g(uActivity1, tu) && this.x0(this.U0, new DanmakuElement$m(this, p0))) {
             return;
          }else if(this.U0 == null){
             if (p1 != null) {
                p1.invoke();
             }
             return;
          }
       }
       boolean b = true;
       if (p0 && this.V0 != null) {
          this.z0(str3, "post DanmakuSwitchSuccessfulEvent\(true\)");
          RxBus.f.b(new e(b));
       }
       this.A0(p0);
       DanmakuElement tB = this.B;
       if (tB == null) {
          a.S("mDetailParam");
       }
       DanmakuElement tY0 = this.Y0;
       tB.showDanmkuSwitch = tY0 ^ 0x01;
       str1 = "mShowDanmakuList";
       if (tY0 == null && DanmakuSwitchUtils.h.d()) {
          if (p0) {
             this.W0 = p0;
          }
          this.z0(str3, "tryShow");
          this.c0();
          this.D().d(b);
          this.s0();
          tI = this.I;
          if (tI == null) {
             a.S(str1);
          }
          b = a.a;
          DanmakuElement tv = this.v;
          if (tv == null) {
             a.S("mPhoto");
          }
          tB = this.B;
          if (tB == null) {
             a.S("mDetailParam");
          }
          tI.onNext(Boolean.valueOf(b.a(tv, tB)));
       }else {
          this.z0(str3, "tryHide");
          this.b0();
          b = false;
          this.D().d(b);
          this.u0(b);
          tI = this.I;
          if (tI == null) {
             a.S(str1);
          }
          tI.onNext(Boolean.FALSE);
       }
       tI = this.X;
       this.X = null;
       if (tI != null) {
          tI.invoke();
       }
       return;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, DanmakuElement.class, "4")) {
       }else {
          a.p(p0, "callerContext");
          this.S = p0.v.W;
          this.P = p0.H;
          this.N = p0.Q;
          this.O = p0.A;
          a b = p0.b;
          a.o(b, "callerContext.mFragment");
          this.t = b;
          b = p0.a;
          a.o(b, "callerContext.mActivity");
          this.u = b;
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.v = mPhoto;
          m0 j = p0.j;
          a.o(j, "callerContext.mPlayModule");
          this.w = j;
          this.x = p0.J;
          this.K = this.H().R1;
          j = p0.p;
          a.o(j, "callerContext.mLogger");
          this.A = j;
          b = p0.c;
          a.o(b, "callerContext.mPhotoDetailParam");
          this.B = b;
          DanmakuElement tt = this.t;
          if (tt == null) {
             a.S("mFragment");
          }
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tt.getParentFragment());
          a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment.parentFragment\)");
          this.C = slidePlayVie;
          l0 r2 = p0.v.r2;
          a.o(r2, "callerContext.mPhotoDeta¡­etailSlidePlaySceneRecord");
          this.D = r2;
          b = p0.v.X;
          a.o(b, "callerContext.mPhotoDeta¡­.mMilanoContainerEventBus");
          this.E = b;
          j = p0.G;
          a.o(j, "callerContext.mChangeCom¡­tFragmentVisiblePublisher");
          this.F = j;
          j = p0.M;
          a.o(j, "callerContext.mPlayPauseObserver");
          this.G = j;
          j = p0.f0;
          a.o(j, "callerContext.mNoAudioSingleImgPlayObservable");
          this.H = j;
          j = p0.K;
          a.o(j, "callerContext.mIsCommentPanelShowDanmakuList");
          this.I = j;
          r2 = p0.v.E2;
          t ot = (r2 != null)? r2.a(): null;
          this.J = ot;
          this.L = p0.v.i2;
          PatchProxy.onMethodExit(DanmakuElement.class, "4");
       }
       return;
    }
    public a f0(a p0){
       e uoe = PatchProxy.applyOneRefs(p0, this, DanmakuElement.class, "29");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(p0);
       }
       return uoe;
    }
    public void j0(boolean p0){
       DanmakuElement tS;
       b uob;
       DanmakuElement uDanmakuElem = DanmakuElement.class;
       if (PatchProxy.isSupport(uDanmakuElem) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDanmakuElem, "6")) {
          return;
       }
       DanmakuElement tB = this.B;
       String str = "mDetailParam";
       if (tB == null) {
          a.S(str);
       }
       boolean b = true;
       tB.showDanmkuSwitch = b;
       tB = this.B;
       if (tB == null) {
          a.S(str);
       }
       int i = 0;
       Integer integer = null;
       if (!i.f(tB, i, 2, integer)) {
          this.i(this.f1);
          this.b0();
          this.D().d(i);
          this.z0("onBind", "tryHide, because of \'isSupportDanmakuOfPhoto\' is false");
          return;
       }else if(PatchProxy.applyVoid(integer, this, uDanmakuElem, "7")){
          if (this.H().b0()) {
             this.A0(i);
          }else if(DanmakuExperimentUtils.U.Q()){
             b uob1 = RxBus.f.f(f.class).observeOn(a.c()).subscribe(new e(this));
             a.o(uob1, "RxBus.INSTANCE\n        .¡­se\)\n          }\n        }");
             this.j(uob1);
          }
          String str1 = "mPhoto";
          if (!PatchProxy.applyVoid(integer, this, uDanmakuElem, "8")) {
             tB = this.v;
             if (tB == null) {
                a.S(str1);
             }
             int i1 = TextUtils.x(tB.getDisclaimerMessage()) ^ b;
             tS = this.v;
             if (tS == null) {
                a.S(str1);
             }
             CommonMeta commonMeta = tS.getCommonMeta();
             DanmakuInfo uDanmakuInfo = (commonMeta != null)? e.a(commonMeta): integer;
             if (m.e(uDanmakuInfo)) {
                this.E().h(DanmakuPositionType.WISH);
             }else if(this.H().l0()){
                if (i1) {
                   this.E().h(DanmakuPositionType.TRENDING_DISCLAIMER);
                }else {
                   tB = this.v;
                   if (tB == null) {
                      a.S(str1);
                   }
                   if (tB.isHdr()) {
                      this.E().h(DanmakuPositionType.TRENDING_HDR);
                   }else {
                      this.E().h(DanmakuPositionType.TRENDING_NORMAL);
                   }
                }
             }else if(i1){
                this.E().h(DanmakuPositionType.DISCLAIMER);
             }else {
                tB = this.v;
                if (tB == null) {
                   a.S(str1);
                }
                if (tB.isHdr()) {
                   this.E().h(DanmakuPositionType.HDR);
                }else {
                   this.E().h(DanmakuPositionType.NORMAL);
                }
             }
          }
          this.j(this.D().i(new f(this)));
          DanmakuElement tx = this.x;
          String str2 = "mFragment";
          if (tx != null) {
             tS = this.S;
             if (tS == null || (tS.b != null || !this.H().a0())) {
                b = false;
             }
             StringBuilder str3 = "isLaunchVideo: "+b+"  index£º";
             DanmakuElement tS1 = this.S;
             if (tS1 != null) {
                integer = Integer.valueOf(tS1.b);
             }
             this.z0("doInBind", str3+integer);
             DanmakuElement tt = this.t;
             if (tt == null) {
                a.S(str2);
             }
             DanmakuElement tv = this.v;
             if (tv == null) {
                a.S(str1);
             }
             DanmakuElement tw = this.w;
             if (tw == null) {
                a.S("mPlayModule");
             }
             boolean b1 = this.H().a0();
             uDanmakuElem = this.B;
             if (uDanmakuElem == null) {
                a.S(str);
             }
             PhotoDetailParam mDetailDanma = uDanmakuElem.mDetailDanmakuParam;
             a.o(mDetailDanma, "mDetailParam.mDetailDanmakuParam");
             s os = new s(tt, tv, tw, tx, b1, mDetailDanma);
             this.y = tS1;
          }
          this.i(this.e1);
          this.j(this.A().a(new g(this)));
          uDanmakuElem = this.K;
          if (uDanmakuElem != null) {
             uob = uDanmakuElem.subscribe(new h(this));
             if (uob != null) {
                this.j(uob);
             }
          }
          this.j(this.D().l(new l(new DanmakuElement$doInBind$7(this))));
          uDanmakuElem = this.F;
          if (uDanmakuElem == null) {
             a.S("mCommentVisibleObservable");
          }
          uob = uDanmakuElem.subscribe(new i(this));
          a.o(uob, "mCommentVisibleObservabl¡­IsCommentPanelShow = it }");
          this.j(uob);
          uDanmakuElem = this.J;
          if (uDanmakuElem != null) {
             uob = uDanmakuElem.subscribe(new b(this));
             a.o(uob, "it.subscribe {\n        m¡­issSettingPanel\(\)\n      }");
             this.j(uob);
          }
          uob = RxBus.f.f(d.class).observeOn(a.c()).subscribe(new c(this));
          a.o(uob, "RxBus.INSTANCE\n      .to¡­nt = it\n        }\n      }");
          this.j(uob);
          g e = Functions.e;
          a.o(e, "Functions.ERROR_CONSUMER");
          this.j(this.D().k(new d(this), e));
          uDanmakuElem = this.t;
          if (uDanmakuElem == null) {
             a.S(str2);
          }
          LifecycleOwner viewLifecycl = uDanmakuElem.getViewLifecycleOwner();
          a.o(viewLifecycl, "mFragment.viewLifecycleOwner");
          viewLifecycl.getLifecycle().addObserver(this.d1);
       }
       return;
    }
    public void l0(boolean p0){
       DanmakuElement uDanmakuElem = DanmakuElement.class;
       if (PatchProxy.isSupport(uDanmakuElem) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDanmakuElem, "28")) {
          return;
       }
       DanmakuElement ty = this.y;
       if (ty != null && !PatchProxy.applyVoid(null, ty, s.class, "2")) {
          ty.d.g();
       }
       return;
    }
    public void m0(boolean p0){
       DanmakuElement uDanmakuElem = DanmakuElement.class;
       if (PatchProxy.isSupport(uDanmakuElem) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDanmakuElem, "5")) {
          return;
       }
       DanmakuElement tt = this.t;
       if (tt == null) {
          a.S("mFragment");
       }
       LifecycleOwner viewLifecycl = tt.getViewLifecycleOwner();
       a.o(viewLifecycl, "mFragment.viewLifecycleOwner");
       viewLifecycl.getLifecycle().removeObserver(this.d1);
       return;
    }
    public d q(){
       a uoa = PatchProxy.apply(null, this, DanmakuElement.class, "30");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public c r(){
       d uod = PatchProxy.apply(null, this, DanmakuElement.class, "31");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d();
       }
       return uod;
    }
    public final void s0(){
       DanmakuElement uDanmakuElem = DanmakuElement.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uDanmakuElem, "21")) {
          return;
       }
       if (this.V0 == null) {
          return;
       }
       this.z0("attach", "enter");
       DanmakuElement tU0 = this.U0;
       if (tU0 != null) {
          b uob = PatchProxy.apply(objArray, this, uDanmakuElem, "22");
          if (uob != PatchProxyResult.class) {
          }else {
             DanmakuElement tS = this.S;
             boolean b = (tS != null && (tS.b == null && this.H().a0()))? true: false;
             uob = new b(Boolean.valueOf(b), new DanmakuElement$createDanmakuLaunchParams$1(this));
          }
          tU0.B(uob);
       }
       uDanmakuElem = this.C;
       if (uDanmakuElem == null) {
          a.S("mSlidePlayViewModel");
       }
       if (!uDanmakuElem.b1() - null) {
          this.W.b(1, 1, 1);
       }else {
          this.W.b(1, false, 1);
       }
       RxBus.f.b(new g());
       return;
    }
    public final boolean t0(boolean p0,a p1){
       DanmakuElement uDanmakuElem = DanmakuElement.class;
       if (PatchProxy.isSupport(uDanmakuElem)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, uDanmakuElem, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.x0(this.U0, new DanmakuElement$b(this, p0, p1));
    }
    public final void u0(boolean p0){
       DanmakuElement uDanmakuElem = DanmakuElement.class;
       if (PatchProxy.isSupport(uDanmakuElem) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDanmakuElem, "26")) {
          return;
       }
       this.z0("detach", "release: "+p0);
       a.c(this.W, 1, false, false, 4, null);
       if (p0) {
          DanmakuElement tU0 = this.U0;
          if (tU0 != null) {
             tU0.release();
          }
       }
       return;
    }
    public final void v0(d p0,boolean p1){
       DanmakuElement uDanmakuElem = DanmakuElement.class;
       if (PatchProxy.isSupport(uDanmakuElem) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uDanmakuElem, "11")) {
          return;
       }
       this.z0("execute", "enter");
       p0.m(this.g1);
       this.U0 = p0;
       DanmakuElement.J0(this, p1, null, 2, null);
       return;
    }
    public final Runnable w0(){
       Object obj = PatchProxy.apply(null, this, DanmakuElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a1.getValue();
    }
    public final boolean x0(Object p0,a p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DanmakuElement.class, "33");
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
    public final void y0(boolean p0){
       l1 a;
       DanmakuElement uDanmakuElem = DanmakuElement.class;
       if (PatchProxy.isSupport(uDanmakuElem) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDanmakuElem, "10")) {
          return;
       }
       uDanmakuElem = this.x;
       if (uDanmakuElem != null) {
          this.z0("initKit", "enter");
          d uod = uDanmakuElem.a();
          if (uod != null) {
             a.o(uod, "it");
             this.v0(uod, p0);
             a = l1.a;
          }else {
             uod = null;
          }
          this.x0(uod, new DanmakuElement$c(this, uDanmakuElem, p0));
       }
       return;
    }
    public final void z0(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DanmakuElement.class, "32")) {
          return;
       }
       a a = a.a;
       DanmakuElement tv = this.v;
       if (tv == null) {
          a.S("mPhoto");
       }
       a.i(a, "DanmakuElement", p1, tv, null, p0, null, 40, null);
       return;
    }
}
