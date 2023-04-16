package d1.c$a;
import d1.c;
import java.lang.String;
import java.lang.Double;

public class c$a extends c	// class@001ded
{
    public double d;
    public double e;
    public double f;
    public double g;
    public static double h = 0.010000;
    public static double i = 0.000100;

    public void c$a(String p0){
       super();
       this.a = p0;
       int i = p0.indexOf(40);
       int i1 = p0.indexOf(44, i);
       this.d = Double.parseDouble((p0.substring((i + 1), i1)).trim());
       i1 = i1 + 1;
       i = p0.indexOf(44, i1);
       this.e = Double.parseDouble((p0.substring(i1, i)).trim());
       i = i + 1;
       int i2 = p0.indexOf(44, i);
       this.f = Double.parseDouble((p0.substring(i, i2)).trim());
       i2 = i2 + 1;
       this.g = Double.parseDouble((p0.substring(i2, p0.indexOf(41, i2))).trim());
    }
    public double a(double p0){
       double d = 0;
       if (p0 - d <= 0) {
          return d;
       }
       d = 0x3ff0000000000000;
       if (p0 - d >= 0) {
          return d;
       }
       d = 0x3fe0000000000000;
       double d1 = d;
       double d2 = d1;
       while (d1 - c$a.h > 0) {
          d1 = d1 * d;
          if (this.d(d2) - p0 < 0) {
             d2 = d2 + d1;
          }else {
             d2 = d2 - d1;
          }
       }
       d = d2 - d1;
       double d3 = this.d(d);
       d2 = d2 + d1;
       d1 = this.d(d2);
       d = this.e(d);
       return ((((this.e(d2) - d) * (p0 - d3)) / (d1 - d3)) + d);
    }
    public double b(double p0){
       double d = 0x3fe0000000000000;
       double d1 = d;
       double d2 = d1;
       while (d1 - c$a.i > 0) {
          d1 = d1 * d;
          if (this.d(d2) - p0 < 0) {
             d2 = d2 + d1;
          }else {
             d2 = d2 - d1;
          }
       }
       p0 = d2 - d1;
       d = this.d(p0);
       d2 = d2 + d1;
       d1 = this.d(d2);
       return ((this.e(d2) - this.e(p0)) / (d1 - d));
    }
    public final double d(double p0){
       double d = 0x3ff0000000000000 - p0;
       double d1 = 3.00f * d;
       return (((this.d * ((d * d1) * p0)) + (this.f * ((d1 * p0) * p0))) + ((p0 * p0) * p0));
    }
    public final double e(double p0){
       double d = 0x3ff0000000000000 - p0;
       double d1 = 3.00f * d;
       return (((this.e * ((d * d1) * p0)) + (this.g * ((d1 * p0) * p0))) + ((p0 * p0) * p0));
    }
}
