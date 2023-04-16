package com.kuaishou.live.basic.ability.LiveResourceAbility$GetMagicFacePathParams;
import java.lang.String;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveResourceAbility$GetMagicFacePathParams	// class@000c6f
{
    public final String effectKey;
    public final long magicFaceId;

    public void LiveResourceAbility$GetMagicFacePathParams(String p0,long p1){
       super();
       this.effectKey = p0;
       this.magicFaceId = p1;
    }
    public void LiveResourceAbility$GetMagicFacePathParams(String p0,long p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = 0;
       }
       super(p0, p1);
       return;
    }
    public static LiveResourceAbility$GetMagicFacePathParams copy$default(LiveResourceAbility$GetMagicFacePathParams p0,String p1,long p2,int p3,Object p4){
       LiveResourceAbility$GetMagicFacePathParams effectKey;
       LiveResourceAbility$GetMagicFacePathParams magicFaceId;
       if (p3 & 0x01) {
          effectKey = p0.effectKey;
       }
       if (p3 & 0x02) {
          magicFaceId = p0.magicFaceId;
       }
       return p0.copy(effectKey, magicFaceId);
    }
    public final String component1(){
       return this.effectKey;
    }
    public final long component2(){
       return this.magicFaceId;
    }
    public final LiveResourceAbility$GetMagicFacePathParams copy(String p0,long p1){
       LiveResourceAbility$GetMagicFacePathParams getMagicFace = LiveResourceAbility$GetMagicFacePathParams.class;
       if (PatchProxy.isSupport(getMagicFace)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, getMagicFace, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new LiveResourceAbility$GetMagicFacePathParams(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveResourceAbility$GetMagicFacePathParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveResourceAbility$GetMagicFacePathParams && (a.g(this.effectKey, p0.effectKey) && !this.magicFaceId - p0.magicFaceId))) {
          return true;
       }
       return false;
    }
    public final String getEffectKey(){
       return this.effectKey;
    }
    public final long getMagicFaceId(){
       return this.magicFaceId;
    }
    public int hashCode(){
       LiveResourceAbility$GetMagicFacePathParams obj = PatchProxy.apply(null, this, LiveResourceAbility$GetMagicFacePathParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.effectKey;
       int i = (obj != null)? obj.hashCode(): 0;
       LiveResourceAbility$GetMagicFacePathParams tmagicFaceId = this.magicFaceId;
       return ((i * 31) + (int)(tmagicFaceId ^ (tmagicFaceId >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveResourceAbility$GetMagicFacePathParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GetMagicFacePathParams\(effectKey="+this.effectKey+", magicFaceId="+this.magicFaceId+"\)";
    }
}
