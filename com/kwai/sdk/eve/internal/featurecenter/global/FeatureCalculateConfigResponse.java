package com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfigResponse;
import com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfig;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfig$Companion;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FeatureCalculateConfigResponse	// class@00150c
{
    public final FeatureCalculateConfig featureCalcConfig;

    public void FeatureCalculateConfigResponse(){
       super(null, 1, null);
    }
    public void FeatureCalculateConfigResponse(FeatureCalculateConfig p0){
       a.p(p0, "featureCalcConfig");
       super();
       this.featureCalcConfig = p0;
    }
    public void FeatureCalculateConfigResponse(FeatureCalculateConfig p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = FeatureCalculateConfig.Companion.getDEFAULT();
       }
       super(p0);
       return;
    }
    public static FeatureCalculateConfigResponse copy$default(FeatureCalculateConfigResponse p0,FeatureCalculateConfig p1,int p2,Object p3){
       FeatureCalculateConfigResponse uFeatureCalc;
       if (p2 & 0x01) {
          uFeatureCalc = p0.featureCalcConfig;
       }
       return p0.copy(uFeatureCalc);
    }
    public final FeatureCalculateConfig component1(){
       return this.featureCalcConfig;
    }
    public final FeatureCalculateConfigResponse copy(FeatureCalculateConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeatureCalculateConfigResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "featureCalcConfig");
       return new FeatureCalculateConfigResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeatureCalculateConfigResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FeatureCalculateConfigResponse && a.g(this.featureCalcConfig, p0.featureCalcConfig))) {
          return true;
       }
       return false;
    }
    public final FeatureCalculateConfig getFeatureCalcConfig(){
       return this.featureCalcConfig;
    }
    public int hashCode(){
       FeatureCalculateConfigResponse obj = PatchProxy.apply(null, this, FeatureCalculateConfigResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.featureCalcConfig;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FeatureCalculateConfigResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FeatureCalculateConfigResponse\(featureCalcConfig="+this.featureCalcConfig+"\)";
    }
}
