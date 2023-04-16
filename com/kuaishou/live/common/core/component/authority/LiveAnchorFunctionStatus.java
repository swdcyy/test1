package com.kuaishou.live.common.core.component.authority.LiveAnchorFunctionStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAnchorFunctionStatus extends Enum	// class@000f69
{
    public static final LiveAnchorFunctionStatus[] $VALUES;
    public static final LiveAnchorFunctionStatus AVAILABLE;
    public static final LiveAnchorFunctionStatus IN_MAINTENANCE;
    public static final LiveAnchorFunctionStatus NOT_AUTHORIZED;

    static {
       LiveAnchorFunctionStatus liveAnchorFu = new LiveAnchorFunctionStatus("NOT_AUTHORIZED", 0);
       LiveAnchorFunctionStatus.NOT_AUTHORIZED = liveAnchorFu;
       LiveAnchorFunctionStatus liveAnchorFu1 = new LiveAnchorFunctionStatus("IN_MAINTENANCE", 1);
       LiveAnchorFunctionStatus.IN_MAINTENANCE = liveAnchorFu1;
       LiveAnchorFunctionStatus liveAnchorFu2 = new LiveAnchorFunctionStatus("AVAILABLE", 2);
       LiveAnchorFunctionStatus.AVAILABLE = liveAnchorFu2;
       LiveAnchorFunctionStatus[] liveAnchorFu3 = new LiveAnchorFunctionStatus[]{liveAnchorFu,liveAnchorFu1,liveAnchorFu2};
       LiveAnchorFunctionStatus.$VALUES = liveAnchorFu3;
    }
    public void LiveAnchorFunctionStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAnchorFunctionStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAnchorFunctionStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAnchorFunctionStatus.class, p0);
    }
    public static LiveAnchorFunctionStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAnchorFunctionStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAnchorFunctionStatus.$VALUES.clone();
    }
}
