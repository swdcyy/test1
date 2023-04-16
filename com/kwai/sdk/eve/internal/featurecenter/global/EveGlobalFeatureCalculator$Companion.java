package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$Companion;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class EveGlobalFeatureCalculator$Companion	// class@0014f7
{

    public void EveGlobalFeatureCalculator$Companion(){
       super();
    }
    public void EveGlobalFeatureCalculator$Companion(u p0){
       super();
    }
    public final boolean isGlobalFeaturePipeline(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveGlobalFeatureCalculator$Companion.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "taskId");
       return a.g(p0, "EveGlobalFeatureCalculate");
    }
}
