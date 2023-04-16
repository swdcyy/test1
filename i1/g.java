package i1.g;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import i1.j;
import java.lang.Object;
import h1.b;
import androidx.constraintlayout.solver.widgets.f;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.d;
import i1.b$b;
import h1.c;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.solver.widgets.e;
import f1.b;
import i1.b$a;
import androidx.constraintlayout.solver.widgets.a;
import java.util.Iterator;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type;
import java.util.HashSet;
import androidx.constraintlayout.solver.c;

public class g	// class@00215e
{

    public static j a(ConstraintWidget p0,int p1,ArrayList p2,j p3){
       ConstraintWidget k0 = (!p1)? p0.K0: p0.L0;
       int i = 0;
       ConstraintAnchor uConstraintA = -1;
       if (k0 != uConstraintA && (p3 == null || k0 != p3.b)) {
          int i1 = 0;
          while (i1 < p2.size()) {
             j oj = p2.get(i1);
             if (oj.c() == k0) {
                if (p3 != null) {
                   p3.g(p1, oj);
                   p2.remove(p3);
                }
                p3 = oj;
                break ;
             }
             i1 = i1 + 1;
          }
       }else if(k0 != uConstraintA){
          return p3;
       }
       if (p3 == null) {
          if (p0 instanceof b) {
             int i2 = p0.f1(p1);
             if (i2 != uConstraintA) {
                int i3 = 0;
                while (i3 < p2.size()) {
                   j oj1 = p2.get(i3);
                   if (oj1.c() == i2) {
                      p3 = oj1;
                      break ;
                   }
                   i3 = i3 + 1;
                }
             }
          }
          if (p3 == null) {
             p3 = new j(p1);
          }
          p2.add(p3);
       }
       if (p3.a(p0)) {
          if (p0 instanceof f) {
             f uof = p0;
             uConstraintA = uof.e1();
             if (!uof.f1()) {
                i = 1;
             }
             uConstraintA.c(i, p2, p3);
          }
          if (!p1) {
             p0.K0 = p3.c();
             p0.J.c(p1, p2, p3);
             p0.L.c(p1, p2, p3);
          }else {
             p0.L0 = p3.c();
             p0.K.c(p1, p2, p3);
             p0.N.c(p1, p2, p3);
             p0.M.c(p1, p2, p3);
          }
          p0.Q.c(p1, p2, p3);
       }
       return p3;
    }
    public static j b(ArrayList p0,int p1){
       j oj;
       int i = p0.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return null;
          }
          oj = p0.get(i1);
          if (p1 == oj.b) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return oj;
    }
    public static boolean c(d p0,b$b p1){
       ConstraintWidget uConstraintW;
       ConstraintWidget uConstraintW2;
       Iterator iterator;
       b uob;
       j oj1;
       j oj2;
       j oj3;
       j oj4;
       j oj5;
       int i5;
       d uod = p0;
       ArrayList uArrayList = p0.e1();
       int i = uArrayList.size();
       boolean b = false;
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             uConstraintW = uArrayList.get(i1);
             if (!g.d(p0.B(), p0.R(), uConstraintW.B(), uConstraintW.R())) {
                return b;
             }else if(uConstraintW instanceof e){
                return b;
             }else {
                i1 = i1 + 1;
             }
          }else {
             d s0 = uod.S0;
             if (s0 != null) {
                s0.Q = s0.Q + 1;
             }
             int i2 = 0;
             ArrayList uArrayList1 = null;
             ArrayList uArrayList2 = null;
             ArrayList uArrayList3 = null;
             ArrayList uArrayList4 = null;
             ArrayList uArrayList5 = null;
             ArrayList uArrayList6 = null;
             while (i2 < i) {
                ConstraintWidget uConstraintW1 = uArrayList.get(i2);
                if (!g.d(p0.B(), p0.R(), uConstraintW1.B(), uConstraintW1.R())) {
                   d.E1(uConstraintW1, p1, uod.q1, b$a.k);
                }else {
                   int i3 = p1;
                }
                v3 = uConstraintW1 instanceof f;
                if (b) {
                   uConstraintW2 = uConstraintW1;
                   if (!uConstraintW2.f1()) {
                      if (uArrayList3 == null) {
                         uArrayList3 = new ArrayList();
                      }
                      uArrayList3.add(uConstraintW2);
                   }
                   if (uConstraintW2.f1() == 1) {
                      if (uArrayList1 == null) {
                         uArrayList1 = new ArrayList();
                      }
                      uArrayList1.add(uConstraintW2);
                   }
                }
                if (uConstraintW1 instanceof b) {
                   if (uConstraintW1 instanceof a) {
                      uConstraintW2 = uConstraintW1;
                      if (!uConstraintW2.k1()) {
                         if (uArrayList2 == null) {
                            uArrayList2 = new ArrayList();
                         }
                         uArrayList2.add(uConstraintW2);
                      }
                      if (uConstraintW2.k1() == 1) {
                         if (uArrayList4 == null) {
                            uArrayList4 = new ArrayList();
                         }
                         uArrayList4.add(uConstraintW2);
                      }
                   }else {
                      uConstraintW2 = uConstraintW1;
                      if (uArrayList2 == null) {
                         uArrayList2 = new ArrayList();
                      }
                      uArrayList2.add(uConstraintW2);
                      if (uArrayList4 == null) {
                         uArrayList4 = new ArrayList();
                      }
                      uArrayList4.add(uConstraintW2);
                   }
                }
                if (uConstraintW1.J.f == null && (uConstraintW1.L.f == null && (!b && !uConstraintW1 instanceof a))) {
                   if (uArrayList5 == null) {
                      uArrayList5 = new ArrayList();
                   }
                   uArrayList5.add(uConstraintW1);
                }
             label_00f7 :
                if (uConstraintW1.K.f == null && (uConstraintW1.M.f == null && (uConstraintW1.N.f == null && (!b && !uConstraintW1 instanceof a)))) {
                   if (uArrayList6 == null) {
                      uArrayList6 = new ArrayList();
                   }
                   uArrayList6.add(uConstraintW1);
                }
             label_011a :
                i2 = i2 + 1;
                ConstraintWidget$DimensionBehaviour uDimensionBe = null;
             }
             ArrayList uArrayList7 = new ArrayList();
             if (uArrayList1 != null) {
                iterator = uArrayList1.iterator();
                while (iterator.hasNext()) {
                   g.a(iterator.next(), 0, uArrayList7, null);
                }
             }
             int i4 = 0;
             j oj = null;
             if (uArrayList2 != null) {
                iterator = uArrayList2.iterator();
                while (iterator.hasNext()) {
                   uob = iterator.next();
                   oj1 = g.a(uob, i4, uArrayList7, oj);
                   uob.e1(uArrayList7, i4, oj1);
                   oj1.b(uArrayList7);
                   oj = 0;
                }
             }
             ConstraintAnchor uConstraintA = uod.p(ConstraintAnchor$Type.LEFT);
             if (uConstraintA.d() != null) {
                iterator = uConstraintA.d().iterator();
                while (iterator.hasNext()) {
                   g.a(iterator.next().d, 0, uArrayList7, null);
                }
             }
             uConstraintA = uod.p(ConstraintAnchor$Type.RIGHT);
             if (uConstraintA.d() != null) {
                iterator = uConstraintA.d().iterator();
                while (iterator.hasNext()) {
                   g.a(iterator.next().d, 0, uArrayList7, null);
                }
             }
             uConstraintA = uod.p(ConstraintAnchor$Type.CENTER);
             if (uConstraintA.d() != null) {
                iterator = uConstraintA.d().iterator();
                while (iterator.hasNext()) {
                   g.a(iterator.next().d, 0, uArrayList7, null);
                }
             }
             i4 = 0;
             oj1 = null;
             if (uArrayList5 != null) {
                iterator = uArrayList5.iterator();
                while (iterator.hasNext()) {
                   g.a(iterator.next(), i4, uArrayList7, oj1);
                }
             }
             if (uArrayList3 != null) {
                iterator = uArrayList3.iterator();
                while (iterator.hasNext()) {
                   g.a(iterator.next(), 1, uArrayList7, oj1);
                }
             }
             if (uArrayList4 != null) {
                iterator = uArrayList4.iterator();
                while (iterator.hasNext()) {
                   uob = iterator.next();
                   oj2 = g.a(uob, 1, uArrayList7, oj1);
                   uob.e1(uArrayList7, 1, oj2);
                   oj2.b(uArrayList7);
                   c uoc = null;
                }
             }
             uConstraintA = uod.p(ConstraintAnchor$Type.TOP);
             if (uConstraintA.d() != null) {
                iterator = uConstraintA.d().iterator();
                while (iterator.hasNext()) {
                   g.a(iterator.next().d, 1, uArrayList7, null);
                }
             }
             uConstraintA = uod.p(ConstraintAnchor$Type.BASELINE);
             if (uConstraintA.d() != null) {
                iterator = uConstraintA.d().iterator();
                while (iterator.hasNext()) {
                   g.a(iterator.next().d, 1, uArrayList7, null);
                }
             }
             uConstraintA = uod.p(ConstraintAnchor$Type.BOTTOM);
             if (uConstraintA.d() != null) {
                iterator = uConstraintA.d().iterator();
                while (iterator.hasNext()) {
                   g.a(iterator.next().d, 1, uArrayList7, null);
                }
             }
             uConstraintA = uod.p(ConstraintAnchor$Type.CENTER);
             if (uConstraintA.d() != null) {
                iterator = uConstraintA.d().iterator();
                while (iterator.hasNext()) {
                   g.a(iterator.next().d, 1, uArrayList7, null);
                }
             }
             if (uArrayList6 != null) {
                iterator = uArrayList6.iterator();
                while (iterator.hasNext()) {
                   g.a(iterator.next(), 1, uArrayList7, null);
                }
             }
             i1 = 0;
             while (i1 < i) {
                uConstraintW = uArrayList.get(i1);
                if (uConstraintW.j0()) {
                   oj2 = g.b(uArrayList7, uConstraintW.K0);
                   oj3 = g.b(uArrayList7, uConstraintW.L0);
                   if (oj2 != null && oj3 != null) {
                      oj2.g(0, oj3);
                      oj3.i(2);
                      uArrayList7.remove(oj2);
                   }
                }
                i1 = i1 + 1;
             }
             if (uArrayList7.size() <= 1) {
                return false;
             }else if(p0.B() == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT){
                Iterator iterator1 = uArrayList7.iterator();
                oj4 = null;
                i4 = 0;
                while (iterator1.hasNext()) {
                   oj5 = iterator1.next();
                   if (oj5.d() == 1) {
                      continue ;
                   }else {
                      i2 = false;
                      oj5.h(i2);
                      i5 = oj5.f(p0.x1(), i2);
                      if (i5 > i4) {
                         oj4 = oj5;
                         i4 = i5;
                      }else {
                         continue ;
                      }
                   }
                }
                if (oj4 != null) {
                   uod.D0(ConstraintWidget$DimensionBehaviour.FIXED);
                   uod.Y0(i4);
                   oj4.h(1);
                label_034a :
                   if (p0.R() == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
                      iterator1 = uArrayList7.iterator();
                      j oj6 = null;
                      i4 = 0;
                      while (iterator1.hasNext()) {
                         oj5 = iterator1.next();
                         if (!oj5.d()) {
                            i2 = 0;
                         }else {
                            oj5.h(false);
                            i5 = oj5.f(p0.x1(), 1);
                            if (i5 > i4) {
                               oj6 = oj5;
                               i4 = i5;
                               continue ;
                            }else {
                               continue ;
                            }
                         }
                      }
                      if (oj6 != null) {
                         uod.U0(ConstraintWidget$DimensionBehaviour.FIXED);
                         uod.z0(i4);
                         oj6.h(1);
                         oj5 = oj6;
                      label_038f :
                         b = (oj4 != null || oj5 != null)? true: false;
                      }
                   }else {
                      oj3 = 0;
                   }
                   oj5 = null;
                   goto label_038f ;
                }
             }
             oj4 = null;
             goto label_034a ;
          }
       }
       return b;
    }
    public static boolean d(ConstraintWidget$DimensionBehaviour p0,ConstraintWidget$DimensionBehaviour p1,ConstraintWidget$DimensionBehaviour p2,ConstraintWidget$DimensionBehaviour p3){
       int i;
       int i1;
       ConstraintWidget$DimensionBehaviour fIXED = ConstraintWidget$DimensionBehaviour.FIXED;
       if (p2 != fIXED) {
          ConstraintWidget$DimensionBehaviour wRAP_CONTENT = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
          if (p2 != wRAP_CONTENT && (p2 != ConstraintWidget$DimensionBehaviour.MATCH_PARENT || p0 == wRAP_CONTENT)) {
             i = 0;
          label_0014 :
             if (p3 != fIXED) {
                p2 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                if (p3 != p2 && (p3 != ConstraintWidget$DimensionBehaviour.MATCH_PARENT || p1 == p2)) {
                   i1 = 0;
                label_0024 :
                   if (i || i1) {
                      return true;
                   }else {
                      return false;
                   }
                }
             }
             i1 = 1;
             goto label_0024 ;
          }
       }
       i = 1;
       goto label_0014 ;
    }
}
