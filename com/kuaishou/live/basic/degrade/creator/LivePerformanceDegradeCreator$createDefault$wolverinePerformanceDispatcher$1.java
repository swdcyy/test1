package com.kuaishou.live.basic.degrade.creator.LivePerformanceDegradeCreator$createDefault$wolverinePerformanceDispatcher$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.basic.degrade.creator.LivePerformanceDegradeCreator;
import com.kwai.library.wolverine.contract.WolverinePerformanceLevelInterface;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import kotlin.jvm.internal.a;
import com.kwai.framework.perf.phonelevel.d;

public final class LivePerformanceDegradeCreator$createDefault$wolverinePerformanceDispatcher$1 extends Lambda implements a	// class@000cb6
{
    public final LivePerformanceDegradeCreator this$0;

    public void LivePerformanceDegradeCreator$createDefault$wolverinePerformanceDispatcher$1(LivePerformanceDegradeCreator p0){
       this.this$0 = p0;
       super(0);
    }
    public final WolverinePerformanceLevelInterface invoke(){
       WolverinePerformanceLevelInterface obj = PatchProxy.apply(null, this, LivePerformanceDegradeCreator$createDefault$wolverinePerformanceDispatcher$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(-404437045);
       a.o(obj, "Singleton.get\(PhoneLevelUtils::class.java\)");
       obj = (obj.g())? this.this$0.d(): this.this$0.c();
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
