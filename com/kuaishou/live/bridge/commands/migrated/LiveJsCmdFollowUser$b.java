package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdFollowUser$b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdFollowUser$b	// class@000e0a
{
    public int isFollowed;
    public String userId;

    public void LiveJsCmdFollowUser$b(){
       super(0, "");
    }
    public void LiveJsCmdFollowUser$b(int p0,String p1){
       a.p(p1, "userId");
       super();
       this.isFollowed = p0;
       this.userId = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdFollowUser$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdFollowUser$b && (this.isFollowed == p0.isFollowed && a.g(this.userId, p0.userId)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdFollowUser$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.isFollowed * 31;
       LiveJsCmdFollowUser$b tuserId = this.userId;
       int i1 = (tuserId != null)? tuserId.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdFollowUser$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Response\(isFollowed="+this.isFollowed+", userId="+this.userId+"\)";
    }
}
