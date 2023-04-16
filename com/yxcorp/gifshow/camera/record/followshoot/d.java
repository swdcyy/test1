package com.yxcorp.gifshow.camera.record.followshoot.d;
import ui9.b;
import com.yxcorp.gifshow.camera.record.h$b;
import in6.b;
import oc9.d0;
import lnc.a1;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.base.d;
import hd9.z;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import oh9.o0;
import hd9.a0;
import hd9.m0;
import hd9.f0;
import erd.g;
import crd.b;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.followshoot.f;
import com.yxcorp.gifshow.camera.record.followshoot.f$e;
import com.yxcorp.gifshow.camera.record.followshoot.f$b;
import com.yxcorp.gifshow.camera.record.followshoot.f$f;
import com.yxcorp.gifshow.camera.record.followshoot.f$d;
import java.util.Objects;
import hd9.y;
import java.lang.Runnable;
import t45.c;
import java.lang.Long;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.camera.record.followshoot.b;
import java.lang.Boolean;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView;
import pi9.h;
import android.content.Context;
import android.widget.FrameLayout;
import android.app.Activity;
import e3a.a;
import oe6.e;
import ld9.b;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import hd9.q;
import android.view.Surface;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.camera.record.widget.SampleVideoView;
import java.lang.Integer;
import com.kwai.feature.post.api.util.g;
import hd9.v;
import com.kwai.library.widget.popup.common.f;
import ed9.j;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.s6;
import in6.a;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import vf9.y1;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.n;
import java.lang.Number;
import tg9.b;
import com.yxcorp.gifshow.widget.ControlSpeedLayout$c;
import hd9.s;
import eoc.f;
import yh9.j;
import w46.b;
import ekd.k1;
import ed9.h;
import oc9.b0;
import oc9.a0;
import oa0.a;
import hd9.u;
import com.yxcorp.gifshow.camera.record.followshoot.c;
import com.yxcorp.gifshow.camera.record.followshoot.f$c;
import hd9.d0;
import hd9.b0;
import hd9.c0;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Float;
import android.view.ViewStub;
import uzc.b;
import zg9.c;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;
import com.yxcorp.gifshow.camera.record.sidebar.AbsRecordSideBarViewBinder;
import qxc.b;
import com.yxcorp.gifshow.widget.PressedImageView;
import pi9.i;
import oc9.w;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import ki9.s;
import android.view.ViewOutlineProvider;
import android.view.TextureView;
import ki9.t;
import com.kwai.library.widget.surface.SafeTextureView;
import hd9.x;
import hd9.r;
import android.view.View$OnClickListener;
import hd9.j0;
import android.view.TextureView$SurfaceTextureListener;
import hd9.k0;
import hd9.e0;
import com.yxcorp.gifshow.camera.record.widget.SampleVideoView$b;
import hd9.l0;
import com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView$d;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.camera.record.followshoot.d$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.content.Intent;
import ed9.b;
import hd9.t;
import kd9.l0;
import hd9.g0;
import android.view.ViewPropertyAnimator;

public abstract class d extends d0 implements b, h$b, b	// class@000dca
{
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public long E;
    public h F;
    public float G;
    public View o;
    public AdjustableCameraView p;
    public SampleVideoView q;
    public SampleVideoView r;
    public View s;
    public PressedImageView t;
    public ImageView u;
    public TextView v;
    public f w;
    public Surface x;
    public Surface y;
    public boolean z;
    public static final int H;

    static {
       d.H = a1.e(0x42fc0000);
    }
    public void d(CameraPageType p0,b p1){
       super(p0, p1);
       this.A = false;
       this.E = 0;
       this.G = 0x3f800000;
       this.d.n(b.class, new z(this));
       if (this.H2()) {
          this.d.n(o0.class, new a0(this));
       }
       this.d.l(m0.class, new f0(this));
       return;
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, d.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "onCaptureStop", objArray);
       if (!this.r2()) {
          return;
       }
       if (this.a2()) {
          this.y2();
       }else {
          this.E2(0);
          this.z2();
       }
       return;
    }
    public void A2(){
       if (PatchProxy.applyVoid(null, this, d.class, "47")) {
          return;
       }
       if (this.w != null) {
          this.w.start();
       }
       return;
    }
    public final void B2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "39")) {
          return;
       }
       if (this.w != null) {
          this.w.b(objArray);
          this.w.g(objArray);
          this.w.a(objArray);
          this.w.e(objArray);
          d tw = this.w;
          this.w = objArray;
          Objects.requireNonNull(tw);
          c.a(new y(tw));
       }
       return;
    }
    public void C2(){
       this.A = true;
    }
    public void D2(){
       if (PatchProxy.applyVoid(null, this, d.class, "34")) {
          return;
       }
       if (this.w == null) {
          return;
       }
       if (this.w2()) {
          this.w.setVolume(0x3f800000, 0x3f800000);
       }else {
          this.w.setVolume(0, 0);
       }
       return;
    }
    public void E2(long p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uod, "46")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "seek to : "+p0, objArray);
       if (this.w != null) {
          this.w.seekTo(p0);
       }
       return;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, d.class, "29")) {
          return;
       }
       if (this.w != null && !this.w.isPlaying()) {
          long l = this.k2();
          if (!l) {
             this.E2(0);
          }else {
             this.E2(l);
          }
       }
       return;
    }
    public boolean H2(){
       return this instanceof b;
    }
    public void I2(){
       d tc;
       boolean b;
       float f;
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "35")) {
          return;
       }
       d tz = this.z;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(tz), this, uod, "36")) {
          this.s.setEnabled(tz);
          uod = this.t;
          float f1 = 0.40f;
          float f2 = (tz != null)? 0x3f800000: 0.40f;
          uod.setAlpha(f2);
          uod = this.u;
          f2 = (tz != null)? 0x3f800000: 0.40f;
          uod.setAlpha(f2);
          uod = this.v;
          if (uod != null) {
             if (tz != null) {
                f1 = 0x3f800000;
             }
             uod.setAlpha(f1);
          }
       }
       int i = 8;
       d uod1 = 14;
       if (this.z != null) {
          this.z = false;
          uod = this.p;
          tc = this.c;
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoidOneRefs(tc, uod, AdjustableCameraView.class, "9")) {
             uod.k.a();
             uod.t = false;
             Activity uActivity = a.b(uod.getContext());
             Objects.requireNonNull(uActivity);
             int i1 = b.g(uActivity, false, e.k());
             RelativeLayout$LayoutParams layoutParams = uod.getLayoutParams();
             layoutParams.topMargin = uod.u;
             layoutParams.leftMargin = 0;
             if (uod.v != null) {
                layoutParams.addRule(uod1);
                uod.v = false;
             }
             b = (i1 == 5)? true: false;
             b.c(uod, uActivity, true, b, tc);
             uod.l.b(false);
             uod.d(false);
             uod.requestLayout();
          }
          if (this.y != null && this.w != null) {
             this.w.setSurface(this.y);
          }
          this.r.setVisibility(i);
          this.q.setVisibility(false);
       }else {
          this.z = true;
          uod = this.p;
          tc = this.q;
          SampleVideoView m = tc.m;
          SampleVideoView n = tc.n;
          Objects.requireNonNull(uod);
          if (!PatchProxy.isSupport(AdjustableCameraView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(m), Integer.valueOf(n), uod, AdjustableCameraView.class, "8")) {
             uod.k.a();
             uod.t = true;
             RelativeLayout$LayoutParams layoutParams1 = uod.getLayoutParams();
             Activity uActivity1 = a.b(uod.getContext());
             Objects.requireNonNull(uActivity1);
             f = g.d(e.k(), uActivity1, uod.w);
             if (!f) {
                f = 0x3f100000;
             }
             int x = AdjustableCameraView.x;
             layoutParams1.height = (int)((float)x / f);
             layoutParams1.width = x;
             uod.u = layoutParams1.topMargin;
             layoutParams1.topMargin = m;
             layoutParams1.leftMargin = n;
             if (uod.v == null) {
                int[] rules = layoutParams1.getRules();
                if (uod1 < rules.length && rules[uod1]) {
                   uod.v = true;
                   layoutParams1.removeRule(uod1);
                }
             }
             uod.l.b(true);
             uod.d(true);
             uod.requestLayout();
             uod.e();
          }
          if (this.x != null && this.w != null) {
             this.w.setSurface(this.x);
          }
          f.F(this.r, new v(this));
          this.q.setVisibility(i);
          this.r.setVisibility(false);
       }
       this.d.m(new j(true));
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, d.class, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "onCaptureStart", objArray);
       if (!this.r2()) {
          return;
       }
       if (!this.a2()) {
          this.E2(0);
       }else {
          this.z2();
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, d.class, "31")) {
          return;
       }
       if (!this.e.b3()) {
          return;
       }
       if (this.w != null && !this.a2()) {
          this.E2(0);
          this.z2();
       }else {
          this.D2();
       }
       return;
    }
    public void K2(){
       d tu;
       int i;
       if (PatchProxy.applyVoid(null, this, d.class, "30")) {
          return;
       }
       if (!this.v2()) {
          tu = this.u;
          i = (s6.m())? 0x7f081bf8: 0x7f081bf7;
          tu.setImageResource(i);
          this.q.setVisibility(8);
       }else {
          tu = this.u;
          i = (s6.m())? 0x7f081bfa: 0x7f081bf9;
          tu.setImageResource(i);
          this.q.setVisibility(0);
       }
       this.J2();
       return;
    }
    public int O0(){
       return a.c(this);
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "onCaptureReset", objArray);
       if (!this.r2()) {
          return;
       }
       this.E2(0);
       this.z2();
       return;
    }
    public int R(){
       return 0x7f0d0173;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public int T(){
       return a.a(this);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, d.class, "17")) {
          return;
       }
       if (this.d.d(y1.c).b == null && (this.r2() && this.w != null)) {
          this.w.setVolume(0, 0);
       }
    label_0039 :
       return;
    }
    public int Y0(){
       return 3;
    }
    public int a1(){
       return a.b(this);
    }
    public boolean g2(){
       d obj = PatchProxy.apply(null, this, d.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.r2()) {
          return false;
       }
       obj = this.e;
       if (obj != null && (!obj.b3() || this.D == null)) {
          return false;
       }
       return true;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public void h2(){
       if (PatchProxy.applyVoid(null, this, d.class, "38")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "closeGuide", objArray);
       if (this.z != null) {
          this.I2();
       }
       this.F = null;
       this.B2();
       n.Y(this.s, 8, 0);
       n.Y(this.t, 8, 0);
       this.y = null;
       this.x = null;
       n.Y(this.q, 8, 0);
       n.Y(this.r, 8, 0);
       return;
    }
    public abstract f i2();
    public long ie(){
       Object obj = PatchProxy.apply(null, this, d.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.r2() && this.w != null) {
          return this.w.getCurrentPosition();
       }
       return 0;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.k(p0);
       this.o = p0;
       this.d.j().e1(this);
       this.Y1(f.a(ControlSpeedLayout$c.class, new s(this)));
       return;
    }
    public long k2(){
       Object obj = PatchProxy.apply(null, this, d.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.d.d(j.i).b();
    }
    public f l2(){
       return this.w;
    }
    public void m2(int p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod, "44")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "handleOnInfo : "+p0+" "+p1, objArray);
       if (p0 != 3 && (p0 != 701 && (p0 == 0x2712 || p0 == 0x2713))) {
          d tq = this.q;
          if (tq != null) {
             tq.setAlpha(0x3f800000);
          }
       }
       return;
    }
    public void n2(){
       if (PatchProxy.applyVoid(null, this, d.class, "42")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().t("UseSampleController", "onPlayError", objArray);
       return;
    }
    public void o2(){
       if (PatchProxy.applyVoid(null, this, d.class, "43")) {
          return;
       }
       if (this.E - null <= 0 && this.w != null) {
          this.E = this.w.getDuration();
       }
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "onPrepared", objArray);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, d.class, "9")) {
          return;
       }
       super.onDestroy();
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "onDestroy", objArray);
       k1.n(this);
       d ty = this.y;
       if (ty != null) {
          ty.release();
       }
       ty = this.x;
       if (ty != null) {
          ty.release();
       }
       if (this.r2() && this.w != null) {
          this.B2();
          this.F = null;
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "onDestroyView", objArray);
       this.G = 0x3f800000;
       this.D = false;
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       if (!this.r2()) {
          return;
       }
       if (this.w != null) {
          this.C = true;
          this.w.setVolume(0, 0);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       super.onResume();
       if (!this.r2()) {
          return;
       }
       if (this.C != null) {
          this.D2();
          this.C = false;
       }
       if (!this.a2()) {
          this.z2();
       }
       return;
    }
    public void onStart(){
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "onStart", objArray);
       if (!this.r2()) {
          return;
       }
       if (this.D == null) {
          this.t2(this.F.d);
          this.D = true;
          if (!PatchProxy.applyVoid(null, this, uod, "45")) {
             if (this.F.e != null) {
                this.q.setVisibility(0);
             }
             this.t.setVisibility(0);
             this.s.setVisibility(0);
          }
       }
       if (this.z != null) {
          this.I2();
          this.F2();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "onStop", objArray);
       if (!this.r2()) {
          return;
       }
       this.y2();
       return;
    }
    public void p2(){
       if (PatchProxy.applyVoid(null, this, d.class, "16")) {
          return;
       }
       if (!this.r2()) {
          return;
       }
       long l = this.k2();
       if (!l) {
          this.E2(0);
          this.z2();
       }else {
          this.E2(l);
       }
       return;
    }
    public void q1(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "14")) {
          return;
       }
       a0.g(this);
       Object[] objArray1 = new Object[0];
       a.D().A("UseSampleController", "onCaptureInterrupted", objArray1);
       if (!this.r2()) {
          return;
       }
       if (!this.a2() && this.w != null) {
          Object obj = PatchProxy.apply(objArray, this, uod, "51");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.f0();
          if (b && this.r2()) {
             this.E2(0);
             this.y2();
          }
       }
    label_0053 :
       return;
    }
    public boolean r2(){
       boolean b = (this.F != null)? true: false;
       return b;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, d.class, "15")) {
          return;
       }
       a0.m(this);
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "onRemoveLastSegment", objArray);
       if (!this.r2()) {
          return;
       }
       k1.s(new u(this), this, 0);
       return;
    }
    public void s2(h p0){
       Object[] objArray1;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "3")) {
          return;
       }
       String str = "UseSampleController";
       if (!a1.i(this.e)) {
          Object[] objArray = new Object[0];
          a.D().A(str, "mActivity is not Available!", objArray);
          return;
       }else {
          boolean b = true;
          if (this.D == null) {
             if (this.o != null) {
                this.t2(p0.d);
             }else {
                objArray1 = new Object[0];
                a.D().t(str, "init view error", objArray1);
             }
             this.D = b;
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, uod, "37")) {
             d tF = this.F;
             boolean b2 = (tF != null && tF.e != null)? true: false;
             if (this.r2()) {
                if (this.z != null) {
                   this.I2();
                }
                this.h2();
             }
             this.F = p0;
             if (!PatchProxy.applyVoid(null, this, uod, "41")) {
                Object[] objArray2 = new Object[0];
                a.D().A(str, "preparePlayer", objArray2);
                this.B2();
                this.w = this.i2();
                if (this.w != null) {
                   this.w.setSpeed(this.G);
                   this.w.c(new c(this));
                   this.w.b(new d0(this));
                   this.w.g(new b0(this));
                   this.w.e(new c0(this));
                   if (this.y != null && this.w.getSurface() == null) {
                      if (this.z != null) {
                         this.w.setSurface(this.x);
                      }else {
                         this.w.setSurface(this.y);
                      }
                   }
                   this.w.prepareAsync();
                }
             }
             if (p0.e == null || (p0.f != null && !b2)) {
                b = false;
             }
             p0.e = b;
             if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uod, "40")) {
                objArray1 = new Object[0];
                a.D().A(str, "prepareView", objArray1);
                int i = 8;
                if (this.z == null) {
                   tF = this.q;
                   int i1 = (b)? 0: 8;
                   tF.setVisibility(i1);
                   this.r.setVisibility(i);
                }else {
                   this.q.setVisibility(i);
                   tF = this.r;
                   if (b) {
                      i = 0;
                   }
                   tF.setVisibility(i);
                }
                if (s6.H()) {
                   this.q.getImageView().setImageResource(R.drawable.arg_RES_7f080140);
                   this.r.getImageView().setImageResource(R.drawable.arg_RES_7f080140);
                   this.q.getImageView().setVisibility(0);
                   this.r.getImageView().setVisibility(0);
                   this.q.setAlpha(0x3f4ccccd);
                }else {
                   this.q.setAlpha(0);
                }
                this.s.setVisibility(0);
                this.t.setVisibility(0);
                this.s.setSelected(b);
                this.K2();
             }
          }
          h b1 = p0.b;
          if (b1 != null) {
             if (!PatchProxy.applyVoidOneRefs(b1, this, uod, "25")) {
                this.t.A(w0.f(b1), 0, 0);
             }
          }else {
             p0 = p0.c;
             if (p0 != null && !PatchProxy.applyVoidOneRefs(p0, this, uod, "26")) {
                this.t.U(p0);
             }
          }
          return;
       }
    }
    public void t2(float p0){
       Object[] objArray1;
       boolean b;
       int i2;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uod, "4")) {
          return;
       }
       d to = this.o;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(to, Float.valueOf(p0), this, uod, "24")) {
          ViewStub viewStub = to.findViewById(R.id.use_sample_view_stub);
          ViewStub viewStub1 = to.findViewById(R.id.follow_shoot_use_sample_btn_layout_stub);
          int i = 0x7f0a0f88;
          this.q = (viewStub != null)? new b(viewStub).a(i): to.findViewById(i);
          d tf = this.f;
          if (tf instanceof c) {
             j oj = tf.E6();
             if (oj.r2() instanceof AbsRecordSideBarViewBinder) {
                AbsRecordSideBarViewBinder uAbsRecordSi = oj.r2();
             label_0075 :
                Object[] objArray = (uAbsRecordSi == null)? null: uAbsRecordSi.I();
                int i1 = 0x7f0a0f8a;
                View view = b.b(objArray, to, viewStub1, i1);
                this.s = view;
                if (view == null) {
                   this.s = to.findViewById(i1);
                }
                objArray = (uAbsRecordSi == null)? null: uAbsRecordSi.H();
                i1 = 0x7f0a0f89;
                PressedImageView pressedImage = b.b(objArray, to, viewStub1, i1);
                this.t = pressedImage;
                if (pressedImage == null) {
                   this.t = to.findViewById(i1);
                }
                if (s6.H()) {
                   d tt = this.t;
                   if (tt != null) {
                      tt.setPlaceHolderImage(R.drawable.arg_RES_7f080c6e);
                   }
                }
                objArray = (uAbsRecordSi == null)? null: uAbsRecordSi.J();
                i1 = 0x7f0a0f8c;
                ImageView imageView = b.b(objArray, to, viewStub1, i1);
                this.u = imageView;
                if (imageView == null) {
                   this.u = to.findViewById(i1);
                }
                objArray1 = (uAbsRecordSi == null)? null: uAbsRecordSi.K();
                i = 0x7f0a0f8d;
                TextView textView = b.b(objArray1, to, viewStub1, i);
                this.v = textView;
                if (textView == null) {
                   this.v = to.findViewById(i);
                }
                if (s6.m()) {
                   to = this.u;
                   if (to != null) {
                      to.setImageResource(R.drawable.arg_RES_7f081bfa);
                      i.b(this.v);
                   }
                }
                to = this.s;
                b = true;
                if (to != null) {
                   to.setVisibility(8);
                   this.s.setSelected(b);
                   this.d.j().addView(this.t);
                }
                if (this.u != null) {
                   this.d.j().addView(this.u);
                }
                if (a1.i(this.e)) {
                   AnimCameraView uAnimCameraV = this.d.b().z7();
                   if (uAnimCameraV instanceof AdjustableCameraView) {
                      this.p = uAnimCameraV;
                   }
                   to = this.p;
                   if (to != null) {
                      d te = this.e;
                      if (te instanceof CameraActivity) {
                         to.setEnableFrameNewRule(te.o1());
                      }
                   }
                   ViewStub viewStub2 = this.e.findViewById(R.id.background_sample_video_view);
                   i2 = 0x7f0a03a7;
                   if (viewStub2 != null) {
                      this.r = new b(viewStub2).a(i2);
                   }else {
                      this.r = this.e.findViewById(i2);
                   }
                }
                this.q.setGestureEnable(b);
                this.q.setSwitchEnable(b);
                to = this.q;
                Objects.requireNonNull(to);
                if (!PatchProxy.isSupport(SampleVideoView.class) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, to, SampleVideoView.class, "14")) {
                   to.l.b(b);
                   to.g.setOutlineProvider(new s(to));
                   to.g.setClipToOutline(b);
                   to.h.setOutlineProvider(new t(to));
                   to.h.setClipToOutline(b);
                }
                this.d.j().addView(this.q);
                ViewGroup$LayoutParams layoutParams = this.q.getLayoutParams();
                RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(this.r.getTextureView().getLayoutParams());
                if (p0 - 0x3f800000 > 0) {
                   i2 = d.H;
                   layoutParams.height = (int)((float)i2 * p0);
                   layoutParams.width = i2;
                }else {
                   i2 = d.H;
                   layoutParams.height = i2;
                   layoutParams.width = (int)((float)i2 / p0);
                }
                layoutParams1.width = a1.h();
                layoutParams1.height = (int)((float)a1.h() * p0);
                int i3 = ((a1.g() + n.q(this.e)) - layoutParams1.height) / 2;
                if (i3 < 0) {
                   i3 = 0;
                }
                layoutParams1.topMargin = i3;
                this.r.getTextureView().setLayoutParams(layoutParams1);
                this.r.getImageView().setLayoutParams(layoutParams1);
                this.q.setLayoutParams(layoutParams);
                this.q.setX((float)a1.d(R.dimen.arg_RES_7f07034b));
                View view1 = this.o.findViewById(R.id.button_close);
                if (view1 != null) {
                   view1.post(new x(this, view1));
                }
             }
          }
          objArray1 = null;
          goto label_0075 ;
       }
       if (!PatchProxy.applyVoid(null, this, uod, "27")) {
          this.s.setOnClickListener(new r(this));
          this.q.getTextureView().setSurfaceTextureListener(new j0(this));
          this.r.getTextureView().setSurfaceTextureListener(new k0(this));
          this.q.setListener(new e0(this));
          this.r.setListener(new e0(this));
          this.p.setListener(new l0(this));
       }
       this.o.getViewTreeObserver().addOnGlobalLayoutListener(new d$a(this));
       return;
    }
    public boolean u2(){
       return this.z;
    }
    public boolean v2(){
       d obj = PatchProxy.apply(null, this, d.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s;
       boolean b = (obj != null && obj.isSelected())? true: false;
       return b;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       super.w1(p0);
       this.d.l(b.class, new t(this));
       this.d.l(l0.class, new g0(this));
       return;
    }
    public abstract boolean w2();
    public void x(View p0,boolean p1,int p2,int p3){
       h g;
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, d.class, "19")) {
          return;
       }
       if (this.r2()) {
          d tq = this.q;
          Objects.requireNonNull(tq);
          if (!PatchProxy.isSupport(SampleVideoView.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p1), Integer.valueOf(p3), tq, SampleVideoView.class, "11")) {
             tq.d = p1;
             SampleVideoView k = tq.k;
             Objects.requireNonNull(k);
             if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(tq, Boolean.valueOf(p1), Integer.valueOf(p3), k, h.class, "3")) {
                int i = 2;
                int i1 = (tq.getHeight() - tq.getWidth()) / i;
                k.e = p1;
                tq.animate().cancel();
                k.d(tq, i1);
                h a = k.a;
                if (a != null) {
                   if (a != 1) {
                      if (a != i) {
                         if (a != 3) {
                            Object[] objArray = new Object[0];
                            a.D().A("FollowShootSnapEdgeHelp", "position undefined", objArray);
                         }else {
                            i = k.d - tq.getWidth();
                            i = (p1)? i - k.g: i - i1;
                            tq.animate().translationX((float)i).setDuration((long)p3).start();
                         }
                      }else if(p1){
                         i1 = k.g;
                      }
                      tq.animate().translationX((float)i1).setDuration((long)p3).start();
                   }else {
                      i = (k.c - tq.getHeight()) - k.g;
                      if (!p1) {
                         i = i + i1;
                      }
                      tq.animate().translationY((float)i).setDuration((long)p3).start();
                   }
                }else if(p1){
                   g = k.g;
                }else {
                   g = - i1;
                }
                tq.animate().translationY((float)g).setDuration((long)p3).start();
             }
          }
       }
       return;
    }
    public void y2(){
       if (PatchProxy.applyVoid(null, this, d.class, "48")) {
          return;
       }
       if (this.w != null) {
          this.w.pause();
       }
       return;
    }
    public void z2(){
       if (PatchProxy.applyVoid(null, this, d.class, "32")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "play", objArray);
       if (!this.g2()) {
          return;
       }
       this.D2();
       this.A2();
       return;
    }
}
