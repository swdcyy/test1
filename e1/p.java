package e1.p;
import android.view.View;
import java.lang.Object;
import e1.r;
import e1.o;
import java.util.ArrayList;
import e1.e;
import java.util.Collection;
import d1.b;
import java.util.Iterator;
import java.util.HashMap;
import e1.t;
import e1.i;
import java.lang.Float;
import d1.c;
import java.lang.String;
import java.lang.Math;
import e1.l;
import android.graphics.RectF;
import d1.h;
import java.util.List;
import java.util.Collections;
import e1.g;
import e1.u;
import e1.u$d;
import e1.t$d;
import java.util.LinkedHashMap;
import androidx.constraintlayout.widget.ConstraintAttribute;
import e1.n;
import android.view.View$MeasureSpec;
import e1.i$f;
import java.lang.StringBuilder;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.a$a;
import androidx.constraintlayout.widget.a$c;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import java.util.HashSet;
import e1.k;
import e1.h;
import e1.m;
import android.util.SparseArray;
import e1.f;
import java.util.Set;
import java.lang.Integer;
import java.lang.Class;
import java.lang.reflect.Array;
import java.util.Arrays;

public class p	// class@001ea1
{
    public n[] A;
    public int B;
    public String[] C;
    public View a;
    public int b;
    public String c;
    public int d;
    public r e;
    public r f;
    public o g;
    public o h;
    public b[] i;
    public b j;
    public float k;
    public float l;
    public float m;
    public int[] n;
    public double[] o;
    public double[] p;
    public String[] q;
    public int[] r;
    public int s;
    public float[] t;
    public ArrayList u;
    public float[] v;
    public ArrayList w;
    public HashMap x;
    public HashMap y;
    public HashMap z;

    public void p(View p0){
       super();
       this.d = -1;
       this.e = new r();
       this.f = new r();
       this.g = new o();
       this.h = new o();
       this.k = Float.NaN;
       this.l = 0;
       this.m = 0x3f800000;
       this.s = 4;
       float[] uofloatArray = new float[4];
       this.t = uofloatArray;
       this.u = new ArrayList();
       uofloatArray = new float[1];
       this.v = uofloatArray;
       this.w = new ArrayList();
       this.B = e.f;
       this.y(p0);
    }
    public void a(e p0){
       this.w.add(p0);
    }
    public void b(ArrayList p0){
       this.w.addAll(p0);
    }
    public int c(float[] p0,int[] p1){
       if (p0 == null) {
          return 0;
       }
       double[] uodoubleArra = this.i[0].h();
       if (p1 != null) {
          Iterator iterator = this.u.iterator();
          int i = 0;
          while (iterator.hasNext()) {
             int i1 = i + 1;
             p1[i] = iterator.next().n;
             i = i1;
          }
       }
       int i3 = 0;
       for (int i2 = 0; i2 < uodoubleArra.length; i2++) {
          this.i[0].d(uodoubleArra[i2], this.o);
          this.e.f(this.n, this.o, p0, i3);
          i3 = i3 + 2;
       }
       return (i3 / 2);
    }
    public void d(float[] p0,int p1){
       t ot1;
       float f5;
       p op = this;
       float[] uofloatArray = p0;
       int i = p1;
       float f = 0x3f800000;
       float f1 = f / (float)(i - 1);
       p y = op.y;
       String str = "translationX";
       i oi = null;
       int i1 = (y == null)? oi: y.get(str);
       p y1 = op.y;
       String str1 = "translationY";
       t ot = (y1 == null)? oi: y1.get(str1);
       p z = op.z;
       i oi1 = (z == null)? oi: z.get(str);
       z = op.z;
       if (z != null) {
          oi = z.get(str1);
       }
       int i2 = 0;
       while (i2 < i) {
          float f2 = (float)i2 * f1;
          p m = op.m;
          if (m - f) {
             p l = op.l;
             if (f2 - l < 0) {
                f2 = 0;
             }
             if (f2 - l > 0) {
                ot1 = i1;
                if ((double)f2 - 0x3ff0000000000000 < 0) {
                   f2 = f2 - l;
                   f2 = f2 * m;
                }
             }else {
             label_0065 :
                ot1 = i1;
             }
          }else {
             goto label_0065 ;
          }
          double d = (double)f2;
          r b = op.e.b;
          float f3 = Float.NaN;
          Iterator iterator = op.u.iterator();
          float f4 = 0;
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             r b1 = obj.b;
             if (b1 != null) {
                r d1 = obj.d;
                if (d1 - f2 < 0) {
                   f4 = d1;
                   b = b1;
                }else if(Float.isNaN(f3)){
                   f3 = obj.d;
                }
             }
             i = p1;
          }
          if (b != null) {
             if (Float.isNaN(f3)) {
                f3 = 0x3f800000;
             }
             f5 = f2 - f4;
             f3 = f3 - f4;
             f5 = f5 / f3;
             f5 = (float)b.a((double)f5) * f3;
             f5 = f5 + f4;
             d = (double)f5;
          }
          op.i[0].d(d, op.o);
          p j = op.j;
          if (j != null) {
             m = op.o;
             if (m.length > 0) {
                j.d(d, m);
             }
          }
          int i3 = i2 * 2;
          op.e.f(op.n, op.o, uofloatArray, i3);
          if (oi1 != null) {
             f5 = uofloatArray[i3] + oi1.a(f2);
             uofloatArray[i3] = f5;
          }else if(ot1 != null){
             i1 = ot1;
             f5 = uofloatArray[i3] + i1.a(f2);
             uofloatArray[i3] = f5;
          label_00f5 :
             if (oi != null) {
                i3 = i3 + 1;
                f5 = uofloatArray[i3] + oi.a(f2);
                uofloatArray[i3] = f5;
             }else if(ot != null){
                i3 = i3 + 1;
                f5 = uofloatArray[i3] + ot.a(f2);
                uofloatArray[i3] = f5;
             }
             i2 = i2 + 1;
             i = p1;
             d = 0x3f800000;
          }
          i1 = ot1;
          goto label_00f5 ;
       }
       return;
    }
    public void e(float p0,float[] p1,int p2){
       this.i[0].d((double)this.f(p0, null), this.o);
       this.e.i(this.n, this.o, p1, p2);
    }
    public final float f(float p0,float[] p1){
       float f2;
       float f = 0;
       int i = 0x3f800000;
       if (p1 != null) {
          p1[0] = i;
       }else {
          p tm = this.m;
          boolean b2 = 0x3ff0000000000000;
          if ((double)tm - b2) {
             p tl = this.l;
             if (p0 - tl < 0) {
                p0 = 0;
             }
             if (p0 - tl > 0 && (double)p0 - b2 < 0) {
                p0 = (p0 - tl) * tm;
             }
          }
       }
       r b = this.e.b;
       float f1 = Float.NaN;
       Iterator iterator = this.u.iterator();
       while (iterator.hasNext()) {
          r or = iterator.next();
          r b1 = or.b;
          if (b1 != null) {
             r d = or.d;
             if (d - p0 < 0) {
                b = b1;
                f = d;
             }else if(Float.isNaN(f1)){
                f1 = or.d;
             }
          }
       }
       if (b != null) {
          if (!Float.isNaN(f1)) {
             f2 = f1;
          }
          f2 = i - f;
          double d1 = (double)((p0 - f) / f2);
          p0 = ((float)b.a(d1) * f2) + f;
          if (p1 != null) {
             p1[0] = (float)b.b(d1);
          }
       }
       return p0;
    }
    public int g(String p0,float[] p1,int p2){
       t ot = this.y.get(p0);
       if (ot == null) {
          return -1;
       }
       for (p2 = 0; p2 < p1.length; p2++) {
          int i = p1.length - 1;
          i = p2 / i;
          p1[p2] = ot.a((float)i);
       }
       return p1.length;
    }
    public void h(float p0,float p1,float p2,float[] p3){
       p tj;
       p0 = this.f(p0, this.v);
       p ti = this.i;
       int i = 0;
       if (ti != null) {
          double d = (double)p0;
          ti[i].g(d, this.p);
          this.i[i].d(d, this.o);
          int i1 = this.v[i];
          p tp = this.p;
          while (i < tp.length) {
             double d1 = tp[i] * (double)i1;
             tp[i] = d1;
             i = i + 1;
          }
          tj = this.j;
          if (tj != null) {
             ti = this.o;
             if (ti.length > 0) {
                tj.d(d, ti);
                this.j.g(d, this.p);
                this.e.o(p1, p2, p3, this.n, this.p, this.o);
             }
             return;
          }else {
             this.e.o(p1, p2, p3, this.n, tp, this.o);
             return;
          }
       }else {
          tj = this.f;
          p te = this.e;
          float f = tj.f - te.f;
          float f1 = tj.g - te.g;
          float f2 = (tj.h - te.h) + f;
          tj = (tj.i - te.i) + f1;
          p3[i] = (f * (0x3f800000 - p1)) + (f2 * p1);
          p3[1] = (f1 * (0x3f800000 - p2)) + (tj * p2);
          return;
       }
    }
    public int i(){
       r c = this.e.c;
       Iterator iterator = this.u.iterator();
       while (iterator.hasNext()) {
          c = Math.max(c, iterator.next().c);
       }
       return Math.max(c, this.f.c);
    }
    public float j(){
       return this.f.f;
    }
    public float k(){
       return this.f.g;
    }
    public r l(int p0){
       return this.u.get(p0);
    }
    public float m(int p0,float p1,float p2){
       p tf = this.f;
       p te = this.e;
       r f = te.f;
       float f1 = tf.f - f;
       r g = te.g;
       float f2 = tf.g - g;
       float f3 = f + (te.h / 2.00f);
       float f4 = g + (te.i / 2.00f);
       float f5 = (float)Math.hypot((double)f1, (double)f2);
       if ((double)f5 - 0x3e7ad7f29abcaf48 < 0) {
          return Float.NaN;
       }
       p1 = p1 - f3;
       p2 = p2 - f4;
       if (!(float)Math.hypot((double)p1, (double)p2)) {
          return 0;
       }
       f3 = (p1 * f1) + (p2 * f2);
       if (!p0) {
          return (f3 / f5);
       }
       if (p0 == 1) {
          return (float)Math.sqrt((double)((f5 * f5) - (f3 * f3)));
       }
       if (p0 == 2) {
          return (p1 / f1);
       }
       if (p0 == 3) {
          return (p2 / f1);
       }
       if (p0 == 4) {
          return (p1 / f2);
       }
       if (p0 != 5) {
          return 0;
       }
       return (p2 / f2);
    }
    public l n(int p0,int p1,float p2,float p3){
       e uoe1;
       RectF rectF = new RectF();
       p te = this.e;
       r f = te.f;
       rectF.left = f;
       r g = te.g;
       rectF.top = g;
       rectF.right = f + te.h;
       rectF.bottom = g + te.i;
       RectF rectF1 = new RectF();
       te = this.f;
       f = te.f;
       rectF1.left = f;
       g = te.g;
       rectF1.top = g;
       rectF1.right = f + te.h;
       rectF1.bottom = g + te.i;
       Iterator iterator = this.w.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          e uoe = iterator.next();
          if (uoe instanceof l) {
             uoe1 = uoe;
             if (uoe1.m(p0, p1, rectF, rectF1, p2, p3)) {
                break ;
             }
          }
       }
       return uoe1;
    }
    public void o(float p0,int p1,int p2,float p3,float p4,float[] p5){
       double d;
       p op = this;
       float f = op.f(p0, op.v);
       p y = op.y;
       String str = "translationX";
       i oi = null;
       t ot = (y == null)? oi: y.get(str);
       p y1 = op.y;
       String str1 = "translationY";
       t ot1 = (y1 == null)? oi: y1.get(str1);
       p y2 = op.y;
       String str2 = "rotation";
       t ot2 = (y2 == null)? oi: y2.get(str2);
       p y3 = op.y;
       String str3 = "scaleX";
       t ot3 = (y3 == null)? oi: y3.get(str3);
       p y4 = op.y;
       String str4 = "scaleY";
       t ot4 = (y4 == null)? oi: y4.get(str4);
       p z = op.z;
       i oi1 = (z == null)? oi: z.get(str);
       z = op.z;
       i oi2 = (z == null)? oi: z.get(str1);
       z = op.z;
       i oi3 = (z == null)? oi: z.get(str2);
       z = op.z;
       i oi4 = (z == null)? oi: z.get(str3);
       z = op.z;
       if (z != null) {
          oi = z.get(str4);
       }
       h oh = new h();
       oh.b();
       oh.d(ot2, f);
       oh.h(ot, ot1, f);
       oh.f(ot3, ot4, f);
       oh.c(oi3, f);
       oh.g(oi1, oi2, f);
       oh.e(oi4, oi, f);
       z = op.j;
       if (z != null) {
          y = op.o;
          if (y.length > 0) {
             d = (double)f;
             z.d(d, y);
             op.j.g(d, op.p);
             op.e.o(p3, p4, p5, op.n, op.p, op.o);
          }
          oh.a(p3, p4, p1, p2, p5);
          return;
       }else {
          int i = 0;
          if (op.i != null) {
             d = (double)op.f(f, op.v);
             op.i[i].g(d, op.p);
             op.i[i].d(d, op.o);
             int i1 = op.v[i];
             p p = op.p;
             while (i < p.length) {
                double d1 = p[i] * (double)i1;
                p[i] = d1;
                i = i + 1;
             }
             float f1 = p3;
             float f2 = p4;
             op.e.o(f1, f2, p5, op.n, p, op.o);
             oh.a(f1, f2, p1, p2, p5);
             return;
          }else {
             z = op.f;
             p e = op.e;
             float f3 = z.f - e.f;
             float f4 = z.g - e.g;
             float f5 = (z.h - e.h) + f3;
             float f6 = (z.i - e.i) + f4;
             p5[0] = (f3 * (0x3f800000 - p3)) + (f5 * p3);
             p5[1] = (f4 * (0x3f800000 - p4)) + (f6 * p4);
             oh.b();
             oh.d(ot2, f);
             oh.h(ot, ot1, f);
             oh.f(ot3, ot4, f);
             oh.c(oi3, f);
             oh.g(oi1, oi2, f);
             oh.e(oi4, oi, f);
             oh.a(p3, p4, p1, p2, p5);
             return;
          }
       }
    }
    public final float p(){
       float f5;
       p op = this;
       float[] uofloatArray = new float[2];
       float f = 0x3f800000 / (float)99;
       double d = 0;
       double d1 = d;
       int i = 0;
       float f1 = 0;
       while (i < 0.00f) {
          float f2 = (float)i * f;
          double d2 = (double)f2;
          r b = op.e.b;
          float f3 = Float.NaN;
          Iterator iterator = op.u.iterator();
          float f4 = 0;
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             r b1 = obj.b;
             f5 = f;
             if (b1 != null) {
                r d3 = obj.d;
                if (d3 - f2 < 0) {
                   f4 = d3;
                   b = b1;
                }else if(Float.isNaN(f3)){
                   f3 = obj.d;
                }
             }
             f = f5;
          }
          f5 = f;
          if (b != null) {
             if (Float.isNaN(f3)) {
                f3 = 0x3f800000;
             }
             f2 = f2 - f4;
             f3 = f3 - f4;
             f2 = f2 / f3;
             f = (float)b.a((double)f2) * f3;
             f = f + f4;
             d2 = (double)f;
          }
          int i1 = 0;
          op.i[i1].d(d2, op.o);
          op.e.f(op.n, op.o, uofloatArray, i1);
          int i2 = 1;
          if (i > 0) {
             d1 = d1 - (double)uofloatArray[i2];
             d = d - (double)uofloatArray[i1];
             double d4 = (double)f1 + Math.hypot(d1, d);
             f1 = (float)d4;
          }
          d = (double)uofloatArray[i1];
          d1 = (double)uofloatArray[i2];
          i = i + 1;
          f = f5;
          p op1 = 0x3f800000;
       }
       return f1;
    }
    public final void q(r p0){
       this.u.add(((- Collections.binarySearch(this.u, p0)) - 1), p0);
    }
    public boolean r(View p0,float p1,long p2,g p3){
       float[] uofloatArray1;
       int i;
       int i1;
       double d1;
       p op = this;
       View view = p0;
       float[] uofloatArray = null;
       float f = op.f(p1, uofloatArray);
       p y = op.y;
       if (y != null) {
          Iterator iterator = y.values().iterator();
          while (iterator.hasNext()) {
             iterator.next().f(view, f);
          }
       }
       y = op.x;
       if (y != null) {
          Iterator iterator1 = y.values().iterator();
          uofloatArray1 = uofloatArray;
          i = 0;
          while (iterator1.hasNext()) {
             u ou = iterator1.next();
             if (ou instanceof u$d) {
                uofloatArray1 = ou;
             }else {
                i = i | ou.f(p0, f, p2, p3);
             }
          }
          i1 = i;
       }else {
          uofloatArray1 = uofloatArray;
          i1 = 0;
       }
       p i2 = op.i;
       if (i2 != null) {
          double d = (double)f;
          i2[0].d(d, op.o);
          op.i[0].g(d, op.p);
          i2 = op.j;
          if (i2 != null) {
             y = op.o;
             if (y.length > 0) {
                i2.d(d, y);
                op.j.g(d, op.p);
             }
          }
          op.e.p(p0, op.n, op.o, op.p, null);
          i2 = op.y;
          if (i2 != null) {
             Iterator iterator2 = i2.values().iterator();
             while (iterator2.hasNext()) {
                t ot = iterator2.next();
                if (ot instanceof t$d) {
                   y = op.p;
                   ot.i(p0, f, y[0], y[1]);
                }
             }
          }
          if (uofloatArray1 != null) {
             i2 = op.p;
             d1 = d;
             i1 = uofloatArray1.j(p0, p3, f, p2, i2[0], i2[1]) | i1;
          }else {
             d1 = d;
          }
          int i3 = 1;
          y = op.i;
          while (i3 < y.length) {
             y[i3].e(d1, op.t);
             int i4 = i3 - 1;
             op.e.m.get(op.q[i4]).i(view, op.t);
             i3 = i3 + 1;
          }
          i2 = op.g;
          if (i2.c == null) {
             if (f <= 0) {
                view.setVisibility(i2.d);
             }else if(f - 0x3f800000 >= 0){
                view.setVisibility(op.h.d);
             }else if(op.h.d != i2.d){
                view.setVisibility(0);
             }
          }
          if (op.A != null) {
             i3 = 0;
             y = op.A;
             while (i3 < y.length) {
                y[i3].j(f, view);
                i3 = i3 + 1;
             }
          }
       }else {
          i2 = op.e;
          r f1 = i2.f;
          p f2 = op.f;
          r g = i2.g;
          r h = i2.h;
          r h1 = f2.h;
          r i5 = i2.i;
          r i6 = f2.i;
          float f3 = (f1 + ((f2.f - f1) * f)) + 0x3f000000;
          int i7 = (int)f3;
          float f4 = (g + ((f2.g - g) * f)) + 0x3f000000;
          i = (int)f4;
          int i8 = (int)(f3 + (((h1 - h) * f) + h));
          int i9 = (int)(f4 + (((i6 - i5) * f) + i5));
          int i10 = i8 - i7;
          int i11 = i9 - i;
          if (h1 - h || i6 - i5) {
             view.measure(View$MeasureSpec.makeMeasureSpec(i10, 0x40000000), View$MeasureSpec.makeMeasureSpec(i11, 0x40000000));
          }
          view.layout(i7, i, i8, i9);
       }
       i2 = op.z;
       if (i2 != null) {
          Iterator iterator3 = i2.values().iterator();
          while (iterator3.hasNext()) {
             i oi = iterator3.next();
             if (oi instanceof i$f) {
                y = op.p;
                oi.j(p0, f, y[0], y[1]);
             }else {
                oi.f(view, f);
             }
          }
       }
       return i1;
    }
    public void s(View p0,l p1,float p2,float p3,String[] p4,float[] p5){
       RectF rectF = new RectF();
       p te = this.e;
       r f = te.f;
       rectF.left = f;
       r g = te.g;
       rectF.top = g;
       rectF.right = f + te.h;
       rectF.bottom = g + te.i;
       RectF rectF1 = new RectF();
       te = this.f;
       f = te.f;
       rectF1.left = f;
       r g1 = te.g;
       rectF1.top = g1;
       rectF1.right = f + te.h;
       rectF1.bottom = g1 + te.i;
       p1.n(p0, rectF, rectF1, p2, p3, p4, p5);
    }
    public final void t(r p0){
       p0.n((float)(int)this.a.getX(), (float)(int)this.a.getY(), (float)this.a.getWidth(), (float)this.a.getHeight());
    }
    public String toString(){
       return " start: x: "+this.e.f+" y: "+this.e.g+" end: x: "+this.f.f+" y: "+this.f.g;
    }
    public void u(ConstraintWidget p0,a p1){
       p tf = this.f;
       tf.d = 0x3f800000;
       tf.e = 0x3f800000;
       this.t(tf);
       this.f.n((float)p0.V(), (float)p0.W(), (float)p0.U(), (float)p0.y());
       this.f.a(p1.z(this.b));
       this.h.i(p0, p1, this.b);
    }
    public void v(int p0){
       this.B = p0;
    }
    public void w(View p0){
       p te = this.e;
       te.d = 0;
       te.e = 0;
       te.n(p0.getX(), p0.getY(), (float)p0.getWidth(), (float)p0.getHeight());
       this.g.h(p0);
    }
    public void x(ConstraintWidget p0,a p1){
       p te = this.e;
       te.d = 0;
       te.e = 0;
       this.t(te);
       this.e.n((float)p0.V(), (float)p0.W(), (float)p0.U(), (float)p0.y());
       a$a uoa = p1.z(this.b);
       this.e.a(uoa);
       this.k = uoa.c.f;
       this.g.i(p0, p1, this.b);
    }
    public void y(View p0){
       this.a = p0;
       this.b = p0.getId();
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams instanceof ConstraintLayout$LayoutParams) {
          this.c = layoutParams.a();
       }
       return;
    }
    public void z(int p0,int p1,float p2,long p3){
       ArrayList uArrayList;
       Iterator iterator1;
       String str2;
       object oobject;
       t obj;
       e e;
       Iterator iterator3;
       Iterator iterator4;
       String str4;
       u ou;
       int i2;
       int i6;
       int i8;
       p r;
       p n;
       double[][] uodoubleArra5;
       float f;
       p op = this;
       double d = double.class;
       HashSet hashSet = new HashSet();
       hashSet = new HashSet();
       HashSet hashSet1 = new HashSet();
       HashSet hashSet2 = new HashSet();
       HashMap hashMap = new HashMap();
       p b = op.B;
       if (b != e.f) {
          op.e.l = b;
       }
       op.g.f(op.h, hashSet1);
       b = op.w;
       if (b != null) {
          Iterator iterator = b.iterator();
          uArrayList = null;
          while (iterator.hasNext()) {
             e uoe = iterator.next();
             if (uoe instanceof k) {
                r or = new r(p0, p1, uoe, op.e, op.f);
                op.q(v10);
                l g = uoe.g;
                if (g != e.f) {
                   op.d = g;
                }
             }else if(uoe instanceof h){
                uoe.b(hashSet2);
             }else if(uoe instanceof m){
                uoe.b(hashSet);
             }else if(uoe instanceof n){
                if (uArrayList == null) {
                   uArrayList = new ArrayList();
                }
                uArrayList.add(uoe);
             }else {
                uoe.e(hashMap);
                uoe.b(hashSet1);
             }
          }
       }else {
          uArrayList = null;
       }
       int i = 0;
       if (uArrayList != null) {
          n[] onArray = new n[i];
          op.A = uArrayList.toArray(onArray);
       }
       String str = ",";
       String str1 = "CUSTOM,";
       int i1 = 1;
       if (!hashSet1.isEmpty()) {
          op.y = new HashMap();
          iterator1 = hashSet1.iterator();
          while (iterator1.hasNext()) {
             str2 = iterator1.next();
             if (str2.startsWith(str1)) {
                SparseArray sparseArray = new SparseArray();
                oobject = str2.split(str)[i1];
                Iterator iterator2 = op.w.iterator();
                while (iterator2.hasNext()) {
                   obj = iterator2.next();
                   e = obj.e;
                   if (e != null) {
                      ConstraintAttribute uConstraintA = e.get(oobject);
                      if (uConstraintA != null) {
                         sparseArray.append(obj.a, uConstraintA);
                      }
                   }
                   e = 1;
                }
                obj = t.c(str2, sparseArray);
             }else {
                obj = t.d(str2);
             }
             if (obj != null) {
                obj.g(str2);
                op.y.put(str2, obj);
             }
             i1 = 1;
          }
          p w = op.w;
          if (w != null) {
             iterator3 = w.iterator();
             while (iterator3.hasNext()) {
                e uoe1 = iterator3.next();
                if (uoe1 instanceof f) {
                   uoe1.a(op.y);
                }
             }
          }
          op.g.a(op.y, i);
          op.h.a(op.y, 100);
          iterator3 = op.y.keySet().iterator();
          while (iterator3.hasNext()) {
             String str3 = iterator3.next();
             i1 = (hashMap.containsKey(str3))? hashMap.get(str3).intValue(): 0;
             op.y.get(str3).h(i1);
          }
       }
       if (!hashSet.isEmpty()) {
          if (op.x == null) {
             op.x = new HashMap();
          }
          iterator4 = hashSet.iterator();
          while (iterator4.hasNext()) {
             str4 = iterator4.next();
             if (op.x.containsKey(str4)) {
                continue ;
             }else if(str4.startsWith(str1)){
                SparseArray sparseArray1 = new SparseArray();
                object oobject1 = str4.split(str)[1];
                Iterator iterator5 = op.w.iterator();
                while (iterator5.hasNext()) {
                   e uoe2 = iterator5.next();
                   e e1 = uoe2.e;
                   if (e1 == null) {
                      continue ;
                   }else {
                      ConstraintAttribute uConstraintA1 = e1.get(oobject1);
                      if (uConstraintA1 != null) {
                         sparseArray1.append(uoe2.a, uConstraintA1);
                      }else {
                         continue ;
                      }
                   }
                }
                ou = u.c(str4, sparseArray1);
                i1 = p3;
             }else {
                ou = u.d(str4, p3);
             }
             if (ou == null) {
                continue ;
             }
             ou.h(str4);
             op.x.put(str4, ou);
          }
          p w1 = op.w;
          if (w1 != null) {
             iterator4 = w1.iterator();
             while (iterator4.hasNext()) {
                e uoe3 = iterator4.next();
                if (uoe3 instanceof m) {
                   uoe3.j(op.x);
                }else {
                   continue ;
                }
             }
          }
          iterator4 = op.x.keySet().iterator();
          while (iterator4.hasNext()) {
             str4 = iterator4.next();
             i2 = (hashMap.containsKey(str4))? hashMap.get(str4).intValue(): 0;
             op.x.get(str4).i(i2);
          }
       }
       int i3 = 2;
       int i4 = op.u.size() + i3;
       r[] orArray = new r[i4];
       orArray[i] = op.e;
       orArray[(i4 - 1)] = op.f;
       if (op.u.size() > 0 && op.d == -1) {
          op.d = i;
       }
       iterator1 = op.u.iterator();
       int i5 = 1;
       while (iterator1.hasNext()) {
          i6 = i5 + 1;
          orArray[i5] = iterator1.next();
          i5 = i6;
       }
       i2 = 18;
       HashSet hashSet3 = new HashSet();
       Iterator iterator6 = op.f.m.keySet().iterator();
       while (iterator6.hasNext()) {
          str2 = iterator6.next();
          if (op.e.m.containsKey(str2) && !hashSet1.contains(str1+str2)) {
             hashSet3.add(str2);
          }else {
             continue ;
          }
       }
       String[] stringArray = new String[i];
       stringArray = hashSet3.toArray(stringArray);
       op.q = stringArray;
       int[] ointArray = new int[stringArray.length];
       op.r = ointArray;
       boolean i7 = 0;
       p q = op.q;
       while (i7 < q.length) {
          object oobject2 = q[i7];
          op.r[i7] = i;
          i8 = 0;
          while (i8 < i4) {
             if (orArray[i8].m.containsKey(oobject2)) {
                r = op.r;
                i6 = r[i7] + orArray[i8].m.get(oobject2).f();
                r[i7] = i6;
             }
             i8 = i8 + 1;
          }
          i7 = i7 + 1;
       }
       i7 = (orArray[i].l != e.f)? true: false;
       i2 = i2 + q.length;
       boolean[] uobooleanArr = new boolean[i2];
       for (i8 = 1; i8 < i4; i8 = i8 + 1) {
          i6 = i8 - 1;
          orArray[i8].d(orArray[i6], uobooleanArr, op.q, i7);
       }
       i7 = 1;
       i8 = 0;
       while (i7 < i2) {
          if (uobooleanArr[i7]) {
             i8 = i8 + 1;
          }
          i7 = i7 + 1;
       }
       ointArray = new int[i8];
       op.n = ointArray;
       double[] uodoubleArra = new double[ointArray.length];
       op.o = uodoubleArra;
       double[] uodoubleArra1 = new double[ointArray.length];
       op.p = uodoubleArra1;
       i7 = 1;
       i8 = 0;
       while (i7 < i2) {
          if (uobooleanArr[i7]) {
             i6 = i8 + 1;
             op.n[i8] = i7;
             i8 = i6;
          }
          i7 = i7 + 1;
       }
       int[] ointArray1 = new int[i3];
       ointArray1[1] = op.n.length;
       ointArray1[i] = i4;
       double[][] uodoubleArra2 = Array.newInstance(d, ointArray1);
       double[] uodoubleArra3 = new double[i4];
       for (i5 = 0; i5 < i4; i5 = i5 + 1) {
          orArray[i5].e(uodoubleArra2[i5], op.n);
          uodoubleArra3[i5] = (double)orArray[i5].d;
       }
       i5 = 0;
       n = op.n;
       while (i5 < n.length) {
          if (n[i5] < r.q.length) {
             str1 = r.q[op.n[i5]]+" [";
             for (i1 = 0; i1 < i4; i1 = i1 + 1) {
                str1 = str1+uodoubleArra2[i1][i5];
             }
          }
          i5 = i5 + 1;
       }
       b[] uobArray = new b[(op.q.length + 1)];
       op.i = uobArray;
       i5 = 0;
       n = op.q;
       while (i5 < n.length) {
          object oobject3 = n[i5];
          i1 = 0;
          double[] uodoubleArra4 = null;
          int i9 = 0;
          oobject = null;
          while (i1 < i4) {
             if (orArray[i1].j(oobject3)) {
                if (oobject == null) {
                   uodoubleArra4 = new double[i4];
                   int[] ointArray2 = new int[i3];
                   ointArray2[1] = orArray[i1].h(oobject3);
                   ointArray2[i] = i4;
                   uodoubleArra5 = Array.newInstance(d, ointArray2);
                }
                uodoubleArra4[i9] = (double)orArray[i1].d;
                orArray[i1].g(oobject3, uodoubleArra5[i9], 0);
                i9 = i9 + 1;
             }
             i1 = i1 + 1;
             i3 = 2;
             i = 0;
          }
          i5 = i5 + 1;
          op.i[i5] = b.a(op.d, Arrays.copyOf(uodoubleArra4, i9), Arrays.copyOf(oobject, i9));
          i3 = 2;
          i = 0;
       }
       i = 0;
       op.i[i] = b.a(op.d, uodoubleArra3, uodoubleArra2);
       if (orArray[i].l != e.f) {
          ointArray = new int[i4];
          double[] uodoubleArra6 = new double[i4];
          i2 = 2;
          int[] ointArray3 = new int[i2];
          ointArray3[1] = i2;
          ointArray3[i] = i4;
          double[][] uodoubleArra7 = Array.newInstance(d, ointArray3);
          for (int i10 = 0; i10 < i4; i10 = i10 + 1) {
             ointArray[i10] = orArray[i10].l;
             uodoubleArra6[i10] = (double)orArray[i10].d;
             uodoubleArra7[i10][0] = (double)orArray[i10].f;
             uodoubleArra7[i10][1] = (double)orArray[i10].g;
          }
          op.j = b.b(ointArray, uodoubleArra6, uodoubleArra7);
       }
       f = Float.NaN;
       op.z = new HashMap();
       if (op.w != null) {
          iterator4 = hashSet2.iterator();
          while (iterator4.hasNext()) {
             String str5 = iterator4.next();
             i oi = i.c(str5);
             if (oi == null) {
                continue ;
             }else if(oi.i() && Float.isNaN(f)){
                f = this.p();
             }
             oi.g(str5);
             op.z.put(str5, oi);
          }
          iterator4 = op.w.iterator();
          while (iterator4.hasNext()) {
             e uoe4 = iterator4.next();
             if (uoe4 instanceof h) {
                uoe4.j(op.z);
             }else {
                continue ;
             }
          }
          iterator4 = op.z.values().iterator();
          while (iterator4.hasNext()) {
             iterator4.next().h(f);
          }
       }
       return;
    }
}
