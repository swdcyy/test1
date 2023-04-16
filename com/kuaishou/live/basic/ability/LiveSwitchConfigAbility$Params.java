package com.kuaishou.live.basic.ability.LiveSwitchConfigAbility$Params;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveSwitchConfigAbility$Params	// class@000c91
{
    public final String key;

    public void LiveSwitchConfigAbility$Params(String p0){
       a.p(p0, "key");
       super();
       this.key = p0;
    }
    public static LiveSwitchConfigAbility$Params copy$default(LiveSwitchConfigAbility$Params p0,String p1,int p2,Object p3){
       LiveSwitchConfigAbility$Params key;
       if (p2 & 0x01) {
          key = p0.key;
       }
       return p0.copy(key);
    }
    public final String component1(){
       return this.key;
    }
    public final LiveSwitchConfigAbility$Params copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSwitchConfigAbility$Params.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       return new LiveSwitchConfigAbility$Params(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSwitchConfigAbility$Params.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveSwitchConfigAbility$Params && a.g(this.key, p0.key))) {
          return true;
       }
       return false;
    }
    public final String getKey(){
       return this.key;
    }
    public int hashCode(){
       LiveSwitchConfigAbility$Params obj = PatchProxy.apply(null, this, LiveSwitchConfigAbility$Params.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.key;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveSwitchConfigAbility$Params.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Params\(key="+this.key+"\)";
    }
}
