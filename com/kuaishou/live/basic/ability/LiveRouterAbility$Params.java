package com.kuaishou.live.basic.ability.LiveRouterAbility$Params;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveRouterAbility$Params	// class@000c79
{
    public final String url;

    public void LiveRouterAbility$Params(String p0){
       super();
       this.url = p0;
    }
    public static LiveRouterAbility$Params copy$default(LiveRouterAbility$Params p0,String p1,int p2,Object p3){
       LiveRouterAbility$Params url;
       if (p2 & 0x01) {
          url = p0.url;
       }
       return p0.copy(url);
    }
    public final String component1(){
       return this.url;
    }
    public final LiveRouterAbility$Params copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveRouterAbility$Params.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveRouterAbility$Params(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveRouterAbility$Params.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveRouterAbility$Params && a.g(this.url, p0.url))) {
          return true;
       }
       return false;
    }
    public final String getUrl(){
       return this.url;
    }
    public int hashCode(){
       LiveRouterAbility$Params obj = PatchProxy.apply(null, this, LiveRouterAbility$Params.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.url;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveRouterAbility$Params.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Params\(url="+this.url+"\)";
    }
}
