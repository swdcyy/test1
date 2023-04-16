package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$requestFeatureCalculateConfig$3;
import erd.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EveGlobalFeatureCalculator$requestFeatureCalculateConfig$3 implements a	// class@001502
{
    public final String $useId;

    public void EveGlobalFeatureCalculator$requestFeatureCalculateConfig$3(String p0){
       this.$useId = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EveGlobalFeatureCalculator$requestFeatureCalculateConfig$3.class, "1")) {
          return;
       }
       EveLog.i$default("EveGlobalFeatureCalculator update featureCalculateConfig for "+this.$useId+" complete", false, 2, null);
       return;
    }
}
