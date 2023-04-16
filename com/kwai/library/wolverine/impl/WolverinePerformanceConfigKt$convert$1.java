package com.kwai.library.wolverine.impl.WolverinePerformanceConfigKt$convert$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.google.common.collect.Range;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevelItemRangeConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class WolverinePerformanceConfigKt$convert$1 extends Lambda implements p	// class@000ac3
{
    public static final WolverinePerformanceConfigKt$convert$1 INSTANCE;

    static {
       WolverinePerformanceConfigKt$convert$1.INSTANCE = new WolverinePerformanceConfigKt$convert$1();
    }
    public void WolverinePerformanceConfigKt$convert$1(){
       super(2);
    }
    public final WolverinePerformanceLevelItemRangeConfig invoke(Range p0,WolverinePerformanceLevel p1){
       a.p(p0, "range");
       return new WolverinePerformanceLevelItemRangeConfig(p0, p1);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
