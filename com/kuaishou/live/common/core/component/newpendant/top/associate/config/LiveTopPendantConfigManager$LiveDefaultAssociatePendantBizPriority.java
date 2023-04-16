package com.kuaishou.live.common.core.component.newpendant.top.associate.config.LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority extends Enum	// class@0016be
{
    public static final LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority[] $VALUES;
    public static final LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority HOURLY_RANK;
    public static final LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority LIVE_SQUARE;
    public static final LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority LIVE_TOPIC;
    public static final LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority VOICE_PARTY_TOPIC;

    static {
       LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority liveDefaultA = new LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority("HOURLY_RANK", 0);
       LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority.HOURLY_RANK = liveDefaultA;
       LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority liveDefaultA1 = new LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority("LIVE_TOPIC", 1);
       LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority.LIVE_TOPIC = liveDefaultA1;
       LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority liveDefaultA2 = new LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority("VOICE_PARTY_TOPIC", 2);
       LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority.VOICE_PARTY_TOPIC = liveDefaultA2;
       LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority liveDefaultA3 = new LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority("LIVE_SQUARE", 3);
       LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority.LIVE_SQUARE = liveDefaultA3;
       LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority[] liveDefaultA4 = new LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority[]{liveDefaultA,liveDefaultA1,liveDefaultA2,liveDefaultA3};
       LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority.$VALUES = liveDefaultA4;
    }
    public void LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority(String p0,int p1){
       super(p0, p1);
    }
    public static LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority.class, p0);
    }
    public static LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority[] values(){
       Object obj = PatchProxy.apply(null, null, LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority.$VALUES.clone();
    }
}
