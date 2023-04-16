package com.kuaishou.live.common.core.component.newpendant.top.associate.config.LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder extends Enum	// class@0016bd
{
    public static final LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder[] $VALUES;
    public static final LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder HOURLY_RANK;
    public static final LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder LIVE_SQUARE;
    public static final LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder LIVE_TOPIC;
    public static final LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder VOICE_PARTY_TOPIC;

    static {
       LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder liveDefaultA = new LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder("LIVE_TOPIC", 0);
       LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder.LIVE_TOPIC = liveDefaultA;
       LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder liveDefaultA1 = new LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder("VOICE_PARTY_TOPIC", 1);
       LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder.VOICE_PARTY_TOPIC = liveDefaultA1;
       LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder liveDefaultA2 = new LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder("HOURLY_RANK", 2);
       LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder.HOURLY_RANK = liveDefaultA2;
       LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder liveDefaultA3 = new LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder("LIVE_SQUARE", 3);
       LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder.LIVE_SQUARE = liveDefaultA3;
       LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder[] liveDefaultA4 = new LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder[]{liveDefaultA,liveDefaultA1,liveDefaultA2,liveDefaultA3};
       LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder.$VALUES = liveDefaultA4;
    }
    public void LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder(String p0,int p1){
       super(p0, p1);
    }
    public static LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder.class, p0);
    }
    public static LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder[] values(){
       Object obj = PatchProxy.apply(null, null, LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder.$VALUES.clone();
    }
}
