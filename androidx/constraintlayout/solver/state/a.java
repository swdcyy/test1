package androidx.constraintlayout.solver.state.a;
import g1.b;
import androidx.constraintlayout.solver.state.State;
import java.lang.Object;
import g1.a;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.state.State$Constraint;
import androidx.constraintlayout.solver.state.a$a;
import java.lang.Enum;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;

public class a implements b	// class@000689
{
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;
    public State$Constraint F;
    public a G;
    public a H;
    public Object I;
    public ConstraintWidget J;
    public Object a;
    public final State b;
    public int c;
    public int d;
    public float e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    public void a(State p0){
       super();
       this.c = 0;
       this.d = 0;
       this.e = 0x3f000000;
       this.f = 0x3f000000;
       this.g = 0;
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.l = 0;
       this.m = 0;
       this.n = 0;
       this.o = 0;
       this.p = 0;
       this.q = 0;
       this.r = 0;
       this.s = null;
       this.t = null;
       this.u = null;
       this.v = null;
       this.w = null;
       this.x = null;
       this.y = null;
       this.z = null;
       this.A = null;
       this.B = null;
       this.C = null;
       this.D = null;
       this.E = null;
       this.F = null;
       Object j = a.j;
       this.G = a.a(j);
       this.H = a.a(j);
       this.b = p0;
    }
    public ConstraintWidget a(){
       if (this.J == null) {
          ConstraintWidget uConstraintW = this.e();
          this.J = uConstraintW;
          uConstraintW.p0(this.I);
       }
       return this.J;
    }
    public void apply(){
       a tJ = this.J;
       if (tJ == null) {
          return;
       }
       this.G.b(this.b, tJ, 0);
       this.H.b(this.b, this.J, 1);
       this.f();
       this.d(this.J, this.s, State$Constraint.LEFT_TO_LEFT);
       this.d(this.J, this.t, State$Constraint.LEFT_TO_RIGHT);
       this.d(this.J, this.u, State$Constraint.RIGHT_TO_LEFT);
       this.d(this.J, this.v, State$Constraint.RIGHT_TO_RIGHT);
       this.d(this.J, this.w, State$Constraint.START_TO_START);
       this.d(this.J, this.x, State$Constraint.START_TO_END);
       this.d(this.J, this.y, State$Constraint.END_TO_START);
       this.d(this.J, this.z, State$Constraint.END_TO_END);
       this.d(this.J, this.A, State$Constraint.TOP_TO_TOP);
       this.d(this.J, this.B, State$Constraint.TOP_TO_BOTTOM);
       this.d(this.J, this.C, State$Constraint.BOTTOM_TO_TOP);
       this.d(this.J, this.D, State$Constraint.BOTTOM_TO_BOTTOM);
       this.d(this.J, this.E, State$Constraint.BASELINE_TO_BASELINE);
       tJ = this.c;
       if (tJ != null) {
          this.J.B0(tJ);
       }
       tJ = this.d;
       if (tJ != null) {
          this.J.S0(tJ);
       }
       this.J.A0(this.e);
       this.J.R0(this.f);
       return;
    }
    public void b(ConstraintWidget p0){
       if (p0 == null) {
          return;
       }
       this.J = p0;
       p0.p0(this.I);
       return;
    }
    public void c(Object p0){
       this.a = p0;
    }
    public final void d(ConstraintWidget p0,Object p1,State$Constraint p2){
       ConstraintAnchor uConstraintA;
       ConstraintWidget uConstraintW = this.i(p1);
       if (uConstraintW == null) {
          return;
       }
       p1 = a$a.a;
       switch (p1[p2.ordinal()]){
           case 1:
             p1 = ConstraintAnchor$Type.LEFT;
             uConstraintA = p0.p(p1);
             uConstraintA.b(uConstraintW.p(p1), this.g, this.m, false);
             break;
           case 2:
             p0.p(ConstraintAnchor$Type.LEFT).b(uConstraintW.p(ConstraintAnchor$Type.RIGHT), this.g, this.m, false);
             break;
           case 3:
             p0.p(ConstraintAnchor$Type.RIGHT).b(uConstraintW.p(ConstraintAnchor$Type.LEFT), this.h, this.n, false);
             break;
           case 4:
             p1 = ConstraintAnchor$Type.RIGHT;
             uConstraintA = p0.p(p1);
             uConstraintA.b(uConstraintW.p(p1), this.h, this.n, false);
             break;
           case 5:
             p1 = ConstraintAnchor$Type.LEFT;
             uConstraintA = p0.p(p1);
             uConstraintA.b(uConstraintW.p(p1), this.i, this.o, false);
             break;
           case 6:
             p0.p(ConstraintAnchor$Type.LEFT).b(uConstraintW.p(ConstraintAnchor$Type.RIGHT), this.i, this.o, false);
             break;
           case 7:
             p0.p(ConstraintAnchor$Type.RIGHT).b(uConstraintW.p(ConstraintAnchor$Type.LEFT), this.j, this.p, false);
             break;
           case 8:
             p1 = ConstraintAnchor$Type.RIGHT;
             uConstraintA = p0.p(p1);
             uConstraintA.b(uConstraintW.p(p1), this.j, this.p, false);
             break;
           case 9:
             p1 = ConstraintAnchor$Type.TOP;
             uConstraintA = p0.p(p1);
             uConstraintA.b(uConstraintW.p(p1), this.k, this.q, false);
             break;
           case 10:
             p0.p(ConstraintAnchor$Type.TOP).b(uConstraintW.p(ConstraintAnchor$Type.BOTTOM), this.k, this.q, false);
             break;
           case 11:
             p0.p(ConstraintAnchor$Type.BOTTOM).b(uConstraintW.p(ConstraintAnchor$Type.TOP), this.l, this.r, false);
             break;
           case 12:
             p1 = ConstraintAnchor$Type.BOTTOM;
             uConstraintA = p0.p(p1);
             uConstraintA.b(uConstraintW.p(p1), this.l, this.r, false);
             break;
           case 13:
             ConstraintAnchor$Type bASELINE = ConstraintAnchor$Type.BASELINE;
             p0.a0(bASELINE, uConstraintW, bASELINE, 0, 0);
             break;
           default:
       }
       return;
    }
    public ConstraintWidget e(){
       return new ConstraintWidget(this.j().d(), this.h().d());
    }
    public final void f(){
       this.s = this.g(this.s);
       this.t = this.g(this.t);
       this.u = this.g(this.u);
       this.v = this.g(this.v);
       this.w = this.g(this.w);
       this.x = this.g(this.x);
       this.y = this.g(this.y);
       this.z = this.g(this.z);
       this.A = this.g(this.A);
       this.B = this.g(this.B);
       this.C = this.g(this.C);
       this.D = this.g(this.D);
       this.E = this.g(this.E);
    }
    public final Object g(Object p0){
       if (p0 == null) {
          return null;
       }
       if (!p0 instanceof a) {
          p0 = this.b.a(p0);
       }
       return p0;
    }
    public Object getKey(){
       return this.a;
    }
    public a h(){
       return this.H;
    }
    public final ConstraintWidget i(Object p0){
       if (p0 instanceof b) {
          return p0.a();
       }
       return null;
    }
    public a j(){
       return this.G;
    }
}
