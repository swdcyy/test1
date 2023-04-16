package com.kuaishou.live.core.show.fansgroup.LiveAudienceKwaiCoinsChangeReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceKwaiCoinsChangeReason extends Enum	// class@000b25
{
    public int mReason;
    public static final LiveAudienceKwaiCoinsChangeReason[] $VALUES;
    public static final LiveAudienceKwaiCoinsChangeReason FANS_GROUP_SEND_GIFT;
    public static final LiveAudienceKwaiCoinsChangeReason JOIN_FANS_GROUP;
    public static final LiveAudienceKwaiCoinsChangeReason LIVE_BULLET_COMMENT;

    static {
       LiveAudienceKwaiCoinsChangeReason liveAudience = new LiveAudienceKwaiCoinsChangeReason("JOIN_FANS_GROUP", 0, 1);
       LiveAudienceKwaiCoinsChangeReason.JOIN_FANS_GROUP = liveAudience;
       LiveAudienceKwaiCoinsChangeReason liveAudience1 = new LiveAudienceKwaiCoinsChangeReason("LIVE_BULLET_COMMENT", 1, 2);
       LiveAudienceKwaiCoinsChangeReason.LIVE_BULLET_COMMENT = liveAudience1;
       LiveAudienceKwaiCoinsChangeReason liveAudience2 = new LiveAudienceKwaiCoinsChangeReason("FANS_GROUP_SEND_GIFT", 2, 3);
       LiveAudienceKwaiCoinsChangeReason.FANS_GROUP_SEND_GIFT = liveAudience2;
       LiveAudienceKwaiCoinsChangeReason[] liveAudience3 = new LiveAudienceKwaiCoinsChangeReason[]{liveAudience,liveAudience1,liveAudience2};
       LiveAudienceKwaiCoinsChangeReason.$VALUES = liveAudience3;
    }
    public void LiveAudienceKwaiCoinsChangeReason(String p0,int p1,int p2){
       super(p0, p1);
       this.mReason = p2;
    }
    public static LiveAudienceKwaiCoinsChangeReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceKwaiCoinsChangeReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAudienceKwaiCoinsChangeReason.class, p0);
    }
    public static LiveAudienceKwaiCoinsChangeReason[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAudienceKwaiCoinsChangeReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceKwaiCoinsChangeReason.$VALUES.clone();
    }
}
