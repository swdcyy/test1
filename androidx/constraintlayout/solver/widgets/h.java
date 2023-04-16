package androidx.constraintlayout.solver.widgets.h;
import h1.b;
import i1.b$a;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import i1.b$b;
import androidx.constraintlayout.solver.widgets.f;

public class h extends b	// class@0006a4
{
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public boolean X0;
    public int Y0;
    public int Z0;
    public b$a a1;
    public b$b b1;

    public void h(){
       super();
       this.P0 = 0;
       this.Q0 = 0;
       this.R0 = 0;
       this.S0 = 0;
       this.T0 = 0;
       this.U0 = 0;
       this.V0 = 0;
       this.W0 = 0;
       this.X0 = false;
       this.Y0 = 0;
       this.Z0 = 0;
       this.a1 = new b$a();
       this.b1 = null;
    }
    public void A1(int p0){
       this.P0 = p0;
    }
    public void b(d p0){
       this.h1();
    }
    public void g1(boolean p0){
       h tT0 = this.T0;
       if (tT0 > null || this.U0 > null) {
          if (p0) {
             this.V0 = this.U0;
             this.W0 = tT0;
          }else {
             this.V0 = tT0;
             this.W0 = this.U0;
          }
       }
       return;
    }
    public void h1(){
       int i = 0;
       while (i < this.O0) {
          object oobject = this.N0[i];
          if (oobject != null) {
             oobject.I0(true);
          }
          i = i + 1;
       }
       return;
    }
    public int i1(){
       return this.Z0;
    }
    public int j1(){
       return this.Y0;
    }
    public int k1(){
       return this.Q0;
    }
    public int l1(){
       return this.V0;
    }
    public int m1(){
       return this.W0;
    }
    public int n1(){
       return this.P0;
    }
    public void o1(int p0,int p1,int p2,int p3){
    }
    public void p1(ConstraintWidget p0,ConstraintWidget$DimensionBehaviour p1,int p2,ConstraintWidget$DimensionBehaviour p3,int p4){
       while (this.b1 == null && this.L() != null) {
          this.b1 = this.L().v1();
       }
       h ta1 = this.a1;
       ta1.a = p1;
       ta1.b = p3;
       ta1.c = p2;
       ta1.d = p4;
       this.b1.b(p0, ta1);
       p0.Y0(this.a1.e);
       p0.z0(this.a1.f);
       p0.y0(this.a1.h);
       p0.o0(this.a1.g);
       return;
    }
    public boolean q1(){
       ConstraintWidget tV = this.V;
       b$b uob = (tV != null)? tV.v1(): null;
       if (uob == null) {
          return false;
       }else {
          int i = 0;
          int i1 = 1;
          while (i < this.O0) {
             object oobject = this.N0[i];
             if (oobject != null && !oobject instanceof f) {
                ConstraintWidget$DimensionBehaviour uDimensionBe = oobject.v(false);
                ConstraintWidget$DimensionBehaviour uDimensionBe1 = oobject.v(i1);
                ConstraintWidget$DimensionBehaviour mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (uDimensionBe != mATCH_CONSTR || (oobject.p == i1 || (uDimensionBe1 != mATCH_CONSTR || oobject.q == i1))) {
                   i1 = 0;
                }
                if (!i1) {
                   if (uDimensionBe == mATCH_CONSTR) {
                      uDimensionBe = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                   }
                   if (uDimensionBe1 == mATCH_CONSTR) {
                      uDimensionBe1 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                   }
                   h ta1 = this.a1;
                   ta1.a = uDimensionBe;
                   ta1.b = uDimensionBe1;
                   ta1.c = oobject.U();
                   this.a1.d = oobject.y();
                   uob.b(oobject, this.a1);
                   oobject.Y0(this.a1.e);
                   oobject.z0(this.a1.f);
                   oobject.o0(this.a1.g);
                }
             }
          label_0073 :
             i = i + 1;
          }
          return i1;
       }
    }
    public boolean r1(){
       return this.X0;
    }
    public void s1(boolean p0){
       this.X0 = p0;
    }
    public void t1(int p0,int p1){
       this.Y0 = p0;
       this.Z0 = p1;
    }
    public void u1(int p0){
       this.R0 = p0;
       this.P0 = p0;
       this.S0 = p0;
       this.Q0 = p0;
       this.T0 = p0;
       this.U0 = p0;
    }
    public void v1(int p0){
       this.Q0 = p0;
    }
    public void w1(int p0){
       this.U0 = p0;
    }
    public void x1(int p0){
       this.R0 = p0;
       this.V0 = p0;
    }
    public void y1(int p0){
       this.S0 = p0;
       this.W0 = p0;
    }
    public void z1(int p0){
       this.T0 = p0;
       this.V0 = p0;
       this.W0 = p0;
    }
}
