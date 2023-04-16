package com.kwai.library.wolverine.impl.WolverinePerformanceLevelItemRangeConfig;
import java.io.Serializable;
import com.google.common.collect.Range;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class WolverinePerformanceLevelItemRangeConfig implements Serializable	// class@000ac7
{
    public final WolverinePerformanceLevel level;
    public final Range range;

    public void WolverinePerformanceLevelItemRangeConfig(Range p0,WolverinePerformanceLevel p1){
       a.p(p0, "range");
       super();
       this.range = p0;
       this.level = p1;
    }
    public static WolverinePerformanceLevelItemRangeConfig copy$default(WolverinePerformanceLevelItemRangeConfig p0,Range p1,WolverinePerformanceLevel p2,int p3,Object p4){
       WolverinePerformanceLevelItemRangeConfig range;
       WolverinePerformanceLevelItemRangeConfig level;
       if (p3 & 0x01) {
          range = p0.range;
       }
       if (p3 & 0x02) {
          level = p0.level;
       }
       return p0.copy(range, level);
    }
    public final Range component1(){
       return this.range;
    }
    public final WolverinePerformanceLevel component2(){
       return this.level;
    }
    public final WolverinePerformanceLevelItemRangeConfig copy(Range p0,WolverinePerformanceLevel p1){
       a.p(p0, "range");
       return new WolverinePerformanceLevelItemRangeConfig(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof WolverinePerformanceLevelItemRangeConfig && (a.g(this.range, p0.range) && a.g(this.level, p0.level)))) {
          return true;
       }
       return false;
    }
    public final WolverinePerformanceLevel getLevel(){
       return this.level;
    }
    public final Range getRange(){
       return this.range;
    }
    public int hashCode(){
       WolverinePerformanceLevelItemRangeConfig trange = this.range;
       int i = 0;
       int i1 = (trange != null)? trange.hashCode(): 0;
       i1 = i1 * 31;
       WolverinePerformanceLevelItemRangeConfig tlevel = this.level;
       if (tlevel != null) {
          i = tlevel.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return "WolverinePerformanceLevelItemRangeConfig\(range="+this.range+", level="+this.level+"\)";
    }
}
