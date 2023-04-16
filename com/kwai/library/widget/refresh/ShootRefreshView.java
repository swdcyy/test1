package com.kwai.library.widget.refresh.ShootRefreshView;
import o17.j;
import android.view.View;
import java.lang.Float;
import java.lang.Math;
import com.kwai.library.widget.refresh.ShootRefreshView$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.library.widget.refresh.ShootRefreshView$b;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import android.graphics.RectF;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Color;
import com.yxcorp.utility.n;
import android.graphics.SweepGradient;
import android.graphics.Paint$Style;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import android.animation.TimeInterpolator;
import o17.l;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import java.lang.Object;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import android.view.animation.LinearInterpolator;
import o17.k;
import android.graphics.Canvas;
import android.graphics.Shader;

public class ShootRefreshView extends View implements j	// class@0009d1
{
    public final Paint b;
    public final RectF c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public float k;
    public float l;
    public float m;
    public Shader n;
    public boolean o;
    public ValueAnimator p;
    public float q;
    public float r;
    public boolean s;
    public AnimatorSet t;
    public static final float u;
    public static final float v;
    public static final Property w;
    public static final Property x;

    static {
       ShootRefreshView.u = (float)Math.toDegrees(0x3fe0c15240000000);
       ShootRefreshView.v = (float)Math.sqrt(3.00f);
       ShootRefreshView.w = new ShootRefreshView$a(Float.class, null);
       ShootRefreshView.x = new ShootRefreshView$b(Float.class, null);
    }
    public void ShootRefreshView(Context p0){
       super(p0, null);
    }
    public void ShootRefreshView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ShootRefreshView(Context p0,AttributeSet p1,int p2){
       float f;
       super(p0, p1, p2);
       Paint paint = new Paint(1);
       this.b = paint;
       this.c = new RectF();
       this.s = false;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.b5);
       this.g = typedArray.getColor(2, Color.parseColor("#ffC1C1C1"));
       this.h = typedArray.getColor(1, Color.parseColor("#ffC1C1C1"));
       this.i = typedArray.getColor(false, Color.parseColor("#0dC1C1C1"));
       this.j = typedArray.getDimensionPixelSize(3, n.c(this.getContext(), 0x3f800000));
       typedArray.recycle();
       int[] ointArray = new int[]{this.h,this.i};
       this.n = new SweepGradient(0, 0, ointArray, new float[2]{0x3e99999a,0x3f800000});
       paint.setStyle(Paint$Style.STROKE);
       paint.setStrokeWidth((float)this.j);
       paint.setColor(this.g);
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f060a92});
       valueAnimato.setInterpolator(new AccelerateInterpolator());
       valueAnimato.setDuration(30);
       valueAnimato.addUpdateListener(new l(this));
       float[] uofloatArray = new float[]{f,f - 0x42f00000};
       f = - (ShootRefreshView.u / 2.00f);
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(ShootRefreshView.w, new float[2]{0x3f060a92,0x3fa0d97c}),PropertyValuesHolder.ofFloat(ShootRefreshView.x, uofloatArray)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this, propertyValu);
       objectAnimat.setInterpolator(new DecelerateInterpolator());
       objectAnimat.setDuration(350);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       this.t = uAnimatorSet;
       uAnimatorSet.play(objectAnimat).after(valueAnimato);
       valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x43b40000});
       this.p = valueAnimato;
       valueAnimato.setRepeatCount(-1);
       this.p.setInterpolator(new LinearInterpolator());
       this.p.setDuration(400);
       this.p.addUpdateListener(new k(this));
       this.reset();
    }
    public void onDetachedFromWindow(){
       this.reset();
       super.onDetachedFromWindow();
    }
    public void onDraw(Canvas p0){
       ShootRefreshView l;
       double d2;
       double d3;
       double d4;
       float f1;
       float f4;
       ShootRefreshView n;
       ShootRefreshView shootRefresh = this;
       Canvas uCanvas = p0;
       super.onDraw(p0);
       Shader shader = null;
       if (shootRefresh.o != null) {
          shootRefresh.b.setShader(shader);
          p0.save();
          uCanvas.translate((float)shootRefresh.e, (float)shootRefresh.f);
          uCanvas.rotate((- shootRefresh.m));
          int i = 0;
          while (i < 6) {
             p0.save();
             int i1 = i * -60;
             uCanvas.rotate((float)i1);
             l = shootRefresh.l;
             double d = 0x3ff0000000000000;
             double d1 = 2.00f;
             if (l - 0x3f060a92 > 0) {
                d2 = Math.tan((double)l);
                float f = shootRefresh.l + 0x3f860a92;
                d3 = Math.tan((double)f);
                d4 = (double)ShootRefreshView.v;
                double d5 = d4 * d3;
                d = d - d5;
                d5 = d2 - d3;
                d5 = d5 * d1;
                d = d / d5;
                ShootRefreshView d6 = shootRefresh.d;
                f1 = (float)d6;
                float f2 = f1 * (float)d;
                d1 = d1 * d3;
                d1 = d1 - d2;
                d4 = d4 * d2;
                d4 = d4 * d3;
                d1 = d1 - d4;
                d1 = d1 / d5;
                float f3 = (float)d1 * f1;
                i1 = - d6;
                f4 = (float)i1;
                p0.drawLine(0, f4, f2, f3, shootRefresh.b);
             }else {
                d2 = Math.tan((double)l);
                d3 = d2 * d1;
                d3 = d3 * (double)shootRefresh.d;
                d4 = Math.pow(d2, d1) + d;
                d3 = d3 / d4;
                f1 = (float)d3;
                d3 = Math.pow(d2, d1) - d;
                d3 = d3 * (double)shootRefresh.d;
                d2 = Math.pow(d2, d1) + d;
                d3 = d3 / d2;
                i1 = - shootRefresh.d;
                f4 = (float)i1;
                p0.drawLine(0, f4, f1, (float)d3, shootRefresh.b);
             }
             p0.restore();
             i = i + 1;
             f1 = 0;
          }
          p0.restore();
       }
       p0.save();
       uCanvas.translate((float)shootRefresh.e, (float)shootRefresh.f);
       if (shootRefresh.p.isRunning()) {
          uCanvas.rotate((shootRefresh.k - 90.00f));
          n = shootRefresh.n;
          if (shootRefresh.b.getShader() != n) {
             shootRefresh.b.setShader(n);
          }
       }else {
          shootRefresh.b.setShader(null);
       }
       l = shootRefresh.r;
       n = shootRefresh.d;
       f4 = (float)(n * 2);
       float f5 = 0;
       shootRefresh.q = (l - f4 < 0)? f5: ((l - f4) * 360.00f) / ((float)n * 4.00f);
       shootRefresh.b.setAntiAlias(true);
       shootRefresh.b.setStyle(Paint$Style.STROKE);
       float f6 = (float)shootRefresh.d;
       f4 = f5 - f6;
       RectF rectF = new RectF(f4, f4, (f6 + f5), (f6 + f5));
       if (shootRefresh.s != null) {
          p0.drawArc(rectF, -90.00f, 360.00f, false, shootRefresh.b);
       }else {
          p0.drawArc(rectF, -90.00f, shootRefresh.q, false, shootRefresh.b);
       }
       p0.restore();
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       this.c.set((float)(this.getPaddingLeft() + 0), (float)(this.getPaddingTop() + 0), (float)(p0 - this.getPaddingRight()), (float)(p1 - this.getPaddingBottom()));
       ShootRefreshView tj = this.j;
       float f = (float)tj;
       this.c.inset(f, (float)tj);
       this.d = (int)(Math.min(this.c.width(), this.c.height()) / 2.00f);
       this.e = (int)this.c.centerX();
       this.f = (int)this.c.centerY();
    }
    public void pullProgress(float p0,float p1){
       this.r = p0;
       this.invalidate();
    }
    public void pullToRefresh(){
    }
    public void refreshComplete(){
       this.t.start();
       this.p.end();
    }
    public int refreshedAnimatorDuration(){
       return 500;
    }
    public void refreshing(){
       this.k = 0;
       this.m = 0;
       this.l = 0;
       if (this.t.isRunning()) {
          this.p.end();
       }else {
          this.p.start();
       }
       this.o = true;
       this.s = true;
       return;
    }
    public void releaseToRefresh(){
    }
    public void reset(){
       this.l = 0x3fa0d97c;
       this.m = (- (ShootRefreshView.u / 2.00f)) - 240.00f;
       this.k = 0;
       this.invalidate();
       this.s = false;
       this.o = false;
       if (this.t.isStarted()) {
          this.t.end();
       }
       if (this.p.isStarted()) {
          this.p.end();
       }
       return;
    }
}
