package androidx.constraintlayout.solver.widgets.analyzer.d;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type;
import i1.d;
import androidx.constraintlayout.solver.widgets.analyzer.d$a;
import java.lang.Enum;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.solver.widgets.analyzer.a;
import java.lang.Object;
import java.util.List;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import i1.a;
import h1.a;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType;
import java.lang.String;
import java.lang.StringBuilder;

public class d extends WidgetRun	// class@00069b
{
    public DependencyNode k;
    public a l;

    public void d(ConstraintWidget p0){
       super(p0);
       DependencyNode uDependencyN = new DependencyNode(this);
       this.k = uDependencyN;
       this.l = null;
       this.h.e = DependencyNode$Type.TOP;
       this.i.e = DependencyNode$Type.BOTTOM;
       uDependencyN.e = DependencyNode$Type.BASELINE;
       this.f = 1;
    }
    public void a(d p0){
       WidgetRun ti;
       int i1;
       int i2;
       int i3;
       float f1;
       float f2;
       DependencyNode uDependencyN = 3;
       DependencyNode uDependencyN1 = 1;
       if (d$a.a[this.j.ordinal()] != uDependencyN) {
          WidgetRun te = this.e;
          int i = 0;
          if (te.c != null && (te.j == null && this.d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT)) {
             te = this.b;
             ConstraintWidget q = te.q;
             if (q != 2) {
                if (q == uDependencyN && te.e.e.j != null) {
                   i1 = te.x();
                   if (i1 != -1) {
                      if (i1) {
                         if (i1 != uDependencyN1) {
                            i1 = 0;
                         label_006e :
                            this.e.d(i1);
                         }else {
                            te = this.b;
                            f1 = (float)te.e.e.g;
                            f2 = te.w();
                         }
                      }else {
                         te = this.b;
                         f1 = (float)te.e.e.g * te.w();
                      label_006c :
                         i1 = (int)(f1 + 0x3f000000);
                         goto label_006e ;
                      }
                   }else {
                      te = this.b;
                      f1 = (float)te.e.e.g;
                      f2 = te.w();
                   }
                   f1 = f1 / f2;
                   goto label_006c ;
                }
             }else {
                ConstraintWidget uConstraintW = te.L();
                if (uConstraintW != null) {
                   te = uConstraintW.f.e;
                   if (te.j != null) {
                      this.e.d((int)(((float)te.g * this.b.x) + 0x3f000000));
                   }
                }
             }
          }
          te = this.h;
          if (te.c != null) {
             ti = this.i;
             if (ti.c != null) {
                if (te.j != null && (ti.j != null && this.e.j != null)) {
                   return;
                }else if(this.e.j == null && this.d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT){
                   te = this.b;
                   if (te.p == null && !te.e0()) {
                      WidgetRun th = this.h;
                      i1 = this.h.l.get(i).g + th.f;
                      i2 = this.i.l.get(i).g + this.i.f;
                      i3 = i2 - i1;
                      th.d(i1);
                      this.i.d(i2);
                      this.e.d(i3);
                      return;
                   }
                }
                if (this.e.j == null && (this.d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && (this.a == uDependencyN1 && (this.h.l.size() > 0 && this.i.l.size() > 0)))) {
                   i2 = (this.i.l.get(i).g + this.i.f) - (this.h.l.get(i).g + this.h.f);
                   te = this.e;
                   a m = te.m;
                   if (i2 < m) {
                      te.d(i2);
                   }else {
                      te.d(m);
                   }
                }
             label_014d :
                if (this.e.j == null) {
                   return;
                }else if(this.h.l.size() > 0 && this.i.l.size() > 0){
                   DependencyNode uDependencyN2 = this.h.l.get(i);
                   DependencyNode uDependencyN3 = this.i.l.get(i);
                   int i4 = uDependencyN2.g + this.h.f;
                   i3 = uDependencyN3.g + this.i.f;
                   float f = this.b.P();
                   if (uDependencyN2 == uDependencyN3) {
                      i4 = uDependencyN2.g;
                      uDependencyN1 = uDependencyN3.g;
                      f = 0x3f000000;
                   }
                   this.h.d((int)(((float)i4 + 0x3f000000) + ((float)((uDependencyN1 - i4) - this.e.g) * f)));
                   this.i.d((this.h.g + this.e.g));
                }
             }
          }
          return;
       }else {
          ti = this.b;
          this.o(p0, ti.K, ti.M, uDependencyN1);
          return;
       }
    }
    public void d(){
       ConstraintWidget uConstraintW;
       DependencyNode uDependencyN;
       ConstraintWidget q;
       ConstraintWidget$DimensionBehaviour mATCH_CONSTR;
       WidgetRun tb = this.b;
       if (tb.a != null) {
          this.e.d(tb.y());
       }
       if (this.e.j == null) {
          this.d = this.b.R();
          if (this.b.X()) {
             this.l = new a(this);
          }
          tb = this.d;
          if (tb != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
             if (tb == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
                uConstraintW = this.b.L();
                if (uConstraintW != null && uConstraintW.R() == ConstraintWidget$DimensionBehaviour.FIXED) {
                   this.b(this.h, uConstraintW.f.h, this.b.K.f());
                   this.b(this.i, uConstraintW.f.i, (- this.b.M.f()));
                   this.e.d(((uConstraintW.y() - this.b.K.f()) - this.b.M.f()));
                   return;
                }
             }
             if (this.d == ConstraintWidget$DimensionBehaviour.FIXED) {
                this.e.d(this.b.y());
             }
          }
       }else if(this.d == ConstraintWidget$DimensionBehaviour.MATCH_PARENT){
          uConstraintW = this.b.L();
          if (uConstraintW != null && uConstraintW.R() == ConstraintWidget$DimensionBehaviour.FIXED) {
             this.b(this.h, uConstraintW.f.h, this.b.K.f());
             this.b(this.i, uConstraintW.f.i, (- this.b.M.f()));
             return;
          }
       }
       tb = this.e;
       DependencyNode j = tb.j;
       WidgetRun widgetRun = null;
       int i = 2;
       if (j != null) {
          WidgetRun tb1 = this.b;
          if (tb1.a != null) {
             uConstraintW = tb1.R;
             if (uConstraintW[i].f != null && uConstraintW[3].f != null) {
                if (tb1.e0()) {
                   this.h.f = this.b.R[i].f();
                   this.i.f = - this.b.R[3].f();
                }else {
                   uDependencyN = this.h(this.b.R[i]);
                   if (uDependencyN != null) {
                      this.b(this.h, uDependencyN, this.b.R[i].f());
                   }
                   uDependencyN = this.h(this.b.R[3]);
                   if (uDependencyN != null) {
                      this.b(this.i, uDependencyN, (- this.b.R[3].f()));
                   }
                   this.h.b = true;
                   this.i.b = true;
                }
                if (this.b.X()) {
                   this.b(this.k, this.h, this.b.q());
                }
             }else if(uConstraintW[i].f != null){
                uDependencyN = this.h(uConstraintW[i]);
                if (uDependencyN != null) {
                   this.b(this.h, uDependencyN, this.b.R[i].f());
                   this.b(this.i, this.h, this.e.g);
                   if (this.b.X()) {
                      this.b(this.k, this.h, this.b.q());
                   }
                }
             }else if(uConstraintW[3].f != null){
                uDependencyN = this.h(uConstraintW[3]);
                if (uDependencyN != null) {
                   this.b(this.i, uDependencyN, (- this.b.R[3].f()));
                   this.b(this.h, this.i, (- this.e.g));
                }
                if (this.b.X()) {
                   this.b(this.k, this.h, this.b.q());
                }
             }else if(uConstraintW[4].f != null){
                uDependencyN = this.h(uConstraintW[4]);
                if (uDependencyN != null) {
                   this.b(this.k, uDependencyN, widgetRun);
                   this.b(this.h, this.k, (- this.b.q()));
                   this.b(this.i, this.h, this.e.g);
                }
             }else if(!tb1 instanceof a && (tb1.L() != null && this.b.p(ConstraintAnchor$Type.CENTER).f == null)){
                this.b(this.h, this.b.L().f.h, this.b.W());
                this.b(this.i, this.h, this.e.g);
                if (this.b.X()) {
                   this.b(this.k, this.h, this.b.q());
                }
             }
          }else if(j == null && this.d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT){
             tb = this.b;
             q = tb.q;
             if (q != i) {
                if (q == 3 && !tb.e0()) {
                   tb = this.b;
                   if (tb.p != 3) {
                      tb = tb.e.e;
                      this.e.l.add(tb);
                      tb.k.add(this.e);
                      tb = this.e;
                      tb.b = true;
                      tb.k.add(this.h);
                      this.e.k.add(this.i);
                   }
                }
             }else {
                uConstraintW = tb.L();
                if (uConstraintW != null) {
                   tb = uConstraintW.f.e;
                   this.e.l.add(tb);
                   tb.k.add(this.e);
                   tb = this.e;
                   tb.b = true;
                   tb.k.add(this.h);
                   this.e.k.add(this.i);
                }
             }
          }else {
             tb.b(this);
          }
          tb = this.b;
          q = tb.R;
          if (q[i].f != null && q[3].f != null) {
             if (tb.e0()) {
                this.h.f = this.b.R[i].f();
                this.i.f = - this.b.R[3].f();
             }else {
                this.h(this.b.R[i]).b(this);
                this.h(this.b.R[3]).b(this);
                this.j = WidgetRun$RunType.CENTER;
             }
             if (this.b.X()) {
                this.c(this.k, this.h, true, this.l);
             }
          }else if(q[i].f != null){
             uDependencyN = this.h(q[i]);
             if (uDependencyN != null) {
                this.b(this.h, uDependencyN, this.b.R[i].f());
                this.c(this.i, this.h, true, this.e);
                if (this.b.X()) {
                   this.c(this.k, this.h, true, this.l);
                }
                mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (this.d == mATCH_CONSTR && this.b.w() > 0) {
                   uConstraintW = this.b.e;
                   if (uConstraintW.d == mATCH_CONSTR) {
                      uConstraintW.e.k.add(this.e);
                      this.e.l.add(this.b.e.e);
                      this.e.a = this;
                   }
                }
             }
          }else if(q[3].f != null){
             uDependencyN = this.h(q[3]);
             if (uDependencyN != null) {
                this.b(this.i, uDependencyN, (- this.b.R[3].f()));
                this.c(this.h, this.i, -1, this.e);
                if (this.b.X()) {
                   this.c(this.k, this.h, true, this.l);
                }
             }
          }else if(q[4].f != null){
             uDependencyN = this.h(q[4]);
             if (uDependencyN != null) {
                this.b(this.k, uDependencyN, widgetRun);
                this.c(this.h, this.k, -1, this.l);
                this.c(this.i, this.h, true, this.e);
             }
          }else if(!tb instanceof a && tb.L() != null){
             this.b(this.h, this.b.L().f.h, this.b.W());
             this.c(this.i, this.h, true, this.e);
             if (this.b.X()) {
                this.c(this.k, this.h, true, this.l);
             }
             mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
             if (this.d == mATCH_CONSTR && this.b.w() > 0) {
                uConstraintW = this.b.e;
                if (uConstraintW.d == mATCH_CONSTR) {
                   uConstraintW.e.k.add(this.e);
                   this.e.l.add(this.b.e.e);
                   this.e.a = this;
                }
             }
          }
       label_0478 :
          if (!this.e.l.size()) {
             this.e.c = true;
          }
       }else {
          goto label_0265 ;
       }
    label_0486 :
       return;
    }
    public void e(){
       WidgetRun th = this.h;
       if (th.j != null) {
          this.b.a1(th.g);
       }
       return;
    }
    public void f(){
       this.c = null;
       this.h.c();
       this.i.c();
       this.k.c();
       this.e.c();
       this.g = false;
    }
    public void l(){
       this.g = false;
       this.h.c();
       this.h.j = false;
       this.i.c();
       this.i.j = false;
       this.k.c();
       this.k.j = false;
       this.e.j = false;
    }
    public boolean n(){
       if (this.d != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
          return true;
       }
       if (this.b.q == null) {
          return true;
       }
       return false;
    }
    public String toString(){
       return "VerticalRun "+this.b.u();
    }
}
