package h1.b;
import h1.a;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.lang.Object;
import java.util.Arrays;
import androidx.constraintlayout.solver.widgets.d;
import java.util.ArrayList;
import i1.j;
import i1.g;
import java.util.HashMap;

public class b extends ConstraintWidget implements a	// class@0020c8
{
    public ConstraintWidget[] N0;
    public int O0;

    public void b(){
       super();
       ConstraintWidget[] uConstraintW = new ConstraintWidget[4];
       this.N0 = uConstraintW;
       this.O0 = 0;
    }
    public void a(){
       this.O0 = 0;
       Arrays.fill(this.N0, null);
    }
    public void b(d p0){
    }
    public void c(ConstraintWidget p0){
       if (p0 != this && p0 != null) {
          b tN0 = this.N0;
          if ((this.O0 + 1) > tN0.length) {
             this.N0 = Arrays.copyOf(tN0, (tN0.length * 2));
          }
          tN0 = this.O0;
          this.N0[tN0] = p0;
          this.O0 = tN0 + 1;
       }
       return;
    }
    public void e1(ArrayList p0,int p1,j p2){
       int i = 0;
       for (int i1 = 0; i1 < this.O0; i1 = i1 + 1) {
          p2.a(this.N0[i1]);
       }
       for (; i < this.O0; i = i + 1) {
          g.a(this.N0[i], p1, p0, p2);
       }
       return;
    }
    public int f1(int p0){
       ConstraintWidget k0;
       int i = 0;
       while (true) {
          if (i >= this.O0) {
             return -1;
          }
          object oobject = this.N0[i];
          if (!p0) {
             k0 = oobject.K0;
             if (k0 != -1) {
                break ;
             }
          }
          if (p0 == 1) {
             ConstraintWidget l0 = oobject.L0;
             if (l0 != -1) {
                return l0;
             }
          }
          i = i + 1;
       }
       return k0;
    }
    public void m(ConstraintWidget p0,HashMap p1){
       super.m(p0, p1);
       int i = 0;
       this.O0 = i;
       b o0 = p0.O0;
       for (; i < o0; i = i + 1) {
          this.c(p1.get(p0.N0[i]));
       }
       return;
    }
}
