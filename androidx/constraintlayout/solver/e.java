package androidx.constraintlayout.solver.e;
import androidx.constraintlayout.solver.b$a;
import androidx.constraintlayout.solver.b;
import f1.a;
import java.lang.Object;
import androidx.constraintlayout.solver.SolverVariable;
import java.lang.System;
import java.lang.String;
import java.io.PrintStream;
import java.lang.StringBuilder;
import java.util.Arrays;

public class e implements b$a	// class@000684
{
    public final int a;
    public int b;
    public int c;
    public int[] d;
    public int[] e;
    public int[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int j;
    public int k;
    public final b l;
    public final a m;
    public static float n = 0.001000;

    public void e(b p0,a p1){
       super();
       this.a = -1;
       this.b = 16;
       this.c = 16;
       int[] ointArray = new int[16];
       this.d = ointArray;
       ointArray = new int[16];
       this.e = ointArray;
       ointArray = new int[16];
       this.f = ointArray;
       float[] uofloatArray = new float[16];
       this.g = uofloatArray;
       ointArray = new int[16];
       this.h = ointArray;
       int[] ointArray1 = new int[16];
       this.i = ointArray1;
       this.j = 0;
       this.k = -1;
       this.l = p0;
       this.m = p1;
       this.clear();
    }
    public float a(SolverVariable p0){
       int i = this.i(p0);
       if (i != -1) {
          return this.g[i];
       }
       return 0;
    }
    public void b(SolverVariable p0,float p1){
       float n = e.n;
       boolean b = true;
       if (p1 - (- n) > 0 && p1 - n < 0) {
          this.c(p0, b);
          return;
       }else {
          int i = 0;
          if (this.j == null) {
             this.n(i, p0, p1);
             this.m(p0, i);
             this.k = i;
          }else {
             int i1 = this.i(p0);
             if (i1 != -1) {
                p0[i1] = p1;
             }else if((this.j + b) >= this.b){
                this.p();
             }
             e tj = this.j;
             e tk = this.k;
             e uoe = -1;
             while (true) {
                if (i < tj) {
                   e tf = this.f;
                   SolverVariable c = p0.c;
                   if (tf[tk] == c) {
                      p0[tk] = p1;
                      return;
                   }else if(tf[tk] < c){
                      uoe = tk;
                   }
                   tk = this.i[tk];
                   if (tk == -1) {
                   label_0057 :
                      this.q(uoe, p0, p1);
                      break ;
                   }else {
                      i = i + 1;
                   }
                }else {
                   goto label_0057 ;
                }
             }
          }
          return;
       }
    }
    public float c(SolverVariable p0,boolean p1){
       e ti;
       int i = this.i(p0);
       int i1 = -1;
       if (i == i1) {
          return 0;
       }
       this.r(p0);
       int i2 = this.g[i];
       if (this.k == i) {
          this.k = this.i[i];
       }
       this.f[i] = i1;
       e th = this.h;
       if (th[i] != i1) {
          ti = this.i;
          ti[th[i]] = ti[i];
       }
       ti = this.i;
       if (ti[i] != i1) {
          th[ti[i]] = th[i];
       }
       this.j = this.j - 1;
       p0.m = p0.m - 1;
       if (p1) {
          p0.c(this.l);
       }
       return i2;
    }
    public void clear(){
       e tj = this.j;
       int i = 0;
       while (i < tj) {
          SolverVariable solverVariab = this.g(i);
          if (solverVariab != null) {
             solverVariab.c(this.l);
          }
          i = i + 1;
       }
       for (int i1 = 0; i1 < this.b; i1 = i1 + 1) {
          this.f[i1] = -1;
          this.e[i1] = -1;
       }
       for (i1 = 0; i1 < this.c; i1 = i1 + 1) {
          this.d[i1] = -1;
       }
       this.j = 0;
       this.k = -1;
       return;
    }
    public void d(float p0){
       e tj = this.j;
       e tk = this.k;
       int i = 0;
       while (i < tj) {
          e tg = this.g;
          float f = tg[tk] / p0;
          tg[tk] = f;
          if (this.i[tk] == -1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return;
    }
    public void e(){
       e tj = this.j;
       System.out.print("{ ");
       int i = 0;
       while (i < tj) {
          SolverVariable solverVariab = this.g(i);
          if (solverVariab != null) {
             System.out.print(solverVariab+" = "+this.f(i)+" ");
          }
          i = i + 1;
       }
       System.out.println(" }");
       return;
    }
    public float f(int p0){
       e tj = this.j;
       e tk = this.k;
       int i = 0;
       while (i < tj) {
          if (i == p0) {
             return this.g[tk];
          }
          tk = this.i[tk];
          if (tk == -1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return 0;
    }
    public SolverVariable g(int p0){
       e tj = this.j;
       if (tj == null) {
          return null;
       }
       e tk = this.k;
       int i = 0;
       while (i < tj) {
          if (i == p0 && tk != -1) {
             return this.m.d[this.f[tk]];
          }
          tk = this.i[tk];
          if (tk == -1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return null;
    }
    public int getCurrentSize(){
       return this.j;
    }
    public float h(b p0,boolean p1){
       float f = this.a(p0.a);
       this.c(p0.a, p1);
       p0 = p0.e;
       int currentSize = p0.getCurrentSize();
       int i = 0;
       int i1 = 0;
       while (i < currentSize) {
          e f1 = p0.f;
          if (f1[i1] != -1) {
             float f2 = p0.g[i1] * f;
             this.j(this.m.d[f1[i1]], f2, p1);
             i = i + 1;
          }
          i1 = i1 + 1;
       }
       return f;
    }
    public int i(SolverVariable p0){
       if (this.j != null && p0 != null) {
          p0 = p0.c;
          int i = this.d[(p0 % this.c)];
          if (i == -1) {
             return -1;
          }else if(this.f[i] == p0){
             return i;
          }else {
             e te = this.e;
             while (te[i] != -1 && this.f[te[i]] != p0) {
                i = te[i];
             }
             if (te[i] == -1) {
                return -1;
             }else if(this.f[te[i]] == p0){
                return te[i];
             }
          }
       }
       return -1;
    }
    public void invert(){
       e tj = this.j;
       e tk = this.k;
       int i = 0;
       while (i < tj) {
          e tg = this.g;
          float f = tg[tk] * 0xbf800000;
          tg[tk] = f;
          if (this.i[tk] == -1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return;
    }
    public void j(SolverVariable p0,float p1,boolean p2){
       float n = e.n;
       if (p1 - (- n) > 0 && p1 - n < 0) {
          return;
       }
       int i = this.i(p0);
       if (i == -1) {
          this.b(p0, p1);
       }else {
          e tg = this.g;
          tg[i] = tg[i] + p1;
          float n1 = e.n;
          if (tg[i] - (- n1) > 0 && tg[i] - n1 < 0) {
             tg[i] = 0;
             this.c(p0, p2);
          }
       }
       return;
    }
    public int k(){
       return 0;
    }
    public boolean l(SolverVariable p0){
       boolean b = (this.i(p0) != -1)? true: false;
       return b;
    }
    public final void m(SolverVariable p0,int p1){
       int i = p0.c % this.c;
       e td = this.d;
       int i1 = td[i];
       if (i1 == -1) {
          td[i] = p1;
       }else {
          e te = this.e;
          while (te[i1] != -1) {
             i1 = te[i1];
          }
          te[i1] = p1;
       }
       i[p1] = -1;
       return;
    }
    public final void n(int p0,SolverVariable p1,float p2){
       this.f[p0] = p1.c;
       this.g[p0] = p2;
       p2[p0] = -1;
       p2[p0] = -1;
       p1.a(this.l);
       p1.m = p1.m + 1;
       this.j = this.j + 1;
    }
    public final int o(){
       int i = 0;
       while (true) {
          if (i >= this.b) {
             return -1;
          }
          if (this.f[i] == -1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public final void p(){
       int i = this.b * 2;
       this.f = Arrays.copyOf(this.f, i);
       this.g = Arrays.copyOf(this.g, i);
       this.h = Arrays.copyOf(this.h, i);
       this.i = Arrays.copyOf(this.i, i);
       this.e = Arrays.copyOf(this.e, i);
       for (e tb = this.b; tb < i; tb = tb + 1) {
          this.f[tb] = -1;
          this.e[tb] = -1;
       }
       this.b = i;
       return;
    }
    public final void q(int p0,SolverVariable p1,float p2){
       int i = this.o();
       this.n(i, p1, p2);
       int i1 = -1;
       if (p0 != i1) {
          this.h[i] = p0;
          e ti = this.i;
          ti[i] = ti[p0];
          ti[p0] = i;
       }else {
          p0[i] = i1;
          if (this.j > null) {
             p0[i] = this.k;
             this.k = i;
          }else {
             p0[i] = i1;
          }
       }
       e ti1 = this.i;
       if (ti1[i] != i1) {
          i1[ti1[i]] = i;
       }
       this.m(p1, i);
       return;
    }
    public final void r(SolverVariable p0){
       p0 = p0.c;
       int i = p0 % this.c;
       e td = this.d;
       int i1 = td[i];
       if (i1 == -1) {
          return;
       }
       if (this.f[i1] == p0) {
          e te = this.e;
          td[i] = te[i1];
          te[i1] = -1;
       }else {
          e te1 = this.e;
          while (te1[i1] != -1 && this.f[te1[i1]] != p0) {
             i1 = te1[i1];
          }
          int i2 = te1[i1];
          if (i2 != -1 && this.f[i2] == p0) {
             te1[i1] = te1[i2];
             te1[i2] = -1;
          }
       }
       return;
    }
    public String toString(){
       String str = this.hashCode()+" { ";
       e tj = this.j;
       int i = 0;
       while (i < tj) {
          SolverVariable solverVariab = this.g(i);
          if (solverVariab != null) {
             int i1 = this.i(solverVariab);
             str = str+solverVariab+" = "+this.f(i)+" "+"[p: ";
             String str1 = "none";
             e uoe = -1;
             str = (this.h[i1] != uoe)? str+this.m.d[this.f[this.h[i1]]]: str+str1;
             str = str+", n: ";
             str = (this.i[i1] != uoe)? str+this.m.d[this.f[this.i[i1]]]: str+str1;
             str = str+"]";
          }
          i = i + 1;
       }
       return str+" }";
    }
}
