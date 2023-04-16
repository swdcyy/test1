package e1.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.reflect.Array;
import java.lang.String;
import android.util.SparseArray;
import e1.u$b;
import e1.u$a;
import e1.u$d;
import e1.u$c;
import e1.u$f;
import e1.u$j;
import e1.u$i;
import e1.u$e;
import e1.u$n;
import e1.u$m;
import e1.u$l;
import e1.u$h;
import e1.u$g;
import java.lang.Math;
import android.view.View;
import e1.g;
import d1.b;
import java.lang.Float;
import e1.u$k;
import java.text.DecimalFormat;
import java.lang.StringBuilder;

public abstract class u	// class@001ec4
{
    public b a;
    public int b;
    public int[] c;
    public float[][] d;
    public int e;
    public String f;
    public float[] g;
    public boolean h;
    public long i;
    public float j;
    public static float k = 6.283185;

    public void u(){
       super();
       this.b = 0;
       int[] ointArray = new int[10];
       this.c = ointArray;
       this.d = Array.newInstance(float.class, new int[2]{10,3});
       float[] uofloatArray = new float[3];
       this.g = uofloatArray;
       this.h = false;
       this.j = Float.NaN;
    }
    public static u c(String p0,SparseArray p1){
       return new u$b(p0, p1);
    }
    public static u d(String p0,long p1){
       u$g og;
       int i = -1;
       switch (p0.hashCode()){
           case 0xb588e09a:
             if (p0.equals("rotationX")) {
                i = 0;
             }
             break;
           case 0xb588e09b:
             if (p0.equals("rotationY")) {
                i = 1;
             }
             break;
           case 0xb6f463c7:
             if (p0.equals("translationX")) {
                i = 2;
             }
             break;
           case 0xb6f463c8:
             if (p0.equals("translationY")) {
                i = 3;
             }
             break;
           case 0xb6f463c9:
             if (p0.equals("translationZ")) {
                i = 4;
             }
             break;
           case 0xc454c22d:
             if (p0.equals("progress")) {
                i = 5;
             }
             break;
           case 0xc9de204e:
             if (p0.equals("scaleX")) {
                i = 6;
             }
             break;
           case 0xc9de204f:
             if (p0.equals("scaleY")) {
                i = 7;
             }
             break;
           case 0xfd990f7e:
             if (p0.equals("rotation")) {
                i = 8;
             }
             break;
           case 0xffbd2e5d:
             if (p0.equals("elevation")) {
                i = 9;
             }
             break;
           case 0x2382115:
             if (p0.equals("transitionPathRotate")) {
                i = 10;
             }
             break;
           case 0x589b15e:
             if (p0.equals("alpha")) {
                i = 11;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             og = new u$g();
             break;
           case 1:
             og = new u$h();
             break;
           case 2:
             og = new u$l();
             break;
           case 3:
             og = new u$m();
             break;
           case 4:
             og = new u$n();
             break;
           case 5:
             og = new u$e();
             break;
           case 6:
             og = new u$i();
             break;
           case 7:
             og = new u$j();
             break;
           case 8:
             og = new u$f();
             break;
           case 9:
             og = new u$c();
             break;
           case 10:
             og = new u$d();
             break;
           case 11:
             og = new u$a();
             break;
           default:
             return null;
       }
       og.g(p1);
       return og;
    }
    public float a(float p0){
       float f = 0x3f800000;
       switch (this.b){
           case 1:
             return Math.signum((p0 * u.k));
           case 2:
             p0 = Math.abs(p0);
          label_0022 :
             return (f - p0);
             break;
           case 3:
             return ((((p0 * 2.00f) + f) % 2.00f) - f);
           case 4:
             p0 = ((p0 * 2.00f) + f) % 2.00f;
             goto label_0022 ;
             break;
           case 5:
             return (float)Math.cos((double)(p0 * u.k));
           case 6:
             p0 = (f - Math.abs((((p0 * 4.00f) % 4.00f) - 2.00f))) * (f - Math.abs((((p0 * 4.00f) % 4.00f) - 2.00f)));
             goto label_0022 ;
             break;
           default:
             return (float)Math.sin((double)(p0 * u.k));
       }
    }
    public float b(float p0,long p1,View p2,g p3){
       float f;
       u ou = this;
       long l = p1;
       Object obj = p2;
       g og = p3;
       ou.a.e((double)p0, ou.g);
       u g = ou.g;
       int i = g[1];
       if (!(v11 = i)) {
          ou.h = false;
          return g[2];
       }else if(Float.isNaN(ou.j)){
          f = og.a(obj, ou.f, false);
          ou.j = f;
          if (Float.isNaN(f)) {
             ou.j = 0;
          }
       }
       f = (float)(((double)ou.j + (((double)(l - ou.i) * 0.00f) * (double)i)) % 0x3ff0000000000000);
       ou.j = f;
       og.b(obj, ou.f, false, f);
       ou.i = l;
       int i1 = ou.g[0];
       float f1 = (ou.a(ou.j) * i1) + ou.g[2];
       boolean b = (i1 || v11)? true: false;
       ou.h = b;
       return f1;
    }
    public void e(int p0,float p1,float p2,int p3,float p4){
       u te = this.e;
       this.c[te] = p0;
       u td = this.d;
       td[te][0] = p1;
       p1[1] = p2;
       td[2] = p4;
       this.b = Math.max(this.b, p3);
       this.e = this.e + 1;
    }
    public abstract boolean f(View p0,float p1,long p2,g p3);
    public void g(long p0){
       this.i = p0;
    }
    public void h(String p0){
       this.f = p0;
    }
    public void i(int p0){
       int i2;
       u te = this.e;
       if (te == null) {
          return;
       }
       u$k.a(this.c, this.d, 0, (te - 1));
       int i = 1;
       int i1 = 0;
       u tc = this.c;
       while (i < tc.length) {
          i2 = i - 1;
          if (tc[i] != tc[i2]) {
             i1 = i1 + 1;
          }
          i = i + 1;
       }
       if (!i1) {
          i1 = 1;
       }
       double[] uodoubleArra = new double[i1];
       int[] ointArray = new int[]{i1,3};
       double[][] uodoubleArra1 = Array.newInstance(double.class, ointArray);
       int i3 = 0;
       i2 = 0;
       while (i3 < this.e) {
          if (i3 > 0) {
             u tc1 = this.c;
             int i4 = i3 - 1;
             if (tc1[i3] == tc1[i4]) {
             label_0078 :
                i3 = i3 + 1;
             }
          }
          double d = (double)this.c[i3] * 0x3f847ae147ae147b;
          uodoubleArra[i2] = d;
          u td = this.d;
          uodoubleArra1[i2][0] = (double)td[i3][0];
          uodoubleArra1[i2][1] = (double)td[i3][1];
          uodoubleArra1[i2][2] = (double)td[i3][2];
          i2 = i2 + 1;
          goto label_0078 ;
       }
       this.a = b.a(p0, uodoubleArra, uodoubleArra1);
       return;
    }
    public String toString(){
       u tf = this.f;
       DecimalFormat uDecimalForm = new DecimalFormat("##.##");
       for (int i = 0; i < this.e; i = i + 1) {
          tf = tf+"["+this.c[i]+" , "+uDecimalForm.format(this.d[i])+"] ";
       }
       return tf;
    }
}
