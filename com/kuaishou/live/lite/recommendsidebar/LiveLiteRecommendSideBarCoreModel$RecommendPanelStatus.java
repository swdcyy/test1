package com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus extends Enum	// class@000ade
{
    public static final LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus[] $VALUES;
    public static final LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus FINISH_CLOSE;
    public static final LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus FINISH_OPEN;
    public static final LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus START_CLOSE;
    public static final LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus START_OPEN;

    static {
       LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus recommendPan1;
       LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus[] recommendPan = new LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus[]{recommendPan1,recommendPan1,recommendPan1,recommendPan1};
       recommendPan1 = new LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus("START_OPEN", 0);
       LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus.START_OPEN = recommendPan1;
       recommendPan1 = new LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus("FINISH_OPEN", 1);
       LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus.FINISH_OPEN = recommendPan1;
       recommendPan1 = new LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus("START_CLOSE", 2);
       LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus.START_CLOSE = recommendPan1;
       recommendPan1 = new LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus("FINISH_CLOSE", 3);
       LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus.FINISH_CLOSE = recommendPan1;
       LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus.$VALUES = recommendPan;
    }
    public void LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus.class, p0);
    }
    public static LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus.$VALUES.clone();
    }
}
