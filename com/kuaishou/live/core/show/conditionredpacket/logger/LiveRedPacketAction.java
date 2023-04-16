package com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveRedPacketAction extends Enum	// class@000aac
{
    public static final LiveRedPacketAction[] $VALUES;
    public static final LiveRedPacketAction RED_PACK_APPEND;
    public static final LiveRedPacketAction RED_PACK_CREATE;
    public static final LiveRedPacketAction RED_PACK_CREATE_FAIL;
    public static final LiveRedPacketAction RED_PACK_FETCH_TOKEN;
    public static final LiveRedPacketAction RED_PACK_GRAB;
    public static final LiveRedPacketAction RED_PACK_PENDANT_CLICK;
    public static final LiveRedPacketAction RED_PACK_PENDANT_SHOW;
    public static final LiveRedPacketAction RED_PACK_PENDANT_SHOW_FAIL;
    public static final LiveRedPacketAction RED_PACK_POPUP;
    public static final LiveRedPacketAction RED_PACK_POPUP_CONTAINER_DISPLAY;
    public static final LiveRedPacketAction RED_PACK_POPUP_GRAB_CLICK;
    public static final LiveRedPacketAction RED_PACK_POPUP_GRAB_SHOW;
    public static final LiveRedPacketAction RED_PACK_POPUP_RESULT_SEND_GIFT;
    public static final LiveRedPacketAction RED_PACK_POPUP_RESULT_SEND_GIFT_CLICK;
    public static final LiveRedPacketAction RED_PACK_POPUP_RESULT_SEND_GIFT_SHOW;
    public static final LiveRedPacketAction RED_PACK_RECEIVE_NEW_SIGNAL;
    public static final LiveRedPacketAction RED_PACK_SEND;
    public static final LiveRedPacketAction RED_PACK_SEND_BUTTON_CLICK;
    public static final LiveRedPacketAction RED_PACK_SEND_BUTTON_SHOW;
    public static final LiveRedPacketAction RED_PACK_SEND_PANEL_ENTRY_CLICK;
    public static final LiveRedPacketAction RED_PACK_SEND_PANEL_ENTRY_SHOW;

    static {
       LiveRedPacketAction[] liveRedPacke = new LiveRedPacketAction[21];
       LiveRedPacketAction liveRedPacke1 = new LiveRedPacketAction("RED_PACK_SEND_PANEL_ENTRY_SHOW", 0);
       LiveRedPacketAction.RED_PACK_SEND_PANEL_ENTRY_SHOW = liveRedPacke1;
       liveRedPacke[0] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_SEND_PANEL_ENTRY_CLICK", 1);
       LiveRedPacketAction.RED_PACK_SEND_PANEL_ENTRY_CLICK = liveRedPacke1;
       liveRedPacke[1] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_SEND_BUTTON_SHOW", 2);
       LiveRedPacketAction.RED_PACK_SEND_BUTTON_SHOW = liveRedPacke1;
       liveRedPacke[2] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_SEND_BUTTON_CLICK", 3);
       LiveRedPacketAction.RED_PACK_SEND_BUTTON_CLICK = liveRedPacke1;
       liveRedPacke[3] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_SEND", 4);
       LiveRedPacketAction.RED_PACK_SEND = liveRedPacke1;
       liveRedPacke[4] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_APPEND", 5);
       LiveRedPacketAction.RED_PACK_APPEND = liveRedPacke1;
       liveRedPacke[5] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_RECEIVE_NEW_SIGNAL", 6);
       LiveRedPacketAction.RED_PACK_RECEIVE_NEW_SIGNAL = liveRedPacke1;
       liveRedPacke[6] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_CREATE", 7);
       LiveRedPacketAction.RED_PACK_CREATE = liveRedPacke1;
       liveRedPacke[7] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_CREATE_FAIL", 8);
       LiveRedPacketAction.RED_PACK_CREATE_FAIL = liveRedPacke1;
       liveRedPacke[8] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_PENDANT_SHOW", 9);
       LiveRedPacketAction.RED_PACK_PENDANT_SHOW = liveRedPacke1;
       liveRedPacke[9] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_PENDANT_SHOW_FAIL", 10);
       LiveRedPacketAction.RED_PACK_PENDANT_SHOW_FAIL = liveRedPacke1;
       liveRedPacke[10] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_PENDANT_CLICK", 11);
       LiveRedPacketAction.RED_PACK_PENDANT_CLICK = liveRedPacke1;
       liveRedPacke[11] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_POPUP", 12);
       LiveRedPacketAction.RED_PACK_POPUP = liveRedPacke1;
       liveRedPacke[12] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_FETCH_TOKEN", 13);
       LiveRedPacketAction.RED_PACK_FETCH_TOKEN = liveRedPacke1;
       liveRedPacke[13] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_POPUP_GRAB_SHOW", 14);
       LiveRedPacketAction.RED_PACK_POPUP_GRAB_SHOW = liveRedPacke1;
       liveRedPacke[14] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_POPUP_GRAB_CLICK", 15);
       LiveRedPacketAction.RED_PACK_POPUP_GRAB_CLICK = liveRedPacke1;
       liveRedPacke[15] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_GRAB", 16);
       LiveRedPacketAction.RED_PACK_GRAB = liveRedPacke1;
       liveRedPacke[16] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_POPUP_RESULT_SEND_GIFT_SHOW", 17);
       LiveRedPacketAction.RED_PACK_POPUP_RESULT_SEND_GIFT_SHOW = liveRedPacke1;
       liveRedPacke[17] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_POPUP_RESULT_SEND_GIFT_CLICK", 18);
       LiveRedPacketAction.RED_PACK_POPUP_RESULT_SEND_GIFT_CLICK = liveRedPacke1;
       liveRedPacke[18] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_POPUP_RESULT_SEND_GIFT", 19);
       LiveRedPacketAction.RED_PACK_POPUP_RESULT_SEND_GIFT = liveRedPacke1;
       liveRedPacke[19] = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketAction("RED_PACK_POPUP_CONTAINER_DISPLAY", 20);
       LiveRedPacketAction.RED_PACK_POPUP_CONTAINER_DISPLAY = liveRedPacke1;
       liveRedPacke[20] = liveRedPacke1;
       LiveRedPacketAction.$VALUES = liveRedPacke;
    }
    public void LiveRedPacketAction(String p0,int p1){
       super(p0, p1);
    }
    public static LiveRedPacketAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRedPacketAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveRedPacketAction.class, p0);
    }
    public static LiveRedPacketAction[] values(){
       Object obj = PatchProxy.apply(null, null, LiveRedPacketAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveRedPacketAction.$VALUES.clone();
    }
}
