package androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import i1.d;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import java.lang.Object;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import androidx.constraintlayout.solver.widgets.analyzer.a;
import java.lang.String;
import java.lang.StringBuilder;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.lang.Integer;

public class DependencyNode implements d	// class@000692
{
    public d a;
    public boolean b;
    public boolean c;
    public WidgetRun d;
    public DependencyNode$Type e;
    public int f;
    public int g;
    public int h;
    public a i;
    public boolean j;
    public List k;
    public List l;

    public void DependencyNode(WidgetRun p0){
       super();
       this.a = null;
       this.b = false;
       this.c = false;
       this.e = DependencyNode$Type.UNKNOWN;
       this.h = 1;
       this.i = null;
       this.j = false;
       this.k = new ArrayList();
       this.l = new ArrayList();
       this.d = p0;
    }
    public void a(d p0){
       DependencyNode ti;
       Iterator iterator = this.l.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next().j == null) {
                return;
             }
             continue ;
          }else {
             boolean b = true;
             this.c = b;
             DependencyNode ta = this.a;
             if (ta != null) {
                ta.a(this);
             }
             if (this.b != null) {
                this.d.a(this);
                return;
             }else {
                ta = null;
                int i = 0;
                Iterator iterator1 = this.l.iterator();
                while (iterator1.hasNext()) {
                   DependencyNode uDependencyN = iterator1.next();
                   if (uDependencyN instanceof a) {
                      continue ;
                   }
                   i = i + 1;
                   ta = uDependencyN;
                }
                if (ta != null && (i == b && ta.j != null)) {
                   ti = this.i;
                   if (ti != null) {
                      if (ti.j != null) {
                         this.f = this.h * ti.g;
                      }else {
                         return;
                      }
                   }
                   this.d((ta.g + this.f));
                }
             label_006a :
                ti = this.a;
                if (ti != null) {
                   ti.a(this);
                }
             }
          }
       }
       return;
    }
    public void b(d p0){
       this.k.add(p0);
       if (this.j != null) {
          p0.a(p0);
       }
       return;
    }
    public void c(){
       this.l.clear();
       this.k.clear();
       this.j = false;
       this.g = 0;
       this.c = false;
       this.b = false;
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
    public String toString(){
       StringBuilder str = this.d.b.u()+":"+this.e+"\(";
       Integer integer = (this.j != null)? Integer.valueOf(this.g): "unresolved";
       return str+integer+"\) <t="+this.l.size()+":d="+this.k.size()+">";
    }
}
