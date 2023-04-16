package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$requestFeatureCalculateConfig$1$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$requestFeatureCalculateConfig$1;
import com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfigResponse;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfig;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EveGlobalFeatureCalculator$requestFeatureCalculateConfig$1$1 implements Runnable	// class@0014fe
{
    public final FeatureCalculateConfigResponse $it;
    public final EveGlobalFeatureCalculator$requestFeatureCalculateConfig$1 this$0;

    public void EveGlobalFeatureCalculator$requestFeatureCalculateConfig$1$1(EveGlobalFeatureCalculator$requestFeatureCalculateConfig$1 p0,FeatureCalculateConfigResponse p1){
       this.this$0 = p0;
       this.$it = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EveGlobalFeatureCalculator$requestFeatureCalculateConfig$1$1.class, "1")) {
          return;
       }
       FeatureCalculateConfig featureCalcC = this.$it.getFeatureCalcConfig();
       EveGlobalFeatureCalculator$requestFeatureCalculateConfig$1$1 tthis$0 = this.this$0;
       tthis$0.this$0.updateLocalFeatureCalculateConfig(tthis$0.$useId, featureCalcC);
       EveLog.i$default("EveGlobalFeatureCalculator update featureCalculateConfig for "+this.this$0.$useId+" with "+featureCalcC, false, 2, objArray);
       EveGlobalFeatureCalculator$requestFeatureCalculateConfig$1$1 tthis$01 = this.this$0;
       tthis$01.this$0.onFeatureCalculateConfig(featureCalcC, tthis$01.$useId);
       return;
    }
}
