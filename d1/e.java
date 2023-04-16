package d1.e;
import d1.b;
import java.lang.Class;
import java.lang.Object;
import java.lang.reflect.Array;
import java.lang.Math;

public class e extends b	// class@001df0
{
    public double[] a;
    public double[][] b;
    public double[][] c;

    public void e(double[] p0,double[][] p1){
       int i4;
       double d1;
       double d2;
       int i = this;
       double[] uodoubleArra = p0;
       double[][] uodoubleArra1 = p1;
       super();
       int len = uodoubleArra.length;
       int len1 = uodoubleArra1[0].length;
       int i1 = len - 1;
       int[] ointArray = new int[]{i1,len1};
       int i2 = 1;
       double[][] uodoubleArra2 = Array.newInstance(double.class, ointArray);
       int[] ointArray1 = new int[]{len,len1};
       double[][] uodoubleArra3 = Array.newInstance(double.class, ointArray1);
       for (int i3 = 0; i3 < len1; i3 = i3 + 1) {
          i2 = 0;
          while (i2 < i1) {
             i4 = i2 + 1;
             double d = uodoubleArra[i4] - uodoubleArra[i2];
             d1 = uodoubleArra1[i4][i3] - uodoubleArra1[i2][i3];
             d1 = d1 / d;
             uodoubleArra2[i2][i3] = d1;
             if (!i2) {
                uodoubleArra3[i2][i3] = uodoubleArra2[i2][i3];
             }else {
                int i5 = i2 - 1;
                d2 = uodoubleArra2[i5][i3] + uodoubleArra2[i2][i3];
                d2 = d2 * 0x3fe0000000000000;
                uodoubleArra3[i2][i3] = d2;
             }
             i2 = i4;
          }
          i4 = len - 2;
          uodoubleArra3[i1][i3] = uodoubleArra2[i4][i3];
       }
       len = 0;
       while (len < i1) {
          i3 = 0;
          while (i3 < len1) {
             long l = 0;
             if (!uodoubleArra2[len][i3] - l) {
                uodoubleArra3[len][i3] = l;
                i2 = len + 1;
                uodoubleArra3[i2][i3] = l;
             }else {
                double d3 = uodoubleArra3[len][i3] / uodoubleArra2[len][i3];
                i2 = len + 1;
                d2 = uodoubleArra3[i2][i3] / uodoubleArra2[len][i3];
                d1 = Math.hypot(d3, d2);
                if (d1 - 0x4022000000000000 > 0) {
                   double d4 = 3.00f / d1;
                   d3 = d3 * d4;
                   d3 = d3 * uodoubleArra2[len][i3];
                   uodoubleArra3[len][i3] = d3;
                   d4 = d4 * d2;
                   d4 = d4 * uodoubleArra2[len][i3];
                   uodoubleArra3[i2][i3] = d4;
                }
             }
             i3 = i3 + 1;
          }
          len = len + 1;
       }
       i.a = uodoubleArra;
       i.b = uodoubleArra1;
       i.c = uodoubleArra3;
       return;
    }
    public static double i(double p0,double p1,double p2,double p3,double p4,double p5){
       double d = p1 * p1;
       double d1 = p1 * 6.00f;
       double d2 = 3.00f * p0;
       return ((((((((((-6.00f * d) * p3) + (d1 * p3)) + ((6.00f * d) * p2)) - (d1 * p2)) + ((d2 * p5) * d)) + ((d2 * p4) * d)) - (((2.00f * p0) * p5) * p1)) - (((4.00f * p0) * p4) * p1)) + (p0 * p4));
    }
    public static double j(double p0,double p1,double p2,double p3,double p4,double p5){
       double d = p1 * p1;
       double d1 = d * p1;
       double d2 = 3.00f * d;
       d2 = p0 * p5;
       double d3 = p0 * p4;
       return (((((((((((-2.00f * d1) * p3) + (d2 * p3)) + ((d1 * 2.00f) * p2)) - (d2 * p2)) + p2) + (d2 * d1)) + (d1 * d3)) - (d2 * d)) - (((p0 * 2.00f) * p4) * d)) + (d3 * p1));
    }
    public double c(double p0,int p1){
       e uoe = this;
       e a = uoe.a;
       int len = a.length;
       int i = 0;
       if (p0 - a[i] <= 0) {
          return uoe.b[i][p1];
       }
       len = len - 1;
       if (p0 - a[len] >= 0) {
          return uoe.b[len][p1];
       }
       while (true) {
          if (i >= len) {
             return 0;
          }
          a = uoe.a;
          if (!p0 - a[i]) {
             break ;
          }else {
             int i1 = i + 1;
             if (p0 - a[i1] < 0) {
                double d = a[i1] - a[i];
                a = uoe.b;
                a = uoe.c;
                return e.j(d, ((p0 - a[i]) / d), a[i][p1], a[i1][p1], a[i][p1], a[i1][p1]);
             }else {
                i = i1;
             }
          }
       }
       return uoe.b[i][p1];
    }
    public void d(double p0,double[] p1){
       int i1;
       e uoe = this;
       e a = uoe.a;
       int len = a.length;
       int i = 0;
       int len1 = uoe.b[i].length;
       if (p0 - a[i] <= 0) {
          for (i1 = 0; i1 < len1; i1 = i1 + 1) {
             p1[i1] = uoe.b[i][i1];
          }
          return;
       }else {
          len = len - 1;
          if (p0 - a[len] >= 0) {
             for (; i < len1; i = i + 1) {
                p1[i] = uoe.b[len][i];
             }
             return;
          }else {
             i1 = 0;
             while (true) {
                if (i1 >= len) {
                   return;
                }
                if (!p0 - uoe.a[i1]) {
                   for (int i2 = 0; i2 < len1; i2 = i2 + 1) {
                      p1[i2] = uoe.b[i1][i2];
                   }
                }
                e a1 = uoe.a;
                int i3 = i1 + 1;
                if (p0 - a1[i3] < 0) {
                   double d = a1[i3] - a1[i1];
                   double d1 = (p0 - a1[i1]) / d;
                   for (; i < len1; i = i + 1) {
                      e b = uoe.b;
                      b = uoe.c;
                      p1[i] = e.j(d, d1, b[i1][i], b[i3][i], b[i1][i], b[i3][i]);
                   }
                   return;
                }else {
                   i1 = i3;
                }
             }
          }
       }
    }
    public void e(double p0,float[] p1){
       int i1;
       e uoe = this;
       e a = uoe.a;
       int len = a.length;
       int i = 0;
       int len1 = uoe.b[i].length;
       if (p0 - a[i] <= 0) {
          for (i1 = 0; i1 < len1; i1 = i1 + 1) {
             p1[i1] = (float)uoe.b[i][i1];
          }
          return;
       }else {
          len = len - 1;
          if (p0 - a[len] >= 0) {
             for (; i < len1; i = i + 1) {
                p1[i] = (float)uoe.b[len][i];
             }
             return;
          }else {
             i1 = 0;
             while (true) {
                if (i1 >= len) {
                   return;
                }
                if (!p0 - uoe.a[i1]) {
                   for (int i2 = 0; i2 < len1; i2 = i2 + 1) {
                      p1[i2] = (float)uoe.b[i1][i2];
                   }
                }
                e a1 = uoe.a;
                int i3 = i1 + 1;
                if (p0 - a1[i3] < 0) {
                   double d = a1[i3] - a1[i1];
                   double d1 = (p0 - a1[i1]) / d;
                   for (; i < len1; i = i + 1) {
                      e b = uoe.b;
                      b = uoe.c;
                      p1[i] = (float)e.j(d, d1, b[i1][i], b[i3][i], b[i1][i], b[i3][i]);
                   }
                   return;
                }else {
                   i1 = i3;
                }
             }
          }
       }
    }
    public double f(double p0,int p1){
       long l;
       int i2;
       e uoe = this;
       e a = uoe.a;
       int len = a.length;
       int i = 0;
       if (p0 - a[i] < 0) {
          l = a[i];
       }else {
          int i3 = len - 1;
          l = (p0 - a[i3] >= 0)? a[i3]: p0;
       }
       while (true) {
          int i1 = len - 1;
          if (i >= i1) {
             return 0;
          }
          a = uoe.a;
          i2 = i + 1;
          if (l - a[i2] <= 0) {
             break ;
          }else {
             i = i2;
          }
       }
       double d = a[i2] - a[i];
       a = uoe.b;
       a = uoe.c;
       return (e.i(d, ((l - a[i]) / d), a[i][p1], a[i2][p1], a[i][p1], a[i2][p1]) / d);
    }
    public void g(double p0,double[] p1){
       long l;
       e uoe = this;
       e a = uoe.a;
       int len = a.length;
       int i = 0;
       int len1 = uoe.b[i].length;
       if (p0 - a[i] <= 0) {
          l = a[i];
       }else {
          int i4 = len - 1;
          l = (p0 - a[i4] >= 0)? a[i4]: p0;
       }
       int i1 = 0;
       int i2 = len - 1;
       while (i1 < i2) {
          e a1 = uoe.a;
          int i3 = i1 + 1;
          if (l - a1[i3] <= 0) {
             double d = a1[i3] - a1[i1];
             double d1 = (l - a1[i1]) / d;
          label_0039 :
             if (i < len1) {
                e b = uoe.b;
                b = uoe.c;
                double d2 = e.i(d, d1, b[i1][i], b[i3][i], b[i1][i], b[i3][i]) / d;
                p1[i] = d2;
                i = i + 1;
                goto label_0039 ;
             }else {
                break ;
             }
          }
          i1 = i3;
       }
       return;
    }
    public double[] h(){
       return this.a;
    }
}
