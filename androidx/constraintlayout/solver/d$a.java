package androidx.constraintlayout.solver.d$a;
import java.util.Comparator;
import androidx.constraintlayout.solver.d;
import java.lang.Object;
import androidx.constraintlayout.solver.SolverVariable;

public class d$a implements Comparator	// class@000681
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public int a(SolverVariable p0,SolverVariable p1){
       return (p0.c - p1.c);
    }
    public int compare(Object p0,Object p1){
       return this.a(p0, p1);
    }
}
