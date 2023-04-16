package com.kuaishou.live.basic.ability.LiveAppAbility$Platform;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveAppAbility$Platform	// class@000c54
{
    public String platform;

    public void LiveAppAbility$Platform(String p0){
       super();
       this.platform = p0;
    }
    public static LiveAppAbility$Platform copy$default(LiveAppAbility$Platform p0,String p1,int p2,Object p3){
       LiveAppAbility$Platform platform;
       if (p2 & 0x01) {
          platform = p0.platform;
       }
       return p0.copy(platform);
    }
    public final String component1(){
       return this.platform;
    }
    public final LiveAppAbility$Platform copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAppAbility$Platform.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAppAbility$Platform(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAppAbility$Platform.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveAppAbility$Platform && a.g(this.platform, p0.platform))) {
          return true;
       }
       return false;
    }
    public final String getPlatform(){
       return this.platform;
    }
    public int hashCode(){
       LiveAppAbility$Platform obj = PatchProxy.apply(null, this, LiveAppAbility$Platform.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.platform;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setPlatform(String p0){
       this.platform = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAppAbility$Platform.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Platform\(platform="+this.platform+"\)";
    }
}
