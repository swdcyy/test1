package i1.j;
import java.lang.Object;
import java.util.ArrayList;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.lang.String;
import androidx.constraintlayout.solver.c;
import java.util.Iterator;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.b;
import java.lang.Exception;
import i1.j$a;
import java.lang.StringBuilder;

public class j	// class@002162
{
    public ArrayList a;
    public int b;
    public boolean c;
    public int d;
    public ArrayList e;
    public int f;
    public static int g;

    public void j(int p0){
       super();
       this.a = new ArrayList();
       this.b = -1;
       this.c = false;
       this.d = 0;
       this.e = null;
       this.f = -1;
       int g = j.g;
       j.g = g + 1;
       this.b = g;
       this.d = p0;
    }
    public boolean a(ConstraintWidget p0){
       if (this.a.contains(p0)) {
          return false;
       }
       this.a.add(p0);
       return true;
    }
    public void b(ArrayList p0){
       int i = this.a.size();
       if (this.f != -1 && i > 0) {
          int i1 = 0;
          while (i1 < p0.size()) {
             j oj = p0.get(i1);
             if (this.f == oj.b) {
                this.g(this.d, oj);
             }
             i1 = i1 + 1;
          }
       }
       if (!i) {
          p0.remove(this);
       }
       return;
    }
    public int c(){
       return this.b;
    }
    public int d(){
       return this.d;
    }
    public final String e(){
       j td = this.d;
       if (td == null) {
          return "Horizontal";
       }
       if (td == 1) {
          return "Vertical";
       }
       if (td == 2) {
          return "Both";
       }
       return "Unknown";
    }
    public int f(c p0,int p1){
       if (!this.a.size()) {
          return 0;
       }
       return this.j(p0, this.a, p1);
    }
    public void g(int p0,j p1){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          ConstraintWidget uConstraintW = iterator.next();
          p1.a(uConstraintW);
          if (!p0) {
             uConstraintW.K0 = p1.c();
          }else {
             uConstraintW.L0 = p1.c();
          }
       }
       this.f = p1.b;
       return;
    }
    public void h(boolean p0){
       this.c = p0;
    }
    public void i(int p0){
       this.d = p0;
    }
    public final int j(c p0,ArrayList p1,int p2){
       int i2;
       int i = 0;
       d uod = p1.get(i).L();
       p0.D();
       uod.g(p0, i);
       for (int i1 = 0; i1 < p1.size(); i1 = i1 + 1) {
          p1.get(i1).g(p0, i);
       }
       if (!p2 && uod.Y0 > null) {
          b.b(uod, p0, p1, i);
       }
       i1 = 1;
       if (p2 == i1 && uod.Z0 > null) {
          b.b(uod, p0, p1, i1);
       }
       try{
          p0.z();
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       this.e = new ArrayList();
       for (; i < p1.size(); i = i + 1) {
          this.e.add(new j$a(this, p1.get(i), p0, p2));
       }
       if (!p2) {
          i2 = p0.x(uod.J);
          p2 = p0.x(uod.L);
          p0.D();
       }else {
          i2 = p0.x(uod.K);
          p2 = p0.x(uod.M);
          p0.D();
       }
       return (p2 - i2);
    }
    public String toString(){
       String str = this.e()+" ["+this.b+"] <";
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          str = str+" "+iterator.next().u();
       }
       return str+" >";
    }
}
