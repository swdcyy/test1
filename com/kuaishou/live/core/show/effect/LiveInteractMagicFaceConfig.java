package com.kuaishou.live.core.show.effect.LiveInteractMagicFaceConfig;
import java.util.Map;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Long;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveInteractMagicFaceConfig	// class@000b03
{
    public Map bizConfig;
    public Boolean enableShowEntrance;
    public String magicFaceId;
    public Long serverTime;

    public final Map a(){
       return this.bizConfig;
    }
    public final Boolean b(){
       return this.enableShowEntrance;
    }
    public final String c(){
       return this.magicFaceId;
    }
    public final Long d(){
       return this.serverTime;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveInteractMagicFaceConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveInteractMagicFaceConfig && (a.g(this.magicFaceId, p0.magicFaceId) && (a.g(this.bizConfig, p0.bizConfig) && (a.g(this.enableShowEntrance, p0.enableShowEntrance) && a.g(this.serverTime, p0.serverTime)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveInteractMagicFaceConfig obj = PatchProxy.apply(null, this, LiveInteractMagicFaceConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.magicFaceId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveInteractMagicFaceConfig tbizConfig = this.bizConfig;
       int i2 = (tbizConfig != null)? tbizConfig.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbizConfig = this.enableShowEntrance;
       i2 = (tbizConfig != null)? tbizConfig.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbizConfig = this.serverTime;
       if (tbizConfig != null) {
          i = tbizConfig.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveInteractMagicFaceConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveInteractMagicFaceConfig\(magicFaceId="+this.magicFaceId+", bizConfig="+this.bizConfig+", enableShowEntrance="+this.enableShowEntrance+", serverTime="+this.serverTime+"\)";
    }
}
