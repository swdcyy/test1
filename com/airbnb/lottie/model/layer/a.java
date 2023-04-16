package com.airbnb.lottie.model.layer.a;
import y4.e;
import z4.a$a;
import p5.e;
import w4.h;
import com.airbnb.lottie.model.layer.Layer;
import java.lang.Object;
import android.graphics.Path;
import android.graphics.Matrix;
import x4.a;
import android.graphics.PorterDuff$Mode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.lang.String;
import com.airbnb.lottie.model.layer.Layer$MatteType;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.graphics.Paint;
import z4.o;
import q5.l;
import java.util.List;
import z4.g;
import java.util.Iterator;
import z4.a;
import z4.c;
import s5.a;
import java.lang.Float;
import android.graphics.Canvas;
import w4.d;
import java.lang.Integer;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.a$a;
import com.airbnb.lottie.model.content.Mask$MaskMode;
import java.lang.Enum;
import java.lang.Math;
import w5.c;
import p5.d;
import java.util.Collections;
import w4.e;
import w4.o;
import java.util.Map;
import v5.d;
import java.util.Set;
import w4.o$b;
import android.os.Build$VERSION;

public abstract class a implements e, a$a, e	// class@000dd5
{
    public final Path a;
    public final Matrix b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final RectF h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final String l;
    public final Matrix m;
    public final h n;
    public final Layer o;
    public g p;
    public a q;
    public a r;
    public List s;
    public final List t;
    public final o u;
    public boolean v;

    public void a(h p0,Layer p1){
       super();
       this.a = new Path();
       this.b = new Matrix();
       int i = 1;
       this.c = new a(i);
       this.d = new a(i, PorterDuff$Mode.DST_IN);
       this.e = new a(i, PorterDuff$Mode.DST_OUT);
       a uoa = new a(i);
       this.f = uoa;
       this.g = new a(PorterDuff$Mode.CLEAR);
       this.h = new RectF();
       this.i = new RectF();
       this.j = new RectF();
       this.k = new RectF();
       this.m = new Matrix();
       this.t = new ArrayList();
       this.v = i;
       this.n = p0;
       this.o = p1;
       this.l = p1.f()+"#draw";
       if (p1.e() == Layer$MatteType.INVERT) {
          uoa.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
       }else {
          uoa.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
       }
       o oo = p1.i.b();
       this.u = oo;
       oo.b(this);
       if (p1.d() != null && !p1.d().isEmpty()) {
          g og = new g(p1.d());
          this.p = og;
          Iterator iterator = og.a().iterator();
          while (iterator.hasNext()) {
             iterator.next().a(this);
          }
          iterator = this.p.c().iterator();
          while (iterator.hasNext()) {
             a uoa1 = iterator.next();
             this.d(uoa1);
             uoa1.a(this);
          }
       }
       if (!this.o.b().isEmpty()) {
          c uoc = new c(this.o.b());
          uoc.b = i;
          uoc.a(new a(this, uoc));
          if (uoc.h().floatValue() - 0x3f800000) {
             i = false;
          }
          this.t(i);
          this.d(uoc);
       }else {
          this.t(i);
       }
       return;
    }
    public void a(Canvas p0,Matrix p1,int p2){
       a uoa3;
       float f1;
       float f2;
       a uoa = this;
       Canvas uCanvas = p0;
       Matrix matrix = p1;
       d.a(uoa.l);
       if (uoa.v == null || uoa.o.v != null) {
          d.b(uoa.l);
          return;
       }else {
          this.h();
          String str = "Layer#parentMatrix";
          d.a(str);
          uoa.b.reset();
          uoa.b.set(matrix);
          int i = 1;
          for (int i1 = uoa.s.size() - i; i1 >= 0; i1 = i1 - 1) {
             uoa.b.preConcat(uoa.s.get(i1).u.e());
          }
          d.b(str);
          int i2 = (uoa.u.g() == null)? 100: uoa.u.g().h().intValue();
          i2 = (int)(((((float)p2 / 0x437f0000) * (float)i2) / 100.00f) * 0x437f0000);
          String str1 = "Layer#drawLayer";
          if (!this.m() && !this.l()) {
             uoa.b.preConcat(uoa.u.e());
             d.a(str1);
             uoa.j(uCanvas, uoa.b, i2);
             d.b(str1);
             uoa.o(d.b(uoa.l));
             return;
          }else {
             String str2 = "Layer#computeBounds";
             d.a(str2);
             uoa.c(uoa.h, uoa.b, false);
             a h = uoa.h;
             float f = 0;
             if (this.m() && uoa.o.e() != Layer$MatteType.INVERT) {
                uoa.j.set(f, f, f, f);
                uoa.q.c(uoa.j, matrix, i);
                if (!h.intersect(uoa.j)) {
                   h.set(f, f, f, f);
                }
             }
             uoa.b.preConcat(uoa.u.e());
             h = uoa.h;
             a b = uoa.b;
             uoa.i.set(f, f, f, f);
             a uoa1 = 3;
             a uoa2 = 2;
             if (this.l()) {
                int i5 = uoa.p.b().size();
                int i6 = 0;
                while (true) {
                   if (i6 < i5) {
                      Mask mask1 = uoa.p.b().get(i6);
                      Path path = uoa.p.a().get(i6).h();
                      if (path != null) {
                         uoa.a.set(path);
                         uoa.a.transform(b);
                         int i7 = a$a.b[mask1.a().ordinal()];
                         if (i7 != i && (i7 == uoa2 || (i7 != uoa1 || !mask1.b()))) {
                            uoa.a.computeBounds(uoa.k, false);
                            if (!i6) {
                               uoa.i.set(uoa.k);
                            }else {
                               uoa3 = uoa.i;
                               uoa3.set(Math.min(uoa3.left, uoa.k.left), Math.min(uoa.i.top, uoa.k.top), Math.max(uoa.i.right, uoa.k.right), Math.max(uoa.i.bottom, uoa.k.bottom));
                            }
                         }
                      }
                      i6 = i6 + 1;
                      i = 1;
                      uoa1 = 3;
                      uoa2 = 2;
                   }else if(!h.intersect(uoa.i)){
                      h.set(0, 0, 0, 0);
                   }
                }
             }
             d.b(str2);
             if (!uoa.h.isEmpty()) {
                str2 = "Layer#saveLayer";
                d.a(str2);
                uoa.r(uCanvas, uoa.h, uoa.c, true);
                d.b(str2);
                this.i(p0);
                d.a(str1);
                uoa.j(uCanvas, uoa.b, i2);
                d.b(str1);
                if (this.l()) {
                   a b1 = uoa.b;
                   d.a(str2);
                   uoa.r(uCanvas, uoa.h, uoa.d, false);
                   d.b(str2);
                   int i3 = 0;
                   while (i3 < uoa.p.b().size()) {
                      Mask mask = uoa.p.b().get(i3);
                      b = uoa.p.a().get(i3);
                      uoa3 = uoa.p.c().get(i3);
                      int i4 = a$a.b[mask.a().ordinal()];
                      boolean b2 = true;
                      if (i4 != b2) {
                         if (i4 != 2) {
                            if (i4 == 3) {
                               if (mask.b()) {
                                  uoa.r(uCanvas, uoa.h, uoa.c, b2);
                                  uCanvas.drawRect(uoa.h, uoa.c);
                                  uoa.a.set(b.h());
                                  uoa.a.transform(b1);
                                  f1 = (float)uoa3.h().intValue() * 2.55f;
                                  uoa.c.setAlpha((int)f1);
                                  uCanvas.drawPath(uoa.a, uoa.e);
                                  p0.restore();
                               }else {
                                  uoa.a.set(b.h());
                                  uoa.a.transform(b1);
                                  f1 = (float)uoa3.h().intValue() * 2.55f;
                                  uoa.c.setAlpha((int)f1);
                                  uCanvas.drawPath(uoa.a, uoa.c);
                               }
                            }
                         }else if(mask.b()){
                            uoa.r(uCanvas, uoa.h, uoa.d, true);
                            uCanvas.drawRect(uoa.h, uoa.c);
                            f2 = (float)uoa3.h().intValue() * 2.55f;
                            uoa.e.setAlpha((int)f2);
                            uoa.a.set(b.h());
                            uoa.a.transform(b1);
                            uCanvas.drawPath(uoa.a, uoa.e);
                            p0.restore();
                         }else {
                            uoa.r(uCanvas, uoa.h, uoa.d, true);
                            uoa.a.set(b.h());
                            uoa.a.transform(b1);
                            f1 = (float)uoa3.h().intValue() * 2.55f;
                            uoa.c.setAlpha((int)f1);
                            uCanvas.drawPath(uoa.a, uoa.c);
                            p0.restore();
                         }
                         b2 = true;
                      }else if(!i3){
                         Paint paint = new Paint();
                         paint.setColor(0xff000000);
                         uCanvas.drawRect(uoa.h, paint);
                      }
                      if (mask.b()) {
                         uoa.r(uCanvas, uoa.h, uoa.e, true);
                         uCanvas.drawRect(uoa.h, uoa.c);
                         f2 = (float)uoa3.h().intValue() * 2.55f;
                         uoa.e.setAlpha((int)f2);
                         uoa.a.set(b.h());
                         uoa.a.transform(b1);
                         uCanvas.drawPath(uoa.a, uoa.e);
                         p0.restore();
                      }else {
                         uoa.a.set(b.h());
                         uoa.a.transform(b1);
                         uCanvas.drawPath(uoa.a, uoa.e);
                      }
                      i3 = i3 + 1;
                   }
                   d.a("Layer#restoreLayer");
                   p0.restore();
                   d.b("Layer#restoreLayer");
                }
                if (this.m()) {
                   d.a("Layer#drawMatte");
                   d.a(str2);
                   uoa.r(uCanvas, uoa.h, uoa.f, false);
                   d.b(str2);
                   this.i(p0);
                   uoa.q.a(uCanvas, matrix, i2);
                   d.a("Layer#restoreLayer");
                   p0.restore();
                   d.b("Layer#restoreLayer");
                   d.b("Layer#drawMatte");
                }
                d.a("Layer#restoreLayer");
                p0.restore();
                d.b("Layer#restoreLayer");
             }
             uoa.o(d.b(uoa.l));
             return;
          }
       }
    }
    public void b(List p0,List p1){
    }
    public void c(RectF p0,Matrix p1,boolean p2){
       this.h.set(0, 0, 0, 0);
       this.h();
       this.m.set(p1);
       if (p2) {
          a ts = this.s;
          if (ts != null) {
             for (int i = ts.size() - 1; i >= 0; i--) {
                this.m.preConcat(this.s.get(i).u.e());
             }
          }else {
             ts = this.r;
             if (ts != null) {
                this.m.preConcat(ts.u.e());
             }
          }
       }
       this.m.preConcat(this.u.e());
       return;
    }
    public void d(a p0){
       if (p0 == null) {
          return;
       }
       this.t.add(p0);
       return;
    }
    public void e(){
       this.n();
    }
    public void f(Object p0,c p1){
       this.u.c(p0, p1);
    }
    public void g(d p0,int p1,List p2,d p3){
       if (!p0.g(this.getName(), p1)) {
          return;
       }
       if (!("__container").equals(this.getName())) {
          p3 = p3.a(this.getName());
          if (p0.c(this.getName(), p1)) {
             p2.add(p3.i(this));
          }
       }
       if (p0.h(this.getName(), p1)) {
          this.q(p0, (p1 + p0.e(this.getName(), p1)), p2, p3);
       }
       return;
    }
    public String getName(){
       return this.o.f();
    }
    public final void h(){
       if (this.s != null) {
          return;
       }
       if (this.r == null) {
          this.s = Collections.emptyList();
          return;
       }else {
          this.s = new ArrayList();
          a tr = this.r;
          while (tr != null) {
             this.s.add(tr);
             tr = tr.r;
          }
          return;
       }
    }
    public final void i(Canvas p0){
       d.a("Layer#clearLayer");
       a th = this.h;
       p0.drawRect((th.left - 0x3f800000), (th.top - 0x3f800000), (th.right + 0x3f800000), (th.bottom + 0x3f800000), this.g);
       d.b("Layer#clearLayer");
    }
    public abstract void j(Canvas p0,Matrix p1,int p2);
    public Layer k(){
       return this.o;
    }
    public boolean l(){
       a tp = this.p;
       boolean b = (tp != null && !tp.a().isEmpty())? true: false;
       return b;
    }
    public boolean m(){
       boolean b = (this.q != null)? true: false;
       return b;
    }
    public final void n(){
       this.n.invalidateSelf();
    }
    public final void o(float p0){
       o oo = this.n.h().k();
       String str = this.o.f();
       if (oo.a == null) {
       }else {
          d uod = oo.c.get(str);
          if (uod == null) {
             uod = new d();
             oo.c.put(str, uod);
          }
          float f = uod.a + p0;
          uod.a = f;
          int i = uod.b + 1;
          uod.b = i;
          if (i == Integer.MAX_VALUE) {
             uod.a = f / 2.00f;
             uod.b = i / 2;
          }
          if (str.equals("__container")) {
             Iterator iterator = oo.b.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(p0);
             }
          }
       }
       return;
    }
    public void p(a p0){
       this.t.remove(p0);
    }
    public void q(d p0,int p1,List p2,d p3){
    }
    public final void r(Canvas p0,RectF p1,Paint p2,boolean p3){
       if (Build$VERSION.SDK_INT < 23) {
          int i = (p3)? 31: 19;
          p0.saveLayer(p1, p2, i);
       }else {
          p0.saveLayer(p1, p2);
       }
       return;
    }
    public void s(float p0){
       a tu = this.u;
       o j = tu.j;
       if (j != null) {
          j.k(p0);
       }
       j = tu.m;
       if (j != null) {
          j.k(p0);
       }
       j = tu.n;
       if (j != null) {
          j.k(p0);
       }
       j = tu.f;
       if (j != null) {
          j.k(p0);
       }
       j = tu.g;
       if (j != null) {
          j.k(p0);
       }
       j = tu.h;
       if (j != null) {
          j.k(p0);
       }
       j = tu.i;
       if (j != null) {
          j.k(p0);
       }
       j = tu.k;
       if (j != null) {
          j.k(p0);
       }
       o l = tu.l;
       if (l != null) {
          l.k(p0);
       }
       int i = 0;
       if (this.p != null) {
          for (int i1 = 0; i1 < this.p.a().size(); i1 = i1 + 1) {
             this.p.a().get(i1).k(p0);
          }
       }
       if (this.o.l() - null) {
          p0 = p0 / this.o.l();
       }
       tu = this.q;
       if (tu != null) {
          this.q.s((tu.o.l() * p0));
       }
       while (i < this.t.size()) {
          this.t.get(i).k(p0);
          i = i + 1;
       }
       return;
    }
    public void t(boolean p0){
       if (p0 != this.v) {
          this.v = p0;
          this.n();
       }
       return;
    }
}
