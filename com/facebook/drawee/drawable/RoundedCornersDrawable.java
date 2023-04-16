package com.facebook.drawee.drawable.RoundedCornersDrawable;
import xb.n;
import xb.i;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import ab.e;
import com.facebook.drawee.drawable.RoundedCornersDrawable$Type;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.facebook.drawee.drawable.RoundedCornersDrawable$a;
import java.lang.Enum;
import android.graphics.Matrix;
import android.graphics.Matrix$ScaleToFit;
import android.graphics.Paint$Style;
import android.graphics.Path$FillType;
import java.util.Arrays;
import java.lang.System;
import android.graphics.Path$Direction;
import java.lang.Math;

public class RoundedCornersDrawable extends i implements n	// class@00108d
{
    public RoundedCornersDrawable$Type f;
    public final RectF g;
    public RectF h;
    public Matrix i;
    public final float[] j;
    public final float[] k;
    public final Paint l;
    public boolean m;
    public float n;
    public int o;
    public int p;
    public float q;
    public boolean r;
    public boolean s;
    public final Path t;
    public final Path u;
    public final RectF v;

    public void RoundedCornersDrawable(Drawable p0){
       e.d(p0);
       super(p0);
       this.f = RoundedCornersDrawable$Type.OVERLAY_COLOR;
       this.g = new RectF();
       float[] uofloatArray = new float[8];
       this.j = uofloatArray;
       float[] uofloatArray1 = new float[8];
       this.k = uofloatArray1;
       this.l = new Paint(1);
       this.m = false;
       this.n = 0;
       this.o = 0;
       this.p = 0;
       this.q = 0;
       this.r = false;
       this.s = false;
       this.t = new Path();
       this.u = new Path();
       this.v = new RectF();
    }
    public void a(boolean p0){
       this.m = p0;
       this.x();
       this.invalidateSelf();
    }
    public void b(float p0){
       this.q = p0;
       this.x();
       this.invalidateSelf();
    }
    public boolean d(){
       return this.s;
    }
    public void draw(Canvas p0){
       RoundedCornersDrawable th;
       Canvas uCanvas;
       this.g.set(this.getBounds());
       int i = RoundedCornersDrawable$a.a[this.f.ordinal()];
       if (i != 1) {
          if (i == 2) {
             if (this.r != null) {
                th = this.h;
                if (th == null) {
                   this.h = new RectF(this.g);
                   this.i = new Matrix();
                }else {
                   th.set(this.g);
                }
                this.h.inset(this.n, this.n);
                this.i.setRectToRect(this.g, this.h, Matrix$ScaleToFit.FILL);
                p0.clipRect(this.g);
                p0.concat(this.i);
                super.draw(p0);
                p0.restoreToCount(p0.save());
             }else {
                super.draw(p0);
             }
             this.l.setStyle(Paint$Style.FILL);
             this.l.setColor(this.p);
             float f = 0;
             this.l.setStrokeWidth(f);
             this.l.setFilterBitmap(this.s);
             this.t.setFillType(Path$FillType.EVEN_ODD);
             p0.drawPath(this.t, this.l);
             if (this.m != null) {
                float f1 = ((this.g.width() - this.g.height()) + this.n) / 2.00f;
                float f2 = ((this.g.height() - this.g.width()) + this.n) / 2.00f;
                if (f1 - f > 0) {
                   RoundedCornersDrawable tg = this.g;
                   RectF left = tg.left;
                   uCanvas = p0;
                   uCanvas.drawRect(left, tg.top, (left + f1), tg.bottom, this.l);
                   tg = this.g;
                   RectF right = tg.right;
                   uCanvas.drawRect((right - f1), tg.top, right, tg.bottom, this.l);
                }
                if (f2 - f > 0) {
                   th = this.g;
                   RectF top = th.top;
                   uCanvas = p0;
                   uCanvas.drawRect(th.left, top, th.right, (top + f2), this.l);
                   th = this.g;
                   RectF bottom = th.bottom;
                   uCanvas.drawRect(th.left, (bottom - f2), th.right, bottom, this.l);
                }
             }
          }
       }else {
          p0.clipPath(this.t);
          super.draw(p0);
          p0.restoreToCount(p0.save());
       }
       if (this.o != null) {
          this.l.setStyle(Paint$Style.STROKE);
          this.l.setColor(this.o);
          this.l.setStrokeWidth(this.n);
          this.t.setFillType(Path$FillType.EVEN_ODD);
          p0.drawPath(this.u, this.l);
       }
       return;
    }
    public boolean e(){
       return this.m;
    }
    public int f(){
       return this.o;
    }
    public float g(){
       return this.n;
    }
    public float h(){
       return this.q;
    }
    public void l(float[] p0){
       boolean b;
       if (p0 == null) {
          Arrays.fill(this.j, 0);
       }else if(p0.length == 8){
          b = true;
       }else {
          b = false;
       }
       e.b(b, "radii should have exactly 8 values");
       System.arraycopy(p0, 0, this.j, 0, 8);
       this.x();
       this.invalidateSelf();
       return;
    }
    public boolean m(){
       return this.r;
    }
    public void n(float p0){
       Arrays.fill(this.j, p0);
       this.x();
       this.invalidateSelf();
    }
    public void o(boolean p0){
       if (this.s != p0) {
          this.s = p0;
          this.invalidateSelf();
       }
       return;
    }
    public void onBoundsChange(Rect p0){
       super.onBoundsChange(p0);
       this.x();
    }
    public float[] s(){
       return this.j;
    }
    public void setBorder(int p0,float p1){
       this.o = p0;
       this.n = p1;
       this.x();
       this.invalidateSelf();
    }
    public void t(boolean p0){
       this.r = p0;
       this.x();
       this.invalidateSelf();
    }
    public void w(int p0){
       this.p = p0;
       this.invalidateSelf();
    }
    public final void x(){
       this.t.reset();
       this.u.reset();
       this.v.set(this.getBounds());
       this.v.inset(this.q, this.q);
       if (this.f == RoundedCornersDrawable$Type.OVERLAY_COLOR) {
          this.t.addRect(this.v, Path$Direction.CW);
       }
       if (this.m != null) {
          this.t.addCircle(this.v.centerX(), this.v.centerY(), (Math.min(this.v.width(), this.v.height()) / 2.00f), Path$Direction.CW);
       }else {
          this.t.addRoundRect(this.v, this.j, Path$Direction.CW);
       }
       RoundedCornersDrawable tq = this.q;
       float f = - tq;
       this.v.inset(f, (- tq));
       tq = this.n;
       f = tq / 2.00f;
       this.v.inset(f, (tq / 2.00f));
       if (this.m != null) {
          this.u.addCircle(this.v.centerX(), this.v.centerY(), (Math.min(this.v.width(), this.v.height()) / 2.00f), Path$Direction.CW);
       }else {
          int i = 0;
          tq = this.k;
          while (i < tq.length) {
             f = this.j[i] + this.q;
             float f1 = this.n / 2.00f;
             f = f - f1;
             tq[i] = f;
             i = i + 1;
          }
          this.u.addRoundRect(this.v, tq, Path$Direction.CW);
       }
       tq = this.n;
       this.v.inset(((- tq) / 2.00f), ((- tq) / 2.00f));
       return;
    }
}
