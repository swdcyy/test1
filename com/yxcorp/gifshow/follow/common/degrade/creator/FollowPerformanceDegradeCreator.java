package com.yxcorp.gifshow.follow.common.degrade.creator.FollowPerformanceDegradeCreator;
import java.lang.Object;
import qga.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import m27.d;
import com.yxcorp.gifshow.follow.common.degrade.creator.FollowPerformanceDegradeCreator$createDefault$wolverinePerformanceDispatcher$1;
import msd.a;
import qga.b;
import l27.g;
import com.yxcorp.gifshow.follow.common.degrade.creator.FollowPerformanceGradeConfig;
import com.yxcorp.gifshow.follow.common.degrade.creator.FollowPerformanceEvaluatorConfig;
import rga.d;
import com.kwai.library.wolverine.contract.WolverinePerformanceLevelInterface;

public abstract class FollowPerformanceDegradeCreator	// class@001042
{
    public final String a;
    public final String b;
    public final String c;

    public void FollowPerformanceDegradeCreator(){
       super();
       this.a = "FollowPerformanceDegradeCreator";
       this.b = "followWolverineEvaluatorConfig";
       this.c = "followWolverineGradeConfig";
    }
    public final d a(){
       Object obj = PatchProxy.apply(null, this, FollowPerformanceDegradeCreator.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(new d(new FollowPerformanceDegradeCreator$createDefault$wolverinePerformanceDispatcher$1(this)));
    }
    public abstract d b(FollowPerformanceGradeConfig p0,FollowPerformanceEvaluatorConfig p1);
    public abstract WolverinePerformanceLevelInterface c();
    public abstract WolverinePerformanceLevelInterface d();
    public abstract String e();
    public abstract WolverinePerformanceLevelInterface f();
}
