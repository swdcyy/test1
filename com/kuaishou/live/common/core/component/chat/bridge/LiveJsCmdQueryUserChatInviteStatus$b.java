package com.kuaishou.live.common.core.component.chat.bridge.LiveJsCmdQueryUserChatInviteStatus$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdQueryUserChatInviteStatus$b	// class@00103d
{
    public final int chatInviteStatus;

    public void LiveJsCmdQueryUserChatInviteStatus$b(int p0){
       super();
       this.chatInviteStatus = p0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LiveJsCmdQueryUserChatInviteStatus$b && this.chatInviteStatus == p0.chatInviteStatus)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdQueryUserChatInviteStatus$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.chatInviteStatus;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdQueryUserChatInviteStatus$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Response\(chatInviteStatus="+this.chatInviteStatus+"\)";
    }
}
