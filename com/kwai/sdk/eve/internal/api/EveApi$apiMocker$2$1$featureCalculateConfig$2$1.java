package com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$1$featureCalculateConfig$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfigResponse;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.google.gson.Gson;
import com.kwai.sdk.eve.internal.common.utils.DataKt;

public final class EveApi$apiMocker$2$1$featureCalculateConfig$2$1 extends Lambda implements a	// class@001450
{
    public final FeatureCalculateConfigResponse $it;

    public void EveApi$apiMocker$2$1$featureCalculateConfig$2$1(FeatureCalculateConfigResponse p0){
       this.$it = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, EveApi$apiMocker$2$1$featureCalculateConfig$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EveGlobalFeatureCalculator#featureCalculateConfig: Mocker ===> response = "+DataKt.a().q(this.$it);
    }
}
