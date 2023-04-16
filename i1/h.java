package i1.h;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.c;
import androidx.constraintlayout.solver.widgets.analyzer.d;
import androidx.constraintlayout.solver.widgets.f;
import i1.d;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import java.lang.Object;
import java.util.List;

public class h extends WidgetRun	// class@00215f
{

    public void h(ConstraintWidget p0){
       super(p0);
       p0.e.f();
       p0.f.f();
       this.f = p0.f1();
    }
    public void a(d p0){
       WidgetRun th = this.h;
       if (th.c == null) {
          return;
       }
       if (th.j != null) {
          return;
       }
       this.h.d((int)(((float)th.l.get(0).g * this.b.i1()) + 0x3f000000));
       return;
    }
    public void d(){
       WidgetRun tb = this.b;
       int i = tb.g1();
       int i1 = tb.h1();
       if (tb.f1() == 1) {
          if (i != -1) {
             this.h.l.add(this.b.V.e.h);
             this.b.V.e.h.k.add(this.h);
             this.h.f = i;
          }else if(i1 != -1){
             this.h.l.add(this.b.V.e.i);
             this.b.V.e.i.k.add(this.h);
             this.h.f = - i1;
          }else {
             tb = this.h;
             tb.b = true;
             tb.l.add(this.b.V.e.i);
             this.b.V.e.i.k.add(this.h);
          }
          this.p(this.b.e.h);
          this.p(this.b.e.i);
       }else if(i != -1){
          this.h.l.add(this.b.V.f.h);
          this.b.V.f.h.k.add(this.h);
          this.h.f = i;
       }else if(i1 != -1){
          this.h.l.add(this.b.V.f.i);
          this.b.V.f.i.k.add(this.h);
          this.h.f = - i1;
       }else {
          tb = this.h;
          tb.b = true;
          tb.l.add(this.b.V.f.i);
          this.b.V.f.i.k.add(this.h);
       }
       this.p(this.b.f.h);
       this.p(this.b.f.i);
       return;
    }
    public void e(){
       if (this.b.f1() == 1) {
          this.b.Z0(this.h.g);
       }else {
          this.b.a1(this.h.g);
       }
       return;
    }
    public void f(){
       this.h.c();
    }
    public void l(){
       this.h.j = false;
       this.i.j = false;
    }
    public boolean n(){
       return false;
    }
    public final void p(DependencyNode p0){
       this.h.k.add(p0);
       p0.l.add(this.h);
    }
}
