package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdOpenNonImmersiveH5$a;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdOpenNonImmersiveH5$Params;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdOpenNonImmersiveH5$a	// class@000e1d
{
    public final LiveJsCmdOpenNonImmersiveH5$Params param;

    public void LiveJsCmdOpenNonImmersiveH5$a(){
       super(null);
    }
    public void LiveJsCmdOpenNonImmersiveH5$a(LiveJsCmdOpenNonImmersiveH5$Params p0){
       super();
       this.param = p0;
    }
    public final LiveJsCmdOpenNonImmersiveH5$Params a(){
       return this.param;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdOpenNonImmersiveH5$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdOpenNonImmersiveH5$a && a.g(this.param, p0.param))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdOpenNonImmersiveH5$a obj = PatchProxy.apply(null, this, LiveJsCmdOpenNonImmersiveH5$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.param;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdOpenNonImmersiveH5$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(param="+this.param+"\)";
    }
}
