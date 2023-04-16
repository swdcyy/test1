package com.kwai.nearby.local.detail.label.LocalSimpleLabelElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import com.kwai.nearby.local.detail.label.LocalSimpleLabelElement$a;
import nsd.u;
import rp7.a;
import jh5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Handler;
import android.os.Looper;
import com.kwai.nearby.local.detail.label.LocalSimpleLabelElement$mAttachChangedListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import qp7.a;
import le5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import fi5.s;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.components.nearbymodel.model.LocalSimpleLabelInfo;
import zc7.h;
import java.util.Objects;
import java.lang.Float;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zc7.a;
import java.lang.Runnable;
import com.kwai.nearby.local.detail.label.LocalSimpleLabelElement$disposeShowGuideType$1$2$1;
import zc7.e;
import msd.l;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import qp7.b;
import tkd.b;
import tkd.d;
import vw5.f;
import zc7.b;
import zc7.c;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import zc7.q;
import zc7.g;
import java.lang.Boolean;
import qp7.x0;
import pp7.b;
import qp7.b1;
import qp7.c;
import com.kwai.nearby.local.detail.label.LocalSimpleLabelElement$onBind$2;
import zc7.f;
import com.kwai.nearby.local.detail.label.LocalSimpleLabelElement$onBind$3;
import com.kwai.nearby.local.detail.label.LocalSimpleLabelElement$b;
import vw5.a;
import tw5.a;
import rd5.e;
import qp7.d;
import zc7.i;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import java.lang.Number;
import zc7.o;
import zc7.m;

public final class LocalSimpleLabelElement extends DispatchBaseElement	// class@000f8f
{
    public boolean A;
    public int B;
    public long C;
    public boolean D;
    public boolean E;
    public float F;
    public boolean G;
    public String H;
    public float I;
    public int J;
    public t K;
    public final p L;
    public QPhoto t;
    public Activity u;
    public LocalSimpleLabelInfo v;
    public boolean w;
    public final Handler x;
    public PublishSubject y;
    public boolean z;
    public static final LocalSimpleLabelElement$a M;

    static {
       LocalSimpleLabelElement.M = new LocalSimpleLabelElement$a(null);
    }
    public void LocalSimpleLabelElement(a p0,a p1){
       a.p(p0, "type");
       super(p0, p1);
       this.x = new Handler(Looper.getMainLooper());
       this.H = "SECOND";
       this.L = s.c(new LocalSimpleLabelElement$mAttachChangedListener$2(this));
    }
    public void P(a p0){
       s a;
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalSimpleLabelElement.class, "5")) {
       }else {
          a.p(p0, "callerContext");
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          this.t = mPhoto;
          a = s.a;
          PhotoMeta photoMeta = (mPhoto != null)? mPhoto.getPhotoMeta(): null;
          LocalSimpleLabelInfo localSimpleL = a.c(photoMeta);
          this.v = localSimpleL;
          boolean b = false;
          LocalSimpleLabelInfo mIsGuideShow = (localSimpleL != null)? localSimpleL.mIsGuideShowing: false;
          this.A = mIsGuideShow;
          if (localSimpleL != null && localSimpleL.mIsReload == 1) {
             b = true;
          }
          this.D = b;
          this.u = p0.a;
          this.y = p0.d;
          p0 = p0.f;
          a.o(p0, "callerContext.mDetailPlayedCountObservable");
          this.K = p0;
       }
       return;
    }
    public void S(){
       String photoId;
       LocalSimpleLabelElement localSimpleL = LocalSimpleLabelElement.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, localSimpleL, "14")) {
          return;
       }
       if (this.v != null) {
          LocalSimpleLabelElement tt = this.t;
          if (tt != null && this.w == null) {
             h a = h.a;
             a.m(tt);
             LocalSimpleLabelElement tv = this.v;
             a.m(tv);
             LocalSimpleLabelElement tH = this.H;
             LocalSimpleLabelElement tI = this.I;
             Objects.requireNonNull(a);
             if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidFourRefs(tt, tv, tH, Float.valueOf(tI), a, h.class, "2")) {
                a.p(tH, "guidePlayStrategy");
                a.a("DISTANCE_TAG_CARD", tt, tv, tH, tI);
             }
             boolean b = true;
             this.w = b;
             if (!PatchProxy.applyVoid(objArray, this, localSimpleL, "18")) {
                LocalSimpleLabelElement tv1 = this.v;
                if (tv1 != null && (tv1.mDisableAnimation != null || (this.z != null || (!TextUtils.x(tv1.mSubTitleText) && this.z != null)))) {
                   LocalSimpleLabelElement tt1 = this.t;
                   if (tt1 != null && (tt1.isImageType() == b && this.C > 0)) {
                      this.x.postDelayed(new a(this), this.C);
                   }else {
                      tt = this.y;
                      if (tt != null) {
                         b uob1 = tt.subscribe(new e(new LocalSimpleLabelElement$disposeShowGuideType$1$2$1(this)), Functions.e);
                         a.o(uob1, "it.subscribe\(this::onRec¡­Functions.ERROR_CONSUMER\)");
                         this.j(uob1);
                      }
                   }
                   if (tv1.mEnableReloadGuideInfo == null || (this.D != null || (this.A == null && !PatchProxy.applyVoid(objArray, this, localSimpleL, "7")))) {
                      f uof = d.a(0x54358588);
                      tt = this.t;
                      if (tt != null) {
                         photoId = tt.getPhotoId();
                         if (photoId != null) {
                         label_00e0 :
                            tv1 = this.v;
                            if (tv1 != null) {
                               objArray = tv1.mReloadParam;
                            }
                            b uob = uof.F3(photoId, objArray).subscribe(new b(this), new c(this));
                            a.o(uob, "PluginManager.get\(RoamCi¡­howGuide\(\)\n            }\)");
                            this.j(uob);
                         }
                      }
                      photoId = "";
                      goto label_00e0 ;
                   }
                }
             }
          }
       }
    label_0100 :
       return;
    }
    public a f0(a p0){
       q oq = PatchProxy.applyOneRefs(p0, this, LocalSimpleLabelElement.class, "1");
       if (oq != PatchProxyResult.class) {
       }else {
          oq = new q(p0);
       }
       return oq;
    }
    public void j0(boolean p0){
       q oq1;
       q oq = q.class;
       g og = g.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LocalSimpleLabelElement localSimpleL = LocalSimpleLabelElement.class;
       if (PatchProxy.isSupport(localSimpleL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, localSimpleL, "6")) {
          return;
       }
       this.b0();
       LocalSimpleLabelElement tv = this.v;
       Object[] objArray = null;
       String str = "4";
       if (tv != null) {
          this.E().g(tv);
          if (!tv.isAnimGuide() && !TextUtils.x(tv.mLinkGuideText)) {
             this.o0();
             oq1 = this.E();
             Objects.requireNonNull(oq1);
             if (!PatchProxy.applyVoid(objArray, oq1, oq, str)) {
                oq1.e.f(Boolean.FALSE);
             }
          }
       }
       b b1 uob1 = PatchProxy.apply(objArray, this, localSimpleL, str);
       if (uob1 == patchProxyRe) {
          uob1 = this.L.getValue();
       }
       this.i(uob1);
       g og1 = this.A();
       f uof = new f(new LocalSimpleLabelElement$onBind$2(this));
       g e = Functions.e;
       a.o(e, "Functions.ERROR_CONSUMER");
       Objects.requireNonNull(og1);
       b uob = PatchProxy.applyTwoRefs(uof, e, og1, og, "2");
       if (uob != patchProxyRe) {
       }else {
          a.p(uof, "onNext");
          a.p(e, "onError");
          uob = og1.a.subscribe(uof, e);
          a.o(uob, "labelClick.subscribe\(onNext, onError\)");
       }
       this.j(uob);
       og1 = this.A();
       f uof1 = new f(new LocalSimpleLabelElement$onBind$3(this));
       a.o(e, "Functions.ERROR_CONSUMER");
       Objects.requireNonNull(og1);
       uob1 = PatchProxy.applyTwoRefs(uof1, e, og1, og, str);
       if (uob1 != patchProxyRe) {
       }else {
          a.p(uof1, "onNext");
          a.p(e, "onError");
          uob1 = og1.b.subscribe(uof1, e);
          a.o(uob1, "guideShowingEvent.subscribe\(onNext, onError\)");
       }
       this.j(uob1);
       tv = this.K;
       if (tv == null) {
          a.S("mDetailPlayedCountObservable");
       }
       b uob2 = tv.subscribe(new LocalSimpleLabelElement$b(this));
       a.o(uob2, "mDetailPlayedCountObserv¡­    mPlayCount = it\n    }");
       this.j(uob2);
       this.z = d.a(-680793205).hk().f(this.t);
       a uoa = d.a(-680793205).hk();
       a.o(uoa, "locationGuideProvider");
       this.B = uoa.c() * 1000;
       uoa = d.a(-680793205).hk();
       a.o(uoa, "locationGuideProvider");
       this.C = (long)uoa.e() * 1000;
       uoa = d.a(-680793205).hk();
       a.o(uoa, "locationGuideProvider");
       this.F = uoa.g();
       a uoa1 = d.a(-680793205).hk();
       a.o(uoa1, "locationGuideProvider");
       this.G = uoa1.b();
       oq1 = this.E();
       LocalSimpleLabelElement tz = this.z;
       Objects.requireNonNull(oq1);
       if (!PatchProxy.isSupport(oq) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(tz), oq1, oq, "13")) {
          oq1.i.f(Boolean.valueOf(tz));
       }
       return;
    }
    public void l0(boolean p0){
       LocalSimpleLabelElement localSimpleL = LocalSimpleLabelElement.class;
       if (PatchProxy.isSupport(localSimpleL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, localSimpleL, "11")) {
          return;
       }
       LocalSimpleLabelElement tv = this.v;
       if (tv != null) {
          tv.mIsGuideShowing = false;
       }
       if (tv) {
          tv.mIsSubTextShowing = false;
       }
       if (tv) {
          tv.mIsReload = false;
       }
       return;
    }
    public void m0(boolean p0){
       LocalSimpleLabelElement localSimpleL = LocalSimpleLabelElement.class;
       if (PatchProxy.isSupport(localSimpleL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, localSimpleL, "10")) {
          return;
       }
       this.x.removeCallbacksAndMessages(null);
       this.J = 0;
       return;
    }
    public final boolean n0(float p0){
       boolean b = true;
       if ((double)p0 - 0x3fee666666666666 < 0 || this.J < b) {
          b = false;
       }
       return b;
    }
    public final void o0(){
       LocalSimpleLabelElement tv = this.v;
       if (tv != null) {
          tv.mIsGuideShowing = true;
       }
       return;
    }
    public final void onReceiveProgressEvent(e p0){
       LocalSimpleLabelInfo mEnableReloa;
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalSimpleLabelElement.class, "12")) {
          return;
       }
       LocalSimpleLabelElement tv = this.v;
       if (tv != null) {
          this.H = "SECOND";
          this.I = (float)this.B / 1000.00f;
          LocalSimpleLabelElement tt = this.t;
          LocalSimpleLabelElement tC = (tt != null && tt.isImageType() == true)? this.C: (long)this.B;
          if (tv.isAnimGuide()) {
             tt = this.z;
             if (tt != null) {
                if (this.G != null) {
                   this.H = "PERCENT";
                   tt = this.F;
                   this.I = tt;
                   if ((float)p0.a - ((float)p0.b * tt) >= 0 || (this.n0(tt) && (this.z != null && this.A == null))) {
                      this.E = true;
                      mEnableReloa = tv.mEnableReloadGuideInfo;
                      if (mEnableReloa == null || (this.D != null || mEnableReloa == null)) {
                         this.q0();
                      }
                   }
                }else if(p0.a - tC >= 0 && (tt != null && this.A == null)){
                   this.E = true;
                   mEnableReloa = tv.mEnableReloadGuideInfo;
                   if (mEnableReloa == null || (this.D != null || mEnableReloa == null)) {
                      this.q0();
                   }
                }
             }
          }
          if (!TextUtils.x(tv.mSubTitleText) && (tv.mIsSubTextShowing == null && this.z != null)) {
             if (this.G != null) {
                this.H = "PERCENT";
                tv = this.F;
                this.I = tv;
                if ((float)p0.a - ((float)p0.b * tv) >= 0 || this.n0(tv)) {
                   this.E().k(true);
                   this.p0();
                }
             }else if(p0.a - tC >= 0){
                this.E().k(true);
                this.p0();
             }
          }
       }
    label_00d2 :
       return;
    }
    public final void p0(){
       LocalSimpleLabelElement tv = this.v;
       if (tv != null) {
          tv.mIsSubTextShowing = true;
       }
       return;
    }
    public d q(){
       i oi1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = PatchProxy.apply(null, this, LocalSimpleLabelElement.class, "2");
       if (oi != patchProxyRe) {
       }else {
          Number number = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "28");
          if (number == patchProxyRe) {
             number = LocalConfigKeyHelper.B.getValue();
          }
          int i = number.intValue();
          if (i != 1) {
             oi1 = (i != 2)? new i(): new o();
          }else {
             oi1 = new m();
          }
          oi = oi1;
       }
       return oi;
    }
    public final void q0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LocalSimpleLabelElement.class, "13")) {
          return;
       }
       this.A = true;
       this.o0();
       q oq = this.E();
       Objects.requireNonNull(oq);
       if (!PatchProxy.applyVoid(objArray, oq, q.class, "3")) {
          oq.e.f(Boolean.TRUE);
       }
       h a = h.a;
       LocalSimpleLabelElement tt = this.t;
       LocalSimpleLabelElement tv = this.v;
       LocalSimpleLabelElement tH = this.H;
       LocalSimpleLabelElement tI = this.I;
       Objects.requireNonNull(a);
       if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidFourRefs(tt, tv, tH, Float.valueOf(tI), a, h.class, "1")) {
          a.p(tH, "guidePlayStrategy");
          a.a("DISTANCE_TAG_GUIDE_CARD", tt, tv, tH, tI);
       }
       return;
    }
    public c r(){
       g og = PatchProxy.apply(null, this, LocalSimpleLabelElement.class, "3");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g();
       }
       return og;
    }
    public final void r0(){
       if (PatchProxy.applyVoid(null, this, LocalSimpleLabelElement.class, "9")) {
          return;
       }
       if (this.E != null && (this.A == null && this.z != null)) {
          this.q0();
       }
    label_001b :
       return;
    }
}
