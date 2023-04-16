package com.kwai.statechart.StateChart$SubChartBuilder$exitReasonFactory$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ut7.h;
import ut7.h$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class StateChart$SubChartBuilder$exitReasonFactory$1 extends Lambda implements p	// class@0018ea
{
    public static final StateChart$SubChartBuilder$exitReasonFactory$1 INSTANCE;

    static {
       StateChart$SubChartBuilder$exitReasonFactory$1.INSTANCE = new StateChart$SubChartBuilder$exitReasonFactory$1();
    }
    public void StateChart$SubChartBuilder$exitReasonFactory$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final h$b invoke(Object p0,h p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StateChart$SubChartBuilder$exitReasonFactory$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$noName_0");
       a.p(p1, "$noName_1");
       return h.b;
    }
}
