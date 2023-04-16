package androidx.constraintlayout.solver.widgets.e$a;
import androidx.constraintlayout.solver.widgets.e;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.lang.Object;
import androidx.constraintlayout.solver.widgets.h;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;

public class e$a	// class@00069f
{
    public int a;
    public ConstraintWidget b;
    public int c;
    public ConstraintAnchor d;
    public ConstraintAnchor e;
    public ConstraintAnchor f;
    public ConstraintAnchor g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public final e r;

    public void e$a(e p0,int p1,ConstraintAnchor p2,ConstraintAnchor p3,ConstraintAnchor p4,ConstraintAnchor p5,int p6){
       this.r = p0;
       super();
       this.a = 0;
       this.b = null;
       this.c = 0;
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.l = 0;
       this.m = 0;
       this.n = 0;
       this.o = 0;
       this.p = 0;
       this.q = 0;
       this.a = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p0.l1();
       this.i = p0.n1();
       this.j = p0.m1();
       this.k = p0.k1();
       this.q = p6;
    }
    public void a(ConstraintWidget p0){
       int i1;
       e$a uoa = 8;
       int i = 0;
       if (this.a == null) {
          i1 = this.r.D1(p0, this.q);
          if (p0.B() == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
             this.p = this.p + 1;
             i1 = 0;
          }
          e o1 = this.r.o1;
          if (p0.T() != uoa) {
             i = o1;
          }
          this.l = this.l + (i1 + i);
          i1 = this.r.C1(p0, this.q);
          if (this.b == null || this.c < i1) {
             this.b = p0;
             this.c = i1;
             this.m = i1;
          }
       }else {
          i1 = this.r.D1(p0, this.q);
          int i2 = this.r.C1(p0, this.q);
          if (p0.R() == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
             this.p = this.p + 1;
             i2 = 0;
          }
          e p1 = this.r.p1;
          if (p0.T() != uoa) {
             i = p1;
          }
          this.m = this.m + (i2 + i);
          if (this.b == null || this.c < i1) {
             this.b = p0;
             this.c = i1;
             this.l = i1;
          }
       }
       this.o = this.o + 1;
       return;
    }
    public void b(){
       this.c = 0;
       this.b = null;
       this.l = 0;
       this.m = 0;
       this.n = 0;
       this.o = 0;
       this.p = 0;
    }
    public void c(boolean p0,int p1,boolean p2){
       e$a n;
       int i1;
       e$a r;
       int i5;
       e$a n1;
       int i6;
       e$a r1;
       int i7;
       int i8;
       int i9;
       int i10;
       e$a r3;
       e c1;
       e i1;
       e r1;
       object oobject1;
       e q1;
       e$a uoa = this;
       e$a o = uoa.o;
       int i = 0;
       while (i < o) {
          n = uoa.n;
          i1 = n + i;
          r = uoa.r;
          if (i1 >= r.A1) {
             break ;
          }else {
             int i12 = n + i;
             object oobject3 = r.z1[i12];
             if (oobject3 != null) {
                oobject3.l0();
             }
             i = i + 1;
          }
       }
       if (o != null && uoa.b != null) {
          n = (p2 && !p1)? 1: 0;
          int i2 = 0;
          int i3 = -1;
          int i4 = -1;
          while (i2 < o) {
             if (p0) {
                i5 = o - 1;
                i5 = i5 - i2;
             }else {
                i5 = i2;
             }
             n1 = uoa.n;
             i6 = n1 + i5;
             r1 = uoa.r;
             if (i6 >= r1.A1) {
                break ;
             }else {
                i7 = n1 + i5;
                if (!r1.z1[i7].T()) {
                   if (i3 == -1) {
                      i3 = i2;
                   }
                   i4 = i2;
                }
                i2 = i2 + 1;
             }
          }
          if (uoa.a == null) {
             e$a b = uoa.b;
             b.S0(uoa.r.d1);
             n1 = uoa.i;
             if (p1 > 0) {
                i7 = n1 + uoa.r.p1;
             }
             b.K.a(uoa.e, i7);
             if (p2) {
                b.M.a(uoa.g, uoa.k);
             }
             if (p1 > 0) {
                uoa.e.d.M.a(b.K, 0);
             }
             if (uoa.r.r1 == 3 && !b.X()) {
                i7 = 0;
                while (true) {
                   if (i7 < o) {
                      if (p0) {
                         i8 = o - 1;
                         i8 = i8 - i7;
                      }else {
                         i8 = i7;
                      }
                      e$a n2 = uoa.n;
                      i9 = n2 + i8;
                      e$a r2 = uoa.r;
                      if (i9 < r2.A1) {
                         i10 = n2 + i8;
                         oobject1 = r2.z1[i10];
                         if (oobject1.X()) {
                            break ;
                         }else {
                            i7 = i7 + 1;
                         }
                      }
                   }
                }
                ConstraintWidget uConstraintW = null;
                i8 = 0;
                while (i8 < o) {
                   if (p0) {
                      i10 = o - 1;
                      i10 = i10 - i8;
                   }else {
                      i10 = i8;
                   }
                   e$a n3 = uoa.n;
                   int i11 = n3 + i10;
                   r3 = uoa.r;
                   if (i11 < r3.A1) {
                      i9 = n3 + i10;
                      object oobject = r3.z1[i9];
                      if (!i8) {
                         oobject.k(oobject.J, uoa.d, uoa.h);
                      }
                      if (!i10) {
                         r3 = uoa.r;
                         c1 = r3.c1;
                         i1 = r3.i1;
                         if (uoa.n == null) {
                            e e1 = r3.e1;
                            if (e1 != -1) {
                               i1 = r3.k1;
                            label_00f9 :
                               c1 = e1;
                            }else if(p2){
                               e1 = r3.g1;
                               if (e1 != -1) {
                                  i1 = r3.m1;
                                  goto label_00f9 ;
                               }
                            }
                         }else {
                            goto label_00fb ;
                         }
                         oobject.B0(c1);
                         oobject.A0(i1);
                      }
                      i6 = o - 1;
                      if (i8 == i6) {
                         oobject.k(oobject.L, uoa.f, uoa.j);
                      }
                      if (uConstraintW != null) {
                         oobject.J.a(uConstraintW.L, uoa.r.o1);
                         if (i8 == i3) {
                            oobject.J.u(uoa.h);
                         }
                         uConstraintW.L.a(oobject.J, 0);
                         i10 = i4 + 1;
                         if (i8 == i10) {
                            uConstraintW.L.u(uoa.j);
                         }
                      }
                      if (oobject != b) {
                         if (uoa.r.r1 == 3 && (r.X() && (oobject != r && oobject.X()))) {
                            oobject.N.a(r.N, 0);
                         }else {
                            r1 = uoa.r.r1;
                            if (r1 != null) {
                               if (r1 != 1) {
                                  if (n) {
                                     oobject.K.a(uoa.e, uoa.i);
                                     oobject.M.a(uoa.g, uoa.k);
                                  }else {
                                     oobject.K.a(b.K, 0);
                                     oobject.M.a(b.M, 0);
                                  }
                               }else {
                                  oobject.M.a(b.M, 0);
                               }
                            }else {
                               oobject.K.a(b.K, 0);
                            }
                         }
                      }else {
                         r3 = 3;
                      }
                      i8 = i8 + 1;
                      uConstraintW = oobject;
                   }
                }
             }
          label_00bf :
             r = b;
             goto label_00c0 ;
          }else {
             e$a b1 = uoa.b;
             b1.B0(uoa.r.c1);
             r = uoa.h;
             if (p1 > 0) {
                i2 = r + uoa.r.o1;
             }
             if (p0) {
                b1.L.a(uoa.f, i2);
                if (p2) {
                   b1.J.a(uoa.d, uoa.j);
                }
                if (p1 > 0) {
                   uoa.f.d.J.a(b1.L, 0);
                }
             }else {
                b1.J.a(uoa.d, i2);
                if (p2) {
                   b1.L.a(uoa.f, uoa.j);
                }
                if (p1 > 0) {
                   uoa.d.d.L.a(b1.J, 0);
                }
             }
             ConstraintWidget uConstraintW1 = null;
             i5 = 0;
             while (i5 < o) {
                n1 = uoa.n;
                i6 = n1 + i5;
                r1 = uoa.r;
                if (i6 < r1.A1) {
                   i7 = n1 + i5;
                   object oobject2 = r1.z1[i7];
                   if (!i5) {
                      oobject2.k(oobject2.K, uoa.e, uoa.i);
                      r3 = uoa.r;
                      e d1 = r3.d1;
                      c1 = r3.j1;
                      if (uoa.n == null) {
                         i1 = r3.f1;
                         if (i1 != -1) {
                            c1 = r3.l1;
                         label_0225 :
                            d1 = i1;
                         }else if(p2){
                            i1 = r3.h1;
                            if (i1 != -1) {
                               c1 = r3.n1;
                               goto label_0225 ;
                            }
                         }
                      }else {
                         goto label_0227 ;
                      }
                      oobject2.S0(d1);
                      oobject2.R0(c1);
                   }
                   i6 = o - 1;
                   if (i5 == i6) {
                      oobject2.k(oobject2.M, uoa.g, uoa.k);
                   }
                   if (uConstraintW1 != null) {
                      oobject2.K.a(uConstraintW1.M, uoa.r.p1);
                      if (i5 == i3) {
                         oobject2.K.u(uoa.i);
                      }
                      uConstraintW1.M.a(oobject2.K, 0);
                      i8 = i4 + 1;
                      if (i5 == i8) {
                         uConstraintW1.M.u(uoa.k);
                      }
                   }
                   if (oobject2 != b1) {
                      oobject1 = 2;
                      if (p0) {
                         q1 = uoa.r.q1;
                         if (q1 != null) {
                            if (q1 != 1) {
                               if (q1 != oobject1) {
                               label_02dd :
                                  r1 = 1;
                               }else {
                                  oobject2.J.a(b1.J, 0);
                                  oobject2.L.a(b1.L, 0);
                                  goto label_02dd ;
                               }
                            }else {
                               oobject2.J.a(b1.J, 0);
                               goto label_02dd ;
                            }
                         }else {
                            oobject2.L.a(b1.L, 0);
                            goto label_02dd ;
                         }
                      }else {
                         q1 = uoa.r.q1;
                         if (q1 != null) {
                            if (q1 != 1) {
                               if (q1 == oobject1) {
                                  if (n) {
                                     oobject2.J.a(uoa.d, uoa.h);
                                     oobject2.L.a(uoa.f, uoa.j);
                                  }else {
                                     oobject2.J.a(b1.J, 0);
                                     oobject2.L.a(b1.L, 0);
                                  }
                               }
                            }else {
                               oobject2.L.a(b1.L, 0);
                            }
                         }else {
                            oobject2.J.a(b1.J, 0);
                         }
                      }
                   }else {
                      goto label_02dd ;
                   }
                   i5 = i5 + 1;
                   uConstraintW1 = oobject2;
                }
             }
          }
       }
       return;
    }
    public int d(){
       if (this.a == 1) {
          return (this.m - this.r.p1);
       }
       return this.m;
    }
    public int e(){
       if (this.a == null) {
          return (this.l - this.r.o1);
       }
       return this.l;
    }
    public void f(int p0){
       e$a tp = this.p;
       if (tp == null) {
          return;
       }
       e$a to = this.o;
       p0 = p0 / tp;
       int i = 0;
       while (i < to) {
          e$a tn = this.n;
          int i1 = tn + i;
          e$a tr = this.r;
          if (i1 >= tr.A1) {
             break ;
          }else {
             int i2 = tn + i;
             object oobject = tr.z1[i2];
             if (this.a == null) {
                if (oobject != null && (oobject.B() == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && oobject.p == null)) {
                   this.r.p1(oobject, ConstraintWidget$DimensionBehaviour.FIXED, p0, oobject.R(), oobject.y());
                }
             }else if(oobject != null && (oobject.R() == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && oobject.q == null)){
                this.r.p1(oobject, oobject.B(), oobject.U(), ConstraintWidget$DimensionBehaviour.FIXED, p0);
             }
             i = i + 1;
          }
       }
       this.g();
       return;
    }
    public final void g(){
       int i3;
       this.l = 0;
       this.m = 0;
       this.b = null;
       this.c = 0;
       e$a to = this.o;
       int i = 0;
       while (i < to) {
          e$a tn = this.n;
          int i1 = tn + i;
          e$a tr = this.r;
          if (i1 >= tr.A1) {
             break ;
          }else {
             int i2 = tn + i;
             object oobject = tr.z1[i2];
             e$a uoa = 8;
             if (this.a == null) {
                i1 = oobject.U();
                e o1 = this.r.o1;
                if (oobject.T() == uoa) {
                   o1 = 0;
                }
                i1 = i1 + o1;
                i3 = this.l + i1;
                this.l = i3;
                i1 = this.r.C1(oobject, this.q);
                if (this.b == null || this.c < i1) {
                   this.b = oobject;
                   this.c = i1;
                   this.m = i1;
                }
             }else {
                i1 = tr.D1(oobject, this.q);
                int i4 = this.r.C1(oobject, this.q);
                e p1 = this.r.p1;
                if (oobject.T() == uoa) {
                   p1 = 0;
                }
                i4 = i4 + p1;
                i3 = this.m + i4;
                this.m = i3;
                if (this.b == null || this.c < i1) {
                   this.b = oobject;
                   this.c = i1;
                   this.l = i1;
                }
             }
             i = i + 1;
          }
       }
       return;
    }
    public void h(int p0){
       this.n = p0;
    }
    public void i(int p0,ConstraintAnchor p1,ConstraintAnchor p2,ConstraintAnchor p3,ConstraintAnchor p4,int p5,int p6,int p7,int p8,int p9){
       this.a = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
       this.j = p7;
       this.k = p8;
       this.q = p9;
    }
}
