package com.kwai.component.stargateegg.model.StargateEggVseParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class StargateEggVseParams implements Serializable	// class@000b41
{
    public final String effectId;

    public void StargateEggVseParams(String p0){
       a.p(p0, "effectId");
       super();
       this.effectId = p0;
    }
    public static StargateEggVseParams copy$default(StargateEggVseParams p0,String p1,int p2,Object p3){
       StargateEggVseParams effectId;
       if (p2 & 0x01) {
          effectId = p0.effectId;
       }
       return p0.copy(effectId);
    }
    public final String component1(){
       return this.effectId;
    }
    public final StargateEggVseParams copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StargateEggVseParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "effectId");
       return new StargateEggVseParams(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StargateEggVseParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof StargateEggVseParams && a.g(this.effectId, p0.effectId))) {
          return true;
       }
       return false;
    }
    public final String getEffectId(){
       return this.effectId;
    }
    public int hashCode(){
       StargateEggVseParams obj = PatchProxy.apply(null, this, StargateEggVseParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.effectId;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, StargateEggVseParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StargateEggVseParams\(effectId="+this.effectId+"\)";
    }
}
