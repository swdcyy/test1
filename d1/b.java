package d1.b;
import java.lang.Object;
import d1.d;
import d1.b$a;
import d1.e;
import d1.a;

public abstract class b	// class@001dec
{

    public void b(){
       super();
    }
    public static b a(int p0,double[] p1,double[][] p2){
       int i = 2;
       if (p1.length == 1) {
          p0 = 2;
       }
       if (p0) {
          if (p0 != i) {
             return new d(p1, p2);
          }else {
             return new b$a(p1[0], p2[0]);
          }
       }else {
          return new e(p1, p2);
       }
    }
    public static b b(int[] p0,double[] p1,double[][] p2){
       return new a(p0, p1, p2);
    }
    public abstract double c(double p0,int p1);
    public abstract void d(double p0,double[] p1);
    public abstract void e(double p0,float[] p1);
    public abstract double f(double p0,int p1);
    public abstract void g(double p0,double[] p1);
    public abstract double[] h();
}
