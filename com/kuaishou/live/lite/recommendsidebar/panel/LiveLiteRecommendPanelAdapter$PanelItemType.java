package com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelAdapter$PanelItemType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteRecommendPanelAdapter$PanelItemType extends Enum	// class@000aec
{
    public int mType;
    public static final LiveLiteRecommendPanelAdapter$PanelItemType[] $VALUES;
    public static final LiveLiteRecommendPanelAdapter$PanelItemType TEXT;
    public static final LiveLiteRecommendPanelAdapter$PanelItemType VIDEO_FEED;

    static {
       LiveLiteRecommendPanelAdapter$PanelItemType panelItemTyp = new LiveLiteRecommendPanelAdapter$PanelItemType("VIDEO_FEED", 0, 200);
       LiveLiteRecommendPanelAdapter$PanelItemType.VIDEO_FEED = panelItemTyp;
       LiveLiteRecommendPanelAdapter$PanelItemType panelItemTyp1 = new LiveLiteRecommendPanelAdapter$PanelItemType("TEXT", 1, 500);
       LiveLiteRecommendPanelAdapter$PanelItemType.TEXT = panelItemTyp1;
       LiveLiteRecommendPanelAdapter$PanelItemType[] panelItemTyp2 = new LiveLiteRecommendPanelAdapter$PanelItemType[]{panelItemTyp,panelItemTyp1};
       LiveLiteRecommendPanelAdapter$PanelItemType.$VALUES = panelItemTyp2;
    }
    public void LiveLiteRecommendPanelAdapter$PanelItemType(String p0,int p1,int p2){
       super(p0, p1);
       this.mType = p2;
    }
    public static LiveLiteRecommendPanelAdapter$PanelItemType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteRecommendPanelAdapter$PanelItemType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteRecommendPanelAdapter$PanelItemType.class, p0);
    }
    public static LiveLiteRecommendPanelAdapter$PanelItemType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteRecommendPanelAdapter$PanelItemType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteRecommendPanelAdapter$PanelItemType.$VALUES.clone();
    }
    public int getType(){
       return this.mType;
    }
}
