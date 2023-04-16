package com.kuaishou.live.basic.ability.LiveStorageAbility$SetStorageParams;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveStorageAbility$SetStorageParams	// class@000c8b
{
    public final String key;
    public final String level;
    public final Object value;

    public void LiveStorageAbility$SetStorageParams(String p0,String p1,Object p2){
       super();
       this.key = p0;
       this.level = p1;
       this.value = p2;
    }
    public static LiveStorageAbility$SetStorageParams copy$default(LiveStorageAbility$SetStorageParams p0,String p1,String p2,Object p3,int p4,Object p5){
       LiveStorageAbility$SetStorageParams key;
       LiveStorageAbility$SetStorageParams level;
       if (p4 & 0x01) {
          key = p0.key;
       }
       if (p4 & 0x02) {
          level = p0.level;
       }
       if (p4 & 0x04) {
          p3 = p0.value;
       }
       return p0.copy(key, level, p3);
    }
    public final String component1(){
       return this.key;
    }
    public final String component2(){
       return this.level;
    }
    public final Object component3(){
       return this.value;
    }
    public final LiveStorageAbility$SetStorageParams copy(String p0,String p1,Object p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveStorageAbility$SetStorageParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveStorageAbility$SetStorageParams(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveStorageAbility$SetStorageParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveStorageAbility$SetStorageParams && (a.g(this.key, p0.key) && (a.g(this.level, p0.level) && a.g(this.value, p0.value))))) {
          return true;
       }
       return false;
    }
    public final String getKey(){
       return this.key;
    }
    public final String getLevel(){
       return this.level;
    }
    public final Object getValue(){
       return this.value;
    }
    public int hashCode(){
       LiveStorageAbility$SetStorageParams obj = PatchProxy.apply(null, this, LiveStorageAbility$SetStorageParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.key;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveStorageAbility$SetStorageParams tlevel = this.level;
       int i2 = (tlevel != null)? tlevel.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tlevel = this.value;
       if (tlevel != null) {
          i = tlevel.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveStorageAbility$SetStorageParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SetStorageParams\(key="+this.key+", level="+this.level+", value="+this.value+"\)";
    }
}
