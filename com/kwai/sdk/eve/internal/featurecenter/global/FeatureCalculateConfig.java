package com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfig;
import com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfig$Companion;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FeatureCalculateConfig	// class@00150b
{
    public final boolean featureCalc;
    public final long featureCalcIntervalMins;
    public static final FeatureCalculateConfig$Companion Companion;
    public static final FeatureCalculateConfig DEFAULT;

    static {
       FeatureCalculateConfig.Companion = new FeatureCalculateConfig$Companion(null);
       FeatureCalculateConfig uFeatureCalc = new FeatureCalculateConfig(false, 0, 3, null);
       FeatureCalculateConfig.DEFAULT = v0;
    }
    public void FeatureCalculateConfig(){
       super(false, 0, 3, null);
    }
    public void FeatureCalculateConfig(boolean p0,long p1){
       super();
       this.featureCalc = p0;
       this.featureCalcIntervalMins = p1;
    }
    public void FeatureCalculateConfig(boolean p0,long p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = false;
       }
       if (p2 & 0x02) {
          p1 = 60;
       }
       super(p0, p1);
       return;
    }
    public static FeatureCalculateConfig copy$default(FeatureCalculateConfig p0,boolean p1,long p2,int p3,Object p4){
       FeatureCalculateConfig uFeatureCalc;
       FeatureCalculateConfig uFeatureCalc1;
       if (p3 & 0x01) {
          uFeatureCalc = p0.featureCalc;
       }
       if (p3 & 0x02) {
          uFeatureCalc1 = p0.featureCalcIntervalMins;
       }
       return p0.copy(uFeatureCalc, uFeatureCalc1);
    }
    public final boolean component1(){
       return this.featureCalc;
    }
    public final long component2(){
       return this.featureCalcIntervalMins;
    }
    public final FeatureCalculateConfig copy(boolean p0,long p1){
       FeatureCalculateConfig uFeatureCalc = FeatureCalculateConfig.class;
       if (PatchProxy.isSupport(uFeatureCalc)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Long.valueOf(p1), this, uFeatureCalc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new FeatureCalculateConfig(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof FeatureCalculateConfig && (this.featureCalc == p0.featureCalc && !this.featureCalcIntervalMins - p0.featureCalcIntervalMins))) {
          return true;
       }
       return false;
    }
    public final boolean getFeatureCalc(){
       return this.featureCalc;
    }
    public final long getFeatureCalcIntervalMins(){
       return this.featureCalcIntervalMins;
    }
    public int hashCode(){
       int i;
       FeatureCalculateConfig obj = PatchProxy.apply(null, this, FeatureCalculateConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.featureCalc;
       if (obj != null) {
          i = 1;
       }
       FeatureCalculateConfig tuFeatureCal = this.featureCalcIntervalMins;
       return ((i * 31) + (int)(tuFeatureCal ^ (tuFeatureCal >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FeatureCalculateConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FeatureCalculateConfig\(featureCalc="+this.featureCalc+", featureCalcIntervalMins="+this.featureCalcIntervalMins+"\)";
    }
}
