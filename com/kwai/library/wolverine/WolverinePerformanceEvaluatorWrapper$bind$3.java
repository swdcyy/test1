package com.kwai.library.wolverine.WolverinePerformanceEvaluatorWrapper$bind$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.List;
import java.lang.Object;
import l27.b;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class WolverinePerformanceEvaluatorWrapper$bind$3 extends Lambda implements l	// class@000a9d
{
    public final List $staticEvaluators;

    public void WolverinePerformanceEvaluatorWrapper$bind$3(List p0){
       this.$staticEvaluators = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(b p0){
       a.p(p0, "it");
       return (this.$staticEvaluators.contains(p0) ^ 0x01);
    }
}
