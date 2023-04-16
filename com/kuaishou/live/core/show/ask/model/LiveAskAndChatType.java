package com.kuaishou.live.core.show.ask.model.LiveAskAndChatType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAskAndChatType extends Enum	// class@0009c8
{
    public static final LiveAskAndChatType[] $VALUES;
    public static final LiveAskAndChatType ASK_AND_CHAT_BOTH_AUDIO;
    public static final LiveAskAndChatType ONLY_ASK;
    public static final LiveAskAndChatType ONLY_CHAT_AUDIENCES;

    static {
       LiveAskAndChatType liveAskAndCh = new LiveAskAndChatType("ONLY_CHAT_AUDIENCES", 0);
       LiveAskAndChatType.ONLY_CHAT_AUDIENCES = liveAskAndCh;
       LiveAskAndChatType liveAskAndCh1 = new LiveAskAndChatType("ONLY_ASK", 1);
       LiveAskAndChatType.ONLY_ASK = liveAskAndCh1;
       LiveAskAndChatType liveAskAndCh2 = new LiveAskAndChatType("ASK_AND_CHAT_BOTH_AUDIO", 2);
       LiveAskAndChatType.ASK_AND_CHAT_BOTH_AUDIO = liveAskAndCh2;
       LiveAskAndChatType[] liveAskAndCh3 = new LiveAskAndChatType[]{liveAskAndCh,liveAskAndCh1,liveAskAndCh2};
       LiveAskAndChatType.$VALUES = liveAskAndCh3;
    }
    public void LiveAskAndChatType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAskAndChatType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAskAndChatType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAskAndChatType.class, p0);
    }
    public static LiveAskAndChatType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAskAndChatType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAskAndChatType.$VALUES.clone();
    }
}
