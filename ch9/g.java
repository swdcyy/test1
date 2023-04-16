package ch9.g;
import ui9.b;
import in6.b;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.wide.UltraWideAndSuperStabilityStateHelper;
import com.yxcorp.gifshow.camera.record.base.d;
import zg9.c;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType;
import ch9.b;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import ch9.a;
import in6.a;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.wide.UltraWideAndSuperStabilityStateHelper$DisableCause;
import java.lang.Integer;
import yb9.b;
import android.view.View;
import yb9.b$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;
import com.yxcorp.gifshow.camera.record.sidebar.AbsRecordSideBarViewBinder;
import android.view.ViewStub;
import qxc.b;
import android.widget.TextView;
import android.widget.ImageView;
import ch9.g$a;
import com.kuaishou.viewbinder.IViewBinder;
import android.view.View$OnClickListener;
import c35.p;
import tg9.b;
import bj9.a;
import e17.i;
import w46.b;
import com.yxcorp.gifshow.camerasdk.q;
import oc9.w;
import com.yxcorp.gifshow.media.model.CameraConfig;
import qi9.c;
import com.yxcorp.gifshow.media.model.CameraPageConfig;
import com.kwai.camerasdk.models.DaenerysCaptureStabilizationMode;
import com.kwai.camerasdk.videoCapture.CameraController;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import lnc.s6;
import pi9.i;
import com.kwai.camerasdk.models.CameraApiVersion;
import com.yxcorp.gifshow.camera.record.wide.b;
import android.content.Intent;
import ue9.a;
import ch9.f;
import erd.g;
import crd.b;
import ji9.b;
import ch9.c;
import he9.a;
import ch9.d;
import ge9.a;
import ch9.e;

public class g extends d0 implements b, b	// class@0005ef
{
    public TextView o;
    public ImageView p;
    public boolean q;
    public final UltraWideAndSuperStabilityStateHelper r;
    public View s;
    public int t;
    public j u;

    public void g(CameraPageType p0,b p1,UltraWideAndSuperStabilityStateHelper p2){
       super(p0, p1);
       this.q = false;
       this.t = 0;
       this.r = p2;
       d tf = this.f;
       if (tf instanceof c) {
          this.u = tf.E6();
       }
       this.d.n(StabilityType.class, new b(this));
       this.d.n(b.class, new a(this));
       return;
    }
    public int O0(){
       return a.c(this);
    }
    public int R(){
       return 0x7f0d017a;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public int T(){
       return a.a(this);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       boolean b1;
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, g.class, "9")) {
          return;
       }
       boolean b = (p0 != null && (p0.getEnableVideoStabilization() && (!p0.getDisableCustomBeautify() && (p0.getDisableCustomMakeup() || p0.getDisableCustomSlimming()))))? true: false;
       g tr = this.r;
       Objects.requireNonNull(tr);
       UltraWideAndSuperStabilityStateHelper ultraWideAnd = UltraWideAndSuperStabilityStateHelper.class;
       if (PatchProxy.isSupport(ultraWideAnd)) {
          ultraWideAnd = PatchProxy.applyOneRefs(Boolean.valueOf(b), tr, ultraWideAnd, "16");
          if (ultraWideAnd != PatchProxyResult.class) {
             b1 = ultraWideAnd.booleanValue();
          label_0060 :
             this.h2(b1, b);
             return;
          }
       }
       b1 = tr.j(b, UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_MAGIC);
       goto label_0060 ;
    }
    public int Y0(){
       return 9;
    }
    public int a1(){
       return a.b(this);
    }
    public void d5(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "4")) {
          return;
       }
       super.d5(p0);
       if (p0 == 5) {
          this.d.h().e(this.s, 8, null);
       }else {
          this.d.h().e(this.s, this.t, null);
       }
       return;
    }
    public StabilityType g2(){
       Object obj = PatchProxy.apply(null, this, g.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.f2()) {
          return StabilityType.OFF;
       }
       return this.r.e;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public final void h2(boolean p0,boolean p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, og, "10")) {
          return;
       }
       if (p0 && p1) {
          this.n2();
       }
       this.p2();
       if (p0) {
          this.k2();
       }
       return;
    }
    public final void i2(){
       if (PatchProxy.applyVoid(null, this, g.class, "21")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ULTRA_STEADY";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("ultra_steady_mode", this.g2().getStrForLog());
       if (this.g2().isDisabled()) {
          jsonObject.c0("ultra_steady_forbid_code", this.g2().getDisableReason());
       }
       uElementPack.params = jsonObject.toString();
       u1.u(1, uElementPack, null);
       return;
    }
    public void k(View p0){
       TextView textView;
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("stability", "onViewCreated "+this.g2(), objArray);
       super.k(p0);
       g tu = this.u;
       IViewBinder iViewBinder = null;
       AbsRecordSideBarViewBinder uAbsRecordSi = (tu != null && tu.r2() instanceof AbsRecordSideBarViewBinder)? this.u.r2(): iViewBinder;
       ViewStub viewStub = p0.findViewById(R.id.stability_layout_stub);
       View view = (uAbsRecordSi == null)? iViewBinder: uAbsRecordSi.Q();
       this.s = b.b(view, p0, viewStub, 0x7f0a3c1d);
       view = (uAbsRecordSi == null)? iViewBinder: uAbsRecordSi.R();
       this.o = b.b(view, p0, viewStub, 0x7f0a3c1f);
       View view1 = (uAbsRecordSi == null)? iViewBinder: uAbsRecordSi.P();
       this.p = b.b(view1, p0, viewStub, 0x7f0a3c1e);
       if (this.s != null) {
          g tu1 = this.u;
          if (tu1 != null) {
             iViewBinder = tu1.r2();
          }
          p.a(iViewBinder, this.s, new g$a(this));
          this.s.setVisibility(this.t);
       }
       this.p2();
       this.d.j().addView(this.p);
       return;
    }
    public final void k2(){
       if (PatchProxy.applyVoid(null, this, g.class, "11")) {
          return;
       }
       this.d.m(new a(this.c, this.g2()));
       return;
    }
    public final void l2(){
       if (PatchProxy.applyVoid(null, this, g.class, "19")) {
          return;
       }
       int clickToastRe = this.g2().getClickToastResId();
       if (clickToastRe > 0) {
          i.a(R.style.arg_RES_7f11066a, clickToastRe);
       }else {
          Object[] objArray = new Object[0];
          a.D().t("stability", "nothing to show "+this.g2(), objArray);
       }
       return;
    }
    public final void m2(){
       if (PatchProxy.applyVoid(null, this, g.class, "17")) {
          return;
       }
       d th = this.h;
       if (th == null) {
          return;
       }
       th.P0(this.g2().getRenderFps());
       this.h.O0(this.g2().getRecorderFps(this.d.b().Ve()));
       return;
    }
    public final void n2(){
       if (PatchProxy.applyVoid(null, this, g.class, "14")) {
          return;
       }
       this.o2();
       this.m2();
       return;
    }
    public final void o2(){
       if (PatchProxy.applyVoid(null, this, g.class, "15")) {
          return;
       }
       d th = this.h;
       int i = 0;
       if (th == null || th.n() == null) {
          Object[] objArray = new Object[i];
          a.D().t("stability", "no camera", objArray);
          return;
       }else {
          this.h.setVideoStabilizationMode(this.g2().getStabilityMode(this.h.n().u), i);
          this.h.n().v(this.g2());
          return;
       }
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void onResume(){
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, og, "3")) {
          return;
       }
       super.onResume();
       if (this.q == null) {
          this.q = true;
          if (!PatchProxy.applyVoid(null, this, og, "20")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "ULTRA_STEADY";
             u1.t0(3, null, uElementPack);
          }
       }
       return;
    }
    public final void p2(){
       float f;
       if (PatchProxy.applyVoid(null, this, g.class, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("stability", "updateView "+this.g2(), objArray);
       if (this.o != null && this.p != null) {
          if (this.g2() == StabilityType.DISABLED) {
             f = 0x3f000000;
             this.p.setAlpha(f);
             this.o.setAlpha(f);
          }else {
             f = 0x3f800000;
             this.p.setAlpha(f);
             this.o.setAlpha(f);
          }
          this.p.setImageResource(this.g2().getLabelImageResId());
          if (s6.m()) {
             i.b(this.o);
          }
          this.o.setText(this.g2().getLabelResId());
       }
       return;
    }
    public void w(){
       Object[] obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       UltraWideAndSuperStabilityStateHelper ultraWideAnd = UltraWideAndSuperStabilityStateHelper.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "16")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       String str = "stability";
       a.D().s(str, "onCameraOpened", objArray1);
       if (this.h != null && this.f2()) {
          this.t = (this.h.n().e() && this.h.getCameraApiVersion() != CameraApiVersion.kAndroidCameraUnit)? 8: 0;
          if (this.s != null) {
             this.d.h().e(this.s, this.t, objArray);
          }
          g tr = this.r;
          boolean lowLightBoos = this.h.getLowLightBoostEnabled();
          Objects.requireNonNull(tr);
          if (PatchProxy.isSupport(ultraWideAnd)) {
             Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(lowLightBoos), tr, ultraWideAnd, "19");
             if (obj != patchProxyRe) {
                obj.booleanValue();
             label_0080 :
                this.p2();
                if (this.h.getLowLightBoostEnabled()) {
                   tr = this.r;
                   Objects.requireNonNull(tr);
                   if (!PatchProxy.applyVoid(objArray, tr, ultraWideAnd, "1")) {
                      tr.d.d(0);
                      if (tr.e != StabilityType.DISABLED) {
                         tr.e = StabilityType.TYPE_DEFAULT;
                      }
                   }
                   tr = this.r;
                   boolean b = this.h.isFrontCamera();
                   Objects.requireNonNull(tr);
                   if (PatchProxy.isSupport(ultraWideAnd)) {
                      obj1 = PatchProxy.applyTwoRefs(Boolean.valueOf(b), Boolean.FALSE, tr, ultraWideAnd, "17");
                      if (obj1 != patchProxyRe) {
                         obj1.booleanValue();
                      label_00d2 :
                         return;
                      }
                   }
                   tr.k(b, UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_FRONT_CAMERA, 0);
                   goto label_00d2 ;
                }else if(this.h.isFrontCamera()){
                   obj1 = new Object[0];
                   a.D().s(str, "Front, set disabled", obj1);
                   if (this.r.i(true)) {
                      this.o2();
                   }
                }else if(this.r.i(0)){
                   obj1 = new Object[0];
                   a.D().s(str, "Back, change to default", obj1);
                }else {
                   obj1 = new Object[0];
                   a.D().s(str, "no change", obj1);
                }
                this.m2();
             }
          }
          tr.k(lowLightBoos, UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_LOWLIGHTBOOST, 0);
          goto label_0080 ;
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       super.w1(p0);
       this.d.l(a.class, new f(this));
       this.d.l(b.class, new c(this));
       this.d.l(a.class, new d(this));
       this.d.l(a.class, new e(this));
       return;
    }
}
