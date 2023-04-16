package com.kuaishou.live.basic.ability.LiveAppAbility$AppMemory;
import java.lang.Long;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveAppAbility$AppMemory	// class@000c4c
{
    public Long maxMemory;
    public Long totalMemory;
    public Long usedMemory;

    public void LiveAppAbility$AppMemory(Long p0,Long p1,Long p2){
       super();
       this.totalMemory = p0;
       this.maxMemory = p1;
       this.usedMemory = p2;
    }
    public static LiveAppAbility$AppMemory copy$default(LiveAppAbility$AppMemory p0,Long p1,Long p2,Long p3,int p4,Object p5){
       LiveAppAbility$AppMemory totalMemory;
       LiveAppAbility$AppMemory maxMemory;
       LiveAppAbility$AppMemory usedMemory;
       if (p4 & 0x01) {
          totalMemory = p0.totalMemory;
       }
       if (p4 & 0x02) {
          maxMemory = p0.maxMemory;
       }
       if (p4 & 0x04) {
          usedMemory = p0.usedMemory;
       }
       return p0.copy(totalMemory, maxMemory, usedMemory);
    }
    public final Long component1(){
       return this.totalMemory;
    }
    public final Long component2(){
       return this.maxMemory;
    }
    public final Long component3(){
       return this.usedMemory;
    }
    public final LiveAppAbility$AppMemory copy(Long p0,Long p1,Long p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAppAbility$AppMemory.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAppAbility$AppMemory(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAppAbility$AppMemory.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveAppAbility$AppMemory && (a.g(this.totalMemory, p0.totalMemory) && (a.g(this.maxMemory, p0.maxMemory) && a.g(this.usedMemory, p0.usedMemory))))) {
          return true;
       }
       return false;
    }
    public final Long getMaxMemory(){
       return this.maxMemory;
    }
    public final Long getTotalMemory(){
       return this.totalMemory;
    }
    public final Long getUsedMemory(){
       return this.usedMemory;
    }
    public int hashCode(){
       LiveAppAbility$AppMemory obj = PatchProxy.apply(null, this, LiveAppAbility$AppMemory.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.totalMemory;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveAppAbility$AppMemory tmaxMemory = this.maxMemory;
       int i2 = (tmaxMemory != null)? tmaxMemory.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmaxMemory = this.usedMemory;
       if (tmaxMemory != null) {
          i = tmaxMemory.hashCode();
       }
       return (i1 + i);
    }
    public final void setMaxMemory(Long p0){
       this.maxMemory = p0;
    }
    public final void setTotalMemory(Long p0){
       this.totalMemory = p0;
    }
    public final void setUsedMemory(Long p0){
       this.usedMemory = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAppAbility$AppMemory.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AppMemory\(totalMemory="+this.totalMemory+", maxMemory="+this.maxMemory+", usedMemory="+this.usedMemory+"\)";
    }
}
