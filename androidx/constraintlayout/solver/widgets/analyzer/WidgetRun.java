package androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import i1.d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.lang.Object;
import androidx.constraintlayout.solver.widgets.analyzer.a;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType;
import java.util.List;
import java.lang.Math;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$a;
import java.lang.Enum;
import androidx.constraintlayout.solver.widgets.analyzer.d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;

public abstract class WidgetRun implements d	// class@000695
{
    public int a;
    public ConstraintWidget b;
    public i c;
    public ConstraintWidget$DimensionBehaviour d;
    public a e;
    public int f;
    public boolean g;
    public DependencyNode h;
    public DependencyNode i;
    public WidgetRun$RunType j;

    public void WidgetRun(ConstraintWidget p0){
       super();
       this.e = new a(this);
       this.f = 0;
       this.g = false;
       this.h = new DependencyNode(this);
       this.i = new DependencyNode(this);
       this.j = WidgetRun$RunType.NONE;
       this.b = p0;
    }
    public void a(d p0){
    }
    public final void b(DependencyNode p0,DependencyNode p1,int p2){
       p0.l.add(p1);
       p0.f = p2;
       p1.k.add(p0);
    }
    public final void c(DependencyNode p0,DependencyNode p1,int p2,a p3){
       p0.l.add(p1);
       p0.l.add(this.e);
       p0.h = p2;
       p0.i = p3;
       p1.k.add(p0);
       p3.k.add(p0);
    }
    public abstract void d();
    public abstract void e();
    public abstract void f();
    public final int g(int p0,int p1){
       WidgetRun tb;
       ConstraintWidget t;
       if (!p1) {
          tb = this.b;
          t = tb.t;
          tb = Math.max(tb.s, p0);
          if (t > null) {
             tb = Math.min(t, p0);
          }
          if (tb != p0) {
          label_0027 :
             p0 = tb;
          }
       }else {
          tb = this.b;
          t = tb.w;
          tb = Math.max(tb.v, p0);
          if (t > null) {
             tb = Math.min(t, p0);
          }
          if (tb != p0) {
             goto label_0027 ;
          }
       }
       return p0;
    }
    public final DependencyNode h(ConstraintAnchor p0){
       p0 = p0.f;
       DependencyNode uDependencyN = null;
       if (p0 == null) {
          return uDependencyN;
       }
       ConstraintAnchor d = p0.d;
       int i = WidgetRun$a.a[p0.e.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      uDependencyN = d.f.i;
                   }
                }else {
                   uDependencyN = d.f.k;
                }
             }else {
                uDependencyN = d.f.h;
             }
          }else {
             uDependencyN = d.e.i;
          }
       }else {
          uDependencyN = d.e.h;
       }
       return uDependencyN;
    }
    public final DependencyNode i(ConstraintAnchor p0,int p1){
       p0 = p0.f;
       DependencyNode uDependencyN = null;
       if (p0 == null) {
          return uDependencyN;
       }
       ConstraintAnchor d = p0.d;
       ConstraintWidget e = (!p1)? d.e: d.f;
       int i = WidgetRun$a.a[p0.e.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i == 5) {
                }
             }else {
             label_0029 :
                uDependencyN = e.h;
             }
          }else {
          }
       }else {
          goto label_0029 ;
       }
       return uDependencyN;
    }
    public long j(){
       WidgetRun te = this.e;
       if (te.j != null) {
          return (long)te.g;
       }
       return 0;
    }
    public boolean k(){
       return this.g;
    }
    public abstract void l();
    public final void m(int p0,int p1){
       WidgetRun widgetRun;
       WidgetRun ta = this.a;
       if (ta != null) {
          if (ta != 1) {
             if (ta != 2) {
                widgetRun = 3;
                if (ta == widgetRun) {
                   ta = this.b;
                   ConstraintWidget e = ta.e;
                   ConstraintWidget$DimensionBehaviour mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                   if (e.d == mATCH_CONSTR && e.a == widgetRun) {
                      ConstraintWidget f = ta.f;
                      if (f.d != mATCH_CONSTR || f.a != widgetRun) {
                      }
                   }else if(!p0){
                      e = ta.f;
                   }
                   if (e.e.j != null) {
                      float f1 = ta.w();
                      p0 = (p0 == 1)? (int)(((float)e.e.g / f1) + 0x3f000000): (int)((f1 * (float)e.e.g) + 0x3f000000);
                      this.e.d(p0);
                   }
                }
             }else {
                ConstraintWidget uConstraintW = this.b.L();
                if (uConstraintW != null) {
                   uConstraintW = (!p0)? uConstraintW.e: uConstraintW.f;
                   widgetRun = uConstraintW.e;
                   if (widgetRun.j != null) {
                      ta = this.b;
                      ConstraintWidget u = (!p0)? ta.u: ta.x;
                      this.e.d(this.g((int)(((float)widgetRun.g * u) + 0x3f000000), p0));
                   }
                }
             }
          }else {
             this.e.d(Math.min(this.g(this.e.m, p0), p1));
          }
       }else {
          this.e.d(this.g(p1, p0));
       }
       return;
    }
    public abstract boolean n();
    public void o(d p0,ConstraintAnchor p1,ConstraintAnchor p2,int p3){
       DependencyNode uDependencyN = this.h(p1);
       DependencyNode uDependencyN1 = this.h(p2);
       if (uDependencyN.j != null && uDependencyN1.j != null) {
          int i = uDependencyN.g + p1.f();
          int i1 = uDependencyN1.g - p2.f();
          int i2 = i1 - i;
          if (this.e.j == null && this.d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
             this.m(p3, i2);
          }
          WidgetRun te = this.e;
          if (te.j == null) {
             return;
          }else if(te.g == i2){
             this.h.d(i);
             this.i.d(i1);
             return;
          }else {
             WidgetRun tb = this.b;
             float f = (!p3)? tb.z(): tb.P();
             if (uDependencyN == uDependencyN1) {
                i = uDependencyN.g;
                i1 = uDependencyN1.g;
                f = 0x3f000000;
             }
             this.h.d((int)(((float)i + 0x3f000000) + ((float)((i1 - i) - this.e.g) * f)));
             this.i.d((this.h.g + this.e.g));
          }
       }
       return;
    }
}
