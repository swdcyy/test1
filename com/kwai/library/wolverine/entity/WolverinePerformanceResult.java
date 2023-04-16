package com.kwai.library.wolverine.entity.WolverinePerformanceResult;
import java.io.Serializable;
import com.kwai.library.wolverine.contract.WolverinePerformanceLevelInterface;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class WolverinePerformanceResult implements Serializable	// class@000ac1
{
    public final WolverinePerformanceLevelInterface level;
    public final String policyVersion;
    public final int weightedScore;

    public void WolverinePerformanceResult(int p0,WolverinePerformanceLevelInterface p1,String p2){
       a.p(p1, "level");
       a.p(p2, "policyVersion");
       super();
       this.weightedScore = p0;
       this.level = p1;
       this.policyVersion = p2;
    }
    public static WolverinePerformanceResult copy$default(WolverinePerformanceResult p0,int p1,WolverinePerformanceLevelInterface p2,String p3,int p4,Object p5){
       WolverinePerformanceResult weightedScor;
       WolverinePerformanceResult level;
       WolverinePerformanceResult policyVersio;
       if (p4 & 0x01) {
          weightedScor = p0.weightedScore;
       }
       if (p4 & 0x02) {
          level = p0.level;
       }
       if (p4 & 0x04) {
          policyVersio = p0.policyVersion;
       }
       return p0.copy(weightedScor, level, policyVersio);
    }
    public final int component1(){
       return this.weightedScore;
    }
    public final WolverinePerformanceLevelInterface component2(){
       return this.level;
    }
    public final String component3(){
       return this.policyVersion;
    }
    public final WolverinePerformanceResult copy(int p0,WolverinePerformanceLevelInterface p1,String p2){
       a.p(p1, "level");
       a.p(p2, "policyVersion");
       return new WolverinePerformanceResult(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof WolverinePerformanceResult && (this.weightedScore == p0.weightedScore && (a.g(this.level, p0.level) && a.g(this.policyVersion, p0.policyVersion))))) {
          return true;
       }
       return false;
    }
    public final WolverinePerformanceLevelInterface getLevel(){
       return this.level;
    }
    public final String getPolicyVersion(){
       return this.policyVersion;
    }
    public final int getWeightedScore(){
       return this.weightedScore;
    }
    public int hashCode(){
       int i = this.weightedScore * 31;
       WolverinePerformanceResult tlevel = this.level;
       int i1 = 0;
       int i2 = (tlevel != null)? tlevel.hashCode(): 0;
       i = (i + i2) * 31;
       tlevel = this.policyVersion;
       if (tlevel != null) {
          i1 = tlevel.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       return "WolverinePerformanceResult\(weightedScore="+this.weightedScore+", level="+this.level+", policyVersion="+this.policyVersion+"\)";
    }
}
