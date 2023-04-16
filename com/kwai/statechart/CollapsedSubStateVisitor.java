package com.kwai.statechart.CollapsedSubStateVisitor;
import ut7.j;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.statechart.CollapsedSubStateVisitor$realSubChartFilter$1;
import com.kwai.statechart.PlantUmlStateDiagramVisitor;
import com.kwai.statechart.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class CollapsedSubStateVisitor implements j	// class@0018e3
{
    public final l a;
    public final PlantUmlStateDiagramVisitor b;
    public a c;
    public boolean d;

    public void CollapsedSubStateVisitor(l p0,l p1){
       a.p(p0, "transitionFilter");
       a.p(p1, "collapseSubChartFilter");
       super();
       CollapsedSubStateVisitor$realSubChartFilter$1 orealSubChar = new CollapsedSubStateVisitor$realSubChartFilter$1(this, p1);
       this.a = orealSubChar;
       this.b = new PlantUmlStateDiagramVisitor(p0, orealSubChar);
    }
    public void a(){
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollapsedSubStateVisitor.class, "7")) {
          return;
       }
       a.p(p0, "state");
       if (this.d != null) {
          this.b.b(p0);
       }
       return;
    }
    public void c(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollapsedSubStateVisitor.class, "5")) {
          return;
       }
       a.p(p0, "event");
       if (this.d != null) {
          this.b.c(p0);
       }
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollapsedSubStateVisitor.class, "3")) {
          return;
       }
       a.p(p0, "name");
       return;
    }
    public boolean e(a p0){
       CollapsedSubStateVisitor obj = PatchProxy.applyOneRefs(p0, this, CollapsedSubStateVisitor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "state");
       if (this.c == null && this.a.invoke(p0.b()).booleanValue()) {
          this.c = p0;
          this.d = true;
          obj = this.b;
          obj.d = 0;
          obj.d(p0.b());
       }
       if (this.d != null) {
          return this.b.e(p0);
       }else {
          return true;
       }
    }
    public void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollapsedSubStateVisitor.class, "8")) {
          return;
       }
       a.p(p0, "transitions");
       if (this.d != null) {
          this.b.f(p0);
       }
       return;
    }
    public void g(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollapsedSubStateVisitor.class, "6")) {
          return;
       }
       a.p(p0, "state");
       if (this.d != null) {
          this.b.g(p0);
          if (p0 == this.c) {
             this.d = false;
             this.b.a();
          }
       }
       return;
    }
}
