package androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.SolverVariable$Type;
import java.lang.String;
import java.lang.Object;
import androidx.constraintlayout.solver.b;
import java.util.Arrays;
import androidx.constraintlayout.solver.c;
import java.lang.StringBuilder;

public class SolverVariable	// class@00067a
{
    public boolean a;
    public String b;
    public int c;
    public int d;
    public int e;
    public float f;
    public boolean g;
    public float[] h;
    public float[] i;
    public SolverVariable$Type j;
    public b[] k;
    public int l;
    public int m;
    public boolean n;
    public int o;
    public float p;
    public HashSet q;
    public static int r = 1;
    public static int s = 1;
    public static int t = 1;
    public static int u = 1;
    public static int v = 1;

    public void SolverVariable(SolverVariable$Type p0,String p1){
       super();
       this.c = -1;
       this.d = -1;
       this.e = 0;
       this.g = false;
       float[] uofloatArray = new float[9];
       this.h = uofloatArray;
       float[] uofloatArray1 = new float[9];
       this.i = uofloatArray1;
       b[] uobArray = new b[16];
       this.k = uobArray;
       this.l = 0;
       this.m = 0;
       this.n = false;
       this.o = -1;
       this.p = 0;
       this.q = null;
       this.j = p0;
    }
    public static void b(){
       SolverVariable.s = SolverVariable.s + 1;
    }
    public final void a(b p0){
       SolverVariable tl;
       int i = 0;
       while (true) {
          tl = this.l;
          if (i < tl) {
             if (this.k[i] == p0) {
                return;
             }else {
                i = i + 1;
             }
          }else {
             SolverVariable tk = this.k;
             if (tl >= tk.length) {
                this.k = Arrays.copyOf(tk, (tk.length * 2));
                break ;
             }
             break ;
          }
       }
       tl = this.l;
       this.k[tl] = p0;
       this.l = tl + 1;
       return;
    }
    public final void c(b p0){
       SolverVariable tl = this.l;
       int i = 0;
       while (true) {
          if (i >= tl) {
             return;
          }
          if (this.k[i] == p0) {
             int i1 = tl - 1;
             while (i < i1) {
                SolverVariable tk = this.k;
                int i2 = i + 1;
                tk[i] = tk[i2];
                i = i2;
             }
             this.l = this.l - 1;
             return;
          }else {
             i = i + 1;
          }
       }
    }
    public void d(){
       String str = null;
       this.b = str;
       this.j = SolverVariable$Type.UNKNOWN;
       this.e = 0;
       this.c = -1;
       this.d = -1;
       this.f = 0;
       this.g = false;
       this.n = false;
       this.o = -1;
       this.p = 0;
       SolverVariable tl = this.l;
       for (int i = 0; i < tl; i = i + 1) {
          this.k[i] = str;
       }
       this.l = 0;
       this.m = 0;
       this.a = false;
       Arrays.fill(this.i, 0);
       return;
    }
    public void e(c p0,float p1){
       this.f = p1;
       this.g = true;
       this.n = false;
       this.o = -1;
       this.p = 0;
       SolverVariable tl = this.l;
       this.d = -1;
       for (int i = 0; i < tl; i = i + 1) {
          this.k[i].c(p0, this, false);
       }
       this.l = 0;
       return;
    }
    public void f(SolverVariable$Type p0,String p1){
       this.j = p0;
    }
    public final void g(c p0,b p1){
       SolverVariable tl = this.l;
       for (int i = 0; i < tl; i = i + 1) {
          this.k[i].a(p0, p1, false);
       }
       this.l = 0;
       return;
    }
    public String toString(){
       String str = "";
       String str1 = (this.b != null)? str+this.b: str+this.c;
       return str1;
    }
}
