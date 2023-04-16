package com.yxcorp.gifshow.widget.shimmer.b;
import android.graphics.drawable.Drawable;
import pzc.a;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Matrix;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.animation.ValueAnimator;
import com.yxcorp.gifshow.widget.shimmer.a;
import android.graphics.drawable.Drawable$Callback;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Math;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Canvas;
import java.lang.Float;
import android.graphics.ColorFilter;

public final class b extends Drawable	// class@0019c7
{
    public final ValueAnimator$AnimatorUpdateListener a;
    public final Paint b;
    public final Rect c;
    public final Matrix d;
    public ValueAnimator e;
    public a f;

    public void b(){
       super();
       this.a = new a(this);
       Paint paint = new Paint();
       this.b = paint;
       this.c = new Rect();
       this.d = new Matrix();
       paint.setAntiAlias(true);
    }
    public boolean a(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e;
       b = (obj != null && obj.isStarted())? true: false;
       return b;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       b te = this.e;
       if (te != null && !te.isStarted()) {
          te = this.f;
          if (te != null && (te.m != null && this.getCallback() != null)) {
             this.e.start();
          }
       }
    label_0029 :
       return;
    }
    public final float c(float p0,float p1,float p2){
       return (p0 + ((p1 - p0) * p2));
    }
    public final void d(){
       int i2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       Rect bounds = this.getBounds();
       int i = bounds.width();
       int i1 = bounds.height();
       if (i && i1) {
          b tf = this.f;
          if (tf != null) {
             Objects.requireNonNull(tf);
             if (PatchProxy.isSupport(uoa)) {
                a obj = PatchProxy.applyOneRefs(Integer.valueOf(i), tf, uoa, "1");
                if (obj != patchProxyRe) {
                   i = obj.intValue();
                }else {
                label_0042 :
                   obj = tf.f;
                   a uoa1 = (obj > null)? obj: Math.round((tf.h * (float)i));
                }
             }else {
                goto label_0042 ;
             }
             tf = this.f;
             Objects.requireNonNull(tf);
             if (PatchProxy.isSupport(uoa)) {
                Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i1), tf, uoa, "2");
                if (obj1 != patchProxyRe) {
                   i2 = obj1.intValue();
                }else {
                label_006f :
                   i2 = tf.g;
                   if (i2 <= null) {
                      i2 = Math.round((tf.i * (float)i1));
                   }
                }
             }else {
                goto label_006f ;
             }
             uoa = this.f.c;
             i1 = 1;
             if (uoa != i1 && uoa != 3) {
                i1 = 0;
             }
             if (i1) {
                i = 0;
             }
             if (!i1) {
                i2 = 0;
             }
             b tf1 = this.f;
             LinearGradient linearGradie = new LinearGradient(0, 0, (float)i, (float)i2, tf1.b, tf1.a, Shader$TileMode.CLAMP);
             this.b.setShader(uoa);
          }
       }
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       if (this.f != null && this.b.getShader() != null) {
          float f = (float)Math.tan(Math.toRadians((double)this.f.k));
          float f1 = (float)this.c.height() + ((float)this.c.width() * f);
          float f2 = (float)this.c.width() + (f * (float)this.c.height());
          b te = this.e;
          float f3 = 0;
          f = (te != null)? te.getAnimatedValue().floatValue(): 0;
          a c = this.f.c;
          if (c != 1) {
             if (c != 2) {
                if (c != 3) {
                   f = this.c((- f2), f2, f);
                }else {
                   f = this.c(f1, (- f1), f);
                }
             }else {
                f = this.c(f2, (- f2), f);
             }
             f3 = f;
             f = 0;
          }else {
             f = this.c((- f1), f1, f);
          }
          this.d.reset();
          this.d.setRotate(this.f.k, ((float)this.c.width() / 2.00f), ((float)this.c.height() / 2.00f));
          this.d.postTranslate(f3, f);
          this.b.getShader().setLocalMatrix(this.d);
          p0.drawRect(this.c, this.b);
       }
       return;
    }
    public int getOpacity(){
       b tf = this.f;
       int i = (tf != null && tf.l != null)? -3: -1;
       return i;
    }
    public void onBoundsChange(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       super.onBoundsChange(p0);
       this.c.set(p0);
       this.d();
       this.b();
       return;
    }
    public void setAlpha(int p0){
    }
    public void setColorFilter(ColorFilter p0){
    }
}
