package com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig$a;
import java.lang.Object;
import nsd.u;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.edge.reco.ctr.config.CTRPredictConfig;
import java.util.List;
import com.kwai.edge.reco.ctr.config.CTRFeatureConfig;
import com.kwai.edge.reco.ctr.config.BubbleFeature;
import com.kwai.edge.reco.ctr.config.RedDotFeature;
import com.kwai.edge.reco.ctr.config.ProductionFeature;
import com.yxcorp.utility.Log;
import qrd.p;

public final class CtrPredictionRuntimeConfig$a	// class@000d4e
{

    public void CtrPredictionRuntimeConfig$a(){
       super();
    }
    public void CtrPredictionRuntimeConfig$a(u p0){
       super();
    }
    public final CtrPredictionRuntimeConfig a(){
       Object obj = PatchProxy.apply(null, this, CtrPredictionRuntimeConfig$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.g("CtrPredictionRuntimeConfig", "configValue enable "+this.b().a()+10+"page: "+this.b().d().c()+10+"switchTimeMs:  "+this.b().d().e()+10+"featureConfig--bubble.last_N_count : "+this.b().c().a().a()+10+"featureConfig--bubble.reddot.last_N_count: "+this.b().c().d().a()+10+"featureConfig--productionWithoutKuaishou.count_in_N_minutes :"+' '+this.b().c().c().a());
       return this.b();
    }
    public final CtrPredictionRuntimeConfig b(){
       Object obj = PatchProxy.apply(null, this, CtrPredictionRuntimeConfig$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CtrPredictionRuntimeConfig.b.getValue();
    }
}
