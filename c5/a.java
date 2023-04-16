package c5.a;
import d5.a$a;
import c5.k;
import c5.e;
import a5.f;
import com.airbnb.lottie.ex.model.layer.a;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import h5.d;
import h5.b;
import java.util.List;
import java.lang.Object;
import android.graphics.PathMeasure;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import b5.a;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import d5.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import java.lang.String;
import a5.d;
import m5.f;
import d5.e;
import n5.a;
import m5.e;
import d5.c;
import java.lang.Float;
import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import android.graphics.ColorFilter;
import c5.a$b;
import c5.n;
import c5.t;
import java.lang.Math;
import c5.c;
import com.airbnb.lottie.ex.model.content.ShapeTrimPath$Type;
import c5.a$a;
import n5.c;
import a5.j;
import d5.p;
import g5.d;

public abstract class a implements a$a, k, e	// class@000ccb
{
    public final PathMeasure a;
    public final Path b;
    public final Path c;
    public final RectF d;
    public final f e;
    public final a f;
    public final List g;
    public final float[] h;
    public final Paint i;
    public final a j;
    public final a k;
    public final List l;
    public final a m;
    public a n;

    public void a(f p0,a p1,Paint$Cap p2,Paint$Join p3,float p4,d p5,b p6,List p7,b p8){
       super();
       this.a = new PathMeasure();
       this.b = new Path();
       this.c = new Path();
       this.d = new RectF();
       this.g = new ArrayList();
       a uoa = new a(1);
       this.i = uoa;
       this.e = p0;
       this.f = p1;
       uoa.setStyle(Paint$Style.STROKE);
       uoa.setStrokeCap(p2);
       uoa.setStrokeJoin(p3);
       uoa.setStrokeMiter(p4);
       this.k = p5.a();
       this.j = p6.a();
       this.m = (p8 == null)? null: p8.a();
       this.l = new ArrayList(p7.size());
       float[] uofloatArray = new float[p7.size()];
       this.h = uofloatArray;
       int i = 0;
       for (int i1 = 0; i1 < p7.size(); i1++) {
          this.l.add(p7.get(i1).a());
       }
       p1.d(this.k);
       p1.d(this.j);
       for (i1 = 0; i1 < this.l.size(); i1++) {
          p1.d(this.l.get(i1));
       }
       a tm = this.m;
       if (tm != null) {
          p1.d(tm);
       }
       this.k.a(this);
       this.j.a(this);
       for (; i < p7.size(); i++) {
          this.l.get(i).a(this);
       }
       a tm1 = this.m;
       if (tm1 != null) {
          tm1.a(this);
       }
       return;
    }
    public void a(Canvas p0,Matrix p1,int p2){
       float[] d;
       float f;
       int i4;
       float f2;
       float f7;
       a h;
       a uoa = this;
       Canvas uCanvas = p0;
       Matrix matrix = p1;
       d.a("StrokeContent#draw");
       d = f.d;
       int i = 0;
       d[i] = 0;
       int i1 = 1;
       d[i1] = 0;
       d[2] = 0x471212bb;
       int i2 = 3;
       d[i2] = 0x471a973c;
       matrix.mapPoints(d);
       d = (!d[i] - d[2] || !d[i1] - d[i2])? 1: 0;
       if (d) {
          d.b("StrokeContent#draw");
          return;
       }else {
          a k = uoa.k;
          f = 100.00f;
          uoa.i.setAlpha(e.c((int)(((((float)p2 / 0x437f0000) * (float)k.m(k.b(), k.d())) / f) * 0x437f0000), i, 255));
          uoa.i.setStrokeWidth((uoa.j.m() * f.d(p1)));
          if (uoa.i.getStrokeWidth() <= 0) {
             d.b("StrokeContent#draw");
             return;
          }else {
             String str = "StrokeContent#applyDashPattern";
             d.a(str);
             float f1 = 0x3f800000;
             if (uoa.l.isEmpty()) {
                d.b(str);
             }else {
                float f8 = f.d(p1);
                for (int i6 = 0; i6 < uoa.l.size(); i6 = i6 + 1) {
                   uoa.h[i6] = uoa.l.get(i6).h().floatValue();
                   i4 = i6 % 2;
                   if (!i4) {
                      h = uoa.h;
                      if (h[i6] - f1 < 0) {
                         h[i6] = f1;
                      }
                   }else {
                      h = uoa.h;
                      int i7 = 0x3dcccccd;
                      if (h[i6] - i7 < 0) {
                         h[i6] = i7;
                      }
                   }
                   h = uoa.h;
                   f2 = h[i6] * f8;
                   h[i6] = f2;
                }
                a m = uoa.m;
                f8 = (m == null)? 0: m.h().floatValue();
                uoa.i.setPathEffect(new DashPathEffect(uoa.h, f8));
                d.b(str);
             }
             a n = uoa.n;
             if (n != null) {
                uoa.i.setColorFilter(n.h());
             }
             int i3 = 0;
             while (i3 < uoa.g.size()) {
                a$b uob = uoa.g.get(i3);
                if (uob.b != null) {
                   String str1 = "StrokeContent#applyTrimPath";
                   d.a(str1);
                   if (uob.b == null) {
                      d.b(str1);
                   }else {
                      uoa.b.reset();
                      i4 = uob.a.size();
                      i4 = i4 - 1;
                      while (i4 >= 0) {
                         uoa.b.addPath(uob.a.get(i4).getPath(), matrix);
                      }
                      uoa.a.setPath(uoa.b, i);
                      float length = uoa.a.getLength();
                      while (uoa.a.nextContour()) {
                         length = length + uoa.a.getLength();
                      }
                      f2 = (uob.b.g().h().floatValue() * length) / 360.00f;
                      float f3 = ((uob.b.h().h().floatValue() * length) / f) + f2;
                      float f4 = ((uob.b.f().h().floatValue() * length) / f) + f2;
                      int i5 = uob.a.size() - 1;
                      float f5 = 0;
                      while (i5 >= 0) {
                         uoa.c.set(uob.a.get(i5).getPath());
                         uoa.c.transform(matrix);
                         uoa.a.setPath(uoa.c, i);
                         float length1 = uoa.a.getLength();
                         if (f4 - length > 0) {
                            f = f4 - length;
                            float f6 = f5 + length1;
                            if (f - f6 < 0 && f5 - f < 0) {
                               if (f3 - length > 0) {
                                  f6 = f3 - length;
                                  f6 = f6 / length1;
                                  f7 = f6;
                               }else {
                                  f7 = 0;
                               }
                               f = f / length1;
                               f.a(uoa.c, f7, Math.min(f, f1), 0);
                               uCanvas.drawPath(uoa.c, uoa.i);
                            }else {
                            label_020e :
                               f7 = f5 + length1;
                               if (f7 - f3 >= 0 && f5 - f4 <= 0) {
                                  if (f7 - f4 <= 0 && f3 - f5 < 0) {
                                     uCanvas.drawPath(uoa.c, uoa.i);
                                  }else if(f3 - f5 < 0){
                                     f = 0;
                                  }else {
                                     f = f3 - f5;
                                     f = f / length1;
                                  }
                                  if (f4 - f7 > 0) {
                                     f7 = 0x3f800000;
                                  }else {
                                     f7 = f4 - f5;
                                     f7 = f7 / length1;
                                  }
                                  f.a(uoa.c, f, f7, 0);
                                  uCanvas.drawPath(uoa.c, uoa.i);
                               }
                            }
                         }else {
                            goto label_020e ;
                         }
                         f5 = f5 + length1;
                         i5 = i5 - 1;
                         i = false;
                         f1 = 0x3f800000;
                      }
                      d.b(str1);
                   }
                   f = 1;
                }else {
                   String str2 = "StrokeContent#buildPath";
                   d.a(str2);
                   uoa.b.reset();
                   for (i1 = uob.a.size() - 1; i1 >= 0; i1 = i1 - 1) {
                      uoa.b.addPath(uob.a.get(i1).getPath(), matrix);
                   }
                   d.b(str2);
                   str2 = "StrokeContent#drawPath";
                   d.a(str2);
                   uCanvas.drawPath(uoa.b, uoa.i);
                   d.b(str2);
                }
                i3 = i3 + 1;
                i = false;
                f = 100.00f;
                f1 = 0x3f800000;
             }
             d.b("StrokeContent#draw");
             return;
          }
       }
    }
    public void b(List p0,List p1){
       c uoc;
       int i = p0.size() - 1;
       t ot = null;
       while (i >= 0) {
          uoc = p0.get(i);
          if (uoc instanceof t && uoc.i() == ShapeTrimPath$Type.INDIVIDUALLY) {
             ot = uoc;
          }
          i = i - 1;
       }
       if (ot != null) {
          ot.d(this);
       }
       int i1 = p1.size() - 1;
       a$b uob = null;
       while (i1 >= 0) {
          uoc = p1.get(i1);
          if (uoc instanceof t) {
             c uoc1 = uoc;
             if (uoc1.i() == ShapeTrimPath$Type.INDIVIDUALLY) {
                if (uob != null) {
                   this.g.add(uob);
                }
                uob = new a$b(uoc1, null);
                uoc1.d(this);
             }else if(uoc instanceof n){
                if (uob == null) {
                   uob = new a$b(ot, null);
                }
                uob.a.add(uoc);
             }
          }else {
             goto label_0055 ;
          }
          i1--;
       }
       if (uob != null) {
          this.g.add(uob);
       }
       return;
    }
    public void c(RectF p0,Matrix p1,boolean p2){
       d.a("StrokeContent#getBounds");
       this.b.reset();
       boolean b = false;
       int i = 0;
       while (i < this.g.size()) {
          a$b uob = this.g.get(i);
          for (int i1 = 0; i1 < uob.a.size(); i1 = i1 + 1) {
             this.b.addPath(uob.a.get(i1).getPath(), p1);
          }
          i = i + 1;
       }
       this.b.computeBounds(this.d, b);
       a td = this.d;
       float f = this.j.m() / 2.00f;
       td.set((td.left - f), (td.top - f), (td.right + f), (td.bottom + f));
       p0.set(this.d);
       p0.set((p0.left - 0x3f800000), (p0.top - 0x3f800000), (p0.right + 0x3f800000), (p0.bottom + 0x3f800000));
       d.b("StrokeContent#getBounds");
       return;
    }
    public void e(){
       this.e.invalidateSelf();
    }
    public void f(Object p0,c p1){
       if (p0 == j.d) {
          this.k.l(p1);
       }else if(p0 == j.o){
          this.j.l(p1);
       }else if(p0 == j.B){
          if (p1 == null) {
             this.n = null;
          }else {
             p0 = new p(p1);
             this.n = p0;
             p0.a(this);
             this.f.d(this.n);
          }
       }
       return;
    }
    public void g(d p0,int p1,List p2,d p3){
       e.f(p0, p1, p2, p3, this);
    }
}
