package androidx.constraintlayout.solver.widgets.e;
import androidx.constraintlayout.solver.widgets.h;
import java.util.ArrayList;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import java.lang.Math;
import java.lang.Object;
import java.util.Arrays;
import androidx.constraintlayout.solver.widgets.e$a;
import androidx.constraintlayout.solver.c;
import androidx.constraintlayout.solver.widgets.d;
import java.util.HashMap;
import h1.b;

public class e extends h	// class@0006a0
{
    public int A1;
    public int c1;
    public int d1;
    public int e1;
    public int f1;
    public int g1;
    public int h1;
    public float i1;
    public float j1;
    public float k1;
    public float l1;
    public float m1;
    public float n1;
    public int o1;
    public int p1;
    public int q1;
    public int r1;
    public int s1;
    public int t1;
    public int u1;
    public ArrayList v1;
    public ConstraintWidget[] w1;
    public ConstraintWidget[] x1;
    public int[] y1;
    public ConstraintWidget[] z1;

    public void e(){
       super();
       this.c1 = -1;
       this.d1 = -1;
       this.e1 = -1;
       this.f1 = -1;
       this.g1 = -1;
       this.h1 = -1;
       this.i1 = 0x3f000000;
       this.j1 = 0x3f000000;
       this.k1 = 0x3f000000;
       this.l1 = 0x3f000000;
       this.m1 = 0x3f000000;
       this.n1 = 0x3f000000;
       this.o1 = 0;
       this.p1 = 0;
       this.q1 = 2;
       this.r1 = 2;
       this.s1 = 0;
       this.t1 = -1;
       this.u1 = 0;
       this.v1 = new ArrayList();
       this.w1 = null;
       this.x1 = null;
       this.y1 = null;
       this.A1 = 0;
    }
    public final void B1(boolean p0){
       int i3;
       object oobject;
       object oobject1;
       if (this.y1 == null || (this.x1 != null && this.w1 != null)) {
          for (int i = 0; i < this.A1; i = i + 1) {
             this.z1[i].l0();
          }
          e ty1 = this.y1;
          int i1 = ty1[0];
          i = ty1[1];
          ConstraintWidget uConstraintW = null;
          int i2 = 0;
          ConstraintWidget uConstraintW1 = 8;
          while (i2 < i1) {
             if (p0) {
                i3 = i1 - i2;
                i3 = i3 - 1;
             }else {
                i3 = i2;
             }
             oobject = this.x1[i3];
             if (oobject != null && oobject.T() != uConstraintW1) {
                if (!i2) {
                   oobject.k(oobject.J, this.J, this.l1());
                   oobject.B0(this.c1);
                   oobject.A0(this.i1);
                }
                int i4 = i1 - 1;
                if (i2 == i4) {
                   oobject.k(oobject.L, this.L, this.m1());
                }
                if (i2 > 0) {
                   oobject.k(oobject.J, uConstraintW.L, this.o1);
                   uConstraintW.k(uConstraintW.L, oobject.J, 0);
                }
                uConstraintW = oobject;
             }
             i2 = i2 + 1;
          }
          int i5 = 0;
          while (i5 < i) {
             oobject1 = this.w1[i5];
             if (oobject1 != null && oobject1.T() != uConstraintW1) {
                if (!i5) {
                   oobject1.k(oobject1.K, this.K, this.n1());
                   oobject1.S0(this.d1);
                   oobject1.R0(this.j1);
                }
                i3 = i - 1;
                if (i5 == i3) {
                   oobject1.k(oobject1.M, this.M, this.k1());
                }
                if (i5 > 0) {
                   oobject1.k(oobject1.K, uConstraintW.M, this.p1);
                   uConstraintW.k(uConstraintW.M, oobject1.K, 0);
                }
                uConstraintW = oobject1;
             }
             i5++;
          }
          i5 = 0;
          while (i5 < i1) {
             int i6 = 0;
             while (i6 < i) {
                i2 = i6 * i1;
                i2 = i2 + i5;
                if (this.u1 == 1) {
                   i2 = i5 * i;
                   i2 = i2 + i6;
                }
                e tz1 = this.z1;
                if (i2 < tz1.length) {
                   oobject1 = tz1[i2];
                   if (oobject1 != null && oobject1.T() != uConstraintW1) {
                      oobject = this.x1[i5];
                      object oobject2 = this.w1[i6];
                      if (oobject1 != oobject) {
                         oobject1.k(oobject1.J, oobject.J, 0);
                         oobject1.k(oobject1.L, oobject.L, 0);
                      }
                      if (oobject1 != oobject2) {
                         oobject1.k(oobject1.K, oobject2.K, 0);
                         oobject1.k(oobject1.M, oobject2.M, 0);
                      }
                   }
                }
                i6 = i6 + 1;
             }
             i5++;
          }
       }
       return;
    }
    public final int C1(ConstraintWidget p0,int p1){
       int i = 0;
       if (p0 == null) {
          return i;
       }
       if (p0.R() == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
          ConstraintWidget q = p0.q;
          if (q == null) {
             return i;
          }else if(q == 2){
             p1 = (int)(p0.x * (float)p1);
             if (p1 != p0.y()) {
                p0.M0(true);
                this.p1(p0, p0.B(), p0.U(), ConstraintWidget$DimensionBehaviour.FIXED, p1);
             }
             return p1;
          }else if(q == true){
             return p0.y();
          }else if(q == 3){
             return (int)(((float)p0.U() * p0.Y) + 0x3f000000);
          }
       }
       return p0.y();
    }
    public final int D1(ConstraintWidget p0,int p1){
       int i = 0;
       if (p0 == null) {
          return i;
       }
       if (p0.B() == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
          ConstraintWidget p = p0.p;
          if (p == null) {
             return i;
          }else if(p == 2){
             p1 = (int)(p0.u * (float)p1);
             if (p1 != p0.U()) {
                p0.M0(true);
                this.p1(p0, ConstraintWidget$DimensionBehaviour.FIXED, p1, p0.R(), p0.y());
             }
             return p1;
          }else if(p == true){
             return p0.U();
          }else if(p == 3){
             return (int)(((float)p0.y() * p0.Y) + 0x3f000000);
          }
       }
       return p0.U();
    }
    public final void E1(ConstraintWidget[] p0,int p1,int p2,int p3,int[] p4){
       int i3;
       int i4;
       object oobject;
       e uoe1;
       int i5;
       e uoe3;
       e uoe4;
       e uoe5;
       int i6;
       ConstraintWidget[] uConstraintW;
       int i8;
       object oobject1;
       e uoe = this;
       int i = p1;
       int i1 = p2;
       int i2 = p3;
       if (!i1) {
          e t1 = uoe.t1;
          if (t1 <= null) {
             t1 = 0;
             i3 = 0;
             i4 = 0;
             while (i3 < i) {
                if (i3 > 0) {
                   i4 = i4 + uoe.o1;
                }
                oobject = p0[i3];
                if (oobject != null) {
                   i4 = i4 + uoe.D1(oobject, i2);
                   if (i4 <= i2) {
                      i5 = t1 + 1;
                   }
                }
                i3 = i3 + 1;
             }
          }
          uoe1 = t1;
          i5 = 0;
       }else {
          i5 = uoe.t1;
          if (i5 <= null) {
             i5 = null;
             i3 = 0;
             i4 = 0;
             while (i3 < i) {
                if (i3 > 0) {
                   i4 = i4 + uoe.p1;
                }
                oobject = p0[i3];
                if (oobject != null) {
                   i4 = i4 + uoe.C1(oobject, i2);
                   if (i4 <= i2) {
                      i5 = i5 + 1;
                   }
                }
                i3 = i3 + 1;
             }
          }
          uoe1 = null;
       }
       if (uoe.y1 == null) {
          int[] ointArray = new int[2];
          uoe.y1 = ointArray;
       }
       e uoe2 = 1;
       if (i5 || (i1 == uoe2 || (uoe1 == null && !i1))) {
          uoe3 = uoe;
          uoe4 = i5;
          uoe5 = uoe1;
          i3 = p4;
          i5 = i2;
          i2 = i1;
          i1 = i;
          i = p0;
       label_0140 :
          i6 = 1;
          while (!i6) {
             if (!i2) {
                float f = (float)i1 / (float)uoe5;
                uoe4 = (int)Math.ceil((double)f);
             }else {
                float f1 = (float)i1 / (float)uoe4;
                uoe5 = (int)Math.ceil((double)f1);
             }
             e x1 = uoe3.x1;
             e uoe6 = null;
             if (x1 == null || x1.length < uoe5) {
                uConstraintW = new ConstraintWidget[uoe5];
                uoe3.x1 = uConstraintW;
             }else {
                Arrays.fill(x1, uoe6);
             }
             x1 = uoe3.w1;
             if (x1 == null || x1.length < uoe4) {
                uConstraintW = new ConstraintWidget[uoe4];
                uoe3.w1 = uConstraintW;
             }else {
                Arrays.fill(x1, uoe6);
             }
             int i7 = 0;
             while (i7 < uoe5) {
                i8 = 0;
                while (i8 < uoe4) {
                   int i9 = i8 * uoe5;
                   i9 = i9 + i7;
                   if (i2 == uoe2) {
                      i9 = i7 * uoe4;
                      i9 = i9 + i8;
                   }
                   if (i9 < i.length) {
                      oobject1 = i[i9];
                      if (oobject1 != null) {
                         int i10 = uoe3.D1(oobject1, i5);
                         uoe2 = uoe3.x1;
                         if (uoe2[i7] == null || uoe2[i7].U() < i10) {
                            uoe3.x1[i7] = oobject1;
                         }
                         i4 = uoe3.C1(oobject1, i5);
                         e w1 = uoe3.w1;
                         if (w1[i8] == null || w1[i8].y() < i4) {
                            uoe3.w1[i8] = oobject1;
                         }
                      }
                   }
                   i8 = i8 + 1;
                   uoe2 = 1;
                }
                i7 = i7 + 1;
                uoe2 = 1;
             }
             i4 = 0;
             i7 = 0;
             while (i4 < uoe5) {
                object oobject2 = uoe3.x1[i4];
                if (oobject2 != null) {
                   if (i4 > 0) {
                      i7 = i7 + uoe3.o1;
                   }
                   i7 = i7 + uoe3.D1(oobject2, i5);
                }
                i4 = i4 + 1;
             }
             i4 = 0;
             i8 = 0;
             while (i4 < uoe4) {
                oobject1 = uoe3.w1[i4];
                if (oobject1 != null) {
                   if (i4 > 0) {
                      i8 = i8 + uoe3.p1;
                   }
                   i8 = i8 + uoe3.C1(oobject1, i5);
                }
                i4 = i4 + 1;
             }
             i3[0] = i7;
             uoe2 = 1;
             i3[uoe2] = i8;
             if (!i2) {
                if (i7 > i5 && uoe5 > uoe2) {
                   uoe5 = uoe5 - 1;
                }else {
                   goto label_0140 ;
                }
             }else if(i8 > i5 && uoe4 > uoe2){
                uoe4 = uoe4 - 1;
             }else {
                goto label_0140 ;
             }
          }
          e y1 = uoe3.y1;
          y1[0] = uoe5;
          y1[uoe2] = uoe4;
          return;
       }else {
          uoe3 = uoe;
          uoe4 = i5;
          uoe5 = uoe1;
          i6 = 0;
          i3 = p4;
          i5 = i2;
          i2 = i1;
          i1 = i;
          i = p0;
          goto label_0078 ;
       }
    }
    public final void F1(ConstraintWidget[] p0,int p1,int p2,int p3,int[] p4){
       int i2;
       int this;
       int i3;
       object oobject;
       int i4;
       int i5;
       e uoe1;
       e t1;
       int i6;
       int i10;
       int i12;
       ConstraintWidget uConstraintW2;
       ConstraintWidget uConstraintW3;
       ConstraintWidget uConstraintW4;
       int i13;
       int i14;
       Object obj1;
       e uoe = this;
       int i = p1;
       int i1 = p3;
       if (!i) {
          return;
       }
       uoe.v1.clear();
       e$a uoa = new e$a(this, p2, uoe.J, uoe.K, uoe.L, uoe.M, p3);
       uoe.v1.add(v10);
       if (!p2) {
          i2 = 0;
          this = 0;
          i3 = 0;
          while (i3 < i) {
             oobject = p0[i3];
             i4 = uoe.D1(oobject, i1);
             if (oobject.B() == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                i2 = i2 + 1;
             }
             i5 = i2;
             if (this != i1) {
                i2 = uoe.o1 + this;
                i2 = i2 + i4;
                if (i2 <= i1) {
                label_0051 :
                   uoe1 = null;
                label_0052 :
                   if (!uoe1 && i3 > 0) {
                      t1 = uoe.t1;
                      if (t1 > null) {
                         i6 = i3 % t1;
                         if (!i6) {
                            uoe1 = 1;
                         }
                      }
                   }
                   if (uoe1) {
                      uoa = new e$a(this, p2, uoe.J, uoe.K, uoe.L, uoe.M, p3);
                      v10.h(i3);
                      uoe.v1.add(v10);
                   }else if(i3 > 0){
                      i2 = uoe.o1 + i4;
                      this = this + i2;
                   label_0086 :
                      v10.a(oobject);
                      i3 = i3 + 1;
                      i2 = i5;
                   }
                   this = i4;
                   goto label_0086 ;
                }
             }
             if (v10.b != null) {
                uoe1 = 1;
                goto label_0052 ;
             }else {
                goto label_0051 ;
             }
          }
       }else {
          i2 = 0;
          this = 0;
          i3 = 0;
          while (i3 < i) {
             oobject = p0[i3];
             i4 = uoe.C1(oobject, i1);
             if (oobject.R() == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                i2 = i2 + 1;
             }
             i5 = i2;
             if (this != i1) {
                i2 = uoe.p1 + this;
                i2 = i2 + i4;
                if (i2 <= i1) {
                label_00b1 :
                   uoe1 = null;
                label_00b2 :
                   if (!uoe1 && i3 > 0) {
                      t1 = uoe.t1;
                      if (t1 > null) {
                         i6 = i3 % t1;
                         if (!i6) {
                            uoe1 = 1;
                         }
                      }
                   }
                   if (uoe1) {
                      uoa = new e$a(this, p2, uoe.J, uoe.K, uoe.L, uoe.M, p3);
                      v10.h(i3);
                      uoe.v1.add(v10);
                   }else if(i3 > 0){
                      i2 = uoe.p1 + i4;
                      this = this + i2;
                   label_00e6 :
                      v10.a(oobject);
                      i3 = i3 + 1;
                      i2 = i5;
                   }
                   this = i4;
                   goto label_00e6 ;
                }
             }
             if (v10.b != null) {
                uoe1 = 1;
                goto label_00b2 ;
             }else {
                goto label_00b1 ;
             }
          }
       }
       this = uoe.v1.size();
       ConstraintWidget j = uoe.J;
       ConstraintWidget k = uoe.K;
       ConstraintWidget l = uoe.L;
       ConstraintWidget m = uoe.M;
       int i7 = this.l1();
       int i8 = this.n1();
       i = this.m1();
       int i9 = this.k1();
       ConstraintWidget$DimensionBehaviour wRAP_CONTENT = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
       e uoe2 = (this.B() == wRAP_CONTENT || this.R() == wRAP_CONTENT)? 1: null;
       if (i2 > 0 && uoe2) {
          i2 = 0;
          while (i2 < this) {
             e$a uoa1 = uoe.v1.get(i2);
             if (!p2) {
                i10 = i1 - uoa1.e();
                uoa1.f(i10);
             }else {
                i10 = i1 - uoa1.d();
                uoa1.f(i10);
             }
             i2 = i2 + 1;
          }
       }
       int i11 = i8;
       i2 = i;
       i10 = 0;
       ConstraintWidget uConstraintW = null;
       i5 = 0;
       i8 = i7;
       ConstraintWidget uConstraintW1 = k;
       k = j;
       i6 = i9;
       while (i5 < this) {
          Object obj = uoe.v1.get(i5);
          if (!p2) {
             i6 = this - 1;
             if (i5 < i6) {
                i12 = i5 + 1;
                j = uoe.v1.get(i12).b.K;
                m = null;
             }else {
                j = uoe.M;
                i12 = this.k1();
             }
             uConstraintW2 = obj.b.M;
             p0 = obj;
             uConstraintW3 = k;
             uConstraintW4 = l;
             i13 = i5;
             obj.i(p2, k, uConstraintW1, l, j, i8, i11, i2, m, p3);
             i14 = Math.max(i10, p0.e());
             uConstraintW = uConstraintW + p0.d();
             if (i13 > 0) {
                uConstraintW = uConstraintW + uoe.p1;
             }
             i10 = i14;
             uConstraintW1 = uConstraintW2;
             uConstraintW2 = uConstraintW4;
             i11 = 0;
             k = uConstraintW3;
             m = j;
             i6 = m;
          }else {
             uConstraintW3 = k;
             p0 = obj;
             i14 = i10;
             ConstraintWidget uConstraintW5 = uConstraintW;
             i13 = i5;
             i = this - 1;
             if (i13 < i) {
                i5 = i13 + 1;
                obj1 = p0;
                uConstraintW2 = uoe.v1.get(i5).b.J;
                uConstraintW4 = null;
             }else {
                obj1 = p0;
                uConstraintW2 = uoe.L;
                int i15 = this.m1();
             }
             ConstraintWidget uConstraintW6 = obj1.b.L;
             Object obj2 = obj1;
             obj1.i(p2, uConstraintW3, uConstraintW1, uConstraintW2, m, i8, i11, uConstraintW4, i6, p3);
             i10 = i14 + obj2.e();
             i2 = Math.max(uConstraintW5, obj2.d());
             if (i13 > 0) {
                i10 = i10 + uoe.o1;
             }
             uConstraintW = i2;
             i2 = uConstraintW4;
             k = uConstraintW6;
             i8 = 0;
          }
          i5 = i13 + 1;
          l = uConstraintW2;
       }
       p4[0] = i10;
       p4[1] = uConstraintW;
       return;
    }
    public final void G1(ConstraintWidget[] p0,int p1,int p2,int p3,int[] p4){
       e$a uoa;
       e uoe = this;
       int i = p1;
       if (!i) {
          return;
       }
       if (!uoe.v1.size()) {
          uoa = new e$a(this, p2, uoe.J, uoe.K, uoe.L, uoe.M, p3);
          uoe.v1.add(v11);
       }else {
          uoa = uoe.v1.get(0);
          uoa.b();
          e$a uoa1 = uoa;
          uoa1.i(p2, uoe.J, uoe.K, uoe.L, uoe.M, this.l1(), this.n1(), this.m1(), this.k1(), p3);
       }
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          v11.a(p0[i1]);
       }
       p4[0] = v11.e();
       p4[1] = v11.d();
       return;
    }
    public void H1(float p0){
       this.k1 = p0;
    }
    public void I1(int p0){
       this.e1 = p0;
    }
    public void J1(float p0){
       this.l1 = p0;
    }
    public void K1(int p0){
       this.f1 = p0;
    }
    public void L1(int p0){
       this.q1 = p0;
    }
    public void M1(float p0){
       this.i1 = p0;
    }
    public void N1(int p0){
       this.o1 = p0;
    }
    public void O1(int p0){
       this.c1 = p0;
    }
    public void P1(float p0){
       this.m1 = p0;
    }
    public void Q1(int p0){
       this.g1 = p0;
    }
    public void R1(float p0){
       this.n1 = p0;
    }
    public void S1(int p0){
       this.h1 = p0;
    }
    public void T1(int p0){
       this.t1 = p0;
    }
    public void U1(int p0){
       this.u1 = p0;
    }
    public void V1(int p0){
       this.r1 = p0;
    }
    public void W1(float p0){
       this.j1 = p0;
    }
    public void X1(int p0){
       this.p1 = p0;
    }
    public void Y1(int p0){
       this.d1 = p0;
    }
    public void Z1(int p0){
       this.s1 = p0;
    }
    public void g(c p0,boolean p1){
       super.g(p0, p1);
       boolean b = (this.L() != null)? this.L().B1(): false;
       e ts1 = this.s1;
       boolean b1 = true;
       if (ts1 != null) {
          if (ts1 != b1) {
             if (ts1 == 2) {
                this.B1(b);
             }
          }else {
             int i = this.v1.size();
             for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                e$a uoa = this.v1.get(i1);
                boolean i2 = i - 1;
                i2 = (i1 == i2)? true: false;
                uoa.c(b, i1, i2);
             }
          }
       }else if(this.v1.size() > 0){
          this.v1.get(false).c(b, false, b1);
       }
       this.s1(false);
       return;
    }
    public void m(ConstraintWidget p0,HashMap p1){
       super.m(p0, p1);
       this.c1 = p0.c1;
       this.d1 = p0.d1;
       this.e1 = p0.e1;
       this.f1 = p0.f1;
       this.g1 = p0.g1;
       this.h1 = p0.h1;
       this.i1 = p0.i1;
       this.j1 = p0.j1;
       this.k1 = p0.k1;
       this.l1 = p0.l1;
       this.m1 = p0.m1;
       this.n1 = p0.n1;
       this.o1 = p0.o1;
       this.p1 = p0.p1;
       this.q1 = p0.q1;
       this.r1 = p0.r1;
       this.s1 = p0.s1;
       this.t1 = p0.t1;
       this.u1 = p0.u1;
    }
    public void o1(int p0,int p1,int p2,int p3){
       ConstraintWidget[] uConstraintW;
       int[] ointArray1;
       int this;
       b uob = this;
       int i = p0;
       int i1 = p1;
       int i2 = p2;
       int i3 = p3;
       int i4 = 0;
       if (uob.O0 > null && !this.q1()) {
          uob.t1(i4, i4);
          uob.s1(i4);
          return;
       }else {
          int i5 = this.l1();
          int i6 = this.m1();
          int i7 = this.n1();
          int i8 = this.k1();
          int[] ointArray = new int[2];
          int i9 = (i1 - i5) - i6;
          e u1 = uob.u1;
          if (u1 == 1) {
             i9 = (i3 - i7) - i8;
          }
          int i10 = i9;
          b uob1 = -1;
          if (u1 == null) {
             if (uob.c1 == uob1) {
                uob.c1 = i4;
             }
             if (uob.d1 == uob1) {
                uob.d1 = i4;
             }
          }else if(uob.c1 == uob1){
             uob.c1 = i4;
          }
          if (uob.d1 == uob1) {
             uob.d1 = i4;
          }
          uob1 = uob.N0;
          int i11 = 0;
          int i12 = 0;
          b o0 = uob.O0;
          e uoe = 8;
          while (i11 < o0) {
             if (uob.N0[i11].T() == uoe) {
                i12 = i12 + 1;
             }
             i11 = i11 + 1;
             uoe = 2;
          }
          if (i12 > 0) {
             uConstraintW = new ConstraintWidget[(o0 - i12)];
             i11 = 0;
             i12 = 0;
             while (i11 < uob.O0) {
                object oobject = uob.N0[i11];
                if (oobject.T() != uoe) {
                   uConstraintW[i12] = oobject;
                   i12 = i12 + 1;
                }
                i11 = i11 + 1;
                int i13 = 1;
             }
             i11 = i12;
          }else {
             b uob2 = o0;
          }
          uob.z1 = uConstraintW;
          uob.A1 = i11;
          uoe = uob.s1;
          if (uoe != null) {
             if (uoe != 1) {
                if (uoe != 2) {
                   ointArray1 = ointArray;
                   i4 = 1;
                label_00cc :
                   i9 = (ointArray1[0] + i5) + i6;
                   i11 = (ointArray1[i4] + i7) + i8;
                   if (i == 0x40000000) {
                      i9 = i1;
                   }else if(i == Integer.MIN_VALUE){
                      i9 = Math.min(i9, i1);
                   }else if(!i){
                      i9 = 0;
                   }
                   if (i2 == 0x40000000) {
                      i11 = i3;
                   }else if(i2 == Integer.MIN_VALUE){
                      i11 = Math.min(i11, i3);
                   }else if(!i2){
                      i11 = 0;
                   }
                   uob.t1(i9, i11);
                   uob.Y0(i9);
                   uob.z0(i11);
                   if (uob.O0 <= null) {
                      i4 = false;
                   }
                   uob.s1(i4);
                   return;
                }else {
                   i4 = 1;
                   ointArray1 = ointArray;
                   this.E1(uConstraintW, i11, uob.u1, i10, ointArray);
                }
             }else {
                ointArray1 = ointArray;
                i4 = 1;
                this.F1(uConstraintW, i11, uob.u1, i10, ointArray);
             }
          }else {
             ointArray1 = ointArray;
             i4 = 1;
             this.G1(uConstraintW, i11, uob.u1, i10, ointArray);
          }
          this = 0;
          goto label_00cc ;
       }
    }
}
