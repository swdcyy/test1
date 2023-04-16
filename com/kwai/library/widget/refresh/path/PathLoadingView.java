package com.kwai.library.widget.refresh.path.PathLoadingView;
import q17.a;
import s17.d;
import android.view.View;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import com.yxcorp.utility.n;
import android.graphics.Paint;
import q17.b;
import android.util.AttributeSet;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import s17.c;
import s17.a;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build$VERSION;
import com.kwai.library.widget.refresh.path.PathLoadingView$a;
import java.lang.Enum;
import androidx.core.content.ContextCompat;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import s17.b;
import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import java.lang.Math;

public class PathLoadingView extends View implements a, d	// class@0009de
{
    public final float b;
    public float c;
    public float d;
    public final float e;
    public Path f;
    public float g;
    public LinearGradient h;
    public final Paint i;
    public boolean j;
    public boolean k;
    public AnimatorSet l;
    public AnimatorSet m;
    public LoadingStyle n;
    public b o;
    public final a p;

    public void PathLoadingView(Context p0){
       super(p0);
       float f = c.c(this.getResources()).density / 2.00f;
       this.b = f;
       this.c = 0xbf800000;
       this.d = f;
       this.e = (float)n.c(this.getContext(), 40.00f);
       this.i = new Paint(1);
       this.p = new b(this);
       this.e(p0, null);
    }
    public void PathLoadingView(Context p0,AttributeSet p1){
       super(p0, p1);
       float f = c.c(this.getResources()).density / 2.00f;
       this.b = f;
       this.c = 0xbf800000;
       this.d = f;
       this.e = (float)n.c(this.getContext(), 40.00f);
       this.i = new Paint(1);
       this.p = new b(this);
       this.e(p0, p1);
    }
    public void PathLoadingView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       float f = c.c(this.getResources()).density / 2.00f;
       this.b = f;
       this.c = 0xbf800000;
       this.d = f;
       this.e = (float)n.c(this.getContext(), 40.00f);
       this.i = new Paint(1);
       this.p = new b(this);
       this.e(p0, p1);
    }
    public static void b(PathLoadingView p0,Animator p1){
       PathLoadingView k = p0.k;
       p0.setWillNotDraw((k ^ 0x01));
       p0.h();
       if (k != null) {
          p0.g();
       }else {
          p0.l(true);
       }
       return;
    }
    public void a(){
       this.l(false);
    }
    public final AnimatorSet c(float p0){
       int i = 0x3f800000;
       float[] uofloatArray = null;
       if (p0 - uofloatArray <= 0 || p0 - i >= 0) {
          p0 = 0;
       }
       float f = 2.00f;
       if (p0 - 0x3f000000 < 0) {
          uofloatArray = new float[]{p0 * f,i};
          Animator[] uAnimatorArr = new Animator[]{c.b(this, 0, uofloatArray),c.b(this, 1, new float[2]{0x3f800000,0})};
          return c.a(this.p, uAnimatorArr);
       }else {
          float[] uofloatArray1 = new float[]{f - (p0 * f),uofloatArray};
          Animator[] uAnimatorArr1 = new Animator[]{c.b(this, 1, uofloatArray1)};
          return c.a(this.p, uAnimatorArr1);
       }
    }
    public final AnimatorSet d(boolean p0){
       if (p0 && this.l == null) {
          this.l = this.c(0);
       }
       return this.l;
    }
    public final void e(Context p0,AttributeSet p1){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Y1, 0, 0);
       int intx = typedArray.getInt(4, LoadingStyle.GRAY.value);
       float dimension = typedArray.getDimension(3, (float)n.c(this.getContext(), 2.50f));
       int resourceId = typedArray.getResourceId(0, -2);
       typedArray.recycle();
       this.setWillNotDraw(true);
       this.f(LoadingStyle.fromOrdinal(intx), resourceId);
       this.setStrokeWidth(dimension);
       this.i.setStyle(Paint$Style.STROKE);
       this.i.setStrokeCap(Paint$Cap.ROUND);
       this.f = c.c();
       this.g = new PathMeasure(this.f, 0).getLength();
       if (Build$VERSION.SDK_INT < 28) {
          this.setLayerType(true, null);
       }
       return;
    }
    public void f(LoadingStyle p0,int p1){
       int i = PathLoadingView$a.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 6 && p1 == -2) {
                   label_002b :
                      p1 = 0x7f062146;
                   }
                }else {
                   p1 = 0x7f06214a;
                }
             }else {
                p1 = 0x7f062147;
             }
          }else {
             p1 = 0x7f062148;
          }
       }else {
          goto label_002b ;
       }
       p1 = (p1 != -2)? ContextCompat.getColor(this.getContext(), p1): -2;
       this.n = p0;
       LinearGradient linearGradie = null;
       this.h = linearGradie;
       this.i.setShader(linearGradie);
       if (p1 != -2) {
          this.i.setColor(p1);
       }
       return;
    }
    public final void g(){
       this.k = true;
       AnimatorSet uAnimatorSet = this.d(true);
       if (uAnimatorSet != null) {
          uAnimatorSet.start();
       }
       return;
    }
    public final void h(){
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
    public final void i(float p0,boolean p1){
       if (!c.d(this) && this.isShown()) {
          if (this.k == null && this.j == null) {
             return;
          }else {
             PathLoadingView to = this.o;
             if (to != null) {
                float f = 2.00f;
                float f1 = (p1)? ((0x3f800000 - p0) / f) + 0x3f000000: p0 / f;
                if (this.c - f1) {
                   to.a(f1);
                   this.c = f1;
                }
             }
             to = this.i;
             PathLoadingView tg = this.g;
             p0 = p0 * tg;
             float[] uofloatArray = new float[]{tg,tg};
             if (p1) {
                p0 = - p0;
             }
             to.setPathEffect(new DashPathEffect(uofloatArray, p0));
             this.setWillNotDraw(0);
             this.invalidate();
          }
       }
       return;
    }
    public void k(){
       this.o(0);
    }
    public void l(boolean p0){
       this.k = false;
       this.j = false;
       this.h();
       if (p0) {
          return;
       }
       AnimatorSet uAnimatorSet = this.d(false);
       if (uAnimatorSet != null) {
          uAnimatorSet.end();
          uAnimatorSet.cancel();
       }
       this.setWillNotDraw(true);
       return;
    }
    public void m(float p0){
       this.j = true;
       float f = 0x3f800000;
       if (p0 < 0) {
          p0 = 0;
       }else if(p0 - f > 0){
          p0 = 0x3f800000;
       }
       if (p0 - 0x3f000000 <= 0) {
          this.setPhase((p0 * 2.00f));
       }else {
          this.setPhaseReverse((f - ((p0 - 0x3f000000) * 2.00f)));
       }
       return;
    }
    public boolean n(){
       return this.k;
    }
    public void o(float p0){
       this.j = false;
       this.k = true;
       if (p0 > 0 && p0 - 0x3f800000 < 0) {
          this.h();
          AnimatorSet uAnimatorSet = this.c(p0);
          this.m = uAnimatorSet;
          uAnimatorSet.start();
          return;
       }else {
          this.g();
          return;
       }
    }
    public void onDetachedFromWindow(){
       this.a();
       super.onDetachedFromWindow();
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       p0.scale(this.d, this.d);
       if (this.n == LoadingStyle.GRADIENT && this.h == null) {
          LinearGradient linearGradie = new LinearGradient(0, ((float)this.getHeight() / 2.00f), ((float)this.getWidth() / 2.00f), 0, ContextCompat.getColor(this.getContext(), 0x7f062145), ContextCompat.getColor(this.getContext(), 0x7f062144), Shader$TileMode.CLAMP);
          this.h = v0;
          this.i.setShader(v0);
       }
       p0.drawPath(this.f, this.i);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       PathLoadingView te = this.e;
       this.d = this.b * Math.min(((float)p0 / te), ((float)p1 / te));
    }
    public void setLoadingColor(int p0){
       this.h = null;
       this.i.setShader(null);
       this.n = LoadingStyle.CUSTOM;
       this.i.setColor(p0);
    }
    public void setLoadingProgressListener(b p0){
       this.o = p0;
    }
    public void setLoadingStyle(LoadingStyle p0){
       this.f(p0, -2);
    }
    public void setPhase(float p0){
       this.i(p0, false);
    }
    public void setPhaseReverse(float p0){
       this.i(p0, true);
    }
    public void setStrokeWidth(float p0){
       this.i.setStrokeWidth(p0);
    }
}
