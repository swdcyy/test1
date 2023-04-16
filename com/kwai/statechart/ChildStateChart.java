package com.kwai.statechart.ChildStateChart;
import com.kwai.statechart.StateChart;
import java.util.Map;
import java.util.List;
import ut7.k;
import msd.a;
import msd.l;
import msd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.statechart.ChildStateChart$1;
import nsd.u;
import ut7.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ut7.e;
import java.lang.IllegalStateException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ut7.l;

public final class ChildStateChart extends StateChart	// class@0018e1
{
    public final l k;
    public final p l;
    public final p m;
    public StateChart n;

    public void ChildStateChart(Map p0,List p1,k p2,a p3,a p4,l p5,p p6,p p7){
       int i = this;
       Object obj = p5;
       Object obj1 = p6;
       Object obj2 = p7;
       a.p(p0, "transitions");
       a.p(p1, "states");
       a.p(p2, "initialState");
       Object obj3 = p3;
       a.p(obj3, "nameFetcher");
       Object obj4 = p4;
       a.p(obj4, "loggerFetcher");
       a.p(obj, "contextFactory");
       a.p(obj1, "enterParamFactory");
       a.p(obj2, "exitReasonFactory");
       super(p0, p1, p2, obj3, obj4, ChildStateChart$1.INSTANCE, null);
       i.k = obj;
       i.l = obj1;
       i.m = obj2;
    }
    public void e(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildStateChart.class, "7")) {
          return;
       }
       a.p(p0, "reason");
       super.e(this.m.invoke(this.x().g(), p0));
       return;
    }
    public void l(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildStateChart.class, "9")) {
          return;
       }
       a.p(p0, "event");
       throw new IllegalStateException("bug! can\'t postEvent to ChildStateChart");
    }
    public void m(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildStateChart.class, "5")) {
          return;
       }
       a.p(p0, "event");
       this.x().m(p0);
       return;
    }
    public boolean n(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ChildStateChart.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       throw new IllegalStateException("bug! can\'t sendEvent to ChildStateChart");
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, ChildStateChart.class, "6")) {
          return;
       }
       throw new IllegalStateException("bug! can\'t start a ChildStateChart");
    }
    public final void w(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildStateChart.class, "4")) {
          return;
       }
       k ok = this.i();
       p0 = this.l.invoke(p0, this.x().g());
       Object obj = p0.a();
       ok.c(obj, p0.b());
       this.q(ok);
       return;
    }
    public final StateChart x(){
       ChildStateChart obj = PatchProxy.apply(null, this, ChildStateChart.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.n;
       if (obj != null) {
          return obj;
       }
       a.S("parent");
       throw null;
    }
}
