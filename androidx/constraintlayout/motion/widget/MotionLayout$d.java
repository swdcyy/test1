package androidx.constraintlayout.motion.widget.MotionLayout$d;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.Object;
import android.graphics.Rect;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.content.Context;
import android.view.ViewGroup;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import android.graphics.Canvas;
import java.util.HashMap;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.Collection;
import java.util.Iterator;
import e1.p;
import android.graphics.Path;
import java.lang.Math;
import android.view.View;
import e1.r;

public class MotionLayout$d	// class@00066b
{
    public float[] a;
    public int[] b;
    public float[] c;
    public Path d;
    public Paint e;
    public Paint f;
    public Paint g;
    public Paint h;
    public Paint i;
    public float[] j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public DashPathEffect p;
    public int q;
    public Rect r;
    public boolean s;
    public int t;
    public final MotionLayout u;

    public void MotionLayout$d(MotionLayout p0){
       this.u = p0;
       super();
       this.k = -21965;
       this.l = -2067046;
       this.m = -13391360;
       this.n = 0x77000000;
       this.o = 10;
       this.r = new Rect();
       this.s = false;
       this.t = 1;
       Paint paint = new Paint();
       this.e = paint;
       paint.setAntiAlias(1);
       this.e.setColor(-21965);
       this.e.setStrokeWidth(2.00f);
       this.e.setStyle(Paint$Style.STROKE);
       Paint paint1 = new Paint();
       this.f = paint1;
       paint1.setAntiAlias(1);
       this.f.setColor(-2067046);
       this.f.setStrokeWidth(2.00f);
       this.f.setStyle(Paint$Style.STROKE);
       paint1 = new Paint();
       this.g = paint1;
       paint1.setAntiAlias(1);
       this.g.setColor(-13391360);
       this.g.setStrokeWidth(2.00f);
       this.g.setStyle(Paint$Style.STROKE);
       paint1 = new Paint();
       this.h = paint1;
       paint1.setAntiAlias(1);
       this.h.setColor(-13391360);
       this.h.setTextSize((c.c(p0.getContext().getResources()).density * 12.00f));
       float[] uofloatArray = new float[8];
       this.j = uofloatArray;
       Paint paint2 = new Paint();
       this.i = paint2;
       paint2.setAntiAlias(1);
       DashPathEffect uDashPathEff = new DashPathEffect(new float[2]{0x40800000,0x41000000}, 0);
       this.p = uDashPathEff;
       this.g.setPathEffect(uDashPathEff);
       uofloatArray = new float[100];
       this.c = uofloatArray;
       int[] ointArray = new int[50];
       this.b = ointArray;
       if (this.s != null) {
          this.e.setStrokeWidth(8.00f);
          this.i.setStrokeWidth(8.00f);
          this.f.setStrokeWidth(8.00f);
          this.t = 4;
       }
       return;
    }
    public void a(Canvas p0,HashMap p1,int p2,int p3){
       int i3;
       if (p1 != null && p1.size()) {
          p0.save();
          if (!this.u.isInEditMode() && (p3 & 0x01) == 2) {
             String str = this.u.getContext().getResources().getResourceName(this.u.G)+":"+this.u.getProgress();
             p0.drawText(str, 10.00f, (float)(this.u.getHeight() - 30), this.h);
             p0.drawText(str, 11.00f, (float)(this.u.getHeight() - 29), this.e);
          }
          Iterator iterator = p1.values().iterator();
          while (iterator.hasNext()) {
             p op = iterator.next();
             int i = op.i();
             int i1 = 1;
             if (p3 > 0 && !i) {
                i = 1;
             }
             if (!i) {
                continue ;
             }else {
                this.q = op.c(this.c, this.b);
                if (i >= i1) {
                   i1 = p2 / 16;
                   MotionLayout$d ta = this.a;
                   if (ta != null) {
                      int i2 = i1 * 2;
                      if (ta.length == i2) {
                      label_00ab :
                         ta = this.t;
                         float f = (float)ta;
                         p0.translate(f, (float)ta);
                         i2 = 0x77000000;
                         this.e.setColor(i2);
                         this.i.setColor(i2);
                         this.f.setColor(i2);
                         this.g.setColor(i2);
                         op.d(this.a, i1);
                         this.b(p0, i, this.q, op);
                         this.e.setColor(-21965);
                         this.f.setColor(-2067046);
                         this.i.setColor(-2067046);
                         this.g.setColor(-13391360);
                         MotionLayout$d tt = this.t;
                         i3 = - tt;
                         i1 = - tt;
                         p0.translate((float)i3, (float)i1);
                         this.b(p0, i, this.q, op);
                         if (i == 5) {
                            this.j(p0, op);
                         }
                      }
                   }
                   i3 = i1 * 2;
                   float[] uofloatArray = new float[i3];
                   this.a = uofloatArray;
                   this.d = new Path();
                   goto label_00ab ;
                }
             }
          }
          p0.restore();
       }
       return;
    }
    public void b(Canvas p0,int p1,int p2,p p3){
       if (p1 == 4) {
          this.d(p0);
       }
       if (p1 == 2) {
          this.g(p0);
       }
       if (p1 == 3) {
          this.e(p0);
       }
       this.c(p0);
       this.k(p0, p1, p2, p3);
       return;
    }
    public final void c(Canvas p0){
       p0.drawLines(this.a, this.e);
    }
    public final void d(Canvas p0){
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (i < this.q) {
          MotionLayout$d tb = this.b;
          if (tb[i] == 1) {
             i1 = 1;
          }
          if (tb[i] == 2) {
             i2 = 1;
          }
          i = i + 1;
       }
       if (i1) {
          this.g(p0);
       }
       if (i2) {
          this.e(p0);
       }
       return;
    }
    public final void e(Canvas p0){
       MotionLayout$d uod = this;
       MotionLayout$d a = uod.a;
       int i = a[0];
       int i1 = a[1];
       int i2 = a[(a.length - 2)];
       int i3 = a[(a.length - 1)];
       p0.drawLine(Math.min(i, i2), Math.max(i1, i3), Math.max(i, i2), Math.max(i1, i3), uod.g);
       float f = Math.min(i1, i3);
       float f1 = Math.max(i1, i3);
       p0.drawLine(Math.min(i, i2), f, Math.min(i, i2), f1, uod.g);
    }
    public final void f(Canvas p0,float p1,float p2){
       MotionLayout$d uod = this;
       Canvas uCanvas = p0;
       MotionLayout$d a = uod.a;
       int i = a[0];
       int i1 = a[1];
       int i2 = a[(a.length - 2)];
       int i3 = a[(a.length - 1)];
       float f = p1 - Math.min(i, i2);
       float f1 = Math.max(i1, i3) - p2;
       String str = (float)(int)((double)((f * 100.00f) / Math.abs((i2 - i))) + 0x3fe0000000000000) / 100.00f;
       uod.l(str, uod.h);
       uCanvas.drawText(str, (((f / 2.00f) - (float)(uod.r.width() / 2)) + Math.min(i, i2)), (p2 - 20.00f), uod.h);
       float f2 = Math.min(i, i2);
       p0.drawLine(p1, p2, f2, p2, uod.g);
       String str1 = (float)(int)((double)((f1 * 100.00f) / Math.abs((i3 - i1))) + 0x3fe0000000000000) / 100.00f;
       uod.l(str1, uod.h);
       uCanvas.drawText(str1, (p1 + 5.00f), (Math.max(i1, i3) - ((f1 / 2.00f) - (float)(uod.r.height() / 2))), uod.h);
       p0.drawLine(p1, p2, p1, Math.max(i1, i3), uod.g);
    }
    public final void g(Canvas p0){
       MotionLayout$d ta = this.a;
       p0.drawLine(ta[0], ta[1], ta[(ta.length - 2)], ta[(ta.length - 1)], this.g);
    }
    public final void h(Canvas p0,float p1,float p2){
       MotionLayout$d ta = this.a;
       int i = ta[0];
       int i1 = ta[1];
       int i2 = ta[(ta.length - 2)];
       int i3 = ta[(ta.length - 1)];
       float f = (float)Math.hypot((double)(i - i2), (double)(i1 - i3));
       float f1 = i2 - i;
       float f2 = i3 - i1;
       float f3 = (((p1 - i) * f1) + ((p2 - i1) * f2)) / (f * f);
       float f4 = i + (f1 * f3);
       float f5 = i1 + (f3 * f2);
       Path path = new Path();
       path.moveTo(p1, p2);
       path.lineTo(f4, f5);
       f2 = (float)Math.hypot((double)(f4 - p1), (double)(f5 - p2));
       String str = (float)(int)((f2 * 100.00f) / f) / 100.00f;
       this.l(str, this.h);
       p0.drawTextOnPath(str, path, ((f2 / 2.00f) - (float)(this.r.width() / 2)), -20.00f, this.h);
       p0.drawLine(p1, p2, f4, f5, this.g);
    }
    public final void i(Canvas p0,float p1,float p2,int p3,int p4){
       MotionLayout$d uod = this;
       Canvas uCanvas = p0;
       String str = (float)(int)((double)(((p1 - (float)(p3 / 2)) * 100.00f) / (float)(uod.u.getWidth() - p3)) + 0x3fe0000000000000) / 100.00f;
       this.l(str, uod.h);
       uCanvas.drawText(str, (((p1 / 2.00f) - (float)(uod.r.width() / 2)) + 0), (p2 - 20.00f), uod.h);
       p0.drawLine(p1, p2, Math.min(0, 0x3f800000), p2, uod.g);
       str = (float)(int)((double)(((p2 - (float)(p4 / 2)) * 100.00f) / (float)(uod.u.getHeight() - p4)) + 0x3fe0000000000000) / 100.00f;
       this.l(str, uod.h);
       uCanvas.drawText(str, (p1 + 5.00f), (0 - ((p2 / 2.00f) - (float)(uod.r.height() / 2))), uod.h);
       p0.drawLine(p1, p2, p1, Math.max(0, 0x3f800000), uod.g);
    }
    public final void j(Canvas p0,p p1){
       this.d.reset();
       int i = 0;
       int i1 = 0;
       int i2 = 50;
       while (i1 <= i2) {
          float f = (float)i1 / (float)i2;
          p1.e(f, this.j, i);
          MotionLayout$d tj = this.j;
          this.d.moveTo(tj[i], tj[1]);
          tj = this.j;
          this.d.lineTo(tj[2], tj[3]);
          tj = this.j;
          this.d.lineTo(tj[4], tj[5]);
          tj = this.j;
          this.d.lineTo(tj[6], tj[7]);
          this.d.close();
          i1 = i1 + 1;
       }
       this.e.setColor(0x44000000);
       p0.translate(2.00f, 2.00f);
       p0.drawPath(this.d, this.e);
       p0.translate(-2.00f, -2.00f);
       this.e.setColor(0xffff0000);
       p0.drawPath(this.d, this.e);
       return;
    }
    public final void k(Canvas p0,int p1,int p2,p p3){
       int i1;
       int i2;
       int i5;
       MotionLayout$d b;
       float f2;
       float f3;
       int i9;
       int i10;
       int i11;
       float f4;
       float f5;
       MotionLayout$d uod = this;
       Canvas uCanvas = p0;
       int i = p1;
       p op = p3;
       p a = op.a;
       if (a != null) {
          i1 = a.getWidth();
          i2 = op.a.getHeight();
       }else {
          i1 = 0;
          i2 = 0;
       }
       int i3 = 1;
       int i4 = p2 - 1;
       while (i3 < i4) {
          i4 = 4;
          if (i == i4) {
             i5 = i3 - 1;
             if (!uod.b[i5]) {
             label_00d7 :
                i3 = i3 + 1;
             }
          }
          MotionLayout$d c = uod.c;
          i5 = i3 * 2;
          int i6 = c[i5];
          i5 = i5 + 1;
          int i7 = c[i5];
          uod.d.reset();
          float f = i7 + 10.00f;
          uod.d.moveTo(i6, f);
          f = i6 + 10.00f;
          uod.d.lineTo(f, i7);
          f = i7 - 10.00f;
          uod.d.lineTo(i6, f);
          float f1 = i6 - 10.00f;
          uod.d.lineTo(f1, i7);
          uod.d.close();
          int i8 = i3 - 1;
          op.l(i8);
          f = 0.00f;
          if (i == i4) {
             b = uod.b;
             if (b[i8] == 1) {
                f2 = i6 - 0;
                f3 = i7 - 0;
                uod.h(uCanvas, f2, f3);
             }else if(b[i8] == 2){
                f2 = i6 - 0;
                f3 = i7 - 0;
                uod.f(uCanvas, f2, f3);
             }else if(b[i8] == f){
                f1 = i6 - 0;
                float f6 = i7 - 0;
                i11 = 3;
                f = f6;
                i9 = i7;
                i10 = i6;
                this.i(p0, f1, f, i1, i2);
             label_00a1 :
                uCanvas.drawPath(uod.d, uod.i);
             }
             i9 = i7;
             i10 = i6;
             i11 = 3;
             goto label_00a1 ;
          }else {
             i9 = i7;
             i10 = i6;
             i11 = 3;
          }
          if (i == 2) {
             f4 = i10 - 0;
             f5 = i9 - 0;
             uod.h(uCanvas, f4, f5);
          }
          if (i == i11) {
             f4 = i10 - 0;
             f5 = i9 - 0;
             uod.f(uCanvas, f4, f5);
          }
          if (i == 6) {
             f1 = i10 - 0;
             f = i9 - 0;
             this.i(p0, f1, f, i1, i2);
          }
          uCanvas.drawPath(uod.d, uod.i);
          goto label_00d7 ;
       }
       b = uod.a;
       if (b.length > 1) {
          uCanvas.drawCircle(b[0], b[1], 8.00f, uod.f);
          b = uod.a;
          uCanvas.drawCircle(b[(b.length - 2)], b[(b.length - 1)], 8.00f, uod.f);
       }
       return;
    }
    public void l(String p0,Paint p1){
       p1.getTextBounds(p0, 0, p0.length(), this.r);
    }
}
