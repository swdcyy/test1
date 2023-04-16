package com.kuaishou.live.basic.ability.LiveSwitchConfigAbility$Result;
import com.google.gson.JsonElement;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveSwitchConfigAbility$Result	// class@000c92
{
    public int code;
    public JsonElement value;

    public void LiveSwitchConfigAbility$Result(JsonElement p0,int p1){
       super();
       this.value = p0;
       this.code = p1;
    }
    public static LiveSwitchConfigAbility$Result copy$default(LiveSwitchConfigAbility$Result p0,JsonElement p1,int p2,int p3,Object p4){
       LiveSwitchConfigAbility$Result value;
       LiveSwitchConfigAbility$Result code;
       if (p3 & 0x01) {
          value = p0.value;
       }
       if (p3 & 0x02) {
          code = p0.code;
       }
       return p0.copy(value, code);
    }
    public final JsonElement component1(){
       return this.value;
    }
    public final int component2(){
       return this.code;
    }
    public final LiveSwitchConfigAbility$Result copy(JsonElement p0,int p1){
       LiveSwitchConfigAbility$Result result = LiveSwitchConfigAbility$Result.class;
       if (PatchProxy.isSupport(result)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, result, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new LiveSwitchConfigAbility$Result(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSwitchConfigAbility$Result.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveSwitchConfigAbility$Result && (a.g(this.value, p0.value) && this.code == p0.code))) {
          return true;
       }
       return false;
    }
    public final int getCode(){
       return this.code;
    }
    public final JsonElement getValue(){
       return this.value;
    }
    public int hashCode(){
       LiveSwitchConfigAbility$Result obj = PatchProxy.apply(null, this, LiveSwitchConfigAbility$Result.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.value;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + this.code);
    }
    public final void setCode(int p0){
       this.code = p0;
    }
    public final void setValue(JsonElement p0){
       this.value = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveSwitchConfigAbility$Result.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Result\(value="+this.value+", code="+this.code+"\)";
    }
}
