package com.kuaishou.live.core.show.luckystar.v2.openresult.LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType extends Enum	// class@000d05
{
    public static final LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType[] $VALUES;
    public static final LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType ADDRESS;
    public static final LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType CLOSE;
    public static final LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType GET;
    public static final LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType KNOW;
    public static final LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType VIEW_ALL;

    static {
       LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType uButtonType = new LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType("CLOSE", 0);
       LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType.CLOSE = uButtonType;
       LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType uButtonType1 = new LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType("VIEW_ALL", 1);
       LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType.VIEW_ALL = uButtonType1;
       LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType uButtonType2 = new LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType("GET", 2);
       LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType.GET = uButtonType2;
       LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType uButtonType3 = new LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType("KNOW", 3);
       LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType.KNOW = uButtonType3;
       LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType uButtonType4 = new LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType("ADDRESS", 4);
       LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType.ADDRESS = uButtonType4;
       LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType[] uButtonTypeA = new LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType[]{uButtonType,uButtonType1,uButtonType2,uButtonType3,uButtonType4};
       LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType.$VALUES = uButtonTypeA;
    }
    public void LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType.class, p0);
    }
    public static LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType.$VALUES.clone();
    }
}
