package com.kuaishou.live.audience.component.chat.bridge.LiveJsChannelChatApplyState$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsChannelChatApplyState$a	// class@000a76
{
    public final int chatApplyState;

    public void LiveJsChannelChatApplyState$a(int p0){
       super();
       this.chatApplyState = p0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LiveJsChannelChatApplyState$a && this.chatApplyState == p0.chatApplyState)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveJsChannelChatApplyState$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.chatApplyState;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsChannelChatApplyState$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Response\(chatApplyState="+this.chatApplyState+"\)";
    }
}
