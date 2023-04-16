package com.kuaishou.live.core.basic.model.LiveHourlyRankPendantPriorityInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveHourlyRankPendantPriorityInfo	// class@000875
{
    public final String districtRankInfoPBString;
    public final String gzoneRankInfoPBString;
    public final String popularityRankInfoPBString;

    public void LiveHourlyRankPendantPriorityInfo(){
       a.p("", "popularityRankInfoPBString");
       a.p("", "districtRankInfoPBString");
       a.p("", "gzoneRankInfoPBString");
       super();
       this.popularityRankInfoPBString = "";
       this.districtRankInfoPBString = "";
       this.gzoneRankInfoPBString = "";
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveHourlyRankPendantPriorityInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveHourlyRankPendantPriorityInfo && (a.g(this.popularityRankInfoPBString, p0.popularityRankInfoPBString) && (a.g(this.districtRankInfoPBString, p0.districtRankInfoPBString) && a.g(this.gzoneRankInfoPBString, p0.gzoneRankInfoPBString))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveHourlyRankPendantPriorityInfo obj = PatchProxy.apply(null, this, LiveHourlyRankPendantPriorityInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.popularityRankInfoPBString;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveHourlyRankPendantPriorityInfo tdistrictRan = this.districtRankInfoPBString;
       int i2 = (tdistrictRan != null)? tdistrictRan.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrictRan = this.gzoneRankInfoPBString;
       if (tdistrictRan != null) {
          i = tdistrictRan.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveHourlyRankPendantPriorityInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveHourlyRankPendantPriorityInfo\(popularityRankInfoPBString="+this.popularityRankInfoPBString+", districtRankInfoPBString="+this.districtRankInfoPBString+", gzoneRankInfoPBString="+this.gzoneRankInfoPBString+"\)";
    }
}
