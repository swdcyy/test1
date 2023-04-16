package com.kwai.edge.reco.feature.config.ReportContextConfig$AFKConfig;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ReportContextConfig$AFKConfig	// class@000d56
{
    public final boolean enable;
    public final long intervalMinForSum;
    public final int maxPlayCountForSave;
    public final int playCountForSum;

    public void ReportContextConfig$AFKConfig(){
       super(false, 0, 0, 0, 15, null);
    }
    public void ReportContextConfig$AFKConfig(boolean p0,long p1,int p2,int p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = false;
       }
       if (p4 & 0x02) {
          p1 = -1;
       }
       if (p4 & 0x04) {
          p2 = -1;
       }
       if (p4 & 0x08) {
          p3 = -1;
       }
       super();
       this.enable = p0;
       this.intervalMinForSum = p1;
       this.playCountForSum = p2;
       this.maxPlayCountForSave = p3;
       return;
    }
    public final boolean a(){
       return this.enable;
    }
    public final long b(){
       return this.intervalMinForSum;
    }
    public final int c(){
       return this.maxPlayCountForSave;
    }
    public final int d(){
       return this.playCountForSum;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof ReportContextConfig$AFKConfig && (this.enable == p0.enable && (!this.intervalMinForSum - p0.intervalMinForSum && (this.playCountForSum == p0.playCountForSum && this.maxPlayCountForSave == p0.maxPlayCountForSave))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       ReportContextConfig$AFKConfig obj = PatchProxy.apply(null, this, ReportContextConfig$AFKConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enable;
       if (obj != null) {
          i = 1;
       }
       ReportContextConfig$AFKConfig tintervalMin = this.intervalMinForSum;
       return ((((((i * 31) + (int)(tintervalMin ^ (tintervalMin >> 32))) * 31) + this.playCountForSum) * 31) + this.maxPlayCountForSave);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ReportContextConfig$AFKConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AFKConfig\(enable="+this.enable+", intervalMinForSum="+this.intervalMinForSum+", playCountForSum="+this.playCountForSum+", maxPlayCountForSave="+this.maxPlayCountForSave+"\)";
    }
}
