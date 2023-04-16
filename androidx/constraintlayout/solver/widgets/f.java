package androidx.constraintlayout.solver.widgets.f;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.lang.Object;
import androidx.constraintlayout.solver.c;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.b;
import java.util.HashMap;
import androidx.constraintlayout.solver.widgets.f$a;
import java.lang.Enum;
import java.lang.AssertionError;
import java.lang.String;

public class f extends ConstraintWidget	// class@0006a2
{
    public float N0;
    public int O0;
    public int P0;
    public ConstraintAnchor Q0;
    public int R0;
    public int S0;
    public boolean T0;

    public void f(){
       super();
       this.N0 = 0xbf800000;
       this.O0 = -1;
       this.P0 = -1;
       this.Q0 = this.K;
       int i = 0;
       this.R0 = i;
       this.S0 = i;
       this.S.clear();
       this.S.add(this.Q0);
       int len = this.R.length;
       for (; i < len; i = i + 1) {
          this.R[i] = this.Q0;
       }
       return;
    }
    public void d1(c p0,boolean p1){
       if (this.L() == null) {
          return;
       }
       int i = p0.x(this.Q0);
       if (this.R0 == 1) {
          this.Z0(i);
          this.a1(0);
          this.z0(this.L().y());
          this.Y0(0);
       }else {
          this.Z0(0);
          this.a1(i);
          this.Y0(this.L().U());
          this.z0(0);
       }
       return;
    }
    public ConstraintAnchor e1(){
       return this.Q0;
    }
    public int f1(){
       return this.R0;
    }
    public void g(c p0,boolean p1){
       f uof;
       SolverVariable solverVariab;
       d uod = this.L();
       if (uod == null) {
          return;
       }
       ConstraintAnchor uConstraintA = uod.p(ConstraintAnchor$Type.LEFT);
       ConstraintAnchor uConstraintA1 = uod.p(ConstraintAnchor$Type.RIGHT);
       ConstraintWidget tV = this.V;
       int i = 1;
       ConstraintWidget$DimensionBehaviour uDimensionBe = (tV != null && tV.U[0] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT)? 1: null;
       if (this.R0 == null) {
          uConstraintA = uod.p(ConstraintAnchor$Type.TOP);
          uConstraintA1 = uod.p(ConstraintAnchor$Type.BOTTOM);
          ConstraintWidget tV1 = this.V;
          if (tV1 == null || tV1.U[i] != ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
             uof = 0;
          }
          uDimensionBe = i;
       }
       uof = -1;
       if (this.T0 != null && this.Q0.n()) {
          solverVariab = p0.q(this.Q0);
          p0.f(solverVariab, this.Q0.e());
          if (this.O0 != uof) {
             if (uDimensionBe) {
                p0.h(p0.q(uConstraintA1), solverVariab, 0, 5);
             }
          }else if(this.P0 != uof && uDimensionBe){
             p0.h(solverVariab, p0.q(uConstraintA), 0, 5);
             p0.h(p0.q(uConstraintA1), solverVariab, 0, 5);
          }
          this.T0 = false;
          return;
       }else if(this.O0 != uof){
          solverVariab = p0.q(this.Q0);
          p0.e(solverVariab, p0.q(uConstraintA), this.O0, 8);
          if (uDimensionBe) {
             p0.h(p0.q(uConstraintA1), solverVariab, 0, 5);
          }
       }else if(this.P0 != uof){
          solverVariab = p0.q(this.Q0);
          SolverVariable solverVariab1 = p0.q(uConstraintA1);
          p0.e(solverVariab, solverVariab1, (- this.P0), 8);
          if (uDimensionBe) {
             p0.h(solverVariab, p0.q(uConstraintA), 0, 5);
             p0.h(solverVariab1, solverVariab, 0, 5);
          }
       }else if(this.N0 - 0xbf800000){
          p0.d(c.s(p0, p0.q(this.Q0), p0.q(uConstraintA1), this.N0));
       }
       return;
    }
    public int g1(){
       return this.O0;
    }
    public boolean h(){
       return true;
    }
    public boolean h0(){
       return this.T0;
    }
    public int h1(){
       return this.P0;
    }
    public boolean i0(){
       return this.T0;
    }
    public float i1(){
       return this.N0;
    }
    public void j1(int p0){
       this.Q0.t(p0);
       this.T0 = true;
    }
    public void k1(int p0){
       if (p0 > -1) {
          this.N0 = 0xbf800000;
          this.O0 = p0;
          this.P0 = -1;
       }
       return;
    }
    public void l1(int p0){
       if (p0 > -1) {
          this.N0 = 0xbf800000;
          this.O0 = -1;
          this.P0 = p0;
       }
       return;
    }
    public void m(ConstraintWidget p0,HashMap p1){
       super.m(p0, p1);
       this.N0 = p0.N0;
       this.O0 = p0.O0;
       this.P0 = p0.P0;
       this.n1(p0.R0);
    }
    public void m1(float p0){
       if (p0 - 0xbf800000 > 0) {
          this.N0 = p0;
          this.O0 = -1;
          this.P0 = -1;
       }
       return;
    }
    public void n1(int p0){
       if (this.R0 == p0) {
          return;
       }
       this.R0 = p0;
       this.S.clear();
       this.Q0 = (this.R0 == 1)? this.J: this.K;
       this.S.add(this.Q0);
       p0 = this.R.length;
       for (int i = 0; i < p0; i = i + 1) {
          this.R[i] = this.Q0;
       }
       return;
    }
    public ConstraintAnchor p(ConstraintAnchor$Type p0){
       switch (f$a.a[p0.ordinal()]){
           case 1:
           case 2:
             if (this.R0 == 1) {
                return this.Q0;
             }
          label_001d :
             throw new AssertionError(p0.name());
             break;
           case 3:
           case 4:
             if (this.R0 == null) {
                return this.Q0;
             }
             goto label_001d ;
             break;
           case 5:
           case 7:
           case 8:
           case 9:
           case 6:
             return null;
           default:
             goto label_001d ;
       }
    }
}
