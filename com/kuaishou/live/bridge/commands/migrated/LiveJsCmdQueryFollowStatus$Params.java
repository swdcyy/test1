package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdQueryFollowStatus$Params;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdQueryFollowStatus$Params	// class@000e22
{
    public String userId;

    public void LiveJsCmdQueryFollowStatus$Params(){
       super(null);
    }
    public void LiveJsCmdQueryFollowStatus$Params(String p0){
       super();
       this.userId = p0;
    }
    public final String a(){
       return this.userId;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdQueryFollowStatus$Params.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdQueryFollowStatus$Params && a.g(this.userId, p0.userId))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdQueryFollowStatus$Params obj = PatchProxy.apply(null, this, LiveJsCmdQueryFollowStatus$Params.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userId;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdQueryFollowStatus$Params.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Params\(userId="+this.userId+"\)";
    }
}
