package com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import sm6.b;
import pi9.h;
import android.content.res.Resources;
import android.widget.FrameLayout;
import cw9.c;
import hd9.q;
import android.view.ViewGroup;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.imageview.ForegroundImageView;
import com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView$b;
import android.view.ViewOutlineProvider;
import com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView$c;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView$a;
import java.util.Objects;
import java.lang.Integer;
import android.view.View;
import j8c.a;
import q87.c;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import pi9.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import pi9.g;
import android.animation.Animator$AnimatorListener;
import java.lang.Math;
import com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView$d;
import android.view.GestureDetector;
import com.yxcorp.gifshow.camera.record.widget.a;
import android.view.GestureDetector$OnGestureListener;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Point;

public class AdjustableCameraView extends AnimCameraView	// class@000faf
{
    public GestureDetector i;
    public AdjustableCameraView$d j;
    public h k;
    public q l;
    public float m;
    public float n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public boolean v;
    public boolean w;
    public static final int x;

    static {
       AdjustableCameraView.x = a1.e(0x42fc0000);
    }
    public void AdjustableCameraView(Context p0){
       super(p0, null);
    }
    public void AdjustableCameraView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void AdjustableCameraView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.o = a1.g();
       this.p = a1.h();
       this.s = true;
       this.v = false;
       this.w = b.d();
       this.k = new h(c.b(this.getResources(), 0x7f07034b));
       this.l = new q(this);
       this.getCameraView().setRatio(0xbf800000);
    }
    public final void d(boolean p0){
       if (PatchProxy.isSupport(AdjustableCameraView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AdjustableCameraView.class, "10")) {
          return;
       }
       ForegroundImageView blurPreviewI = this.getBlurPreviewImage();
       if (p0) {
          this.getCameraView().setOutlineProvider(new AdjustableCameraView$b(this));
          this.getCameraView().setClipToOutline(true);
          if (blurPreviewI != null) {
             blurPreviewI.setOutlineProvider(new AdjustableCameraView$c(this));
             blurPreviewI.setClipToOutline(true);
          }
          this.setBackground(null);
       }else {
          this.getCameraView().setOutlineProvider(null);
          if (blurPreviewI != null) {
             blurPreviewI.setOutlineProvider(null);
          }
          this.setBackgroundColor(this.getResources().getColor(R.color.arg_RES_7f060070));
       }
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdjustableCameraView.class, "4")) {
          return;
       }
       this.l.a(p0);
       super.dispatchDraw(p0);
       return;
    }
    public void e(){
       h g;
       int[] ointArray;
       h g1;
       if (PatchProxy.applyVoid(null, this, AdjustableCameraView.class, "5")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = this.getLayoutParams();
       boolean b = false;
       this.s = b;
       AdjustableCameraView tk = this.k;
       int i = -1;
       AdjustableCameraView$a uoa = new AdjustableCameraView$a(this);
       Objects.requireNonNull(tk);
       if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(this, Integer.valueOf(i), uoa, tk, h.class, "2")) {
          RelativeLayout$LayoutParams layoutParams1 = this.getLayoutParams();
          g = tk.b;
          RelativeLayout$LayoutParams leftMargin = layoutParams1.leftMargin;
          g[2] = leftMargin;
          int i1 = tk.d - leftMargin;
          g[3] = i1 - layoutParams1.width;
          leftMargin = layoutParams1.topMargin;
          g[b] = leftMargin;
          i1 = tk.c - leftMargin;
          g[1] = i1 - layoutParams1.height;
          int i2 = tk.b(g);
          tk.a = i2;
          if (i2) {
             if (i2 != 1) {
                if (i2 != 2) {
                   if (i2 != 3) {
                      Object[] objArray1 = new Object[b];
                      a.D().A("FollowShootSnapEdgeHelp", "position undefined", objArray1);
                      i2 = 0;
                   }else {
                      i2 = tk.d - layoutParams1.width;
                      g1 = tk.g;
                   }
                }else {
                   g = tk.g;
                }
             }else {
                i2 = tk.c - layoutParams1.height;
                g1 = tk.g;
             }
             i2 = i2 - g1;
          }else {
             g = tk.g;
          }
          if (tk.a > 1) {
             ointArray = new int[]{layoutParams1.leftMargin,i2};
             tk.f = ValueAnimator.ofInt(ointArray);
          }else {
             ointArray = new int[]{layoutParams1.topMargin,i2};
             tk.f = ValueAnimator.ofInt(ointArray);
          }
          tk.f.setInterpolator(new AccelerateDecelerateInterpolator());
          tk.f.addUpdateListener(new f(tk, layoutParams1, this));
          tk.f.addListener(new g(tk, uoa));
          tk.f.setDuration((long)h.h);
          tk.f.start();
       }
       AdjustableCameraView tk1 = this.k;
       g = tk1.g;
       i = tk1.c();
       if (i) {
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   Object[] objArray = new Object[b];
                   a.D().A("FollowShootCameraView", "position undefined", objArray);
                }else {
                   this.q = (this.p - layoutParams.width) - c.b(this.getResources(), 0x7f07034b);
                   this.r = Math.max(layoutParams.topMargin, g);
                }
             }else {
                this.q = g;
                this.r = Math.max(layoutParams.topMargin, g);
             }
          }else {
             this.r = this.o - layoutParams.height;
             this.q = Math.max(layoutParams.leftMargin, g);
          }
       }else {
          this.r = g;
          this.q = Math.max(layoutParams.leftMargin, g);
       }
       AdjustableCameraView tj = this.j;
       if (tj != null) {
          tj.b(this.q, this.r);
       }
       return;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdjustableCameraView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       if (!PatchProxy.applyVoid(objArray, this, AdjustableCameraView.class, "7")) {
          this.i = new GestureDetector(this.getContext(), new a(this));
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdjustableCameraView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.t != null || super.onInterceptTouchEvent(p0))? true: false;
       return b;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdjustableCameraView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.getAction() == 1 && this.s != null) {
          this.e();
          float f = 0;
          this.m = f;
          this.n = f;
       }
       return this.i.onTouchEvent(p0);
    }
    public void setEnableFrameNewRule(boolean p0){
       this.w = p0;
    }
    public void setLastMarginTop(int p0){
       this.u = p0;
    }
    public void setLayoutParams(ViewGroup$LayoutParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdjustableCameraView.class, "12")) {
          return;
       }
       super.setLayoutParams(p0);
       return;
    }
    public void setListener(AdjustableCameraView$d p0){
       this.j = p0;
    }
    public void setPreviewSize(Point p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdjustableCameraView.class, "11")) {
          return;
       }
       Point y = p0.y;
       this.o = y;
       p0 = p0.x;
       this.p = p0;
       AdjustableCameraView tk = this.k;
       if (tk != null) {
          tk.e(p0, y);
       }
       return;
    }
}
