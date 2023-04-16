package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2;
import erd.g;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2$1;
import java.lang.Runnable;

public final class EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2 implements g	// class@001501
{
    public final String $useId;
    public final EveGlobalFeatureCalculator this$0;

    public void EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2(EveGlobalFeatureCalculator p0,String p1){
       this.this$0 = p0;
       this.$useId = p1;
       super();
    }
    public void accept(Object p0){
       this.accept(p0);
    }
    public final void accept(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2.class, "1")) {
          return;
       }
       this.this$0.scatter(new EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2$1(this, p0));
       return;
    }
}
