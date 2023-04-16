package com.kuaishou.live.anchorchat.LiveAnchorChatBaseService$AnchorChatState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAnchorChatBaseService$AnchorChatState extends Enum	// class@000a31
{
    public static final LiveAnchorChatBaseService$AnchorChatState[] $VALUES;
    public static final LiveAnchorChatBaseService$AnchorChatState CONNECTED;
    public static final LiveAnchorChatBaseService$AnchorChatState END;

    static {
       LiveAnchorChatBaseService$AnchorChatState uAnchorChatS = new LiveAnchorChatBaseService$AnchorChatState("CONNECTED", 0);
       LiveAnchorChatBaseService$AnchorChatState.CONNECTED = uAnchorChatS;
       LiveAnchorChatBaseService$AnchorChatState uAnchorChatS1 = new LiveAnchorChatBaseService$AnchorChatState("END", 1);
       LiveAnchorChatBaseService$AnchorChatState.END = uAnchorChatS1;
       LiveAnchorChatBaseService$AnchorChatState[] uAnchorChatS2 = new LiveAnchorChatBaseService$AnchorChatState[]{uAnchorChatS,uAnchorChatS1};
       LiveAnchorChatBaseService$AnchorChatState.$VALUES = uAnchorChatS2;
    }
    public void LiveAnchorChatBaseService$AnchorChatState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAnchorChatBaseService$AnchorChatState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAnchorChatBaseService$AnchorChatState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAnchorChatBaseService$AnchorChatState.class, p0);
    }
    public static LiveAnchorChatBaseService$AnchorChatState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAnchorChatBaseService$AnchorChatState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAnchorChatBaseService$AnchorChatState.$VALUES.clone();
    }
}
