package androidx.constraintlayout.solver.widgets.analyzer.a;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.c;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;
import i1.d;

public class a extends DependencyNode	// class@000696
{
    public int m;

    public void a(WidgetRun p0){
       super(p0);
       this.e = (p0 instanceof c)? DependencyNode$Type.HORIZONTAL_DIMENSION: DependencyNode$Type.VERTICAL_DIMENSION;
       return;
    }
    public void d(int p0){
       if (this.j != null) {
          return;
       }
       this.j = true;
       this.g = p0;
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(iterator.next());
       }
       return;
    }
}
