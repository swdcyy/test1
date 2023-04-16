package e1.i$d;
import java.lang.Object;
import d1.f;
import java.util.HashMap;
import d1.b;
import java.lang.Class;
import java.lang.reflect.Array;

public class i$d	// class@001e8a
{
    public final int a;
    public f b;
    public float[] c;
    public double[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int h;
    public b i;
    public double[] j;
    public double[] k;
    public float l;
    public HashMap m;

    public void i$d(int p0,int p1,int p2){
       super();
       this.b = new f();
       this.m = new HashMap();
       this.h = p0;
       this.a = p1;
       this.b.g(p0);
       float[] uofloatArray = new float[p2];
       this.c = uofloatArray;
       double[] uodoubleArra = new double[p2];
       this.d = uodoubleArra;
       uofloatArray = new float[p2];
       this.e = uofloatArray;
       uofloatArray = new float[p2];
       this.f = uofloatArray;
       uofloatArray = new float[p2];
       this.g = uofloatArray;
    }
    public double a(float p0){
       double d;
       i$d ti = this.i;
       if (ti != null) {
          d = (double)p0;
          ti.g(d, this.k);
          this.i.d(d, this.j);
       }else {
          ti = this.k;
          long l = 0;
          ti[0] = l;
          ti[1] = l;
       }
       d = (double)p0;
       double d1 = this.b.e(d);
       i$d tk = this.k;
       return ((tk[0] + (d1 * tk[1])) + (this.b.d(d) * this.j[1]));
    }
    public double b(float p0){
       i$d ti = this.i;
       int i = 0;
       if (ti != null) {
          ti.d((double)p0, this.j);
       }else {
          ti = this.j;
          ti[i] = (double)this.f[i];
          ti[1] = (double)this.c[i];
       }
       return (this.j[i] + (this.b.e((double)p0) * this.j[1]));
    }
    public void c(int p0,int p1,float p2,float p3,float p4){
       this.d[p0] = (double)p1 / 100.00f;
       p1[p0] = p2;
       p1[p0] = p3;
       p1[p0] = p4;
    }
    public void d(float p0){
       this.l = p0;
       int[] ointArray = new int[]{this.d.length,2};
       double[][] uodoubleArra = Array.newInstance(double.class, ointArray);
       i$d tc = this.c;
       double[] uodoubleArra1 = new double[(tc.length + 1)];
       this.j = uodoubleArra1;
       double[] uodoubleArra2 = new double[(tc.length + 1)];
       this.k = uodoubleArra2;
       double d = 0;
       if (this.d[0] - d > 0) {
          this.b.a(d, this.e[0]);
       }
       tc = this.d;
       int i = tc.length - 1;
       double d1 = 0x3ff0000000000000;
       if (tc[i] - d1 < 0) {
          this.b.a(d1, this.e[i]);
       }
       for (int i1 = 0; i1 < uodoubleArra.length; i1 = i1 + 1) {
          uodoubleArra[i1][0] = (double)this.f[i1];
          i = 0;
          i$d tc1 = this.c;
          while (i < tc1.length) {
             uodoubleArra[i][1] = (double)tc1[i];
             i = i + 1;
          }
          this.b.a(this.d[i1], this.e[i1]);
       }
       this.b.f();
       tc = this.d;
       this.i = (tc.length > 1)? b.a(0, tc, uodoubleArra): null;
       return;
    }
}
