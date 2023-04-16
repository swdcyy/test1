package androidx.constraintlayout.solver.widgets.d;
import h1.c;
import i1.b;
import i1.e;
import androidx.constraintlayout.solver.c;
import androidx.constraintlayout.solver.widgets.c;
import i1.b$a;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import i1.b$b;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Math;
import f1.b;
import androidx.constraintlayout.solver.widgets.g;
import i1.f;
import androidx.constraintlayout.solver.widgets.f;
import androidx.constraintlayout.solver.widgets.a;
import androidx.constraintlayout.solver.widgets.h;
import i1.g;
import java.lang.ref.WeakReference;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.SolverVariable;
import java.lang.Exception;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.String;
import java.io.PrintStream;
import f1.a;
import java.util.HashSet;
import java.util.Iterator;
import androidx.constraintlayout.solver.widgets.b;
import java.util.Arrays;

public class d extends c	// class@00069e
{
    public b O0;
    public e P0;
    public b$b Q0;
    public boolean R0;
    public b S0;
    public c T0;
    public int U0;
    public int V0;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public c[] a1;
    public c[] b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public int f1;
    public int g1;
    public int h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public int l1;
    public WeakReference m1;
    public WeakReference n1;
    public WeakReference o1;
    public WeakReference p1;
    public b$a q1;
    public static int r1;

    public void d(){
       super();
       this.O0 = new b(this);
       this.P0 = new e(this);
       this.Q0 = null;
       this.R0 = false;
       this.T0 = new c();
       this.Y0 = 0;
       this.Z0 = 0;
       c[] uocArray = new c[4];
       this.a1 = uocArray;
       c[] uocArray1 = new c[4];
       this.b1 = uocArray1;
       this.c1 = false;
       this.d1 = false;
       this.e1 = false;
       this.f1 = 0;
       this.g1 = 0;
       this.h1 = 257;
       this.i1 = false;
       this.j1 = false;
       this.k1 = false;
       this.l1 = 0;
       this.m1 = null;
       this.n1 = null;
       this.o1 = null;
       this.p1 = null;
       this.q1 = new b$a();
    }
    public static boolean E1(ConstraintWidget p0,b$b p1,b$a p2,int p3){
       b$a c;
       b$a d;
       boolean b = false;
       if (p1 == null) {
          return b;
       }
       p2.a = p0.B();
       p2.b = p0.R();
       p2.c = p0.U();
       p2.d = p0.y();
       p2.i = b;
       p2.j = p3;
       ConstraintWidget$DimensionBehaviour mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
       ConstraintWidget$DimensionBehaviour uDimensionBe = (p2.a == mATCH_CONSTR)? 1: null;
       mATCH_CONSTR = (p2.b == mATCH_CONSTR)? 1: null;
       int i = 0;
       ConstraintWidget uConstraintW = (uDimensionBe && p0.Y - i > 0)? 1: null;
       i = (mATCH_CONSTR && p0.Y - i > 0)? 1: 0;
       if (uDimensionBe && (p0.Y(b) && (p0.p == null && !uConstraintW))) {
          p2.a = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
          if (mATCH_CONSTR && p0.q == null) {
             p2.a = ConstraintWidget$DimensionBehaviour.FIXED;
          }
          uDimensionBe = null;
       }
    label_0065 :
       if (mATCH_CONSTR && (p0.Y(1) && (p0.q == null && !i))) {
          p2.b = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
          if (uDimensionBe != null && p0.p == null) {
             p2.b = ConstraintWidget$DimensionBehaviour.FIXED;
          }
          mATCH_CONSTR = null;
       }
    label_0082 :
       if (p0.h0()) {
          p2.a = ConstraintWidget$DimensionBehaviour.FIXED;
          uDimensionBe = null;
       }
       if (p0.i0()) {
          p2.b = ConstraintWidget$DimensionBehaviour.FIXED;
          mATCH_CONSTR = null;
       }
       if (uConstraintW) {
          if (p0.r[b] == 4) {
             p2.a = ConstraintWidget$DimensionBehaviour.FIXED;
          }else if(mATCH_CONSTR == null){
             mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.FIXED;
             if (p2.b == mATCH_CONSTR) {
                d = p2.d;
             }else {
                p2.a = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                p1.b(p0, p2);
                d = p2.f;
             }
             p2.a = mATCH_CONSTR;
             ConstraintWidget z1 = p0.Z;
             if (z1 == null || z1 == -1) {
                p2.c = (int)(p0.w() * (float)d);
             }else {
                p2.c = (int)(p0.w() / (float)d);
             }
          }
       }
       if (i) {
          if (p0.r[1] == 4) {
             p2.b = ConstraintWidget$DimensionBehaviour.FIXED;
          }else if(uDimensionBe == null){
             ConstraintWidget$DimensionBehaviour fIXED = ConstraintWidget$DimensionBehaviour.FIXED;
             if (p2.a == fIXED) {
                c = p2.c;
             }else {
                p2.b = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                p1.b(p0, p2);
                c = p2.e;
             }
             p2.b = fIXED;
             ConstraintWidget z = p0.Z;
             if (z == null || z == -1) {
                p2.d = (int)((float)c / p0.w());
             }else {
                p2.d = (int)((float)c * p0.w());
             }
          }
       }
       p1.b(p0, p2);
       p0.Y0(p2.e);
       p0.z0(p2.f);
       p0.y0(p2.h);
       p0.o0(p2.g);
       p2.j = b$a.k;
       return p2.i;
    }
    public boolean A1(){
       return this.k1;
    }
    public boolean B1(){
       return this.R0;
    }
    public boolean C1(){
       return this.j1;
    }
    public long D1(int p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       d uod = this;
       int i = p7;
       uod.U0 = i;
       int i1 = p8;
       uod.V0 = i1;
       uod.O0.d(this, p0, i, i1, p1, p2, p3, p4, p5, p6);
       return 0;
    }
    public boolean F1(int p0){
       boolean b = ((this.h1 & p0) == p0)? true: false;
       return b;
    }
    public final void G1(){
       this.Y0 = 0;
       this.Z0 = 0;
    }
    public void H1(b$b p0){
       this.Q0 = p0;
       this.P0.n(p0);
    }
    public void I1(int p0){
       this.h1 = p0;
       c.r = this.F1(512);
    }
    public void J1(boolean p0){
       this.R0 = p0;
    }
    public void K1(c p0,boolean[] p1){
       boolean b = false;
       p1[2] = b;
       boolean b1 = this.F1(64);
       this.d1(p0, b1);
       int i = this.N0.size();
       for (; b < i; b = b + 1) {
          this.N0.get(b).d1(p0, b1);
       }
       return;
    }
    public void L1(){
       this.O0.e(this);
    }
    public void c1(boolean p0,boolean p1){
       super.c1(p0, p1);
       int i = this.N0.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.N0.get(i1).c1(p0, p1);
       }
       return;
    }
    public void f1(){
       int i5;
       int i6;
       ConstraintWidget uConstraintW1;
       ConstraintWidget uConstraintW3;
       ConstraintWidget$DimensionBehaviour uDimensionBe1;
       d t01;
       c uoc2;
       c uoc = this;
       int i = 0;
       uoc.a0 = i;
       uoc.b0 = i;
       uoc.j1 = i;
       uoc.k1 = i;
       int i1 = uoc.N0.size();
       int i2 = Math.max(i, this.U());
       int i3 = Math.max(i, this.y());
       ConstraintWidget u = uoc.U;
       boolean i4 = 1;
       object oobject = u[i4];
       object oobject1 = u[i];
       d s0 = uoc.S0;
       if (s0 != null) {
          s0.P = s0.P + 1;
       }
       if (g.b(uoc.h1, i4)) {
          f.h(uoc, this.v1());
          i5 = 0;
          while (i5 < i1) {
             ConstraintWidget uConstraintW = uoc.N0.get(i5);
             if (uConstraintW.g0() && (!uConstraintW instanceof f && (!uConstraintW instanceof a && (!uConstraintW instanceof h && !uConstraintW.f0())))) {
                ConstraintWidget$DimensionBehaviour uDimensionBe = uConstraintW.v(i4);
                ConstraintWidget$DimensionBehaviour mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                b$a uoa = (uConstraintW.v(i) == mATCH_CONSTR && (uConstraintW.p != i4 && (uDimensionBe == mATCH_CONSTR && uConstraintW.q != i4)))? 1: null;
                if (!uoa) {
                   d.E1(uConstraintW, uoc.Q0, new b$a(), b$a.k);
                }
             }
          label_008c :
             i5 = i5 + 1;
          }
       }
       if (i1 > 2) {
          ConstraintWidget$DimensionBehaviour wRAP_CONTENT = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
          if (oobject1 == wRAP_CONTENT || (oobject == wRAP_CONTENT && (g.b(uoc.h1, 1024) && g.c(uoc, this.v1())))) {
             if (oobject1 == wRAP_CONTENT) {
                if (i2 < this.U() && i2 > 0) {
                   uoc.Y0(i2);
                   uoc.j1 = i4;
                }else {
                   i2 = this.U();
                }
             }
             if (oobject == wRAP_CONTENT) {
                if (i3 < this.y() && i3 > 0) {
                   uoc.z0(i3);
                   uoc.k1 = i4;
                }else {
                   i3 = this.y();
                }
             }
             i6 = i3;
             i3 = i2;
             i2 = 1;
          label_00db :
             boolean i7 = 64;
             c uoc1 = (uoc.F1(i7) || uoc.F1(128))? 1: null;
             d t0 = uoc.T0;
             t0.h = i;
             t0.i = i;
             if (uoc.h1 != null && uoc1) {
                t0.i = i4;
             }
             uoc1 = uoc.N0;
             ConstraintWidget$DimensionBehaviour wRAP_CONTENT1 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
             t0 = (this.B() == wRAP_CONTENT1 || this.R() == wRAP_CONTENT1)? 1: 0;
             this.G1();
             int i8 = 0;
             while (i8 < i1) {
                uConstraintW1 = uoc.N0.get(i8);
                if (uConstraintW1 instanceof c) {
                   uConstraintW1.f1();
                }
                i8 = i8 + 1;
             }
             i7 = uoc.F1(i7);
             i8 = i2;
             i2 = 0;
             uConstraintW1 = 1;
             while (uConstraintW1 != null) {
                int i9 = i2 + 1;
                try{
                   uoc.T0.D();
                   this.G1();
                   uoc.n(uoc.T0);
                   i2 = 0;
                   while (i2 < i1) {
                      uoc.N0.get(i2).n(uoc.T0);
                      i2 = i2 + 1;
                      d uod = 1;
                   }
                   t01 = uoc.T0;
                   try{
                      uoc.j1(t01);
                      t01 = uoc.m1;
                      WeakReference weakReferenc = null;
                      if (t01 != null && t01.get() != null) {
                         uoc.o1(uoc.m1.get(), uoc.T0.q(uoc.K));
                         uoc.m1 = weakReferenc;
                      }
                      t01 = uoc.o1;
                      if (t01 != null && t01.get() != null) {
                         uoc.n1(uoc.o1.get(), uoc.T0.q(uoc.M));
                         uoc.o1 = weakReferenc;
                      }
                      t01 = uoc.n1;
                      if (t01 != null && t01.get() != null) {
                         uoc.o1(uoc.n1.get(), uoc.T0.q(uoc.J));
                         uoc.n1 = weakReferenc;
                      }
                      t01 = uoc.p1;
                      if (t01 != null && t01.get() != null) {
                         uoc.n1(uoc.p1.get(), uoc.T0.q(uoc.L));
                         uoc.p1 = weakReferenc;
                      }
                      uoc.T0.z();
                      uoc2 = 1;
                   label_01fe :
                      if (uConstraintW1) {
                         uoc.K1(uoc.T0, g.a);
                      }else {
                         uoc.d1(uoc.T0, i7);
                         for (i2 = 0; i2 < i1; i2 = i2 + 1) {
                            uoc.N0.get(i2).d1(uoc.T0, i7);
                         }
                      }
                      if (t0 && (i9 < 8 && g.a[2])) {
                         i2 = 0;
                         i4 = 0;
                         i5 = 0;
                         while (i2 < i1) {
                            uConstraintW1 = uoc.N0.get(i2);
                            i = uConstraintW1.a0 + uConstraintW1.U();
                            i4 = Math.max(i4, i);
                            i = uConstraintW1.b0 + uConstraintW1.y();
                            i5 = Math.max(i5, i);
                            i2 = i2 + 1;
                            ConstraintWidget uConstraintW2 = 2;
                         }
                         i2 = Math.max(uoc.h0, i4);
                         i = Math.max(uoc.i0, i5);
                         ConstraintWidget$DimensionBehaviour wRAP_CONTENT2 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                         if (oobject1 == wRAP_CONTENT2 && this.U() < i2) {
                            uoc.Y0(i2);
                            uoc.U[0] = wRAP_CONTENT2;
                            uConstraintW3 = 1;
                            i8 = 1;
                         }else {
                            uConstraintW3 = null;
                         }
                         if (oobject == wRAP_CONTENT2 && this.y() < i) {
                            uoc.z0(i);
                            uoc.U[1] = wRAP_CONTENT2;
                            uConstraintW3 = 1;
                            i8 = 1;
                         }
                      }else {
                         uConstraintW3 = null;
                      }
                      i = Math.max(uoc.h0, this.U());
                      if (i > this.U()) {
                         uoc.Y0(i);
                         uoc.U[0] = ConstraintWidget$DimensionBehaviour.FIXED;
                         uConstraintW3 = 1;
                         i8 = 1;
                      }
                      i = Math.max(uoc.i0, this.y());
                      if (i > this.y()) {
                         uoc.z0(i);
                         i4 = 1;
                         uoc.U[i4] = ConstraintWidget$DimensionBehaviour.FIXED;
                         uConstraintW3 = 1;
                         uDimensionBe1 = 1;
                      }else {
                         i4 = true;
                         uDimensionBe1 = i8;
                      }
                      if (!uDimensionBe1) {
                         i8 = 0;
                         ConstraintWidget$DimensionBehaviour wRAP_CONTENT3 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                         if (uoc.U[i8] == wRAP_CONTENT3 && (i3 > 0 && this.U() > i3)) {
                            uoc.j1 = i4;
                            uoc.U[i8] = ConstraintWidget$DimensionBehaviour.FIXED;
                            uoc.Y0(i3);
                            uConstraintW3 = 1;
                            uDimensionBe1 = 1;
                         }
                      label_02e6 :
                         if (uoc.U[i4] == wRAP_CONTENT3 && (i6 > 0 && this.y() > i6)) {
                            uoc.k1 = i4;
                            uoc.U[i4] = ConstraintWidget$DimensionBehaviour.FIXED;
                            uoc.z0(i6);
                            i8 = 1;
                            uConstraintW1 = 1;
                         label_0304 :
                            i2 = i9;
                            i5 = 2;
                         }
                      }
                   label_0302 :
                      uConstraintW1 = uConstraintW3;
                      wRAP_CONTENT1 = uDimensionBe1;
                      goto label_0304 ;
                   }catch(java.lang.Exception e0){
                      uoc2 = 1;
                   }
                   e0.printStackTrace();
                   System.out.println("EXCEPTION : "+e0);
                   goto label_01fe ;
                }catch(java.lang.Exception e0){
                   goto label_01e5 ;
                }
             }
             uoc.N0 = uoc1;
             if (i8 != null) {
                uConstraintW3 = uoc.U;
                uConstraintW3[0] = oobject1;
                uConstraintW3[1] = oobject;
             }
             uoc.n0(uoc.T0.v());
             return;
          }
       }
       i6 = i3;
       i3 = i2;
       t01 = 0;
       goto label_00db ;
    }
    public void i1(ConstraintWidget p0,int p1){
       if (!p1) {
          this.k1(p0);
       }else if(p1 == 1){
          this.p1(p0);
       }
       return;
    }
    public boolean j1(c p0){
       ConstraintWidget uConstraintW;
       ConstraintWidget uConstraintW1;
       boolean b = this.F1(64);
       this.g(p0, b);
       int i = this.N0.size();
       int i1 = 0;
       c uoc = null;
       while (i1 < i) {
          uConstraintW = this.N0.get(i1);
          uConstraintW.G0(0, 0);
          uConstraintW.G0(1, 0);
          if (uConstraintW instanceof a) {
             uoc = 1;
          }
          i1 = i1 + 1;
       }
       if (uoc) {
          i1 = 0;
          while (i1 < i) {
             uConstraintW1 = this.N0.get(i1);
             if (uConstraintW1 instanceof a) {
                uConstraintW1.l1();
             }
             i1 = i1 + 1;
          }
       }
       i1 = 0;
       while (i1 < i) {
          uConstraintW1 = this.N0.get(i1);
          if (uConstraintW1.f()) {
             uConstraintW1.g(p0, b);
          }
          i1 = i1 + 1;
       }
       if (c.r) {
          HashSet hashSet = new HashSet();
          int i2 = 0;
          while (i2 < i) {
             uConstraintW = this.N0.get(i2);
             if (!uConstraintW.f()) {
                hashSet.add(uConstraintW);
             }
             i2 = i2 + 1;
          }
          int i3 = (this.B() == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT)? 0: 1;
          this.e(this, p0, hashSet, i3, false);
          Iterator iterator = hashSet.iterator();
          while (iterator.hasNext()) {
             ConstraintWidget uConstraintW2 = iterator.next();
             g.a(this, p0, uConstraintW2);
             uConstraintW2.g(p0, b);
          }
       }else {
          i1 = 0;
          while (i1 < i) {
             uConstraintW1 = this.N0.get(i1);
             if (uConstraintW1 instanceof d) {
                uConstraintW = uConstraintW1.U;
                object oobject = uConstraintW[0];
                object oobject1 = uConstraintW[1];
                ConstraintWidget$DimensionBehaviour wRAP_CONTENT = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                if (oobject == wRAP_CONTENT) {
                   uConstraintW1.D0(ConstraintWidget$DimensionBehaviour.FIXED);
                }
                if (oobject1 == wRAP_CONTENT) {
                   uConstraintW1.U0(ConstraintWidget$DimensionBehaviour.FIXED);
                }
                uConstraintW1.g(p0, b);
                if (oobject == wRAP_CONTENT) {
                   uConstraintW1.D0(oobject);
                }
                if (oobject1 == wRAP_CONTENT) {
                   uConstraintW1.U0(oobject1);
                }
             }else {
                g.a(this, p0, uConstraintW1);
                if (!uConstraintW1.f()) {
                   uConstraintW1.g(p0, b);
                }
             }
             i1 = i1 + 1;
          }
       }
       if (this.Y0 > null) {
          b.b(this, p0, null, 0);
       }
       if (this.Z0 > null) {
          b.b(this, p0, null, 1);
       }
       return 1;
    }
    public void k0(){
       this.T0.D();
       this.U0 = 0;
       this.W0 = 0;
       this.V0 = 0;
       this.X0 = 0;
       this.i1 = false;
       super.k0();
    }
    public final void k1(ConstraintWidget p0){
       d tb1 = this.b1;
       if ((this.Y0 + 1) >= tb1.length) {
          this.b1 = Arrays.copyOf(tb1, (tb1.length * 2));
       }
       this.b1[this.Y0] = new c(p0, 0, this.B1());
       this.Y0 = this.Y0 + 1;
       return;
    }
    public void l1(ConstraintAnchor p0){
       d tp1 = this.p1;
       if (tp1 != null && (tp1.get() == null || p0.e() > this.p1.get().e())) {
          this.p1 = new WeakReference(p0);
       }
       return;
    }
    public void m1(ConstraintAnchor p0){
       d tn1 = this.n1;
       if (tn1 != null && (tn1.get() == null || p0.e() > this.n1.get().e())) {
          this.n1 = new WeakReference(p0);
       }
       return;
    }
    public final void n1(ConstraintAnchor p0,SolverVariable p1){
       this.T0.h(p1, this.T0.q(p0), 0, 5);
    }
    public final void o1(ConstraintAnchor p0,SolverVariable p1){
       this.T0.h(this.T0.q(p0), p1, 0, 5);
    }
    public final void p1(ConstraintWidget p0){
       d ta1 = this.a1;
       if ((this.Z0 + 1) >= ta1.length) {
          this.a1 = Arrays.copyOf(ta1, (ta1.length * 2));
       }
       this.a1[this.Z0] = new c(p0, 1, this.B1());
       this.Z0 = this.Z0 + 1;
       return;
    }
    public void q1(ConstraintAnchor p0){
       d to1 = this.o1;
       if (to1 != null && (to1.get() == null || p0.e() > this.o1.get().e())) {
          this.o1 = new WeakReference(p0);
       }
       return;
    }
    public void r1(ConstraintAnchor p0){
       d tm1 = this.m1;
       if (tm1 != null && (tm1.get() == null || p0.e() > this.m1.get().e())) {
          this.m1 = new WeakReference(p0);
       }
       return;
    }
    public boolean s1(boolean p0){
       return this.P0.f(p0);
    }
    public boolean t1(boolean p0){
       this.P0.g(p0);
       return true;
    }
    public boolean u1(boolean p0,int p1){
       return this.P0.h(p0, p1);
    }
    public b$b v1(){
       return this.Q0;
    }
    public int w1(){
       return this.h1;
    }
    public c x1(){
       return this.T0;
    }
    public void y1(){
       this.P0.j();
    }
    public void z1(){
       this.P0.k();
    }
}
