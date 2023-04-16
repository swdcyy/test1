package com.kuaishou.live.basic.ability.LiveAppAbility$ThermalState;
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

public final class LiveAppAbility$ThermalState	// class@000c55
{
    public Integer thermalState;

    public void LiveAppAbility$ThermalState(Integer p0){
       super();
       this.thermalState = p0;
    }
    public static LiveAppAbility$ThermalState copy$default(LiveAppAbility$ThermalState p0,Integer p1,int p2,Object p3){
       LiveAppAbility$ThermalState thermalState;
       if (p2 & 0x01) {
          thermalState = p0.thermalState;
       }
       return p0.copy(thermalState);
    }
    public final Integer component1(){
       return this.thermalState;
    }
    public final LiveAppAbility$ThermalState copy(Integer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAppAbility$ThermalState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAppAbility$ThermalState(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAppAbility$ThermalState.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveAppAbility$ThermalState && a.g(this.thermalState, p0.thermalState))) {
          return true;
       }
       return false;
    }
    public final Integer getThermalState(){
       return this.thermalState;
    }
    public int hashCode(){
       LiveAppAbility$ThermalState obj = PatchProxy.apply(null, this, LiveAppAbility$ThermalState.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.thermalState;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setThermalState(Integer p0){
       this.thermalState = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAppAbility$ThermalState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ThermalState\(thermalState="+this.thermalState+"\)";
    }
}
