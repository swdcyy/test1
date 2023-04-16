package androidx.constraintlayout.solver.widgets.analyzer.b;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import i1.d;
import androidx.constraintlayout.solver.widgets.a;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type;
import h1.b;

public class b extends WidgetRun	// class@000697
{

    public void b(ConstraintWidget p0){
       super(p0);
    }
    public void a(d p0){
       WidgetRun tb = this.b;
       int i = tb.i1();
       Iterator iterator = this.h.l.iterator();
       int i1 = 0;
       int i2 = -1;
       while (iterator.hasNext()) {
          DependencyNode g = iterator.next().g;
          if (i2 == -1 || g < i2) {
             i2 = g;
          }
          if (i1 < g) {
             i1 = g;
          }
       }
       if (!i || i == 2) {
          this.h.d((i2 + tb.j1()));
       }else {
          this.h.d((i1 + tb.j1()));
       }
       return;
    }
    public void d(){
       object oobject;
       WidgetRun i2;
       WidgetRun tb = this.b;
       if (tb instanceof a) {
          boolean b = true;
          this.h.b = b;
          int i = tb.i1();
          boolean b1 = tb.h1();
          int i1 = 0;
          if (i) {
             if (i != b) {
                if (i != 2) {
                   if (i == 3) {
                      this.h.e = DependencyNode$Type.BOTTOM;
                      while (i1 < tb.O0) {
                         oobject = tb.N0[i1];
                         if (b1 || oobject.T() != 8) {
                            i2 = oobject.f.i;
                            i2.k.add(this.h);
                            this.h.l.add(i2);
                         }
                         i1 = i1 + 1;
                      }
                      this.p(this.b.f.h);
                      this.p(this.b.f.i);
                   }
                }else {
                   this.h.e = DependencyNode$Type.TOP;
                   while (i1 < tb.O0) {
                      oobject = tb.N0[i1];
                      if (b1 || oobject.T() != 8) {
                         i2 = oobject.f.h;
                         i2.k.add(this.h);
                         this.h.l.add(i2);
                      }
                      i1 = i1 + 1;
                   }
                   this.p(this.b.f.h);
                   this.p(this.b.f.i);
                }
             }else {
                this.h.e = DependencyNode$Type.RIGHT;
                while (i1 < tb.O0) {
                   oobject = tb.N0[i1];
                   if (b1 || oobject.T() != 8) {
                      i2 = oobject.e.i;
                      i2.k.add(this.h);
                      this.h.l.add(i2);
                   }
                   i1 = i1 + 1;
                }
                this.p(this.b.e.h);
                this.p(this.b.e.i);
             }
          }else {
             this.h.e = DependencyNode$Type.LEFT;
             while (i1 < tb.O0) {
                oobject = tb.N0[i1];
                if (b1 || oobject.T() != 8) {
                   i2 = oobject.e.h;
                   i2.k.add(this.h);
                   this.h.l.add(i2);
                }
                i1 = i1 + 1;
             }
             this.p(this.b.e.h);
             this.p(this.b.e.i);
          }
       }
       return;
    }
    public void e(){
       WidgetRun tb = this.b;
       if (tb instanceof a) {
          int i = tb.i1();
          if (!i || i == 1) {
             this.b.Z0(this.h.g);
          }else {
             this.b.a1(this.h.g);
          }
       }
       return;
    }
    public void f(){
       this.c = null;
       this.h.c();
    }
    public void l(){
       this.h.j = false;
    }
    public boolean n(){
       return false;
    }
    public final void p(DependencyNode p0){
       this.h.k.add(p0);
       p0.l.add(this.h);
    }
}
