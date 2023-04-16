package e1.r;
import java.lang.Comparable;
import java.lang.String;
import java.lang.Object;
import e1.e;
import java.util.LinkedHashMap;
import e1.k;
import androidx.constraintlayout.widget.a$a;
import androidx.constraintlayout.widget.a$c;
import d1.c;
import androidx.constraintlayout.widget.a$d;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintAttribute$AttributeType;
import java.lang.Float;
import java.lang.Math;
import android.view.View;
import java.util.Arrays;
import java.lang.Double;
import android.view.View$MeasureSpec;

public class r implements Comparable	// class@001ea3
{
    public c b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public LinkedHashMap m;
    public int n;
    public double[] o;
    public double[] p;
    public static String[] q;

    static {
       String[] stringArray = new String[]{"position","x","y","width","height","pathRotate"};
       r.q = stringArray;
    }
    public void r(){
       super();
       this.c = 0;
       this.j = Float.NaN;
       this.k = Float.NaN;
       this.l = e.f;
       this.m = new LinkedHashMap();
       this.n = 0;
       double[] uodoubleArra = new double[18];
       this.o = uodoubleArra;
       double[] uodoubleArra1 = new double[18];
       this.p = uodoubleArra1;
    }
    public void r(int p0,int p1,k p2,r p3,r p4){
       super();
       this.c = 0;
       this.j = Float.NaN;
       this.k = Float.NaN;
       this.l = e.f;
       this.m = new LinkedHashMap();
       this.n = 0;
       double[] uodoubleArra = new double[18];
       this.o = uodoubleArra;
       double[] uodoubleArra1 = new double[18];
       this.p = uodoubleArra1;
       k q = p2.q;
       if (q != 1) {
          if (q != 2) {
             this.k(p2, p3, p4);
             return;
          }else {
             this.m(p0, p1, p2, p3, p4);
             return;
          }
       }else {
          this.l(p2, p3, p4);
          return;
       }
    }
    public void a(a$a p0){
       a$a c;
       this.b = c.c(p0.c.c);
       c = p0.c;
       this.l = c.d;
       this.j = c.g;
       this.c = c.e;
       this.k = p0.b.e;
       Iterator iterator = p0.f.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          ConstraintAttribute uConstraintA = p0.f.get(str);
          if (uConstraintA.c() != ConstraintAttribute$AttributeType.STRING_TYPE) {
             this.m.put(str, uConstraintA);
          }
       }
       return;
    }
    public int b(r p0){
       return Float.compare(this.e, p0.e);
    }
    public final boolean c(float p0,float p1){
       boolean b = true;
       if (Float.isNaN(p0) || Float.isNaN(p1)) {
          if (Float.isNaN(p0) == Float.isNaN(p1)) {
             b = false;
          }
          return b;
       }else if(Math.abs((p0 - p1)) - 0x358637bd > 0){
          b = false;
       }
       return b;
    }
    public int compareTo(Object p0){
       return this.b(p0);
    }
    public void d(r p0,boolean[] p1,String[] p2,boolean p3){
       p1[0] = p1[0] | this.c(this.e, p0.e);
       p1[1] = p1[1] | (this.c(this.f, p0.f) | p3);
       p1[2] = (p3 | this.c(this.g, p0.g)) | p1[2];
       p1[3] = p1[3] | this.c(this.h, p0.h);
       p1[4] = this.c(this.i, p0.i) | p1[4];
    }
    public void e(double[] p0,int[] p1){
       float[] uofloatArray = new float[]{this.e,this.f,this.g,this.h,this.i,this.j};
       int i = 0;
       int i1 = 0;
       while (i < p1.length) {
          if (p1[i] < 6) {
             int i2 = i1 + 1;
             p0[i1] = (double)uofloatArray[p1[i]];
             i1 = i2;
          }
          i = i + 1;
       }
       return;
    }
    public void f(int[] p0,double[] p1,float[] p2,int p3){
       r tf = this.f;
       r tg = this.g;
       r th = this.h;
       r ti = this.i;
       int i = 0;
       int i1 = 1;
       while (i < p0.length) {
          float f = (float)p1[i];
          int i2 = p0[i];
          if (i2 != i1) {
             if (i2 != 2) {
                if (i2 != 3) {
                   if (i2 == 4) {
                      ti = f;
                   }
                }else {
                   th = f;
                }
             }else {
                tg = f;
             }
          }else {
             tf = f;
          }
          i = i + 1;
       }
       p2[p3] = (tf + (th / 2.00f)) + 0;
       p2[(p3 + i1)] = (tg + (ti / 2.00f)) + 0;
       return;
    }
    public int g(String p0,double[] p1,int p2){
       ConstraintAttribute uConstraintA = this.m.get(p0);
       int i = 1;
       if (uConstraintA.f() == i) {
          p1[p2] = (double)uConstraintA.d();
          return i;
       }else {
          int i1 = uConstraintA.f();
          float[] uofloatArray = new float[i1];
          uConstraintA.e(uofloatArray);
          int i2 = 0;
          while (i2 < i1) {
             int i3 = p2 + 1;
             p1[p2] = (double)uofloatArray[i2];
             i2++;
             p2 = i3;
          }
          return i1;
       }
    }
    public int h(String p0){
       return this.m.get(p0).f();
    }
    public void i(int[] p0,double[] p1,float[] p2,int p3){
       float f;
       r tf = this.f;
       r tg = this.g;
       r th = this.h;
       r ti = this.i;
       int i = 0;
       while (i < p0.length) {
          f = (float)p1[i];
          int i1 = p0[i];
          if (i1 != 1) {
             if (i1 != 2) {
                if (i1 != 3) {
                   if (i1 == 4) {
                      ti = f;
                   }
                }else {
                   th = f;
                }
             }else {
                tg = f;
             }
          }else {
             tf = f;
          }
          i = i + 1;
       }
       float f1 = th + tf;
       float f2 = ti + tg;
       Float.isNaN(Float.NaN);
       Float.isNaN(Float.NaN);
       f = f1 + 0;
       float f3 = f2 + 0;
       int i2 = p3 + 1;
       p2[p3] = tf + 0;
       int i3 = i2 + 1;
       p2[i2] = tg + 0;
       i2 = i3 + 1;
       p2[i3] = f;
       i3 = i2 + 1;
       p2[i2] = tg + 0;
       i2 = i3 + 1;
       p2[i3] = f1 + 0;
       i3 = i2 + 1;
       p2[i2] = f3;
       p2[i3] = tf + 0;
       p2[(i3 + 1)] = f2 + 0;
       return;
    }
    public boolean j(String p0){
       return this.m.containsKey(p0);
    }
    public void k(k p0,r p1,r p2){
       r or = this;
       e uoe = p0;
       r or1 = p1;
       r or2 = p2;
       float f = (float)uoe.a / 100.00f;
       or.d = f;
       or.c = uoe.j;
       float f1 = (Float.isNaN(uoe.k))? f: uoe.k;
       float f2 = (Float.isNaN(uoe.l))? f: uoe.l;
       r h = or2.h;
       r h1 = or1.h;
       float f3 = h - h1;
       r i = or2.i;
       r i1 = or1.i;
       float f4 = i - i1;
       or.e = or.d;
       r f5 = or1.f;
       r g = or1.g;
       float f6 = (or2.f + (h / 2.00f)) - ((h1 / 2.00f) + f5);
       float f7 = (or2.g + (i / 2.00f)) - (g + (i1 / 2.00f));
       f3 = f3 * f1;
       f1 = f3 / 2.00f;
       or.f = (float)(int)((f5 + (f6 * f)) - f1);
       f4 = f4 * f2;
       f2 = f4 / 2.00f;
       or.g = (float)(int)((g + (f7 * f)) - f2);
       or.h = (float)(int)(h1 + f3);
       or.i = (float)(int)(i1 + f4);
       k ok = p0;
       float f8 = (Float.isNaN(ok.m))? f: ok.m;
       f3 = 0;
       float f9 = (Float.isNaN(ok.p))? 0: ok.p;
       if (!Float.isNaN(ok.n)) {
          f = ok.n;
       }
       if (!Float.isNaN(ok.o)) {
          k o = ok.o;
       }
       or.n = 2;
       i = p1;
       or.f = (float)(int)(((i.f + (f8 * f6)) + (f3 * f7)) - f1);
       or.g = (float)(int)(((i.g + (f6 * f9)) + (f7 * f)) - f2);
       or.b = c.c(ok.h);
       or.l = ok.i;
       return;
    }
    public void l(k p0,r p1,r p2){
       k n;
       r or = this;
       e uoe = p0;
       r or1 = p1;
       r or2 = p2;
       float f = (float)uoe.a / 100.00f;
       or.d = f;
       or.c = uoe.j;
       float f1 = (Float.isNaN(uoe.k))? f: uoe.k;
       float f2 = (Float.isNaN(uoe.l))? f: uoe.l;
       float f3 = or2.h - or1.h;
       float f4 = or2.i - or1.i;
       or.e = or.d;
       if (!Float.isNaN(uoe.m)) {
          f = uoe.m;
       }
       r f5 = or1.f;
       r h = or1.h;
       r g = or1.g;
       r i = or1.i;
       float f6 = (or2.f + (or2.h / 2.00f)) - ((h / 2.00f) + f5);
       float f7 = (or2.g + (or2.i / 2.00f)) - ((i / 2.00f) + g);
       float f8 = f6 * f;
       f3 = f3 * f1;
       f1 = f3 / 2.00f;
       or.f = (float)(int)((f5 + f8) - f1);
       f = f * f7;
       f4 = f4 * f2;
       f2 = f4 / 2.00f;
       or.g = (float)(int)((g + f) - f2);
       or.h = (float)(int)(h + f3);
       or.i = (float)(int)(i + f4);
       k ok = p0;
       f4 = (Float.isNaN(ok.n))? 0: ok.n;
       or.n = 1;
       r or3 = p1;
       f8 = (float)(int)((or3.f + f8) - f1);
       or.f = f8;
       f = (float)(int)((or3.g + f) - f2);
       or.g = f;
       or.f = f8 + ((- f7) * f4);
       or.g = f + (f6 * f4);
       or.b = c.c(ok.h);
       or.l = ok.i;
       return;
    }
    public void m(int p0,int p1,k p2,r p3,r p4){
       r or = this;
       e uoe = p2;
       r or1 = p3;
       r or2 = p4;
       float f = (float)uoe.a / 100.00f;
       or.d = f;
       or.c = uoe.j;
       float f1 = (Float.isNaN(uoe.k))? f: uoe.k;
       float f2 = (Float.isNaN(uoe.l))? f: uoe.l;
       r h = or2.h;
       r h1 = or1.h;
       float f3 = h - h1;
       r i = or2.i;
       r i1 = or1.i;
       float f4 = i - i1;
       or.e = or.d;
       r f5 = or1.f;
       or1 = or1.g;
       f3 = f3 * f1;
       or.f = (float)(int)((f5 + (((or2.f + (h / 2.00f)) - ((h1 / 2.00f) + f5)) * f)) - (f3 / 2.00f));
       f4 = f4 * f2;
       or.g = (float)(int)((or1 + (((or2.g + (i / 2.00f)) - (or1 + (i1 / 2.00f))) * f)) - (f4 / 2.00f));
       or.h = (float)(int)(h1 + f3);
       or.i = (float)(int)(i1 + f4);
       or.n = 3;
       k ok = p2;
       if (!Float.isNaN(ok.m)) {
          or.f = (float)(int)(ok.m * (float)(int)((float)p0 - or.h));
       }
       if (!Float.isNaN(ok.n)) {
          or.g = (float)(int)(ok.n * (float)(int)((float)p1 - or.i));
       }
       or.b = c.c(ok.h);
       or.l = ok.i;
       return;
    }
    public void n(float p0,float p1,float p2,float p3){
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
    }
    public void o(float p0,float p1,float[] p2,int[] p3,double[] p4,double[] p5){
       int i = p3;
       int i1 = 0;
       float f = 0;
       float f1 = 0;
       float f2 = 0;
       float f3 = 0;
       int i2 = 1;
       while (i1 < i.length) {
          float f4 = (float)p4[i1];
          int i3 = i[i1];
          if (i3 != i2) {
             if (i3 != 2) {
                if (i3 != 3) {
                   if (i3 == 4) {
                      f3 = f4;
                   }
                }else {
                   f1 = f4;
                }
             }else {
                f2 = f4;
             }
          }else {
             f = f4;
          }
          i1 = i1 + 1;
       }
       f = f - ((0 * f1) / 2.00f);
       f2 = f2 - ((0 * f3) / 2.00f);
       f1 = (f1 * 0x3f800000) + f;
       f3 = (f3 * 0x3f800000) + f2;
       p2[0] = ((f * (0x3f800000 - p0)) + (f1 * p0)) + 0;
       p2[i2] = ((f2 * (0x3f800000 - p1)) + (f3 * p1)) + 0;
       return;
    }
    public void p(View p0,int[] p1,double[] p2,double[] p3,double[] p4){
       int i3;
       r or1;
       float f7;
       float f8;
       r or = this;
       View view = p0;
       int i = p1;
       r f = or.f;
       r g = or.g;
       r h = or.h;
       r i1 = or.i;
       int i2 = 1;
       if (i.length && or.o.length <= i[(i.length - i2)]) {
          i3 = i[(i.length - i2)] + i2;
          double[] uodoubleArra = new double[i3];
          or.o = uodoubleArra;
          double[] uodoubleArra1 = new double[i3];
          or.p = uodoubleArra1;
       }
       Arrays.fill(or.o, Double.NaN);
       for (int i4 = 0; i4 < i.length; i4 = i4 + 1) {
          or.o[i[i4]] = p2[i4];
          or.p[i[i4]] = p3[i4];
       }
       int i5 = 0;
       float f1 = Float.NaN;
       float f2 = 0;
       float f3 = 0;
       float f4 = 0;
       float f5 = 0;
       r o = or.o;
       while (i5 < o.length) {
          if (Double.isNaN(o[i5])) {
             or1 = f;
          }else {
             long l = 0;
             if (!Double.isNaN(or.o[i5])) {
                l = or.o[i5] + l;
             }
             or1 = f;
             float f6 = (float)l;
             f7 = (float)or.p[i5];
             if (i5 != i2) {
                if (i5 != 2) {
                   if (i5 != 3) {
                      if (i5 != 4) {
                         if (i5 == -1651937897626935300000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.00f) {
                            f = or1;
                            f1 = f6;
                         label_009b :
                            i5 = i5 + 1;
                         }
                      }else {
                         f5 = f7;
                         i1 = f6;
                      }
                   }else {
                      f3 = f7;
                      h = f6;
                   }
                }else {
                   f4 = f7;
                   g = f6;
                }
             }else {
                f2 = f7;
                f = f6;
                goto label_009b ;
             }
          }
          f = or1;
          goto label_009b ;
       }
       or1 = f;
       if (Float.isNaN(f1)) {
          f7 = Float.NaN;
          if (!Float.isNaN(f7)) {
             view.setRotation(f7);
          }
       }else {
          f7 = Float.NaN;
          if (Float.isNaN(f7)) {
             f7 = 0;
          }
          f8 = 2.00f;
          view.setRotation((float)((double)f7 + ((double)f1 + Math.toDegrees(Math.atan2((double)(f4 + (f5 / f8)), (double)(f2 + (f3 / f8)))))));
       }
       f8 = or1 + 0x3f000000;
       i3 = (int)f8;
       float f9 = g + 0x3f000000;
       i = (int)f9;
       int i6 = (int)(f8 + h);
       int i7 = (int)(f9 + i1);
       int i8 = i6 - i3;
       int i9 = i7 - i;
       if (i8 == p0.getMeasuredWidth() && i9 == p0.getMeasuredHeight()) {
          i2 = 0;
       }
       if (i2) {
          view.measure(View$MeasureSpec.makeMeasureSpec(i8, 0x40000000), View$MeasureSpec.makeMeasureSpec(i9, 0x40000000));
       }
       view.layout(i3, i, i6, i7);
       return;
    }
}
