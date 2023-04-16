package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$triggerFeatureReportInferIfNeed$2$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$triggerFeatureReportInferIfNeed$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator;
import in7.f;
import vm7.a;
import ml5.a;
import zn7.a;

public final class EveGlobalFeatureCalculator$triggerFeatureReportInferIfNeed$2$1 implements Runnable	// class@001507
{
    public final EveGlobalFeatureCalculator$triggerFeatureReportInferIfNeed$2 this$0;

    public void EveGlobalFeatureCalculator$triggerFeatureReportInferIfNeed$2$1(EveGlobalFeatureCalculator$triggerFeatureReportInferIfNeed$2 p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EveGlobalFeatureCalculator$triggerFeatureReportInferIfNeed$2$1.class, "1")) {
          return;
       }
       EveLog.i$default("EveGlobalFeatureCalculator triggerFeatureReportInferIfNeed for "+this.this$0.$uid+" success", false, 2, objArray);
       this.this$0.this$0.eveContext.f().c(this.this$0.$task, new a(""), "featureReport");
       return;
    }
}
