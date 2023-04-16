package com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder extends Enum	// class@000fde
{
    public static final LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder[] $VALUES;
    public static final LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder BUSINESS_LARGE_SCREEN;
    public static final LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder LIVE_WIDGET_V2;
    public static final LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder PK_PROGRESS;
    public static final LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder WISH_LIST_AND_LIVE_GIFT_RAMPAGE;

    static {
       LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder liveTempPlay = new LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder("PK_PROGRESS", 0);
       LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder.PK_PROGRESS = liveTempPlay;
       LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder liveTempPlay1 = new LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder("LIVE_WIDGET_V2", 1);
       LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder.LIVE_WIDGET_V2 = liveTempPlay1;
       LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder liveTempPlay2 = new LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder("WISH_LIST_AND_LIVE_GIFT_RAMPAGE", 2);
       LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder.WISH_LIST_AND_LIVE_GIFT_RAMPAGE = liveTempPlay2;
       LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder liveTempPlay3 = new LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder("BUSINESS_LARGE_SCREEN", 3);
       LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder.BUSINESS_LARGE_SCREEN = liveTempPlay3;
       LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder[] liveTempPlay4 = new LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder[]{liveTempPlay,liveTempPlay1,liveTempPlay2,liveTempPlay3};
       LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder.$VALUES = liveTempPlay4;
    }
    public void LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder(String p0,int p1){
       super(p0, p1);
    }
    public static LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder.class, p0);
    }
    public static LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder[] values(){
       Object obj = PatchProxy.apply(null, null, LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder.$VALUES.clone();
    }
}
