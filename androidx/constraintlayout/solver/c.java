package androidx.constraintlayout.solver.c;
import java.lang.Object;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.b;
import f1.a;
import androidx.constraintlayout.solver.d;
import androidx.constraintlayout.solver.c$b;
import f1.b;
import androidx.constraintlayout.solver.c$a;
import java.lang.Math;
import androidx.constraintlayout.solver.SolverVariable$Type;
import androidx.constraintlayout.solver.b$a;
import f1.c;
import java.util.Arrays;
import java.util.HashMap;
import java.lang.String;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.lang.System;
import java.io.PrintStream;

public class c	// class@000680
{
    public boolean a;
    public int b;
    public HashMap c;
    public c$a d;
    public int e;
    public int f;
    public b[] g;
    public boolean h;
    public boolean i;
    public boolean[] j;
    public int k;
    public int l;
    public int m;
    public final a n;
    public SolverVariable[] o;
    public int p;
    public c$a q;
    public static long A = 0x0;
    public static boolean r = false;
    public static boolean s = true;
    public static boolean t = false;
    public static boolean u;
    public static boolean v;
    public static boolean w;
    public static int x;
    public static b y;
    public static long z;

    public void c(){
       super();
       this.a = false;
       this.b = 0;
       this.c = null;
       this.e = 32;
       this.f = 32;
       this.g = null;
       this.h = false;
       this.i = false;
       boolean[] uobooleanArr = new boolean[32];
       this.j = uobooleanArr;
       this.k = 1;
       this.l = 0;
       this.m = 32;
       SolverVariable[] solverVariab = new SolverVariable[c.x];
       this.o = solverVariab;
       this.p = 0;
       b[] uobArray = new b[32];
       this.g = uobArray;
       this.C();
       a uoa = new a();
       this.n = uoa;
       this.d = new d(uoa);
       this.q = (c.w)? new c$b(this, uoa): new b(uoa);
       return;
    }
    public static b s(c p0,SolverVariable p1,SolverVariable p2,float p3){
       b uob = p0.r();
       uob.m(p1, p2, p3);
       return uob;
    }
    public static b w(){
       return c.y;
    }
    public void A(c$a p0){
       b y = c.y;
       if (y != null) {
          y.z = y.z + 1;
          y.A = Math.max(y.A, (long)this.k);
          y = c.y;
          y.B = Math.max(y.B, (long)this.l);
       }
       this.u(p0);
       this.B(p0, false);
       this.n();
       return;
    }
    public final int B(c$a p0,boolean p1){
       SolverVariable c;
       b y = c.y;
       if (y != null) {
          y.l = y.l + 1;
       }
       for (int i = 0; i < this.k; i = i + 1) {
          this.j[i] = false;
       }
       i = 0;
       int i1 = 0;
       while (true) {
          if (i) {
             return i1;
          }
          b y1 = c.y;
          if (y1 != null) {
             long l = y1.m + 1;
             y1.m = l;
          }
          i1 = i1 + 1;
          int i2 = this.k * 2;
          if (i1 >= i2) {
             break ;
          }else {
             boolean b = true;
             if (p0.getKey() != null) {
                this.j[p0.getKey().c] = b;
             }
             SolverVariable solverVariab = p0.f(this, this.j);
             if (solverVariab != null) {
                c tj = this.j;
                c = solverVariab.c;
                if (tj[c]) {
                   return i1;
                }else {
                   tj[c] = b;
                }
             }
             if (solverVariab != null) {
                c uoc = Float.MAX_VALUE;
                int i3 = -1;
                int i4 = 0;
                int i5 = -1;
                while (i4 < this.l) {
                   object oobject = this.g[i4];
                   if (oobject.a.j == SolverVariable$Type.UNRESTRICTED || (oobject.f == null && oobject.w(solverVariab))) {
                      float f = oobject.e.a(solverVariab);
                      if (f < 0) {
                         float f1 = - oobject.b;
                         f1 = f1 / f;
                         if (f1 - uoc < 0) {
                            i5 = i4;
                            uoc = f1;
                         }
                      }
                   }
                   i4 = i4 + 1;
                }
                if (i5 > i3) {
                   object oobject1 = this.g[i5];
                   oobject1.a.d = i3;
                   b y2 = c.y;
                   if (y2 != null) {
                      long l1 = y2.n + 1;
                      y2.n = l1;
                   }
                   oobject1.A(solverVariab);
                   y1 = oobject1.a;
                   y1.d = i5;
                   y1.g(this, oobject1);
                }
             }else {
                i = 1;
             }
          }
       }
       return i1;
    }
    public final void C(){
       int i;
       object oobject;
       if (c.w) {
          for (i = 0; i < this.l; i = i + 1) {
             oobject = this.g[i];
             if (oobject != null) {
                this.n.a.a(oobject);
             }
             this.g[i] = null;
          }
       }else {
          for (; i < this.l; i = i + 1) {
             oobject = this.g[i];
             if (oobject != null) {
                this.n.b.a(oobject);
             }
             this.g[i] = null;
          }
       }
       return;
    }
    public void D(){
       int i = 0;
       int i1 = 0;
       c tn = this.n;
       a d = tn.d;
       while (i1 < d.length) {
          object oobject = d[i1];
          if (oobject != null) {
             oobject.d();
          }
          i1 = i1 + 1;
       }
       tn.c.r(this.o, this.p);
       this.p = i;
       Arrays.fill(this.n.d, null);
       c tc = this.c;
       if (tc != null) {
          tc.clear();
       }
       this.b = i;
       this.d.clear();
       this.k = 1;
       i1 = 0;
       while (i1 < this.l) {
          tn = this.g;
          if (tn[i1] != null) {
             tn[i1].c = i;
          }
          i1 = i1 + 1;
       }
       this.C();
       this.l = i;
       this.q = (c.w)? new c$b(this, this.n): new b(this.n);
       return;
    }
    public final SolverVariable a(SolverVariable$Type p0,String p1){
       SolverVariable solverVariab = this.n.c.q();
       if (solverVariab == null) {
          solverVariab = new SolverVariable(p0, p1);
          solverVariab.f(p0, p1);
       }else {
          solverVariab.d();
          solverVariab.f(p0, p1);
       }
       int x = c.x;
       if (this.p >= x) {
          x = x * 2;
          c.x = x;
          this.o = Arrays.copyOf(this.o, x);
       }
       c tp = this.p;
       this.p = tp + 1;
       p0[tp] = solverVariab;
       return solverVariab;
    }
    public void b(ConstraintWidget p0,ConstraintWidget p1,float p2,int p3){
       c uoc = this;
       ConstraintWidget uConstraintW = p0;
       ConstraintWidget uConstraintW1 = p1;
       ConstraintAnchor$Type lEFT = ConstraintAnchor$Type.LEFT;
       ConstraintAnchor$Type tOP = ConstraintAnchor$Type.TOP;
       ConstraintAnchor$Type rIGHT = ConstraintAnchor$Type.RIGHT;
       ConstraintAnchor$Type bOTTOM = ConstraintAnchor$Type.BOTTOM;
       b uob = this.r();
       double d = (double)p2;
       double d1 = (double)p3;
       uob.t(uoc.q(uConstraintW.p(tOP)), uoc.q(uConstraintW.p(bOTTOM)), uoc.q(uConstraintW1.p(tOP)), uoc.q(uConstraintW1.p(bOTTOM)), (float)(Math.sin(d) * d1));
       uoc.d(uob);
       uob = this.r();
       uob.t(uoc.q(uConstraintW.p(lEFT)), uoc.q(uConstraintW.p(rIGHT)), uoc.q(uConstraintW1.p(lEFT)), uoc.q(uConstraintW1.p(rIGHT)), (float)(Math.cos(d) * d1));
       uoc.d(uob);
    }
    public void c(SolverVariable p0,SolverVariable p1,int p2,float p3,SolverVariable p4,SolverVariable p5,int p6,int p7){
       int i = p7;
       b uob = this.r();
       uob.k(p0, p1, p2, p3, p4, p5, p6);
       if (i != 8) {
          uob.g(this, i);
       }
       this.d(uob);
       return;
    }
    public void d(b p0){
       b y = c.y;
       if (y != null) {
          y.j = y.j + 1;
          if (p0.f != null) {
             y.k = y.k + 1;
          }
       }
       int i = 1;
       if ((this.l + i) >= this.m || (this.k + i) >= this.f) {
          this.y();
       }
       c uoc = null;
       if (p0.f == null) {
          p0.d(this);
          if (p0.isEmpty()) {
             return;
          }else {
             p0.u();
             if (p0.i(this)) {
                SolverVariable solverVariab = this.p();
                p0.a = solverVariab;
                this.l(p0);
                if (this.l == (this.l + i)) {
                   this.q.b(p0);
                   this.B(this.q, i);
                   if (solverVariab.d == -1) {
                      if (p0.a == solverVariab) {
                         solverVariab = p0.y(solverVariab);
                         if (solverVariab != null) {
                            b y1 = c.y;
                            if (y1 != null) {
                               y1.n = y1.n + 1;
                            }
                            p0.A(solverVariab);
                         }
                      }
                      if (p0.f == null) {
                         p0.a.g(this, p0);
                      }
                      if (c.w) {
                         this.n.a.a(p0);
                      }else {
                         this.n.b.a(p0);
                      }
                      this.l = this.l - i;
                   }
                }else {
                label_0095 :
                   i = 0;
                }
             }else {
                goto label_0095 ;
             }
             if (!p0.v()) {
                return;
             }else {
                uoc = i;
             }
          }
       }
       if (!uoc) {
          this.l(p0);
       }
       return;
    }
    public b e(SolverVariable p0,SolverVariable p1,int p2,int p3){
       if (c.s && (p3 == 8 && (p1.g != null && p0.d == -1))) {
          p0.e(this, (p1.f + (float)p2));
          return null;
       }else {
          b uob = this.r();
          uob.q(p0, p1, p2);
          if (p3 != 8) {
             uob.g(this, p3);
          }
          this.d(uob);
          return uob;
       }
    }
    public void f(SolverVariable p0,int p1){
       b uob;
       c uoc = -1;
       if (c.s && p0.d == uoc) {
          float f = (float)p1;
          p0.e(this, f);
          int i = 0;
          int i1 = this.b + 1;
          while (i < i1) {
             object oobject = this.n.d[i];
             if (oobject != null && (oobject.n != null && oobject.o == p0.c)) {
                float f1 = oobject.p + f;
                oobject.e(this, f1);
             }
          label_002c :
             i = i + 1;
          }
          return;
       }else {
          SolverVariable d = p0.d;
          if (d != uoc) {
             object oobject1 = this.g[d];
             if (oobject1.f != null) {
                oobject1.b = (float)p1;
             }else if(!oobject1.e.getCurrentSize()){
                oobject1.f = true;
                oobject1.b = (float)p1;
             }else {
                uob = this.r();
                uob.p(p0, p1);
                this.d(uob);
             }
          }else {
             uob = this.r();
             uob.l(p0, p1);
             this.d(uob);
          }
          return;
       }
    }
    public void g(SolverVariable p0,SolverVariable p1,int p2,boolean p3){
       b uob = this.r();
       SolverVariable solverVariab = this.t();
       solverVariab.e = 0;
       uob.r(p0, p1, solverVariab, p2);
       this.d(uob);
    }
    public void h(SolverVariable p0,SolverVariable p1,int p2,int p3){
       b uob = this.r();
       SolverVariable solverVariab = this.t();
       solverVariab.e = 0;
       uob.r(p0, p1, solverVariab, p2);
       if (p3 != 8) {
          this.m(uob, (int)(uob.e.a(solverVariab) * 0xbf800000), p3);
       }
       this.d(uob);
       return;
    }
    public void i(SolverVariable p0,SolverVariable p1,int p2,boolean p3){
       b uob = this.r();
       SolverVariable solverVariab = this.t();
       solverVariab.e = 0;
       uob.s(p0, p1, solverVariab, p2);
       this.d(uob);
    }
    public void j(SolverVariable p0,SolverVariable p1,int p2,int p3){
       b uob = this.r();
       SolverVariable solverVariab = this.t();
       solverVariab.e = 0;
       uob.s(p0, p1, solverVariab, p2);
       if (p3 != 8) {
          this.m(uob, (int)(uob.e.a(solverVariab) * 0xbf800000), p3);
       }
       this.d(uob);
       return;
    }
    public void k(SolverVariable p0,SolverVariable p1,SolverVariable p2,SolverVariable p3,float p4,int p5){
       b uob = this.r();
       uob.n(p0, p1, p2, p3, p4);
       if (p5 != 8) {
          uob.g(this, p5);
       }
       this.d(uob);
       return;
    }
    public final void l(b p0){
       c tg;
       int i3;
       if (c.t && p0.f != null) {
          p0.a.e(this, p0.b);
       }else {
          tg = this.l;
          this.g[tg] = p0;
          b a = p0.a;
          a.d = tg;
          this.l = tg + 1;
          a.g(this, p0);
       }
       if (c.t && this.a != null) {
          int i = 0;
          while (i < this.l) {
             if (this.g[i] == null) {
                System.out.println("WTF");
             }
             tg = this.g;
             if (tg[i] != null && tg[i].f != null) {
                object oobject = tg[i];
                oobject.a.e(this, oobject.b);
                if (c.w) {
                   this.n.a.a(oobject);
                }else {
                   this.n.b.a(oobject);
                }
                object oobject1 = null;
                this.g[i] = oobject1;
                int i1 = i + 1;
                int i2 = i1;
                c tl = this.l;
                while (i1 < tl) {
                   c tg1 = this.g;
                   i3 = i1 - 1;
                   tg1[i3] = tg1[i1];
                   if (tg1[i3].a.d == i1) {
                      tg1[i3].a.d = i3;
                   }
                   i2 = i1 + 1;
                   int i4 = i2;
                   i2 = i1;
                   i1 = i4;
                }
                if (i2 < tl) {
                   this.g[i2] = oobject1;
                }
                i3 = tl - 1;
                this.l = i3;
                i = i - 1;
             }
             i = i + 1;
          }
          this.a = false;
       }
       return;
    }
    public void m(b p0,int p1,int p2){
       p0.h(this.o(p2, null), p1);
    }
    public final void n(){
       for (int i = 0; i < this.l; i = i + 1) {
          object oobject = this.g[i];
          oobject.a.f = oobject.b;
       }
       return;
    }
    public SolverVariable o(int p0,String p1){
       b y = c.y;
       if (y != null) {
          y.q = y.q + 1;
       }
       if ((this.k + 1) >= this.f) {
          this.y();
       }
       SolverVariable solverVariab = this.a(SolverVariable$Type.ERROR, p1);
       int i = this.b + 1;
       this.b = i;
       this.k = this.k + 1;
       solverVariab.c = i;
       solverVariab.e = p0;
       p0[i] = solverVariab;
       this.d.e(solverVariab);
       return solverVariab;
    }
    public SolverVariable p(){
       b y = c.y;
       if (y != null) {
          y.s = y.s + 1;
       }
       if ((this.k + 1) >= this.f) {
          this.y();
       }
       SolverVariable solverVariab = this.a(SolverVariable$Type.SLACK, null);
       int i = this.b + 1;
       this.b = i;
       this.k = this.k + 1;
       solverVariab.c = i;
       this.n.d[i] = solverVariab;
       return solverVariab;
    }
    public SolverVariable q(Object p0){
       SolverVariable solverVariab = null;
       if (p0 == null) {
          return solverVariab;
       }
       if ((this.k + 1) >= this.f) {
          this.y();
       }
       if (p0 instanceof ConstraintAnchor) {
          solverVariab = p0.i();
          if (solverVariab == null) {
             p0.s(this.n);
             solverVariab = p0.i();
          }
          p0 = solverVariab.c;
          c uoc = -1;
          if (p0 != uoc && (p0 > this.b || this.n.d[p0] == null)) {
             if (p0 != uoc) {
                solverVariab.d();
             }
             int i = this.b + 1;
             this.b = i;
             this.k = this.k + 1;
             solverVariab.c = i;
             solverVariab.j = SolverVariable$Type.UNRESTRICTED;
             this.n.d[i] = solverVariab;
          }
       }
       return solverVariab;
    }
    public b r(){
       b uob;
       if (c.w) {
          uob = this.n.a.q();
          if (uob == null) {
             uob = new c$b(this, this.n);
             c.A = c.A + 1;
          }else {
             uob.B();
          }
       }else {
          uob = this.n.b.q();
          if (uob == null) {
             uob = new b(this.n);
             c.z = c.z + 1;
          }else {
             uob.B();
          }
       }
       SolverVariable.b();
       return uob;
    }
    public SolverVariable t(){
       b y = c.y;
       if (y != null) {
          y.r = y.r + 1;
       }
       if ((this.k + 1) >= this.f) {
          this.y();
       }
       SolverVariable solverVariab = this.a(SolverVariable$Type.SLACK, null);
       int i = this.b + 1;
       this.b = i;
       this.k = this.k + 1;
       solverVariab.c = i;
       this.n.d[i] = solverVariab;
       return solverVariab;
    }
    public final int u(c$a p0){
       int currentSize;
       int i6;
       float f1;
       float f2;
       object oobject1;
       c uoc = this;
       int i = 0;
       while (true) {
          if (i < uoc.l) {
             c g = uoc.g;
             if (g[i].a.j != SolverVariable$Type.UNRESTRICTED && g[i].b < 0) {
                i = 1;
             label_0023 :
                if (i) {
                   i = 0;
                   int i1 = 0;
                   while (!i) {
                      b y = c.y;
                      long l = 1;
                      if (y != null) {
                         long l1 = y.o + l;
                         y.o = l1;
                      }
                      i1 = i1 + 1;
                      y = Float.MAX_VALUE;
                      int i2 = 0;
                      int i3 = -1;
                      SolverVariable solverVariab = -1;
                      int i4 = 0;
                      while (i2 < uoc.l) {
                         object oobject = uoc.g[i2];
                         if (oobject.a.j == SolverVariable$Type.UNRESTRICTED || (oobject.f == null && oobject.b < 0)) {
                            SolverVariable solverVariab1 = 9;
                            if (c.v) {
                               currentSize = oobject.e.getCurrentSize();
                               int i5 = 0;
                               while (i5 < currentSize) {
                                  SolverVariable solverVariab2 = oobject.e.g(i5);
                                  float f = oobject.e.a(solverVariab2);
                                  if (f > 0) {
                                     i6 = 0;
                                     while (i6 < solverVariab1) {
                                        f1 = solverVariab2.h[i6] / f;
                                        if (f1 - y >= 0 || (i6 == i4 || i6 > i4)) {
                                           solverVariab = solverVariab2.c;
                                           i4 = i6;
                                           i3 = i2;
                                           f2 = f1;
                                        }
                                        i6 = i6 + 1;
                                        solverVariab1 = 9;
                                     }
                                  }
                                  i5 = i5 + 1;
                                  solverVariab1 = 9;
                               }
                            }else {
                               currentSize = 1;
                               while (currentSize < uoc.k) {
                                  oobject1 = uoc.n.d[currentSize];
                                  float f3 = oobject.e.a(oobject1);
                                  if (f3 <= 0) {
                                     i6 = 9;
                                  }else {
                                     int i7 = 0;
                                     i6 = 9;
                                     while (i7 < i6) {
                                        f1 = oobject1.h[i7] / f3;
                                        if (f1 - y >= 0 || (i7 == i4 || i7 > i4)) {
                                           solverVariab = currentSize;
                                           i4 = i7;
                                           i3 = i2;
                                           f2 = f1;
                                        }
                                        i7 = i7 + 1;
                                     }
                                  }
                                  currentSize = currentSize + 1;
                               }
                            }
                         }
                         i2 = i2 + 1;
                         b uob = 1;
                      }
                      currentSize = -1;
                      if (i3 != currentSize) {
                         oobject1 = uoc.g[i3];
                         oobject1.a.d = currentSize;
                         b y1 = c.y;
                         if (y1 != null) {
                            long l2 = y1.n + 1;
                            y1.n = l2;
                         }
                         oobject1.A(uoc.n.d[solverVariab]);
                         y1 = oobject1.a;
                         y1.d = i3;
                         y1.g(uoc, oobject1);
                      }else {
                         i = 1;
                      }
                      currentSize = uoc.k / 2;
                      if (i1 > currentSize) {
                         i = 1;
                      }else {
                         continue ;
                      }
                   }
                   currentSize = i1;
                }else {
                   currentSize = 0;
                   break ;
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             i = 0;
             goto label_0023 ;
          }
       }
       return currentSize;
    }
    public a v(){
       return this.n;
    }
    public int x(Object p0){
       p0 = p0.i();
       if (p0 != null) {
          return (int)(p0.f + 0x3f000000);
       }
       return 0;
    }
    public final void y(){
       int i = this.e * 2;
       this.e = i;
       this.g = Arrays.copyOf(this.g, i);
       c tn = this.n;
       tn.d = Arrays.copyOf(tn.d, this.e);
       tn = this.e;
       boolean[] uobooleanArr = new boolean[tn];
       this.j = uobooleanArr;
       this.f = tn;
       this.m = tn;
       b y = c.y;
       if (y != null) {
          y.h = y.h + 1;
          y.t = Math.max(y.t, (long)tn);
          b y1 = c.y;
          y1.J = y1.t;
       }
       return;
    }
    public void z(){
       b y = c.y;
       if (y != null) {
          y.i = y.i + 1;
       }
       if (this.d.isEmpty()) {
          this.n();
          return;
       }else if(this.h != null || this.i != null){
          y = c.y;
          if (y != null) {
             y.v = y.v + 1;
          }
          c uoc = null;
          int i = 0;
          while (true) {
             if (i < this.l) {
                if (this.g[i].f == null) {
                label_0042 :
                   if (!uoc) {
                      this.A(this.d);
                      break ;
                   }else {
                      y = c.y;
                      if (y != null) {
                         y.u = y.u + 1;
                      }
                      this.n();
                      break ;
                   }
                }else {
                   i = i + 1;
                }
             }else {
                uoc = 1;
                goto label_0042 ;
             }
          }
       }else {
          this.A(this.d);
       }
       return;
    }
}
