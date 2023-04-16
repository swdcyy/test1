package androidx.constraintlayout.solver.widgets.c;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.lang.Object;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.util.ArrayList;

public class c	// class@00069d
{
    public ConstraintWidget a;
    public ConstraintWidget b;
    public ConstraintWidget c;
    public ConstraintWidget d;
    public ConstraintWidget e;
    public ConstraintWidget f;
    public ConstraintWidget g;
    public ArrayList h;
    public int i;
    public int j;
    public float k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;

    public void c(ConstraintWidget p0,int p1,boolean p2){
       super();
       this.k = 0;
       this.q = false;
       this.a = p0;
       this.p = p1;
       this.q = p2;
    }
    public static boolean c(ConstraintWidget p0,int p1){
       boolean b;
       if (p0.T() != 8 && p0.U[p1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
          p0 = p0.r;
          if (!p0[p1] || p0[p1] == 3) {
             b = true;
          label_001e :
             return b;
          }
       }
       b = false;
       goto label_001e ;
    }
    public void a(){
       if (this.v == null) {
          this.b();
       }
       this.v = true;
       return;
    }
    public final void b(){
       ConstraintWidget r;
       c uoc = 2;
       int i = this.p * 2;
       c ta = this.a;
       boolean b = true;
       this.o = b;
       c uoc1 = ta;
       int i1 = 0;
       while (!i1) {
          int i2 = this.i + b;
          this.i = i2;
          c tp = this.p;
          object oobject = null;
          ta.H0[tp] = oobject;
          ta.G0[tp] = oobject;
          if (ta.T() != 8) {
             i2 = this.l + b;
             this.l = i2;
             ConstraintWidget$DimensionBehaviour mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
             if (ta.v(this.p) != mATCH_CONSTR) {
                i2 = this.m + ta.F(this.p);
                this.m = i2;
             }
             i2 = this.m + ta.R[i].f();
             this.m = i2;
             int i3 = i + 1;
             i2 = i2 + ta.R[i3].f();
             this.m = i2;
             i2 = this.n + ta.R[i].f();
             this.n = i2;
             i2 = i2 + ta.R[i3].f();
             this.n = i2;
             if (this.b == null) {
                this.b = ta;
             }
             this.d = ta;
             c tp1 = this.p;
             if (ta.U[tp1] == mATCH_CONSTR) {
                r = ta.r;
                i3 = 0;
                if (r[tp1] && (r[tp1] == 3 || r[tp1] == uoc)) {
                   i2 = this.j + b;
                   this.j = i2;
                   r = ta.F0;
                   int i4 = r[tp1];
                   if (i4 - i3 > 0) {
                      float f = this.k + r[tp1];
                      this.k = f;
                   }
                   if (c.c(ta, tp1)) {
                      this.r = (i4 - i3 < 0)? b: b;
                      if (this.h == null) {
                         this.h = new ArrayList();
                      }
                      this.h.add(ta);
                   }
                   if (this.f == null) {
                      this.f = ta;
                   }
                   c tg = this.g;
                   if (tg != null) {
                      tg.G0[this.p] = ta;
                   }
                   this.g = ta;
                }
                if (this.p == null) {
                   if (ta.p != null) {
                      this.o = false;
                   }else if(ta.s != null || ta.t != null){
                      this.o = false;
                   }
                }else if(ta.q != null){
                   this.o = false;
                }else if(ta.v != null || ta.w != null){
                   this.o = false;
                }
                if (ta.Y - i3) {
                   this.o = false;
                   this.u = b;
                }
             }
          }
       label_0109 :
          if (uoc1 != ta) {
             uoc1.H0[this.p] = ta;
          }
          i2 = i + 1;
          ConstraintAnchor f1 = ta.R[i2].f;
          if (f1 != null) {
             f1 = f1.d;
             r = f1.R;
             if (r[i].f != null && r[i].f.d == ta) {
                oobject = f1;
             }
          }
          if (oobject == null) {
             oobject = ta;
             i1 = 1;
          }
          uoc1 = ta;
          ta = oobject;
       }
       uoc = this.b;
       if (uoc != null) {
          this.m = this.m - uoc.R[i].f();
       }
       uoc = this.d;
       if (uoc != null) {
          this.m = this.m - uoc.R[(i + b)].f();
       }
       this.c = ta;
       this.e = (this.p == null && this.q != null)? ta: this.a;
       if (this.s == null || this.r == null) {
          b = false;
       }
       this.t = b;
       return;
    }
}
