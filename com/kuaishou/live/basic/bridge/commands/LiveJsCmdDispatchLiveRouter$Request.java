package com.kuaishou.live.basic.bridge.commands.LiveJsCmdDispatchLiveRouter$Request;
import com.kuaishou.live.basic.bridge.commands.LiveJsCmdDispatchLiveRouter$Request$Param;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdDispatchLiveRouter$Request	// class@000cb1
{
    public final LiveJsCmdDispatchLiveRouter$Request$Param param;

    public void LiveJsCmdDispatchLiveRouter$Request(LiveJsCmdDispatchLiveRouter$Request$Param p0){
       super();
       this.param = p0;
    }
    public final LiveJsCmdDispatchLiveRouter$Request$Param a(){
       return this.param;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdDispatchLiveRouter$Request.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdDispatchLiveRouter$Request && a.g(this.param, p0.param))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdDispatchLiveRouter$Request obj = PatchProxy.apply(null, this, LiveJsCmdDispatchLiveRouter$Request.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.param;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdDispatchLiveRouter$Request.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(param="+this.param+"\)";
    }
}
