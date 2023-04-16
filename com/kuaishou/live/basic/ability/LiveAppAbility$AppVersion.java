package com.kuaishou.live.basic.ability.LiveAppAbility$AppVersion;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveAppAbility$AppVersion	// class@000c4d
{
    public String appVersion;

    public void LiveAppAbility$AppVersion(String p0){
       super();
       this.appVersion = p0;
    }
    public static LiveAppAbility$AppVersion copy$default(LiveAppAbility$AppVersion p0,String p1,int p2,Object p3){
       LiveAppAbility$AppVersion appVersion;
       if (p2 & 0x01) {
          appVersion = p0.appVersion;
       }
       return p0.copy(appVersion);
    }
    public final String component1(){
       return this.appVersion;
    }
    public final LiveAppAbility$AppVersion copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAppAbility$AppVersion.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAppAbility$AppVersion(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAppAbility$AppVersion.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveAppAbility$AppVersion && a.g(this.appVersion, p0.appVersion))) {
          return true;
       }
       return false;
    }
    public final String getAppVersion(){
       return this.appVersion;
    }
    public int hashCode(){
       LiveAppAbility$AppVersion obj = PatchProxy.apply(null, this, LiveAppAbility$AppVersion.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.appVersion;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setAppVersion(String p0){
       this.appVersion = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAppAbility$AppVersion.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AppVersion\(appVersion="+this.appVersion+"\)";
    }
}
