package com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyPanelStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGzoneAccompanyPanelStyle extends Enum	// class@000b5b
{
    public static final LiveGzoneAccompanyPanelStyle[] $VALUES;
    public static final LiveGzoneAccompanyPanelStyle AUDIENCE_COMPLETE_ORDER_PANEL;
    public static final LiveGzoneAccompanyPanelStyle BEFORE_ABOARD_PANEL;
    public static final LiveGzoneAccompanyPanelStyle CLOSE;
    public static final LiveGzoneAccompanyPanelStyle FLEET_IN_PROCESS_PANEL;
    public static final LiveGzoneAccompanyPanelStyle PREPARE_ABOARD_PANEL;
    public static final LiveGzoneAccompanyPanelStyle QUEUE_SUCCESS_PANEL;
    public static final LiveGzoneAccompanyPanelStyle WAITING_START_PANEL;

    static {
       LiveGzoneAccompanyPanelStyle liveGzoneAcc = new LiveGzoneAccompanyPanelStyle("CLOSE", 0);
       LiveGzoneAccompanyPanelStyle.CLOSE = liveGzoneAcc;
       LiveGzoneAccompanyPanelStyle liveGzoneAcc1 = new LiveGzoneAccompanyPanelStyle("BEFORE_ABOARD_PANEL", 1);
       LiveGzoneAccompanyPanelStyle.BEFORE_ABOARD_PANEL = liveGzoneAcc1;
       LiveGzoneAccompanyPanelStyle liveGzoneAcc2 = new LiveGzoneAccompanyPanelStyle("QUEUE_SUCCESS_PANEL", 2);
       LiveGzoneAccompanyPanelStyle.QUEUE_SUCCESS_PANEL = liveGzoneAcc2;
       LiveGzoneAccompanyPanelStyle liveGzoneAcc3 = new LiveGzoneAccompanyPanelStyle("WAITING_START_PANEL", 3);
       LiveGzoneAccompanyPanelStyle.WAITING_START_PANEL = liveGzoneAcc3;
       LiveGzoneAccompanyPanelStyle liveGzoneAcc4 = new LiveGzoneAccompanyPanelStyle("PREPARE_ABOARD_PANEL", 4);
       LiveGzoneAccompanyPanelStyle.PREPARE_ABOARD_PANEL = liveGzoneAcc4;
       LiveGzoneAccompanyPanelStyle liveGzoneAcc5 = new LiveGzoneAccompanyPanelStyle("FLEET_IN_PROCESS_PANEL", 5);
       LiveGzoneAccompanyPanelStyle.FLEET_IN_PROCESS_PANEL = liveGzoneAcc5;
       LiveGzoneAccompanyPanelStyle liveGzoneAcc6 = new LiveGzoneAccompanyPanelStyle("AUDIENCE_COMPLETE_ORDER_PANEL", 6);
       LiveGzoneAccompanyPanelStyle.AUDIENCE_COMPLETE_ORDER_PANEL = liveGzoneAcc6;
       LiveGzoneAccompanyPanelStyle[] liveGzoneAcc7 = new LiveGzoneAccompanyPanelStyle[]{liveGzoneAcc,liveGzoneAcc1,liveGzoneAcc2,liveGzoneAcc3,liveGzoneAcc4,liveGzoneAcc5,liveGzoneAcc6};
       LiveGzoneAccompanyPanelStyle.$VALUES = liveGzoneAcc7;
    }
    public void LiveGzoneAccompanyPanelStyle(String p0,int p1){
       super(p0, p1);
    }
    public static LiveGzoneAccompanyPanelStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneAccompanyPanelStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneAccompanyPanelStyle.class, p0);
    }
    public static LiveGzoneAccompanyPanelStyle[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneAccompanyPanelStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneAccompanyPanelStyle.$VALUES.clone();
    }
}
