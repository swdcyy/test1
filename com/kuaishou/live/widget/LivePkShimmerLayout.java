package com.kuaishou.live.widget.LivePkShimmerLayout;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.graphics.PaintFlagsDrawFilter;
import ll8.c$b;
import android.content.res.TypedArray;
import android.widget.LinearLayout;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.animation.ValueAnimator;
import java.lang.Float;
import android.graphics.DrawFilter;
import android.graphics.Path;
import java.lang.Long;
import com.kuaishou.live.widget.a;
import java.lang.Runnable;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.res.Resources;
import java.util.concurrent.TimeUnit;
import crd.b;
import lnc.b9;
import brd.t;
import qq3.f;
import erd.g;
import android.graphics.RectF;
import android.view.View;
import java.lang.Boolean;
import android.animation.TimeInterpolator;

public class LivePkShimmerLayout extends SelectShapeLinearLayout	// class@00101d
{
    public Path c;
    public int d;
    public int e;
    public int f;
    public int g;
    public Shader h;
    public int[] i;
    public float[] j;
    public Paint k;
    public ValueAnimator l;
    public Matrix m;
    public int n;
    public b o;
    public TimeInterpolator p;
    public boolean q;
    public boolean r;
    public final DrawFilter s;
    public boolean t;
    public Runnable u;
    public static final int v;

    public void LivePkShimmerLayout(Context p0){
       super(p0, null);
    }
    public void LivePkShimmerLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePkShimmerLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int[] ointArray = new int[]{0,this.j(0x7f060620),this.j(0x7f062051),this.j(0x7f060620),0};
       this.i = ointArray;
       this.j = new float[5]{0x3e99999a,0x3eb33333,0x3f000000,0x3f266666,0x3f333333};
       this.k = new Paint();
       this.m = new Matrix();
       this.n = 30;
       this.r = true;
       this.s = new PaintFlagsDrawFilter(0, 3);
       if (p1 != null || p2) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.I2, p2, 0);
          this.n = typedArray.getInteger(1, 30);
          this.d = typedArray.getDimensionPixelSize(4, 0);
          this.e = typedArray.getDimensionPixelSize(5, 0);
          this.g = typedArray.getDimensionPixelSize(2, 0);
          this.f = typedArray.getDimensionPixelSize(3, 0);
          this.t = typedArray.getBoolean(0, 0);
          typedArray.recycle();
       }
       this.setWillNotDraw(0);
       this.o();
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkShimmerLayout.class, "6")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       super.dispatchDraw(p0);
       if (this.h == null) {
          LinearGradient linearGradie = new LinearGradient(0, (float)(this.getHeight() / 2), (float)this.getWidth(), (float)(this.getHeight() / 2), this.i, this.j, Shader$TileMode.CLAMP);
          this.h = v0;
          this.k.setShader(v0);
       }
       this.m.reset();
       LivePkShimmerLayout tl = this.l;
       float f = 0;
       if (tl == null || !tl.isRunning()) {
          this.m.postTranslate((float)(- this.getWidth()), f);
       }else {
          this.m.setRotate((float)this.n, (float)(this.getWidth() / 2), (float)(this.getHeight() / 2));
          this.m.postTranslate(this.l.getAnimatedValue().floatValue(), f);
       }
       this.k.getShader().setLocalMatrix(this.m);
       if (this.t != null) {
          p0.setDrawFilter(this.s);
       }
       p0.drawPath(this.c, this.k);
       return;
    }
    public final void i(long p0){
       if (PatchProxy.isSupport(LivePkShimmerLayout.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LivePkShimmerLayout.class, "10")) {
          return;
       }
       this.k();
       a uoa = new a(this, p0);
       this.u = uoa;
       this.post(uoa);
       return;
    }
    public final int j(int p0){
       if (PatchProxy.isSupport(LivePkShimmerLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LivePkShimmerLayout.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return this.getResources().getColor(p0);
       }catch(java.lang.Exception e0){
          return 0;
       }
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, LivePkShimmerLayout.class, "12")) {
          return;
       }
       LivePkShimmerLayout tu = this.u;
       if (tu != null) {
          this.removeCallbacks(tu);
       }
       return;
    }
    public void l(long p0,int p1,long p2,TimeUnit p3){
       LivePkShimmerLayout livePkShimme = this;
       if (PatchProxy.isSupport(LivePkShimmerLayout.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), p3, this, LivePkShimmerLayout.class, "8")) {
          return;
       }
       if (livePkShimme.l == null && livePkShimme.q == null) {
          b9.a(livePkShimme.o);
          livePkShimme.o = t.intervalRange(0, (long)p1, 0, p2, p3).subscribe(new f(livePkShimme, p0));
       }
       return;
    }
    public void m(long p0){
       if (PatchProxy.isSupport(LivePkShimmerLayout.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LivePkShimmerLayout.class, "9")) {
          return;
       }
       this.i(p0);
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, LivePkShimmerLayout.class, "11")) {
          return;
       }
       b9.a(this.o);
       this.k();
       LivePkShimmerLayout tl = this.l;
       if (tl != null && tl.isRunning()) {
          this.l.end();
          this.l.removeAllUpdateListeners();
       }
       this.l = null;
       return;
    }
    public final void o(){
       LivePkShimmerLayout td;
       if (PatchProxy.applyVoid(null, this, LivePkShimmerLayout.class, "3")) {
          return;
       }
       Path path = new Path();
       int measuredWidt = this.getMeasuredWidth();
       int measuredHeig = this.getMeasuredHeight();
       path.moveTo(0, (float)this.d);
       if (this.d != null) {
          td = this.d;
          path.arcTo(new RectF(0, 0, (float)(td * 2), (float)(td * 2)), -180.00f, 90.00f);
       }
       path.lineTo((float)(measuredWidt - this.e), 0);
       if (this.e != null) {
          td = this.e;
          path.arcTo(new RectF((float)(measuredWidt - (td * 2)), 0, (float)measuredWidt, (float)(td * 2)), -90.00f, 90.00f);
       }
       float f = (float)measuredWidt;
       path.lineTo(f, (float)(measuredHeig - this.f));
       if (this.f != null) {
          LivePkShimmerLayout tf = this.f;
          path.arcTo(new RectF((float)(measuredWidt - (tf * 2)), (float)(measuredHeig - (tf * 2)), f, (float)measuredHeig), 0, 90.00f);
       }
       f = (float)measuredHeig;
       path.lineTo((float)this.g, f);
       if (this.g != null) {
          td = this.g;
          path.arcTo(new RectF(0, (float)(measuredHeig - (td * 2)), (float)(td * 2), f), 90.00f, 90.00f);
       }
       path.close();
       path.offset(0, 0);
       this.c = path;
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LivePkShimmerLayout.class, "4")) {
          return;
       }
       super.onAttachedToWindow();
       this.q = false;
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LivePkShimmerLayout.class, "5")) {
          return;
       }
       super.onDetachedFromWindow();
       this.q = true;
       this.n();
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LivePkShimmerLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LivePkShimmerLayout.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.o();
       return;
    }
    public void setEnablePressedAlphaEffect(boolean p0){
       this.r = p0;
    }
    public void setGradientColors(int[] p0){
       this.i = p0;
    }
    public void setGradientPosition(float[] p0){
       this.j = p0;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(LivePkShimmerLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LivePkShimmerLayout.class, "1")) {
          return;
       }
       super.setPressed(p0);
       if (this.r != null) {
          float f = (p0)? 0x3f000000: 0x3f800000;
          this.setAlpha(f);
       }
       return;
    }
    public void setRotateAngle(int p0){
       this.n = p0;
    }
    public void setShimmerBottomLeftRadius(int p0){
       this.g = p0;
    }
    public void setShimmerBottomRightRadius(int p0){
       this.f = p0;
    }
    public void setShimmerTopLeftRadius(int p0){
       this.d = p0;
    }
    public void setShimmerTopRightRadius(int p0){
       this.e = p0;
    }
    public void setTimeInterpolator(TimeInterpolator p0){
       this.p = p0;
    }
}
