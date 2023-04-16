package com.kwai.edge.reco.feature.config.ReportContextConfig$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ReportContextConfig$a	// class@000d57
{
    public final String featureKey;
    public final String reportName;

    public void ReportContextConfig$a(){
       a.p("", "reportName");
       a.p("", "featureKey");
       super();
       this.reportName = "";
       this.featureKey = "";
    }
    public final String a(){
       return this.reportName;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReportContextConfig$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ReportContextConfig$a && (a.g(this.reportName, p0.reportName) && a.g(this.featureKey, p0.featureKey)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       ReportContextConfig$a obj = PatchProxy.apply(null, this, ReportContextConfig$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.reportName;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ReportContextConfig$a tuoa = this.featureKey;
       if (tuoa != null) {
          i = tuoa.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ReportContextConfig$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EveAppFeature\(reportName="+this.reportName+", featureKey="+this.featureKey+"\)";
    }
}
