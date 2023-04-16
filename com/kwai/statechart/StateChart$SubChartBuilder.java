package com.kwai.statechart.StateChart$SubChartBuilder;
import msd.a;
import ut7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.statechart.StateChart$a;
import com.kwai.statechart.StateChart$SubChartBuilder$exitReasonFactory$1;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.statechart.a;
import msd.p;
import ut7.o;

public final class StateChart$SubChartBuilder	// class@0018eb
{
    public final a a;
    public final a b;
    public final a c;
    public final StateChart$a d;
    public l e;
    public p f;
    public p g;

    public void StateChart$SubChartBuilder(a p0,a p1,a p2){
       a.p(p0, "nameFetcher");
       a.p(p1, "eventLoggerFetcher");
       a.p(p2, "actionQueue");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = new StateChart$a();
       this.g = StateChart$SubChartBuilder$exitReasonFactory$1.INSTANCE;
    }
    public final StateChart$SubChartBuilder a(l p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StateChart$SubChartBuilder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "factory");
       this.e = p0;
       return this;
    }
    public final StateChart$SubChartBuilder b(a p0,p p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StateChart$SubChartBuilder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "state");
       a.p(p1, "enterParamFactory");
       this.d.i(p0);
       this.f = p1;
       return this;
    }
    public final StateChart$SubChartBuilder c(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StateChart$SubChartBuilder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "state");
       this.d.a(p0);
       return this;
    }
    public final StateChart$SubChartBuilder d(String p0,a p1,a p2,Class p3,o p4){
       StateChart$SubChartBuilder subChartBuil = StateChart$SubChartBuilder.class;
       if (PatchProxy.isSupport(subChartBuil)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, subChartBuil, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "name");
       a.p(p1, "from");
       a.p(p2, "to");
       a.p(p3, "event");
       a.p(p4, "condition");
       this.d.k(p0, p1, p2, p3, p4);
       return this;
    }
}
