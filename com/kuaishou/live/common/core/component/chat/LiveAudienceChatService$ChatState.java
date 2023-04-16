package com.kuaishou.live.common.core.component.chat.LiveAudienceChatService$ChatState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceChatService$ChatState extends Enum	// class@001025
{
    public static final LiveAudienceChatService$ChatState[] $VALUES;
    public static final LiveAudienceChatService$ChatState CONNECTED;
    public static final LiveAudienceChatService$ChatState END;
    public static final LiveAudienceChatService$ChatState INVITED;

    static {
       LiveAudienceChatService$ChatState uChatState = new LiveAudienceChatService$ChatState("INVITED", 0);
       LiveAudienceChatService$ChatState.INVITED = uChatState;
       LiveAudienceChatService$ChatState uChatState1 = new LiveAudienceChatService$ChatState("CONNECTED", 1);
       LiveAudienceChatService$ChatState.CONNECTED = uChatState1;
       LiveAudienceChatService$ChatState uChatState2 = new LiveAudienceChatService$ChatState("END", 2);
       LiveAudienceChatService$ChatState.END = uChatState2;
       LiveAudienceChatService$ChatState[] uChatStateAr = new LiveAudienceChatService$ChatState[]{uChatState,uChatState1,uChatState2};
       LiveAudienceChatService$ChatState.$VALUES = uChatStateAr;
    }
    public void LiveAudienceChatService$ChatState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAudienceChatService$ChatState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceChatService$ChatState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAudienceChatService$ChatState.class, p0);
    }
    public static LiveAudienceChatService$ChatState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAudienceChatService$ChatState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceChatService$ChatState.$VALUES.clone();
    }
}
