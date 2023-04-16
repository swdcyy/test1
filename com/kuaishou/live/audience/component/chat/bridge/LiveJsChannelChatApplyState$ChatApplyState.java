package com.kuaishou.live.audience.component.chat.bridge.LiveJsChannelChatApplyState$ChatApplyState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveJsChannelChatApplyState$ChatApplyState extends Enum	// class@000a75
{
    public final int value;
    public static final LiveJsChannelChatApplyState$ChatApplyState[] $VALUES;
    public static final LiveJsChannelChatApplyState$ChatApplyState CHAT_USER_STATE_APPLYING;
    public static final LiveJsChannelChatApplyState$ChatApplyState CHAT_USER_STATE_CHATTING;
    public static final LiveJsChannelChatApplyState$ChatApplyState CHAT_USER_STATE_IDLE;
    public static final LiveJsChannelChatApplyState$ChatApplyState CHAT_USER_STATE_SWITCH_OFF;

    static {
       LiveJsChannelChatApplyState$ChatApplyState uChatApplySt1;
       LiveJsChannelChatApplyState$ChatApplyState[] uChatApplySt = new LiveJsChannelChatApplyState$ChatApplyState[]{uChatApplySt1,uChatApplySt1,uChatApplySt1,uChatApplySt1};
       uChatApplySt1 = new LiveJsChannelChatApplyState$ChatApplyState("CHAT_USER_STATE_SWITCH_OFF", 0, 1);
       LiveJsChannelChatApplyState$ChatApplyState.CHAT_USER_STATE_SWITCH_OFF = uChatApplySt1;
       uChatApplySt1 = new LiveJsChannelChatApplyState$ChatApplyState("CHAT_USER_STATE_IDLE", 1, 2);
       LiveJsChannelChatApplyState$ChatApplyState.CHAT_USER_STATE_IDLE = uChatApplySt1;
       uChatApplySt1 = new LiveJsChannelChatApplyState$ChatApplyState("CHAT_USER_STATE_APPLYING", 2, 3);
       LiveJsChannelChatApplyState$ChatApplyState.CHAT_USER_STATE_APPLYING = uChatApplySt1;
       uChatApplySt1 = new LiveJsChannelChatApplyState$ChatApplyState("CHAT_USER_STATE_CHATTING", 3, 4);
       LiveJsChannelChatApplyState$ChatApplyState.CHAT_USER_STATE_CHATTING = uChatApplySt1;
       LiveJsChannelChatApplyState$ChatApplyState.$VALUES = uChatApplySt;
    }
    public void LiveJsChannelChatApplyState$ChatApplyState(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static LiveJsChannelChatApplyState$ChatApplyState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveJsChannelChatApplyState$ChatApplyState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveJsChannelChatApplyState$ChatApplyState.class, p0);
    }
    public static LiveJsChannelChatApplyState$ChatApplyState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveJsChannelChatApplyState$ChatApplyState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveJsChannelChatApplyState$ChatApplyState.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
