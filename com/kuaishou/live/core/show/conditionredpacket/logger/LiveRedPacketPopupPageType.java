package com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketPopupPageType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveRedPacketPopupPageType extends Enum	// class@000aae
{
    public final String value;
    public static final LiveRedPacketPopupPageType[] $VALUES;
    public static final LiveRedPacketPopupPageType LUCKY_USER_LIST;
    public static final LiveRedPacketPopupPageType PREPARE_PANEL;
    public static final LiveRedPacketPopupPageType RESULT_EMPTY_PANEL;
    public static final LiveRedPacketPopupPageType RESULT_ERROR_PANEL;
    public static final LiveRedPacketPopupPageType RESULT_SUCCESS_PANEL;
    public static final LiveRedPacketPopupPageType ROLLING_USER_PANEL;

    static {
       LiveRedPacketPopupPageType liveRedPacke1;
       LiveRedPacketPopupPageType[] liveRedPacke = new LiveRedPacketPopupPageType[]{liveRedPacke1,liveRedPacke1,liveRedPacke1,liveRedPacke1,liveRedPacke1,liveRedPacke1};
       liveRedPacke1 = new LiveRedPacketPopupPageType("PREPARE_PANEL", 0, "prepare");
       LiveRedPacketPopupPageType.PREPARE_PANEL = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketPopupPageType("RESULT_SUCCESS_PANEL", 1, "result_success");
       LiveRedPacketPopupPageType.RESULT_SUCCESS_PANEL = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketPopupPageType("RESULT_EMPTY_PANEL", 2, "result_fail");
       LiveRedPacketPopupPageType.RESULT_EMPTY_PANEL = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketPopupPageType("RESULT_ERROR_PANEL", 3, "result_error");
       LiveRedPacketPopupPageType.RESULT_ERROR_PANEL = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketPopupPageType("ROLLING_USER_PANEL", 4, "grab_anim");
       LiveRedPacketPopupPageType.ROLLING_USER_PANEL = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketPopupPageType("LUCKY_USER_LIST", 5, "lucky_list");
       LiveRedPacketPopupPageType.LUCKY_USER_LIST = liveRedPacke1;
       LiveRedPacketPopupPageType.$VALUES = liveRedPacke;
    }
    public void LiveRedPacketPopupPageType(String p0,int p1,String p2){
       super(p0, p1);
       this.value = p2;
    }
    public static LiveRedPacketPopupPageType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRedPacketPopupPageType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveRedPacketPopupPageType.class, p0);
    }
    public static LiveRedPacketPopupPageType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveRedPacketPopupPageType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveRedPacketPopupPageType.$VALUES.clone();
    }
    public final String getValue(){
       return this.value;
    }
}
