package com.kwai.feature.api.social.nearby.model.roampanel.RoamPanelAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RoamPanelAction extends Enum	// class@00119c
{
    public static final RoamPanelAction[] $VALUES;
    public static final RoamPanelAction IMMEDIATE_COLLAPSE;
    public static final RoamPanelAction SMOOTH_COLLAPSE;
    public static final RoamPanelAction SMOOTH_EXPAND;

    static {
       RoamPanelAction roamPanelAct = new RoamPanelAction("SMOOTH_COLLAPSE", 0);
       RoamPanelAction.SMOOTH_COLLAPSE = roamPanelAct;
       RoamPanelAction roamPanelAct1 = new RoamPanelAction("IMMEDIATE_COLLAPSE", 1);
       RoamPanelAction.IMMEDIATE_COLLAPSE = roamPanelAct1;
       RoamPanelAction roamPanelAct2 = new RoamPanelAction("SMOOTH_EXPAND", 2);
       RoamPanelAction.SMOOTH_EXPAND = roamPanelAct2;
       RoamPanelAction[] roamPanelAct3 = new RoamPanelAction[]{roamPanelAct,roamPanelAct1,roamPanelAct2};
       RoamPanelAction.$VALUES = roamPanelAct3;
    }
    public void RoamPanelAction(String p0,int p1){
       super(p0, p1);
    }
    public static RoamPanelAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RoamPanelAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RoamPanelAction.class, p0);
    }
    public static RoamPanelAction[] values(){
       Object obj = PatchProxy.apply(null, null, RoamPanelAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RoamPanelAction.$VALUES.clone();
    }
}
