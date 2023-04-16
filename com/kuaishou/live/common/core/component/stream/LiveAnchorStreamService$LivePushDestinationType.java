package com.kuaishou.live.common.core.component.stream.LiveAnchorStreamService$LivePushDestinationType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAnchorStreamService$LivePushDestinationType extends Enum	// class@00177b
{
    public static final LiveAnchorStreamService$LivePushDestinationType[] $VALUES;
    public static final LiveAnchorStreamService$LivePushDestinationType CDN;
    public static final LiveAnchorStreamService$LivePushDestinationType ORIGIN;
    public static final LiveAnchorStreamService$LivePushDestinationType UNKNOWN;

    static {
       LiveAnchorStreamService$LivePushDestinationType livePushDest = new LiveAnchorStreamService$LivePushDestinationType("UNKNOWN", 0);
       LiveAnchorStreamService$LivePushDestinationType.UNKNOWN = livePushDest;
       LiveAnchorStreamService$LivePushDestinationType livePushDest1 = new LiveAnchorStreamService$LivePushDestinationType("CDN", 1);
       LiveAnchorStreamService$LivePushDestinationType.CDN = livePushDest1;
       LiveAnchorStreamService$LivePushDestinationType livePushDest2 = new LiveAnchorStreamService$LivePushDestinationType("ORIGIN", 2);
       LiveAnchorStreamService$LivePushDestinationType.ORIGIN = livePushDest2;
       LiveAnchorStreamService$LivePushDestinationType[] livePushDest3 = new LiveAnchorStreamService$LivePushDestinationType[]{livePushDest,livePushDest1,livePushDest2};
       LiveAnchorStreamService$LivePushDestinationType.$VALUES = livePushDest3;
    }
    public void LiveAnchorStreamService$LivePushDestinationType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAnchorStreamService$LivePushDestinationType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAnchorStreamService$LivePushDestinationType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAnchorStreamService$LivePushDestinationType.class, p0);
    }
    public static LiveAnchorStreamService$LivePushDestinationType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAnchorStreamService$LivePushDestinationType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAnchorStreamService$LivePushDestinationType.$VALUES.clone();
    }
}
