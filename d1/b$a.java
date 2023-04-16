package d1.b$a;
import d1.b;
import java.lang.Object;
import java.lang.System;

public class b$a extends b	// class@001deb
{
    public double a;
    public double[] b;

    public void b$a(double p0,double[] p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public double c(double p0,int p1){
       return this.b[p1];
    }
    public void d(double p0,double[] p1){
       b$a tb = this.b;
       System.arraycopy(tb, 0, p1, 0, tb.length);
    }
    public void e(double p0,float[] p1){
       int i = 0;
       b$a tb = this.b;
       while (i < tb.length) {
          p1[i] = (float)tb[i];
          i++;
       }
       return;
    }
    public double f(double p0,int p1){
       return 0;
    }
    public void g(double p0,double[] p1){
       for (int i = 0; i < this.b.length; i++) {
          p1[i] = 0;
       }
       return;
    }
    public double[] h(){
       double[] uodoubleArra = new double[]{this.a};
       return uodoubleArra;
    }
}
