package com.yxcorp.gifshow.detail.common.controller.BasePlayPauseElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import rp7.a;
import jh5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.common.controller.BasePlayPauseElement$mAttachChangedListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import v6a.m0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.model.CDNUrl;
import p5a.b;
import ekd.j;
import java.lang.Integer;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import qp7.x0;
import qp7.b;
import gq7.d;
import java.util.Objects;
import pp7.b;
import qp7.a;
import rq7.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.detail.common.controller.BasePlayPauseElement$c;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import o56.f;
import ib5.q;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.s;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.detail.common.controller.BasePlayPauseElement$onBind$2;
import rx9.b;
import msd.l;
import qp7.b1;
import rx9.a;
import com.kwai.framework.player.core.b$b;
import de5.c;
import qp7.c;
import gq7.c;
import com.yxcorp.gifshow.detail.common.controller.BasePlayPauseElement$b;
import lnc.u1;
import brd.y;
import com.google.gson.JsonObject;
import xx9.a;
import java.lang.Long;
import java.lang.Number;
import android.os.SystemClock;
import p1a.a$a;
import com.yxcorp.gifshow.detail.common.controller.BasePlayPauseElement$a;
import tl8.g;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p1a.a;
import com.yxcorp.gifshow.detail.common.controller.BasePlayPauseElement$logBtnClick$2;
import com.kwai.framework.kgi.sdk.Kgi;

public abstract class BasePlayPauseElement extends DispatchBaseElement	// class@0013ab
{
    public a A;
    public a B;
    public b$b C;
    public t D;
    public y E;
    public y F;
    public boolean G;
    public y H;
    public boolean I;
    public final p J;
    public boolean t;
    public boolean u;
    public SlidePlayViewModel v;
    public QPhoto w;
    public a x;
    public c y;
    public BaseFragment z;

    public void BasePlayPauseElement(a p0,a p1){
       a.p(p0, "bizType");
       super(p0, p1);
       this.u = true;
       this.J = s.c(new BasePlayPauseElement$mAttachChangedListener$2(this));
    }
    public void A0(m0 p0){
       boolean b1;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, BasePlayPauseElement.class, "22")) {
          return;
       }
       a.p(p0, "callerContext");
       m0 o = p0.o;
       a.o(o, "callerContext.mLogListener");
       this.B = o;
       o = p0.r;
       a.o(o, "callerContext.mScreenCleanStatusCombination");
       this.A = o;
       PhotoDetailParam mPhoto = p0.c.mPhoto;
       a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
       this.w = mPhoto;
       a b = p0.b;
       a.o(b, "callerContext.mFragment");
       this.z = b;
       BasePlayPauseElement tw = this.w;
       if (tw == null) {
          a.S("mPhoto");
       }
       Object obj = PatchProxy.applyOneRefs(tw, this, BasePlayPauseElement.class, "31");
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(!tw.isImageType() || !j.h(b.b(tw))){
          b1 = true;
       }else {
          b1 = false;
       }
       this.u = b1;
       o = p0.j;
       a.o(o, "callerContext.mPlayModule");
       this.x = o;
       o = p0.N;
       a.o(o, "callerContext.mPlayPauseObservable");
       this.D = o;
       o = p0.O;
       a.o(o, "callerContext.mPlayPauseShowObserver");
       this.E = o;
       o = p0.k;
       a.o(o, "callerContext.mPlayInfoListenerBundle");
       this.y = o;
       o = p0.e0;
       a.o(o, "callerContext.mNoAudioSingleImgPlayObserver");
       this.H = o;
       p0 = p0.j0;
       a.o(p0, "callerContext.mAtlasCancelAutoPlayPublisher");
       this.F = p0;
       PatchProxy.onMethodExit(BasePlayPauseElement.class, "22");
       return;
    }
    public void B0(){
    }
    public void C0(){
    }
    public void D0(boolean p0){
    }
    public void E0(int p0,String p1){
       BasePlayPauseElement uBasePlayPau = BasePlayPauseElement.class;
       if (PatchProxy.isSupport(uBasePlayPau) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uBasePlayPau, "33")) {
          return;
       }
       a.p(p1, "triggerSource");
       a uoa = a.d();
       BasePlayPauseElement tw = this.w;
       if (tw == null) {
          a.S("mPhoto");
       }
       uoa.k(new PlayEvent(tw, PlayEvent$Status.PAUSE, p0, p1));
       this.J0(false);
       this.x0(true);
       return;
    }
    public void F0(){
       if (PatchProxy.applyVoid(null, this, BasePlayPauseElement.class, "32")) {
          return;
       }
       this.I = false;
       BasePlayPauseElement tx = this.x;
       if (tx == null) {
          a.S("mPlayModule");
       }
       if (tx.getPlayer() != null) {
          tx = this.x;
          if (tx == null) {
             a.S("mPlayModule");
          }
          e player = tx.getPlayer();
          a.o(player, "mPlayModule.player");
          if (player.isPrepared()) {
             tx = this.x;
             if (tx == null) {
                a.S("mPlayModule");
             }
             player = tx.getPlayer();
             a.o(player, "mPlayModule.player");
             this.J0((player.isPaused() ^ 1));
          }else if(this.w0() && this.t != null){
             this.J0(1);
          }
       }else {
          goto label_004c ;
       }
       return;
    }
    public void G0(int p0,String p1,boolean p2){
       if (PatchProxy.isSupport(BasePlayPauseElement.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, BasePlayPauseElement.class, "34")) {
          return;
       }
       a.p(p1, "triggerSource");
       a uoa = a.d();
       BasePlayPauseElement tw = this.w;
       if (tw == null) {
          a.S("mPhoto");
       }
       uoa.k(new PlayEvent(tw, PlayEvent$Status.RESUME, p0, p1));
       BasePlayPauseElement tx = this.x;
       if (tx == null) {
          a.S("mPlayModule");
       }
       e player = tx.getPlayer();
       a.o(player, "mPlayModule.player");
       if (player.isPlaying()) {
          this.J0(true);
          this.x0(false);
       }
       return;
    }
    public final void H0(boolean p0){
       this.G = p0;
    }
    public final void I0(boolean p0){
       this.t = p0;
    }
    public final void J0(boolean p0){
       BasePlayPauseElement uBasePlayPau = BasePlayPauseElement.class;
       if (PatchProxy.isSupport(uBasePlayPau) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBasePlayPau, "30")) {
          return;
       }
       d uod = this.E();
       Objects.requireNonNull(uod);
       d uod1 = d.class;
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uod, uod1, "1")) {
          uod.d.f(Boolean.valueOf(p0));
       }
       this.D0(p0);
       return;
    }
    public final boolean K0(){
       boolean b;
       BasePlayPauseElement obj = PatchProxy.apply(null, this, BasePlayPauseElement.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.w;
       if (obj == null) {
          a.S("mPhoto");
       }
       if (!obj.isVideoType()) {
          obj = this.w;
          if (obj == null) {
             a.S("mPhoto");
          }
          if (!obj.isKtv()) {
             obj = this.w;
             if (obj == null) {
                a.S("mPhoto");
             }
             if (!obj.isSinglePhoto()) {
                obj = this.w;
                if (obj == null) {
                   a.S("mPhoto");
                }
                if (!obj.isAtlasPhotos()) {
                   b = false;
                label_004e :
                   return b;
                }
             }
          }
       }
    label_004d :
       b = true;
       goto label_004e ;
    }
    public void P(a p0){
       this.A0(p0);
    }
    public a f0(a p0){
       d uod = PatchProxy.applyOneRefs(p0, this, BasePlayPauseElement.class, "41");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d(p0);
       }
       return uod;
    }
    public void j0(boolean p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BasePlayPauseElement uBasePlayPau = BasePlayPauseElement.class;
       if (PatchProxy.isSupport(uBasePlayPau) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBasePlayPau, "23")) {
          return;
       }
       this.F0();
       BasePlayPauseElement tz = this.z;
       String str = "mFragment";
       if (tz == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tz.getParentFragment());
       a.m(slidePlayVie);
       this.v = slidePlayVie;
       BasePlayPauseElement$c uoc = new BasePlayPauseElement$c(this);
       g e = Functions.e;
       b uob = this.H().y1.subscribe(uoc, e);
       a.o(uob, "pageConfig.pauseViewClic¡­Functions.ERROR_CONSUMER\)");
       this.j(uob);
       if (this.K0()) {
          BasePlayPauseElement tz1 = this.z;
          if (tz1 == null) {
             a.S(str);
          }
          FragmentActivity activity = tz1.getActivity();
          if (activity != null && f.b(activity)) {
             q oq = q.p0(activity);
             a.o(oq, "MenuViewModel.get\(it\)");
             if (oq.s0()) {
                this.E0(20, "PlayElementSlidePanel");
             }
          }
          b b1 uob1 = RxBus.f.f(s.class).observeOn(d.a).subscribe(new b(new BasePlayPauseElement$onBind$2(this)));
          a.o(uob1, "RxBus.INSTANCE.toObserva¡­:handleSlidingPanelEvent\)");
          this.j(uob1);
          Object[] objArray = null;
          uob1 = PatchProxy.apply(objArray, this, uBasePlayPau, "19");
          if (uob1 == patchProxyRe) {
             uob1 = this.J.getValue();
          }
          this.i(uob1);
          if (!PatchProxy.applyVoid(objArray, this, uBasePlayPau, "26")) {
             if (this.C == null) {
                this.C = new a(this);
             }
             uBasePlayPau = this.y;
             if (uBasePlayPau == null) {
                a.S("mPlayerListenerBundle");
             }
             uBasePlayPau.c(this.C);
          }
          c uoc1 = this.A();
          g og = Functions.d();
          a.o(og, "Functions.emptyConsumer\(\)");
          Objects.requireNonNull(uoc1);
          uob = PatchProxy.applyTwoRefs(uoc, og, uoc1, c.class, "1");
          if (uob != patchProxyRe) {
          }else {
             a.p(uoc, "consumer");
             a.p(og, "error");
             uob = uoc1.a.subscribe(uoc, og);
             a.o(uob, "mPlayClickSubject.subscribe\(consumer, error\)");
          }
          this.j(uob);
          this.z0(uoc);
          b uob2 = this.H().A1.subscribe(new BasePlayPauseElement$b(this), e);
          a.o(uob2, "pageConfig.navigationVid¡­Functions.ERROR_CONSUMER\)");
          this.j(uob2);
       }else {
          this.v0();
       }
       return;
    }
    public void k0(boolean p0){
       if (PatchProxy.isSupport(BasePlayPauseElement.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BasePlayPauseElement.class, "20")) {
          return;
       }
       u1.a(this);
       return;
    }
    public void l0(boolean p0){
       if (PatchProxy.isSupport(BasePlayPauseElement.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BasePlayPauseElement.class, "21")) {
          return;
       }
       u1.b(this);
       return;
    }
    public void m0(boolean p0){
       BasePlayPauseElement uBasePlayPau = BasePlayPauseElement.class;
       if (PatchProxy.isSupport(uBasePlayPau) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBasePlayPau, "29")) {
          return;
       }
       if (this.C != null) {
          BasePlayPauseElement ty = this.y;
          if (ty == null) {
             a.S("mPlayerListenerBundle");
          }
          ty.g(this.C);
       }
       return;
    }
    public final y n0(){
       BasePlayPauseElement obj = PatchProxy.apply(null, this, BasePlayPauseElement.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.F;
       if (obj == null) {
          a.S("mAtlasCancelAutoPlayPublisher");
       }
       return obj;
    }
    public final boolean o0(){
       return this.G;
    }
    public void onEventMainThread(PlayEvent p0){
       boolean b1;
       PlayEvent a;
       BasePlayPauseElement uBasePlayPau = BasePlayPauseElement.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uBasePlayPau, "27")) {
          return;
       }
       a.p(p0, "playEvent");
       PlayEvent obj = PatchProxy.applyOneRefs(p0, this, uBasePlayPau, "28");
       boolean b = true;
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else {
          uBasePlayPau = this.w;
          if (uBasePlayPau != null) {
             a = p0.a;
             if (a != null && (uBasePlayPau.mEntity != null && a.mEntity != null)) {
                if (uBasePlayPau == null) {
                   a.S("mPhoto");
                }
                if (uBasePlayPau.mEntity == p0.a.mEntity) {
                   b1 = true;
                }
             }
          }
       label_0045 :
          b1 = false;
       }
       if (b1 && this.K0()) {
          obj = p0.c;
          if (obj != 5 && obj != 13) {
             b = false;
          }
          if (this.I != b && p0.b == PlayEvent$Status.PAUSE) {
             this.I = b;
             if (!b) {
                this.J0(false);
             }
          }
       }
    label_006b :
       return;
    }
    public final boolean p0(){
       return this.t;
    }
    public final y q0(){
       BasePlayPauseElement obj = PatchProxy.apply(null, this, BasePlayPauseElement.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.H;
       if (obj == null) {
          a.S("mNoAudioSingleImgPlayObserver");
       }
       return obj;
    }
    public c r(){
       c uoc = PatchProxy.apply(null, this, BasePlayPauseElement.class, "42");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c();
       }
       return uoc;
    }
    public final QPhoto r0(){
       BasePlayPauseElement obj = PatchProxy.apply(null, this, BasePlayPauseElement.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.w;
       if (obj == null) {
          a.S("mPhoto");
       }
       return obj;
    }
    public final a s0(){
       BasePlayPauseElement obj = PatchProxy.apply(null, this, BasePlayPauseElement.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x;
       if (obj == null) {
          a.S("mPlayModule");
       }
       return obj;
    }
    public final y t0(){
       BasePlayPauseElement obj = PatchProxy.apply(null, this, BasePlayPauseElement.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.E;
       if (obj == null) {
          a.S("mPlayPauseShowObserver");
       }
       return obj;
    }
    public void u0(s p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePlayPauseElement.class, "35")) {
          return;
       }
       a.p(p0, "event");
       if (this.t == null) {
          return;
       }
       BasePlayPauseElement tx = this.x;
       if (tx == null) {
          a.S("mPlayModule");
       }
       if (tx.getPlayer() != null && !this.w0()) {
          if (p0.a != null) {
             this.E0(20, "PlayElementSlidePanel");
          }else {
             this.G0(20, "PlayElementSlidePanel", false);
          }
       }
       return;
    }
    public void v0(){
    }
    public final boolean w0(){
       boolean b;
       BasePlayPauseElement obj = PatchProxy.apply(null, this, BasePlayPauseElement.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.u == null) {
          obj = this.w;
          if (obj == null) {
             a.S("mPhoto");
          }
          if (!obj.isSinglePhoto()) {
             obj = this.w;
             if (obj == null) {
                a.S("mPhoto");
             }
             if (!obj.isAtlasPhotos()) {
             label_0036 :
                b = false;
             label_0037 :
                return b;
             }
          }
          b = true;
          goto label_0037 ;
       }else {
          goto label_0036 ;
       }
    }
    public final void x0(boolean p0){
       BasePlayPauseElement uBasePlayPau = BasePlayPauseElement.class;
       if (PatchProxy.isSupport(uBasePlayPau) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBasePlayPau, "40")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       BasePlayPauseElement tA = this.A;
       String str = "mScreenCleanStatusCombination";
       if (tA == null) {
          a.S(str);
       }
       a f = tA.f;
       tA = this.w;
       if (tA == null) {
          a.S("mPhoto");
       }
       long l = (long)1000;
       jsonObject.a0("photo_duration", Long.valueOf((tA.getVideoDuration() / l)));
       if (f > 0) {
          jsonObject.a0("simplify_screen_duration", Long.valueOf(((SystemClock.elapsedRealtime() - f) / l)));
          tA = this.A;
          if (tA == null) {
             a.S(str);
          }
          tA.k(-1);
       }
       jsonObject.a0("photo_scale", this.H().a2.invoke());
       tA = this.A;
       if (tA == null) {
          a.S(str);
       }
       jsonObject.a0("is_simplify_screen", Integer.valueOf(tA.c()));
       tA = this.B;
       if (tA == null) {
          a.S("mLogListener");
       }
       int i = (p0)? 0x76f1: 0x76f2;
       a$a uoa = a$a.a(i, "");
       uoa.h(BasePlayPauseElement$a.a);
       uoa.m(jsonObject.toString());
       tA.a(uoa);
       Kgi.c(new BasePlayPauseElement$logBtnClick$2(this, p0));
       return;
    }
    public void y0(){
    }
    public void z0(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePlayPauseElement.class, "24")) {
          return;
       }
       a.p(p0, "consumer");
       return;
    }
}
