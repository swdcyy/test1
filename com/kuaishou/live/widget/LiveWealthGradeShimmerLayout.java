package com.kuaishou.live.widget.LiveWealthGradeShimmerLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import lnc.a1;
import java.lang.String;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import qq3.g;
import com.kuaishou.live.widget.LiveWealthGradeShimmerLayout$a;
import android.graphics.Paint;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import java.lang.Float;
import android.view.ViewGroup;
import android.graphics.Paint$Style;
import java.lang.Boolean;
import java.lang.Integer;
import ekd.j;

public class LiveWealthGradeShimmerLayout extends LinearLayout	// class@001020
{
    public LinearGradient A;
    public boolean B;
    public Shader b;
    public int[] c;
    public float[] d;
    public Paint e;
    public ValueAnimator f;
    public Matrix g;
    public long h;
    public int i;
    public long j;
    public int k;
    public boolean l;
    public RectF m;
    public ValueAnimator$AnimatorUpdateListener n;
    public float o;
    public float[] p;
    public Animator$AnimatorListener q;
    public Paint r;
    public RectF s;
    public RectF t;
    public float u;
    public float v;
    public int w;
    public int x;
    public int[] y;
    public LinearGradient z;
    public static final int C;

    public void LiveWealthGradeShimmerLayout(Context p0){
       super(p0, null);
    }
    public void LiveWealthGradeShimmerLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveWealthGradeShimmerLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int[] ointArray = new int[]{0,a1.a(0x7f060620),Color.parseColor("#B3FFFFFF"),a1.a(0x7f060620),0};
       this.c = ointArray;
       this.d = new float[5]{0x3e99999a,0x3eb33333,0x3f000000,0x3f266666,0x3f333333};
       this.g = new Matrix();
       this.h = 1000;
       this.i = 30;
       this.j = 5000;
       this.k = a1.e(3.00f);
       this.l = false;
       this.m = new RectF();
       this.n = new g(this);
       this.o = 0;
       this.p = null;
       this.q = new LiveWealthGradeShimmerLayout$a(this);
       this.y = new int[2]{0,0};
       Paint paint = new Paint();
       this.e = paint;
       paint.setAntiAlias(1);
       paint = new Paint();
       this.r = paint;
       paint.setAntiAlias(1);
       this.s = new RectF();
       this.t = new RectF();
       this.setWillNotDraw(0);
    }
    public ValueAnimator a(){
       LiveWealthGradeShimmerLayout obj = PatchProxy.apply(null, this, LiveWealthGradeShimmerLayout.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj != null) {
          obj.removeAllUpdateListeners();
          this.f.removeListener(this.q);
          this.f.end();
       }
       ValueAnimator animator = this.getAnimator();
       this.f = animator;
       animator.setDuration(this.h);
       this.f.addUpdateListener(this.n);
       this.f.addListener(this.q);
       return this.f;
    }
    public void b(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWealthGradeShimmerLayout.class, "5")) {
          return;
       }
       if (this.b == null) {
          LinearGradient linearGradie = new LinearGradient(0, (float)(this.getHeight() / 2), (float)this.getWidth(), (float)(this.getHeight() / 2), this.c, this.d, Shader$TileMode.CLAMP);
          this.b = v0;
          this.e.setShader(v0);
       }
       LiveWealthGradeShimmerLayout tf = this.f;
       float f = 0;
       if (tf == null || !tf.isRunning()) {
          this.g.reset();
          this.g.postTranslate((float)(- this.getWidth()), f);
          this.e.getShader().setLocalMatrix(this.g);
       }else {
          this.g.reset();
          this.g.setRotate((float)this.i, (float)(this.getWidth() / 2), (float)(this.getHeight() / 2));
          this.g.postTranslate(this.f.getAnimatedValue().floatValue(), f);
          this.e.getShader().setLocalMatrix(this.g);
       }
       this.m.set(f, f, (float)this.getWidth(), (float)this.getHeight());
       LiveWealthGradeShimmerLayout tk = this.k;
       float f1 = (float)tk;
       p0.drawRoundRect(this.m, f1, (float)tk, this.e);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveWealthGradeShimmerLayout.class, "15")) {
          return;
       }
       LinearGradient linearGradie = new LinearGradient(0, 0, (float)this.getMeasuredWidth(), 0, this.y, this.p, Shader$TileMode.CLAMP);
       this.z = v0;
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveWealthGradeShimmerLayout.class, "16")) {
          return;
       }
       LinearGradient linearGradie = new LinearGradient(0, 0, (float)this.getMeasuredWidth(), 0, this.w, this.x, Shader$TileMode.CLAMP);
       this.A = v0;
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWealthGradeShimmerLayout.class, "4")) {
          return;
       }
       super.dispatchDraw(p0);
       this.b(p0);
       return;
    }
    public ValueAnimator getAnimator(){
       float[] obj = PatchProxy.apply(null, this, LiveWealthGradeShimmerLayout.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new float[]{(float)(- this.getWidth()),(float)this.getWidth()};
       return ValueAnimator.ofFloat(obj);
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveWealthGradeShimmerLayout.class, "1")) {
          return;
       }
       super.onDetachedFromWindow();
       LiveWealthGradeShimmerLayout tf = this.f;
       if (tf != null) {
          tf.removeAllUpdateListeners();
          this.f.removeListener(this.q);
          if (this.f.isRunning()) {
             this.f.end();
          }
       }
       this.f = null;
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWealthGradeShimmerLayout.class, "3")) {
          return;
       }
       super.onDraw(p0);
       if (this.B != null) {
          return;
       }
       LiveWealthGradeShimmerLayout ts = this.s;
       float f = 0;
       ts.left = f;
       float f1 = (float)this.getWidth();
       ts.right = f1;
       ts.top = f;
       float f2 = (float)this.getHeight();
       ts.bottom = f2;
       if (this.z == null) {
          this.c();
       }
       this.r.setStrokeWidth(f);
       this.r.setStyle(Paint$Style.FILL);
       this.r.setShader(this.z);
       p0.drawRoundRect(this.s, this.u, this.u, this.r);
       ts = this.v;
       if (ts - f > 0) {
          LiveWealthGradeShimmerLayout tt = this.t;
          float f3 = 2.00f;
          tt.left = ts / f3;
          tt.right = f1 - (ts / f3);
          tt.top = ts / f3;
          tt.bottom = f2 - (ts / f3);
          if (this.A == null) {
             LinearGradient linearGradie = new LinearGradient(0, 0, (float)this.getMeasuredWidth(), 0, this.w, this.x, Shader$TileMode.CLAMP);
             this.A = f1;
          }
          this.r.setStrokeWidth(this.v);
          this.r.setStyle(Paint$Style.STROKE);
          this.r.setShader(this.A);
          p0.drawRoundRect(this.t, this.u, this.u, this.r);
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveWealthGradeShimmerLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveWealthGradeShimmerLayout.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.c();
       this.d();
       return;
    }
    public void setBackgroundColors(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWealthGradeShimmerLayout.class, "13")) {
          return;
       }
       if (PatchProxy.applyVoidTwoRefs(p0, null, this, LiveWealthGradeShimmerLayout.class, "14") || (!j.g(p0) && p0.length >= 2)) {
          this.y = p0;
          this.p = null;
          this.c();
          this.invalidate();
       }
    label_002c :
       return;
    }
    public void setBorderEndColor(int p0){
       if (PatchProxy.isSupport(LiveWealthGradeShimmerLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveWealthGradeShimmerLayout.class, "12")) {
          return;
       }
       this.x = p0;
       this.d();
       this.invalidate();
       return;
    }
    public void setBorderStartColor(int p0){
       if (PatchProxy.isSupport(LiveWealthGradeShimmerLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveWealthGradeShimmerLayout.class, "11")) {
          return;
       }
       this.w = p0;
       this.d();
       this.invalidate();
       return;
    }
    public void setBorderWidth(float p0){
       this.v = p0;
    }
    public void setRadius(float p0){
       this.u = p0;
    }
    public void setShimmerGradientPosition(float[] p0){
       this.d = p0;
       this.b = null;
    }
    public void setShimmerRadiusDp(int p0){
       if (PatchProxy.isSupport(LiveWealthGradeShimmerLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveWealthGradeShimmerLayout.class, "10")) {
          return;
       }
       this.k = a1.e((float)p0);
       return;
    }
    public void setShimmerRotateAngle(int p0){
       this.i = p0;
    }
    public void setShouldRepeat(boolean p0){
       this.l = p0;
    }
    public void setSimmerGradientColors(int[] p0){
       this.c = p0;
       this.b = null;
    }
}
