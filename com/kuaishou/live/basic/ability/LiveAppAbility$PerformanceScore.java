package com.kuaishou.live.basic.ability.LiveAppAbility$PerformanceScore;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveAppAbility$PerformanceScore	// class@000c53
{
    public Integer performanceScore;

    public void LiveAppAbility$PerformanceScore(Integer p0){
       super();
       this.performanceScore = p0;
    }
    public static LiveAppAbility$PerformanceScore copy$default(LiveAppAbility$PerformanceScore p0,Integer p1,int p2,Object p3){
       LiveAppAbility$PerformanceScore performanceS;
       if (p2 & 0x01) {
          performanceS = p0.performanceScore;
       }
       return p0.copy(performanceS);
    }
    public final Integer component1(){
       return this.performanceScore;
    }
    public final LiveAppAbility$PerformanceScore copy(Integer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAppAbility$PerformanceScore.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAppAbility$PerformanceScore(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAppAbility$PerformanceScore.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveAppAbility$PerformanceScore && a.g(this.performanceScore, p0.performanceScore))) {
          return true;
       }
       return false;
    }
    public final Integer getPerformanceScore(){
       return this.performanceScore;
    }
    public int hashCode(){
       LiveAppAbility$PerformanceScore obj = PatchProxy.apply(null, this, LiveAppAbility$PerformanceScore.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.performanceScore;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setPerformanceScore(Integer p0){
       this.performanceScore = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAppAbility$PerformanceScore.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PerformanceScore\(performanceScore="+this.performanceScore+"\)";
    }
}
