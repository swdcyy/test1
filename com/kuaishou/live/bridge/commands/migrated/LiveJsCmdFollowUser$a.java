package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdFollowUser$a;
import java.lang.Integer;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdFollowUser$a	// class@000e09
{
    public String bizCustomParams;
    public String followRefer;
    public Integer followSource;
    public UserInfo userInfo;

    public final Integer a(){
       return this.followSource;
    }
    public final UserInfo b(){
       return this.userInfo;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdFollowUser$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdFollowUser$a && (a.g(this.followSource, p0.followSource) && (a.g(this.userInfo, p0.userInfo) && (a.g(this.followRefer, p0.followRefer) && a.g(this.bizCustomParams, p0.bizCustomParams)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdFollowUser$a obj = PatchProxy.apply(null, this, LiveJsCmdFollowUser$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.followSource;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveJsCmdFollowUser$a tuserInfo = this.userInfo;
       int i2 = (tuserInfo != null)? tuserInfo.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserInfo = this.followRefer;
       i2 = (tuserInfo != null)? tuserInfo.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserInfo = this.bizCustomParams;
       if (tuserInfo != null) {
          i = tuserInfo.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdFollowUser$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(followSource="+this.followSource+", userInfo="+this.userInfo+", followRefer="+this.followRefer+", bizCustomParams="+this.bizCustomParams+"\)";
    }
}
