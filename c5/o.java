package c5.o;
import c5.n;
import d5.a$a;
import c5.k;
import a5.f;
import com.airbnb.lottie.ex.model.layer.a;
import com.airbnb.lottie.ex.model.content.PolystarShape;
import java.lang.Object;
import android.graphics.Path;
import c5.b;
import d5.a;
import h5.b;
import h5.m;
import com.airbnb.lottie.ex.model.content.PolystarShape$Type;
import java.util.List;
import c5.c;
import c5.t;
import com.airbnb.lottie.ex.model.content.ShapeTrimPath$Type;
import n5.c;
import a5.j;
import g5.d;
import m5.e;
import java.lang.String;
import c5.o$a;
import java.lang.Enum;
import java.lang.Float;
import java.lang.Math;
import android.graphics.PointF;

public class o implements n, a$a, k	// class@000cdb
{
    public final Path a;
    public final String b;
    public final f c;
    public final PolystarShape$Type d;
    public final boolean e;
    public final a f;
    public final a g;
    public final a h;
    public final a i;
    public final a j;
    public final a k;
    public final a l;
    public b m;
    public boolean n;

    public void o(f p0,a p1,PolystarShape p2){
       super();
       this.a = new Path();
       this.m = new b();
       this.c = p0;
       this.b = p2.a;
       PolystarShape b = p2.b;
       this.d = b;
       this.e = p2.j;
       a uoa = p2.c.a();
       this.f = uoa;
       a uoa1 = p2.d.a();
       this.g = uoa1;
       a uoa2 = p2.e.a();
       this.h = uoa2;
       a uoa3 = p2.g.a();
       this.j = uoa3;
       a uoa4 = p2.i.a();
       this.l = uoa4;
       PolystarShape$Type sTAR = PolystarShape$Type.STAR;
       if (b == sTAR) {
          this.i = p2.f.a();
          this.k = p2.h.a();
       }else {
          a uoa5 = null;
          this.i = uoa5;
          this.k = uoa5;
       }
       p1.d(uoa);
       p1.d(uoa1);
       p1.d(uoa2);
       p1.d(uoa3);
       p1.d(uoa4);
       if (b == sTAR) {
          p1.d(this.i);
          p1.d(this.k);
       }
       uoa.a(this);
       uoa1.a(this);
       uoa2.a(this);
       uoa3.a(this);
       uoa4.a(this);
       if (b == sTAR) {
          this.i.a(this);
          this.k.a(this);
       }
       return;
    }
    public void b(List p0,List p1){
       int i = 0;
       while (i < p0.size()) {
          c uoc = p0.get(i);
          if (uoc instanceof t && uoc.i() == ShapeTrimPath$Type.SIMULTANEOUSLY) {
             this.m.a(uoc);
             uoc.d(this);
          }
          i++;
       }
       return;
    }
    public void e(){
       this.n = false;
       this.c.invalidateSelf();
    }
    public void f(Object p0,c p1){
       o ti;
       if (p0 == j.s) {
          this.f.l(p1);
       }else if(p0 == j.t){
          this.h.l(p1);
       }else if(p0 == j.j){
          this.g.l(p1);
       }else if(p0 == j.u){
          ti = this.i;
          if (ti != null) {
             ti.l(p1);
          }
       }
       if (p0 == j.v) {
          this.j.l(p1);
       }else if(p0 == j.w){
          ti = this.k;
          if (ti != null) {
             ti.l(p1);
          }
       }
       if (p0 == j.x) {
          this.l.l(p1);
       }
       return;
    }
    public void g(d p0,int p1,List p2,d p3){
       e.f(p0, p1, p2, p3, this);
    }
    public String getName(){
       return this.b;
    }
    public Path getPath(){
       o h;
       float f1;
       float f2;
       float f3;
       double d4;
       double d6;
       float f4;
       float f5;
       double d7;
       double d8;
       double d9;
       float f6;
       float f8;
       float f9;
       float f10;
       float f13;
       float f14;
       PointF pointF;
       float f16;
       float f17;
       float f18;
       float f20;
       float f21;
       PointF pointF1;
       o oo = this;
       if (oo.n != null) {
          return oo.a;
       }
       oo.a.reset();
       boolean b = true;
       if (oo.e != null) {
          oo.n = b;
          return oo.a;
       }else {
          int i = o$a.a[oo.d.ordinal()];
          float f = 100.00f;
          double d = 0x401921fb54442d18;
          double d1 = 90.00f;
          double d2 = 0;
          if (i != b) {
             if (i == -0.00f) {
                i = (int)Math.floor((double)oo.f.h().floatValue());
                h = oo.h;
                if (h != null) {
                   d2 = (double)h.h().floatValue();
                }
                d1 = Math.toRadians((d2 - d1));
                d2 = (double)i;
                f1 = oo.l.h().floatValue() / f;
                f = oo.j.h().floatValue();
                double d3 = (double)f;
                f2 = f;
                f3 = (float)(Math.cos(d1) * d3);
                f = (float)(Math.sin(d1) * d3);
                oo.a.moveTo(f3, f);
                d4 = (double)(float)(d / d2);
                d1 = d1 + d4;
                d2 = Math.ceil(d2);
                double d5 = d3;
                i = 0;
                while ((double)i - d2 < 0) {
                   d6 = Math.cos(d1) * d5;
                   f4 = (float)d6;
                   d3 = Math.sin(d1) * d5;
                   f5 = (float)d3;
                   if (f1) {
                      d7 = d2;
                      d2 = Math.atan2((double)f, (double)f3) - 0x3ff921fb54442d18;
                      d2 = (double)(float)d2;
                      d8 = d1;
                      d9 = d4;
                      f6 = f4;
                      d1 = Math.atan2((double)f5, (double)f6) - 0x3ff921fb54442d18;
                      d1 = (double)(float)d1;
                      float f7 = f2 * f1;
                      f7 = f7 * 0.25f;
                      f8 = (float)Math.cos(d2) * f7;
                      f9 = (float)Math.sin(d2) * f7;
                      f10 = (float)Math.cos(d1) * f7;
                      f7 = f7 * (float)Math.sin(d1);
                      float f11 = f3 - f8;
                      float f12 = f - f9;
                      f13 = f6 + f10;
                      f14 = f5 + f7;
                      oo.a.cubicTo(f11, f12, f13, f14, f6, f5);
                   }else {
                      d8 = d1;
                      d7 = d2;
                      d9 = d4;
                      f6 = f4;
                      oo.a.lineTo(f6, f5);
                   }
                   d1 = d8 + d9;
                   i = i + 1;
                   f3 = f6;
                   f = f5;
                   d2 = d7;
                   d4 = d9;
                }
                pointF = oo.g.h();
                oo.a.offset(pointF.x, pointF.y);
                oo.a.close();
             }
          }else {
             float f15 = oo.f.h().floatValue();
             o h1 = oo.h;
             if (h1 != null) {
                d2 = (double)h1.h().floatValue();
             }
             d1 = Math.toRadians((d2 - d1));
             d2 = (double)f15;
             f3 = (float)(d / d2);
             f2 = f3 / 2.00f;
             f15 = f15 - (float)(int)f15;
             if (v11 = f15 - null) {
                d1 = d1 + (double)((0x3f800000 - f15) * f2);
             }
             f10 = oo.j.h().floatValue();
             f4 = oo.i.h().floatValue();
             h = oo.k;
             f5 = (h != null)? h.h().floatValue() / f: 0;
             o l = oo.l;
             f = (l != null)? l.h().floatValue() / f: null;
             if (v11) {
                f16 = ((f10 - f4) * f15) + f4;
                f17 = f4;
                double d10 = (double)f16;
                f1 = (float)(d10 * Math.cos(d1));
                f2 = (float)(d10 * Math.sin(d1));
                oo.a.moveTo(f1, f2);
                d1 = d1 + (double)((f3 * f15) / 2.00f);
                f4 = f16;
                f16 = f1;
                f1 = f2;
             }else {
                f17 = f4;
                d = (double)f10;
                f8 = (float)(Math.cos(d1) * d);
                f2 = (float)(d * Math.sin(d1));
                oo.a.moveTo(f8, f2);
                f16 = f8;
                f1 = f2;
                d1 = d1 + (double)f1;
                d6 = 0;
             }
             d2 = Math.ceil(d2) * 2.00f;
             f13 = f10;
             int i1 = v11;
             f8 = f16;
             int i2 = 0;
             int i3 = 0;
             d4 = (double)i2;
             while (d4 - d2 < 0) {
                f14 = (i3)? f13: f17;
                if (v25 = f4) {
                   d7 = d2 - 2.00f;
                   if (!d4 - d7) {
                      f18 = f3 * f15;
                      f18 = f18 / 2.00f;
                      float f19 = f18;
                      f18 = f3;
                      f3 = f19;
                   label_022f :
                      d7 = 0x3ff0000000000000;
                      if (v25) {
                         d8 = d2 - d7;
                         if (!d4 - d8) {
                            f20 = f1;
                            d8 = d4;
                            f1 = f4;
                         label_0245 :
                            d4 = (double)f1;
                            double d11 = d2;
                            d2 = d4 * Math.cos(d1);
                            f1 = (float)d2;
                            d4 = d4 * Math.sin(d1);
                            f9 = (float)d4;
                            double d12 = 0;
                            if (!f5 - d12 && !f - d12) {
                               oo.a.lineTo(f1, f9);
                               f21 = f4;
                               f14 = f5;
                            }else {
                               f21 = f4;
                               f14 = f5;
                               d4 = Math.atan2((double)f2, (double)f8) - 0x3ff921fb54442d18;
                               d4 = (double)(float)d4;
                               f4 = (float)Math.cos(d4);
                               f5 = (float)Math.sin(d4);
                               float f22 = f8;
                               d12 = Math.atan2((double)f9, (double)f1) - 0x3ff921fb54442d18;
                               d12 = (double)(float)d12;
                               float f23 = (float)Math.cos(d12);
                               f6 = (float)Math.sin(d12);
                               f10 = (i3)? f14: f;
                               f8 = (i3)? f: f14;
                               float f24 = (i3)? f17: f13;
                               float f25 = (i3)? f13: f17;
                               f24 = f24 * f10;
                               f10 = 0x3ef4e26d;
                               f24 = f24 * f10;
                               f4 = f4 * f24;
                               f24 = f24 * f5;
                               f25 = f25 * f8;
                               f25 = f25 * f10;
                               f23 = f23 * f25;
                               f25 = f25 * f6;
                               if (i1) {
                                  if (!i2) {
                                     f4 = f4 * f15;
                                     f24 = f24 * f15;
                                  }else {
                                     d12 = d11 - d7;
                                     if (!d8 - d12) {
                                        f23 = f23 * f15;
                                        f25 = f25 * f15;
                                     }
                                  }
                               }
                               f10 = f22 - f4;
                               float f26 = f2 - f24;
                               float f27 = f1 + f23;
                               float f28 = f9 + f25;
                               oo.a.cubicTo(f10, f26, f27, f28, f1, f9);
                            }
                            d1 = d1 + (double)f3;
                            i3 = i3 ^ 0x01;
                            i2 = i2 + 1;
                            f8 = f1;
                            f2 = f9;
                            f5 = f14;
                            f3 = f18;
                            f1 = f20;
                            f4 = f21;
                            d2 = d11;
                         }
                      }
                      f20 = f1;
                      d8 = d4;
                      f1 = f14;
                      goto label_0245 ;
                   }
                }
                f18 = f3;
                f3 = f1;
                goto label_022f ;
             }
             pointF = oo.g.h();
             oo.a.offset(pointF.x, pointF.y);
             oo.a.close();
          }
          oo.a.close();
          oo.m.b(oo.a);
          oo.n = true;
          return oo.a;
       }
    }
}
