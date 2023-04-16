package androidx.constraintlayout.motion.widget.MotionLayout;
import a2.w;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import java.util.HashMap;
import d1.g;
import androidx.constraintlayout.motion.widget.MotionLayout$c;
import e1.g;
import androidx.constraintlayout.motion.widget.MotionLayout$TransitionState;
import androidx.constraintlayout.motion.widget.MotionLayout$e;
import android.graphics.RectF;
import java.util.ArrayList;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.a;
import android.view.animation.Interpolator;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.a;
import android.util.SparseIntArray;
import java.util.Iterator;
import java.lang.Object;
import androidx.constraintlayout.motion.widget.a$b;
import java.lang.String;
import e1.c;
import android.view.View;
import androidx.constraintlayout.widget.a$a;
import e1.p;
import java.lang.Math;
import e1.q;
import androidx.constraintlayout.motion.widget.MotionLayout$i;
import java.lang.Integer;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.view.MotionEvent;
import ll8.c$b;
import android.content.res.TypedArray;
import androidx.constraintlayout.motion.widget.MotionLayout$f;
import androidx.constraintlayout.motion.widget.MotionLayout$g;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.constraintlayout.motion.widget.MotionLayout$d;
import androidx.constraintlayout.motion.widget.MotionLayout$h;
import e1.d;
import java.lang.System;
import android.os.Bundle;
import j1.a;
import androidx.constraintlayout.solver.widgets.d;
import java.lang.Float;
import j1.d;
import androidx.constraintlayout.motion.widget.b;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.MotionLayout$a;
import java.lang.Runnable;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout$b;
import java.lang.Enum;

public class MotionLayout extends ConstraintLayout implements w	// class@000671
{
    public int A1;
    public a B;
    public float B1;
    public Interpolator C;
    public g C1;
    public float D;
    public boolean D1;
    public int E;
    public MotionLayout$h E1;
    public int F;
    public MotionLayout$TransitionState F1;
    public int G;
    public MotionLayout$e G1;
    public int H;
    public boolean H1;
    public int I;
    public RectF I1;
    public boolean J;
    public View J1;
    public HashMap K;
    public ArrayList K1;
    public long L;
    public float M;
    public float N;
    public float O;
    public long P;
    public float Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public MotionLayout$i U;
    public int U0;
    public float V;
    public MotionLayout$d V0;
    public float W;
    public boolean W0;
    public g X0;
    public MotionLayout$c Y0;
    public d Z0;
    public boolean a1;
    public int b1;
    public int c1;
    public int d1;
    public int e1;
    public boolean f1;
    public float g1;
    public float h1;
    public long i1;
    public float j1;
    public boolean k1;
    public ArrayList l1;
    public ArrayList m1;
    public ArrayList n1;
    public int o1;
    public long p1;
    public float q1;
    public int r1;
    public float s1;
    public boolean t1;
    public boolean u1;
    public int v1;
    public int w1;
    public int x1;
    public int y1;
    public int z1;
    public static boolean L1;

    public void MotionLayout(Context p0){
       super(p0);
       this.D = 0;
       this.E = -1;
       this.F = -1;
       this.G = -1;
       this.H = 0;
       this.I = 0;
       this.J = true;
       this.K = new HashMap();
       this.L = 0;
       this.M = 0x3f800000;
       this.N = 0;
       this.O = 0;
       this.Q = 0;
       this.S = false;
       this.T = false;
       this.U0 = 0;
       this.W0 = false;
       this.X0 = new g();
       this.Y0 = new MotionLayout$c(this);
       this.a1 = true;
       this.f1 = false;
       this.k1 = false;
       this.l1 = null;
       this.m1 = null;
       this.n1 = null;
       this.o1 = 0;
       this.p1 = -1;
       this.q1 = 0;
       this.r1 = 0;
       this.s1 = 0;
       this.t1 = false;
       this.u1 = false;
       this.C1 = new g();
       this.D1 = false;
       this.F1 = MotionLayout$TransitionState.UNDEFINED;
       this.G1 = new MotionLayout$e(this);
       this.H1 = false;
       this.I1 = new RectF();
       this.J1 = null;
       this.K1 = new ArrayList();
       this.Z(null);
    }
    public void MotionLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.D = 0;
       this.E = -1;
       this.F = -1;
       this.G = -1;
       this.H = 0;
       this.I = 0;
       this.J = true;
       this.K = new HashMap();
       this.L = 0;
       this.M = 0x3f800000;
       this.N = 0;
       this.O = 0;
       this.Q = 0;
       this.S = false;
       this.T = false;
       this.U0 = 0;
       this.W0 = false;
       this.X0 = new g();
       this.Y0 = new MotionLayout$c(this);
       this.a1 = true;
       this.f1 = false;
       this.k1 = false;
       this.l1 = null;
       this.m1 = null;
       this.n1 = null;
       this.o1 = 0;
       this.p1 = -1;
       this.q1 = 0;
       this.r1 = 0;
       this.s1 = 0;
       this.t1 = false;
       this.u1 = false;
       this.C1 = new g();
       this.D1 = false;
       this.F1 = MotionLayout$TransitionState.UNDEFINED;
       this.G1 = new MotionLayout$e(this);
       this.H1 = false;
       this.I1 = new RectF();
       this.J1 = null;
       this.K1 = new ArrayList();
       this.Z(p1);
    }
    public void MotionLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.D = 0;
       this.E = -1;
       this.F = -1;
       this.G = -1;
       this.H = 0;
       this.I = 0;
       this.J = true;
       this.K = new HashMap();
       this.L = 0;
       this.M = 0x3f800000;
       this.N = 0;
       this.O = 0;
       this.Q = 0;
       this.S = false;
       this.T = false;
       this.U0 = 0;
       this.W0 = false;
       this.X0 = new g();
       this.Y0 = new MotionLayout$c(this);
       this.a1 = true;
       this.f1 = false;
       this.k1 = false;
       this.l1 = null;
       this.m1 = null;
       this.n1 = null;
       this.o1 = 0;
       this.p1 = -1;
       this.q1 = 0;
       this.r1 = 0;
       this.s1 = 0;
       this.t1 = false;
       this.u1 = false;
       this.C1 = new g();
       this.D1 = false;
       this.F1 = MotionLayout$TransitionState.UNDEFINED;
       this.G1 = new MotionLayout$e(this);
       this.H1 = false;
       this.I1 = new RectF();
       this.J1 = null;
       this.K1 = new ArrayList();
       this.Z(p1);
    }
    public static boolean r0(float p0,float p1,float p2){
       boolean b = true;
       float f = 0;
       if (p0 - f > 0) {
          f = p0 / p2;
          if ((p1 + ((p0 * f) - (((p2 * f) * f) / 2.00f))) - 0x3f800000 <= 0) {
             b = false;
          }
          return b;
       }else {
          float f1 = (- p0) / p2;
          if ((p1 + ((p0 * f1) + (((p2 * f1) * f1) / 2.00f))) - f >= 0) {
             b = false;
          }
          return b;
       }
    }
    public void L(float p0){
       MotionLayout tB = this.B;
       if (tB == null) {
          return;
       }
       MotionLayout tN = this.N;
       if (this.O - tN && this.R != null) {
          this.O = tN;
       }
       MotionLayout tO = this.O;
       if (!tO - p0) {
          return;
       }else {
          this.W0 = false;
          this.Q = p0;
          this.M = (float)tB.i() / 1000.00f;
          this.setProgress(this.Q);
          this.C = this.B.l();
          this.R = false;
          this.L = this.getNanoTime();
          this.S = true;
          this.N = tO;
          this.O = tO;
          this.invalidate();
          return;
       }
    }
    public final void M(){
       MotionLayout tB = this.B;
       if (tB == null) {
          return;
       }
       MotionLayout tB1 = this.B;
       this.N(tB.t(), tB1.e(tB1.t()));
       SparseIntArray sparseIntArr = new SparseIntArray();
       SparseIntArray sparseIntArr1 = new SparseIntArray();
       Iterator iterator = this.B.h().iterator();
       while (iterator.hasNext()) {
          a$b uob = iterator.next();
          this.O(uob);
          int i = uob.h();
          int i1 = uob.f();
          c.b(this.getContext(), i);
          c.b(this.getContext(), i1);
          sparseIntArr.get(i);
          sparseIntArr1.get(i1);
          sparseIntArr.put(i, i1);
          sparseIntArr1.put(i1, i);
          this.B.e(i);
          this.B.e(i1);
       }
       return;
    }
    public final void N(int p0,a p1){
       c.b(this.getContext(), p0);
       p0 = this.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i1 < p0) {
          View childAt = this.getChildAt(i1);
          if (p1.w(childAt.getId()) == null) {
             c.c(childAt);
          }
          i1 = i1 + 1;
       }
       int[] ointArray = p1.y();
       for (; i < ointArray.length; i = i + 1) {
          i1 = ointArray[i];
          c.b(this.getContext(), i1);
          this.findViewById(ointArray[i]);
          p1.x(i1);
          p1.C(i1);
       }
       return;
    }
    public final void O(a$b p0){
       p0.b(this.getContext());
    }
    public final void P(){
       int childCount = this.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          p op = this.K.get(childAt);
          if (op != null) {
             op.w(childAt);
          }
          i = i + 1;
       }
       return;
    }
    public void Q(boolean p0){
       float f2;
       MotionLayout motionLayout2;
       float interpolatio;
       float f4;
       MotionLayout e;
       MotionLayout motionLayout = this;
       if (!motionLayout.P - -1) {
          motionLayout.P = this.getNanoTime();
       }
       MotionLayout o = motionLayout.O;
       int i = -1;
       MotionLayout motionLayout1 = 0x3f800000;
       if (o > 0 && o - motionLayout1 < 0) {
          motionLayout.F = i;
       }
       int i1 = 1;
       boolean b = false;
       if (motionLayout.k1 != null || (motionLayout.S != null && (p0 || motionLayout.Q - o))) {
          float f = Math.signum((motionLayout.Q - o));
          long nanoTime = this.getNanoTime();
          MotionLayout c = motionLayout.C;
          float f1 = 0x3089705f;
          if (!c instanceof q) {
             f2 = (((float)(nanoTime - motionLayout.P) * f) * f1) / motionLayout.M;
             motionLayout.D = f2;
          }else {
             f2 = 0;
          }
          float f3 = motionLayout.O + f2;
          if (motionLayout.R != null) {
             f3 = motionLayout.Q;
          }
          if ((v13 = f) <= 0 || (f3 - motionLayout.Q >= 0 || (f <= 0 && f3 - motionLayout.Q <= 0))) {
             f3 = motionLayout.Q;
             motionLayout.S = b;
             motionLayout2 = 1;
          }else {
             motionLayout2 = null;
          }
          motionLayout.O = f3;
          motionLayout.N = f3;
          motionLayout.P = nanoTime;
          MotionLayout motionLayout3 = 0x3727c5ac;
          if (c != null && !motionLayout2) {
             if (motionLayout.W0 != null) {
                interpolatio = c.getInterpolation(((float)(nanoTime - motionLayout.L) * f1));
                motionLayout.O = interpolatio;
                motionLayout.P = nanoTime;
                motionLayout1 = motionLayout.C;
                if (motionLayout1 instanceof q) {
                   f4 = motionLayout1.a();
                   motionLayout.D = f4;
                   if ((Math.abs(f4) * motionLayout.M) - motionLayout3 <= 0) {
                      motionLayout.S = b;
                   }
                   if (f4 > 0) {
                      float f5 = 0x3f800000;
                      if (interpolatio - f5 >= 0) {
                         motionLayout.O = f5;
                         motionLayout.S = b;
                         interpolatio = 0x3f800000;
                      }
                   }
                   if (f4 < 0 && interpolatio <= 0) {
                      motionLayout.O = 0;
                      motionLayout.S = b;
                      f3 = null;
                   }
                }
             }else {
                interpolatio = c.getInterpolation(f3);
                motionLayout1 = motionLayout.C;
                motionLayout.D = (motionLayout1 instanceof q)? motionLayout1.a(): ((motionLayout1.getInterpolation((f3 + f2)) - interpolatio) * f) / f2;
             }
          label_00f2 :
             f3 = interpolatio;
          }
          if (Math.abs(motionLayout.D) - motionLayout3 > 0) {
             motionLayout.setState(MotionLayout$TransitionState.MOVING);
          }
          if (v13 <= 0 || (f3 - motionLayout.Q >= 0 || (f <= 0 && f3 - motionLayout.Q <= 0))) {
             f3 = motionLayout.Q;
             motionLayout.S = b;
          }
          v3 = f3 - 0x3f800000;
          if (f4 >= 0 || f3 <= 0) {
             motionLayout.S = b;
             motionLayout.setState(MotionLayout$TransitionState.FINISHED);
          }
          i = this.getChildCount();
          motionLayout.k1 = b;
          nanoTime = this.getNanoTime();
          motionLayout.B1 = f3;
          int i2 = 0;
          while (i2 < i) {
             View childAt = motionLayout.getChildAt(i2);
             Object obj = motionLayout.K.get(childAt);
             if (obj != null) {
                int i3 = obj.r(childAt, f3, nanoTime, motionLayout.C1) | motionLayout.k1;
                motionLayout.k1 = i3;
             }
             i2 = i2 + 1;
          }
          i = (v13 <= 0 || (f3 - motionLayout.Q >= 0 || (f <= 0 && f3 - motionLayout.Q <= 0)))? 1: 0;
          if (motionLayout.k1 == null && (motionLayout.S == null && i)) {
             motionLayout.setState(MotionLayout$TransitionState.FINISHED);
          }
       label_0182 :
          if (motionLayout.u1 != null) {
             this.requestLayout();
          }
          motionLayout.k1 = (i ^ i1) | motionLayout.k1;
          if (f3 <= 0) {
             e = motionLayout.E;
             if (e != -1 && motionLayout.F != e) {
                motionLayout.F = e;
                motionLayout.B.e(e).a(motionLayout);
                motionLayout.setState(MotionLayout$TransitionState.FINISHED);
                b = 1;
             }
          }
          if ((double)f3 - 0x3ff0000000000000 >= 0) {
             c = motionLayout.G;
             if (motionLayout.F != c) {
                motionLayout.F = c;
                motionLayout.B.e(c).a(motionLayout);
                motionLayout.setState(MotionLayout$TransitionState.FINISHED);
                b = 1;
             }
          }
          if (motionLayout.k1 != null || motionLayout.S != null) {
             this.invalidate();
          }else if(v13 <= 0 || (!f4 || (f < 0 && !f3))){
             motionLayout.setState(MotionLayout$TransitionState.FINISHED);
          }
          if (motionLayout.k1 == null && (motionLayout.S != null && (v13 <= 0 || (!f4 || (f < 0 && !f3))))) {
             this.d0();
          }
       }
    label_0200 :
       o = motionLayout.O;
       if (o - 0x3f800000 >= 0) {
          e = motionLayout.G;
          if (motionLayout.F == e) {
             i1 = b;
          }
          motionLayout.F = e;
       }else if(o <= 0){
          e = motionLayout.E;
          if (motionLayout.F == e) {
             i1 = b;
          }
          motionLayout.F = e;
       }else {
       label_0223 :
          motionLayout.H1 = motionLayout.H1 | b;
          if (b && motionLayout.D1 == null) {
             this.requestLayout();
          }
          motionLayout.N = motionLayout.O;
          return;
       }
       b = i1;
       goto label_0223 ;
    }
    public final void R(){
       MotionLayout motionLayout;
       float f = Math.signum((this.Q - this.O));
       long nanoTime = this.getNanoTime();
       MotionLayout tC = this.C;
       float f1 = (!tC instanceof g)? (((float)(nanoTime - this.P) * f) * 0x3089705f) / this.M: 0;
       float f2 = this.O + f1;
       if (this.R != null) {
          f2 = this.Q;
       }
       int i = 0;
       if ((v8 = f) <= 0 || (f2 - this.Q >= 0 || (f <= 0 && f2 - this.Q <= 0))) {
          f2 = this.Q;
          motionLayout = 1;
       }else {
          motionLayout = null;
       }
       if (tC != null && !motionLayout) {
          f2 = (this.W0 != null)? tC.getInterpolation(((float)(nanoTime - this.L) * 0x3089705f)): tC.getInterpolation(f2);
       }
    label_005f :
       if (v8 <= 0 || (f2 - this.Q >= 0 || (f <= 0 && f2 - this.Q <= 0))) {
          f2 = this.Q;
       }
       this.B1 = f2;
       int childCount = this.getChildCount();
       nanoTime = this.getNanoTime();
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          Object obj = this.K.get(childAt);
          if (obj != null) {
             obj.r(childAt, f2, nanoTime, this.C1);
          }
          i = i + 1;
       }
       if (this.u1 != null) {
          this.requestLayout();
       }
       return;
    }
    public final void S(){
       Iterator iterator;
       if (this.U == null) {
          MotionLayout tn1 = this.n1;
          if (tn1 != null && !tn1.isEmpty()) {
          label_000e :
             if (this.s1 - this.N) {
                int i = -1;
                if (this.r1 != i) {
                   tn1 = this.U;
                   if (tn1 != null) {
                      tn1.b(this, this.E, this.G);
                   }
                   tn1 = this.n1;
                   if (tn1 != null) {
                      iterator = tn1.iterator();
                      while (iterator.hasNext()) {
                         iterator.next().b(this, this.E, this.G);
                      }
                   }
                   this.t1 = true;
                }
                this.r1 = i;
                tn1 = this.N;
                this.s1 = tn1;
                MotionLayout tU = this.U;
                if (tU != null) {
                   tU.a(this, this.E, this.G, tn1);
                }
                tn1 = this.n1;
                if (tn1 != null) {
                   iterator = tn1.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().a(this, this.E, this.G, this.N);
                   }
                }
                this.t1 = true;
             }
          }
       }else {
          goto label_000e ;
       }
       return;
    }
    public void T(){
       int i;
       if (this.U == null) {
          MotionLayout tn1 = this.n1;
          if (tn1 != null && !tn1.isEmpty()) {
          label_000e :
             Integer integer = -1;
             if (this.r1 == integer) {
                this.r1 = this.F;
                if (!this.K1.isEmpty()) {
                   tn1 = this.K1;
                   i = tn1.get((tn1.size() - 1)).intValue();
                }else {
                   i = -1;
                }
                MotionLayout tF = this.F;
                if (i != tF && tF != integer) {
                   this.K1.add(Integer.valueOf(tF));
                }
             }
          }
       }else {
          goto label_000e ;
       }
       this.e0();
       return;
    }
    public void U(int p0,boolean p1,float p2){
       MotionLayout tU = this.U;
       if (tU != null) {
          tU.d(this, p0, p1, p2);
       }
       tU = this.n1;
       if (tU != null) {
          Iterator iterator = tU.iterator();
          while (iterator.hasNext()) {
             iterator.next().d(this, p0, p1, p2);
          }
       }
       return;
    }
    public void V(int p0,float p1,float p2,float p3,float[] p4){
       View viewById = this.getViewById(p0);
       p op = this.K.get(viewById);
       if (op != null) {
          op.h(p1, p2, p3, p4);
          this.V = p1;
          this.W = viewById.getY();
       }else if(viewById == null){
          p0;
       }else {
          viewById.getContext().getResources().getResourceName(p0);
       }
       return;
    }
    public a$b W(int p0){
       return this.B.u(p0);
    }
    public void X(View p0,float p1,float p2,float[] p3,int p4){
       float f;
       MotionLayout tD = this.D;
       MotionLayout tO = this.O;
       if (this.C != null) {
          float interpolatio = this.C.getInterpolation(this.O);
          tD = (Math.signum((this.Q - tO)) * ((this.C.getInterpolation((this.O + 0.00f)) - interpolatio) / 0.00f)) / this.M;
          f = interpolatio;
       }else {
          f = tO;
       }
       tO = this.C;
       if (tO instanceof q) {
          tD = tO.a();
       }
       p op = this.K.get(p0);
       if (!(p4 & 0x01)) {
          op.o(f, p0.getWidth(), p0.getHeight(), p1, p2, p3);
       }else {
          op.h(f, p1, p2, p3);
       }
       if (p4 < 2) {
          p3[0] = p3[0] * tD;
          p3[1] = p3[1] * tD;
       }
       return;
    }
    public final boolean Y(float p0,float p1,View p2,MotionEvent p3){
       if (p2 instanceof ViewGroup) {
          ViewGroup viewGroup = p2;
          int childCount = viewGroup.getChildCount();
          int i = 0;
          while (true) {
             if (i < childCount) {
                float f = (float)p2.getLeft() + p0;
                float f1 = (float)p2.getTop() + p1;
                if (this.Y(f, f1, viewGroup.getChildAt(i), p3)) {
                   return true;
                }else {
                   i = i + 1;
                }
             }
          }
       }
       this.I1.set(((float)p2.getLeft() + p0), ((float)p2.getTop() + p1), (p0 + (float)p2.getRight()), (p1 + (float)p2.getBottom()));
       if (!p3.getAction()) {
          if (this.I1.contains(p3.getX(), p3.getY()) && p2.onTouchEvent(p3)) {
             return true;
          }
       }else if(p2.onTouchEvent(p3)){
          return true;
       }
       return false;
    }
    public final void Z(AttributeSet p0){
       MotionLayout.L1 = this.isInEditMode();
       if (p0 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.z3);
          int indexCount = typedArray.getIndexCount();
          int i = 0;
          boolean b = true;
          while (i < indexCount) {
             int index = typedArray.getIndex(i);
             a uoa = 2;
             if (index == uoa) {
                this.B = new a(this.getContext(), this, typedArray.getResourceId(index, -1));
             }else if(index == 1){
                this.F = typedArray.getResourceId(index, -1);
             }else if(index == 4){
                this.Q = typedArray.getFloat(index, 0);
                this.S = true;
             }else if(!index){
                b = typedArray.getBoolean(index, b);
             }else if(index == 5){
                if (this.U0 == null) {
                   if (!typedArray.getBoolean(index, false)) {
                      uoa = 0;
                   }
                   this.U0 = uoa;
                }
             }else if(index == 3){
                this.U0 = typedArray.getInt(index, false);
             }
             i = i + 1;
          }
          typedArray.recycle();
          if (!b) {
             this.B = null;
          }
       }
       if (this.U0 != null) {
          this.M();
       }
       if (this.F == -1) {
          MotionLayout tB = this.B;
          if (tB != null) {
             this.F = tB.t();
             this.E = this.B.t();
             this.G = this.B.j();
          }
       }
       return;
    }
    public boolean a0(){
       return this.J;
    }
    public int b0(String p0){
       MotionLayout tB = this.B;
       if (tB == null) {
          return 0;
       }
       return tB.A(p0);
    }
    public MotionLayout$f c0(){
       return MotionLayout$g.h();
    }
    public void d0(){
       MotionLayout tB = this.B;
       if (tB == null) {
          return;
       }
       if (tB.b(this, this.F)) {
          this.requestLayout();
          return;
       }else {
          tB = this.F;
          if (tB != -1) {
             this.B.a(this, tB);
          }
          if (this.B.Q()) {
             this.B.O();
          }
          return;
       }
    }
    public void dispatchDraw(Canvas p0){
       boolean b = false;
       this.Q(b);
       super.dispatchDraw(p0);
       if (this.B == null) {
          return;
       }
       int i = 1;
       if ((this.U0 & i) == i && !this.isInEditMode()) {
          this.o1 = this.o1 + i;
          long nanoTime = this.getNanoTime();
          MotionLayout tp1 = this.p1;
          if (tp1 - -1) {
             long l = nanoTime - tp1;
             if (l - 0xbebc200 > 0) {
                float f = 100.00f;
                this.q1 = (float)(int)(((float)this.o1 / ((float)l * 0x3089705f)) * f) / f;
                this.o1 = b;
                this.p1 = nanoTime;
             }
          }else {
             this.p1 = nanoTime;
          }
          Paint paint = new Paint();
          paint.setTextSize(42.00f);
          float f1 = 10.00f;
          StringBuilder str = this.q1+" fps "+c.d(this, this.E)+" -> "+c.d(this, this.G)+" \(progress: "+((float)(int)(this.getProgress() * 1000.00f) / f1)+" \) state=";
          MotionLayout tF = this.F;
          String str1 = (tF == -1)? "undefined": c.d(this, tF);
          str1 = str+str1;
          paint.setColor(0xff000000);
          p0.drawText(str1, 11.00f, (float)(this.getHeight() - 29), paint);
          paint.setColor(-7864184);
          p0.drawText(str1, f1, (float)(this.getHeight() - 30), paint);
       }
       if (this.U0 > i) {
          if (this.V0 == null) {
             this.V0 = new MotionLayout$d(this);
          }
          this.V0.a(p0, this.K, this.B.i(), this.U0);
       }
       return;
    }
    public final void e0(){
       if (this.U == null) {
          MotionLayout tn1 = this.n1;
          if (tn1 == null || tn1.isEmpty()) {
             return;
          }
       }
       this.t1 = false;
       Iterator iterator = this.K1.iterator();
       while (iterator.hasNext()) {
          Integer integer = iterator.next();
          MotionLayout tU = this.U;
          if (tU != null) {
             tU.c(this, integer.intValue());
          }
          tU = this.n1;
          if (tU != null) {
             Iterator iterator1 = tU.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().c(this, integer.intValue());
             }
          }
       }
       this.K1.clear();
       return;
    }
    public void f0(){
       this.G1.g();
       this.invalidate();
    }
    public void g0(float p0,float p1){
       if (!this.isAttachedToWindow()) {
          if (this.E1 == null) {
             this.E1 = new MotionLayout$h(this);
          }
          this.E1.e(p0);
          this.E1.h(p1);
          return;
       }else {
          this.setProgress(p0);
          this.setState(MotionLayout$TransitionState.MOVING);
          this.D = p1;
          this.L(0x3f800000);
          return;
       }
    }
    public int[] getConstraintSetIds(){
       MotionLayout tB = this.B;
       if (tB == null) {
          return null;
       }
       return tB.g();
    }
    public int getCurrentState(){
       return this.F;
    }
    public ArrayList getDefinedTransitions(){
       MotionLayout tB = this.B;
       if (tB == null) {
          return null;
       }
       return tB.h();
    }
    public d getDesignTool(){
       if (this.Z0 == null) {
          this.Z0 = new d(this);
       }
       return this.Z0;
    }
    public int getEndState(){
       return this.G;
    }
    public long getNanoTime(){
       return System.nanoTime();
    }
    public float getProgress(){
       return this.O;
    }
    public int getStartState(){
       return this.E;
    }
    public float getTargetPosition(){
       return this.Q;
    }
    public Bundle getTransitionState(){
       if (this.E1 == null) {
          this.E1 = new MotionLayout$h(this);
       }
       this.E1.c();
       return this.E1.b();
    }
    public long getTransitionTimeMs(){
       MotionLayout tB = this.B;
       if (tB != null) {
          this.M = (float)tB.i() / 1000.00f;
       }
       return (long)(this.M * 1000.00f);
    }
    public float getVelocity(){
       return this.D;
    }
    public void h0(int p0,int p1,int p2){
       this.setState(MotionLayout$TransitionState.SETUP);
       this.F = p0;
       this.E = -1;
       this.G = -1;
       ConstraintLayout tl = this.l;
       if (tl != null) {
          tl.c(p0, (float)p1, (float)p2);
       }else {
          MotionLayout tB = this.B;
          if (tB != null) {
             tB.e(p0).b(this);
          }
       }
       return;
    }
    public void i0(int p0,int p1){
       if (!this.isAttachedToWindow()) {
          if (this.E1 == null) {
             this.E1 = new MotionLayout$h(this);
          }
          this.E1.f(p0);
          this.E1.d(p1);
          return;
       }else {
          MotionLayout tB = this.B;
          if (tB != null) {
             this.E = p0;
             this.G = p1;
             tB.M(p0, p1);
             this.G1.d(this.d, this.B.e(p0), this.B.e(p1));
             this.f0();
             this.O = 0;
             this.m0();
          }
          return;
       }
    }
    public boolean isAttachedToWindow(){
       return super.isAttachedToWindow();
    }
    public void j0(){
       int i2;
       p op4;
       float f3;
       float f4;
       int childCount = this.getChildCount();
       this.G1.a();
       int b = true;
       this.S = b;
       int width = this.getWidth();
       int height = this.getHeight();
       int i = this.B.d();
       int i1 = 0;
       if (i != -1) {
          i2 = 0;
          while (i2 < childCount) {
             p op = this.K.get(this.getChildAt(i2));
             if (op != null) {
                op.v(i);
             }
             i2 = i2 + 1;
          }
       }
       int i3 = 0;
       while (i3 < childCount) {
          p op1 = this.K.get(this.getChildAt(i3));
          if (op1 != null) {
             this.B.m(op1);
             op1.z(width, height, this.M, this.getNanoTime());
          }
          i3 = i3 + 1;
       }
       float f = this.B.s();
       if (f) {
          i2 = ((double)f < 0)? 1: 0;
          f = Math.abs(f);
          float f1 = -340282346638528860000000000000000000000.00f;
          float f2 = Float.MAX_VALUE;
          int i4 = 0;
          MotionLayout motionLayout = Float.MAX_VALUE;
          View view = -8388609;
          while (true) {
             if (i4 < childCount) {
                p op2 = this.K.get(this.getChildAt(i4));
                if (!Float.isNaN(op2.k)) {
                label_00af :
                   if (b) {
                      b = 0;
                      while (b < childCount) {
                         p op3 = this.K.get(this.getChildAt(b));
                         if (!Float.isNaN(op3.k)) {
                            f2 = Math.min(f2, op3.k);
                            f1 = Math.max(f1, op3.k);
                         }
                         b = b + 1;
                      }
                      while (i1 < childCount) {
                         op4 = this.K.get(this.getChildAt(i1));
                         if (!Float.isNaN(op4.k)) {
                            f3 = 0x3f800000 - f;
                            f3 = 0x3f800000 / f3;
                            op4.m = f3;
                            if (i2) {
                               f3 = f1 - op4.k;
                               f4 = f1 - f2;
                               f3 = f3 / f4;
                               f3 = f3 * f;
                               f3 = f - f3;
                               op4.l = f3;
                            }else {
                               f3 = op4.k - f2;
                               f3 = f3 * f;
                               f4 = f1 - f2;
                               f3 = f3 / f4;
                               f3 = f - f3;
                               op4.l = f3;
                            }
                         }
                      }
                   }else {
                      for (i1 = i1 + 1; i1 < childCount; i1 = i1 + 1) {
                         op4 = this.K.get(this.getChildAt(i1));
                         f1 = op4.j();
                         f2 = op4.k();
                         f2 = (i2)? f2 - f1: f2 + f1;
                         f1 = 0x3f800000 - f;
                         f1 = 0x3f800000 / f1;
                         op4.m = f1;
                         f2 = f2 - motionLayout;
                         f2 = f2 * f;
                         f1 = view - motionLayout;
                         f2 = f2 / f1;
                         f1 = f - f2;
                         op4.l = f1;
                      }
                   }
                }else {
                   float f5 = op2.j();
                   float f6 = op2.k();
                   f6 = (i2)? f6 - f5: f6 + f5;
                   f3 = Math.min(motionLayout, f6);
                   f4 = Math.max(view, f6);
                   i4 = i4 + 1;
                }
             }else {
                b = false;
                goto label_00af ;
             }
          }
       }
       return;
    }
    public void k0(int p0,float p1,float p2){
       if (this.B == null) {
          return;
       }
       if (!this.O - p1) {
          return;
       }
       boolean b = true;
       this.W0 = b;
       this.L = this.getNanoTime();
       float f = (float)this.B.i() / 1000.00f;
       this.M = f;
       this.Q = p1;
       this.S = b;
       int i = 2;
       if (p0 && (p0 != b && p0 != i)) {
          if (p0 != 4) {
             if (p0 == 5) {
                if (MotionLayout.r0(p2, this.O, this.B.n())) {
                   this.Y0.b(p2, this.O, this.B.n());
                   this.C = this.Y0;
                }else {
                   this.X0.c(this.O, p1, p2, this.M, this.B.n(), this.B.o());
                   this.D = 0;
                   this.Q = p1;
                   this.F = this.F;
                   this.C = this.X0;
                }
             }
          }else {
             this.Y0.b(p2, this.O, this.B.n());
             this.C = this.Y0;
          }
       }else if(p0 == b){
          p1 = 0;
       }else if(p0 == i){
          p1 = 0x3f800000;
       }
       this.X0.c(this.O, p1, p2, f, this.B.n(), this.B.o());
       this.Q = p1;
       this.F = this.F;
       this.C = this.X0;
       this.R = false;
       this.L = this.getNanoTime();
       this.invalidate();
       return;
    }
    public void l0(){
       this.L(0x3f800000);
    }
    public void m0(){
       this.L(0);
    }
    public void n0(int p0){
       if (!this.isAttachedToWindow()) {
          if (this.E1 == null) {
             this.E1 = new MotionLayout$h(this);
          }
          this.E1.d(p0);
          return;
       }else {
          this.o0(p0, -1, -1);
          return;
       }
    }
    public void o0(int p0,int p1,int p2){
       float f3;
       float f4;
       MotionLayout tB = this.B;
       int i = -1;
       if (tB != null) {
          a b = tB.b;
          if (b != null) {
             p1 = b.a(this.F, p0, (float)p1, (float)p2);
             if (p1 != i) {
                p0 = p1;
             }
          }
       }
       MotionLayout tF = this.F;
       if (tF == p0) {
          return;
       }else if(this.E == p0){
          this.L(0);
          return;
       }else if(this.G == p0){
          this.L(0x3f800000);
          return;
       }else {
          this.G = p0;
          if (tF != i) {
             this.i0(tF, p0);
             this.L(0x3f800000);
             this.O = 0;
             this.l0();
             return;
          }else {
             boolean b1 = false;
             this.W0 = b1;
             this.Q = 0x3f800000;
             this.N = 0;
             this.O = 0;
             this.P = this.getNanoTime();
             this.L = this.getNanoTime();
             this.R = b1;
             Interpolator interpolator = null;
             this.C = interpolator;
             this.M = (float)this.B.i() / 1000.00f;
             this.E = i;
             this.B.M(i, this.G);
             this.B.t();
             i = this.getChildCount();
             this.K.clear();
             for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                View childAt = this.getChildAt(i1);
                this.K.put(childAt, new p(childAt));
             }
             this.S = true;
             this.G1.d(this.d, interpolator, this.B.e(p0));
             this.f0();
             this.G1.a();
             this.P();
             p0 = this.getWidth();
             interpolator = this.getHeight();
             for (int i2 = 0; i2 < i; i2 = i2 + 1) {
                p op = this.K.get(this.getChildAt(i2));
                this.B.m(op);
                op.z(p0, interpolator, this.M, this.getNanoTime());
             }
             float f = this.B.s();
             if (f) {
                float f1 = Float.MAX_VALUE;
                float f2 = -340282346638528860000000000000000000000.00f;
                for (int i3 = 0; i3 < i; i3 = i3 + 1) {
                   p op1 = this.K.get(this.getChildAt(i3));
                   f3 = op1.j();
                   f4 = op1.k() + f3;
                   f1 = Math.min(f1, f4);
                   f2 = Math.max(f2, f4);
                }
                for (; b1 < i; b1++) {
                   p op2 = this.K.get(this.getChildAt(b1));
                   f4 = op2.j();
                   f3 = op2.k();
                   float f5 = 0x3f800000 - f;
                   f5 = 0x3f800000 / f5;
                   op2.m = f5;
                   f4 = f4 + f3;
                   f4 = f4 - f1;
                   f4 = f4 * f;
                   f3 = f2 - f1;
                   f4 = f4 / f3;
                   f4 = f - f4;
                   op2.l = f4;
                }
             }
             this.N = 0;
             this.O = 0;
             this.S = true;
             this.invalidate();
             return;
          }
       }
    }
    public void onAttachedToWindow(){
       a uoa;
       super.onAttachedToWindow();
       MotionLayout tB = this.B;
       if (tB != null) {
          MotionLayout tF = this.F;
          if (tF != -1) {
             uoa = tB.e(tF);
             this.B.H(this);
             if (uoa != null) {
                uoa.b(this);
             }
             this.E = this.F;
          }
       }
       this.d0();
       tB = this.E1;
       if (tB != null) {
          tB.a();
       }else {
          tB = this.B;
          if (tB != null) {
             uoa = tB.c;
             if (uoa != null && uoa.e() == 4) {
                this.l0();
                this.setState(MotionLayout$TransitionState.SETUP);
                this.setState(MotionLayout$TransitionState.MOVING);
             }
          }
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       MotionLayout tB = this.B;
       if (tB != null && this.J != null) {
          a c = tB.c;
          if (c != null && c.j()) {
             b uob = c.i();
             if (uob != null) {
                if (!p0.getAction()) {
                   RectF rectF = uob.j(this, new RectF());
                   if (rectF != null && !rectF.contains(p0.getX(), p0.getY())) {
                      return false;
                   }
                }
                int i = uob.k();
                if (i != -1) {
                   MotionLayout tJ1 = this.J1;
                   if (tJ1 == null || tJ1.getId() != i) {
                      this.J1 = this.findViewById(i);
                   }
                   tB = this.J1;
                   if (tB != null) {
                      this.I1.set((float)tB.getLeft(), (float)this.J1.getTop(), (float)this.J1.getRight(), (float)this.J1.getBottom());
                      if (this.I1.contains(p0.getX(), p0.getY()) && !this.Y(0, 0, this.J1, p0)) {
                         return this.onTouchEvent(p0);
                      }
                   }
                }
             }
          }
       }
    label_0093 :
       return false;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       this.D1 = true;
       if (this.B == null) {
          super.onLayout(p0, p1, p2, p3, p4);
          this.D1 = false;
          return;
       }else {
          p3 = p3 - p1;
          p4 = p4 - p2;
          if (this.d1 != p3 || this.e1 != p4) {
             this.f0();
             this.Q(true);
          }
          this.d1 = p3;
          this.e1 = p4;
          this.b1 = p3;
          this.c1 = p4;
          this.D1 = false;
          return;
       }
    }
    public void onMeasure(int p0,int p1){
       float f1;
       if (this.B == null) {
          super.onMeasure(p0, p1);
          return;
       }else {
          boolean b = false;
          MotionLayout motionLayout = (this.H != p0 || this.I != p1)? 1: null;
          if (this.H1 != null) {
             this.H1 = b;
             this.d0();
             this.e0();
             motionLayout = 1;
          }
          if (this.i != null) {
             motionLayout = 1;
          }
          this.H = p0;
          this.I = p1;
          int i = this.B.t();
          int i1 = this.B.j();
          if (motionLayout || (this.G1.e(i, i1) && this.E != -1)) {
             super.onMeasure(p0, p1);
             this.G1.d(this.d, this.B.e(i), this.B.e(i1));
             this.G1.g();
             this.G1.h(i, i1);
          }else {
             b = true;
          }
          if (this.u1 != null || b) {
             int i2 = this.d.U() + (this.getPaddingLeft() + this.getPaddingRight());
             p1 = this.d.y() + (this.getPaddingTop() + this.getPaddingBottom());
             MotionLayout tz1 = this.z1;
             MotionLayout motionLayout1 = Integer.MIN_VALUE;
             if (tz1 == motionLayout1 || tz1 == null) {
                tz1 = this.v1;
                float f = (float)tz1;
                i2 = (int)(f + (this.B1 * (float)(this.x1 - tz1)));
                this.requestLayout();
             }
             tz1 = this.A1;
             if (tz1 == motionLayout1 || tz1 == null) {
                tz1 = this.w1;
                f1 = (float)tz1;
                f1 = (int)(f1 + (this.B1 * (float)(this.y1 - tz1)));
                this.requestLayout();
             }
             this.setMeasuredDimension(i2, f1);
          }
          this.R();
          return;
       }
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       return false;
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       return false;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3,int p4){
       float f;
       MotionLayout tB = this.B;
       if (tB != null) {
          a c = tB.c;
          if (c != null) {
             if (!c.j()) {
                return;
             }else {
                c = this.B.c;
                int i = -1;
                if (c != null && c.j()) {
                   b uob = c.i();
                   if (uob != null) {
                      int i1 = uob.k();
                      if (i1 != i && p0.getId() != i1) {
                         return;
                      }
                   }
                }
                MotionLayout tB1 = this.B;
                long l = 0x3f800000;
                if (tB1 != null && tB1.p()) {
                   tB1 = this.N;
                   if (!tB1 - l || (!tB1 && p0.canScrollVertically(i))) {
                      return;
                   }
                }
                if (c.i() != null && (this.B.c.i().d() & 1)) {
                   f = this.B.q((float)p1, (float)p2);
                   MotionLayout tO = this.O;
                   if (tO > 0 || (f < 0 || (tO - l >= 0 && f > 0))) {
                      p0.setNestedScrollingEnabled(false);
                      p0.post(new MotionLayout$a(this, p0));
                      return;
                   }
                }
                l = this.getNanoTime();
                f = (float)p1;
                this.g1 = f;
                float f1 = (float)p2;
                this.h1 = f1;
                this.j1 = (float)((double)(l - this.i1) * 0.00f);
                this.i1 = l;
                this.B.D(f, f1);
                if (this.N - this.N) {
                   p3[0] = p1;
                   p3[1] = p2;
                }
                this.Q(false);
                if (p3[0] || p3[1]) {
                   this.f1 = true;
                }
             }
          }
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5){
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5,int[] p6){
       if (this.f1 == null && (p1 || p2)) {
          p6[0] = p6[0] + p3;
          p6[1] = p6[1] + p4;
       }
       this.f1 = false;
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2,int p3){
    }
    public void onRtlPropertiesChanged(int p0){
       MotionLayout tB = this.B;
       if (tB != null) {
          tB.L(this.isRtl());
       }
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2,int p3){
       MotionLayout tB = this.B;
       if (tB != null) {
          a c = tB.c;
          if (c == null || (c.i() != null && !(this.B.c.i().d() & 0x02))) {
             return true;
          }
       }
       return false;
    }
    public void onStopNestedScroll(View p0,int p1){
       MotionLayout tB = this.B;
       if (tB == null) {
          return;
       }
       MotionLayout tj1 = this.j1;
       tB.E((this.g1 / tj1), (this.h1 / tj1));
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       MotionLayout tB = this.B;
       if (tB == null || (this.J == null || !tB.Q())) {
          return super.onTouchEvent(p0);
       }
       a c = this.B.c;
       if (c != null && !c.j()) {
          return super.onTouchEvent(p0);
       }
       this.B.F(p0, this.getCurrentState(), this);
       return true;
    }
    public void onViewAdded(View p0){
       super.onViewAdded(p0);
       if (p0 instanceof MotionHelper) {
          if (this.n1 == null) {
             this.n1 = new ArrayList();
          }
          this.n1.add(p0);
          if (p0.y()) {
             if (this.l1 == null) {
                this.l1 = new ArrayList();
             }
             this.l1.add(p0);
          }
          if (p0.x()) {
             if (this.m1 == null) {
                this.m1 = new ArrayList();
             }
             this.m1.add(p0);
          }
       }
       return;
    }
    public void onViewRemoved(View p0){
       super.onViewRemoved(p0);
       MotionLayout tl1 = this.l1;
       if (tl1 != null) {
          tl1.remove(p0);
       }
       tl1 = this.m1;
       if (tl1 != null) {
          tl1.remove(p0);
       }
       return;
    }
    public void p0(){
       this.G1.d(this.d, this.B.e(this.E), this.B.e(this.G));
       this.f0();
    }
    public void parseLayoutDescription(int p0){
       this.l = null;
    }
    public void q0(int p0,a p1){
       MotionLayout tB = this.B;
       if (tB != null) {
          tB.I(p0, p1);
       }
       this.p0();
       if (this.F == p0) {
          p1.b(this);
       }
       return;
    }
    public void requestLayout(){
       if (this.u1 == null && this.F == -1) {
          MotionLayout tB = this.B;
          if (tB != null) {
             a c = tB.c;
             if (c != null && !c.g()) {
                return;
             }
          }
       }
       super.requestLayout();
       return;
    }
    public void setDebugMode(int p0){
       this.U0 = p0;
       this.invalidate();
    }
    public void setInteractionEnabled(boolean p0){
       this.J = p0;
    }
    public void setInterpolatedProgress(float p0){
       if (this.B != null) {
          this.setState(MotionLayout$TransitionState.MOVING);
          Interpolator interpolator = this.B.l();
          if (interpolator != null) {
             this.setProgress(interpolator.getInterpolation(p0));
             return;
          }
       }
       this.setProgress(p0);
       return;
    }
    public void setOnHide(float p0){
       MotionLayout tm1 = this.m1;
       if (tm1 != null) {
          int i = tm1.size();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             this.m1.get(i1).setProgress(p0);
          }
       }
       return;
    }
    public void setOnShow(float p0){
       MotionLayout tl1 = this.l1;
       if (tl1 != null) {
          int i = tl1.size();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             this.l1.get(i1).setProgress(p0);
          }
       }
       return;
    }
    public void setProgress(float p0){
       MotionLayout motionLayout = null;
       MotionLayout motionLayout1 = 0x3f800000;
       if ((v2 = p0 - motionLayout) >= 0) {
          v3 = p0 - motionLayout1;
       }
       if (!this.isAttachedToWindow()) {
          if (this.E1 == null) {
             this.E1 = new MotionLayout$h(this);
          }
          this.E1.e(p0);
          return;
       }else if(v2 <= 0){
          this.F = this.E;
          if (!this.O - motionLayout) {
             this.setState(MotionLayout$TransitionState.FINISHED);
          }
       }else if(p0 - motionLayout1 >= 0){
          this.F = this.G;
          if (!this.O - motionLayout1) {
             this.setState(MotionLayout$TransitionState.FINISHED);
          }
       }else {
          this.F = -1;
          this.setState(MotionLayout$TransitionState.MOVING);
       }
       if (this.B == null) {
          return;
       }else {
          this.R = true;
          this.Q = p0;
          this.N = p0;
          this.P = -1;
          this.L = -1;
          this.C = null;
          this.S = true;
          this.invalidate();
          return;
       }
    }
    public void setScene(a p0){
       this.B = p0;
       p0.L(this.isRtl());
       this.f0();
    }
    public void setState(MotionLayout$TransitionState p0){
       MotionLayout$TransitionState fINISHED = MotionLayout$TransitionState.FINISHED;
       if (p0 == fINISHED && this.F == -1) {
          return;
       }
       MotionLayout tF1 = this.F1;
       this.F1 = p0;
       MotionLayout$TransitionState mOVING = MotionLayout$TransitionState.MOVING;
       if (tF1 == mOVING && p0 == mOVING) {
          this.S();
       }
       int i = MotionLayout$b.a[tF1.ordinal()];
       if (i != 1 && i != 2) {
          if (i == 3 && p0 == fINISHED) {
             this.T();
          }
       }else if(p0 == mOVING){
          this.S();
       }
       if (p0 == fINISHED) {
          this.T();
       }
    label_0039 :
       return;
    }
    public void setTransition(int p0){
       if (this.B != null) {
          a$b uob = this.W(p0);
          this.E = uob.h();
          this.G = uob.f();
          if (!this.isAttachedToWindow()) {
             if (this.E1 == null) {
                this.E1 = new MotionLayout$h(this);
             }
             this.E1.f(this.E);
             this.E1.d(this.G);
             return;
          }else {
             float f = Float.NaN;
             MotionLayout tF = this.F;
             float f1 = 0;
             if (tF == this.E) {
                f = 0;
             }else if(tF == this.G){
                f = 0x3f800000;
             }
             this.B.N(uob);
             this.G1.d(this.d, this.B.e(this.E), this.B.e(this.G));
             this.f0();
             if (!Float.isNaN(f)) {
                f1 = f;
             }
             this.O = f1;
             if (Float.isNaN(f)) {
                c.a();
                this.m0();
             }else {
                this.setProgress(f);
             }
          }
       }
       return;
    }
    public void setTransition(a$b p0){
       float f;
       this.B.N(p0);
       this.setState(MotionLayout$TransitionState.SETUP);
       if (this.F == this.B.j()) {
          f = 0x3f800000;
          this.O = f;
          this.N = f;
          this.Q = f;
       }else {
          f = 0;
          this.O = f;
          this.N = f;
          this.Q = f;
       }
       long l = (p0.k(1))? -1: this.getNanoTime();
       this.P = l;
       int i = this.B.t();
       int i1 = this.B.j();
       if (i == this.E && i1 == this.G) {
          return;
       }else {
          this.E = i;
          this.G = i1;
          this.B.M(i, i1);
          this.G1.d(this.d, this.B.e(this.E), this.B.e(this.G));
          this.G1.h(this.E, this.G);
          this.G1.g();
          this.f0();
          return;
       }
    }
    public void setTransitionDuration(int p0){
       MotionLayout tB = this.B;
       if (tB == null) {
          return;
       }
       tB.J(p0);
       return;
    }
    public void setTransitionListener(MotionLayout$i p0){
       this.U = p0;
    }
    public void setTransitionState(Bundle p0){
       if (this.E1 == null) {
          this.E1 = new MotionLayout$h(this);
       }
       this.E1.g(p0);
       if (this.isAttachedToWindow()) {
          this.E1.a();
       }
       return;
    }
    public String toString(){
       Context context = this.getContext();
       return c.b(context, this.E)+"->"+c.b(context, this.G)+" \(pos:"+this.O+" Dpos/Dt:"+this.D;
    }
}
