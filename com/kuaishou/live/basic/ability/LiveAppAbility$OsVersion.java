package com.kuaishou.live.basic.ability.LiveAppAbility$OsVersion;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveAppAbility$OsVersion	// class@000c51
{
    public String osVersion;

    public void LiveAppAbility$OsVersion(String p0){
       super();
       this.osVersion = p0;
    }
    public static LiveAppAbility$OsVersion copy$default(LiveAppAbility$OsVersion p0,String p1,int p2,Object p3){
       LiveAppAbility$OsVersion osVersion;
       if (p2 & 0x01) {
          osVersion = p0.osVersion;
       }
       return p0.copy(osVersion);
    }
    public final String component1(){
       return this.osVersion;
    }
    public final LiveAppAbility$OsVersion copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAppAbility$OsVersion.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAppAbility$OsVersion(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAppAbility$OsVersion.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveAppAbility$OsVersion && a.g(this.osVersion, p0.osVersion))) {
          return true;
       }
       return false;
    }
    public final String getOsVersion(){
       return this.osVersion;
    }
    public int hashCode(){
       LiveAppAbility$OsVersion obj = PatchProxy.apply(null, this, LiveAppAbility$OsVersion.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.osVersion;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setOsVersion(String p0){
       this.osVersion = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAppAbility$OsVersion.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "OsVersion\(osVersion="+this.osVersion+"\)";
    }
}
