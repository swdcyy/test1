package androidx.constraintlayout.solver.widgets.a;
import h1.b;
import java.lang.String;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.c;
import java.lang.Object;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.solver.b;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type;
import java.lang.Math;
import java.util.HashMap;
import java.lang.StringBuilder;

public class a extends b	// class@000690
{
    public int P0;
    public boolean Q0;
    public int R0;
    public boolean S0;

    public void a(){
       super();
       this.P0 = 0;
       this.Q0 = true;
       this.R0 = 0;
       this.S0 = false;
    }
    public void a(String p0){
       super();
       this.P0 = 0;
       this.Q0 = true;
       this.R0 = 0;
       this.S0 = false;
       this.q0(p0);
    }
    public void g(c p0,boolean p1){
       int i4;
       int i6;
       ConstraintWidget tR = this.R;
       tR[0] = this.J;
       int i = 2;
       tR[i] = this.K;
       tR[1] = this.L;
       tR[3] = this.M;
       int i1 = 0;
       ConstraintWidget tR1 = this.R;
       while (i1 < tR1.length) {
          tR1[i1].i = p0.q(tR1[i1]);
          i1++;
       }
       a tP0 = this.P0;
       if (tP0 >= null && tP0 < 4) {
          object oobject = tR1[tP0];
          if (this.S0 == null) {
             this.g1();
          }
          if (this.S0 != null) {
             this.S0 = false;
             tP0 = this.P0;
             if (tP0 == null || tP0 == 1) {
                p0.f(this.J.i, this.a0);
                p0.f(this.L.i, this.a0);
             }else if(tP0 == i || tP0 == 3){
                p0.f(this.K.i, this.b0);
                p0.f(this.M.i, this.b0);
             }
             return;
          }else {
             boolean i2 = 0;
             while (true) {
                if (i2 < this.O0) {
                   object oobject1 = this.N0[i2];
                   if (this.Q0 != null || oobject1.h()) {
                      a tP01 = this.P0;
                      if (tP01 != null && (tP01 != 1 || (oobject1.B() != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT || (oobject1.J.f == null || oobject1.L.f == null)))) {
                         tP01 = this.P0;
                         if (tP01 != i && (tP01 != 3 || (oobject1.R() != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT || (oobject1.K.f == null || oobject1.M.f == null)))) {
                         label_00bb :
                            i2 = i2 + 1;
                         }
                      }
                      i2 = true;
                   label_00bf :
                      oobject1 = (this.J.l() || this.L.l())? 1: 0;
                      tP01 = (this.K.l() || this.M.l())? 1: 0;
                      if (!i2) {
                         a tP02 = this.P0;
                         if (tP02 != null || (!oobject1 && (tP02 != i || (!tP01 && (tP02 != 1 || (oobject1 || (tP02 == 3 && tP01))))))) {
                            oobject1 = 1;
                         label_00fe :
                            int i3 = 5;
                            if (!oobject1) {
                               i3 = 4;
                            }
                            i4 = 0;
                            while (i4 < this.O0) {
                               object oobject2 = this.N0[i4];
                               if (this.Q0 != null || oobject2.h()) {
                                  SolverVariable solverVariab = p0.q(oobject2.R[this.P0]);
                                  ConstraintWidget r = oobject2.R;
                                  a tP03 = this.P0;
                                  r[tP03].i = solverVariab;
                                  int i5 = (r[tP03].f != null && r[tP03].f.d == this)? r[tP03].g + 0: 0;
                                  if (tP03 == null || tP03 == i) {
                                     i6 = this.R0 - i5;
                                     p0.i(oobject.i, solverVariab, i6, i2);
                                  }else {
                                     i6 = this.R0 + i5;
                                     p0.g(oobject.i, solverVariab, i6, i2);
                                  }
                                  i6 = this.R0 + i5;
                                  p0.e(oobject.i, solverVariab, i6, i3);
                               }
                               i4 = i4 + 1;
                            }
                            tP0 = this.P0;
                            i2 = 8;
                            if (tP0 == null) {
                               p0.e(this.L.i, this.J.i, 0, i2);
                               p0.e(this.J.i, this.V.L.i, 0, 4);
                               p0.e(this.J.i, this.V.J.i, 0, 0);
                            }else if(tP0 == 1){
                               p0.e(this.J.i, this.L.i, 0, i2);
                               p0.e(this.J.i, this.V.J.i, 0, 4);
                               p0.e(this.J.i, this.V.L.i, 0, 0);
                            }else if(tP0 == i){
                               p0.e(this.M.i, this.K.i, 0, i2);
                               p0.e(this.K.i, this.V.M.i, 0, 4);
                               p0.e(this.K.i, this.V.K.i, 0, 0);
                            }else if(tP0 == 3){
                               p0.e(this.K.i, this.M.i, 0, i2);
                               p0.e(this.K.i, this.V.K.i, 0, 4);
                               p0.e(this.K.i, this.V.M.i, 0, 0);
                            }
                         }
                      }
                      i4 = 0;
                      goto label_00fe ;
                   }
                }else {
                   i2 = false;
                   goto label_00bf ;
                }
             }
          }
       }
       return;
    }
    public boolean g1(){
       object oobject;
       a tP0;
       int i = 0;
       int i1 = 0;
       int i2 = 1;
       b tO0 = this.O0;
       while (i1 < tO0) {
          oobject = this.N0[i1];
          if (this.Q0 != null || oobject.h()) {
             tP0 = this.P0;
             if (tP0 != null && (tP0 != true || oobject.h0())) {
                tP0 = this.P0;
                if (tP0 != 2 && (tP0 != 3 || oobject.i0())) {
                label_0034 :
                   i1 = i1 + 1;
                }
             }
             i2 = 0;
             goto label_0034 ;
          }
       }
       if (!i2 || tO0 <= null) {
          return i;
       }
       ConstraintAnchor$Type type = null;
       a uoa = null;
       while (i < this.O0) {
          oobject = this.N0[i];
          if (this.Q0 != null || oobject.h()) {
             if (!uoa) {
                uoa = this.P0;
                if (uoa == null) {
                   type = oobject.p(ConstraintAnchor$Type.LEFT).e();
                }else if(uoa == true){
                   type = oobject.p(ConstraintAnchor$Type.RIGHT).e();
                }else if(uoa == 2){
                   type = oobject.p(ConstraintAnchor$Type.TOP).e();
                }else if(uoa == 3){
                   type = oobject.p(ConstraintAnchor$Type.BOTTOM).e();
                }
                uoa = 1;
             }
             tP0 = this.P0;
             if (tP0 == null) {
                type = Math.min(type, oobject.p(ConstraintAnchor$Type.LEFT).e());
             }else if(tP0 == true){
                type = Math.max(type, oobject.p(ConstraintAnchor$Type.RIGHT).e());
             }else if(tP0 == 2){
                type = Math.min(type, oobject.p(ConstraintAnchor$Type.TOP).e());
             }else if(tP0 == 3){
                type = Math.max(type, oobject.p(ConstraintAnchor$Type.BOTTOM).e());
             }
          }
          i = i + 1;
       }
       i1 = type + this.R0;
       a tP01 = this.P0;
       if (tP01 == null || tP01 == true) {
          this.t0(i1, i1);
       }else {
          this.w0(i1, i1);
       }
       this.S0 = true;
       return true;
    }
    public boolean h(){
       return true;
    }
    public boolean h0(){
       return this.S0;
    }
    public boolean h1(){
       return this.Q0;
    }
    public boolean i0(){
       return this.S0;
    }
    public int i1(){
       return this.P0;
    }
    public int j1(){
       return this.R0;
    }
    public int k1(){
       a tP0 = this.P0;
       if (tP0 == null || tP0 == 1) {
          return 0;
       }
       if (tP0 != 2 && tP0 != 3) {
          return -1;
       }
       return 1;
    }
    public void l1(){
       int i = 0;
       while (i < this.O0) {
          object oobject = this.N0[i];
          a tP0 = this.P0;
          if (tP0 == null || tP0 == true) {
             oobject.G0(0, true);
          }else if(tP0 == 2 || tP0 == 3){
             oobject.G0(true, true);
          }
          i = i + 1;
       }
       return;
    }
    public void m(ConstraintWidget p0,HashMap p1){
       super.m(p0, p1);
       this.P0 = p0.P0;
       this.Q0 = p0.Q0;
       this.R0 = p0.R0;
    }
    public void m1(boolean p0){
       this.Q0 = p0;
    }
    public void n1(int p0){
       this.P0 = p0;
    }
    public void o1(int p0){
       this.R0 = p0;
    }
    public String toString(){
       String str = "[Barrier] "+this.u()+" {";
       for (int i = 0; i < this.O0; i = i + 1) {
          object oobject = this.N0[i];
          if (i > 0) {
             str = str+", ";
          }
          str = str+oobject.u();
       }
       return str+"}";
    }
}
