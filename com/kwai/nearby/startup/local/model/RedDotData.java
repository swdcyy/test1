package com.kwai.nearby.startup.local.model.RedDotData;
import java.io.Serializable;
import com.kwai.nearby.startup.local.model.RedDotData$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RedDotData implements Serializable	// class@001033
{
    public int crowdType;
    public final int sLevelHotspotId;
    public static final RedDotData$a Companion;
    public static final long serialVersionUID;

    static {
       RedDotData.Companion = new RedDotData$a(null);
    }
    public void RedDotData(int p0,int p1){
       super();
       this.crowdType = p0;
       this.sLevelHotspotId = p1;
    }
    public static RedDotData copy$default(RedDotData p0,int p1,int p2,int p3,Object p4){
       RedDotData crowdType;
       RedDotData sLevelHotspo;
       if (p3 & 0x01) {
          crowdType = p0.crowdType;
       }
       if (p3 & 0x02) {
          sLevelHotspo = p0.sLevelHotspotId;
       }
       return p0.copy(crowdType, sLevelHotspo);
    }
    public final int component1(){
       return this.crowdType;
    }
    public final int component2(){
       return this.sLevelHotspotId;
    }
    public final RedDotData copy(int p0,int p1){
       if (PatchProxy.isSupport(RedDotData.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, RedDotData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new RedDotData(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof RedDotData && (this.crowdType == p0.crowdType && this.sLevelHotspotId == p0.sLevelHotspotId))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, RedDotData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.crowdType * 31) + this.sLevelHotspotId);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RedDotData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RedDotData\(crowdType="+this.crowdType+", sLevelHotspotId="+this.sLevelHotspotId+"\)";
    }
}
