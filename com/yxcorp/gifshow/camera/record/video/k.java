package com.yxcorp.gifshow.camera.record.video.k;
import ui9.b;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.video.j;
import com.yxcorp.gifshow.camera.record.video.i;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import com.yxcorp.gifshow.camera.record.base.d;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import com.kwai.camerasdk.videoCapture.CameraController;
import wd9.a;
import hd9.n;
import vf9.c;
import ug9.c;
import oc9.w;
import com.yxcorp.gifshow.media.model.CameraConfig;
import com.yxcorp.gifshow.media.model.CameraPageConfig;
import com.kwai.camerasdk.models.DaenerysCaptureStabilizationMode;
import qi9.g1;
import android.view.View;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import zb9.q;
import oh9.z;
import erd.g;
import crd.b;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import oh9.w;
import eoc.f;
import j4b.k;
import oh9.x;
import j4b.l;
import oh9.y;
import qi9.c;
import com.yxcorp.gifshow.camerasdk.q;
import com.kwai.camerasdk.models.CaptureDeviceType;
import qi9.s1;
import qi9.r1;
import android.widget.ImageView;
import lnc.s6;
import tg9.b;
import oh9.c0;
import android.view.View$OnClickListener;
import com.yxcorp.utility.n;
import com.kwai.camerasdk.videoCapture.CameraController$CameraState;

public class k extends d0 implements b	// class@000f8a
{
    public ImageView o;
    public ViewStubInflater2 p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public s1 v;
    public r1 w;

    public void k(CameraPageType p0,b p1){
       super(p0, p1);
       this.q = false;
       this.r = false;
       this.s = false;
       this.t = false;
       this.u = false;
       this.v = new j(this);
       this.w = new i(this);
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, k.class, "5")) {
          return;
       }
       boolean b = (p0 != null && p0.getNeedSubFrame())? true: false;
       this.q = b;
       this.m2();
       return;
    }
    public void d5(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ok, "6")) {
          return;
       }
       super.d5(p0);
       if (!this.f.isAdded()) {
          return;
       }
       this.m2();
       if (!this.f2() && this.g2()) {
          this.i2(false);
       }
       return;
    }
    public final boolean g2(){
       d obj = PatchProxy.apply(null, this, k.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.h;
       boolean b = (obj != null && obj.getLowLightBoostEnabled())? true: false;
       return b;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public final boolean h2(){
       Object obj = PatchProxy.apply(null, this, k.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d.d(a.i).a == null && (this.d.d(n.j).a == null && (this.d.d(c.c).a != null || this.d.d(c.c).a != null))) {
          return false;
       }
       return this.f2();
    }
    public final void i2(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "20")) {
          return;
       }
       d th = this.h;
       if (th != null) {
          th.beginConfiguration();
          this.h.setVideoStabilizationMode(g1.e(this.d.b().Ve().getRecordPageConfig().mCaptureStabilizationModeForBackCamera), false);
          this.h.setEnableLowLightBoost(p0);
          this.h.commitConfiguration();
       }
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       super.k(p0);
       ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a061a, 0x7f0a0619);
       this.p = viewStubInfl;
       viewStubInfl.d(p0);
       this.Y1(this.d.l(q.class, new z(this)));
       this.Y1(f.a(PanelShowEvent.class, new w(this)));
       this.Y1(f.a(k.class, new x(this)));
       this.Y1(f.a(l.class, new y(this)));
       return;
    }
    public final boolean k2(){
       boolean b;
       d obj = PatchProxy.apply(null, this, k.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.h2()) {
          obj = this.h;
          if (obj != null && (obj.supportLowLightBoost() && (this.h.n() != null && (this.h.n().L != null && (this.q == null && (!this.g2() && (this.r != null || (this.s != null && (this.h.getVideoStabilizationMode() != DaenerysCaptureStabilizationMode.kStabilizationModeSuperEIS && (this.h.getVideoStabilizationMode() != DaenerysCaptureStabilizationMode.kStabilizationModeProSuperEIS && (this.h.getCaptureDeviceType() != CaptureDeviceType.kCaptureDeviceTypeBuiltInUltraWideCamera && (this.t == null && this.u == null)))))))))))) {
             b = true;
          label_0071 :
             return b;
          }
       }
    label_0070 :
       b = false;
       goto label_0071 ;
    }
    public final void l2(){
       if (PatchProxy.applyVoid(null, this, k.class, "16")) {
          return;
       }
       this.h.c0(this.v);
       this.h.q0(false, null);
       if (!this.f2()) {
          this.s = false;
          this.r = false;
       }
       return;
    }
    public final void m2(){
       boolean b;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "10")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ok, "15") && this.h != null) {
          d obj = PatchProxy.apply(objArray, this, ok, "13");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(this.h2()){
             obj = this.h;
             if (obj != null && (this.q == null && (obj.supportLowLightBoost() && (!this.h.getLowLightBoostEnabled() && this.u == null)))) {
                b = true;
             }
          }
       label_004f :
          b = false;
          if (b) {
             if (!PatchProxy.applyVoid(objArray, this, ok, "17")) {
                this.h.i(this.v);
                this.h.q0(true, this.w);
             }
          }else {
             this.l2();
          }
       }
    label_006d :
       if (!PatchProxy.applyVoid(objArray, this, ok, "11") && (this.o != null || this.k2())) {
          if (this.o == null) {
             ok = this.p;
             if (ok != null) {
                ImageView imageView = ok.b(R.id.camera_lowlight_boost_image_view);
                this.o = imageView;
                if (imageView != null) {
                   if (s6.m()) {
                      this.o.setImageResource(R.drawable.arg_RES_7f080434);
                   }
                   this.d.j().addView(this.o);
                   this.o.setEnabled(true);
                   this.o.setOnClickListener(new c0(this));
                }
                this.p = objArray;
             }
          }
          ok = this.o;
          if (ok != null) {
             ok.setSelected(this.g2());
             if (this.k2()) {
                n.Y(this.o, 0, 0);
             }else {
                n.Y(this.o, 8, 0);
             }
          }
       }
    label_00de :
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       super.onDestroyView();
       this.o = null;
       this.p = null;
       this.l2();
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       super.onResume();
       this.m2();
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       d th = this.h;
       if (th != null && th.getState() == CameraController$CameraState.PreviewState) {
          this.m2();
       }
       return;
    }
}
