package com.aigestudio.wheelpicker.view.WheelCrossPicker;
import t4.d;
import java.lang.Runnable;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker;
import android.content.Context;
import android.util.AttributeSet;
import s4.a;
import android.graphics.Rect;
import android.view.View;
import android.graphics.Canvas;
import android.graphics.Paint;
import t4.b;
import android.view.MotionEvent;
import s4.c;
import android.view.VelocityTracker;
import t4.c;
import android.os.Handler;
import java.lang.Math;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import t4.a;

public abstract class WheelCrossPicker extends AbstractWheelPicker implements d, Runnable	// class@000d6d
{
    public c I;
    public Rect J;
    public Rect K;
    public Rect L;
    public Rect M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;

    public void WheelCrossPicker(Context p0){
       super(p0);
    }
    public void WheelCrossPicker(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void a(boolean p0,a p1){
       this.G = p0;
       this.j = p1;
       this.invalidate(this.K);
    }
    public void c(Canvas p0){
    }
    public void clearCache(){
    }
    public void d(Canvas p0){
       if (this.j != null) {
          p0.save();
          p0.clipRect(this.J);
          this.j.a(p0, this.L, this.M, this.e);
          p0.restore();
       }
       return;
    }
    public void g(){
       super.g();
       this.I = new b();
       this.J = new Rect();
       this.K = new Rect();
       this.L = new Rect();
       this.M = new Rect();
    }
    public void i(MotionEvent p0){
    }
    public void j(MotionEvent p0){
       this.l(1);
       this.m((float)(this.E + this.C), (float)(this.F + this.D));
       this.invalidate();
    }
    public void k(MotionEvent p0){
       this.I.b(this.c, this.b, this.O, this.P, this.Q, this.S);
       this.l(2);
       this.h.post(this);
    }
    public final void o(int p0,int p1){
       WheelCrossPicker tO = this.O;
       if (tO < null) {
          this.I.t(this.c, tO, p0);
       }else {
          this.I.t(this.c, tO, p1);
       }
       this.l(2);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       WheelCrossPicker wheelCrossPi = this;
       super.onSizeChanged(p0, p1, p2, p3);
       wheelCrossPi.I.g(wheelCrossPi.K, wheelCrossPi.p, p0, p1, wheelCrossPi.t, wheelCrossPi.u, wheelCrossPi.x, wheelCrossPi.y, this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
       wheelCrossPi.I.o(wheelCrossPi.L, wheelCrossPi.M, wheelCrossPi.K, this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
       wheelCrossPi.J.set(wheelCrossPi.K);
       if (wheelCrossPi.G == null) {
          wheelCrossPi.I.s(wheelCrossPi.J, this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
       }
       return;
    }
    public void run(){
       if (this.c.a()) {
          int i = 0;
          this.l(i);
          int i1 = Math.abs((this.O % this.N));
          if (i1) {
             WheelCrossPicker tN = this.N;
             if ((float)i1 - ((float)tN / 2.00f) >= 0) {
                this.o((i1 - tN), (tN - i1));
             }else {
                this.o(i1, (- i1));
             }
             this.postInvalidate();
             this.h.postDelayed(this, 16);
          }
          if (this.m == null) {
             i = Math.min((this.k.size() - 1), Math.max(i, (this.o - (this.O / this.N))));
             String str = this.k.get(i);
             if (!(this.l).equals(str)) {
                this.l = str;
                this.n(i, str);
             }
          }
       }
    label_0069 :
       if (this.c.l()) {
          this.E = this.c.i();
          this.F = this.c.j();
          this.O = this.I.i(this.c);
          this.m((float)this.E, (float)this.F);
          this.postInvalidate();
          this.h.postDelayed(this, 16);
       }
       return;
    }
    public void setCurrentTextColor(int p0){
       super.setCurrentTextColor(p0);
       this.invalidate(this.K);
    }
    public void setData(List p0){
       super.setData(p0);
       this.clearCache();
    }
    public void setItemCount(int p0){
       super.setItemCount(p0);
       this.clearCache();
    }
    public void setItemSpace(int p0){
       super.setItemSpace(p0);
       this.clearCache();
    }
    public void setOrientation(int p0){
       a uoa = (!p0)? new a(): new b();
       this.I = uoa;
       this.b();
       this.requestLayout();
       return;
    }
    public void setTextSize(int p0){
       super.setTextSize(p0);
       this.clearCache();
    }
}
