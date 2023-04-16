package com.kuaishou.live.common.core.component.chat.bridge.LiveJsCmdQueryUserChatInviteStatus$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdQueryUserChatInviteStatus$a	// class@00103c
{
    public final String userId;

    public void LiveJsCmdQueryUserChatInviteStatus$a(String p0){
       super();
       this.userId = p0;
    }
    public final String a(){
       return this.userId;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdQueryUserChatInviteStatus$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdQueryUserChatInviteStatus$a && a.g(this.userId, p0.userId))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdQueryUserChatInviteStatus$a obj = PatchProxy.apply(null, this, LiveJsCmdQueryUserChatInviteStatus$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userId;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdQueryUserChatInviteStatus$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(userId="+this.userId+"\)";
    }
}
