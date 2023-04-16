package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenterConfig;
import java.util.List;
import com.kwai.sdk.eve.internal.featurecenter.FeaturesProvider;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class EveFeatureCenterConfig	// class@0014e2
{
    public final FeaturesProvider appFeaturesProvider;
    public final List baseEventConfigs;

    public void EveFeatureCenterConfig(){
       super(null, null, 3, null);
    }
    public void EveFeatureCenterConfig(List p0,FeaturesProvider p1){
       a.p(p0, "baseEventConfigs");
       a.p(p1, "appFeaturesProvider");
       super();
       this.baseEventConfigs = p0;
       this.appFeaturesProvider = p1;
    }
    public void EveFeatureCenterConfig(List p0,FeaturesProvider p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = CollectionsKt__CollectionsKt.E();
       }
       if (p2 & 0x02) {
          p1 = new FeaturesProvider();
       }
       super(p0, p1);
       return;
    }
    public static EveFeatureCenterConfig copy$default(EveFeatureCenterConfig p0,List p1,FeaturesProvider p2,int p3,Object p4){
       EveFeatureCenterConfig baseEventCon;
       EveFeatureCenterConfig appFeaturesP;
       if (p3 & 0x01) {
          baseEventCon = p0.baseEventConfigs;
       }
       if (p3 & 0x02) {
          appFeaturesP = p0.appFeaturesProvider;
       }
       return p0.copy(baseEventCon, appFeaturesP);
    }
    public final List component1(){
       return this.baseEventConfigs;
    }
    public final FeaturesProvider component2(){
       return this.appFeaturesProvider;
    }
    public final EveFeatureCenterConfig copy(List p0,FeaturesProvider p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EveFeatureCenterConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "baseEventConfigs");
       a.p(p1, "appFeaturesProvider");
       return new EveFeatureCenterConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveFeatureCenterConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof EveFeatureCenterConfig && (a.g(this.baseEventConfigs, p0.baseEventConfigs) && a.g(this.appFeaturesProvider, p0.appFeaturesProvider)))) {
          return true;
       }
       return false;
    }
    public final FeaturesProvider getAppFeaturesProvider(){
       return this.appFeaturesProvider;
    }
    public final List getBaseEventConfigs(){
       return this.baseEventConfigs;
    }
    public int hashCode(){
       EveFeatureCenterConfig obj = PatchProxy.apply(null, this, EveFeatureCenterConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.baseEventConfigs;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       EveFeatureCenterConfig tappFeatures = this.appFeaturesProvider;
       if (tappFeatures != null) {
          i = tappFeatures.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EveFeatureCenterConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EveFeatureCenterConfig\(baseEventConfigs="+this.baseEventConfigs+", appFeaturesProvider="+this.appFeaturesProvider+"\)";
    }
}
