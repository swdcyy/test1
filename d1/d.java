package d1.d;
import d1.b;
import java.lang.Math;

public class d extends b	// class@001def
{
    public double[] a;
    public double[][] b;
    public double c;

    public void d(double[] p0,double[][] p1){
       super();
       this.c = Double.NaN;
       this.a = p0;
       this.b = p1;
       if (p1[0].length > 2) {
          double d = 0;
          double d1 = d;
          int i = 0;
          while (i < p0.length) {
             long l = p1[i][0];
             long l1 = p1[i][0];
             if (i > 0) {
                d = l - d;
                d1 = l1 - d1;
                Math.hypot(d, d1);
             }
             i = i + 1;
             d = l;
             d1 = l1;
          }
          this.c = 0;
       }
       return;
    }
    public double c(double p0,int p1){
       d ta = this.a;
       int len = ta.length;
       int i = 0;
       if (p0 - ta[i] <= 0) {
          return this.b[i][p1];
       }
       len = len - 1;
       if (p0 - ta[len] >= 0) {
          return this.b[len][p1];
       }
       while (true) {
          if (i >= len) {
             return 0;
          }
          ta = this.a;
          if (!p0 - ta[i]) {
             break ;
          }else {
             int i1 = i + 1;
             if (p0 - ta[i1] < 0) {
                p0 = (p0 - ta[i]) / (ta[i1] - ta[i]);
                ta = this.b;
                return ((ta[i][p1] * (0x3ff0000000000000 - p0)) + (ta[i1][p1] * p0));
             }else {
                i = i1;
             }
          }
       }
       return this.b[i][p1];
    }
    public void d(double p0,double[] p1){
       d ta = this.a;
       int len = ta.length;
       int i = 0;
       int len1 = this.b[i].length;
       if (p0 - ta[i] <= 0) {
          for (int i1 = 0; i1 < len1; i1++) {
             p1[i1] = this.b[i][i1];
          }
          return;
       }else {
          len = len - 1;
          if (p0 - ta[len] >= 0) {
             for (; i < len1; i = i + 1) {
                p1[i] = this.b[len][i];
             }
             return;
          }else {
             int i2 = 0;
             while (true) {
                if (i2 >= len) {
                   return;
                }
                if (!p0 - this.a[i2]) {
                   for (int i3 = 0; i3 < len1; i3 = i3 + 1) {
                      p1[i3] = this.b[i2][i3];
                   }
                }
                d ta1 = this.a;
                int i4 = i2 + 1;
                if (p0 - ta1[i4] < 0) {
                   p0 = (p0 - ta1[i2]) / (ta1[i4] - ta1[i2]);
                   for (; i < len1; i = i + 1) {
                      d tb = this.b;
                      double d = 0x3ff0000000000000 - p0;
                      double d1 = tb[i2][i] * d;
                      double d2 = tb[i4][i] * p0;
                      d1 = d1 + d2;
                      p1[i] = d1;
                   }
                   return;
                }else {
                   i2 = i4;
                }
             }
          }
       }
    }
    public void e(double p0,float[] p1){
       d ta = this.a;
       int len = ta.length;
       int i = 0;
       int len1 = this.b[i].length;
       if (p0 - ta[i] <= 0) {
          for (int i1 = 0; i1 < len1; i1++) {
             p1[i1] = (float)this.b[i][i1];
          }
          return;
       }else {
          len = len - 1;
          if (p0 - ta[len] >= 0) {
             for (; i < len1; i = i + 1) {
                p1[i] = (float)this.b[len][i];
             }
             return;
          }else {
             int i2 = 0;
             while (true) {
                if (i2 >= len) {
                   return;
                }
                if (!p0 - this.a[i2]) {
                   for (int i3 = 0; i3 < len1; i3 = i3 + 1) {
                      p1[i3] = (float)this.b[i2][i3];
                   }
                }
                d ta1 = this.a;
                int i4 = i2 + 1;
                if (p0 - ta1[i4] < 0) {
                   p0 = (p0 - ta1[i2]) / (ta1[i4] - ta1[i2]);
                   for (; i < len1; i = i + 1) {
                      d tb = this.b;
                      double d = 0x3ff0000000000000 - p0;
                      double d1 = tb[i2][i] * d;
                      double d2 = tb[i4][i] * p0;
                      d1 = d1 + d2;
                      p1[i] = (float)d1;
                   }
                   return;
                }else {
                   i2 = i4;
                }
             }
          }
       }
    }
    public double f(double p0,int p1){
       long l;
       int i2;
       d ta = this.a;
       int len = ta.length;
       int i = 0;
       if (p0 - ta[i] < 0) {
          l = ta[i];
       }else {
          i2 = len - 1;
          if (p0 - ta[i2] >= 0) {
             l = ta[i2];
          }
       }
       while (true) {
          int i1 = len - 1;
          if (i >= i1) {
             return 0;
          }
          ta = this.a;
          i2 = i + 1;
          if (l - ta[i2] <= 0) {
             break ;
          }else {
             i = i2;
          }
       }
       ta = this.b;
       return ((ta[i2][p1] - ta[i][p1]) / (ta[i2] - ta[i]));
    }
    public void g(double p0,double[] p1){
       long l;
       int i2;
       d ta = this.a;
       int len = ta.length;
       int i = 0;
       int len1 = this.b[i].length;
       if (p0 - ta[i] <= 0) {
          l = ta[i];
       }else {
          i2 = len - 1;
          if (p0 - ta[i2] >= 0) {
             l = ta[i2];
          }
       }
       int i1 = 0;
       i2 = len - 1;
       while (i1 < i2) {
          d ta1 = this.a;
          int i3 = i1 + 1;
          if (l - ta1[i3] <= 0) {
             l = ta1[i3] - ta1[i1];
             long l1 = ta1[i1];
             for (; i < len1; i = i + 1) {
                d tb = this.b;
                double d = tb[i3][i] - tb[i1][i];
                d = d / l;
                p1[i] = d;
             }
             return;
          }
          i1 = i3;
       }
    }
    public double[] h(){
       return this.a;
    }
}
