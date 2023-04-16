package com.kwai.library.widget.specific.misc.KwaiLoadingCircle;
import android.view.View;
import java.lang.String;
import android.graphics.Color;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Paint;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import a2.i0;
import com.kwai.library.widget.specific.misc.KwaiLoadingCircle$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.Canvas;
import java.lang.Float;

public class KwaiLoadingCircle extends View	// class@000a12
{
    public float b;
    public ValueAnimator c;
    public float d;
    public float e;
    public int f;
    public float g;
    public float h;
    public int i;
    public RectF j;
    public Paint k;
    public boolean l;
    public boolean m;
    public KwaiLoadingCircle$a n;
    public boolean o;
    public static final int p;

    static {
       KwaiLoadingCircle.p = Color.parseColor("#c6c6c6");
    }
    public void KwaiLoadingCircle(Context p0){
       super(p0);
       this.b = 0x3f800000;
       this.h = 10.00f;
       this.i = KwaiLoadingCircle.p;
       this.j = new RectF();
       this.k = new Paint();
       this.c(p0, null);
    }
    public void KwaiLoadingCircle(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0x3f800000;
       this.h = 10.00f;
       this.i = KwaiLoadingCircle.p;
       this.j = new RectF();
       this.k = new Paint();
       this.c(p0, p1);
    }
    public void KwaiLoadingCircle(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0x3f800000;
       this.h = 10.00f;
       this.i = KwaiLoadingCircle.p;
       this.j = new RectF();
       this.k = new Paint();
       this.c(p0, p1);
    }
    public final void a(int p0){
       boolean b = (!p0)? true: false;
       this.b(b);
       return;
    }
    public final void b(boolean p0){
       if (p0) {
          this.d();
       }else {
          this.f();
       }
       return;
    }
    public final void c(Context p0,AttributeSet p1){
       float floatx;
       int i = 2;
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.X1);
          floatx = typedArray.getFloat(4, 0x3f800000);
          this.h = typedArray.getDimension(1, 10.00f);
          this.i = typedArray.getColor(0, KwaiLoadingCircle.p);
          this.f = typedArray.getColor(i, 0);
          this.g = typedArray.getDimension(3, 0);
          typedArray.recycle();
       }else {
          floatx = 0;
       }
       ValueAnimator valueAnimato = ValueAnimator.ofInt(new int[i]{0,360});
       this.c = valueAnimato;
       valueAnimato.setDuration(this.getDuration());
       this.c.setInterpolator(new AccelerateDecelerateInterpolator());
       this.c.setRepeatCount(-1);
       this.setSpeed(floatx);
       this.k.setAntiAlias(1);
       this.k.setStyle(Paint$Style.STROKE);
       this.k.setStrokeCap(Paint$Cap.ROUND);
       this.k.setColor(this.i);
       this.k.setStrokeWidth(this.h);
       this.k.setShadowLayer((this.g / 2.00f), 0, 0, this.f);
       return;
    }
    public final void d(){
       boolean b = true;
       KwaiLoadingCircle kwaiLoadingC = (i0.X(this) && (!this.getVisibility() && this.m == null))? 1: null;
       if (kwaiLoadingC) {
          if (this.n == null) {
             this.n = new KwaiLoadingCircle$a(this);
          }
          if (this.o == null) {
             this.o = b;
             this.c.addUpdateListener(this.n);
          }
          this.c.start();
       }
       return;
    }
    public void e(){
       this.m = false;
       this.d();
    }
    public final void f(){
       this.c.cancel();
       KwaiLoadingCircle tn = this.n;
       if (tn != null) {
          this.c.removeUpdateListener(tn);
          this.o = false;
       }
       return;
    }
    public void g(){
       this.m = true;
       this.f();
    }
    public final long getDuration(){
       return (long)(3000.00f / this.b);
    }
    public final void h(){
       float f = this.h / 2.00f;
       float f1 = this.g / 2.00f;
       this.j.set((((float)this.getPaddingLeft() + f) + f1), (((float)this.getPaddingTop() + f) + f1), (((float)(this.getMeasuredWidth() - this.getPaddingRight()) - f) - f1), (((float)(this.getMeasuredHeight() - this.getPaddingBottom()) - f) - f1));
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.d();
    }
    public void onDetachedFromWindow(){
       this.f();
       super.onDetachedFromWindow();
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       p0.drawArc(this.j, this.d, this.e, false, this.k);
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       this.h();
    }
    public void onVisibilityAggregated(boolean p0){
       super.onVisibilityAggregated(p0);
       if (p0 != this.l) {
          this.l = p0;
          this.b(p0);
       }
       return;
    }
    public void onWindowVisibilityChanged(int p0){
       super.onWindowVisibilityChanged(p0);
       this.a(p0);
    }
    public void setProgressColor(int p0){
       if (this.i != p0) {
          this.i = p0;
          this.k.setColor(p0);
          this.invalidate();
       }
       return;
    }
    public void setProgressShadowColor(int p0){
       if (this.f != p0) {
          this.f = p0;
          this.k.setShadowLayer((this.g / 2.00f), 0, 0, p0);
          this.invalidate();
       }
       return;
    }
    public void setProgressShadowWidth(int p0){
       float f = (float)p0;
       if (this.g - f) {
          this.g = f;
          this.k.setShadowLayer((f / 2.00f), 0, 0, this.f);
          this.h();
          this.invalidate();
       }
       return;
    }
    public void setProgressWidth(int p0){
       float f = (float)p0;
       if (this.h - f) {
          this.h = f;
          this.k.setStrokeWidth(f);
          this.h();
          this.invalidate();
       }
       return;
    }
    public void setSpeed(float p0){
       if (p0 > 0 && Float.compare(this.b, p0)) {
          this.b = p0;
          this.c.setDuration(this.getDuration());
       }
       return;
    }
    public void setVisibility(int p0){
       super.setVisibility(p0);
       if (this.getVisibility() != p0) {
          this.a(p0);
       }
       return;
    }
}
