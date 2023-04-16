package com.kuaishou.merchant.api.live.sandeabiz.LiveAnchorSandeaBizService$CloseReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAnchorSandeaBizService$CloseReason extends Enum	// class@00156e
{
    public static final LiveAnchorSandeaBizService$CloseReason[] $VALUES;
    public static final LiveAnchorSandeaBizService$CloseReason CLOSE_BY_INCOMPATIBLE_BIZ;
    public static final LiveAnchorSandeaBizService$CloseReason CLOSE_BY_USER;

    static {
       LiveAnchorSandeaBizService$CloseReason uCloseReason = new LiveAnchorSandeaBizService$CloseReason("CLOSE_BY_USER", 0);
       LiveAnchorSandeaBizService$CloseReason.CLOSE_BY_USER = uCloseReason;
       LiveAnchorSandeaBizService$CloseReason uCloseReason1 = new LiveAnchorSandeaBizService$CloseReason("CLOSE_BY_INCOMPATIBLE_BIZ", 1);
       LiveAnchorSandeaBizService$CloseReason.CLOSE_BY_INCOMPATIBLE_BIZ = uCloseReason1;
       LiveAnchorSandeaBizService$CloseReason[] uCloseReason2 = new LiveAnchorSandeaBizService$CloseReason[]{uCloseReason,uCloseReason1};
       LiveAnchorSandeaBizService$CloseReason.$VALUES = uCloseReason2;
    }
    public void LiveAnchorSandeaBizService$CloseReason(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAnchorSandeaBizService$CloseReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAnchorSandeaBizService$CloseReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAnchorSandeaBizService$CloseReason.class, p0);
    }
    public static LiveAnchorSandeaBizService$CloseReason[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAnchorSandeaBizService$CloseReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAnchorSandeaBizService$CloseReason.$VALUES.clone();
    }
}
