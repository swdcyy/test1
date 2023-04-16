package com.kuaishou.live.core.show.redpacket.activity.LiveRedPacketActivityManager$LiveGrabErrorReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveRedPacketActivityManager$LiveGrabErrorReason extends Enum	// class@000e4f
{
    public int mCode;
    public String mMessage;
    public static final LiveRedPacketActivityManager$LiveGrabErrorReason[] $VALUES;
    public static final LiveRedPacketActivityManager$LiveGrabErrorReason EMPTY_RED_PACKET_ID_REASON;
    public static final LiveRedPacketActivityManager$LiveGrabErrorReason GET_TOKEN_FAIL_REASON;
    public static final LiveRedPacketActivityManager$LiveGrabErrorReason GRAB_REQUEST_FAIL_REASON;
    public static final LiveRedPacketActivityManager$LiveGrabErrorReason LUCKY_USER_REASON;
    public static final LiveRedPacketActivityManager$LiveGrabErrorReason PREFETCH_TOKEN_FAIL_REASON;
    public static final LiveRedPacketActivityManager$LiveGrabErrorReason UNKNOWN_REASON;

    static {
       LiveRedPacketActivityManager$LiveGrabErrorReason liveGrabErro = new LiveRedPacketActivityManager$LiveGrabErrorReason("UNKNOWN_REASON", 0, 0, "UNKNOWN");
       LiveRedPacketActivityManager$LiveGrabErrorReason.UNKNOWN_REASON = liveGrabErro;
       LiveRedPacketActivityManager$LiveGrabErrorReason liveGrabErro1 = new LiveRedPacketActivityManager$LiveGrabErrorReason("EMPTY_RED_PACKET_ID_REASON", 1, 1, "EMPTY_RED_PACKET_ID");
       LiveRedPacketActivityManager$LiveGrabErrorReason.EMPTY_RED_PACKET_ID_REASON = liveGrabErro1;
       LiveRedPacketActivityManager$LiveGrabErrorReason liveGrabErro2 = new LiveRedPacketActivityManager$LiveGrabErrorReason("GET_TOKEN_FAIL_REASON", 2, 2, "GET_TOKEN_FAIL");
       LiveRedPacketActivityManager$LiveGrabErrorReason.GET_TOKEN_FAIL_REASON = liveGrabErro2;
       LiveRedPacketActivityManager$LiveGrabErrorReason liveGrabErro3 = new LiveRedPacketActivityManager$LiveGrabErrorReason("LUCKY_USER_REASON", 3, 3, "LUCKY_USER");
       LiveRedPacketActivityManager$LiveGrabErrorReason.LUCKY_USER_REASON = liveGrabErro3;
       LiveRedPacketActivityManager$LiveGrabErrorReason liveGrabErro4 = new LiveRedPacketActivityManager$LiveGrabErrorReason("GRAB_REQUEST_FAIL_REASON", 4, 4, "GRAB_REQUEST_FAIL");
       LiveRedPacketActivityManager$LiveGrabErrorReason.GRAB_REQUEST_FAIL_REASON = liveGrabErro4;
       LiveRedPacketActivityManager$LiveGrabErrorReason liveGrabErro5 = new LiveRedPacketActivityManager$LiveGrabErrorReason("PREFETCH_TOKEN_FAIL_REASON", 5, 5, "PREFETCH_TOKEN_FAIL");
       LiveRedPacketActivityManager$LiveGrabErrorReason.PREFETCH_TOKEN_FAIL_REASON = liveGrabErro5;
       LiveRedPacketActivityManager$LiveGrabErrorReason[] liveGrabErro6 = new LiveRedPacketActivityManager$LiveGrabErrorReason[]{liveGrabErro,liveGrabErro1,liveGrabErro2,liveGrabErro3,liveGrabErro4,liveGrabErro5};
       LiveRedPacketActivityManager$LiveGrabErrorReason.$VALUES = liveGrabErro6;
    }
    public void LiveRedPacketActivityManager$LiveGrabErrorReason(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.mMessage = p3;
       this.mCode = p2;
    }
    public static LiveRedPacketActivityManager$LiveGrabErrorReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRedPacketActivityManager$LiveGrabErrorReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveRedPacketActivityManager$LiveGrabErrorReason.class, p0);
    }
    public static LiveRedPacketActivityManager$LiveGrabErrorReason[] values(){
       Object obj = PatchProxy.apply(null, null, LiveRedPacketActivityManager$LiveGrabErrorReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveRedPacketActivityManager$LiveGrabErrorReason.$VALUES.clone();
    }
}
