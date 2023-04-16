package com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig$a;
import nsd.u;
import com.kwai.edge.reco.ctr.config.CTRPredictConfig;
import com.kwai.edge.reco.ctr.config.CTRFeatureConfig;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig$Companion$config$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.List;
import com.kwai.edge.reco.ctr.config.RedDotFeature;
import com.kwai.edge.reco.ctr.config.BubbleFeature;
import com.kwai.edge.reco.ctr.config.ProductionFeature;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CtrPredictionRuntimeConfig	// class@000d4f
{
    public boolean enable;
    public boolean enableLuaPipe;
    public CTRFeatureConfig featureConfig;
    public CTRPredictConfig predictConfig;
    public static final CtrPredictionRuntimeConfig a;
    public static final p b;
    public static final CtrPredictionRuntimeConfig$a c;

    static {
       CtrPredictionRuntimeConfig.c = new CtrPredictionRuntimeConfig$a(null);
       CtrPredictionRuntimeConfig uCtrPredicti = new CtrPredictionRuntimeConfig(false, false, null, null, 15, null);
       CtrPredictionRuntimeConfig.a = v0;
       CtrPredictionRuntimeConfig.b = s.c(CtrPredictionRuntimeConfig$Companion$config$2.INSTANCE);
    }
    public void CtrPredictionRuntimeConfig(){
       super(false, false, null, null, 15, null);
    }
    public void CtrPredictionRuntimeConfig(boolean p0,boolean p1,CTRPredictConfig p2,CTRFeatureConfig p3,int p4,u p5){
       int i = this;
       boolean b = false;
       boolean b1 = (p4 & 0x01)? false: p0;
       if (!(p4 & 0x02)) {
          b = p1;
       }
       CTRFeatureConfig uCTRFeatureC = null;
       if (p4 & 0x04) {
          CTRPredictConfig uCTRPredictC = new CTRPredictConfig(0, null, null, null, null, false, 0, false, false, false, false, 2047, null);
       }else {
          CTRFeatureConfig uCTRFeatureC2 = uCTRFeatureC;
       }
       if (p4 & 0x08) {
          CTRFeatureConfig uCTRFeatureC1 = new CTRFeatureConfig(false, false, null, null, null, 31, null);
       }
       a.p(v3, "predictConfig");
       a.p(uCTRFeatureC, "featureConfig");
       super();
       i.enable = b1;
       i.enableLuaPipe = b;
       i.predictConfig = v3;
       i.featureConfig = uCTRFeatureC;
       return;
    }
    public final boolean a(){
       return this.enable;
    }
    public final boolean b(){
       return this.enableLuaPipe;
    }
    public final CTRFeatureConfig c(){
       return this.featureConfig;
    }
    public final CTRPredictConfig d(){
       return this.predictConfig;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CtrPredictionRuntimeConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CtrPredictionRuntimeConfig && (this.enable == p0.enable && (this.enableLuaPipe == p0.enableLuaPipe && (a.g(this.predictConfig, p0.predictConfig) && a.g(this.featureConfig, p0.featureConfig)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i1;
       CtrPredictionRuntimeConfig tpredictConf;
       CtrPredictionRuntimeConfig obj = PatchProxy.apply(null, this, CtrPredictionRuntimeConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enable;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       CtrPredictionRuntimeConfig tenableLuaPi = this.enableLuaPipe;
       if (tenableLuaPi == null) {
          tpredictConf = tenableLuaPi;
       }
       i1 = (i1 + i) * 31;
       tpredictConf = this.predictConfig;
       int i2 = 0;
       i = (tpredictConf != null)? tpredictConf.hashCode(): 0;
       i1 = (i1 + i) * 31;
       tpredictConf = this.featureConfig;
       if (tpredictConf != null) {
          i2 = tpredictConf.hashCode();
       }
       return (i1 + i2);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CtrPredictionRuntimeConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CtrPredictionRuntimeConfig\(enable="+this.enable+", enableLuaPipe="+this.enableLuaPipe+", predictConfig="+this.predictConfig+", featureConfig="+this.featureConfig+"\)";
    }
}
