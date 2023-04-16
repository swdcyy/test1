package com.kuaishou.live.basic.ability.LiveStorageAbility$GetStorageParams;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.CharSequence;
import java.lang.StringBuilder;

public final class LiveStorageAbility$GetStorageParams	// class@000c85
{
    public final String key;
    public final String level;

    public void LiveStorageAbility$GetStorageParams(String p0,String p1){
       super();
       this.key = p0;
       this.level = p1;
    }
    public static LiveStorageAbility$GetStorageParams copy$default(LiveStorageAbility$GetStorageParams p0,String p1,String p2,int p3,Object p4){
       LiveStorageAbility$GetStorageParams key;
       LiveStorageAbility$GetStorageParams level;
       if (p3 & 0x01) {
          key = p0.key;
       }
       if (p3 & 0x02) {
          level = p0.level;
       }
       return p0.copy(key, level);
    }
    public final String component1(){
       return this.key;
    }
    public final String component2(){
       return this.level;
    }
    public final LiveStorageAbility$GetStorageParams copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveStorageAbility$GetStorageParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveStorageAbility$GetStorageParams(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveStorageAbility$GetStorageParams.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveStorageAbility$GetStorageParams && (a.g(this.key, p0.key) && a.g(this.level, p0.level)))) {
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
    public int hashCode(){
       LiveStorageAbility$GetStorageParams obj = PatchProxy.apply(null, this, LiveStorageAbility$GetStorageParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.key;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveStorageAbility$GetStorageParams tlevel = this.level;
       if (tlevel != null) {
          i = tlevel.hashCode();
       }
       return (i1 + i);
    }
    public final boolean isInValid(){
       LiveStorageAbility$GetStorageParams obj = PatchProxy.apply(null, this, LiveStorageAbility$GetStorageParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.key;
       boolean b = false;
       obj = (obj == null || !obj.length())? 1: null;
       if (!obj) {
          obj = this.level;
          obj = (obj == null || !obj.length())? 1: 0;
          if (!obj) {
          label_0037 :
             return b;
          }
       }
       b = true;
       goto label_0037 ;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveStorageAbility$GetStorageParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GetStorageParams\(key="+this.key+", level="+this.level+"\)";
    }
}
