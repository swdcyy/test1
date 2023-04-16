package com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService$RemoveRedPacketActionSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveActivityRedPacketService$RemoveRedPacketActionSource extends Enum	// class@000938
{
    public final String mSource;
    public static final LiveActivityRedPacketService$RemoveRedPacketActionSource[] $VALUES;
    public static final LiveActivityRedPacketService$RemoveRedPacketActionSource ADD_REDPACKET_CHECK;
    public static final LiveActivityRedPacketService$RemoveRedPacketActionSource GRAB_BTN_CLICK_FAIL;
    public static final LiveActivityRedPacketService$RemoveRedPacketActionSource GRAB_BTN_CLICK_SUCCESS;
    public static final LiveActivityRedPacketService$RemoveRedPacketActionSource TIMER_OUT_DATE;

    static {
       LiveActivityRedPacketService$RemoveRedPacketActionSource removeRedPac = new LiveActivityRedPacketService$RemoveRedPacketActionSource("GRAB_BTN_CLICK_SUCCESS", 0, "grab_btn_click_success");
       LiveActivityRedPacketService$RemoveRedPacketActionSource.GRAB_BTN_CLICK_SUCCESS = removeRedPac;
       LiveActivityRedPacketService$RemoveRedPacketActionSource removeRedPac1 = new LiveActivityRedPacketService$RemoveRedPacketActionSource("GRAB_BTN_CLICK_FAIL", 1, "grab_btn_click_fail");
       LiveActivityRedPacketService$RemoveRedPacketActionSource.GRAB_BTN_CLICK_FAIL = removeRedPac1;
       LiveActivityRedPacketService$RemoveRedPacketActionSource removeRedPac2 = new LiveActivityRedPacketService$RemoveRedPacketActionSource("ADD_REDPACKET_CHECK", 2, "add_redpacket_check");
       LiveActivityRedPacketService$RemoveRedPacketActionSource.ADD_REDPACKET_CHECK = removeRedPac2;
       LiveActivityRedPacketService$RemoveRedPacketActionSource removeRedPac3 = new LiveActivityRedPacketService$RemoveRedPacketActionSource("TIMER_OUT_DATE", 3, "timer_out_date");
       LiveActivityRedPacketService$RemoveRedPacketActionSource.TIMER_OUT_DATE = removeRedPac3;
       LiveActivityRedPacketService$RemoveRedPacketActionSource[] removeRedPac4 = new LiveActivityRedPacketService$RemoveRedPacketActionSource[]{removeRedPac,removeRedPac1,removeRedPac2,removeRedPac3};
       LiveActivityRedPacketService$RemoveRedPacketActionSource.$VALUES = removeRedPac4;
    }
    public void LiveActivityRedPacketService$RemoveRedPacketActionSource(String p0,int p1,String p2){
       super(p0, p1);
       this.mSource = p2;
    }
    public static LiveActivityRedPacketService$RemoveRedPacketActionSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveActivityRedPacketService$RemoveRedPacketActionSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveActivityRedPacketService$RemoveRedPacketActionSource.class, p0);
    }
    public static LiveActivityRedPacketService$RemoveRedPacketActionSource[] values(){
       Object obj = PatchProxy.apply(null, null, LiveActivityRedPacketService$RemoveRedPacketActionSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveActivityRedPacketService$RemoveRedPacketActionSource.$VALUES.clone();
    }
    public String getName(){
       return this.mSource;
    }
}
