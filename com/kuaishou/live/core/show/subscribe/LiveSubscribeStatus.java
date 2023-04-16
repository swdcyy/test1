package com.kuaishou.live.core.show.subscribe.LiveSubscribeStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveSubscribeStatus extends Enum	// class@0010c0
{
    public static final LiveSubscribeStatus[] $VALUES;
    public static final LiveSubscribeStatus NOT_OVER;
    public static final LiveSubscribeStatus OVER;
    public static final LiveSubscribeStatus UNKNOWN_STATUS;

    static {
       LiveSubscribeStatus liveSubscrib = new LiveSubscribeStatus("OVER", 0);
       LiveSubscribeStatus.OVER = liveSubscrib;
       LiveSubscribeStatus liveSubscrib1 = new LiveSubscribeStatus("NOT_OVER", 1);
       LiveSubscribeStatus.NOT_OVER = liveSubscrib1;
       LiveSubscribeStatus liveSubscrib2 = new LiveSubscribeStatus("UNKNOWN_STATUS", 2);
       LiveSubscribeStatus.UNKNOWN_STATUS = liveSubscrib2;
       LiveSubscribeStatus[] liveSubscrib3 = new LiveSubscribeStatus[]{liveSubscrib,liveSubscrib1,liveSubscrib2};
       LiveSubscribeStatus.$VALUES = liveSubscrib3;
    }
    public void LiveSubscribeStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LiveSubscribeStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveSubscribeStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveSubscribeStatus.class, p0);
    }
    public static LiveSubscribeStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveSubscribeStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveSubscribeStatus.$VALUES.clone();
    }
}
