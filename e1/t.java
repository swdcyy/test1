package e1.t;
import java.lang.Object;
import java.lang.String;
import android.util.SparseArray;
import e1.t$b;
import e1.t$a;
import e1.t$d;
import e1.t$c;
import e1.t$h;
import e1.t$f;
import e1.t$e;
import e1.t$l;
import e1.t$k;
import e1.t$g;
import e1.t$p;
import e1.t$o;
import e1.t$n;
import e1.t$j;
import e1.t$i;
import d1.b;
import java.util.Arrays;
import android.view.View;
import e1.t$m;
import java.lang.Class;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.lang.StringBuilder;

public abstract class t	// class@001eb5
{
    public b a;
    public int[] b;
    public float[] c;
    public int d;
    public String e;

    public void t(){
       super();
       int[] ointArray = new int[10];
       this.b = ointArray;
       float[] uofloatArray = new float[10];
       this.c = uofloatArray;
    }
    public static t c(String p0,SparseArray p1){
       return new t$b(p0, p1);
    }
    public static t d(String p0){
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
           case 0xd076cce0:
             if (p0.equals("waveVariesBy")) {
                i = 8;
             }
             break;
           case 0xd2a5d2e2:
             if (p0.equals("transformPivotX")) {
                i = 9;
             }
             break;
           case 0xd2a5d2e3:
             if (p0.equals("transformPivotY")) {
                i = 10;
             }
             break;
           case 0xfd990f7e:
             if (p0.equals("rotation")) {
                i = 11;
             }
             break;
           case 0xffbd2e5d:
             if (p0.equals("elevation")) {
                i = 12;
             }
             break;
           case 0x2382115:
             if (p0.equals("transitionPathRotate")) {
                i = 13;
             }
             break;
           case 0x589b15e:
             if (p0.equals("alpha")) {
                i = 14;
             }
             break;
           case 0x94e04ec:
             if (p0.equals("waveOffset")) {
                i = 15;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return new t$i();
           case 1:
             return new t$j();
           case 2:
             return new t$n();
           case 3:
             return new t$o();
           case 4:
             return new t$p();
           case 5:
             return new t$g();
           case 6:
             return new t$k();
           case 7:
             return new t$l();
           case 8:
             return new t$a();
           case 9:
             return new t$e();
           case 10:
             return new t$f();
           case 11:
             return new t$h();
           case 12:
             return new t$c();
           case 13:
             return new t$d();
           case 14:
             return new t$a();
           case 15:
             return new t$a();
           default:
             return null;
       }
    }
    public float a(float p0){
       return (float)this.a.c((double)p0, 0);
    }
    public float b(float p0){
       return (float)this.a.f((double)p0, 0);
    }
    public void e(int p0,float p1){
       t tb = this.b;
       if (tb.length < (this.d + 1)) {
          this.b = Arrays.copyOf(tb, (tb.length * 2));
          tb = this.c;
          this.c = Arrays.copyOf(tb, (tb.length * 2));
       }
       t td = this.d;
       this.b[td] = p0;
       p0[td] = p1;
       this.d = td + 1;
       return;
    }
    public abstract void f(View p0,float p1);
    public void g(String p0){
       this.e = p0;
    }
    public void h(int p0){
       t td = this.d;
       if (td == null) {
          return;
       }
       int i = 1;
       t$m.a(this.b, this.c, 0, (td - i));
       int i1 = 1;
       int i2 = 1;
       while (i1 < this.d) {
          t tb = this.b;
          int i3 = i1 - 1;
          if (tb[i3] != tb[i1]) {
             i2 = i2 + 1;
          }
          i1 = i1 + 1;
       }
       double[] uodoubleArra = new double[i2];
       int[] ointArray = new int[2];
       ointArray[i] = i;
       ointArray[0] = i2;
       double[][] uodoubleArra1 = Array.newInstance(double.class, ointArray);
       int i4 = 0;
       i = 0;
       while (i4 < this.d) {
          if (i4 > 0) {
             t tb1 = this.b;
             int i5 = i4 - 1;
             if (tb1[i4] == tb1[i5]) {
             label_0061 :
                i4 = i4 + 1;
             }
          }
          double d = (double)this.b[i4] * 0x3f847ae147ae147b;
          uodoubleArra[i] = d;
          uodoubleArra1[i][0] = (double)this.c[i4];
          i = i + 1;
          goto label_0061 ;
       }
       this.a = b.a(p0, uodoubleArra, uodoubleArra1);
       return;
    }
    public String toString(){
       t te = this.e;
       DecimalFormat uDecimalForm = new DecimalFormat("##.##");
       for (int i = 0; i < this.d; i = i + 1) {
          te = te+"["+this.b[i]+" , "+uDecimalForm.format((double)this.c[i])+"] ";
       }
       return te;
    }
}
