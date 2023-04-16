package com.kwai.library.wolverine.impl.WolverinePerformanceLevelItemConfig;
import t27.a;
import java.io.Serializable;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import java.lang.Object;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.lang.Comparable;
import java.lang.String;
import java.lang.StringBuilder;

public final class WolverinePerformanceLevelItemConfig implements a, Serializable	// class@000ac6
{
    public final int lowBound;
    public final WolverinePerformanceLevel score;

    public void WolverinePerformanceLevelItemConfig(int p0,WolverinePerformanceLevel p1){
       super();
       this.lowBound = p0;
       this.score = p1;
    }
    public static WolverinePerformanceLevelItemConfig copy$default(WolverinePerformanceLevelItemConfig p0,int p1,WolverinePerformanceLevel p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = p0.getLowBound().intValue();
       }
       if (p3 & 0x02) {
          p2 = p0.getScore();
       }
       return p0.copy(p1, p2);
    }
    public final int component1(){
       return this.getLowBound().intValue();
    }
    public final WolverinePerformanceLevel component2(){
       return this.getScore();
    }
    public final WolverinePerformanceLevelItemConfig copy(int p0,WolverinePerformanceLevel p1){
       return new WolverinePerformanceLevelItemConfig(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof WolverinePerformanceLevelItemConfig && (this.getLowBound().intValue() == p0.getLowBound().intValue() && a.g(this.getScore(), p0.getScore())))) {
          return true;
       }
       return false;
    }
    public Comparable getLowBound(){
       return this.getLowBound();
    }
    public Integer getLowBound(){
       return Integer.valueOf(this.lowBound);
    }
    public WolverinePerformanceLevel getScore(){
       return this.score;
    }
    public Object getScore(){
       return this.getScore();
    }
    public int hashCode(){
       int i = this.getLowBound().intValue() * 31;
       WolverinePerformanceLevel score = this.getScore();
       int i1 = (score != null)? score.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       return "WolverinePerformanceLevelItemConfig\(lowBound="+this.getLowBound()+", score="+this.getScore()+"\)";
    }
}
