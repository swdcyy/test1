package com.kuaishou.live.common.core.component.chat.bridge.LiveJsCmdQueryUserChatInviteStatus$ChatInviteState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveJsCmdQueryUserChatInviteStatus$ChatInviteState extends Enum	// class@00103b
{
    public final int value;
    public static final LiveJsCmdQueryUserChatInviteStatus$ChatInviteState[] $VALUES;
    public static final LiveJsCmdQueryUserChatInviteStatus$ChatInviteState CHAT_INVITE_STATE_CHATTING;
    public static final LiveJsCmdQueryUserChatInviteStatus$ChatInviteState CHAT_INVITE_STATE_INVITING;
    public static final LiveJsCmdQueryUserChatInviteStatus$ChatInviteState CHAT_INVITE_STATE_NONE;

    static {
       LiveJsCmdQueryUserChatInviteStatus$ChatInviteState uChatInviteS1;
       LiveJsCmdQueryUserChatInviteStatus$ChatInviteState[] uChatInviteS = new LiveJsCmdQueryUserChatInviteStatus$ChatInviteState[]{uChatInviteS1,uChatInviteS1,uChatInviteS1};
       uChatInviteS1 = new LiveJsCmdQueryUserChatInviteStatus$ChatInviteState("CHAT_INVITE_STATE_NONE", 0, 0);
       LiveJsCmdQueryUserChatInviteStatus$ChatInviteState.CHAT_INVITE_STATE_NONE = uChatInviteS1;
       uChatInviteS1 = new LiveJsCmdQueryUserChatInviteStatus$ChatInviteState("CHAT_INVITE_STATE_INVITING", 1, 1);
       LiveJsCmdQueryUserChatInviteStatus$ChatInviteState.CHAT_INVITE_STATE_INVITING = uChatInviteS1;
       uChatInviteS1 = new LiveJsCmdQueryUserChatInviteStatus$ChatInviteState("CHAT_INVITE_STATE_CHATTING", 2, 2);
       LiveJsCmdQueryUserChatInviteStatus$ChatInviteState.CHAT_INVITE_STATE_CHATTING = uChatInviteS1;
       LiveJsCmdQueryUserChatInviteStatus$ChatInviteState.$VALUES = uChatInviteS;
    }
    public void LiveJsCmdQueryUserChatInviteStatus$ChatInviteState(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static LiveJsCmdQueryUserChatInviteStatus$ChatInviteState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveJsCmdQueryUserChatInviteStatus$ChatInviteState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveJsCmdQueryUserChatInviteStatus$ChatInviteState.class, p0);
    }
    public static LiveJsCmdQueryUserChatInviteStatus$ChatInviteState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveJsCmdQueryUserChatInviteStatus$ChatInviteState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveJsCmdQueryUserChatInviteStatus$ChatInviteState.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
