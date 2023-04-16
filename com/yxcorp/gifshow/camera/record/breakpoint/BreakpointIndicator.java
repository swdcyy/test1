package com.yxcorp.gifshow.camera.record.breakpoint.BreakpointIndicator;
import android.view.View;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import ekd.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.breakpoint.a;
import rc9.a;
import pi9.p;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Float;
import android.animation.ValueAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import rc9.g;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.Canvas;

public class BreakpointIndicator extends View	// class@000dac
{
    public float b;
    public float c;
    public float d;
    public float e;
    public a f;
    public final Paint g;
    public final Paint h;
    public final RectF i;
    public final RectF j;
    public float k;
    public float l;
    public float m;
    public float n;
    public static final float o;
    public static final float p;
    public static final float q;
    public static final float r;
    public static final float s;

    static {
       BreakpointIndicator.o = (float)a1.e(3.30f);
       BreakpointIndicator.p = (float)a1.e(2.00f);
       BreakpointIndicator.q = (float)a1.e(3.00f);
       BreakpointIndicator.r = (float)a1.e(2.00f);
       BreakpointIndicator.s = (float)a1.e(2.50f);
    }
    public void BreakpointIndicator(Context p0){
       super(p0, null);
    }
    public void BreakpointIndicator(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = BreakpointIndicator.q;
       this.d = BreakpointIndicator.p;
       this.e = 0x3f800000;
       this.b = BreakpointIndicator.o;
       this.i = new RectF();
       this.j = new RectF();
       Paint paint = new Paint(7);
       this.g = paint;
       paint.setStyle(Paint$Style.FILL);
       paint.setStrokeCap(Paint$Cap.BUTT);
       paint.setColor(r.b(this.getContext(), R.color.arg_RES_7f060751));
       paint.setAntiAlias(true);
       paint = new Paint(7);
       this.h = paint;
       paint.setStyle(Paint$Style.FILL);
       paint.setStrokeCap(Paint$Cap.BUTT);
       paint.setColor(-1);
       paint.setAlpha(0);
       paint.setAntiAlias(true);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, BreakpointIndicator.class, "1")) {
          return;
       }
       if (this.f.p.h()) {
          a p = this.f.p;
          int i = (p.f < p.c)? 1: 0;
          if (i) {
             this.n = (p.c() * 360.00f) - 90.00f;
             this.setVisibility(0);
             this.invalidate();
          label_003f :
             return;
          }
       }
       this.setVisibility(8);
       goto label_003f ;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, BreakpointIndicator.class, "9")) {
          return;
       }
       this.k = (float)this.getWidth() / 2.00f;
       this.l = (float)this.getLeft() + this.k;
       this.m = (float)this.getTop() + this.k;
       float f = this.c / 2.00f;
       float f1 = this.d / 2.00f;
       float f2 = this.b / 2.00f;
       float f3 = 0x3f800000;
       if (p.d(f3, this.e)) {
          this.i.set((float)this.getLeft(), (float)this.getTop(), (float)this.getRight(), (float)this.getBottom());
          this.j.set((((float)this.getRight() - f2) - f), (this.m - f1), (((float)this.getRight() - f2) + f), (this.m + f1));
       }else {
          BreakpointIndicator te = this.e;
          float f4 = ((f3 - te) * 0x3f000000) * (float)(this.getRight() - this.getLeft());
          f3 = ((f3 - te) * 0x3f000000) * (float)(this.getBottom() - this.getTop());
          this.i.set(((float)this.getLeft() + f4), ((float)this.getTop() + f3), ((float)this.getRight() - f4), ((float)this.getBottom() - f3));
          this.j.set(((((float)this.getRight() - f2) - f) - f4), (this.m + f1), ((((float)this.getRight() - f2) + f) - f4), (this.m - f1));
       }
       return;
    }
    public void c(int p0,boolean p1){
       if (PatchProxy.isSupport(BreakpointIndicator.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, BreakpointIndicator.class, "4")) {
          return;
       }
       if (p1) {
          this.g.setColor(p0);
       }else {
          this.g.setColor(r.b(this.getContext(), R.color.arg_RES_7f060751));
       }
       this.invalidate();
       return;
    }
    public void d(float p0,boolean p1){
       if (PatchProxy.isSupport(BreakpointIndicator.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Boolean.valueOf(p1), this, BreakpointIndicator.class, "2")) {
          return;
       }
       this.b = p0;
       p0 = (p1)? BreakpointIndicator.r: BreakpointIndicator.p;
       this.d = p0;
       p0 = (p1)? BreakpointIndicator.s: BreakpointIndicator.q;
       this.c = p0;
       this.b();
       this.invalidate();
       return;
    }
    public void e(boolean p0){
       if (PatchProxy.isSupport(BreakpointIndicator.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BreakpointIndicator.class, "5")) {
          return;
       }
       if (!this.getVisibility()) {
          int alpha = (p0)? this.h.getAlpha(): 255;
          int alpha1 = (p0)? this.h.getAlpha(): 0;
          int[] ointArray = new int[]{alpha,alpha1};
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          valueAnimato.setDuration(300);
          valueAnimato.setInterpolator(new e());
          valueAnimato.addUpdateListener(new g(this));
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BreakpointIndicator.class, "7")) {
          return;
       }
       BreakpointIndicator tn = this.n;
       if (!PatchProxy.isSupport(BreakpointIndicator.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(tn), p0, this, BreakpointIndicator.class, "8")) {
          p0.save();
          p0.rotate((tn + 0x3f800000), this.l, this.m);
          p0.drawRoundRect(this.j, (this.c / 2.00f), (this.d / 2.00f), this.h);
          p0.drawRoundRect(this.j, (this.c / 2.00f), (this.d / 2.00f), this.g);
          p0.restore();
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(BreakpointIndicator.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, BreakpointIndicator.class, "6")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          this.b();
          this.invalidate();
       }
       return;
    }
    public void setScaleRate(float p0){
       if (PatchProxy.isSupport(BreakpointIndicator.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BreakpointIndicator.class, "3")) {
          return;
       }
       this.e = p0;
       this.b();
       this.invalidate();
       return;
    }
}
