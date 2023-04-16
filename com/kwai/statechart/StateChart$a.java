package com.kwai.statechart.StateChart$a;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import com.kwai.statechart.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.k;
import java.util.Set;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.List;
import java.lang.Iterable;
import ut7.n;
import com.kwai.statechart.StateChart;
import msd.a;
import ut7.a;
import com.kwai.statechart.b;
import msd.l;
import com.kwai.statechart.StateChart$SubChartBuilder;
import ut7.m;
import java.util.ArrayList;
import trd.u;
import java.util.Objects;
import nsd.s0;
import msd.p;
import com.kwai.statechart.ChildStateChart;
import ut7.o;

public final class StateChart$a	// class@0018ec
{
    public a a;
    public final Map b;
    public final Set c;

    public void StateChart$a(){
       super();
       this.b = new LinkedHashMap();
       this.c = new LinkedHashSet();
    }
    public final StateChart$a a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StateChart$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "state");
       this.b(new k(p0));
       return this;
    }
    public final void b(k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StateChart$a.class, "6")) {
          return;
       }
       if (!(this.c.contains(p0.e()) ^ 0x01)) {
          throw new IllegalStateException("state "+p0.e().b()+" already added".toString());
       }
       this.c.add(p0.e());
       return;
    }
    public final k c(){
       StateChart$a obj = PatchProxy.apply(null, this, StateChart$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          throw new IllegalStateException("initialState not set");
       }
       if (this.c.contains(obj)) {
          return obj.c();
       }
       throw new IllegalStateException("initialState "+obj.b()+" not configured. config it using `state`/`subStateChart` method");
    }
    public final void d(){
       n on;
       if (PatchProxy.applyVoid(null, this, StateChart$a.class, "8")) {
          return;
       }
       Iterator iterator = this.b.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          Iterator iterator1 = iterator.next().getValue().iterator();
          do {
             if (iterator1.hasNext()) {
                on = iterator1.next();
                if (!this.f().contains(on.a())) {
                   throw new IllegalStateException("transition "+on.b()+" from "+on.a().b()+" state is not found".toString());
                }
             }else {
                continue ;
             }
          } while (this.f().contains(on.c()));
          throw new IllegalStateException("transition "+on.b()+" to "+on.c().b()+" state is not found".toString());
       }
    }
    public final a e(){
       return this.a;
    }
    public final Set f(){
       return this.c;
    }
    public final Map g(){
       return this.b;
    }
    public final void h(StateChart p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StateChart$a.class, "9")) {
          return;
       }
       a.p(p0, "stateChart");
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().c().g(p0);
       }
       return;
    }
    public final StateChart$a i(a p0){
       String obj = PatchProxy.applyOneRefs(p0, this, StateChart$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "state");
       obj = (this.e() == null)? 1: null;
       if (!obj) {
          p0 = this.e();
          String str = (p0 == null)? null: p0.b();
          throw new IllegalStateException(a.C("initial state already set to ", str).toString());
       }else {
          this.a = p0;
          return this;
       }
    }
    public final StateChart$a j(a p0,a p1,a p2,b p3,l p4){
       StateChart$SubChartBuilder obj1;
       Set set;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       StateChart$a uoa = StateChart$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4};
          obj1 = PatchProxy.apply(objArray, obj, uoa, "3");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       a.p(oobject, "nameFetcher");
       a.p(oobject1, "eventLoggerFetcher");
       a.p(oobject2, "actionQueue");
       a.p(oobject3, "state");
       a.p(oobject4, "block");
       obj1 = new StateChart$SubChartBuilder(oobject, oobject1, oobject2);
       oobject4.invoke(obj1);
       ChildStateChart uChildStateC = PatchProxy.apply(null, obj1, StateChart$SubChartBuilder.class, "8");
       if (uChildStateC != PatchProxyResult.class) {
       }else {
          k ok = obj1.d.c();
          obj1.d.d();
          StateChart$SubChartBuilder e = obj1.e;
          if (e != null) {
             Map map = obj1.d.g();
             set = obj1.d.f();
             ArrayList uArrayList = new ArrayList(u.Y(set, 10));
             Iterator iterator = set.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().c());
             }
             StateChart$SubChartBuilder f = obj1.f;
             Objects.requireNonNull(f, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any, com.kwai.statechart.StateParam<*>>");
             ChildStateChart uChildStateC1 = new ChildStateChart(map, uArrayList, ok, obj1.a, obj1.b, e, s0.q(f, 2), obj1.g);
             obj1.d.h(oobject4);
             uChildStateC = oobject4;
          }else {
             throw new IllegalStateException("contextFactory not set");
          }
       }
       obj.b(new m(oobject3, uChildStateC));
       return obj;
    }
    public final StateChart$a k(String p0,a p1,a p2,Class p3,o p4){
       Map obj;
       StateChart$a uoa = StateChart$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "name");
       a.p(p1, "from");
       a.p(p2, "to");
       a.p(p3, "event");
       a.p(p4, "strategy");
       obj = this.g();
       ArrayList uArrayList = obj.get(p1);
       if (uArrayList == null) {
          uArrayList = new ArrayList();
          obj.put(p1, uArrayList);
       }
       n on = new n(p0, p1, p2, p3, p4);
       uArrayList.add(obj);
       return this;
    }
    public final StateChart$a l(String p0,Set p1,a p2,Class p3,o p4){
       StateChart$a uoa = StateChart$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "name");
       a.p(p1, "from");
       a.p(p2, "to");
       a.p(p3, "event");
       a.p(p4, "strategy");
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          this.k(p0, iterator.next(), p2, p3, p4);
       }
       return this;
    }
}
