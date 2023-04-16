package com.yxcorp.gifshow.camera.record.wide.a;
import ui9.b;
import in6.b;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.wide.UltraWideAndSuperStabilityStateHelper;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import zg9.c;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import ji9.a;
import ji9.e;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import ji9.d;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import java.util.Objects;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import qr4.i;
import qr4.k$j;
import in6.a;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import qi9.c;
import com.yxcorp.gifshow.camerasdk.q;
import com.yxcorp.gifshow.camera.record.wide.UltraWideAndSuperStabilityStateHelper$DisableCause;
import com.yxcorp.gifshow.camera.record.wide.b;
import com.kwai.camerasdk.models.CaptureDeviceType;
import com.kwai.camerasdk.models.CameraApiVersion;
import com.kwai.camerasdk.videoCapture.CameraController;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;
import qxc.b;
import com.yxcorp.gifshow.camera.record.wide.a$a;
import com.kuaishou.viewbinder.IViewBinder;
import android.view.View$OnClickListener;
import c35.p;
import tg9.b;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import lnc.s6;
import android.graphics.drawable.Drawable;
import lnc.a1;
import pi9.i;
import ji9.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import ji9.b;
import w46.b;
import java.lang.Number;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import e17.i;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kwai.camerasdk.videoCapture.CameraController$CameraState;
import android.content.Intent;
import bj9.a;
import ji9.f;
import erd.g;
import crd.b;

public class a extends d0 implements b, b	// class@000fa9
{
    public final String o;
    public View p;
    public int q;
    public final UltraWideAndSuperStabilityStateHelper r;
    public boolean s;
    public boolean t;
    public j u;

    public void a(CameraPageType p0,b p1,UltraWideAndSuperStabilityStateHelper p2){
       super(p0, p1);
       this.q = 0;
       this.s = false;
       this.t = false;
       this.r = p2;
       this.o = "UltraWideC_"+p0;
       d tf = this.f;
       if (tf instanceof c) {
          this.u = tf.E6();
       }
       this.d.n(a.class, new e(this));
       this.d.n(b.class, new d(this));
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, a.class, "21")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s(this.o, "on c start", objArray);
       this.t = this.t | this.k2();
       return;
    }
    public void L3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "20")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0 = p0.e;
       a tt = this.t;
       Objects.requireNonNull(p0);
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyOneRefs(Boolean.valueOf(tt), p0, videoContext, "158") != PatchProxyResult.class) {
       }else {
          VideoContext.b();
          p0.K = tt;
       }
       return;
    }
    public int O0(){
       return a.c(this);
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, a.class, "22")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s(this.o, "on c reset", objArray);
       this.t = false;
       return;
    }
    public int R(){
       return 0x7f0d017b;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public int T(){
       return a.a(this);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       boolean b;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, a.class, "15")) {
          return;
       }
       if (this.h == null) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s(this.o, "onEffect ", objArray);
       a tr = this.r;
       if (p0 != null && (this.h.n().d() || (this.h.n().e() && p0.getNeedSubFrame()))) {
          i = true;
       }
    label_0051 :
       Objects.requireNonNull(tr);
       UltraWideAndSuperStabilityStateHelper ultraWideAnd = UltraWideAndSuperStabilityStateHelper.class;
       if (PatchProxy.isSupport(ultraWideAnd)) {
          ultraWideAnd = PatchProxy.applyOneRefs(Boolean.valueOf(i), tr, ultraWideAnd, "20");
          if (ultraWideAnd != PatchProxyResult.class) {
             b = ultraWideAnd.booleanValue();
          label_0077 :
             if (b) {
                this.m2();
                this.o2();
                this.p2();
             }
             return;
          }
       }
       b = tr.n(i, UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_MAGIC);
       goto label_0077 ;
    }
    public int Y0(){
       return 11;
    }
    public int a1(){
       return a.b(this);
    }
    public final b g2(){
       Object obj = PatchProxy.apply(null, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.d;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public final boolean h2(){
       Object obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return CameraController.supportCaptureDeviceType(CaptureDeviceType.kCaptureDeviceTypeBuiltInUltraWideCamera, true, this.h.getCameraApiVersion(), a.a().a());
    }
    public final boolean i2(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.g2().a();
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s(this.o, "onViewCreated ", objArray);
       super.k(p0);
       p0.findViewById(R.id.ultra_wide_layout_stub).inflate();
       a tu = this.u;
       View view = null;
       SideBarViewBinder sideBarViewB = (tu != null && tu.r2() != null)? this.u.r2(): view;
       if (sideBarViewB != null) {
          view = sideBarViewB.D();
       }
       p0 = b.a(view, p0, R.id.ultra_wide_entry);
       this.p = p0;
       p.a(sideBarViewB, p0, new a$a(this));
       this.d.j().addView(this.p);
       if (this.p instanceof TextImageView) {
          if (s6.m()) {
             this.p.b(a1.f(R.drawable.arg_RES_7f080451), a1.d(R.dimen.arg_RES_7f07030d), a1.d(R.dimen.arg_RES_7f07030d));
             i.b(this.p);
          }
          this.p.setClickListenerWithoutEnabled(new c(this));
       }
       a tp = this.p;
       if (tp != null) {
          tp.setVisibility(this.q);
       }
       this.p2();
       return;
    }
    public final boolean k2(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.g2().b();
    }
    public final void l2(){
       String str;
       if (PatchProxy.applyVoid(null, this, a.class, "19")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PRODUCE_WIDE_ANGLE";
       JsonObject jsonObject = new JsonObject();
       if (this.i2()) {
          str = (this.k2())? "on": "off";
       }else {
          str = "forbid";
       }
       jsonObject.c0("wide_angle_mode", str);
       if (!this.i2()) {
          b uob = this.g2();
          Objects.requireNonNull(uob);
          String str1 = PatchProxy.apply(null, uob, b.class, "3");
          if (str1 != PatchProxyResult.class) {
          }else if(uob.c != null){
             str1 = "disableByFrontCamera";
          }else {
             str1 = null;
          }
          if (uob.e != null) {
             str1 = (str1 == null)? "disableByLowlightBoost": str1+"+disableByLowlightBoost";
          }
       label_0071 :
          if (uob.b != null) {
             str1 = (str1 == null)? "disableByMagic": str1+"+disableByMagic";
          }
       label_008b :
          if (uob.d != null) {
             str = (str1 == null)? "disableBySuperStability": str1+"+disableBySuperStability";
             str1 = str;
          }
          jsonObject.c0("wide_angle_mode_code", str1);
       }
       uElementPack.params = jsonObject.toString();
       u1.u(1, uElementPack, null);
       return;
    }
    public final void m2(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.d.m(new b(this.c, this.k2()));
       return;
    }
    public void n2(){
       int i;
       Object[] objArray2;
       a uoa = a.class;
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, this, uoa, str)) {
          return;
       }
       if (this.h == null) {
          Object[] objArray1 = new Object[0];
          a.D().t(this.o, "click when no camera", objArray1);
          return;
       }else if(!this.i2()){
          if (!PatchProxy.applyVoid(objArray, this, uoa, "16")) {
             b uob = this.g2();
             Objects.requireNonNull(uob);
             Object obj = PatchProxy.apply(objArray, uob, b.class, str);
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else if(uob.c != null){
                i = 0x7f104ee7;
             }else if(uob.e != null){
                i = 0x7f104ee8;
             }else if(uob.b != null){
                i = (PostExperimentUtils.p())? 0x7f104eea: 0x7f104ee9;
             }else if(uob.d != null){
                i = 0x7f104eeb;
             }else {
                i = -1;
             }
             if (i > 0) {
                i.a(R.style.arg_RES_7f11066a, i);
             }else {
                objArray2 = new Object[0];
                a.D().A(this.o, "nothing to show "+this.g2(), objArray2);
             }
          }
          this.l2();
          return;
       }else {
          uoa = this.r;
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoid(objArray, uoa, UltraWideAndSuperStabilityStateHelper.class, "8")) {
             objArray2 = new Object[0];
             a.D().w("WideAndStability", "click wide when "+uoa.g()+"\("+uoa.e()+"\), "+uoa.e, objArray2);
             if (!uoa.d.a()) {
                objArray = new Object[0];
                a.D().t("WideAndStability", "click wide when disabled, this should not happen", objArray);
             }else {
                uoa.p((uoa.g() ^ 0x01));
             }
          }
          this.m2();
          this.o2();
          this.p2();
          this.l2();
          return;
       }
    }
    public final void o2(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       if (this.k2()) {
          this.h.setCaptureDeviceType(CaptureDeviceType.kCaptureDeviceTypeBuiltInUltraWideCamera);
       }else {
          this.h.setCaptureDeviceType(CaptureDeviceType.kCaptureDeviceTypeBuiltInWideAngleCamera);
       }
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void onResume(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "3")) {
          return;
       }
       super.onResume();
       if (this.s == null) {
          this.s = true;
          if (!PatchProxy.applyVoid(null, this, uoa, "18")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PRODUCE_WIDE_ANGLE";
             u1.t0(3, null, uElementPack);
          }
       }
       return;
    }
    public final void p2(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       if (this.p == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(this.o, "update view "+this.k2()+"\("+this.i2()+"\)", objArray);
       this.p.setEnabled(this.i2());
       this.p.setClickable(true);
       this.p.setSelected(this.k2());
       return;
    }
    public void t1(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       d th = this.h;
       if (th == null) {
          return;
       }
       a tr = this.r;
       boolean b = true;
       boolean b1 = (th.isFrontCamera() && !this.h2())? true: false;
       tr.l(b1);
       a tr1 = this.r;
       if (this.h.getCaptureDeviceType() != CaptureDeviceType.kCaptureDeviceTypeBuiltInUltraWideCamera) {
          b = false;
       }
       tr1.p(b);
       this.p2();
       return;
    }
    public void w(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "10")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().s(this.o, "onCameraOpened", objArray1);
       d th = this.h;
       if (th == null || th.getState() != CameraController$CameraState.PreviewState) {
          Object[] objArray2 = new Object[i];
          a.D().s(this.o, "open when no camera", objArray2);
          return;
       }else {
          boolean b = true;
          this.q = (this.h.n().k(b) != this.h.getCameraApiVersion() || !CameraController.supportCaptureDeviceType(CaptureDeviceType.kCaptureDeviceTypeBuiltInUltraWideCamera, i, this.h.getCameraApiVersion(), a.a().a()))? 8: i;
          a tp = this.p;
          if (tp != null) {
             tp.setVisibility(this.q);
          }
          tp = this.r;
          boolean lowLightBoos = this.h.getLowLightBoostEnabled();
          Objects.requireNonNull(tp);
          UltraWideAndSuperStabilityStateHelper ultraWideAnd = UltraWideAndSuperStabilityStateHelper.class;
          if (PatchProxy.isSupport(ultraWideAnd)) {
             Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(lowLightBoos), tp, ultraWideAnd, "23");
             if (obj != PatchProxyResult.class) {
                obj.booleanValue();
             label_008e :
                if (this.h.getLowLightBoostEnabled()) {
                   uoa = this.r;
                   if (!this.h.isFrontCamera() || this.h2()) {
                      b = false;
                   }
                   uoa.m(b, i);
                   this.p2();
                   return;
                }else if(PatchProxy.applyVoid(objArray, this, uoa, "13")){
                   uoa = this.r;
                   boolean b1 = (this.h.getCaptureDeviceType() == CaptureDeviceType.kCaptureDeviceTypeBuiltInUltraWideCamera)? true: false;
                   if (uoa.p(b1)) {
                      this.m2();
                   }
                }
                uoa = this.r;
                if (this.h.isFrontCamera() && !this.h2()) {
                   i = true;
                }
                if (uoa.l(i)) {
                   this.m2();
                   this.o2();
                }
                this.p2();
                return;
             }
          }
          tp.o(lowLightBoos, UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_LOWLIGHTBOOST, i);
          goto label_008e ;
       }
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.w1(p0);
       if (this.r.b != null) {
          this.d.l(a.class, new f(this));
       }
       return;
    }
}
