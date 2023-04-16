package com.kwai.statechart.StateChart$b;
import java.lang.Object;
import com.kwai.statechart.StateChart$a;
import com.kwai.statechart.StateChart$b$a;
import com.kwai.statechart.StateChart$b$b;
import ut7.a;
import com.kwai.statechart.StateChart;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ut7.k;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kwai.statechart.a;
import java.util.Collection;
import kotlin.jvm.internal.a;
import com.kwai.statechart.RootStateChart;
import java.util.List;
import msd.a;
import java.lang.IllegalStateException;
import ut7.g;
import com.kwai.statechart.b;
import msd.l;
import ut7.o;

public final class StateChart$b	// class@0018ef
{
    public final StateChart$a a;
    public a b;
    public a c;
    public boolean d;
    public final StateChart$b$a e;
    public final StateChart$b$b f;
    public final a g;

    public void StateChart$b(){
       super();
       this.a = new StateChart$a();
       this.e = new StateChart$b$a();
       this.f = new StateChart$b$b();
       this.g = new a();
    }
    public final StateChart a(){
       Set obj = PatchProxy.apply(null, this, StateChart$b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       k ok = this.a.c();
       StateChart$b tc = this.c;
       if (tc == null) {
          throw new IllegalStateException("contextFactory not set");
       }
       int i = 1;
       if (!(this.d ^ i)) {
          throw new IllegalStateException("the builder can build only one StateChart!".toString());
       }
       this.a.d();
       this.d = i;
       Map map = this.a.g();
       obj = this.a.f();
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().c());
       }
       StateChart$b tb = this.b;
       a.m(tb);
       RootStateChart rootStateCha = new RootStateChart(map, uArrayList, ok, this.f, this.e, this.g, tc, tb);
       this.a.h(iterator);
       return iterator;
    }
    public final StateChart$b b(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StateChart$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "factory");
       this.c = p0;
       return this;
    }
    public final StateChart$b c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StateChart$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "name");
       this.f.b = p0;
       return this;
    }
    public final StateChart$b d(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StateChart$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "logger");
       this.e.b = p0;
       return this;
    }
    public final StateChart$b e(a p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StateChart$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "state");
       a.p(p1, "initialParamFactory");
       this.a.i(p0);
       this.b = p1;
       return this;
    }
    public final StateChart$b f(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StateChart$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "state");
       this.a.a(p0);
       return this;
    }
    public final StateChart$b g(b p0,l p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StateChart$b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "state");
       a.p(p1, "block");
       this.a.j(this.f, this.e, this.g, p0, p1);
       return this;
    }
    public final StateChart$b h(String p0,a p1,a p2,Class p3,o p4){
       StateChart$b uob = StateChart$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, uob, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "name");
       a.p(p1, "from");
       a.p(p2, "to");
       a.p(p3, "event");
       a.p(p4, "strategy");
       this.a.k(p0, p1, p2, p3, p4);
       return this;
    }
    public final StateChart$b i(String p0,Set p1,a p2,Class p3,o p4){
       StateChart$b uob = StateChart$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, uob, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "name");
       a.p(p1, "from");
       a.p(p2, "to");
       a.p(p3, "event");
       a.p(p4, "strategy");
       this.a.l(p0, p1, p2, p3, p4);
       return this;
    }
}
