package com.kuaishou.live.core.show.wishlight.render.LiveWishLightEffectMessage$Data;
import com.kuaishou.live.core.show.wishlight.render.LiveWishLightEffectCommand$LightState;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveWishLightEffectMessage$Data	// class@0012af
{
    public LiveWishLightEffectCommand$LightState lightState;
    public String magicFaceId;
    public LiveWishLightEffectCommand$MockState mockState;

    public final LiveWishLightEffectCommand$LightState a(){
       return this.lightState;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveWishLightEffectMessage$Data.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveWishLightEffectMessage$Data && (a.g(this.magicFaceId, p0.magicFaceId) && (a.g(this.mockState, p0.mockState) && a.g(this.lightState, p0.lightState))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveWishLightEffectMessage$Data obj = PatchProxy.apply(null, this, LiveWishLightEffectMessage$Data.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.magicFaceId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveWishLightEffectMessage$Data tmockState = this.mockState;
       int i2 = (tmockState != null)? tmockState.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmockState = this.lightState;
       if (tmockState != null) {
          i = tmockState.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveWishLightEffectMessage$Data.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Data\(magicFaceId="+this.magicFaceId+", mockState="+this.mockState+", lightState="+this.lightState+"\)";
    }
}
