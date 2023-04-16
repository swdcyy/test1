package com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent extends Enum	// class@000b2b
{
    public final String mIntent;
    public static final LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent[] $VALUES;
    public static final LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent INTENT_OPEN_LUCKY_BAG_DETAIL_PAGE;

    static {
       LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent luckyBagPend = new LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent("INTENT_OPEN_LUCKY_BAG_DETAIL_PAGE", 0, "INTENT_OPEN_LUCKY_BAG_DETAIL_PAGE");
       LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent.INTENT_OPEN_LUCKY_BAG_DETAIL_PAGE = luckyBagPend;
       LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent[] luckyBagPend1 = new LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent[]{luckyBagPend};
       LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent.$VALUES = luckyBagPend1;
    }
    public void LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent(String p0,int p1,String p2){
       super(p0, p1);
       this.mIntent = p2;
    }
    public static LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent.class, p0);
    }
    public static LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent.$VALUES.clone();
    }
    public String getIntent(){
       return this.mIntent;
    }
}
