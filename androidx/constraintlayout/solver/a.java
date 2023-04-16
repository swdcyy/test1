package androidx.constraintlayout.solver.a;
import androidx.constraintlayout.solver.b$a;
import androidx.constraintlayout.solver.b;
import f1.a;
import java.lang.Object;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.Arrays;
import java.lang.System;
import java.lang.String;
import java.io.PrintStream;
import java.lang.StringBuilder;

public class a implements b$a	// class@00067b
{
    public int a;
    public final b b;
    public final a c;
    public int d;
    public SolverVariable e;
    public int[] f;
    public int[] g;
    public float[] h;
    public int i;
    public int j;
    public boolean k;
    public static float l = 0.001000;

    public void a(b p0,a p1){
       super();
       this.a = 0;
       this.d = 8;
       this.e = null;
       int[] ointArray = new int[8];
       this.f = ointArray;
       ointArray = new int[8];
       this.g = ointArray;
       float[] uofloatArray = new float[8];
       this.h = uofloatArray;
       this.i = -1;
       this.j = -1;
       this.k = false;
       this.b = p0;
       this.c = p1;
    }
    public final float a(SolverVariable p0){
       a ti = this.i;
       int i = 0;
       while (true) {
          if (ti == -1 || i >= this.a) {
             return 0;
          }
          if (this.f[ti] == p0.c) {
             break ;
          }else {
             ti = this.g[ti];
             i = i + 1;
          }
       }
       return this.h[ti];
    }
    public final void b(SolverVariable p0,float p1){
       int i1;
       a tf;
       a tf1;
       a tf2;
       int i3;
       if (!p1) {
          this.c(p0, true);
          return;
       }else {
          a ti = this.i;
          int i = 0;
          if (ti == -1) {
             this.i = i;
             this.h[i] = p1;
             p1[i] = p0.c;
             p1[i] = -1;
             p0.m = p0.m + true;
             p0.a(this.b);
             this.a = this.a + true;
             if (this.k == null) {
                i1 = this.j + true;
                this.j = i1;
                tf = this.f;
                if (i1 >= tf.length) {
                   this.k = true;
                   this.j = tf.length - true;
                }
             }
             return;
          }else {
             int i2 = 0;
             a uoa = -1;
             while (true) {
                if (ti != -1 && i2 < this.a) {
                   tf1 = this.f;
                   SolverVariable c = p0.c;
                   if (tf1[ti] == c) {
                      p0[ti] = p1;
                      return;
                   }else if(tf1[ti] < c){
                      uoa = ti;
                   }
                   ti = this.g[ti];
                   i2 = i2 + 1;
                }else {
                   ti = this.j;
                   i2 = ti + 1;
                   if (this.k != null) {
                      tf2 = this.f;
                      if (tf2[ti] != -1) {
                         i3 = tf2.length;
                      }
                   }else {
                      i3 = i2;
                   }
                   tf2 = this.f;
                   if (ti >= tf2.length && this.a < tf2.length) {
                      i2 = 0;
                      tf1 = this.f;
                      while (i2 < tf1.length) {
                         if (tf1[i2] == -1) {
                            i3 = i2;
                         }
                         i2 = i2 + 1;
                      }
                   }
                   tf2 = this.f;
                   if (i3 >= tf2.length) {
                      i3 = tf2.length;
                      i2 = this.d * 2;
                      this.d = i2;
                      this.k = i;
                      this.j = i3 - 1;
                      this.h = Arrays.copyOf(this.h, i2);
                      this.f = Arrays.copyOf(this.f, this.d);
                      this.g = Arrays.copyOf(this.g, this.d);
                   }
                   this.f[i3] = p0.c;
                   this.h[i3] = p1;
                   if (uoa != -1) {
                      tf = this.g;
                      tf[i3] = tf[uoa];
                      tf[uoa] = i3;
                   }else {
                      p1[i3] = this.i;
                      this.i = i3;
                   }
                   p0.m = p0.m + true;
                   p0.a(this.b);
                   i1 = this.a + true;
                   this.a = i1;
                   if (this.k == null) {
                      this.j = this.j + true;
                   }
                   tf = this.f;
                   if (i1 >= tf.length) {
                      this.k = true;
                   }
                   if (this.j >= tf.length) {
                      this.k = true;
                      this.j = tf.length - true;
                      break ;
                   }
                   break ;
                }
             }
             return;
          }
       }
    }
    public final float c(SolverVariable p0,boolean p1){
       if (this.e == p0) {
          this.e = null;
       }
       a ti = this.i;
       float f = 0;
       if (ti == -1) {
          return f;
       }else {
          int i = 0;
          int i1 = -1;
          while (true) {
             if (ti == -1 || i >= this.a) {
                return f;
             }
             if (this.f[ti] == p0.c) {
                if (ti == this.i) {
                   this.i = this.g[ti];
                }else {
                   a tg = this.g;
                   tg[i1] = tg[ti];
                }
                if (p1) {
                   p0.c(this.b);
                }
                p0.m = p0.m - 1;
                this.a = this.a - 1;
                p0[ti] = -1;
                if (this.k != null) {
                   this.j = ti;
                   break ;
                }
                break ;
             }else {
                i = i + 1;
                i1 = ti;
                ti = this.g[ti];
             }
          }
          return this.h[ti];
       }
    }
    public final void clear(){
       a ti = this.i;
       int i = 0;
       a uoa = -1;
       while (ti != uoa && i < this.a) {
          object oobject = this.c.d[this.f[ti]];
          if (oobject != null) {
             oobject.c(this.b);
          }
          ti = this.g[ti];
          i = i + 1;
       }
       this.i = uoa;
       this.j = uoa;
       this.k = false;
       this.a = 0;
       return;
    }
    public void d(float p0){
       a ti = this.i;
       int i = 0;
       while (ti != -1 && i < this.a) {
          a th = this.h;
          float f = th[ti] / p0;
          th[ti] = f;
          ti = this.g[ti];
          i = i + 1;
       }
       return;
    }
    public void e(){
       a ta = this.a;
       System.out.print("{ ");
       int i = 0;
       while (i < ta) {
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
       a ti = this.i;
       int i = 0;
       while (true) {
          if (ti == -1 || i >= this.a) {
             return 0;
          }
          if (i == p0) {
             break ;
          }else {
             ti = this.g[ti];
             i = i + 1;
          }
       }
       return this.h[ti];
    }
    public SolverVariable g(int p0){
       a ti = this.i;
       int i = 0;
       while (true) {
          if (ti == -1 || i >= this.a) {
             return null;
          }
          if (i == p0) {
             break ;
          }else {
             ti = this.g[ti];
             i = i + 1;
          }
       }
       return this.c.d[this.f[ti]];
    }
    public int getCurrentSize(){
       return this.a;
    }
    public float h(b p0,boolean p1){
       float f = this.a(p0.a);
       this.c(p0.a, p1);
       p0 = p0.e;
       int currentSize = p0.getCurrentSize();
       for (int i = 0; i < currentSize; i = i + 1) {
          SolverVariable solverVariab = p0.g(i);
          float f1 = p0.a(solverVariab) * f;
          this.j(solverVariab, f1, p1);
       }
       return f;
    }
    public int i(SolverVariable p0){
       a ti = this.i;
       if (ti == -1) {
          return -1;
       }
       int i = 0;
       while (true) {
          if (ti == -1 || i >= this.a) {
             return -1;
          }
          if (this.f[ti] == p0.c) {
             break ;
          }else {
             ti = this.g[ti];
             i = i + 1;
          }
       }
       return ti;
    }
    public void invert(){
       a ti = this.i;
       int i = 0;
       while (ti != -1 && i < this.a) {
          a th = this.h;
          float f = th[ti] * 0xbf800000;
          th[ti] = f;
          ti = this.g[ti];
          i = i + 1;
       }
       return;
    }
    public void j(SolverVariable p0,float p1,boolean p2){
       a tf;
       float l = a.l;
       if (p1 - (- l) > 0 && p1 - l < 0) {
          return;
       }
       a ti = this.i;
       int i = 0;
       int i1 = -1;
       if (ti == i1) {
          this.i = i;
          p2[i] = p1;
          p1[i] = p0.c;
          p1[i] = i1;
          p0.m = p0.m + 1;
          p0.a(this.b);
          this.a = this.a + 1;
          if (this.k == null) {
             int i2 = this.j + 1;
             this.j = i2;
             tf = this.f;
             if (i2 >= tf.length) {
                this.k = true;
                this.j = tf.length - 1;
             }
          }
          return;
       }else {
          float f = 0;
          int i3 = -1;
          while (true) {
             if (ti != i1 && f < this.a) {
                a tf1 = this.f;
                SolverVariable c = p0.c;
                if (tf1[ti] == c) {
                   a th = this.h;
                   float f1 = th[ti] + p1;
                   p1 = a.l;
                   if (f1 - (- p1) > 0 && f1 - p1 < 0) {
                      f1 = 0;
                   }
                   th[ti] = f1;
                   if (!f1) {
                      if (ti == this.i) {
                         this.i = this.g[ti];
                      }else {
                         tf = this.g;
                         tf[i3] = tf[ti];
                      }
                      if (p2) {
                         p0.c(this.b);
                      }
                      if (this.k != null) {
                         this.j = ti;
                      }
                      p0.m = p0.m - 1;
                      this.a = this.a - 1;
                      break ;
                   }
                   break ;
                }else if(tf1[ti] < c){
                   i3 = ti;
                }
                ti = this.g[ti];
                f = f + 1;
             }else {
                a tj = this.j;
                int i4 = tj + 1;
                if (this.k != null) {
                   ti = this.f;
                   if (ti[tj] != i1) {
                      tj = ti.length;
                   }
                }else {
                   tj = i4;
                }
                ti = this.f;
                if (tj >= ti.length && this.a < ti.length) {
                   i4 = 0;
                   a tf2 = this.f;
                   while (i4 < tf2.length) {
                      if (tf2[i4] == i1) {
                         tj = i4;
                      }
                      i4 = i4 + 1;
                   }
                }
                ti = this.f;
                if (tj >= ti.length) {
                   tj = ti.length;
                   i4 = this.d * 2;
                   this.d = i4;
                   this.k = i;
                   this.j = tj - 1;
                   this.h = Arrays.copyOf(this.h, i4);
                   this.f = Arrays.copyOf(this.f, this.d);
                   this.g = Arrays.copyOf(this.g, this.d);
                }
                this.f[tj] = p0.c;
                this.h[tj] = p1;
                if (i3 != i1) {
                   tf = this.g;
                   tf[tj] = tf[i3];
                   tf[i3] = tj;
                }else {
                   p1[tj] = this.i;
                   this.i = tj;
                }
                p0.m = p0.m + 1;
                p0.a(this.b);
                this.a = this.a + 1;
                if (this.k == null) {
                   this.j = this.j + 1;
                }
                tf = this.f;
                if (this.j >= tf.length) {
                   this.k = true;
                   this.j = tf.length - 1;
                }
                return;
             }
          }
          return;
       }
    }
    public int k(){
       return ((((this.f.length * 4) * 3) + 0) + 36);
    }
    public boolean l(SolverVariable p0){
       a ti = this.i;
       if (ti == -1) {
          return false;
       }
       int i = 0;
       while (true) {
          if (ti == -1 || i >= this.a) {
             return false;
          }
          if (this.f[ti] == p0.c) {
             break ;
          }else {
             ti = this.g[ti];
             i = i + 1;
          }
       }
       return true;
    }
    public String toString(){
       a ti = this.i;
       String str = "";
       int i = 0;
       while (ti != -1 && i < this.a) {
          str = str+" -> "+this.h[ti]+" : "+this.c.d[this.f[ti]];
          ti = this.g[ti];
          i = i + 1;
       }
       return str;
    }
}
