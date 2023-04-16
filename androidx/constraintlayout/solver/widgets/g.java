package androidx.constraintlayout.solver.widgets.g;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.c;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.lang.Object;
import androidx.constraintlayout.solver.SolverVariable;

public class g	// class@0006a3
{
    public static boolean[] a;

    static {
       boolean[] uobooleanArr = new boolean[3];
       g.a = uobooleanArr;
    }
    public static void a(d p0,c p1,ConstraintWidget p2){
       ConstraintAnchor g;
       p2.n = -1;
       p2.o = -1;
       int i = 0;
       ConstraintWidget$DimensionBehaviour wRAP_CONTENT = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
       if (p0.U[i] != wRAP_CONTENT && p2.U[i] == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
          g = p2.J.g;
          i = p0.U() - p2.L.g;
          ConstraintWidget j = p2.J;
          j.i = p1.q(j);
          j = p2.L;
          j.i = p1.q(j);
          p1.f(p2.J.i, g);
          p1.f(p2.L.i, i);
          p2.n = 2;
          p2.C0(g, i);
       }
       i = 1;
       if (p0.U[i] != wRAP_CONTENT && p2.U[i] == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
          g = p2.K.g;
          int i1 = p0.y() - p2.M.g;
          ConstraintWidget k = p2.K;
          k.i = p1.q(k);
          k = p2.M;
          k.i = p1.q(k);
          p1.f(p2.K.i, g);
          p1.f(p2.M.i, i1);
          if (p2.g0 > null || p2.T() == 8) {
             k = p2.N;
             k.i = p1.q(k);
             p1.f(p2.N.i, (p2.g0 + g));
          }
          p2.o = 2;
          p2.T0(g, i1);
       }
       return;
    }
    public static final boolean b(int p0,int p1){
       boolean b = ((p0 & p1) == p1)? true: false;
       return b;
    }
}
