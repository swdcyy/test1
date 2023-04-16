package com.kuaishou.live.core.show.wishlight.render.LiveWishLightEffectCommand$LightState;
import java.lang.String;
import com.kuaishou.livestream.message.nano.LiveMultiMagicEffectInfo;
import java.lang.Object;
import java.lang.Integer;
import yy2.a;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveWishLightEffectCommand$LightState	// class@0012a8
{
    public final LiveMultiMagicEffectInfo a;
    public final String avatarLocalPath;
    public final String content;
    public final String id;
    public final Boolean isSelf;
    public final Integer liveStreamType;
    public final Integer type;

    public void LiveWishLightEffectCommand$LightState(String p0,LiveMultiMagicEffectInfo p1,String p2){
       super();
       this.id = p0;
       this.a = p1;
       this.avatarLocalPath = p2;
       LiveMultiMagicEffectInfo liveMultiMag = null;
       LiveMultiMagicEffectInfo magicSubType = (p1 != null)? p1.magicSubType: 0;
       this.type = Integer.valueOf(magicSubType);
       if (p1 != null) {
          magicSubType = p1.content;
          if (magicSubType != null) {
          label_001f :
             this.content = magicSubType;
             int b = (p1 != null)? a.a(p1): false;
             this.isSelf = Boolean.valueOf(b);
             if (p1 != null) {
                liveMultiMag = p1.liveStreamType;
             }
             this.liveStreamType = Integer.valueOf(liveMultiMag);
             return;
          }
       }
       magicSubType = "";
       goto label_001f ;
    }
    public final String a(){
       return this.id;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveWishLightEffectCommand$LightState.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveWishLightEffectCommand$LightState && (a.g(this.id, p0.id) && (a.g(this.a, p0.a) && a.g(this.avatarLocalPath, p0.avatarLocalPath))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveWishLightEffectCommand$LightState obj = PatchProxy.apply(null, this, LiveWishLightEffectCommand$LightState.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.id;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveWishLightEffectCommand$LightState ta = this.a;
       int i2 = (ta != null)? ta.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ta = this.avatarLocalPath;
       if (ta != null) {
          i = ta.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveWishLightEffectCommand$LightState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LightState\(id="+this.id+", info="+this.a+", avatarLocalPath="+this.avatarLocalPath+"\)";
    }
}
