package com.kuaishou.live.basic.ability.LiveEffectAbility$Params;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveEffectAbility$Params	// class@000c59
{
    public final String effectJsonStr;

    public void LiveEffectAbility$Params(String p0){
       super();
       this.effectJsonStr = p0;
    }
    public static LiveEffectAbility$Params copy$default(LiveEffectAbility$Params p0,String p1,int p2,Object p3){
       LiveEffectAbility$Params effectJsonSt;
       if (p2 & 0x01) {
          effectJsonSt = p0.effectJsonStr;
       }
       return p0.copy(effectJsonSt);
    }
    public final String component1(){
       return this.effectJsonStr;
    }
    public final LiveEffectAbility$Params copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveEffectAbility$Params.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveEffectAbility$Params(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveEffectAbility$Params.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveEffectAbility$Params && a.g(this.effectJsonStr, p0.effectJsonStr))) {
          return true;
       }
       return false;
    }
    public final String getEffectJsonStr(){
       return this.effectJsonStr;
    }
    public int hashCode(){
       LiveEffectAbility$Params obj = PatchProxy.apply(null, this, LiveEffectAbility$Params.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.effectJsonStr;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveEffectAbility$Params.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Params\(effectJsonStr="+this.effectJsonStr+"\)";
    }
}
