package com.kuaishou.live.common.interactwatchdog.sei.LiveAudienceSeiFallbackEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceSeiFallbackEvent extends Enum	// class@0017e0
{
    public static final LiveAudienceSeiFallbackEvent[] $VALUES;
    public static final LiveAudienceSeiFallbackEvent FALLBACK_LAYOUT_UPDATE;
    public static final LiveAudienceSeiFallbackEvent FALLBACK_NONE;
    public static final LiveAudienceSeiFallbackEvent FALLBACK_SEI_ERROR;

    static {
       LiveAudienceSeiFallbackEvent liveAudience1;
       LiveAudienceSeiFallbackEvent[] liveAudience = new LiveAudienceSeiFallbackEvent[]{liveAudience1,liveAudience1,liveAudience1};
       liveAudience1 = new LiveAudienceSeiFallbackEvent("FALLBACK_NONE", 0);
       LiveAudienceSeiFallbackEvent.FALLBACK_NONE = liveAudience1;
       liveAudience1 = new LiveAudienceSeiFallbackEvent("FALLBACK_LAYOUT_UPDATE", 1);
       LiveAudienceSeiFallbackEvent.FALLBACK_LAYOUT_UPDATE = liveAudience1;
       liveAudience1 = new LiveAudienceSeiFallbackEvent("FALLBACK_SEI_ERROR", 2);
       LiveAudienceSeiFallbackEvent.FALLBACK_SEI_ERROR = liveAudience1;
       LiveAudienceSeiFallbackEvent.$VALUES = liveAudience;
    }
    public void LiveAudienceSeiFallbackEvent(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAudienceSeiFallbackEvent valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceSeiFallbackEvent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAudienceSeiFallbackEvent.class, p0);
    }
    public static LiveAudienceSeiFallbackEvent[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAudienceSeiFallbackEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceSeiFallbackEvent.$VALUES.clone();
    }
}
