package androidx.constraintlayout.solver.widgets.b;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.c;
import androidx.constraintlayout.solver.widgets.c;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.b;
import java.util.ArrayList;
import java.lang.Object;

public class b	// class@00069c
{

    public static void a(d p0,c p1,int p2,int p3,c p4){
       ConstraintWidget b0;
       ConstraintAnchor uConstraintA;
       ConstraintAnchor uConstraintA1;
       ConstraintWidget uConstraintW1;
       int i2;
       c uoc3;
       ConstraintAnchor uConstraintA2;
       ConstraintAnchor uConstraintA3;
       int i5;
       ConstraintAnchor uConstraintA4;
       c uoc4;
       c uoc5;
       int i6;
       ConstraintWidget r;
       int i7;
       int i8;
       ConstraintAnchor f;
       ConstraintWidget r1;
       ConstraintAnchor uConstraintA5;
       ConstraintWidget uConstraintW2;
       c uoc6;
       ConstraintWidget uConstraintW4;
       int i12;
       ConstraintWidget r2;
       object oobject3;
       object oobject4;
       ConstraintAnchor uConstraintA7;
       object oobject5;
       int i13;
       c uoc7;
       c uoc8;
       ConstraintAnchor i14;
       int i15;
       int i16;
       object oobject7;
       int i17;
       object oobject8;
       ConstraintWidget uConstraintW5;
       object oobject9;
       object oobject10;
       ConstraintWidget uConstraintW = p0;
       c uoc = p1;
       c uoc1 = p4;
       c a = uoc1.a;
       c c = uoc1.c;
       c b = uoc1.b;
       c d = uoc1.d;
       c e = uoc1.e;
       c k = uoc1.k;
       c uoc2 = 1;
       object oobject = (uConstraintW.U[p2] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT)? 1: null;
       int i = 2;
       if (!p2) {
          b0 = e.B0;
          uConstraintA = (b0 == null)? 1: null;
          uConstraintA1 = (b0 == uoc2)? 1: null;
          if (b0 == i) {
          label_003e :
             uConstraintW1 = 1;
          label_0041 :
             uoc2 = a;
             ConstraintWidget$DimensionBehaviour uDimensionBe = null;
             int i1 = 0;
             while (!uDimensionBe) {
                object oobject1 = uoc2.R[p3];
                i2 = (uConstraintW1)? 1: 4;
                int i3 = oobject1.f();
                uoc3 = k;
                int i4 = uDimensionBe;
                uDimensionBe = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (uoc2.U[p2] == uDimensionBe && !uoc2.r[p2]) {
                   uConstraintA2 = uConstraintA1;
                   uConstraintA3 = 1;
                }else {
                   uConstraintA2 = uConstraintA1;
                   uConstraintA3 = null;
                }
                uConstraintA1 = oobject1.f;
                if (uConstraintA1 != null && uoc2 != a) {
                   i3 = i3 + uConstraintA1.f();
                }
                i5 = i3;
                if (uConstraintW1 && (uoc2 != a && uoc2 != b)) {
                   uConstraintA4 = uConstraintA;
                   i2 = 8;
                }else {
                   uConstraintA4 = uConstraintA;
                }
                uConstraintA = oobject1.f;
                if (uConstraintA != null) {
                   if (uoc2 == b) {
                      uoc4 = e;
                      uoc5 = a;
                      uoc.h(oobject1.i, uConstraintA.i, i5, 6);
                   }else {
                      uoc4 = e;
                      uoc5 = a;
                      uoc.h(oobject1.i, uConstraintA.i, i5, 8);
                   }
                   i6 = (uConstraintA3 && !uConstraintW1)? 5: i2;
                   uoc.e(oobject1.i, oobject1.f.i, i5, i6);
                }else {
                   uoc4 = e;
                   uoc5 = a;
                }
                if (oobject) {
                   if (uoc2.T() != 8 && uoc2.U[p2] == uDimensionBe) {
                      r = uoc2.R;
                      i7 = p3 + 1;
                      i8 = 0;
                      uoc.h(r[i7].i, r[p3].i, i8, 5);
                   }else {
                      i8 = 0;
                   }
                   uoc.h(uoc2.R[p3].i, uConstraintW.R[p3].i, i8, 8);
                }
                i7 = p3 + 1;
                f = uoc2.R[i7].f;
                if (f != null) {
                   f = f.d;
                   r1 = f.R;
                   if (r1[p3].f != null && r1[p3].f.d == uoc2) {
                      i1 = f;
                   }
                }
                if (i1 != null) {
                   uConstraintA5 = i1;
                   i8 = i4;
                }else {
                   uDimensionBe = 1;
                }
                uConstraintA = uConstraintA4;
                k = uoc3;
                uConstraintA1 = uConstraintA2;
                e = uoc4;
                a = uoc5;
             }
             uoc4 = e;
             uoc3 = k;
             uoc5 = a;
             uConstraintA4 = uConstraintA;
             uConstraintA2 = uConstraintA1;
             if (d != null) {
                i7 = p3 + 1;
                if (c.R[i7].f != null) {
                   object oobject2 = d.R[i7];
                   ConstraintAnchor uConstraintA6 = (d.U[p2] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && !d.r[p2])? 1: null;
                   if (uConstraintA6 && !uConstraintW1) {
                      uConstraintA6 = oobject2.f;
                      if (uConstraintA6.d == uConstraintW) {
                         uoc.e(oobject2.i, uConstraintA6.i, (- oobject2.f()), 5);
                      }else if(uConstraintW1 != null){
                         uConstraintA6 = oobject2.f;
                         if (uConstraintA6.d == uConstraintW) {
                            uoc.e(oobject2.i, uConstraintA6.i, (- oobject2.f()), 4);
                         }
                      }
                   }else {
                      goto label_016a ;
                   }
                   uoc.j(oobject2.i, c.R[i7].f.i, (- oobject2.f()), 6);
                label_0195 :
                   if (oobject) {
                      i6 = p3 + 1;
                      r1 = c.R;
                      uoc.h(uConstraintW.R[i6].i, r1[i6].i, r1[i6].f(), 8);
                   }
                   c h = uoc1.h;
                   if (h != null) {
                      i6 = h.size();
                      if (i6 > 1) {
                         float f1 = (uoc1.r != null && uoc1.t == null)? (float)uoc1.j: uoc3;
                         int i9 = 0;
                         uConstraintW2 = i1;
                         i8 = 0;
                         float f2 = 0;
                         while (i8 < i6) {
                            ConstraintWidget uConstraintW3 = h.get(i8);
                            i5 = uConstraintW3.F0[p2];
                            if (i5 - i9 < 0) {
                               if (uoc1.t != null) {
                                  uConstraintW3 = uConstraintW3.R;
                                  i5 = p3 + 1;
                                  uoc.e(uConstraintW3[i5].i, uConstraintW3[p3].i, 0, 4);
                                  i9 = 0;
                               label_0211 :
                                  uoc6 = h;
                               label_024d :
                                  i8 = i8 + 1;
                                  h = uoc6;
                                  i9 = 0;
                                  int i10 = 5;
                               }else {
                                  uConstraintW4 = 0x3f800000;
                               }
                            }else {
                               oobject3 = 4;
                            }
                            if (!uConstraintW4 - i9) {
                               r1 = uConstraintW3.R;
                               int i11 = p3 + 1;
                               uoc.e(r1[i11].i, r1[p3].i, 0, 8);
                               goto label_0211 ;
                            }else if(uConstraintW2 != null){
                               r1 = uConstraintW2.R;
                               i12 = p3 + 1;
                               r2 = uConstraintW3.R;
                               uoc6 = h;
                               b uob = p1.r();
                               uob.o(f2, f1, uConstraintW4, r1[p3].i, r1[i12].i, r2[p3].i, r2[i12].i);
                               uoc.d(uob);
                            }else {
                               uoc6 = h;
                            }
                            uConstraintW2 = uConstraintW3;
                            f2 = uConstraintW4;
                            goto label_024d ;
                         }
                      }
                   }
                   if (b != null && (b == d || uConstraintW1)) {
                      i6 = p3 + 1;
                      oobject4 = c.R[i6];
                      ConstraintAnchor f3 = uoc5.R[p3].f;
                      uConstraintA3 = (f3 != null)? f3.i: i1;
                      f3 = oobject4.f;
                      uConstraintA7 = (f3 != null)? f3.i: i1;
                      oobject5 = b.R[p3];
                      oobject4 = d.R[i6];
                      if (uConstraintA3 != null && uConstraintA7 != null) {
                         r = (!p2)? uoc4.j0: uoc4.k0;
                         p1.c(oobject5.i, uConstraintA3, oobject5.f(), r, uConstraintA7, oobject4.i, oobject4.f(), 7);
                      }
                   }else {
                      a = uoc5;
                      if (uConstraintA4 != null && b != null) {
                         h = uoc1.j;
                         i13 = (h > null && uoc1.i == h)? 1: 0;
                         uoc7 = b;
                         uoc8 = uoc7;
                         while (uoc7 != null) {
                            object oobject6 = uoc7.H0[p2];
                            while (true) {
                               if (oobject6 != null) {
                                  if (oobject6.T() == 8) {
                                     oobject6 = oobject6.H0[p2];
                                  }else if(oobject6 != null || uoc7 == d){
                                     oobject5 = uoc7.R[p3];
                                     i14 = oobject5.i;
                                     f = oobject5.f;
                                     f = (f != null)? f.i: i1;
                                     if (uoc8 != uoc7) {
                                        i7 = p3 + 1;
                                        f = uoc8.R[i7].i;
                                     }else if(uoc7 == b && uoc8 == uoc7){
                                        r = a.R;
                                        f = (r[p3].f != null)? r[p3].f.i: i1;
                                     }
                                     i15 = oobject5.f();
                                     i16 = p3 + 1;
                                     i7 = uoc7.R[i16].f();
                                     if (oobject6 != null) {
                                        oobject7 = oobject6.R[p3];
                                        uConstraintA5 = uoc7.R[i16].i;
                                        uConstraintA6 = oobject7.i;
                                     }else {
                                        oobject7 = c.R[i16].f;
                                        uConstraintA6 = (oobject7 != null)? oobject7.i: i1;
                                        uConstraintA5 = uoc7.R[i16].i;
                                     }
                                     if (oobject7 != null) {
                                        i7 = i7 + oobject7.f();
                                     }
                                     if (uoc8 != null) {
                                        i15 = i15 + uoc8.R[i16].f();
                                     }
                                     if (i14 != null && (f != null && (uConstraintA6 != null && uConstraintA5 != null))) {
                                        if (uoc7 == b) {
                                           i15 = b.R[p3].f();
                                        }
                                        i = i15;
                                        i12 = (uoc7 == d)? d.R[i16].f(): i7;
                                        i17 = (i13)? 8: 5;
                                        oobject8 = oobject6;
                                        p1.c(i14, f, i, 0x3f000000, uConstraintA6, uConstraintA5, i12, i17);
                                     label_0392 :
                                        if (uoc7.T() != 8) {
                                           uoc8 = uoc7;
                                        }
                                        uoc7 = oobject8;
                                     }
                                  }
                               label_02df :
                                  oobject8 = oobject6;
                                  goto label_0392 ;
                               }else {
                                  r2 = 8;
                                  goto label_02da ;
                               }
                            }
                         }
                      }else {
                         ConstraintAnchor uConstraintA8 = 8;
                         if (uConstraintA2 != null && b != null) {
                            h = uoc1.j;
                            i13 = (h > null && uoc1.i == h)? 1: 0;
                            uoc7 = b;
                            uoc8 = uoc7;
                            for (; uoc7 != null; oobject9 = uConstraintW) {
                               oobject5 = uoc7.H0[p2];
                               while (oobject5 != null && oobject5.T() == uConstraintA8) {
                                  oobject5 = oobject5.H0[p2];
                               }
                               if (uoc7 != b && (uoc7 != d && oobject5 != null)) {
                                  uConstraintW2 = (oobject5 == d)? i1: oobject5;
                                  oobject5 = uoc7.R[p3];
                                  i14 = oobject5.i;
                                  i7 = p3 + 1;
                                  f = uoc8.R[i7].i;
                                  i15 = oobject5.f();
                                  i16 = uoc7.R[i7].f();
                                  if (uConstraintW2 != null) {
                                     oobject7 = uConstraintW2.R[p3];
                                     uConstraintA6 = oobject7.i;
                                     uConstraintA8 = oobject7.f;
                                     if (uConstraintA8 != null) {
                                        uConstraintA8 = uConstraintA8.i;
                                     }else {
                                        uConstraintA8 = i1;
                                     }
                                  }else {
                                     oobject7 = d.R[p3];
                                     uConstraintA6 = (oobject7 != null)? oobject7.i: i1;
                                     uConstraintA8 = uoc7.R[i7].i;
                                  }
                                  if (oobject7 != null) {
                                     i16 = i16 + oobject7.f();
                                  }
                                  i12 = i16;
                                  i7 = uoc8.R[i7].f() + i15;
                                  i17 = (i13)? 8: 4;
                                  if (i14 != null && (f != null && (uConstraintA6 != null && uConstraintA8 != null))) {
                                     uConstraintW5 = uConstraintW2;
                                     uoc6 = uoc8;
                                     uoc8 = 8;
                                     p1.c(i14, f, i7, 0x3f000000, uConstraintA6, uConstraintA8, i12, i17);
                                  }else {
                                     uConstraintW5 = uConstraintW2;
                                     uoc6 = uoc8;
                                     uoc8 = 8;
                                     i2 = 4;
                                  }
                                  uConstraintW = uConstraintW5;
                               }else {
                                  uoc6 = uoc8;
                                  uoc8 = 8;
                                  i2 = 4;
                               }
                               if (uoc7.T() == uoc8) {
                                  uoc7 = uoc6;
                               }
                               uoc8 = uoc7;
                               uConstraintA8 = 8;
                            }
                            oobject5 = b.R[p3];
                            i14 = a.R[p3].f;
                            i7 = p3 + 1;
                            oobject3 = d.R[i7];
                            uConstraintA = c.R[i7].f;
                            if (i14 != null) {
                               if (b != d) {
                                  uoc.e(oobject5.i, i14.i, oobject5.f(), 5);
                               }else {
                                  i5 = 5;
                                  if (uConstraintA != null) {
                                     p1.c(oobject5.i, i14.i, oobject5.f(), 0x3f000000, oobject3.i, uConstraintA.i, oobject3.f(), 5);
                                  }
                               }
                            }else {
                               i5 = 5;
                            }
                            if (uConstraintA != null && b != d) {
                               uoc.e(oobject3.i, uConstraintA.i, (- oobject3.f()), 5);
                            }
                         }
                      }
                   }
                   if (uConstraintA4 != null || (uConstraintA2 != null && (b != null && b != d))) {
                      uConstraintW = b.R;
                      oobject4 = uConstraintW[p3];
                      i7 = p3 + 1;
                      oobject2 = d.R[i7];
                      ConstraintAnchor f4 = oobject4.f;
                      f4 = (f4 != null)? f4.i: i1;
                      uConstraintA7 = oobject2.f;
                      uConstraintA7 = (uConstraintA7 != null)? uConstraintA7.i: i1;
                      if (c != d) {
                         uConstraintA7 = c.R[i7].f;
                         if (uConstraintA7 != null) {
                            i1 = uConstraintA7.i;
                         }
                         uConstraintA7 = i1;
                      }
                      if (b == d) {
                         oobject4 = uConstraintW[p3];
                         oobject2 = uConstraintW[i7];
                      }
                      if (f4 != null && uConstraintA7 != null) {
                         p1.c(oobject4.i, f4, oobject4.f(), 0x3f000000, uConstraintA7, oobject2.i, d.R[i7].f(), 5);
                      }
                   }
                label_0521 :
                   return;
                }
             }
             a = 5;
             goto label_0195 ;
          }
       }else {
          b0 = e.C0;
          uConstraintA = (b0 == null)? 1: null;
          uConstraintA1 = (b0 == uoc2)? 1: null;
          if (b0 == i) {
             goto label_003e ;
          }
       }
       uConstraintW1 = null;
       goto label_0041 ;
    }
    public static void b(d p0,c p1,ArrayList p2,int p3){
       d y0;
       d b1;
       int i1;
       int i = 0;
       if (!p3) {
          y0 = p0.Y0;
          b1 = p0.b1;
          i1 = 0;
       }else {
          y0 = p0.Z0;
          b1 = p0.a1;
          i1 = 2;
       }
       while (i < y0) {
          object oobject = b1[i];
          oobject.a();
          if (p2 == null || p2.contains(oobject.a)) {
             b.a(p0, p1, p3, i1, oobject);
          }
          i = i + 1;
       }
       return;
    }
}
