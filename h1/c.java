package h1.c;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.lang.Object;
import f1.a;

public class c extends ConstraintWidget	// class@0020c9
{
    public ArrayList N0;

    public void c(){
       super();
       this.N0 = new ArrayList();
    }
    public void c(ConstraintWidget p0){
       this.N0.add(p0);
       if (p0.L() != null) {
          p0.L().g1(p0);
       }
       p0.Q0(this);
       return;
    }
    public ArrayList e1(){
       return this.N0;
    }
    public void f1(){
       c tN0 = this.N0;
       if (tN0 == null) {
          return;
       }
       int i = tN0.size();
       int i1 = 0;
       while (i1 < i) {
          ConstraintWidget uConstraintW = this.N0.get(i1);
          if (uConstraintW instanceof c) {
             uConstraintW.f1();
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void g1(ConstraintWidget p0){
       this.N0.remove(p0);
       p0.k0();
    }
    public void h1(){
       this.N0.clear();
    }
    public void k0(){
       this.N0.clear();
       super.k0();
    }
    public void n0(a p0){
       super.n0(p0);
       int i = this.N0.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.N0.get(i1).n0(p0);
       }
       return;
    }
}
