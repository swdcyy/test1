package com.kuaishou.live.jsbridge.LiveJsSubscribeParams;
import java.lang.String;
import com.kuaishou.live.jsbridge.LiveJsSubscribeParams$Params;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsSubscribeParams	// class@001d21
{
    public final String channel;
    public final LiveJsSubscribeParams$Params params;

    public final String a(){
       return this.channel;
    }
    public final LiveJsSubscribeParams$Params b(){
       return this.params;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsSubscribeParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsSubscribeParams && (a.g(this.channel, p0.channel) && a.g(this.params, p0.params)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsSubscribeParams obj = PatchProxy.apply(null, this, LiveJsSubscribeParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.channel;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveJsSubscribeParams tparams = this.params;
       if (tparams != null) {
          i = tparams.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsSubscribeParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveJsSubscribeParams\(channel="+this.channel+", params="+this.params+"\)";
    }
}
