package com.kuaishou.live.basic.ability.LiveAppAbility$PerformanceLevel;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveAppAbility$PerformanceLevel	// class@000c52
{
    public String performanceLevel;

    public void LiveAppAbility$PerformanceLevel(String p0){
       super();
       this.performanceLevel = p0;
    }
    public static LiveAppAbility$PerformanceLevel copy$default(LiveAppAbility$PerformanceLevel p0,String p1,int p2,Object p3){
       LiveAppAbility$PerformanceLevel performanceL;
       if (p2 & 0x01) {
          performanceL = p0.performanceLevel;
       }
       return p0.copy(performanceL);
    }
    public final String component1(){
       return this.performanceLevel;
    }
    public final LiveAppAbility$PerformanceLevel copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAppAbility$PerformanceLevel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAppAbility$PerformanceLevel(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAppAbility$PerformanceLevel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveAppAbility$PerformanceLevel && a.g(this.performanceLevel, p0.performanceLevel))) {
          return true;
       }
       return false;
    }
    public final String getPerformanceLevel(){
       return this.performanceLevel;
    }
    public int hashCode(){
       LiveAppAbility$PerformanceLevel obj = PatchProxy.apply(null, this, LiveAppAbility$PerformanceLevel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.performanceLevel;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setPerformanceLevel(String p0){
       this.performanceLevel = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAppAbility$PerformanceLevel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PerformanceLevel\(performanceLevel="+this.performanceLevel+"\)";
    }
}
