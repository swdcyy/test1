package com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendPanelItemType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteRecommendPanelItemType extends Enum	// class@000add
{
    public final int mType;
    public static final LiveLiteRecommendPanelItemType[] $VALUES;
    public static final LiveLiteRecommendPanelItemType Followed;
    public static final LiveLiteRecommendPanelItemType Recommend;

    static {
       LiveLiteRecommendPanelItemType liveLiteReco = new LiveLiteRecommendPanelItemType("Recommend", 0, 1);
       LiveLiteRecommendPanelItemType.Recommend = liveLiteReco;
       LiveLiteRecommendPanelItemType liveLiteReco1 = new LiveLiteRecommendPanelItemType("Followed", 1, 2);
       LiveLiteRecommendPanelItemType.Followed = liveLiteReco1;
       LiveLiteRecommendPanelItemType[] liveLiteReco2 = new LiveLiteRecommendPanelItemType[]{liveLiteReco,liveLiteReco1};
       LiveLiteRecommendPanelItemType.$VALUES = liveLiteReco2;
    }
    public void LiveLiteRecommendPanelItemType(String p0,int p1,int p2){
       super(p0, p1);
       this.mType = p2;
    }
    public static LiveLiteRecommendPanelItemType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteRecommendPanelItemType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteRecommendPanelItemType.class, p0);
    }
    public static LiveLiteRecommendPanelItemType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteRecommendPanelItemType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteRecommendPanelItemType.$VALUES.clone();
    }
}
