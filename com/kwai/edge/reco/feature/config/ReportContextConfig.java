package com.kwai.edge.reco.feature.config.ReportContextConfig;
import com.kwai.edge.reco.feature.config.ReportContextConfig$AFKConfig;
import java.util.List;
import nsd.u;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ReportContextConfig	// class@000d58
{
    public final ReportContextConfig$AFKConfig afkConfig;
    public final List eveAppFeatures;
    public final float reportRatio;

    public void ReportContextConfig(){
       super(null, null, 0, 7, null);
    }
    public void ReportContextConfig(ReportContextConfig$AFKConfig p0,List p1,float p2,int p3,u p4){
       p1 = null;
       if (p3 & 0x01) {
          ReportContextConfig$AFKConfig uAFKConfig = new ReportContextConfig$AFKConfig(false, 0, 0, 0, 15, null);
       }else {
          List list = p1;
       }
       if (p3 & 0x02) {
          p1 = CollectionsKt__CollectionsKt.E();
       }
       if (p3 & 0x04) {
          p2 = 0x3a83126f;
       }
       a.p((p3 & 0x01), "afkConfig");
       a.p(p1, "eveAppFeatures");
       super();
       this.afkConfig = p3 & 0x01;
       this.eveAppFeatures = p1;
       this.reportRatio = p2;
       return;
    }
    public final ReportContextConfig$AFKConfig a(){
       return this.afkConfig;
    }
    public final List b(){
       return this.eveAppFeatures;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReportContextConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ReportContextConfig && (a.g(this.afkConfig, p0.afkConfig) && (a.g(this.eveAppFeatures, p0.eveAppFeatures) && !Float.compare(this.reportRatio, p0.reportRatio))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       ReportContextConfig obj = PatchProxy.apply(null, this, ReportContextConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.afkConfig;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ReportContextConfig teveAppFeatu = this.eveAppFeatures;
       if (teveAppFeatu != null) {
          i = teveAppFeatu.hashCode();
       }
       return (((i1 + i) * 31) + Float.floatToIntBits(this.reportRatio));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ReportContextConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ReportContextConfig\(afkConfig="+this.afkConfig+", eveAppFeatures="+this.eveAppFeatures+", reportRatio="+this.reportRatio+"\)";
    }
}
