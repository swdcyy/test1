package d1.f;
import java.lang.Object;
import java.util.Arrays;
import java.lang.System;
import java.lang.Math;
import java.lang.String;
import java.lang.StringBuilder;

public class f	// class@001df1
{
    public float[] a;
    public double[] b;
    public double[] c;
    public int d;
    public double e;
    public boolean f;
    public static String g = "Oscillator";

    public void f(){
       super();
       float[] uofloatArray = new float[0];
       this.a = uofloatArray;
       double[] uodoubleArra = new double[0];
       this.b = uodoubleArra;
       this.e = 0x401921fb54442d18;
       this.f = false;
    }
    public void a(double p0,float p1){
       int i = this.a.length + 1;
       int i1 = Arrays.binarySearch(this.b, p0);
       if (i1 < 0) {
          i1 = (- i1) - 1;
       }
       this.b = Arrays.copyOf(this.b, i);
       this.a = Arrays.copyOf(this.a, i);
       double[] uodoubleArra = new double[i];
       this.c = uodoubleArra;
       System.arraycopy(this.b, i1, this.b, (i1 + 1), ((i - i1) - 1));
       this.b[i1] = p0;
       p0[i1] = p1;
       this.f = false;
       return;
    }
    public double b(double p0){
       double d = 0;
       if (p0 - d <= 0) {
          p0 = 0x3ee4f8b588e368f1;
       }else if(p0 - 0x3ff0000000000000 >= 0){
          p0 = 0x3feffffde7210be9;
       }
       int i = Arrays.binarySearch(this.b, p0);
       if (i > 0) {
          return d;
       }else if(i){
          int i1 = (- i) - 1;
          f ta = this.a;
          int i2 = i1 - 1;
          f tb = this.b;
          double d1 = (double)(ta[i1] - ta[i2]) / (tb[i1] - tb[i2]);
          p0 = p0 * d1;
          d = ((double)ta[i2] - (d1 * tb[i2])) + p0;
       }
       return d;
    }
    public double c(double p0){
       int i2;
       double d = 0x3ff0000000000000;
       int i = 0;
       if (p0 - i < 0) {
          p0 = i;
       }else if(p0 - d > 0){
          p0 = d;
       }
       int i1 = Arrays.binarySearch(this.b, p0);
       if (i1 <= 0) {
          if (i1) {
             i2 = (- i1) - 1;
             f ta = this.a;
             int i3 = i2 - 1;
             f tb = this.b;
             double d1 = (double)(ta[i2] - ta[i3]) / (tb[i2] - tb[i3]);
             d = (this.c[i3] + (((double)ta[i3] - (tb[i3] * d1)) * (p0 - tb[i3]))) + ((d1 * ((p0 * p0) - (tb[i3] * tb[i3]))) / 2.00f);
          }else {
             i2 = i;
          }
       }
       return d;
    }
    public double d(double p0){
       double d;
       double d1;
       switch (this.d){
           case 1:
             return 0;
           case 2:
             d = this.b(p0) * 4.00f;
             p0 = Math.signum(((((this.c(p0) * 4.00f) + 3.00f) % 4.00f) - 2.00f));
          label_002f :
             return (d * p0);
             break;
           case 3:
             p0 = this.b(p0);
          label_004d :
             return (p0 * 2.00f);
             break;
           case 4:
             p0 = - this.b(p0);
             goto label_004d ;
             break;
           case 5:
             d1 = (- this.e) * this.b(p0);
             p0 = Math.sin((this.e * this.c(p0)));
          label_001d :
             return (d1 * p0);
             break;
           case 6:
             d = this.b(p0) * 4.00f;
             p0 = (((this.c(p0) * 4.00f) + 2.00f) % 4.00f) - 2.00f;
             goto label_002f ;
             break;
           default:
             d1 = this.e * this.b(p0);
             p0 = Math.cos((this.e * this.c(p0)));
             goto label_001d ;
       }
    }
    public double e(double p0){
       double d = 0x3ff0000000000000;
       switch (this.d){
           case 1:
             return Math.signum((0x3fe0000000000000 - (this.c(p0) % d)));
           case 2:
             p0 = Math.abs(((((this.c(p0) * 4.00f) + d) % 4.00f) - 2.00f));
          label_0028 :
             return (d - p0);
             break;
           case 3:
             return ((((this.c(p0) * 2.00f) + d) % 2.00f) - d);
           case 4:
             p0 = ((this.c(p0) * 2.00f) + d) % 2.00f;
             goto label_0028 ;
             break;
           case 5:
             return Math.cos((this.e * this.c(p0)));
           case 6:
             p0 = (d - Math.abs((((this.c(p0) * 4.00f) % 4.00f) - 2.00f))) * (d - Math.abs((((this.c(p0) * 4.00f) % 4.00f) - 2.00f)));
             goto label_0028 ;
             break;
           default:
             return Math.sin((this.e * this.c(p0)));
       }
    }
    public void f(){
       f uof = this;
       int i = 0;
       long l = 0;
       double d = l;
       int i1 = 0;
       f a = uof.a;
       while (i1 < a.length) {
          d = d + (double)a[i1];
          i1 = i1 + 1;
       }
       double d1 = l;
       int i2 = 1;
       f a1 = uof.a;
       while (i2 < a1.length) {
          int i3 = i2 - 1;
          float f = a1[i3] + a1[i2];
          f = f / 2.00f;
          a1 = uof.b;
          double d2 = a1[i2] - a1[i3];
          d2 = d2 * (double)f;
          d1 = d1 + d2;
          i2 = i2 + 1;
       }
       i2 = 0;
       a1 = uof.a;
       while (i2 < a1.length) {
          double d3 = d / d1;
          double d4 = (double)a1[i2] * d3;
          a1[i2] = (float)d4;
          i2 = i2 + 1;
       }
       uof.c[i] = l;
       i = 1;
       f a2 = uof.a;
       while (i < a2.length) {
          int i4 = i - 1;
          float f1 = a2[i4] + a2[i];
          f1 = f1 / 2.00f;
          a2 = uof.b;
          double d5 = a2[i] - a2[i4];
          a2 = uof.c;
          d5 = d5 * (double)f1;
          d1 = a2[i4] + d5;
          a2[i] = d1;
          i = i + 1;
       }
       uof.f = true;
       return;
    }
    public void g(int p0){
       this.d = p0;
    }
    public String toString(){
       return "pos ="+Arrays.toString(this.b)+" period="+Arrays.toString(this.a);
    }
}
