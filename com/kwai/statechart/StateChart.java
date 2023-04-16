package com.kwai.statechart.StateChart;
import java.util.Map;
import java.util.List;
import ut7.k;
import msd.a;
import nsd.u;
import java.lang.Object;
import java.lang.Thread;
import ut7.e;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kwai.statechart.StateChart$sendEventInner$1;
import ut7.a;
import java.util.LinkedList;
import msd.l;
import ut7.m;
import kotlin.jvm.internal.a;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import ut7.h;
import ut7.g;
import com.kwai.statechart.a;
import java.util.Iterator;
import java.lang.Iterable;
import ut7.n;
import java.util.Objects;
import ut7.i;
import ut7.i$b;
import ut7.o;
import ut7.i$a;
import java.lang.Throwable;
import com.kwai.statechart.StateChart$sendOrPostEvent$2$1;
import com.kwai.statechart.StateChart$stop$2$2;
import ut7.j;
import ut7.f;
import ut7.f$a;
import ut7.c;
import ut7.c$a;
import java.util.Set;
import ut7.c$b;
import ut7.d;
import ut7.d$a;
import ut7.d$b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import trd.u;

public abstract class StateChart	// class@0018f3
{
    public final Map a;
    public final List b;
    public final k c;
    public final a d;
    public final a e;
    public final a f;
    public final Thread g;
    public Object h;
    public k i;
    public boolean j;

    public void StateChart(Map p0,List p1,k p2,a p3,a p4,a p5,u p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = Thread.currentThread();
    }
    public final Boolean a(e p0,boolean p1){
       Ref$ObjectRef obj;
       StateChart stateChart = StateChart.class;
       if (PatchProxy.isSupport(stateChart)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, stateChart, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Ref$ObjectRef();
       StateChart$sendEventInner$1 osendEventIn = new StateChart$sendEventInner$1(obj, this, p0, p1);
       a uoa = this.f();
       if (!uoa.b()) {
          uoa.a = true;
          osendEventIn.invoke();
          uoa.a = false;
          uoa.a();
       }else {
          uoa.b.add(osendEventIn);
       }
       return obj.element;
    }
    public final void b(l p0){
       Boolean uBoolean;
       if (PatchProxy.applyVoidOneRefs(p0, this, StateChart.class, "19")) {
          return;
       }
       StateChart ti = this.i;
       if (ti instanceof m) {
          ti = ti.i();
       }else if(ti == null){
          uBoolean = null;
       }else {
          uBoolean = Boolean.valueOf(ti.h());
       }
       if (!a.g(uBoolean, Boolean.TRUE)) {
          ti = null;
       }
       int i = (ti == null)? 1: 0;
       if (i) {
          return;
       }else {
          a.m(ti);
          throw new IllegalStateException(p0.invoke(ti).toString());
       }
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, StateChart.class, "18")) {
          return;
       }
       if (a.g(Thread.currentThread(), this.g)) {
          return;
       }
       throw new IllegalStateException("Only one thread can operate on the StateChart, creation thread "+this.g+" current thread "+Thread.currentThread().toString());
    }
    public final void d(){
       this.h = null;
    }
    public void e(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StateChart.class, "6")) {
          return;
       }
       a.p(p0, "reason");
       StateChart ti = this.i;
       if (ti != null) {
          ti.d(p0);
       }
       this.i = null;
       return;
    }
    public final a f(){
       Object obj = PatchProxy.apply(null, this, StateChart.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.invoke();
    }
    public final Object g(){
       StateChart obj = PatchProxy.apply(null, this, StateChart.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj != null) {
          return obj;
       }
       throw new IllegalStateException("state is not entered or already exited");
    }
    public final k h(){
       return this.i;
    }
    public final k i(){
       return this.c;
    }
    public final g j(){
       Object obj = PatchProxy.apply(null, this, StateChart.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.invoke();
    }
    public final String k(){
       Object obj = PatchProxy.apply(null, this, StateChart.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.invoke();
    }
    public void l(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StateChart.class, "8")) {
          return;
       }
       a.p(p0, "event");
       this.p(false, p0);
       return;
    }
    public abstract void m(e p0);
    public boolean n(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StateChart.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       return this.p(true, p0);
    }
    public final boolean o(e p0,boolean p1){
       g obj;
       Iterator obj1;
       boolean b1;
       StateChart stateChart = this;
       StateChart stateChart1 = StateChart.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(stateChart1)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, stateChart1, "11");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       stateChart1 = stateChart.i;
       if (stateChart1 != null) {
          boolean b = false;
          if (stateChart1 instanceof m && stateChart1.j().o(p0, b)) {
             return true;
          }else {
             List list = stateChart.a.get(stateChart1.e());
             String str = "event";
             if (list != null) {
                obj1 = list.iterator();
                while (true) {
                   if (obj1.hasNext()) {
                      Object obj2 = obj1.next();
                      Objects.requireNonNull(obj2);
                      i$b uob = PatchProxy.applyOneRefs(p0, obj2, n.class, "1");
                      a uoa = null;
                      if (uob != patchProxyRe) {
                      }else {
                         a.p(p0, str);
                         if (!a.g(p0.getClass(), obj2.d)) {
                            uob = new i$b();
                         }else {
                            n e = obj2.e;
                            n b2 = obj2.b;
                            Objects.requireNonNull(b2);
                            Object obj4 = PatchProxy.apply(uoa, b2, a.class, "2");
                            if (obj4 == patchProxyRe) {
                               obj4 = b2.a();
                            }
                            uob = e.a(p0, obj4);
                         }
                      }
                      if (!uob instanceof i$b) {
                         obj = this.j();
                         if (obj != null) {
                            obj.i(p0, obj2);
                         }
                         Object obj3 = uob;
                         if (!PatchProxy.applyVoidThreeRefs(obj2, p0, obj3, this, StateChart.class, "13")) {
                            a uoa1 = obj2.a();
                            StateChart i = stateChart.i;
                            if (i != null) {
                               uoa = i.e();
                            }
                            if (a.g(uoa1, uoa)) {
                               StateChart i1 = stateChart.i;
                               if (i1 != null) {
                                  i1.d(obj3.a());
                               }
                               k ok = obj2.c().c();
                               ok.c(obj3.a, obj3.a());
                               stateChart.i = ok;
                               break ;
                            }else {
                               throw new IllegalStateException("Check failed.".toString());
                            }
                         }
                         break ;
                      }
                   }
                }
                return true;
             }
             g og = this.j();
             if (og != null) {
                og.g(p0, stateChart1.e());
             }
             obj1 = PatchProxy.applyOneRefs(p0, stateChart1, k.class, "9");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                a.p(p0, str);
                stateChart1.a(p0);
                b1 = stateChart1.a.d(p0);
             }
             og = this.j();
             if (og != null) {
                og.d(p0, stateChart1.e(), b1);
             }
             if (b1) {
                return true;
             }else if(p1){
                obj = this.j();
                if (obj != null) {
                   obj.a(p0);
                }
             }
             return b;
          }
       }else {
          throw new IllegalStateException("StateChart ["+this.k()+"] is not start or already stopped, can\'t send event");
       }
    }
    public final boolean p(boolean p0,e p1){
       g obj;
       StateChart stateChart = StateChart.class;
       if (PatchProxy.isSupport(stateChart)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, stateChart, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.b(new StateChart$sendOrPostEvent$2$1(p1));
       this.c();
       obj = this.j();
       if (obj != null) {
          obj.e(p1);
       }
       boolean b = false;
       if (p0) {
          if (this.f().b() ^ 1) {
             Boolean uBoolean = this.a(p1, 1);
             if (uBoolean != null) {
                b = true;
             }
             if (b) {
                b = uBoolean.booleanValue();
             }else {
                throw new IllegalStateException("Bug! We are sure the event will not be queued".toString());
             }
          }else {
             throw new IllegalStateException("Recursive call to sendEvent \(call inside [State.onEnter] / [State.handleEvent], etc.\)".toString());
          }
       }else {
          this.a(p1, 1);
       }
       return b;
    }
    public final void q(k p0){
       this.i = p0;
    }
    public final void r(Object p0){
       this.h = p0;
    }
    public abstract void s();
    public final void t(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StateChart.class, "5")) {
          return;
       }
       a.p(p0, "reason");
       if (this.j != null) {
          return;
       }
       boolean b = true;
       this.j = b;
       this.c();
       if (!(this.f().b() ^ b)) {
          throw new IllegalStateException("can\'t stop StateChart inside action queue".toString());
       }
       StateChart$stop$2$2 ostop$2$2 = new StateChart$stop$2$2(this, p0);
       a uoa = this.f();
       if (!uoa.b()) {
          uoa.a = b;
          ostop$2$2.invoke();
          uoa.a = false;
          uoa.a();
       }else {
          uoa.b.add(ostop$2$2);
       }
       return;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, StateChart.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "StateChart["+this.k()+']';
       if (this.f().b()) {
          obj = obj+" actionQueuing";
       }
       obj = obj;
       a.o(obj, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
       return obj;
    }
    public final void u(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StateChart.class, "15")) {
          return;
       }
       a.p(p0, "visitor");
       p0.d(this.k());
       this.v(false, p0);
       p0.a();
       return;
    }
    public final void v(boolean p0,j p1){
       Set set;
       if (PatchProxy.isSupport(StateChart.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, StateChart.class, "16")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          k ok = iterator.next();
          if (PatchProxy.applyVoidTwoRefs(p1, ok, this, StateChart.class, "17")) {
             continue ;
          }else {
             v3 = ok instanceof m;
             if (p1.e(ok.e())) {
                f$a o0 = f.O0;
                Class class = ok.e().getClass();
                Objects.requireNonNull(o0);
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                List list = PatchProxy.applyOneRefs(class, o0, f$a.class, "4");
                if (list != patchProxyRe) {
                }else {
                   String str = "clazz";
                   a.p(class, str);
                   if (c.class.isAssignableFrom(class)) {
                      c$a e = c.e;
                      Objects.requireNonNull(e);
                      set = PatchProxy.applyOneRefs(class, e, c$a.class, "1");
                      if (set != patchProxyRe) {
                      }else {
                         a.p(class, str);
                         set = o0.b(class, c$b.class).keySet();
                      }
                   }else {
                      d$a e1 = d.e;
                      Objects.requireNonNull(e1);
                      set = PatchProxy.applyOneRefs(class, e1, d$a.class, "1");
                      if (set != patchProxyRe) {
                      }else {
                         a.p(class, str);
                         set = o0.b(class, d$b.class).keySet();
                      }
                   }
                   list = CollectionsKt___CollectionsKt.G5(set);
                }
                p1.c(list);
                if (v3) {
                   ok.j().v(true, p1);
                }
             }
             p1.g(ok.e());
          }
       }
       if (p0) {
          p1.b(this.c.e());
       }
       p1.f(u.c0(this.a.values()));
       return;
    }
}
