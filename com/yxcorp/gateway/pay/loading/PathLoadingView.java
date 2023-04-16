package com.yxcorp.gateway.pay.loading.PathLoadingView;
import mv8.f;
import android.view.View;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import lv8.c;
import android.graphics.Paint;
import mv8.a;
import android.util.AttributeSet;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import mv8.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import mv8.d;
import android.graphics.PathEffect;
import android.graphics.DashPathEffect;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.gateway.pay.loading.LoadingStyle;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.animation.AnimatorSet;
import android.os.Build$VERSION;
import android.animation.ValueAnimator;
import mv8.c;
import java.util.ArrayList;
import java.util.Iterator;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import java.lang.Integer;
import java.lang.Math;
import com.yxcorp.gateway.pay.loading.PathLoadingView$a;
import java.lang.Enum;

public class PathLoadingView extends View implements f	// class@001228
{
    public final float b;
    public float c;
    public float d;
    public final float e;
    public Path f;
    public float g;
    public LinearGradient h;
    public Paint i;
    public boolean j;
    public boolean k;
    public AnimatorSet l;
    public AnimatorSet m;
    public LoadingStyle n;
    public d o;
    public c p;

    public void PathLoadingView(Context p0){
       super(p0);
       float f = c.c(this.getResources()).density / 2.00f;
       this.b = f;
       this.c = 0xbf800000;
       this.d = f;
       this.e = (float)c.b(this.getContext(), 40.00f);
       this.i = new Paint(1);
       this.p = new a(this);
       this.c(p0, null);
    }
    public void PathLoadingView(Context p0,AttributeSet p1){
       super(p0, p1);
       float f = c.c(this.getResources()).density / 2.00f;
       this.b = f;
       this.c = 0xbf800000;
       this.d = f;
       this.e = (float)c.b(this.getContext(), 40.00f);
       this.i = new Paint(1);
       this.p = new a(this);
       this.c(p0, p1);
    }
    public void PathLoadingView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       float f = c.c(this.getResources()).density / 2.00f;
       this.b = f;
       this.c = 0xbf800000;
       this.d = f;
       this.e = (float)c.b(this.getContext(), 40.00f);
       this.i = new Paint(1);
       this.p = new a(this);
       this.c(p0, p1);
    }
    public static void a(PathLoadingView p0,Animator p1){
       PathLoadingView k = p0.k;
       p0.setWillNotDraw((k ^ 0x01));
       p0.h();
       if (k != null) {
          p0.g();
       }else {
          p0.d(true);
       }
       return;
    }
    public final void b(float p0,boolean p1){
       DashPathEffect uDashPathEff;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.isSupport(PathLoadingView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Boolean.valueOf(p1), this, PathLoadingView.class, "17")) {
          return;
       }
       PathLoadingView obj = PatchProxy.applyOneRefs(this, null, uoe, "6");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): this.isAttachedToWindow() ^ 1;
       if (!b && this.isShown()) {
          if (this.k == null && this.j == null) {
             return;
          }else {
             obj = this.o;
             if (obj != null) {
                float f = 2.00f;
                float f1 = (p1)? ((0x3f800000 - p0) / f) + 0x3f000000: p0 / f;
                if (this.c - f1) {
                   obj.a(f1);
                   this.c = f1;
                }
             }
             obj = this.i;
             PathLoadingView tg = this.g;
             if (PatchProxy.isSupport(uoe)) {
                uDashPathEff = PatchProxy.applyThreeRefs(Float.valueOf(tg), Float.valueOf(p0), Boolean.valueOf(p1), null, e.class, "4");
                if (uDashPathEff != patchProxyRe) {
                label_009c :
                   obj.setPathEffect(uDashPathEff);
                   this.invalidate();
                }
             }
             p0 = p0 * tg;
             float[] uofloatArray = new float[]{tg,tg};
             if (p1) {
                p0 = - p0;
             }
             uDashPathEff = new DashPathEffect(uofloatArray, p0);
             goto label_009c ;
          }
       }
       return;
    }
    public final void c(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PathLoadingView.class, "12")) {
          return;
       }
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Q3, 0, 0);
       float dimension = typedArray.getDimension(1, (float)c.b(this.getContext(), 2.50f));
       typedArray.recycle();
       this.setLoadingStyle(LoadingStyle.fromOrdinal(typedArray.getInt(2, LoadingStyle.GRAY.value)));
       this.setStrokeWidth(dimension);
       this.i.setStyle(Paint$Style.STROKE);
       this.i.setStrokeCap(Paint$Cap.ROUND);
       this.f = e.d();
       this.g = new PathMeasure(this.f, 0).getLength();
       this.l = this.f(0);
       if (Build$VERSION.SDK_INT < 28) {
          this.setLayerType(1, null);
       }
       return;
    }
    public void d(boolean p0){
       if (PatchProxy.isSupport(PathLoadingView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PathLoadingView.class, "7")) {
          return;
       }
       this.k = false;
       this.j = false;
       this.h();
       if (p0) {
          return;
       }
       PathLoadingView tl = this.l;
       if (tl != null) {
          tl.end();
          this.l.cancel();
       }
       this.setWillNotDraw(true);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, PathLoadingView.class, "6")) {
          return;
       }
       this.d(false);
       return;
    }
    public final AnimatorSet f(float p0){
       float[] obj;
       if (PatchProxy.isSupport(PathLoadingView.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, PathLoadingView.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0x3f800000;
       float[] uofloatArray = null;
       if (p0 - uofloatArray <= 0 || p0 - i >= 0) {
          p0 = 0;
       }
       float f = 2.00f;
       if (p0 - 0x3f000000 < 0) {
          uofloatArray = new float[]{p0 * f,i};
          Animator[] uAnimatorArr = new Animator[]{e.c(this, 0, uofloatArray),e.c(this, 1, new float[2]{0x3f800000,0})};
          return e.b(this.p, uAnimatorArr);
       }else {
          obj = new float[]{f - (p0 * f),uofloatArray};
          Animator[] uAnimatorArr1 = new Animator[]{e.c(this, 1, obj)};
          return e.b(this.p, uAnimatorArr1);
       }
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, PathLoadingView.class, "13")) {
          return;
       }
       this.k = true;
       PathLoadingView tl = this.l;
       if (tl != null) {
          tl.start();
       }
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, PathLoadingView.class, "15")) {
          return;
       }
       PathLoadingView tm = this.m;
       if (tm != null) {
          Iterator iterator = tm.getChildAnimations().iterator();
          while (iterator.hasNext()) {
             iterator.next().removeAllListeners();
          }
          this.m.removeAllListeners();
          this.m.end();
          this.m.cancel();
          this.m = null;
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, PathLoadingView.class, "2")) {
          return;
       }
       this.e();
       super.onDetachedFromWindow();
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PathLoadingView.class, "3")) {
          return;
       }
       super.onDraw(p0);
       p0.scale(this.d, this.d);
       if (PatchProxy.applyVoid(null, this, PathLoadingView.class, "18") || (this.n == LoadingStyle.GRADIENT && this.h == null)) {
          LinearGradient linearGradie = new LinearGradient(0, ((float)this.getHeight() / 2.00f), ((float)this.getWidth() / 2.00f), 0, e.a(this.getContext(), 0x7f061c50), e.a(this.getContext(), 0x7f061c4f), Shader$TileMode.CLAMP);
          this.h = v0;
          this.i.setShader(v0);
       }
    label_0061 :
       p0.drawPath(this.f, this.i);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(PathLoadingView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, PathLoadingView.class, "1")) {
          return;
       }
       PathLoadingView te = this.e;
       this.d = this.b * Math.min(((float)p0 / te), ((float)p1 / te));
       return;
    }
    public void setLoadingProgressListener(d p0){
       this.o = p0;
    }
    public void setLoadingStyle(LoadingStyle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PathLoadingView.class, "11")) {
          return;
       }
       this.n = p0;
       this.h = null;
       this.i.setShader(null);
       int i = PathLoadingView$a.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                i = (i != 4)? -1: 0x7f061c54;
             }else {
                i = 0x7f061c52;
             }
          }else {
             i = 0x7f061c53;
          }
       }else {
          i = 0x7f061c51;
       }
       if (i != -1) {
          this.i.setColor(e.a(this.getContext(), i));
       }
       return;
    }
    public void setPhase(float p0){
       if (PatchProxy.isSupport(PathLoadingView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PathLoadingView.class, "8")) {
          return;
       }
       this.b(p0, false);
       return;
    }
    public void setPhaseReverse(float p0){
       if (PatchProxy.isSupport(PathLoadingView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PathLoadingView.class, "9")) {
          return;
       }
       this.b(p0, true);
       return;
    }
    public void setStrokeWidth(float p0){
       if (PatchProxy.isSupport(PathLoadingView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PathLoadingView.class, "10")) {
          return;
       }
       this.i.setStrokeWidth(p0);
       return;
    }
}
