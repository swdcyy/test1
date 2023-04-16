package i1.b;
import androidx.constraintlayout.solver.widgets.d;
import java.lang.Object;
import java.util.ArrayList;
import i1.b$a;
import i1.b$b;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import h1.c;
import androidx.constraintlayout.solver.widgets.f;
import androidx.constraintlayout.solver.widgets.a;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.h;
import f1.b;
import java.lang.String;
import androidx.constraintlayout.solver.widgets.g;
import androidx.constraintlayout.solver.c;
import java.lang.Math;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import h1.a;

public class b	// class@002159
{
    public final ArrayList a;
    public b$a b;
    public d c;

    public void b(d p0){
       super();
       this.a = new ArrayList();
       this.b = new b$a();
       this.c = p0;
    }
    public final boolean a(b$b p0,ConstraintWidget p1,int p2){
       this.b.a = p1.B();
       this.b.b = p1.R();
       this.b.c = p1.U();
       this.b.d = p1.y();
       b tb = this.b;
       tb.i = false;
       tb.j = p2;
       ConstraintWidget$DimensionBehaviour mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
       ConstraintWidget uConstraintW = (tb.a == mATCH_CONSTR)? 1: null;
       ConstraintWidget uConstraintW1 = (tb.b == mATCH_CONSTR)? 1: null;
       int i = 0;
       uConstraintW = (uConstraintW && p1.Y - i > 0)? 1: null;
       uConstraintW1 = (uConstraintW1 && p1.Y - i > 0)? 1: 0;
       if (uConstraintW && p1.r[0] == 4) {
          tb.a = ConstraintWidget$DimensionBehaviour.FIXED;
       }
       if (uConstraintW1 && p1.r[1] == 4) {
          tb.b = ConstraintWidget$DimensionBehaviour.FIXED;
       }
       p0.b(p1, tb);
       p1.Y0(this.b.e);
       p1.z0(this.b.f);
       p1.y0(this.b.h);
       p1.o0(this.b.g);
       b tb1 = this.b;
       tb1.j = b$a.k;
       return tb1.i;
    }
    public final void b(d p0){
       ConstraintWidget f;
       ConstraintWidget$DimensionBehaviour uDimensionBe;
       int i2;
       ConstraintWidget$DimensionBehaviour uDimensionBe1;
       ConstraintWidget$DimensionBehaviour mATCH_CONSTR;
       ConstraintWidget uConstraintW1;
       d s0;
       long l;
       int i = p0.N0.size();
       boolean b = p0.F1(64);
       b$b uob = p0.v1();
       int i1 = 0;
       while (i1 < i) {
          ConstraintWidget uConstraintW = p0.N0.get(i1);
          if (!uConstraintW instanceof f && (!uConstraintW instanceof a && !uConstraintW.f0())) {
             if (b) {
                ConstraintWidget e = uConstraintW.e;
                if (e != null) {
                   f = uConstraintW.f;
                   if (f == null || (e.e.j == null || f.e.j == null)) {
                   }
                }else {
                }
             }else {
             }
          }
       label_00ac :
          i1 = i1 + 1;
       }
       uob.a();
       return;
    }
    public final void c(d p0,String p1,int p2,int p3){
       p0.O0(0);
       p0.N0(0);
       p0.Y0(p2);
       p0.z0(p3);
       p0.O0(p0.J());
       p0.N0(p0.I());
       this.c.f1();
    }
    public long d(d p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8,int p9){
       int i6;
       ConstraintWidget$DimensionBehaviour mATCH_CONSTR;
       int b1;
       float f;
       b y;
       int i7;
       int i9;
       ConstraintWidget uConstraintW1;
       int i10;
       int i11;
       d s0;
       ConstraintAnchor$Type type;
       int i12;
       b$b uob3;
       int i14;
       b uob = this;
       c uoc = p0;
       int i = p1;
       boolean i1 = p4;
       int i2 = p6;
       b$b uob1 = p0.v1();
       int i3 = uoc.N0.size();
       int i4 = p0.U();
       int i5 = p0.y();
       int b = g.b(i, 128);
       b uob2 = null;
       i = (b || g.b(i, 64))? 1: 0;
       if (i) {
          i6 = 0;
          while (i6 < i3) {
             ConstraintWidget uConstraintW = uoc.N0.get(i6);
             mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
             b1 = (uConstraintW.B() == mATCH_CONSTR)? true: false;
             f = (uConstraintW.R() == mATCH_CONSTR)? Float.MIN_VALUE: 0;
             f = (b1 && (f && uConstraintW.w() - false > 0))? 1: 0;
             if (uConstraintW.c0() && (f || (uConstraintW.e0() && (f || (!uConstraintW instanceof h && (uConstraintW.c0() || uConstraintW.e0())))))) {
                i = 0;
                break ;
             }
             i6 = i6 + 1;
          }
       }
       long l = 1;
       if (i) {
          y = c.y;
          if (y != null) {
             y.e = y.e + l;
          }
       }
       y = 0x40000000;
       b1 = (i1 != y || (i2 == y || b))? 1: 0;
       i = i & b1;
       b1 = 2;
       if (i) {
          i7 = Math.min(p0.H(), p5);
          i6 = Math.min(p0.G(), p7);
          if (i1 == y && p0.U() != i7) {
             uoc.Y0(i7);
             p0.y1();
          }
          if (i2 == y && p0.y() != i6) {
             uoc.z0(i6);
             p0.y1();
          }
          if (i1 == y && i2 == y) {
             b = uoc.s1(b);
             mATCH_CONSTR = 2;
          }else {
             uoc.t1(b);
             if (i1 == y) {
                i6 = 1;
                i7 = uoc.u1(b, uob2) & i6;
                i9 = 1;
             }else {
                i6 = 1;
                i7 = 1;
                i9 = 0;
             }
             if (i2 == y) {
                b = uoc.u1(b, i6) & i7;
                i9 = i9 + 1;
             }else {
                b = i7;
             }
          }
          if (b) {
             i6 = (i1 == y)? true: false;
             i1 = (i2 == y)? true: false;
             uoc.c1(i6, i1);
          }
       }else {
          b = 0;
          i9 = 0;
       }
       if (!b || mATCH_CONSTR != b1) {
          i1 = p0.w1();
          if (i3 > 0) {
             this.b(p0);
          }
          this.e(p0);
          i2 = uob.a.size();
          if (i3 > 0) {
             uob.c(uoc, "First pass", i4, i5);
          }
          if (i2 > 0) {
             ConstraintWidget$DimensionBehaviour wRAP_CONTENT = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
             i6 = (p0.B() == wRAP_CONTENT)? 1: 0;
             i3 = (p0.R() == wRAP_CONTENT)? 1: 0;
             b = Math.max(p0.U(), uob.c.J());
             i7 = Math.max(p0.y(), uob.c.I());
             int i8 = 0;
             i9 = 0;
             while (i8 < i2) {
                uConstraintW1 = uob.a.get(i8);
                if (!uConstraintW1 instanceof h) {
                   p4 = i1;
                   i10 = i4;
                   i11 = i5;
                }else {
                   b1 = uConstraintW1.U();
                   p4 = i1;
                   i1 = uConstraintW1.y();
                   i10 = i4;
                   i4 = uob.a(uob1, uConstraintW1, b$a.l) | i9;
                   s0 = uoc.S0;
                   p5 = i4;
                   i11 = i5;
                   if (s0 != null) {
                      long l1 = s0.d + 1;
                      s0.d = l1;
                   }
                   i4 = uConstraintW1.U();
                   i5 = uConstraintW1.y();
                   if (i4 != b1) {
                      uConstraintW1.Y0(i4);
                      if (i6 && uConstraintW1.N() > b) {
                         i4 = uConstraintW1.N() + uConstraintW1.p(ConstraintAnchor$Type.RIGHT).f();
                         b = Math.max(b, i4);
                      }
                      type = 1;
                   }else {
                      type = p5;
                   }
                   if (i5 != i1) {
                      uConstraintW1.z0(i5);
                      if (i3 && uConstraintW1.s() > i7) {
                         i1 = uConstraintW1.s() + uConstraintW1.p(ConstraintAnchor$Type.BOTTOM).f();
                         i7 = Math.max(i7, i1);
                      }
                      type = 1;
                   }
                   i9 = type | uConstraintW1.r1();
                }
                i8 = i8 + 1;
                i1 = p4;
                i4 = i10;
                i5 = i11;
                b1 = 2;
             }
             p4 = i1;
             i10 = i4;
             i11 = i5;
             i1 = 0;
             i4 = 2;
             while (true) {
                if (i1 < i4) {
                   i5 = 0;
                   while (i5 < i2) {
                      uConstraintW1 = uob.a.get(i5);
                      if (!uConstraintW1 instanceof a || (!uConstraintW1 instanceof h || (uConstraintW1 instanceof f || (uConstraintW1.T() == 8 || (i && (uConstraintW1.e.e.j != null && (uConstraintW1.f.e.j != null || uConstraintW1 instanceof h))))))) {
                         i12 = i;
                         p5 = i2;
                         uob3 = uob1;
                         int i13 = 1;
                      }else {
                         i8 = uConstraintW1.U();
                         b1 = uConstraintW1.y();
                         i4 = uConstraintW1.q();
                         int l2 = b$a.l;
                         i12 = i;
                         if (i1 == 1) {
                            l2 = b$a.m;
                         }
                         i = uob.a(uob1, uConstraintW1, l2) | i9;
                         s0 = uoc.S0;
                         if (s0 != null) {
                            p5 = i2;
                            uob3 = uob1;
                            long l3 = s0.d + 1;
                            s0.d = l3;
                         }else {
                            p5 = i2;
                            uob3 = uob1;
                            long l4 = 1;
                         }
                         i2 = uConstraintW1.U();
                         i14 = uConstraintW1.y();
                         if (i2 != i8) {
                            uConstraintW1.Y0(i2);
                            if (i6 && uConstraintW1.N() > b) {
                               i = uConstraintW1.N() + uConstraintW1.p(ConstraintAnchor$Type.RIGHT).f();
                               b = Math.max(b, i);
                            }
                            i = 1;
                         }
                         if (i14 != b1) {
                            uConstraintW1.z0(i14);
                            if (i3 && uConstraintW1.s() > i7) {
                               i = uConstraintW1.s() + uConstraintW1.p(ConstraintAnchor$Type.BOTTOM).f();
                               i7 = Math.max(i7, i);
                            }
                            i = 1;
                         }
                         if (uConstraintW1.X() && i4 != uConstraintW1.q()) {
                            i9 = 1;
                         }else {
                            i9 = i;
                         }
                      }
                      i5 = i5 + 1;
                      i2 = p5;
                      uob1 = uob3;
                      i = i12;
                      i4 = 2;
                   }
                   i12 = i;
                   p5 = i2;
                   uob3 = uob1;
                   if (i9) {
                      uob.c(uoc, "intermediate pass", i10, i11);
                      i1 = i1 + 1;
                      uob1 = uob3;
                      i = i12;
                      i4 = 2;
                      i9 = 0;
                      i2 = p5;
                   }else {
                   label_02fc :
                      i2 = i10;
                      i14 = i11;
                      if (i9) {
                         uob.c(uoc, "2nd pass", i2, i14);
                         if (p0.U() < b) {
                            uoc.Y0(b);
                            uConstraintW1 = 1;
                         }else {
                            uConstraintW1 = 0;
                         }
                         if (p0.y() < i7) {
                            uoc.z0(i7);
                            i7 = 1;
                         }else {
                            i7 = uConstraintW1;
                         }
                         if (i7) {
                            uob.c(uoc, "3rd pass", i2, i14);
                         }
                      }
                      i = p4;
                   }
                }else {
                   goto label_02fc ;
                }
             }
          }else {
             i = i1;
          }
          uoc.I1(i);
       }
       return 0;
    }
    public void e(d p0){
       this.a.clear();
       int i = p0.N0.size();
       int i1 = 0;
       while (i1 < i) {
          ConstraintWidget uConstraintW = p0.N0.get(i1);
          ConstraintWidget$DimensionBehaviour mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
          if (uConstraintW.B() == mATCH_CONSTR || uConstraintW.R() == mATCH_CONSTR) {
             this.a.add(uConstraintW);
          }
          i1 = i1 + 1;
       }
       p0.y1();
       return;
    }
}
