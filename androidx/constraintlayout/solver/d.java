package androidx.constraintlayout.solver.d;
import androidx.constraintlayout.solver.b;
import f1.a;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.d$b;
import java.lang.Object;
import java.util.Arrays;
import androidx.constraintlayout.solver.d$a;
import java.util.Comparator;
import androidx.constraintlayout.solver.c;
import androidx.constraintlayout.solver.b$a;
import java.lang.String;
import java.lang.StringBuilder;

public class d extends b	// class@000683
{
    public int g;
    public SolverVariable[] h;
    public SolverVariable[] i;
    public int j;
    public d$b k;
    public a l;

    public void d(a p0){
       super(p0);
       this.g = 128;
       SolverVariable[] solverVariab = new SolverVariable[128];
       this.h = solverVariab;
       SolverVariable[] solverVariab1 = new SolverVariable[128];
       this.i = solverVariab1;
       this.j = 0;
       this.k = new d$b(this, this);
       this.l = p0;
    }
    public final void E(SolverVariable p0){
       d th = this.h;
       if ((this.j + 1) > th.length) {
          SolverVariable[] solverVariab = Arrays.copyOf(th, (th.length * 2));
          this.h = solverVariab;
          this.i = Arrays.copyOf(solverVariab, (solverVariab.length * 2));
       }
       d th1 = this.h;
       th = this.j;
       th1[th] = p0;
       int i = th + 1;
       this.j = i;
       if (i > 1 && th1[(i - 1)].c > p0.c) {
          int i1 = 0;
          i = 0;
          d tj = this.j;
          while (i < tj) {
             this.i[i] = this.h[i];
             i = i + 1;
          }
          Arrays.sort(this.i, i1, tj, new d$a(this));
          for (; i1 < this.j; i1 = i1 + 1) {
             this.h[i1] = this.i[i1];
          }
       }
       p0.a = true;
       p0.a(this);
       return;
    }
    public final void F(SolverVariable p0){
       int i = 0;
       while (true) {
          if (i >= this.j) {
             return;
          }
          if (this.h[i] == p0) {
             d tj = this.j;
             int i1 = tj - 1;
             while (i < i1) {
                tj = this.h;
                i1 = i + 1;
                tj[i] = tj[i1];
                i = i1;
             }
             this.j = tj - 1;
             p0.a = false;
             return;
          }else {
             i = i + 1;
          }
       }
    }
    public void a(c p0,b p1,boolean p2){
       b a = p1.a;
       if (a == null) {
          return;
       }
       b e = p1.e;
       int currentSize = e.getCurrentSize();
       for (int i = 0; i < currentSize; i = i + 1) {
          SolverVariable solverVariab = e.g(i);
          float f = e.f(i);
          this.k.b(solverVariab);
          if (this.k.a(a, f)) {
             this.E(solverVariab);
          }
          float f1 = p1.b * f;
          float f2 = this.b + f1;
          this.b = f2;
       }
       this.F(a);
       return;
    }
    public void clear(){
       this.j = 0;
       this.b = 0;
    }
    public void e(SolverVariable p0){
       this.k.b(p0);
       this.k.e();
       p0.i[p0.e] = 0x3f800000;
       this.E(p0);
    }
    public SolverVariable f(c p0,boolean[] p1){
       d uod = -1;
       int i = 0;
       int i1 = -1;
       while (i < this.j) {
          object oobject = this.h[i];
          if (!p1[oobject.c]) {
             this.k.b(oobject);
             if (i1 == uod) {
                if (!this.k.c()) {
                label_002f :
                   i = i + 1;
                }
             }else if(this.k.d(this.h[i1])){
             }
             i1 = i;
             goto label_002f ;
          }
       }
       if (i1 == uod) {
          return null;
       }
       return this.h[i1];
    }
    public boolean isEmpty(){
       boolean b = (this.j == null)? true: false;
       return b;
    }
    public String toString(){
       String str = " goal -> \("+this.b+"\) : ";
       for (int i = 0; i < this.j; i = i + 1) {
          this.k.b(this.h[i]);
          str = str+this.k+" ";
       }
       return str;
    }
}
