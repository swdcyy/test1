package com.yxcorp.gifshow.follow.common.degrade.creator.FollowPerformanceGradeConfigKt$convert$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.google.common.collect.Range;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevelItemRangeConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class FollowPerformanceGradeConfigKt$convert$1 extends Lambda implements p	// class@001045
{
    public static final FollowPerformanceGradeConfigKt$convert$1 INSTANCE;

    static {
       FollowPerformanceGradeConfigKt$convert$1.INSTANCE = new FollowPerformanceGradeConfigKt$convert$1();
    }
    public void FollowPerformanceGradeConfigKt$convert$1(){
       super(2);
    }
    public final WolverinePerformanceLevelItemRangeConfig invoke(Range p0,WolverinePerformanceLevel p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FollowPerformanceGradeConfigKt$convert$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "range");
       return new WolverinePerformanceLevelItemRangeConfig(p0, p1);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
