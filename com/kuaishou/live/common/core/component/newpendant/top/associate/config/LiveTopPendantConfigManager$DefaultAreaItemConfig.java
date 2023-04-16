package com.kuaishou.live.common.core.component.newpendant.top.associate.config.LiveTopPendantConfigManager$DefaultAreaItemConfig;
import java.lang.Enum;
import com.kuaishou.live.common.core.component.newpendant.top.associate.config.LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority;
import com.kuaishou.live.common.core.component.newpendant.top.associate.config.LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveTopPendantConfigManager$DefaultAreaItemConfig extends Enum	// class@0016bc
{
    public final int mBizId;
    public final boolean mIsAlignLeft;
    public final int mLayoutOrder;
    public final int mPriority;
    public static final LiveTopPendantConfigManager$DefaultAreaItemConfig[] $VALUES;
    public static final LiveTopPendantConfigManager$DefaultAreaItemConfig LIVE_HOURLY_RANK;
    public static final LiveTopPendantConfigManager$DefaultAreaItemConfig LIVE_SQUARE;
    public static final LiveTopPendantConfigManager$DefaultAreaItemConfig LIVE_TOPIC;
    public static final LiveTopPendantConfigManager$DefaultAreaItemConfig VOICE_PARTY_TOPIC;

    static {
       LiveTopPendantConfigManager$DefaultAreaItemConfig uDefaultArea = new LiveTopPendantConfigManager$DefaultAreaItemConfig("LIVE_HOURLY_RANK", 0, 10, LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority.HOURLY_RANK.ordinal(), LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder.HOURLY_RANK.ordinal(), true);
       LiveTopPendantConfigManager$DefaultAreaItemConfig.LIVE_HOURLY_RANK = v7;
       LiveTopPendantConfigManager$DefaultAreaItemConfig uDefaultArea1 = new LiveTopPendantConfigManager$DefaultAreaItemConfig("LIVE_TOPIC", 1, 5, LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority.LIVE_TOPIC.ordinal(), LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder.LIVE_TOPIC.ordinal(), true);
       LiveTopPendantConfigManager$DefaultAreaItemConfig.LIVE_TOPIC = uDefaultArea;
       LiveTopPendantConfigManager$DefaultAreaItemConfig uDefaultArea2 = new LiveTopPendantConfigManager$DefaultAreaItemConfig("LIVE_SQUARE", 2, 3, LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority.LIVE_SQUARE.ordinal(), LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder.LIVE_SQUARE.ordinal(), false);
       LiveTopPendantConfigManager$DefaultAreaItemConfig.LIVE_SQUARE = v1;
       uDefaultArea1 = new LiveTopPendantConfigManager$DefaultAreaItemConfig("VOICE_PARTY_TOPIC", 3, 8, LiveTopPendantConfigManager$LiveDefaultAssociatePendantBizPriority.VOICE_PARTY_TOPIC.ordinal(), LiveTopPendantConfigManager$LiveDefaultAssociateLeftPendantLayoutOrder.VOICE_PARTY_TOPIC.ordinal(), true);
       LiveTopPendantConfigManager$DefaultAreaItemConfig.VOICE_PARTY_TOPIC = v2;
       LiveTopPendantConfigManager$DefaultAreaItemConfig[] uDefaultArea3 = new LiveTopPendantConfigManager$DefaultAreaItemConfig[]{v7,uDefaultArea,v1,v2};
       LiveTopPendantConfigManager$DefaultAreaItemConfig.$VALUES = uDefaultArea3;
    }
    public void LiveTopPendantConfigManager$DefaultAreaItemConfig(String p0,int p1,int p2,int p3,int p4,boolean p5){
       super(p0, p1);
       this.mBizId = p2;
       this.mPriority = p3;
       this.mLayoutOrder = p4;
       this.mIsAlignLeft = p5;
    }
    public static LiveTopPendantConfigManager$DefaultAreaItemConfig valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveTopPendantConfigManager$DefaultAreaItemConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveTopPendantConfigManager$DefaultAreaItemConfig.class, p0);
    }
    public static LiveTopPendantConfigManager$DefaultAreaItemConfig[] values(){
       Object obj = PatchProxy.apply(null, null, LiveTopPendantConfigManager$DefaultAreaItemConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveTopPendantConfigManager$DefaultAreaItemConfig.$VALUES.clone();
    }
    public int getBizId(){
       return this.mBizId;
    }
    public int getLayoutOrder(){
       return this.mLayoutOrder;
    }
    public int getPriority(){
       return this.mPriority;
    }
    public boolean isAlignLeft(){
       return this.mIsAlignLeft;
    }
}
