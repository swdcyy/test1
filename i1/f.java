package i1.f;
import i1.b$a;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.solver.widgets.d;
import i1.b$b;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.util.HashSet;
import java.util.Iterator;
import java.lang.Object;
import androidx.constraintlayout.solver.widgets.f;
import androidx.constraintlayout.solver.widgets.a;
import java.lang.Math;
import java.util.ArrayList;
import h1.c;

public class f	// class@00215d
{
    public static b$a a;

    static {
       f.a = new b$a();
    }
    public static boolean a(ConstraintWidget p0){
       ConstraintWidget$DimensionBehaviour uDimensionBe2;
       ConstraintWidget$DimensionBehaviour uDimensionBe3;
       ConstraintWidget$DimensionBehaviour uDimensionBe = p0.B();
       ConstraintWidget$DimensionBehaviour uDimensionBe1 = p0.R();
       d uod = (p0.L() != null)? p0.L(): null;
       if (uod != null) {
          uDimensionBe2 = uod.B();
          ConstraintWidget$DimensionBehaviour fIXED = ConstraintWidget$DimensionBehaviour.FIXED;
       }
       if (uod != null) {
          uDimensionBe3 = uod.R();
          uDimensionBe2 = ConstraintWidget$DimensionBehaviour.FIXED;
       }
       uDimensionBe3 = ConstraintWidget$DimensionBehaviour.FIXED;
       int i = 0;
       uDimensionBe = (uDimensionBe != uDimensionBe3 && (uDimensionBe == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || (uDimensionBe == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && (p0.p == null && (p0.Y || (p0.Y(i) || p0.h0()))))))? 1: 0;
       uDimensionBe1 = (uDimensionBe1 != uDimensionBe3 && (uDimensionBe1 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || (uDimensionBe1 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && (p0.q == null && (p0.Y || (p0.Y(1) || p0.i0()))))))? 1: 0;
       if (p0.Y > 0 && (uDimensionBe || uDimensionBe1)) {
          return 1;
       }else if(uDimensionBe && uDimensionBe1){
          i = true;
       }
       return i;
    }
    public static void b(ConstraintWidget p0,b$b p1,boolean p2){
       Iterator iterator;
       ConstraintAnchor d;
       ConstraintWidget j;
       int i2;
       ConstraintAnchor f;
       boolean b1;
       int i3;
       if (!p0 instanceof d && (p0.g0() && f.a(p0))) {
          d.E1(p0, p1, new b$a(), b$a.k);
       }
    label_001a :
       ConstraintAnchor uConstraintA = p0.p(ConstraintAnchor$Type.LEFT);
       ConstraintAnchor uConstraintA1 = p0.p(ConstraintAnchor$Type.RIGHT);
       int i = uConstraintA.e();
       int i1 = uConstraintA1.e();
       if (uConstraintA.d() != null && uConstraintA.n()) {
          iterator = uConstraintA.d().iterator();
          while (iterator.hasNext()) {
             ConstraintAnchor uConstraintA2 = iterator.next();
             d = uConstraintA2.d;
             int b = f.a(d);
             if (d.g0() && b) {
                d.E1(d, p1, new b$a(), b$a.k);
             }
             ConstraintWidget$DimensionBehaviour mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
             if (d.B() != mATCH_CONSTR || b) {
                if (d.g0()) {
                   continue ;
                }else {
                   j = d.J;
                   if (uConstraintA2 == j && d.L.f == null) {
                      i2 = j.f() + i;
                      b = d.U() + i2;
                      d.t0(i2, b);
                      f.b(d, p1, p2);
                   }else {
                      ConstraintWidget l = d.L;
                      if (uConstraintA2 == l && j.f == null) {
                         i2 = i - l.f();
                         b = i2 - d.U();
                         d.t0(b, i2);
                         f.b(d, p1, p2);
                      }else if(uConstraintA2 == j){
                         uConstraintA2 = l.f;
                         if (uConstraintA2 != null && (uConstraintA2.n() && !d.c0())) {
                            f.d(p1, d, p2);
                         }
                      }
                   }
                }
             }else if(d.B() == mATCH_CONSTR && (d.t >= null && (d.s >= null && (d.T() == 8 || (d.p == null && (!d.w() && (!d.c0() && !d.f0()))))))){
                if (uConstraintA2 == d.J) {
                   f = d.L.f;
                   if (f != null && f.n()) {
                   label_00c2 :
                      i2 = true;
                   label_00c5 :
                      if (i2 && !d.c0()) {
                         f.e(p0, p1, d, p2);
                      }
                   }
                }
                if (uConstraintA2 == d.L) {
                   uConstraintA2 = d.J.f;
                   if (uConstraintA2 != null && uConstraintA2.n()) {
                      goto label_00c2 ;
                   }
                }
                i2 = false;
                goto label_00c5 ;
             }
          }
       }
       if (p0 instanceof f) {
          return;
       }else if(uConstraintA1.d() != null && uConstraintA1.n()){
          iterator = uConstraintA1.d().iterator();
          while (iterator.hasNext()) {
             uConstraintA1 = iterator.next();
             ConstraintAnchor d1 = uConstraintA1.d;
             i2 = f.a(d1);
             if (d1.g0() && i2) {
                d.E1(d1, p1, new b$a(), b$a.k);
             }
             if (uConstraintA1 == d1.J) {
                d = d1.L.f;
                if (d != null && d.n()) {
                label_0186 :
                   b1 = true;
                label_0189 :
                   ConstraintWidget$DimensionBehaviour mATCH_CONSTR1 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                   if (d1.B() != mATCH_CONSTR1 || i2) {
                      if (d1.g0()) {
                         continue ;
                      }else {
                         ConstraintWidget j1 = d1.J;
                         if (uConstraintA1 == j1 && d1.L.f == null) {
                            i3 = j1.f() + i1;
                            i2 = d1.U() + i3;
                            d1.t0(i3, i2);
                            f.b(d1, p1, p2);
                         }else {
                            j = d1.L;
                            if (uConstraintA1 == j && j1.f == null) {
                               i3 = i1 - j.f();
                               i2 = i3 - d1.U();
                               d1.t0(i2, i3);
                               f.b(d1, p1, p2);
                            }else if(b1 && !d1.c0()){
                               f.d(p1, d1, p2);
                            }
                         }
                      }
                   }else if(d1.B() == mATCH_CONSTR1 && (d1.t >= null && (d1.s >= null && (d1.T() == 8 || (d1.p == null && (!d1.w() && (!d1.c0() && (!d1.f0() && (b1 && !d1.c0()))))))))){
                      f.e(p0, p1, d1, p2);
                   }
                }
             }
             if (uConstraintA1 == d1.L) {
                d = d1.J.f;
                if (d != null && d.n()) {
                   goto label_0186 ;
                }
             }
             b1 = false;
             goto label_0189 ;
          }
       }
       return;
    }
    public static void c(a p0,b$b p1,int p2,boolean p3){
       if (p0.g1()) {
          if (!p2) {
             f.b(p0, p1, p3);
          }else {
             f.i(p0, p1);
          }
       }
       return;
    }
    public static void d(b$b p0,ConstraintWidget p1,boolean p2){
       float f = p1.z();
       int i = p1.J.f.e();
       int i1 = p1.L.f.e();
       int i2 = p1.J.f() + i;
       int i3 = i1 - p1.L.f();
       if (i == i1) {
          f = 0x3f000000;
       }else {
          i = i2;
          i1 = i3;
       }
       i2 = p1.U();
       i3 = (i1 - i) - i2;
       if (i > i1) {
          i3 = (i - i1) - i2;
       }
       int i4 = (int)((f * (float)i3) + 0x3f000000) + i;
       i3 = i4 + i2;
       if (i > i1) {
          i3 = i4 - i2;
       }
       p1.t0(i4, i3);
       f.b(p1, p0, p2);
       return;
    }
    public static void e(ConstraintWidget p0,b$b p1,ConstraintWidget p2,boolean p3){
       int i3;
       float f = p2.z();
       int i = p2.J.f.e() + p2.J.f();
       int i1 = p2.L.f.e() - p2.L.f();
       if (i1 >= i) {
          int i2 = p2.U();
          if (p2.T() != 8) {
             ConstraintWidget p = p2.p;
             if (p == 2) {
                i3 = (p0 instanceof d)? p0.U(): p0.L().U();
                i2 = (int)((p2.z() * 0x3f000000) * (float)i3);
             }else if(p == null){
                i2 = i1 - i;
             }
             i2 = Math.max(p2.s, i2);
             i3 = p2.t;
             if (i3 > null) {
                i2 = Math.min(i3, i2);
             }
          }
          i = i + (int)((f * (float)((i1 - i) - i2)) + 0x3f000000);
          p2.t0(i, (i2 + i));
          f.b(p2, p1, p3);
       }
       return;
    }
    public static void f(b$b p0,ConstraintWidget p1){
       float f = p1.P();
       int i = p1.K.f.e();
       int i1 = p1.M.f.e();
       int i2 = p1.K.f() + i;
       int i3 = i1 - p1.M.f();
       float f1 = 0x3f000000;
       if (i == i1) {
          f = 0x3f000000;
       }else {
          i = i2;
          i1 = i3;
       }
       i2 = p1.y();
       i3 = (i1 - i) - i2;
       if (i > i1) {
          i3 = (i - i1) - i2;
       }
       int i4 = (int)((f * (float)i3) + f1);
       i3 = i + i4;
       int i5 = i3 + i2;
       if (i > i1) {
          i3 = i - i4;
          i5 = i3 - i2;
       }
       p1.w0(i3, i5);
       f.i(p1, p0);
       return;
    }
    public static void g(ConstraintWidget p0,b$b p1,ConstraintWidget p2){
       int i3;
       float f = p2.P();
       int i = p2.K.f.e() + p2.K.f();
       int i1 = p2.M.f.e() - p2.M.f();
       if (i1 >= i) {
          int i2 = p2.y();
          if (p2.T() != 8) {
             ConstraintWidget q = p2.q;
             if (q == 2) {
                i3 = (p0 instanceof d)? p0.y(): p0.L().y();
                i2 = (int)((f * 0x3f000000) * (float)i3);
             }else if(q == null){
                i2 = i1 - i;
             }
             i2 = Math.max(p2.v, i2);
             i3 = p2.w;
             if (i3 > null) {
                i2 = Math.min(i3, i2);
             }
          }
          i = i + (int)((f * (float)((i1 - i) - i2)) + 0x3f000000);
          p2.w0(i, (i2 + i));
          f.i(p2, p1);
       }
       return;
    }
    public static void h(d p0,b$b p1){
       float f;
       ConstraintWidget uConstraintW2;
       ConstraintWidget$DimensionBehaviour uDimensionBe = p0.B();
       ConstraintWidget$DimensionBehaviour uDimensionBe1 = p0.R();
       p0.m0();
       ArrayList uArrayList = p0.e1();
       int i = uArrayList.size();
       int i1 = 0;
       for (boolean i2 = 0; i2 < i; i2 = i2 + 1) {
          uArrayList.get(i2).m0();
       }
       i2 = p0.B1();
       if (uDimensionBe == ConstraintWidget$DimensionBehaviour.FIXED) {
          p0.t0(i1, p0.U());
       }else {
          p0.u0(i1);
       }
       int i3 = 0;
       int i4 = 0;
       ConstraintWidget uConstraintW = null;
       int i5 = 0x3f000000;
       int i6 = -1;
       while (i3 < i) {
          ConstraintWidget uConstraintW1 = uArrayList.get(i3);
          if (uConstraintW1 instanceof f) {
             if (uConstraintW1.f1() == 1) {
                if (uConstraintW1.g1() != i6) {
                   uConstraintW1.j1(uConstraintW1.g1());
                }else if(uConstraintW1.h1() != i6 && p0.h0()){
                   i4 = p0.U() - uConstraintW1.h1();
                   uConstraintW1.j1(i4);
                }else if(p0.h0()){
                   f = uConstraintW1.i1() * (float)p0.U();
                   f = f + i5;
                   uConstraintW1.j1((int)f);
                }
                i4 = 1;
             }
          }else if(uConstraintW1 instanceof a && !uConstraintW1.k1()){
             uConstraintW = 1;
          }
          i3 = i3 + 1;
       }
       if (i4) {
          i3 = 0;
          while (i3 < i) {
             uConstraintW2 = uArrayList.get(i3);
             if (uConstraintW2 instanceof f && uConstraintW2.f1() == 1) {
                f.b(uConstraintW2, p1, i2);
             }
             i3 = i3 + 1;
          }
       }
       f.b(p0, p1, i2);
       if (uConstraintW) {
          i3 = 0;
          while (i3 < i) {
             uConstraintW2 = uArrayList.get(i3);
             if (uConstraintW2 instanceof a && !uConstraintW2.k1()) {
                f.c(uConstraintW2, p1, i1, i2);
             }
             i3 = i3 + 1;
          }
       }
       if (uDimensionBe1 == ConstraintWidget$DimensionBehaviour.FIXED) {
          p0.w0(i1, p0.y());
       }else {
          p0.v0(i1);
       }
       i3 = 0;
       int i7 = 0;
       uConstraintW2 = 0;
       while (i3 < i) {
          uConstraintW = uArrayList.get(i3);
          if (uConstraintW instanceof f) {
             if (!uConstraintW.f1()) {
                if (uConstraintW.g1() != i6) {
                   uConstraintW.j1(uConstraintW.g1());
                }else if(uConstraintW.h1() != i6 && p0.i0()){
                   i7 = p0.y() - uConstraintW.h1();
                   uConstraintW.j1(i7);
                }else if(p0.i0()){
                   float f1 = uConstraintW.i1() * (float)p0.y();
                   f1 = f1 + i5;
                   uConstraintW.j1((int)f1);
                }
                i7 = 1;
             }
          }else if(uConstraintW instanceof a && uConstraintW.k1() == 1){
             uConstraintW2 = 1;
          }
          i3 = i3 + 1;
       }
       if (i7) {
          i3 = 0;
          while (i3 < i) {
             ConstraintWidget uConstraintW3 = uArrayList.get(i3);
             if (uConstraintW3 instanceof f && !uConstraintW3.f1()) {
                f.i(uConstraintW3, p1);
             }
             i3 = i3 + 1;
          }
       }
       f.i(p0, p1);
       if (uConstraintW2) {
          int i8 = 0;
          while (i8 < i) {
             ConstraintWidget uConstraintW4 = uArrayList.get(i8);
             if (uConstraintW4 instanceof a && uConstraintW4.k1() == 1) {
                f.c(uConstraintW4, p1, 1, i2);
             }
             i8++;
          }
       }
       while (i1 < i) {
          ConstraintWidget uConstraintW5 = uArrayList.get(i1);
          if (uConstraintW5.g0() && f.a(uConstraintW5)) {
             d.E1(uConstraintW5, p1, f.a, b$a.k);
             f.b(uConstraintW5, p1, i2);
             f.i(uConstraintW5, p1);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public static void i(ConstraintWidget p0,b$b p1){
       Iterator iterator;
       ConstraintAnchor d;
       ConstraintWidget k;
       int i3;
       ConstraintAnchor f;
       ConstraintAnchor d1;
       boolean b1;
       int i4;
       if (!p0 instanceof d && (p0.g0() && f.a(p0))) {
          d.E1(p0, p1, new b$a(), b$a.k);
       }
    label_001a :
       ConstraintAnchor uConstraintA = p0.p(ConstraintAnchor$Type.TOP);
       ConstraintAnchor uConstraintA1 = p0.p(ConstraintAnchor$Type.BOTTOM);
       int i = uConstraintA.e();
       boolean i1 = uConstraintA1.e();
       int i2 = 0;
       if (uConstraintA.d() != null && uConstraintA.n()) {
          iterator = uConstraintA.d().iterator();
          while (iterator.hasNext()) {
             ConstraintAnchor uConstraintA2 = iterator.next();
             d = uConstraintA2.d;
             int b = f.a(d);
             if (d.g0() && b) {
                d.E1(d, p1, new b$a(), b$a.k);
             }
             ConstraintWidget$DimensionBehaviour mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
             if (d.R() != mATCH_CONSTR || b) {
                if (d.g0()) {
                   continue ;
                }else {
                   k = d.K;
                   if (uConstraintA2 == k && d.M.f == null) {
                      i3 = k.f() + i;
                      b = d.y() + i3;
                      d.w0(i3, b);
                      f.i(d, p1);
                   }else {
                      ConstraintWidget m = d.M;
                      if (uConstraintA2 == m && m.f == null) {
                         i3 = i - m.f();
                         b = i3 - d.y();
                         d.w0(b, i3);
                         f.i(d, p1);
                      }else if(uConstraintA2 == k){
                         uConstraintA2 = m.f;
                         if (uConstraintA2 != null && uConstraintA2.n()) {
                            f.f(p1, d);
                         }
                      }
                   }
                }
             }else if(d.R() == mATCH_CONSTR && (d.w >= null && (d.v >= null && (d.T() == 8 || (d.q == null && (!d.w() - i2 && (!d.e0() && !d.f0()))))))){
                if (uConstraintA2 == d.K) {
                   f = d.M.f;
                   if (f != null && f.n()) {
                   label_00c2 :
                      i3 = true;
                   label_00c5 :
                      if (i3 && !d.e0()) {
                         f.g(p0, p1, d);
                      }
                   }
                }
                if (uConstraintA2 == d.M) {
                   uConstraintA2 = d.K.f;
                   if (uConstraintA2 != null && uConstraintA2.n()) {
                      goto label_00c2 ;
                   }
                }
                i3 = false;
                goto label_00c5 ;
             }
          }
       }
       if (p0 instanceof f) {
          return;
       }else if(uConstraintA1.d() != null && uConstraintA1.n()){
          iterator = uConstraintA1.d().iterator();
          while (iterator.hasNext()) {
             uConstraintA1 = iterator.next();
             d1 = uConstraintA1.d;
             i3 = f.a(d1);
             if (d1.g0() && i3) {
                d.E1(d1, p1, new b$a(), b$a.k);
             }
             if (uConstraintA1 == d1.K) {
                d = d1.M.f;
                if (d != null && d.n()) {
                label_0180 :
                   b1 = true;
                label_0183 :
                   ConstraintWidget$DimensionBehaviour mATCH_CONSTR1 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                   if (d1.R() != mATCH_CONSTR1 || i3) {
                      if (d1.g0()) {
                         continue ;
                      }else {
                         ConstraintWidget k1 = d1.K;
                         if (uConstraintA1 == k1 && d1.M.f == null) {
                            i4 = k1.f() + i1;
                            i3 = d1.y() + i4;
                            d1.w0(i4, i3);
                            f.i(d1, p1);
                         }else {
                            k = d1.M;
                            if (uConstraintA1 == k && k1.f == null) {
                               i4 = i1 - k.f();
                               i3 = i4 - d1.y();
                               d1.w0(i3, i4);
                               f.i(d1, p1);
                            }else if(b1 && !d1.e0()){
                               f.f(p1, d1);
                            }
                         }
                      }
                   }else if(d1.R() == mATCH_CONSTR1 && (d1.w >= null && (d1.v >= null && (d1.T() == 8 || (d1.q == null && (!d1.w() - i2 && (!d1.e0() && (!d1.f0() && (b1 && !d1.e0()))))))))){
                      f.g(p0, p1, d1);
                   }
                }
             }
             if (uConstraintA1 == d1.M) {
                d = d1.K.f;
                if (d != null && d.n()) {
                   goto label_0180 ;
                }
             }
             b1 = false;
             goto label_0183 ;
          }
       }
       ConstraintAnchor uConstraintA3 = p0.p(ConstraintAnchor$Type.BASELINE);
       if (uConstraintA3.d() != null && uConstraintA3.n()) {
          int i5 = uConstraintA3.e();
          Iterator iterator1 = uConstraintA3.d().iterator();
          while (iterator1.hasNext()) {
             uConstraintA1 = iterator1.next();
             d1 = uConstraintA1.d;
             i1 = f.a(d1);
             if (d1.g0() && i1) {
                d.E1(d1, p1, new b$a(), b$a.k);
             }
             if (d1.R() != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT || (!i1 || (!d1.g0() && uConstraintA1 == d1.N))) {
                d1.s0(i5);
                f.i(d1, p1);
             }
          }
       }
       return;
    }
}
