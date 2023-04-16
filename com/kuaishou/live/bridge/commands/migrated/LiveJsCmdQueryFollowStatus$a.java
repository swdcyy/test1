package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdQueryFollowStatus$a;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdQueryFollowStatus$Params;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdQueryFollowStatus$a	// class@000e23
{
    public final LiveJsCmdQueryFollowStatus$Params params;

    public void LiveJsCmdQueryFollowStatus$a(){
       super(null);
    }
    public void LiveJsCmdQueryFollowStatus$a(LiveJsCmdQueryFollowStatus$Params p0){
       super();
       this.params = p0;
    }
    public final LiveJsCmdQueryFollowStatus$Params a(){
       return this.params;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdQueryFollowStatus$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdQueryFollowStatus$a && a.g(this.params, p0.params))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdQueryFollowStatus$a obj = PatchProxy.apply(null, this, LiveJsCmdQueryFollowStatus$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.params;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdQueryFollowStatus$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(params="+this.params+"\)";
    }
}
