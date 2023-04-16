package androidx.constraintlayout.motion.widget.MotionLayout$e;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.Object;
import androidx.constraintlayout.solver.widgets.d;
import android.view.ViewGroup;
import java.util.HashMap;
import android.view.View;
import e1.p;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.a;
import java.lang.String;
import e1.c;
import java.lang.Class;
import java.util.ArrayList;
import h1.c;
import java.util.Iterator;
import androidx.constraintlayout.solver.widgets.a;
import androidx.constraintlayout.solver.widgets.f;
import androidx.constraintlayout.solver.widgets.e;
import h1.a;
import h1.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import i1.b$b;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import android.view.View$MeasureSpec;
import android.view.ViewParent;
import android.util.SparseArray;
import androidx.constraintlayout.widget.Constraints$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.solver.widgets.h;

public class MotionLayout$e	// class@00066c
{
    public d a;
    public d b;
    public a c;
    public a d;
    public int e;
    public int f;
    public final MotionLayout g;

    public void MotionLayout$e(MotionLayout p0){
       this.g = p0;
       super();
       this.a = new d();
       this.b = new d();
       this.c = null;
       this.d = null;
    }
    public void a(){
       ConstraintWidget uConstraintW;
       int childCount = this.g.getChildCount();
       this.g.K.clear();
       int i = 0;
       for (int i1 = 0; i1 < childCount; i1 = i1 + 1) {
          View childAt = this.g.getChildAt(i1);
          this.g.K.put(childAt, new p(childAt));
       }
       while (i < childCount) {
          View childAt1 = this.g.getChildAt(i);
          p op = this.g.K.get(childAt1);
          if (op != null) {
             if (this.c != null) {
                uConstraintW = this.c(this.a, childAt1);
                if (uConstraintW != null) {
                   op.x(uConstraintW, this.c);
                }else if(this.g.U0 != null){
                   c.a();
                   c.c(childAt1);
                   childAt1.getClass();
                }
             }
             if (this.d != null) {
                uConstraintW = this.c(this.b, childAt1);
                if (uConstraintW != null) {
                   op.u(uConstraintW, this.d);
                }else if(this.g.U0 != null){
                   c.a();
                   c.c(childAt1);
                   childAt1.getClass();
                }
             }
          }
       label_007d :
          i = i + 1;
       }
       return;
    }
    public void b(d p0,d p1){
       a uoa;
       ArrayList uArrayList = p0.e1();
       HashMap hashMap = new HashMap();
       hashMap.put(p0, p1);
       p1.e1().clear();
       p1.m(p0, hashMap);
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          ConstraintWidget uConstraintW = iterator.next();
          if (uConstraintW instanceof a) {
             uoa = new a();
          }else if(uConstraintW instanceof f){
             uoa = new f();
          }else if(uConstraintW instanceof e){
             uoa = new e();
          }else if(uConstraintW instanceof a){
             uoa = new b();
          }else {
             uoa = new ConstraintWidget();
          }
          p1.c(uoa);
          hashMap.put(uConstraintW, uoa);
       }
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          ConstraintWidget uConstraintW1 = iterator.next();
          hashMap.get(uConstraintW1).m(uConstraintW1, hashMap);
       }
       return;
    }
    public ConstraintWidget c(d p0,View p1){
       ConstraintWidget uConstraintW;
       if (p0.t() == p1) {
          return p0;
       }
       ArrayList uArrayList = p0.e1();
       int i = uArrayList.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return null;
          }
          uConstraintW = uArrayList.get(i1);
          if (uConstraintW.t() == p1) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return uConstraintW;
    }
    public void d(d p0,a p1,a p2){
       this.c = p1;
       this.d = p2;
       this.a = new d();
       this.b = new d();
       this.a.H1(this.g.d.v1());
       this.b.H1(this.g.d.v1());
       this.a.h1();
       this.b.h1();
       this.b(this.g.d, this.a);
       this.b(this.g.d, this.b);
       if ((double)this.g.O - 0x3fe0000000000000 > 0) {
          if (p1 != null) {
             this.i(this.a, p1);
          }
          this.i(this.b, p2);
       }else {
          this.i(this.b, p2);
          if (p1 != null) {
             this.i(this.a, p1);
          }
       }
       this.a.J1(this.g.isRtl());
       this.a.L1();
       this.b.J1(this.g.isRtl());
       this.b.L1();
       ViewGroup$LayoutParams layoutParams = this.g.getLayoutParams();
       if (layoutParams != null) {
          if (layoutParams.width == -2) {
             ConstraintWidget$DimensionBehaviour wRAP_CONTENT = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
             this.a.D0(wRAP_CONTENT);
             this.b.D0(wRAP_CONTENT);
          }
          if (layoutParams.height == -2) {
             ConstraintWidget$DimensionBehaviour wRAP_CONTENT1 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
             this.a.U0(wRAP_CONTENT1);
             this.b.U0(wRAP_CONTENT1);
          }
       }
       return;
    }
    public boolean e(int p0,int p1){
       boolean b = (p0 != this.e || p1 != this.f)? true: false;
       return b;
    }
    public void f(int p0,int p1){
       MotionLayout$e tg2;
       int mode = View$MeasureSpec.getMode(p0);
       boolean mode1 = View$MeasureSpec.getMode(p1);
       MotionLayout$e tg = this.g;
       tg.z1 = mode;
       tg.A1 = mode1;
       int optimization = tg.getOptimizationLevel();
       MotionLayout$e tg1 = this.g;
       if (tg1.F == tg1.getStartState()) {
          this.g.resolveSystem(this.b, optimization, p0, p1);
          if (this.c != null) {
             this.g.resolveSystem(this.a, optimization, p0, p1);
          }
       }else if(this.c != null){
          this.g.resolveSystem(this.a, optimization, p0, p1);
       }
       this.g.resolveSystem(this.b, optimization, p0, p1);
       boolean b = false;
       if (this.g.getParent() instanceof MotionLayout) {
          tg1 = 0x40000000;
          if (mode == tg1 && mode1 == tg1) {
             tg1 = null;
          label_0056 :
             if (tg1) {
                tg1 = this.g;
                tg1.z1 = mode;
                tg1.A1 = mode1;
                if (tg1.F == tg1.getStartState()) {
                   this.g.resolveSystem(this.b, optimization, p0, p1);
                   if (this.c != null) {
                      this.g.resolveSystem(this.a, optimization, p0, p1);
                   }
                }else if(this.c != null){
                   this.g.resolveSystem(this.a, optimization, p0, p1);
                }
                this.g.resolveSystem(this.b, optimization, p0, p1);
                this.g.v1 = this.a.U();
                this.g.w1 = this.a.y();
                this.g.x1 = this.b.U();
                this.g.y1 = this.b.y();
                tg2 = this.g;
                mode1 = (tg2.v1 != tg2.x1 || tg2.w1 != tg2.y1)? true: false;
                tg2.u1 = mode1;
             }
             tg2 = this.g;
             MotionLayout v1 = tg2.v1;
             MotionLayout w1 = tg2.w1;
             MotionLayout z1 = tg2.z1;
             MotionLayout motionLayout = Integer.MIN_VALUE;
             if (z1 == motionLayout || z1 == null) {
                v1 = (int)((float)v1 + (tg2.B1 * (float)(tg2.x1 - v1)));
             }
             z1 = tg2.A1;
             if (z1 == motionLayout || z1 == null) {
                w1 = (int)((float)w1 + (tg2.B1 * (float)(tg2.y1 - w1)));
             }
             boolean b1 = (this.a.C1() || this.b.C1())? true: false;
             if (this.a.A1() || this.b.A1()) {
                b = true;
             }
             this.g.resolveMeasuredDimension(p0, p1, v1, w1, b1, b);
             return;
          }
       }
       tg1 = 1;
       goto label_0056 ;
    }
    public void g(){
       MotionLayout$e tg = this.g;
       this.f(tg.H, tg.I);
       this.g.j0();
    }
    public void h(int p0,int p1){
       this.e = p0;
       this.f = p1;
    }
    public final void i(d p0,a p1){
       SparseArray sparseArray = new SparseArray();
       Constraints$LayoutParams layoutParams = new Constraints$LayoutParams(-2, -2);
       sparseArray.clear();
       sparseArray.put(0, p0);
       sparseArray.put(this.g.getId(), p0);
       Iterator iterator = p0.e1().iterator();
       while (iterator.hasNext()) {
          ConstraintWidget uConstraintW = iterator.next();
          sparseArray.put(uConstraintW.t().getId(), uConstraintW);
       }
       Iterator iterator1 = p0.e1().iterator();
       while (iterator1.hasNext()) {
          Object obj = iterator1.next();
          Object obj1 = obj.t();
          p1.e(obj1.getId(), layoutParams);
          obj.Y0(p1.C(obj1.getId()));
          obj.z0(p1.x(obj1.getId()));
          if (obj1 instanceof ConstraintHelper) {
             p1.c(obj1, obj, layoutParams, sparseArray);
             if (obj1 instanceof Barrier) {
                obj1.w();
             }
          }
          layoutParams.resolveLayoutDirection(this.g.getLayoutDirection());
          this.g.applyConstraintsFromLayoutParams(false, obj1, obj, layoutParams, sparseArray);
          if (p1.B(obj1.getId()) == 1) {
             obj.X0(obj1.getVisibility());
          }else {
             obj.X0(p1.A(obj1.getId()));
          }
       }
       Iterator iterator2 = p0.e1().iterator();
       while (iterator2.hasNext()) {
          ConstraintWidget uConstraintW1 = iterator2.next();
          if (uConstraintW1 instanceof h) {
             uConstraintW1.t().u(p0, uConstraintW1, sparseArray);
             uConstraintW1.h1();
          }
       }
       return;
    }
}
