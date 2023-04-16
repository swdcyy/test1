package com.kwai.statechart.PlantUmlStateDiagramVisitor;
import ut7.j;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.statechart.a;
import java.util.List;
import com.kwai.statechart.PlantUmlStateDiagramVisitor$visitStateEvents$1;
import java.lang.Iterable;
import java.lang.CharSequence;
import kotlin.collections.CollectionsKt___CollectionsKt;
import zsd.u;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.statechart.b;
import java.util.ArrayList;
import java.util.Iterator;
import ut7.n;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;
import com.kwai.statechart.PlantUmlStateDiagramVisitor$visitTransitions$3$1;
import java.lang.Appendable;

public class PlantUmlStateDiagramVisitor implements j	// class@0018e6
{
    public final l a;
    public final l b;
    public final StringBuilder c;
    public int d;
    public a e;

    public void PlantUmlStateDiagramVisitor(l p0,l p1){
       a.p(p0, "transitionFilter");
       a.p(p1, "collapseSubChartFilter");
       super();
       this.a = p0;
       this.b = p1;
       this.c = "";
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, PlantUmlStateDiagramVisitor.class, "9")) {
          return;
       }
       this.h();
       StringBuilder str = this.h()+"@enduml";
       this.h()+"```";
       return;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlantUmlStateDiagramVisitor.class, "7")) {
          return;
       }
       a.p(p0, "state");
       StringBuilder str = this.h()+a.C("[*] -[dashed]-> ", p0.b());
       a.o(str, "append\(value\)");
       a.o(str+10, "append\(\'\\n\'\)");
       return;
    }
    public void c(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlantUmlStateDiagramVisitor.class, "5")) {
          return;
       }
       a.p(p0, "event");
       String str = CollectionsKt___CollectionsKt.V2(p0, "\\n", null, null, 0, null, PlantUmlStateDiagramVisitor$visitStateEvents$1.INSTANCE, 30, null);
       String str1 = null;
       if (!(u.S1(str) ^ 0x01)) {
          str = str1;
       }
       if (str != null) {
          StringBuilder str2 = this.h();
          PlantUmlStateDiagramVisitor te = this.e;
          if (te != null) {
             str2+te.b()+": "+str;
          }else {
             a.S("currentState");
             throw str1;
          }
       }
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlantUmlStateDiagramVisitor.class, "3")) {
          return;
       }
       a.p(p0, "name");
       StringBuilder str = this.h()+a.C("# ", p0);
       p0 = this.h()+"```plantuml";
       this.h()+"@startuml";
       this.h();
       return;
    }
    public boolean e(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlantUmlStateDiagramVisitor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "state");
       this.e = p0;
       int i = (p0 instanceof b && this.b.invoke(p0.b()).booleanValue())? 1: 0;
       this.h();
       String str = this.h()+"state "+p0.b()+" {";
       if (i) {
          this.h()+p0.b()+":"+" [SubChart]";
       }else {
          str = "";
          if (!(u.S1(str) ^ 1)) {
             str = null;
          }
          if (str != null) {
             this.h()+p0.b()+": \""+str+'"';
             this.h();
          }
       }
       this.d = this.d + 1;
       return (i ^ 0x01);
    }
    public void f(List p0){
       Pair obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, PlantUmlStateDiagramVisitor.class, "8")) {
          return;
       }
       a.p(p0, "transitions");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          if (this.a.invoke(obj.b()).booleanValue()) {
             uArrayList.add(obj);
          }
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          obj = iterator1.next();
          Pair obj1 = obj;
          a uoa = obj1.a();
          obj1 = r0.a(uoa, obj1.c());
          ArrayList uArrayList1 = linkedHashMa.get(obj1);
          if (uArrayList1 == null) {
             uArrayList1 = new ArrayList();
             linkedHashMa.put(obj1, uArrayList1);
          }
          uArrayList1.add(obj);
       }
       iterator = linkedHashMa.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          obj = uEntry.getKey();
          a uoa1 = obj.component1();
          StringBuilder str = this.h()+uoa1.b()+"-[dashed]-> "+obj.component2().b()+": ";
          CollectionsKt___CollectionsKt.T2(uEntry.getValue(), this.i(), "\\n    ---    \\n", null, null, 0, null, PlantUmlStateDiagramVisitor$visitTransitions$3$1.INSTANCE, 60, null);
          this.h();
       }
       return;
    }
    public void g(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlantUmlStateDiagramVisitor.class, "6")) {
          return;
       }
       a.p(p0, "state");
       this.d = this.d - 1;
       this.h()+"}";
       return;
    }
    public final StringBuilder h(){
       PlantUmlStateDiagramVisitor obj = PatchProxy.apply(null, this, PlantUmlStateDiagramVisitor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.o(this.c+10, "append\(\'\\n\'\)");
       obj = this.d;
       for (int i = 0; i < obj; i = i + 1) {
          this.i()+"  ";
       }
       return this.c;
    }
    public final StringBuilder i(){
       return this.c;
    }
    public final String j(){
       String obj = PatchProxy.apply(null, this, PlantUmlStateDiagramVisitor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       a.o(obj, "sb.toString\(\)");
       return obj;
    }
}
