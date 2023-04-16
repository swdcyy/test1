package androidx.constraintlayout.solver.d$b;
import java.lang.Comparable;
import androidx.constraintlayout.solver.d;
import java.lang.Object;
import androidx.constraintlayout.solver.SolverVariable;
import java.lang.Math;
import java.util.Arrays;
import java.lang.String;
import java.lang.StringBuilder;

public class d$b implements Comparable	// class@000682
{
    public SolverVariable b;
    public d c;
    public final d d;

    public void d$b(d p0,d p1){
       this.d = p0;
       super();
       this.c = p1;
    }
    public boolean a(SolverVariable p0,float p1){
       int i;
       boolean b = false;
       boolean b1 = true;
       if (this.b.a != null) {
          i = 0;
          while (i < 9) {
             SolverVariable i1 = this.b.i;
             float f = p0.i[i] * p1;
             float f1 = i1[i] + f;
             i1[i] = f1;
             if (Math.abs(i1[i]) - 0x38d1b717 < 0) {
                this.b.i[i] = 0;
             }else {
                b1 = 0;
             }
             i = i + 1;
          }
          if (b1) {
             this.d.F(this.b);
          }
          return b;
       }else {
          while (b < 9) {
             i = p0.i[b];
             if (i) {
                float f2 = i * p1;
                if (Math.abs(f2) - 0x38d1b717 < 0) {
                   f2 = 0;
                }
                this.b.i[b] = f2;
             }else {
                this.b.i[b] = 0;
             }
             b = b + 1;
          }
          return b1;
       }
    }
    public void b(SolverVariable p0){
       this.b = p0;
    }
    public final boolean c(){
       boolean b;
       int i = 8;
       while (true) {
          b = false;
          if (i < 0) {
             return b;
          }
          int i1 = this.b.i[i];
          if (i1 > 0) {
             break ;
          }else if(i1 < 0){
             return true;
          }else {
             i = i - 1;
          }
       }
       return b;
    }
    public int compareTo(Object p0){
       return (this.b.c - p0.c);
    }
    public final boolean d(SolverVariable p0){
       int i = 8;
       while (i >= 0) {
          int i1 = p0.i[i];
          int i2 = this.b.i[i];
          if (!i2 - i1) {
             i = i - 1;
          }else if(i2 - i1 < 0){
             return true;
          }else {
             break ;
          }
       }
       return false;
    }
    public void e(){
       Arrays.fill(this.b.i, 0);
    }
    public String toString(){
       String str = "[ ";
       if (this.b != null) {
          for (int i = 0; i < 9; i = i + 1) {
             str = str+this.b.i[i]+" ";
          }
       }
       return str+"] "+this.b;
    }
}
