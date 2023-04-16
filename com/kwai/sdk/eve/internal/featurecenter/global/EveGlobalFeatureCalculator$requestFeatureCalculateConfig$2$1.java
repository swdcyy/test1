package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfig;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2$1 implements Runnable	// class@001500
{
    public final Throwable $it;
    public final EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2 this$0;

    public void EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2$1(EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2 p0,Throwable p1){
       this.this$0 = p0;
       this.$it = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2$1.class, "1")) {
          return;
       }
       EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2$1 tthis$0 = this.this$0;
       FeatureCalculateConfig localFeature = tthis$0.this$0.getLocalFeatureCalculateConfig(tthis$0.$useId);
       EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2$1 t$it = this.$it;
       a.o(t$it, "it");
       EveLog.e$default("EveGlobalFeatureCalculator update featureCalculateConfig for "+this.this$0.$useId+" error, localConfig:"+localFeature, t$it, false, 4, objArray);
       EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2$1 tthis$01 = this.this$0;
       tthis$01.this$0.onFeatureCalculateConfig(localFeature, tthis$01.$useId);
       return;
    }
}
