package com.aigestudio.wheelpicker.core.AbstractWheelPicker;
import com.aigestudio.wheelpicker.core.a;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import cw9.c;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import s4.a;
import android.graphics.Rect;
import android.text.TextPaint;
import java.lang.Math;
import java.util.Iterator;
import android.graphics.Canvas;
import android.graphics.Paint$Align;
import android.graphics.Paint;
import android.os.Handler;
import s4.b;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.ViewConfiguration;
import s4.c;
import android.view.MotionEvent;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker$a;
import android.view.View$MeasureSpec;
import android.view.VelocityTracker;
import android.view.ViewParent;

public abstract class AbstractWheelPicker extends View implements a	// class@000d6a
{
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public VelocityTracker b;
    public c c;
    public TextPaint d;
    public Paint e;
    public Rect f;
    public Rect g;
    public Handler h;
    public AbstractWheelPicker$a i;
    public a j;
    public List k;
    public String l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public void AbstractWheelPicker(Context p0){
       super(p0);
       this.m = 0;
       this.f(null);
    }
    public void AbstractWheelPicker(Context p0,AttributeSet p1){
       super(p0, p1);
       this.m = 0;
       this.f(p1);
    }
    private void f(AttributeSet p0){
       int i = c.b(this.getResources(), R.dimen.arg_RES_7f070002);
       int i1 = c.b(this.getResources(), R.dimen.arg_RES_7f070005);
       int i2 = 0x7f030001;
       if (p0 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.b);
          int resourceId = typedArray.getResourceId(0, 0);
          if (resourceId) {
             i2 = resourceId;
          }
          this.k = Arrays.asList(this.getContext().getResources().getStringArray(i2));
          this.o = typedArray.getInt(3, 0);
          this.n = typedArray.getInt(2, 7);
          this.p = typedArray.getDimensionPixelSize(5, i);
          this.q = typedArray.getDimensionPixelSize(9, i1);
          this.r = typedArray.getColor(7, 0xff000000);
          this.s = typedArray.getColor(8, 0xff000000);
          this.H = typedArray.getBoolean(4, 0);
          typedArray.recycle();
       }else {
          this.k = Arrays.asList(this.getContext().getResources().getStringArray(i2));
          this.o = 0;
          this.n = 7;
          this.p = i;
          this.q = i1;
          this.s = 0xff000000;
       }
       this.g();
       this.l = "";
       this.b();
       return;
    }
    public void a(boolean p0,a p1){
       this.G = p0;
       this.j = p1;
    }
    public void b(){
       int i = 0;
       this.E = i;
       this.F = i;
       this.t = i;
       this.u = i;
       if (this.H != null) {
          String str = this.k.get(i);
          this.d.getTextBounds(str, i, str.length(), this.f);
          this.t = Math.max(this.t, this.f.width());
          this.u = Math.max(this.u, this.f.height());
       }else {
          Iterator iterator = this.k.iterator();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             this.d.getTextBounds(str1, i, str1.length(), this.f);
             this.t = Math.max(this.t, this.f.width());
             this.u = Math.max(this.u, this.f.height());
          }
       }
       return;
    }
    public abstract void c(Canvas p0);
    public abstract void d(Canvas p0);
    public abstract void e(Canvas p0);
    public void g(){
       TextPaint textPaint = new TextPaint(69);
       this.d = textPaint;
       textPaint.setTextAlign(Paint$Align.CENTER);
       this.d.setTextSize((float)this.q);
       this.e = new Paint(5);
       this.f = new Rect();
       this.g = new Rect();
       this.h = new Handler();
       b uob = new b(this.getContext(), new DecelerateInterpolator());
       this.c = uob;
       uob.r((ViewConfiguration.getScrollFriction() / 25.00f));
    }
    public final int h(int p0,int p1,int p2){
       if (p0 == 0x40000000) {
       }else if(p0 == Integer.MIN_VALUE){
          p1 = Math.min(p2, p1);
       }else {
          p1 = p2;
       }
       return p1;
    }
    public abstract void i(MotionEvent p0);
    public abstract void j(MotionEvent p0);
    public abstract void k(MotionEvent p0);
    public void l(int p0){
       if (this.m != p0) {
          this.m = p0;
          AbstractWheelPicker ti = this.i;
          if (ti != null) {
             ti.a(p0);
          }
       }
       return;
    }
    public void m(float p0,float p1){
       AbstractWheelPicker ti = this.i;
       if (ti != null) {
          ti.b(p0, p1);
       }
       return;
    }
    public void n(int p0,String p1){
       AbstractWheelPicker ti = this.i;
       if (ti != null) {
          ti.c(p0, p1);
       }
       return;
    }
    public void onDraw(Canvas p0){
       this.c(p0);
       p0.save();
       p0.clipRect(this.g);
       this.e(p0);
       p0.restore();
       this.d(p0);
    }
    public void onMeasure(int p0,int p1){
       this.setMeasuredDimension(this.h(View$MeasureSpec.getMode(p0), View$MeasureSpec.getSize(p0), (this.v + (this.getPaddingLeft() + this.getPaddingRight()))), this.h(View$MeasureSpec.getMode(p1), View$MeasureSpec.getSize(p1), (this.w + (this.getPaddingTop() + this.getPaddingBottom()))));
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       AbstractWheelPicker to = this.o;
       this.n(to, this.k.get(to));
       this.g.set(this.getPaddingLeft(), this.getPaddingTop(), (p0 - this.getPaddingRight()), (p1 - this.getPaddingBottom()));
       this.x = this.g.centerX();
       p0 = this.g.centerY();
       this.y = p0;
       this.z = (int)((float)p0 - ((this.d.ascent() + this.d.descent()) / 2.00f));
    }
    public boolean onTouchEvent(MotionEvent p0){
       if (this.b == null) {
          this.b = VelocityTracker.obtain();
       }
       this.b.addMovement(p0);
       int action = p0.getAction();
       if (action) {
          VelocityTracker velocityTrac = null;
          boolean b = false;
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                   this.getParent().requestDisallowInterceptTouchEvent(b);
                   this.c.s();
                   this.b.recycle();
                   this.b = velocityTrac;
                }
             }else {
                this.C = (int)((float)this.C + (p0.getX() - (float)this.A));
                this.D = (int)((float)this.D + (p0.getY() - (float)this.B));
                this.A = (int)p0.getX();
                this.B = (int)p0.getY();
                this.j(p0);
             }
          }else {
             this.E = this.E + this.C;
             this.F = this.F + this.D;
             this.C = b;
             this.D = b;
             this.b.computeCurrentVelocity(150);
             this.k(p0);
             this.getParent().requestDisallowInterceptTouchEvent(b);
             this.b.recycle();
             this.b = velocityTrac;
          }
       }else {
          this.getParent().requestDisallowInterceptTouchEvent(true);
          if (!this.c.a()) {
             this.c.s();
          }
          this.A = (int)p0.getX();
          this.B = (int)p0.getY();
          this.i(p0);
       }
       return true;
    }
    public void setCurrentTextColor(int p0){
       this.s = p0;
    }
    public void setData(List p0){
       this.k = p0;
       this.b();
       this.requestLayout();
    }
    public void setItemCount(int p0){
       this.n = p0;
       this.b();
       this.requestLayout();
    }
    public void setItemIndex(int p0){
       this.o = p0;
       this.b();
       this.requestLayout();
    }
    public void setItemSpace(int p0){
       this.p = p0;
       this.b();
       this.requestLayout();
    }
    public void setOnWheelChangeListener(AbstractWheelPicker$a p0){
       this.i = p0;
    }
    public void setTextColor(int p0){
       this.r = p0;
       this.invalidate();
    }
    public void setTextSize(int p0){
       this.q = p0;
       this.d.setTextSize((float)p0);
       this.b();
       this.requestLayout();
    }
}
