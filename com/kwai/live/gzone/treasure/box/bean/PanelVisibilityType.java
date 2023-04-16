package com.kwai.live.gzone.treasure.box.bean.PanelVisibilityType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PanelVisibilityType extends Enum	// class@000e25
{
    public final int value;
    public static final PanelVisibilityType[] $VALUES;
    public static final PanelVisibilityType PANEL_FLAG_NEW_LIVE_ACTIVITY_TAB;
    public static final PanelVisibilityType PANEL_FLAG_NEW_LIVE_LANDSCAPE_POPUP;
    public static final PanelVisibilityType PANEL_FLAG_NEW_LIVE_PORTRAIT_POPUP;
    public static final PanelVisibilityType PANEL_FLAG_OLD_LIVE_LANDSCAPE_POPUP;
    public static final PanelVisibilityType PANEL_FLAG_OLD_LIVE_PORTRAIT_POPUP;

    static {
       PanelVisibilityType panelVisibil1;
       PanelVisibilityType[] panelVisibil = new PanelVisibilityType[]{panelVisibil1,panelVisibil1,panelVisibil1,panelVisibil1,panelVisibil1};
       panelVisibil1 = new PanelVisibilityType("PANEL_FLAG_OLD_LIVE_LANDSCAPE_POPUP", 0, 1);
       PanelVisibilityType.PANEL_FLAG_OLD_LIVE_LANDSCAPE_POPUP = panelVisibil1;
       panelVisibil1 = new PanelVisibilityType("PANEL_FLAG_OLD_LIVE_PORTRAIT_POPUP", 1, 2);
       PanelVisibilityType.PANEL_FLAG_OLD_LIVE_PORTRAIT_POPUP = panelVisibil1;
       panelVisibil1 = new PanelVisibilityType("PANEL_FLAG_NEW_LIVE_ACTIVITY_TAB", 2, 3);
       PanelVisibilityType.PANEL_FLAG_NEW_LIVE_ACTIVITY_TAB = panelVisibil1;
       panelVisibil1 = new PanelVisibilityType("PANEL_FLAG_NEW_LIVE_LANDSCAPE_POPUP", 3, 4);
       PanelVisibilityType.PANEL_FLAG_NEW_LIVE_LANDSCAPE_POPUP = panelVisibil1;
       panelVisibil1 = new PanelVisibilityType("PANEL_FLAG_NEW_LIVE_PORTRAIT_POPUP", 4, 5);
       PanelVisibilityType.PANEL_FLAG_NEW_LIVE_PORTRAIT_POPUP = panelVisibil1;
       PanelVisibilityType.$VALUES = panelVisibil;
    }
    public void PanelVisibilityType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static PanelVisibilityType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PanelVisibilityType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PanelVisibilityType.class, p0);
    }
    public static PanelVisibilityType[] values(){
       Object obj = PatchProxy.apply(null, null, PanelVisibilityType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PanelVisibilityType.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
