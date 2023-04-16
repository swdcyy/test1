package com.kuaishou.live.common.core.component.multichat.core.statemachine.MultiChatState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MultiChatState extends Enum	// class@0014d4
{
    public static final MultiChatState[] $VALUES;
    public static final MultiChatState CHATTING;
    public static final MultiChatState IDLE;
    public static final MultiChatState WATCHING;

    static {
       MultiChatState multiChatSta1;
       MultiChatState[] multiChatSta = new MultiChatState[]{multiChatSta1,multiChatSta1,multiChatSta1};
       multiChatSta1 = new MultiChatState("IDLE", 0);
       MultiChatState.IDLE = multiChatSta1;
       multiChatSta1 = new MultiChatState("WATCHING", 1);
       MultiChatState.WATCHING = multiChatSta1;
       multiChatSta1 = new MultiChatState("CHATTING", 2);
       MultiChatState.CHATTING = multiChatSta1;
       MultiChatState.$VALUES = multiChatSta;
    }
    public void MultiChatState(String p0,int p1){
       super(p0, p1);
    }
    public static MultiChatState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MultiChatState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MultiChatState.class, p0);
    }
    public static MultiChatState[] values(){
       Object obj = PatchProxy.apply(null, null, MultiChatState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MultiChatState.$VALUES.clone();
    }
}
