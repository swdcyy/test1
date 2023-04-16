package com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceApplyChatService$State extends Enum	// class@00102b
{
    public static final LiveAudienceApplyChatService$State[] $VALUES;
    public static final LiveAudienceApplyChatService$State APPLYING;
    public static final LiveAudienceApplyChatService$State CHATTING;
    public static final LiveAudienceApplyChatService$State IDLE;

    static {
       LiveAudienceApplyChatService$State state = new LiveAudienceApplyChatService$State("IDLE", 0);
       LiveAudienceApplyChatService$State.IDLE = state;
       LiveAudienceApplyChatService$State state1 = new LiveAudienceApplyChatService$State("APPLYING", 1);
       LiveAudienceApplyChatService$State.APPLYING = state1;
       LiveAudienceApplyChatService$State state2 = new LiveAudienceApplyChatService$State("CHATTING", 2);
       LiveAudienceApplyChatService$State.CHATTING = state2;
       LiveAudienceApplyChatService$State[] stateArray = new LiveAudienceApplyChatService$State[]{state,state1,state2};
       LiveAudienceApplyChatService$State.$VALUES = stateArray;
    }
    public void LiveAudienceApplyChatService$State(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAudienceApplyChatService$State valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceApplyChatService$State.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAudienceApplyChatService$State.class, p0);
    }
    public static LiveAudienceApplyChatService$State[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAudienceApplyChatService$State.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceApplyChatService$State.$VALUES.clone();
    }
}
