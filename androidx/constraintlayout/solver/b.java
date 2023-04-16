package androidx.constraintlayout.solver.b;
import androidx.constraintlayout.solver.c$a;
import java.lang.Object;
import java.util.ArrayList;
import f1.a;
import androidx.constraintlayout.solver.a;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.b$a;
import java.lang.String;
import java.lang.StringBuilder;
import androidx.constraintlayout.solver.c;
import androidx.constraintlayout.solver.SolverVariable$Type;

public class b implements c$a	// class@00067d
{
    public SolverVariable a;
    public float b;
    public boolean c;
    public ArrayList d;
    public b$a e;
    public boolean f;

    public void b(){
       super();
       this.a = null;
       this.b = 0;
       this.c = false;
       this.d = new ArrayList();
       this.f = false;
    }
    public void b(a p0){
       super();
       this.a = null;
       this.b = 0;
       this.c = false;
       this.d = new ArrayList();
       this.f = false;
       this.e = new a(this, p0);
    }
    public void A(SolverVariable p0){
       b ta = this.a;
       if (ta != null) {
          this.e.b(ta, 0xbf800000);
          this.a.d = -1;
          this.a = null;
       }
       float f = this.e.c(p0, true) * 0xbf800000;
       this.a = p0;
       if (!f - 0x3f800000) {
          return;
       }else {
          this.b = this.b / f;
          this.e.d(f);
          return;
       }
    }
    public void B(){
       this.a = null;
       this.e.clear();
       this.b = 0;
       this.f = false;
    }
    public String C(){
       StringBuilder str1;
       String str = (this.a == null)? "0": this.a;
       str = str+" = ";
       int i = 0;
       if (this.b) {
          str = str+this.b;
          str1 = 1;
       }else {
          str1 = null;
       }
       int currentSize = this.e.getCurrentSize();
       while (i < currentSize) {
          SolverVariable solverVariab = this.e.g(i);
          if (solverVariab != null) {
             float f = this.e.f(i);
             if (v8 = f) {
                String str2 = solverVariab.toString();
                if (!str1) {
                   if (f < 0) {
                      str = str+"- ";
                   label_00a9 :
                      f = f * 0xbf800000;
                   }
                }else if(v8 > 0){
                   str = str+" + ";
                }else {
                   str = str+" - ";
                   goto label_00a9 ;
                }
                str = (!f - 0x3f800000)? str+str2: str+f+" "+str2;
                str1 = 1;
             }
          }
          i = i + 1;
       }
       if (str1 == null) {
          str = str+"0.0";
       }
       return str;
    }
    public void D(c p0,SolverVariable p1,boolean p2){
       if (p1.n == null) {
          return;
       }
       float f = this.e.a(p1);
       this.b = this.b + (p1.p * f);
       this.e.c(p1, p2);
       if (p2) {
          p1.c(this);
       }
       this.e.j(p0.n.d[p1.o], f, p2);
       if (c.t && !this.e.getCurrentSize()) {
          this.f = true;
          p0.a = true;
       }
       return;
    }
    public void a(c p0,b p1,boolean p2){
       this.b = this.b + (p1.b * this.e.h(p1, p2));
       if (p2) {
          p1.a.c(this);
       }
       if (c.t && (this.a != null && !this.e.getCurrentSize())) {
          this.f = true;
          p0.a = true;
       }
    label_002b :
       return;
    }
    public void b(c$a p0){
       if (p0 instanceof b) {
          this.a = null;
          this.e.clear();
          for (int i = 0; i < p0.e.getCurrentSize(); i = i + 1) {
             this.e.j(p0.e.g(i), p0.e.f(i), true);
          }
       }
       return;
    }
    public void c(c p0,SolverVariable p1,boolean p2){
       if (p1.g == null) {
          return;
       }
       this.b = this.b + (p1.f * this.e.a(p1));
       this.e.c(p1, p2);
       if (p2) {
          p1.c(this);
       }
       if (c.t && !this.e.getCurrentSize()) {
          this.f = true;
          p0.a = true;
       }
       return;
    }
    public void clear(){
       this.e.clear();
       this.a = null;
       this.b = 0;
    }
    public void d(c p0){
       SolverVariable solverVariab;
       if (!p0.g.length) {
          return;
       }
       int i = 0;
       boolean b = true;
       while (!i) {
          int currentSize = this.e.getCurrentSize();
          int i1 = 0;
          while (i1 < currentSize) {
             solverVariab = this.e.g(i1);
             if (solverVariab.d == -1 && (solverVariab.g != null || solverVariab.n != null)) {
                this.d.add(solverVariab);
             }
             i1 = i1 + 1;
          }
          currentSize = this.d.size();
          if (currentSize > 0) {
             i1 = 0;
             while (i1 < currentSize) {
                solverVariab = this.d.get(i1);
                if (solverVariab.g != null) {
                   this.c(p0, solverVariab, b);
                }else if(solverVariab.n != null){
                   this.D(p0, solverVariab, b);
                }else {
                   this.a(p0, p0.g[solverVariab.d], b);
                }
                i1 = i1 + 1;
             }
             this.d.clear();
          }else {
             i = 1;
          }
       }
       if (c.t && (this.a != null && !this.e.getCurrentSize())) {
          this.f = b;
          p0.a = b;
       }
       return;
    }
    public void e(SolverVariable p0){
       SolverVariable e = p0.e;
       float f = 0x3f800000;
       if (e == 1) {
       }else if(e == 2){
          f = 1000.00f;
       }else if(e == 3){
          f = 1000000.00f;
       }else if(e == 4){
          f = 1000000000.00f;
       }else if(e == 5){
          f = 999999995904.00f;
       }
       this.e.b(p0, f);
       return;
    }
    public SolverVariable f(c p0,boolean[] p1){
       return this.z(p1, null);
    }
    public b g(c p0,int p1){
       this.e.b(p0.o(p1, "ep"), 0x3f800000);
       this.e.b(p0.o(p1, "em"), 0xbf800000);
       return this;
    }
    public SolverVariable getKey(){
       return this.a;
    }
    public b h(SolverVariable p0,int p1){
       this.e.b(p0, (float)p1);
       return this;
    }
    public boolean i(c p0){
       boolean b;
       SolverVariable solverVariab = this.j(p0);
       if (solverVariab == null) {
          b = true;
       }else {
          this.A(solverVariab);
          b = false;
       }
       if (!this.e.getCurrentSize()) {
          this.f = true;
       }
       return b;
    }
    public boolean isEmpty(){
       boolean b = (this.a == null && (!this.b && !this.e.getCurrentSize()))? true: false;
       return b;
    }
    public SolverVariable j(c p0){
       boolean b1;
       int currentSize = this.e.getCurrentSize();
       boolean b = false;
       SolverVariable solverVariab = b;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       while (i < currentSize) {
          float f = this.e.f(i);
          SolverVariable solverVariab1 = this.e.g(i);
          if (solverVariab1.j == SolverVariable$Type.UNRESTRICTED) {
             if (b == null) {
                b = this.x(solverVariab1, p0);
             }else if(i3 - f > 0){
                b = this.x(solverVariab1, p0);
             }else if(!i1 && this.x(solverVariab1, p0)){
                i3 = f;
                b = solverVariab1;
                i1 = true;
             }
             i1 = b;
             i3 = f;
             b = solverVariab1;
          }else if(b == null && f < 0){
             if (solverVariab == null) {
                b1 = this.x(solverVariab1, p0);
             }else if(i4 - f > 0){
                b1 = this.x(solverVariab1, p0);
             }else if(!i2 && this.x(solverVariab1, p0)){
                i4 = f;
                solverVariab = solverVariab1;
                i2 = true;
             }
             i2 = b1;
             i4 = f;
             solverVariab = solverVariab1;
          }
       label_0067 :
          i = i + 1;
       }
       if (b != null) {
          return b;
       }
       return solverVariab;
    }
    public b k(SolverVariable p0,SolverVariable p1,int p2,float p3,SolverVariable p4,SolverVariable p5,int p6){
       float f = 0x3f800000;
       if (p1 == p4) {
          this.e.b(p0, f);
          this.e.b(p5, f);
          this.e.b(p1, -2.00f);
          return this;
       }else {
          float f1 = 0xbf800000;
          if (!p3 - 0x3f000000) {
             this.e.b(p0, f);
             this.e.b(p1, f1);
             this.e.b(p4, f1);
             this.e.b(p5, f);
             if (p2 > 0 || p6 > 0) {
                this.b = (float)((- p2) + p6);
             }
          }else if(p3 <= 0){
             this.e.b(p0, f1);
             this.e.b(p1, f);
             this.b = (float)p2;
          }else if(p3 - f >= 0){
             this.e.b(p5, f1);
             this.e.b(p4, f);
             this.b = (float)(- p6);
          }else {
             float f2 = f - p3;
             this.e.b(p0, (f2 * f));
             this.e.b(p1, (f2 * f1));
             this.e.b(p4, (f1 * p3));
             this.e.b(p5, (f * p3));
             if (p2 > 0 || p6 > 0) {
                this.b = ((float)(- p2) * f2) + ((float)p6 * p3);
             }
          }
          return this;
       }
    }
    public b l(SolverVariable p0,int p1){
       this.a = p0;
       float f = (float)p1;
       p0.f = f;
       this.b = f;
       this.f = true;
       return this;
    }
    public b m(SolverVariable p0,SolverVariable p1,float p2){
       this.e.b(p0, 0xbf800000);
       this.e.b(p1, p2);
       return this;
    }
    public b n(SolverVariable p0,SolverVariable p1,SolverVariable p2,SolverVariable p3,float p4){
       this.e.b(p0, 0xbf800000);
       this.e.b(p1, 0x3f800000);
       this.e.b(p2, p4);
       this.e.b(p3, (- p4));
       return this;
    }
    public b o(float p0,float p1,float p2,SolverVariable p3,SolverVariable p4,SolverVariable p5,SolverVariable p6){
       float f = 0;
       this.b = f;
       if (!p1 - f || !p0 - p2) {
          this.e.b(p3, 0x3f800000);
          this.e.b(p4, 0xbf800000);
          this.e.b(p6, 0x3f800000);
          this.e.b(p5, 0xbf800000);
       }else if(!p0 - f){
          this.e.b(p3, 0x3f800000);
          this.e.b(p4, 0xbf800000);
       }else if(!p2 - f){
          this.e.b(p5, 0x3f800000);
          this.e.b(p6, 0xbf800000);
       }else {
          p0 = (p0 / p1) / (p2 / p1);
          this.e.b(p3, 0x3f800000);
          this.e.b(p4, 0xbf800000);
          this.e.b(p6, p0);
          this.e.b(p5, (- p0));
       }
       return this;
    }
    public b p(SolverVariable p0,int p1){
       if (p1 < 0) {
          this.b = (float)(p1 * -1);
          this.e.b(p0, 0x3f800000);
       }else {
          this.b = (float)p1;
          this.e.b(p0, 0xbf800000);
       }
       return this;
    }
    public b q(SolverVariable p0,SolverVariable p1,int p2){
       b uob = null;
       if (p2) {
          if (p2 < 0) {
             p2 = p2 * -1;
             uob = 1;
          }
          this.b = (float)p2;
       }
       if (!uob) {
          this.e.b(p0, 0xbf800000);
          this.e.b(p1, 0x3f800000);
       }else {
          this.e.b(p0, 0x3f800000);
          this.e.b(p1, 0xbf800000);
       }
       return this;
    }
    public b r(SolverVariable p0,SolverVariable p1,SolverVariable p2,int p3){
       b uob = null;
       if (p3) {
          if (p3 < 0) {
             p3 = p3 * -1;
             uob = 1;
          }
          this.b = (float)p3;
       }
       if (!uob) {
          this.e.b(p0, 0xbf800000);
          this.e.b(p1, 0x3f800000);
          this.e.b(p2, 0x3f800000);
       }else {
          this.e.b(p0, 0x3f800000);
          this.e.b(p1, 0xbf800000);
          this.e.b(p2, 0xbf800000);
       }
       return this;
    }
    public b s(SolverVariable p0,SolverVariable p1,SolverVariable p2,int p3){
       b uob = null;
       if (p3) {
          if (p3 < 0) {
             p3 = p3 * -1;
             uob = 1;
          }
          this.b = (float)p3;
       }
       if (!uob) {
          this.e.b(p0, 0xbf800000);
          this.e.b(p1, 0x3f800000);
          this.e.b(p2, 0xbf800000);
       }else {
          this.e.b(p0, 0x3f800000);
          this.e.b(p1, 0xbf800000);
          this.e.b(p2, 0x3f800000);
       }
       return this;
    }
    public b t(SolverVariable p0,SolverVariable p1,SolverVariable p2,SolverVariable p3,float p4){
       this.e.b(p2, 0x3f000000);
       this.e.b(p3, 0x3f000000);
       this.e.b(p0, 0xbf000000);
       this.e.b(p1, 0xbf000000);
       this.b = - p4;
       return this;
    }
    public String toString(){
       return this.C();
    }
    public void u(){
       b tb = this.b;
       if (tb < 0) {
          this.b = tb * 0xbf800000;
          this.e.invert();
       }
       return;
    }
    public boolean v(){
       b ta = this.a;
       boolean b = (ta != null && (ta.j == SolverVariable$Type.UNRESTRICTED || this.b >= 0))? true: false;
       return b;
    }
    public boolean w(SolverVariable p0){
       return this.e.l(p0);
    }
    public final boolean x(SolverVariable p0,c p1){
       boolean b = true;
       if (p0.m <= b) {
       }else {
          b = false;
       }
       return b;
    }
    public SolverVariable y(SolverVariable p0){
       return this.z(null, p0);
    }
    public final SolverVariable z(boolean[] p0,SolverVariable p1){
       int currentSize = this.e.getCurrentSize();
       SolverVariable solverVariab = null;
       int i = 0;
       int i1 = 0;
       while (i < currentSize) {
          float f = this.e.f(i);
          if (f < 0) {
             SolverVariable solverVariab1 = this.e.g(i);
             if (p0 == null || (!p0[solverVariab1.c] && solverVariab1 != p1)) {
                SolverVariable j = solverVariab1.j;
                if (j == SolverVariable$Type.SLACK || (j == SolverVariable$Type.ERROR && f - i1 < 0)) {
                   i1 = f;
                   solverVariab = solverVariab1;
                }
             }
          }
          i = i + 1;
       }
       return solverVariab;
    }
}
