package e1.i;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import e1.i$c;
import e1.i$b;
import e1.i$f;
import e1.i$e;
import e1.i$h;
import e1.i$l;
import e1.i$k;
import e1.i$g;
import e1.i$o;
import e1.i$n;
import e1.i$m;
import e1.i$j;
import e1.i$i;
import e1.i$d;
import e1.i$p;
import androidx.constraintlayout.widget.ConstraintAttribute;
import android.view.View;
import e1.i$a;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Class;
import java.lang.reflect.Array;
import java.util.Iterator;
import d1.b;
import java.text.DecimalFormat;
import java.lang.StringBuilder;

public abstract class i	// class@001e97
{
    public b a;
    public i$d b;
    public ConstraintAttribute c;
    public String d;
    public int e;
    public int f;
    public ArrayList g;

    public void i(){
       super();
       this.e = 0;
       this.f = 0;
       this.g = new ArrayList();
    }
    public static i c(String p0){
       if (p0.startsWith("CUSTOM")) {
          return new i$c();
       }
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
           case 0xfd990f7e:
             if (p0.equals("rotation")) {
                i = 9;
             }
             break;
           case 0xffbd2e5d:
             if (p0.equals("elevation")) {
                i = 10;
             }
             break;
           case 0x2382115:
             if (p0.equals("transitionPathRotate")) {
                i = 11;
             }
             break;
           case 0x589b15e:
             if (p0.equals("alpha")) {
                i = 12;
             }
             break;
           case 0x94e04ec:
             if (p0.equals("waveOffset")) {
                i = 13;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return new i$i();
           case 1:
             return new i$j();
           case 2:
             return new i$m();
           case 3:
             return new i$n();
           case 4:
             return new i$o();
           case 5:
             return new i$g();
           case 6:
             return new i$k();
           case 7:
             return new i$l();
           case 8:
             return new i$b();
           case 9:
             return new i$h();
           case 10:
             return new i$e();
           case 11:
             return new i$f();
           case 12:
             return new i$b();
           case 13:
             return new i$b();
           default:
             return null;
       }
    }
    public float a(float p0){
       return (float)this.b.b(p0);
    }
    public float b(float p0){
       return (float)this.b.a(p0);
    }
    public void d(int p0,int p1,int p2,float p3,float p4,float p5){
       this.g.add(new i$p(p0, p3, p4, p5));
       if (p2 != -1) {
          this.f = p2;
       }
       this.e = p1;
       return;
    }
    public void e(int p0,int p1,int p2,float p3,float p4,float p5,ConstraintAttribute p6){
       this.g.add(new i$p(p0, p3, p4, p5));
       if (p2 != -1) {
          this.f = p2;
       }
       this.e = p1;
       this.c = p6;
       return;
    }
    public abstract void f(View p0,float p1);
    public void g(String p0){
       this.d = p0;
    }
    public void h(float p0){
       i$p b;
       int i = this.g.size();
       if (!i) {
          return;
       }
       Collections.sort(this.g, new i$a(this));
       double[] uodoubleArra = new double[i];
       int[] ointArray = new int[]{i,2};
       double[][] uodoubleArra1 = Array.newInstance(double.class, ointArray);
       this.b = new i$d(this.e, this.f, i);
       Iterator iterator = this.g.iterator();
       int i1 = 0;
       while (iterator.hasNext()) {
          i$p op = iterator.next();
          i$p d = op.d;
          double d1 = (double)d * 0x3f847ae147ae147b;
          uodoubleArra[i1] = d1;
          b = op.b;
          uodoubleArra1[i1][0] = (double)b;
          i$p c = op.c;
          uodoubleArra1[i1][1] = (double)c;
          this.b.c(i1, op.a, d, c, b);
          i1 = i1 + 1;
       }
       this.b.d(p0);
       this.a = b.a(0, uodoubleArra, uodoubleArra1);
       return;
    }
    public boolean i(){
       boolean b = true;
       if (this.f == b) {
       }else {
          b = false;
       }
       return b;
    }
    public String toString(){
       i td = this.d;
       DecimalFormat uDecimalForm = new DecimalFormat("##.##");
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          i$p op = iterator.next();
          td = td+"["+op.a+" , "+uDecimalForm.format((double)op.b)+"] ";
       }
       return td;
    }
}
