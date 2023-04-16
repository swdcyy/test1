package d1.a$a;
import java.lang.Object;
import java.lang.Math;
import java.util.Arrays;

public class a$a	// class@001de9
{
    public double[] a;
    public double b;
    public double c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public double j;
    public double k;
    public double l;
    public double m;
    public double n;
    public double o;
    public double p;
    public boolean q;
    public boolean r;
    public static double[] s;

    static {
       double[] uodoubleArra = new double[91];
       a$a.s = uodoubleArra;
    }
    public void a$a(int p0,double p1,double p2,double p3,double p4,double p5,double p6){
       a$a d9;
       a$a uoa = this;
       int i = p0;
       double d = p1;
       double d1 = p2;
       double d2 = p3;
       double d3 = p4;
       double d4 = p5;
       double d5 = p6;
       super();
       int b = false;
       uoa.r = b;
       boolean b1 = true;
       if (i == b1) {
          b = true;
       }
       uoa.q = b;
       uoa.c = d;
       uoa.d = d1;
       uoa.i = 0x3ff0000000000000 / (d1 - d);
       if (3 == i) {
          uoa.r = b1;
       }
       double d6 = d4 - d2;
       double d7 = d5 - d3;
       if (uoa.r == null && (Math.abs(d6) - 0x3f50624dd2f1a9fc < 0 || Math.abs(d7) - 0x3f50624dd2f1a9fc < 0)) {
          uoa.r = b1;
          uoa.e = d2;
          uoa.f = d4;
          uoa.g = d3;
          uoa.h = p6;
          double d8 = Math.hypot(d7, d6);
          uoa.b = d8;
          uoa.n = d8 * uoa.i;
          d9 = uoa.d;
          a$a c = uoa.c;
          uoa.l = d6 / (d9 - c);
          uoa.m = d7 / (d9 - c);
          return;
       }else {
          double[] uodoubleArra = new double[101];
          uoa.a = uodoubleArra;
          d9 = uoa.q;
          b = (d9 != null)? -1: 1;
          uoa.j = d6 * (double)b;
          if (d9 == null) {
             b1 = -1;
          }
          uoa.k = d7 * (double)b1;
          d6 = (d9 != null)? d4: d2;
          uoa.l = d6;
          d6 = (d9 != null)? d3: p6;
          uoa.m = d6;
          this.a(p3, p4, p5, p6);
          uoa.n = uoa.b * uoa.i;
          return;
       }
    }
    public final void a(double p0,double p1,double p2,double p3){
       double d5;
       int i1;
       a$a uoa = this;
       double d = p2 - p0;
       double d1 = p1 - p3;
       int i = 0;
       double d2 = 0;
       double d3 = 0;
       double d4 = 0;
       double[] s = a$a.s;
       while (i < s.length) {
          d5 = (double)i * 90.00f;
          i1 = s.length - 1;
          double d6 = d2;
          d5 = d5 / (double)i1;
          double d7 = Math.toRadians(d5);
          d2 = Math.sin(d7);
          d2 = d2 * d;
          d7 = Math.cos(d7) * d1;
          if (i > 0) {
             d3 = d2 - d3;
             d4 = d7 - d4;
             d3 = Math.hypot(d3, d4);
             d3 = d3 + d6;
             a$a.s[i] = d3;
          }else {
             int i2 = d6;
          }
          i = i + 1;
          d4 = d7;
          d2 = d3;
          d3 = d2;
       }
       d4 = d2;
       uoa.b = d4;
       int i3 = 0;
       double[] s1 = a$a.s;
       while (i3 < s1.length) {
          d1 = s1[i3] / d4;
          s1[i3] = d1;
          i3 = i3 + 1;
       }
       i1 = 0;
       a$a a = uoa.a;
       while (i1 < a.length) {
          i3 = a.length - 1;
          double d8 = (double)i1 / (double)i3;
          i3 = Arrays.binarySearch(a$a.s, d8);
          if (i3 >= 0) {
             int i4 = a$a.s.length - 1;
             i3 = i3 / i4;
             uoa.a[i1] = (double)i3;
             d5 = 0;
          }else if(i3 == -1){
             uoa.a[i1] = 0;
          }else {
             i3 = - i3;
             int i5 = i3 - 2;
             i3 = i3 - 1;
             double[] s2 = a$a.s;
             d8 = d8 - s2[i5];
             d3 = s2[i3] - s2[i5];
             d8 = d8 / d3;
             double d9 = (double)i5 + d8;
             i3 = s2.length - 1;
             d9 = d9 / (double)i3;
             uoa.a[i1] = d9;
          }
          i1 = i1 + 1;
       }
       return;
    }
    public double b(){
       double d = this.j * this.p;
       double d1 = this.n / Math.hypot(d, ((- this.k) * this.o));
       if (this.q != null) {
          d = - d;
       }
       return (d * d1);
    }
    public double c(){
       double d = (- this.k) * this.o;
       double d1 = this.n / Math.hypot((this.j * this.p), d);
       double d2 = (this.q != null)? (- d) * d1: d * d1;
       return d2;
    }
    public double d(double p0){
       return this.l;
    }
    public double e(double p0){
       return this.m;
    }
    public double f(double p0){
       a$a te = this.e;
       return (te + (((p0 - this.c) * this.i) * (this.f - te)));
    }
    public double g(double p0){
       a$a tg = this.g;
       return (tg + (((p0 - this.c) * this.i) * (this.h - tg)));
    }
    public double h(){
       return (this.l + (this.j * this.o));
    }
    public double i(){
       return (this.m + (this.k * this.p));
    }
    public double j(double p0){
       double d = 0;
       if (p0 - d <= 0) {
          return d;
       }
       d = 0x3ff0000000000000;
       if (p0 - d >= 0) {
          return d;
       }
       a$a ta = this.a;
       p0 = p0 * (double)(ta.length - 1);
       int i = (int)p0;
       return (ta[i] + ((p0 - (double)i) * (ta[(i + 1)] - ta[i])));
    }
    public void k(double p0){
       double d = (this.q != null)? this.d - p0: p0 - this.c;
       d = this.j((d * this.i)) * 0x3ff921fb54442d18;
       this.o = Math.sin(d);
       this.p = Math.cos(d);
       return;
    }
}
