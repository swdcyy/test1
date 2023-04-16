package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$triggerFeatureReportInferIfNeed$2;
import erd.g;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator;
import java.lang.String;
import zn7.a;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$triggerFeatureReportInferIfNeed$2$1;
import java.lang.Runnable;

public final class EveGlobalFeatureCalculator$triggerFeatureReportInferIfNeed$2 implements g	// class@001508
{
    public final a $task;
    public final String $uid;
    public final EveGlobalFeatureCalculator this$0;

    public void EveGlobalFeatureCalculator$triggerFeatureReportInferIfNeed$2(EveGlobalFeatureCalculator p0,String p1,a p2){
       this.this$0 = p0;
       this.$uid = p1;
       this.$task = p2;
       super();
    }
    public final void accept(Long p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveGlobalFeatureCalculator$triggerFeatureReportInferIfNeed$2.class, "1")) {
          return;
       }
       this.this$0.matcherThreadRun(new EveGlobalFeatureCalculator$triggerFeatureReportInferIfNeed$2$1(this));
       return;
    }
    public void accept(Object p0){
       this.accept(p0);
    }
}
