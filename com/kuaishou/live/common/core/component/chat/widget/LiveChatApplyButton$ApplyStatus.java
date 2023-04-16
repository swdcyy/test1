package com.kuaishou.live.common.core.component.chat.widget.LiveChatApplyButton$ApplyStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveChatApplyButton$ApplyStatus extends Enum	// class@00104e
{
    public static final LiveChatApplyButton$ApplyStatus[] $VALUES;
    public static final LiveChatApplyButton$ApplyStatus APPLYING;
    public static final LiveChatApplyButton$ApplyStatus NORMAL;

    static {
       LiveChatApplyButton$ApplyStatus uApplyStatus = new LiveChatApplyButton$ApplyStatus("NORMAL", 0);
       LiveChatApplyButton$ApplyStatus.NORMAL = uApplyStatus;
       LiveChatApplyButton$ApplyStatus uApplyStatus1 = new LiveChatApplyButton$ApplyStatus("APPLYING", 1);
       LiveChatApplyButton$ApplyStatus.APPLYING = uApplyStatus1;
       LiveChatApplyButton$ApplyStatus[] uApplyStatus2 = new LiveChatApplyButton$ApplyStatus[]{uApplyStatus,uApplyStatus1};
       LiveChatApplyButton$ApplyStatus.$VALUES = uApplyStatus2;
    }
    public void LiveChatApplyButton$ApplyStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LiveChatApplyButton$ApplyStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveChatApplyButton$ApplyStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveChatApplyButton$ApplyStatus.class, p0);
    }
    public static LiveChatApplyButton$ApplyStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveChatApplyButton$ApplyStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveChatApplyButton$ApplyStatus.$VALUES.clone();
    }
}
