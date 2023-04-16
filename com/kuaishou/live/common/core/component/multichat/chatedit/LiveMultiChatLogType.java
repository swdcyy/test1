package com.kuaishou.live.common.core.component.multichat.chatedit.LiveMultiChatLogType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiChatLogType extends Enum	// class@0014c9
{
    public static final LiveMultiChatLogType[] $VALUES;
    public static final LiveMultiChatLogType CLICK;
    public static final LiveMultiChatLogType SHOW;

    static {
       LiveMultiChatLogType liveMultiCha1;
       LiveMultiChatLogType[] liveMultiCha = new LiveMultiChatLogType[]{liveMultiCha1,liveMultiCha1};
       liveMultiCha1 = new LiveMultiChatLogType("SHOW", 0);
       LiveMultiChatLogType.SHOW = liveMultiCha1;
       liveMultiCha1 = new LiveMultiChatLogType("CLICK", 1);
       LiveMultiChatLogType.CLICK = liveMultiCha1;
       LiveMultiChatLogType.$VALUES = liveMultiCha;
    }
    public void LiveMultiChatLogType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMultiChatLogType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiChatLogType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiChatLogType.class, p0);
    }
    public static LiveMultiChatLogType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiChatLogType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiChatLogType.$VALUES.clone();
    }
}
