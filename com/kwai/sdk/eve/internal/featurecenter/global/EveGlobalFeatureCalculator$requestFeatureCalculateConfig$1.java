package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$requestFeatureCalculateConfig$1;
import erd.g;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator;
import java.lang.String;
import java.lang.Object;
import com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfigResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$requestFeatureCalculateConfig$1$1;
import java.lang.Runnable;

public final class EveGlobalFeatureCalculator$requestFeatureCalculateConfig$1 implements g	// class@0014ff
{
    public final String $useId;
    public final EveGlobalFeatureCalculator this$0;

    public void EveGlobalFeatureCalculator$requestFeatureCalculateConfig$1(EveGlobalFeatureCalculator p0,String p1){
       this.this$0 = p0;
       this.$useId = p1;
       super();
    }
    public final void accept(FeatureCalculateConfigResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveGlobalFeatureCalculator$requestFeatureCalculateConfig$1.class, "1")) {
          return;
       }
       this.this$0.scatter(new EveGlobalFeatureCalculator$requestFeatureCalculateConfig$1$1(this, p0));
       return;
    }
    public void accept(Object p0){
       this.accept(p0);
    }
}
