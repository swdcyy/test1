package i1.i;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import java.lang.Object;
import java.util.ArrayList;
import androidx.constraintlayout.solver.widgets.d;
import i1.c;
import androidx.constraintlayout.solver.widgets.analyzer.c;
import androidx.constraintlayout.solver.widgets.analyzer.d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import java.util.List;
import java.lang.Math;
import androidx.constraintlayout.solver.widgets.analyzer.b;
import i1.d;

public class i	// class@002160
{
    public int a;
    public boolean b;
    public WidgetRun c;
    public WidgetRun d;
    public ArrayList e;
    public int f;
    public int g;
    public static int h;

    public void i(WidgetRun p0,int p1){
       super();
       this.a = 0;
       this.b = false;
       this.c = null;
       this.d = null;
       this.e = new ArrayList();
       this.f = 0;
       int h = i.h;
       this.f = h;
       i.h = h + 1;
       this.c = p0;
       this.d = p0;
       this.g = p1;
    }
    public void a(WidgetRun p0){
       this.e.add(p0);
       this.d = p0;
    }
    public long b(d p0,int p1){
       long l3;
       i tc1;
       DependencyNode f4;
       WidgetRun h1;
       i tc = this.c;
       long l = 0;
       if (tc instanceof c) {
          if (tc.f != p1) {
             return l;
          }
       }else if(!p1){
          if (!tc instanceof c) {
             return l;
          }
       }else if(!tc instanceof d){
          return l;
       }
       ConstraintWidget e = (!p1)? p0.e: p0.f;
       WidgetRun h = e.h;
       ConstraintWidget e1 = (!p1)? p0.e: p0.f;
       boolean b = tc.h.l.contains(h);
       boolean b1 = this.c.i.l.contains(e1.i);
       long l1 = this.c.j();
       if (b && b1) {
          long l2 = this.c(this.c.i, l);
          l3 = this.d(this.c.h, l) - l1;
          tc1 = this.c;
          DependencyNode f = tc1.i.f;
          if (l3 - (long)(- f) >= 0) {
             l3 = l3 + (long)f;
          }
          f = tc1.h.f;
          l2 = ((- l2) - l1) - (long)f;
          if (l2 - (long)f >= 0) {
             l2 = l2 - (long)f;
          }
          float f1 = tc1.b.r(p1);
          float f2 = 0x3f800000;
          if (f1 > 0) {
             l = (long)(((float)l2 / f1) + ((float)l3 / (f2 - f1)));
          }
          float f3 = (float)l;
          tc1 = this.c;
          l3 = (long)tc1.h.f + (((long)((f3 * f1) + 0x3f000000) + l1) + (long)((f3 * (f2 - f1)) + 0x3f000000));
          f4 = tc1.i.f;
       label_00f0 :
          l3 = l3 - (long)f4;
       }else if(b){
          h1 = this.c.h;
          l3 = Math.max(this.d(h1, (long)h1.f), ((long)this.c.h.f + l1));
       }else if(b1){
          h1 = this.c.i;
          l3 = Math.max((- this.c(h1, (long)h1.f)), ((long)(- this.c.i.f) + l1));
       }else {
          tc1 = this.c;
          l3 = (long)tc1.h.f + tc1.j();
          f4 = this.c.i.f;
          goto label_00f0 ;
       }
       return l3;
    }
    public final long c(DependencyNode p0,long p1){
       DependencyNode d = p0.d;
       if (d instanceof b) {
          return p1;
       }
       int i = p0.k.size();
       int i1 = 0;
       long l = p1;
       while (i1 < i) {
          d uod = p0.k.get(i1);
          if (uod instanceof DependencyNode && uod.d != d) {
             long l1 = (long)uod.f + p1;
             l = Math.min(l, this.c(uod, l1));
          }
          i1 = i1 + 1;
       }
       if (p0 == d.i) {
          p1 = p1 - d.j();
          l = Math.min(Math.min(l, this.c(d.h, p1)), (p1 - (long)d.h.f));
       }
       return l;
    }
    public final long d(DependencyNode p0,long p1){
       DependencyNode d = p0.d;
       if (d instanceof b) {
          return p1;
       }
       int i = p0.k.size();
       int i1 = 0;
       long l = p1;
       while (i1 < i) {
          d uod = p0.k.get(i1);
          if (uod instanceof DependencyNode && uod.d != d) {
             long l1 = (long)uod.f + p1;
             l = Math.max(l, this.d(uod, l1));
          }
          i1 = i1 + 1;
       }
       if (p0 == d.h) {
          p1 = p1 + d.j();
          l = Math.max(Math.max(l, this.d(d.i, p1)), (p1 - (long)d.i.f));
       }
       return l;
    }
}
