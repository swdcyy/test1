package d1.a;
import d1.b;
import d1.a$a;

public class a extends b	// class@001dea
{
    public final double[] a;
    public a$a[] b;

    public void a(int[] p0,double[] p1,double[][] p2){
       a uoa = this;
       double[] uodoubleArra = p1;
       super();
       uoa.a = uodoubleArra;
       a$a[] uoaArray = new a$a[(uodoubleArra.length - 1)];
       uoa.b = uoaArray;
       int i = 0;
       int i1 = 1;
       int i2 = 1;
       a b = uoa.b;
       while (i < b.length) {
          int i3 = p0[i];
          int i4 = 3;
          long l = 2;
          if (i3) {
             if (i3 != 1) {
                if (i3 != l) {
                   if (i3 == i4) {
                      i1 = (i1 == 1)? 2: 1;
                      i2 = i1;
                   }
                }else {
                   i1 = 2;
                   i2 = 2;
                }
             }else {
                i1 = 1;
                i2 = 1;
             }
          }else {
             i2 = 3;
          }
          int i5 = i + 1;
          a$a uoa1 = new a$a(i2, uodoubleArra[i], uodoubleArra[i5], p2[i][0], p2[i][1], p2[i5][0], p2[i5][1]);
          b[i] = v22;
          i = i5;
       }
       return;
    }
    public double c(double p0,int p1){
       a$a c;
       a tb = this.b;
       int i = 0;
       if (p0 - tb[i].c < 0) {
          c = tb[i].c;
       }else {
          int i1 = tb.length - 1;
          if (p0 - tb[i1].d > 0) {
             int i2 = tb.length - 1;
             c = tb[i2].d;
          }
       }
       while (true) {
          tb = this.b;
          if (i >= tb.length) {
             return Double.NaN;
          }
          if (c - tb[i].d <= 0) {
             if (tb[i].r != null) {
                if (!p1) {
                   break ;
                }else {
                   return tb[i].g(c);
                }
             }else {
                tb[i].k(c);
                if (!p1) {
                   return this.b[i].h();
                }else {
                   return this.b[i].i();
                }
             }
          }else {
             i = i + 1;
          }
       }
       return tb[i].f(c);
    }
    public void d(double p0,double[] p1){
       a$a c;
       a tb1;
       a tb = this.b;
       int i = 0;
       if (p0 - tb[i].c < 0) {
          c = tb[i].c;
       }
       if (c - tb[(tb.length - 1)].d > 0) {
          c = tb[(tb.length - 1)].d;
       }
       int i1 = 0;
       while (true) {
          tb1 = this.b;
          if (i1 >= tb1.length) {
             return;
          }
          if (c - tb1[i1].d <= 0) {
             if (tb1[i1].r != null) {
                break ;
             }else {
                tb1[i1].k(c);
                p1[i] = this.b[i1].h();
                p1[1] = this.b[i1].i();
                return;
             }
          }else {
             i1 = i1 + 1;
          }
       }
       p1[i] = tb1[i1].f(c);
       p1[1] = this.b[i1].g(c);
       return;
    }
    public void e(double p0,float[] p1){
       a$a c;
       a tb1;
       a tb = this.b;
       int i = 0;
       if (p0 - tb[i].c < 0) {
          c = tb[i].c;
       }else if(p0 - tb[(tb.length - 1)].d > 0){
          c = tb[(tb.length - 1)].d;
       }
       int i1 = 0;
       while (true) {
          tb1 = this.b;
          if (i1 >= tb1.length) {
             return;
          }
          if (c - tb1[i1].d <= 0) {
             if (tb1[i1].r != null) {
                break ;
             }else {
                tb1[i1].k(c);
                p1[i] = (float)this.b[i1].h();
                p1[1] = (float)this.b[i1].i();
                return;
             }
          }else {
             i1 = i1 + 1;
          }
       }
       p1[i] = (float)tb1[i1].f(c);
       p1[1] = (float)this.b[i1].g(c);
       return;
    }
    public double f(double p0,int p1){
       a$a c;
       a tb = this.b;
       int i = 0;
       if (p0 - tb[i].c < 0) {
          c = tb[i].c;
       }
       int i1 = tb.length - 1;
       if (c - tb[i1].d > 0) {
          c = tb[(tb.length - 1)].d;
       }
       while (true) {
          tb = this.b;
          if (i >= tb.length) {
             return Double.NaN;
          }
          if (c - tb[i].d <= 0) {
             if (tb[i].r != null) {
                if (!p1) {
                   break ;
                }else {
                   return tb[i].e(c);
                }
             }else {
                tb[i].k(c);
                if (!p1) {
                   return this.b[i].b();
                }else {
                   return this.b[i].c();
                }
             }
          }else {
             i = i + 1;
          }
       }
       return tb[i].d(c);
    }
    public void g(double p0,double[] p1){
       a$a c;
       a tb1;
       a tb = this.b;
       int i = 0;
       if (p0 - tb[i].c < 0) {
          c = tb[i].c;
       }else if(p0 - tb[(tb.length - 1)].d > 0){
          c = tb[(tb.length - 1)].d;
       }
       int i1 = 0;
       while (true) {
          tb1 = this.b;
          if (i1 >= tb1.length) {
             return;
          }
          if (c - tb1[i1].d <= 0) {
             if (tb1[i1].r != null) {
                break ;
             }else {
                tb1[i1].k(c);
                p1[i] = this.b[i1].b();
                p1[1] = this.b[i1].c();
                return;
             }
          }else {
             i1 = i1 + 1;
          }
       }
       p1[i] = tb1[i1].d(c);
       p1[1] = this.b[i1].e(c);
       return;
    }
    public double[] h(){
       return this.a;
    }
}
