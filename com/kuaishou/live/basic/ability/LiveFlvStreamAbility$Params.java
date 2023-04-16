package com.kuaishou.live.basic.ability.LiveFlvStreamAbility$Params;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveFlvStreamAbility$Params	// class@000c5e
{
    public final String effectJsonStr;

    public void LiveFlvStreamAbility$Params(String p0){
       super();
       this.effectJsonStr = p0;
    }
    public static LiveFlvStreamAbility$Params copy$default(LiveFlvStreamAbility$Params p0,String p1,int p2,Object p3){
       LiveFlvStreamAbility$Params effectJsonSt;
       if (p2 & 0x01) {
          effectJsonSt = p0.effectJsonStr;
       }
       return p0.copy(effectJsonSt);
    }
    public final String component1(){
       return this.effectJsonStr;
    }
    public final LiveFlvStreamAbility$Params copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveFlvStreamAbility$Params.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveFlvStreamAbility$Params(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveFlvStreamAbility$Params.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveFlvStreamAbility$Params && a.g(this.effectJsonStr, p0.effectJsonStr))) {
          return true;
       }
       return false;
    }
    public final String getEffectJsonStr(){
       return this.effectJsonStr;
    }
    public int hashCode(){
       LiveFlvStreamAbility$Params obj = PatchProxy.apply(null, this, LiveFlvStreamAbility$Params.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.effectJsonStr;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveFlvStreamAbility$Params.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Params\(effectJsonStr="+this.effectJsonStr+"\)";
    }
}
