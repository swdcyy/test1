package com.yxcorp.gifshow.camera.record.photo.e;
import ui9.b;
import in6.b;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import com.kwai.video.westeros.models.EffectPerformance;
import hg9.h;
import com.yxcorp.gifshow.camera.record.base.d;
import zg9.c;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import hg9.g;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import in6.a;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.camera.record.photo.b;
import java.lang.Runnable;
import ekd.s1;
import q16.a$a;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import android.view.View;
import com.yxcorp.gifshow.camerasdk.q;
import qi9.s1;
import android.app.Activity;
import com.kwai.camerasdk.videoCapture.CameraController;
import com.kwai.robust.PatchProxyResult;
import qi9.c;
import java.util.Objects;
import com.kwai.camerasdk.models.CameraApiVersion;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.view.ViewStub;
import uzc.b;
import zb9.q;
import hg9.c;
import erd.g;
import crd.b;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import hg9.i;
import eoc.f;
import j4b.k;
import hg9.j;
import j4b.l;
import hg9.b;
import e17.i$b;
import e17.i;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lnc.a1;
import java.lang.CharSequence;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.utility.n;
import tg9.b;
import hg9.e;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import lnc.s6;
import com.yxcorp.gifshow.camera.record.photo.a;
import oc9.w;
import com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import hg9.a;
import hg9.d;
import android.graphics.drawable.Drawable;
import pi9.i;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.c;
import yb9.b;
import com.yxcorp.gifshow.camera.record.photo.d;
import yb9.b$a;
import com.yxcorp.gifshow.camerasdk.TakePictureSource;
import com.yxcorp.gifshow.camera.record.photo.h;
import android.content.Intent;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class e extends d0 implements b, b	// class@000ea7
{
    public boolean A;
    public boolean B;
    public s1 C;
    public TextImageView o;
    public View p;
    public ViewStubInflater2 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public b u;
    public TakePictureType v;
    public EffectPerformance w;
    public j x;
    public c y;
    public boolean z;

    public void e(CameraPageType p0,b p1){
       super(p0, p1);
       this.v = TakePictureType.SHOOT_IMAGE;
       this.w = EffectPerformance.UNRECOGNIZED;
       this.z = false;
       this.A = false;
       this.C = new h(this);
       d tf = this.f;
       if (tf instanceof c) {
          this.x = tf.E6();
       }
       this.d.n(b.class, new g(this));
       return;
    }
    public int O0(){
       return a.c(this);
    }
    public int R(){
       return 0x7f0d0174;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public int T(){
       return a.a(this);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, e.class, "7")) {
          return;
       }
       EffectPerformance uNRECOGNIZED = (p0 == null)? EffectPerformance.UNRECOGNIZED: p0.getEffectPerformance();
       this.w = uNRECOGNIZED;
       this.p2();
       return;
    }
    public int Y0(){
       return 10;
    }
    public int a1(){
       return a.b(this);
    }
    public void d5(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "11")) {
          return;
       }
       super.d5(p0);
       if (!this.f.isAdded()) {
          return;
       }
       this.p2();
       this.o2();
       if (p0 == 5 && this.o != null) {
          s1.d(b.b);
       }
       return;
    }
    public void de(a$a p0,a p1){
    }
    public final void g2(){
       if (PatchProxy.applyVoid(null, this, e.class, "17")) {
          return;
       }
       this.s = false;
       if (this.t != null) {
          e tp = this.p;
          if (tp != null) {
             tp.setSelected(false);
             this.p.setVisibility(8);
          }
          d th = this.h;
          if (th != null) {
             th.s0(false);
             this.h.c0(this.C);
             this.h.setLowLightStrategyEnabled(this.e, false);
          }
          this.t = false;
       }
       return;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public final boolean h2(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, e.class, "16");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.h;
       boolean b = false;
       if (obj != null && obj.n() != null) {
          c uoc = this.h.n();
          Objects.requireNonNull(uoc);
          Object obj1 = PatchProxy.apply(objArray, uoc, c.class, "1");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(uoc.I != null && uoc.k(true) == CameraApiVersion.kAndroidCamera2){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
          label_004c :
             return b;
          }
       }
    label_004b :
       b = true;
       goto label_004c ;
    }
    public boolean i2(){
       e obj = PatchProxy.apply(null, this, e.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.o;
       boolean b = (obj != null && (!obj.getVisibility() && this.o.isEnabled()))? true: false;
       return b;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       super.k(p0);
       ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a060e, 0x7f0a060d);
       this.q = viewStubInfl;
       viewStubInfl.d(p0);
       ViewStub viewStub = p0.findViewById(R.id.hd_switch_layout_stub);
       this.u = (viewStub != null)? new b(viewStub): null;
       this.p2();
       this.Y1(this.d.l(q.class, new c(this)));
       this.Y1(f.a(PanelShowEvent.class, new i(this)));
       this.Y1(f.a(k.class, new j(this)));
       this.Y1(f.a(l.class, new b(this)));
       return;
    }
    public boolean k2(){
       e obj = PatchProxy.apply(null, this, e.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.o;
       boolean b = (obj != null && (!obj.getVisibility() && this.o.isSelected()))? true: false;
       return b;
    }
    public final void l2(){
       boolean i;
       boolean b;
       String str;
       if (PatchProxy.applyVoid(null, this, e.class, "21")) {
          return;
       }
       e to = this.o;
       if (to != null) {
          if (!to.isEnabled()) {
             i$b uob = i.m();
             if (this.s != null) {
                i = 0x7f1009f9;
             }else if(PostExperimentUtils.p()){
                i = 0x7f103144;
             }else {
                i = 0x7f103143;
             }
             uob.y(a1.p(i));
             i.z(uob);
          }else {
             b = this.o.isSelected();
             this.o.setSelected((b ^ 0x01));
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putBoolean("take_picture_hd_selected", (b ^ 1));
             g.a(uEditor);
          }
          b = this.o.isEnabled();
          i = this.o.isSelected();
          CameraLogger uCameraLogge = CameraLogger.class;
          if (!PatchProxy.isSupport(uCameraLogge) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), Boolean.valueOf(i), null, uCameraLogge, "24")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "UHD_CAMERA";
             JsonObject jsonObject = new JsonObject();
             if (b) {
                str = (i)? "on": "off";
             }else {
                str = "forbid";
             }
             jsonObject.c0("uhd_mode", str);
             uElementPack.params = jsonObject.toString();
             u1.u(1, uElementPack, null);
          }
       }
       if (this.k2()) {
          this.g2();
       }else {
          this.m2();
       }
       return;
    }
    public final void m2(){
       if (PatchProxy.applyVoid(null, this, e.class, "15")) {
          return;
       }
       if (this.h2()) {
          return;
       }
       if (this.t == null && (!this.f2() && this.v == TakePictureType.SHARE)) {
          n.Y(this.p, 8, false);
          d th = this.h;
          if (th != null) {
             th.i(this.C);
          }
          this.t = true;
       }
    label_0037 :
       return;
    }
    public final void n2(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "1")) {
          return;
       }
       if (this.B != null && (!this.f2() && (this.z == null && this.A == null))) {
          e tp = this.p;
          if (tp == null || tp.getVisibility()) {
             CameraLogger.m("LIGHT_BOOST_ICON");
             if (!PatchProxy.applyVoid(objArray, this, uoe, "14") && !this.h2()) {
                if (this.p == null) {
                   uoe = this.q;
                   if (uoe != null) {
                      View view = uoe.b(R.id.camera_denoise_mode_image_view);
                      this.p = view;
                      if (view != null) {
                         this.d.j().addView(this.p);
                         this.p.setEnabled(true);
                         this.p.setOnClickListener(new e(this));
                         if (this.p instanceof ImageView && s6.m()) {
                            this.p.setImageResource(R.drawable.arg_RES_7f080434);
                         }
                      }
                      this.q = objArray;
                   }
                }
                n.Y(this.p, 0, 0);
             }
          }
       }else {
          n.Y(this.p, 8, 0);
       }
       return;
    }
    public final void o2(){
       if (PatchProxy.applyVoid(null, this, e.class, "19")) {
          return;
       }
       if (this.k2() || this.f2()) {
          this.g2();
       }else {
          this.m2();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       super.onDestroyView();
       this.o = null;
       this.p = null;
       this.q = null;
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       super.onPause();
       this.g2();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       super.onResume();
       if (!this.f2()) {
          this.p2();
          this.o2();
          e to = this.o;
          if (to != null && !to.getVisibility()) {
             s1.d(a.b);
          }
       }
       return;
    }
    public final void p2(){
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "20")) {
          return;
       }
       if (!this.f2()) {
          e tv = this.v;
          if (tv == TakePictureType.SHARE || (tv == TakePictureType.LIVE_AVATAR && (this.h != null && this.d.b().E9().q != null))) {
             if (this.o == null) {
                tv = this.x;
                if (tv != null) {
                   objArray = tv.r2();
                }
                TextImageView textImageVie = (objArray == null)? this.u.a(R.id.hd_switch_view): objArray.B();
                this.o = textImageVie;
                this.d.j().addView(this.o);
                tv = this.o;
                if (tv != null) {
                   tv.setClickListenerWithoutEnabled(new a(this));
                   this.o.setOnClickListener(new d(this));
                   if (s6.m()) {
                      this.o.b(a1.f(R.drawable.arg_RES_7f080432), a1.d(R.dimen.arg_RES_7f07030d), a1.d(R.dimen.arg_RES_7f07030d));
                      i.b(this.o);
                   }
                }
             }
          label_0092 :
             if (a.z0()) {
                this.y.s(RecordBubbleItem.HD_TAKE_PICTURE);
             }
             i = 0;
             this.d.h().e(this.o, i, new d(this));
             boolean b = (this.s == null && h.d(this.w) == TakePictureSource.SOURCE_UNDEFINE)? true: false;
             e to = this.o;
             if (to != null) {
                to.setEnabled(b);
                to = this.o;
                if (b && a.a.getBoolean("take_picture_hd_selected", i)) {
                   i = true;
                }
                to.setSelected(i);
             }
          }else {
          label_00dc :
             this.d.h().e(this.o, 8, objArray);
          }
       }else {
          goto label_00dc ;
       }
       this.o2();
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       super.w1(p0);
       this.r = true;
       this.v = SerializableHook.getSerializable(this.f.getArguments(), "TakePictureType");
       this.y = this.d.b().V7();
       return;
    }
}
