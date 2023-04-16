package com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceEndReason extends Enum	// class@000f98
{
    public static final LiveAudienceEndReason[] $VALUES;
    public static final LiveAudienceEndReason ANCHOR_CLOSE;
    public static final LiveAudienceEndReason BANNED_BY_ANCHOR;
    public static final LiveAudienceEndReason LIVE_BANNED;
    public static final LiveAudienceEndReason NONE;

    static {
       LiveAudienceEndReason liveAudience = new LiveAudienceEndReason("NONE", 0);
       LiveAudienceEndReason.NONE = liveAudience;
       LiveAudienceEndReason liveAudience1 = new LiveAudienceEndReason("ANCHOR_CLOSE", 1);
       LiveAudienceEndReason.ANCHOR_CLOSE = liveAudience1;
       LiveAudienceEndReason liveAudience2 = new LiveAudienceEndReason("LIVE_BANNED", 2);
       LiveAudienceEndReason.LIVE_BANNED = liveAudience2;
       LiveAudienceEndReason liveAudience3 = new LiveAudienceEndReason("BANNED_BY_ANCHOR", 3);
       LiveAudienceEndReason.BANNED_BY_ANCHOR = liveAudience3;
       LiveAudienceEndReason[] liveAudience4 = new LiveAudienceEndReason[]{liveAudience,liveAudience1,liveAudience2,liveAudience3};
       LiveAudienceEndReason.$VALUES = liveAudience4;
    }
    public void LiveAudienceEndReason(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAudienceEndReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceEndReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAudienceEndReason.class, p0);
    }
    public static LiveAudienceEndReason[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAudienceEndReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceEndReason.$VALUES.clone();
    }
}
