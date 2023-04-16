package com.kuaishou.live.audience.component.chat.bridge.LiveJsChannelChatApplyState$b;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$b;
import com.kuaishou.live.audience.component.chat.bridge.LiveJsChannelChatApplyState;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.audience.component.chat.bridge.LiveJsChannelChatApplyState$ChatApplyState;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;
import java.lang.Integer;

public final class LiveJsChannelChatApplyState$b implements LiveAudienceApplyChatService$b	// class@000a77
{
    public final LiveJsChannelChatApplyState b;

    public void LiveJsChannelChatApplyState$b(LiveJsChannelChatApplyState p0){
       this.b = p0;
       super();
    }
    public void M4(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveJsChannelChatApplyState$b.class, "3")) {
          return;
       }
       this.b.o(LiveJsChannelChatApplyState$ChatApplyState.CHAT_USER_STATE_IDLE);
       return;
    }
    public void b6(boolean p0){
       LiveJsChannelChatApplyState$b uob = LiveJsChannelChatApplyState$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       LiveJsChannelChatApplyState$ChatApplyState cHAT_USER_ST = (p0)? LiveJsChannelChatApplyState$ChatApplyState.CHAT_USER_STATE_IDLE: LiveJsChannelChatApplyState$ChatApplyState.CHAT_USER_STATE_SWITCH_OFF;
       this.b.o(cHAT_USER_ST);
       return;
    }
    public void v7(LiveAudienceApplyChatService$State p0,int p1){
       if (PatchProxy.isSupport(LiveJsChannelChatApplyState$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveJsChannelChatApplyState$b.class, "1")) {
          return;
       }
       LiveJsChannelChatApplyState$b tb = this.b;
       tb.o(tb.q(p0));
       return;
    }
}
