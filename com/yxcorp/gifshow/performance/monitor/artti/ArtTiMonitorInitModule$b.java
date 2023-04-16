package com.yxcorp.gifshow.performance.monitor.artti.ArtTiMonitorInitModule$b;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import usd.q;
import java.lang.StringBuilder;

public final class ArtTiMonitorInitModule$b	// class@000e51
{
    public final int allocSizeInMB;
    public final int classLoadLenInMB;
    public final int depth;
    public final boolean disableAllFunctions;
    public final int gcThresholdMs;
    public final boolean otherBizSupport;
    public final int overheadTest;

    public void ArtTiMonitorInitModule$b(){
       super(0, 0, 0, 0, 0, false, false, 127, null);
    }
    public void ArtTiMonitorInitModule$b(int p0,int p1,int p2,int p3,int p4,boolean p5,boolean p6,int p7,u p8){
       if (p7 & 0x01) {
          p0 = 0;
       }
       if (p7 & 0x02) {
          p1 = 0;
       }
       if (p7 & 0x04) {
          p2 = 0;
       }
       if (p7 & 0x08) {
          p3 = 0;
       }
       if (p7 & 0x10) {
          p4 = 0;
       }
       if (p7 & 0x20) {
          p5 = false;
       }
       if (p7 & 0x40) {
          p6 = false;
       }
       super();
       this.allocSizeInMB = p0;
       this.depth = p1;
       this.classLoadLenInMB = p2;
       this.gcThresholdMs = p3;
       this.overheadTest = p4;
       this.disableAllFunctions = p5;
       this.otherBizSupport = p6;
       return;
    }
    public final int a(){
       ArtTiMonitorInitModule$b obj = PatchProxy.apply(null, this, ArtTiMonitorInitModule$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       ArtTiMonitorInitModule$b uob = 0x600000;
       if (this.otherBizSupport != null) {
          uob = this.allocSizeInMB;
       }else {
          obj = this.allocSizeInMB;
          if (obj <= null || (obj * 0x100000) >= uob) {
             uob = q.n((obj * 0x100000), 0);
          }
       }
       return uob;
    }
    public final int b(){
       ArtTiMonitorInitModule$b obj = PatchProxy.apply(null, this, ArtTiMonitorInitModule$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       ArtTiMonitorInitModule$b uob = 0x1200000;
       if (this.otherBizSupport != null) {
          uob = this.classLoadLenInMB;
       }else {
          obj = this.classLoadLenInMB;
          if (obj <= null || (obj * 0x100000) >= uob) {
             uob = q.n((obj * 0x100000), 0);
          }
       }
       return uob;
    }
    public final int c(){
       return this.gcThresholdMs;
    }
    public final boolean d(){
       return this.otherBizSupport;
    }
    public final int e(){
       ArtTiMonitorInitModule$b tdepth = this.depth;
       if (tdepth < 5) {
          tdepth = 5;
       }
       return tdepth;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof ArtTiMonitorInitModule$b && (this.allocSizeInMB == p0.allocSizeInMB && (this.depth == p0.depth && (this.classLoadLenInMB == p0.classLoadLenInMB && (this.gcThresholdMs == p0.gcThresholdMs && (this.overheadTest == p0.overheadTest && (this.disableAllFunctions == p0.disableAllFunctions && this.otherBizSupport == p0.otherBizSupport)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ArtTiMonitorInitModule$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((((((((this.allocSizeInMB * 31) + this.depth) * 31) + this.classLoadLenInMB) * 31) + this.gcThresholdMs) * 31) + this.overheadTest) * 31;
       ArtTiMonitorInitModule$b tdisableAllF = this.disableAllFunctions;
       int i1 = 1;
       if (tdisableAllF != null) {
          tdisableAllF = 1;
       }
       i = (i + tdisableAllF) * 31;
       tdisableAllF = this.otherBizSupport;
       if (tdisableAllF == null) {
          i1 = tdisableAllF;
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ArtTiMonitorInitModule$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FeaturesCtlConfig\(allocSizeInMB="+this.allocSizeInMB+", depth="+this.depth+", classLoadLenInMB="+this.classLoadLenInMB+", gcThresholdMs="+this.gcThresholdMs+", overheadTest="+this.overheadTest+", disableAllFunctions="+this.disableAllFunctions+", otherBizSupport="+this.otherBizSupport+"\)";
    }
}
