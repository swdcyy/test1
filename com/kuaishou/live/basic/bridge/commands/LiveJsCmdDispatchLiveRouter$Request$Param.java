package com.kuaishou.live.basic.bridge.commands.LiveJsCmdDispatchLiveRouter$Request$Param;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdDispatchLiveRouter$Request$Param	// class@000cb0
{
    public final Boolean keepDisplayWebView;
    public final String path;

    public final String a(){
       return this.path;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdDispatchLiveRouter$Request$Param.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdDispatchLiveRouter$Request$Param && (a.g(this.path, p0.path) && a.g(this.keepDisplayWebView, p0.keepDisplayWebView)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdDispatchLiveRouter$Request$Param obj = PatchProxy.apply(null, this, LiveJsCmdDispatchLiveRouter$Request$Param.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.path;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveJsCmdDispatchLiveRouter$Request$Param tkeepDisplay = this.keepDisplayWebView;
       if (tkeepDisplay != null) {
          i = tkeepDisplay.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdDispatchLiveRouter$Request$Param.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Param\(path="+this.path+", keepDisplayWebView="+this.keepDisplayWebView+"\)";
    }
}
