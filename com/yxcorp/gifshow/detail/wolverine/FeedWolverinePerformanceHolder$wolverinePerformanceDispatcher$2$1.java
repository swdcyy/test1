package com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wzc.a;

public final class FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2$1 extends Lambda implements a	// class@001a81
{
    public static final FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2$1 INSTANCE;

    static {
       FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2$1.INSTANCE = new FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2$1();
    }
    public void FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2$1(){
       super(0);
    }
    public final WolverinePerformanceLevel invoke(){
       WolverinePerformanceLevel obj = PatchProxy.apply(null, this, FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (a.a())? WolverinePerformanceLevel.GRADE_E: WolverinePerformanceLevel.GRADE_A;
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
