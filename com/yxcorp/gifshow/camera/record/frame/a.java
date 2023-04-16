package com.yxcorp.gifshow.camera.record.frame.a;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.frame.c$e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.constraintlayout.widget.Guideline;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import android.animation.ValueAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import kd9.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.camera.record.frame.a$a;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import oc9.w;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import android.app.Activity;
import sm6.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import java.lang.Math;
import com.yxcorp.gifshow.camera.record.frame.a$b;
import java.lang.Enum;
import u36.b;
import u36.b$a;
import ca9.a;
import ca9.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.graphics.Rect;
import android.widget.FrameLayout;
import com.kwai.feature.post.api.util.g;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView;
import hd9.n;
import h80.h;
import h80.k;
import java.lang.Boolean;
import android.widget.RelativeLayout$LayoutParams;

public class a extends d	// class@000dd7
{
    public AnimCameraView n;
    public View o;
    public Guideline p;
    public CameraView q;
    public ValueAnimator r;
    public c$e s;

    public void a(CameraPageType p0,b p1,c$e p2){
       super(p0, p1);
       this.s = p2;
    }
    public void f2(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "6")) {
          return;
       }
       uoa = this.p;
       if (uoa != null) {
          uoa.setGuidelineEnd(p0);
       }
       return;
    }
    public void g2(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "5")) {
          return;
       }
       uoa = this.o;
       if (uoa != null && uoa.getHeight() > 0) {
          ViewGroup$LayoutParams layoutParams = this.o.getLayoutParams();
          if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
             layoutParams.topMargin = (p1 + p0) - this.o.getHeight();
             this.o.setLayoutParams(layoutParams);
          }
       }
       return;
    }
    public void h2(View p0,int p1,int p2,int p3,int p4){
       a uoa = a.class;
       int i = 2;
       int i1 = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "9")) {
             return;
          }
       }
       Object[] objArray1 = new Object[i1];
       a.D().w("CameraViewFrameController", "animSwitch originHeight:"+p1+" , originTop:"+p2+" , targetHeight:"+p3+" , targetTop:"+p4, objArray1);
       if (this.p2()) {
          this.r.end();
       }
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[i]{0,0x3f800000}).setDuration(300);
       this.r = valueAnimato;
       valueAnimato.setInterpolator(new e());
       b uob = new b(p0, p1, p3, p2, p4);
       this.r.addUpdateListener(v7);
       this.r.addListener(new a$a(this));
       this.r.start();
       return;
    }
    public AnimCameraView i2(){
       return this.n;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.k(p0);
       this.n = this.d.b().z7();
       this.o = p0.findViewById(0x7f0a0616);
       this.p = p0.findViewById(0x7f0a0081);
       CameraView cameraView = this.n.getCameraView();
       this.q = cameraView;
       cameraView.setRatio(0xbf800000);
       if (this.s.o1()) {
          this.f2(b.e(this.e));
       }else {
          this.f2(b.g(this.e));
       }
       return;
    }
    public View k2(){
       return this.q;
    }
    public int l2(int p0,int p1,int p2){
       Object[] obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Object[] objArray = new Object[0];
       a.D().s("CameraViewFrameController", "getCameraViewTopMargin", objArray);
       p0 = Math.max(0, this.m2(p0, p1, p2, this.s.u1()));
       obj = new Object[0];
       a.D().s("CameraViewFrameController", "getCameraViewTopMargin...topMargin: "+p0, obj);
       return p0;
    }
    public final int m2(int p0,int p1,int p2,CameraFramePageType p3){
       int[] obj;
       Rect top;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), p3, this, a.class, "8");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       obj = a$b.a;
       int i = obj[p3.ordinal()];
       int i1 = 0;
       if (i != 1 && (i != 2 && i != 3)) {
          if (i != 4) {
             if (i != 5) {
                p0 = b.f(p0, p1, p2, this.e, this.s.o1());
             }else {
                d te = this.e;
                top = b.r(b.class, b$a.b).HU(te, te.findViewById(0x7f0a0612)).top;
             }
          }else {
             ViewGroup$MarginLayoutParams layoutParams = this.i2().getLayoutParams();
             float f = g.d(p0, this.e, this.s.o1());
             if (!f) {
                Object[] objArray = new Object[i1];
                a.D().A("CameraViewFrameController", "getTopMargin ratio == 0", objArray);
                top = layoutParams.topMargin;
             }else {
                i = n.k(this.e);
                p0 = this.m2(p0, i, (int)(((float)i / f) + 0x3f000000), CameraFramePageType.RECORD);
                if (this.i2() instanceof AdjustableCameraView) {
                   this.i2().setLastMarginTop(p0);
                }
                if (this.d.d(n.j).d != null) {
                   top = layoutParams.topMargin;
                }
             }
          }
       }else {
          h oh = k.c();
          if (p0 == 1 && (oh != null && oh.d())) {
             oh = PatchProxy.apply(null, this, a.class, "13");
             if (oh != patchProxyRe) {
                i1 = oh.booleanValue();
             }else {
                i = obj[this.s.u1().ordinal()];
                if (i != 1 && (i != 2 && i != 4)) {
                   i1 = true;
                }
             }
             if (i1) {
                p0 = n.j(this.e) - p2;
             }
          }
       label_0105 :
          p0 = this.m2(p0, p1, p2, CameraFramePageType.DEFAULT);
       }
       return p0;
    }
    public void n2(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (this.s.u1() == CameraFramePageType.SAME_FRAME) {
          RelativeLayout$LayoutParams layoutParams = this.n.getLayoutParams();
          layoutParams.addRule(10);
          this.n.setLayoutParams(layoutParams);
       }
       return;
    }
    public boolean o2(){
       Object obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.s.u1() == CameraFramePageType.FOLLOW_SHOOT) {
          return (this.d.d(n.j).d ^ 1);
       }
       if (this.c == CameraPageType.LIVE_AVATAR || this.s.u1() == CameraFramePageType.STATE_SHOOT) {
          return false;
       }
       return 1;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       super.onDestroyView();
       if (this.p2()) {
          this.r.cancel();
       }
       return;
    }
    public boolean p2(){
       a obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.r;
       boolean b = (obj != null && obj.isRunning())? true: false;
       return b;
    }
    public void r2(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       if (this.s.u1() == CameraFramePageType.FOLLOW_SHOOT) {
          return;
       }
       uoa = this.o;
       if (uoa != null) {
          int i = (p0)? 0: 8;
          uoa.setVisibility(i);
       }
       return;
    }
}
