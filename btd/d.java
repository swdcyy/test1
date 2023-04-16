package btd.d;
import java.lang.Comparable;
import btd.d$a;
import nsd.u;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import java.lang.StringBuilder;
import btd.k;
import java.lang.Math;
import btd.i;
import kotlin.jvm.internal.a;
import usd.q;
import java.lang.IllegalArgumentException;
import java.lang.Double;
import msd.p;
import java.lang.Long;
import java.lang.Integer;
import msd.q;
import msd.r;
import msd.s;
import btd.e;
import btd.h;
import kotlin.text.StringsKt__StringsKt;
import java.lang.CharSequence;

public final class d implements Comparable	// class@000352
{
    public final double b;
    public static final double c;
    public static final double d;
    public static final d$a e;

    static {
       d.e = new d$a(null);
       d.c = d.d(0);
       d.d = d.d(Double.POSITIVE_INFINITY);
    }
    public void d(double p0){
       super();
       this.b = p0;
    }
    public static void A(){
    }
    public static final long A0(double p0){
       return d.x0(p0, TimeUnit.NANOSECONDS);
    }
    public static String B0(double p0){
       String str;
       double d;
       TimeUnit sECONDS;
       int i1;
       if (d.h0(p0)) {
          str = String.valueOf(p0);
       }else if(!p0){
          str = "0s";
       }else {
          d = d.s(d.j(p0));
          int i = 0;
          StringBuilder str1 = 1;
          if (d - 0x3eb0c6f7a0b5ed8d < 0) {
             sECONDS = TimeUnit.SECONDS;
          label_002b :
             i = 1;
          }else if(d - (double)str1 < 0){
             sECONDS = TimeUnit.NANOSECONDS;
             i1 = 7;
          }else if(d - 0x408f400000000000 < 0){
             sECONDS = TimeUnit.NANOSECONDS;
          }else if(d - 1000000.00f < 0){
             sECONDS = TimeUnit.MICROSECONDS;
          }else if(d - 1000000000.00f < 0){
             sECONDS = TimeUnit.MILLISECONDS;
          }else if(d - 1000000000000.00f < 0){
             sECONDS = TimeUnit.SECONDS;
          }else if(d - 60000000000000.00f < 0){
             sECONDS = TimeUnit.MINUTES;
          }else if(d - 3600000000000000.00f < 0){
             sECONDS = TimeUnit.HOURS;
          }else if(d - 0x44476b344f2a78c0 < 0){
             sECONDS = TimeUnit.DAYS;
          }else {
             sECONDS = TimeUnit.DAYS;
             goto label_002b ;
          }
          i1 = 0;
          double d1 = d.u0(p0, sECONDS);
          str1 = "";
          if (i) {
             str = k.b(d1);
          }else if(0 > 0){
             str = k.d(d1, 0);
          }else {
             str = k.c(d1, d.n0(p0, Math.abs(d1)));
          }
          str = str1+str+i.c(sECONDS);
       }
       return str;
    }
    public static final int C(double p0){
       return (int)(d.u(p0) % (double)60);
    }
    public static final String E0(double p0,TimeUnit p1,int p2){
       a.p(p1, "unit");
       boolean b = (p2 >= 0)? true: false;
       if (b) {
          if (d.h0(p0)) {
             return String.valueOf(p0);
          }else {
             p0 = d.u0(p0, p1);
             StringBuilder str = "";
             String str1 = (Math.abs(p0) - 0x42d6bcc41e900000 < 0)? k.c(p0, q.u(p2, 12)): k.b(p0);
             return str+str1+i.c(p1);
          }
       }else {
          throw new IllegalArgumentException("decimals must be not negative, but was "+p2.toString());
       }
    }
    public static String F0(double p0,TimeUnit p1,int p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = 0;
       }
       return d.E0(p0, p1, p2);
    }
    public static final double G0(double p0){
       return d.d((- p0));
    }
    public static final d a(double p0){
       return new d(p0);
    }
    public static int c(double p0,double p1){
       return Double.compare(p0, p1);
    }
    public static double d(double p0){
       return p0;
    }
    public static final double e(double p0,double p1){
       return (p0 / p1);
    }
    public static final double f(double p0,double p1){
       return d.d((p0 / p1));
    }
    public static int f0(double p0){
       long l = Double.doubleToLongBits(p0);
       return (int)(l ^ (l >> 32));
    }
    public static final double g(double p0,int p1){
       return d.d((p0 / (double)p1));
    }
    public static final boolean g0(double p0){
       boolean b = (!Double.isInfinite(p0) && !Double.isNaN(p0))? true: false;
       return b;
    }
    public static boolean h(double p0,Object p1){
       if (p1 instanceof d && !Double.compare(p0, p1.H0())) {
          return true;
       }
       return false;
    }
    public static final boolean h0(double p0){
       return Double.isInfinite(p0);
    }
    public static final boolean i(double p0,double p1){
       boolean b = (!Double.compare(p0, p1))? true: false;
       return b;
    }
    public static final boolean i0(double p0){
       int i = 0;
       if (p0 - (double)i < 0) {
          i = true;
       }
       return i;
    }
    public static final double j(double p0){
       if (d.i0(p0)) {
          p0 = d.G0(p0);
       }
       return p0;
    }
    public static final boolean j0(double p0){
       int i = 0;
       if (p0 - (double)i > 0) {
          i = true;
       }
       return i;
    }
    public static void k(){
    }
    public static final double k0(double p0,double p1){
       return d.d((p0 - p1));
    }
    public static final int l(double p0){
       return (int)(d.n(p0) % (double)24);
    }
    public static final double l0(double p0,double p1){
       return d.d((p0 + p1));
    }
    public static final double m(double p0){
       return d.u0(p0, TimeUnit.DAYS);
    }
    public static final double n(double p0){
       return d.u0(p0, TimeUnit.HOURS);
    }
    public static final int n0(double p0,double p1){
       int i = 1;
       if (p1 - (double)i < 0) {
          i = 3;
       }else if(p1 - (double)10 < 0){
          i = 2;
       }else if(p1 - (double)100 < 0){
          i = 0;
       }
       return i;
    }
    public static final double o(double p0){
       return d.u0(p0, TimeUnit.MICROSECONDS);
    }
    public static final double o0(double p0,double p1){
       return d.d((p0 * p1));
    }
    public static final double p(double p0){
       return d.u0(p0, TimeUnit.MILLISECONDS);
    }
    public static final double p0(double p0,int p1){
       return d.d((p0 * (double)p1));
    }
    public static final Object q0(double p0,p p1){
       a.p(p1, "action");
       return p1.invoke(Long.valueOf((long)d.u(p0)), Integer.valueOf(d.z(p0)));
    }
    public static final double r(double p0){
       return d.u0(p0, TimeUnit.MINUTES);
    }
    public static final Object r0(double p0,q p1){
       a.p(p1, "action");
       return p1.invoke(Integer.valueOf((int)d.r(p0)), Integer.valueOf(d.C(p0)), Integer.valueOf(d.z(p0)));
    }
    public static final double s(double p0){
       return d.u0(p0, TimeUnit.NANOSECONDS);
    }
    public static final Object s0(double p0,r p1){
       a.p(p1, "action");
       return p1.invoke(Integer.valueOf((int)d.n(p0)), Integer.valueOf(d.x(p0)), Integer.valueOf(d.C(p0)), Integer.valueOf(d.z(p0)));
    }
    public static final Object t0(double p0,s p1){
       a.p(p1, "action");
       return p1.invoke(Integer.valueOf((int)d.m(p0)), Integer.valueOf(d.l(p0)), Integer.valueOf(d.x(p0)), Integer.valueOf(d.C(p0)), Integer.valueOf(d.z(p0)));
    }
    public static final double u(double p0){
       return d.u0(p0, TimeUnit.SECONDS);
    }
    public static final double u0(double p0,TimeUnit p1){
       a.p(p1, "unit");
       return h.b(p0, e.Q(), p1);
    }
    public static void v(){
    }
    public static final int v0(double p0,TimeUnit p1){
       a.p(p1, "unit");
       return (int)d.u0(p0, p1);
    }
    public static final String w0(double p0){
       StringBuilder str = "";
       if (d.i0(p0)) {
          str = str+'-';
       }
       str = str+"PT";
       p0 = d.j(p0);
       int i = (int)d.n(p0);
       int i1 = d.x(p0);
       int i2 = d.C(p0);
       int i3 = d.z(p0);
       String str1 = 1;
       int i4 = (i)? 1: 0;
       int i5 = (i2 || i3)? 1: 0;
       if (!i1 && (!i5 || !i4)) {
          str1 = null;
       }
       if (i4) {
          str = str+i+'H';
       }
       if (str1) {
          str = str+i1+'M';
       }
       if (i5 || (!i4 && !str1)) {
          str = str+i2;
          if (i3) {
             str = str+'.';
             str1 = StringsKt__StringsKt.K3(String.valueOf(i3), 9, '0');
             if (!(i3 % 0xf4240)) {
                str = str+str1;
                a.o(str, "this.append\(value, startIndex, endIndex\)");
             }else if(!(i3 % 1000)){
                str = str+str1;
                a.o(str, "this.append\(value, startIndex, endIndex\)");
             }else {
                str = str+str1;
             }
          }
          str = str+'S';
       }
       String str2 = str;
       a.o(str2, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
       return str2;
    }
    public static final int x(double p0){
       return (int)(d.r(p0) % (double)60);
    }
    public static final long x0(double p0,TimeUnit p1){
       a.p(p1, "unit");
       return (long)d.u0(p0, p1);
    }
    public static void y(){
    }
    public static final long y0(double p0){
       return d.x0(p0, TimeUnit.MILLISECONDS);
    }
    public static final int z(double p0){
       return (int)(d.s(p0) % 1000000000.00f);
    }
    public final double H0(){
       return this.b;
    }
    public int b(double p0){
       return d.c(this.b, p0);
    }
    public int compareTo(Object p0){
       return this.b(p0.H0());
    }
    public boolean equals(Object p0){
       return d.h(this.b, p0);
    }
    public int hashCode(){
       return d.f0(this.b);
    }
    public String toString(){
       return d.B0(this.b);
    }
}
