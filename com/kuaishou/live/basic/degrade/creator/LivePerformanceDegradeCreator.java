package com.kuaishou.live.basic.degrade.creator.LivePerformanceDegradeCreator;
import java.lang.Object;
import r41.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import m27.d;
import com.kuaishou.live.basic.degrade.creator.LivePerformanceDegradeCreator$createDefault$wolverinePerformanceDispatcher$1;
import msd.a;
import r41.c;
import l27.g;
import com.kuaishou.live.basic.degrade.creator.LivePerformanceGradeConfig;
import com.kuaishou.live.basic.degrade.creator.LivePerformanceEvaluatorConfig;
import s41.d;
import com.kwai.library.wolverine.contract.WolverinePerformanceLevelInterface;

public abstract class LivePerformanceDegradeCreator	// class@000cb7
{
    public final String a;
    public final String b;

    public void LivePerformanceDegradeCreator(){
       super();
       this.a = "liveWolverineEvaluatorConfig";
       this.b = "liveWolverineGradeConfig";
    }
    public final a a(){
       Object obj = PatchProxy.apply(null, this, LivePerformanceDegradeCreator.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(new d(new LivePerformanceDegradeCreator$createDefault$wolverinePerformanceDispatcher$1(this)));
    }
    public abstract d b(LivePerformanceGradeConfig p0,LivePerformanceEvaluatorConfig p1);
    public abstract WolverinePerformanceLevelInterface c();
    public abstract WolverinePerformanceLevelInterface d();
    public abstract String e();
    public abstract WolverinePerformanceLevelInterface f();
}
