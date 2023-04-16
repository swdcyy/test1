package com.kuaishou.live.multiinteract.rtc.RtcLeaveReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RtcLeaveReason extends Enum	// class@000cfd
{
    public final String description;
    public static final RtcLeaveReason[] $VALUES;
    public static final RtcLeaveReason ARYA_STOP;
    public static final RtcLeaveReason HEART_BEAT_ERROR;
    public static final RtcLeaveReason INITIATIVE_LEAVE;
    public static final RtcLeaveReason READY_FAIL;
    public static final RtcLeaveReason ROOM_CLOSE_BY_HEARTBEAT_ERROR;
    public static final RtcLeaveReason SC_LEAVE_MSG;

    static {
       RtcLeaveReason rtcLeaveReas1;
       RtcLeaveReason[] rtcLeaveReas = new RtcLeaveReason[]{rtcLeaveReas1,rtcLeaveReas1,rtcLeaveReas1,rtcLeaveReas1,rtcLeaveReas1,rtcLeaveReas1};
       rtcLeaveReas1 = new RtcLeaveReason("INITIATIVE_LEAVE", 0, "INITIATIVE_LEAVE");
       RtcLeaveReason.INITIATIVE_LEAVE = rtcLeaveReas1;
       rtcLeaveReas1 = new RtcLeaveReason("SC_LEAVE_MSG", 1, "SC_LEAVE_MSG");
       RtcLeaveReason.SC_LEAVE_MSG = rtcLeaveReas1;
       rtcLeaveReas1 = new RtcLeaveReason("ARYA_STOP", 2, "ARYA_STOP");
       RtcLeaveReason.ARYA_STOP = rtcLeaveReas1;
       rtcLeaveReas1 = new RtcLeaveReason("HEART_BEAT_ERROR", 3, "HEART_BEAT_ERROR");
       RtcLeaveReason.HEART_BEAT_ERROR = rtcLeaveReas1;
       rtcLeaveReas1 = new RtcLeaveReason("ROOM_CLOSE_BY_HEARTBEAT_ERROR", 4, "ROOM_CLOSE_BY_HEARTBEAT_ERROR");
       RtcLeaveReason.ROOM_CLOSE_BY_HEARTBEAT_ERROR = rtcLeaveReas1;
       rtcLeaveReas1 = new RtcLeaveReason("READY_FAIL", 5, "READY_FAIL");
       RtcLeaveReason.READY_FAIL = rtcLeaveReas1;
       RtcLeaveReason.$VALUES = rtcLeaveReas;
    }
    public void RtcLeaveReason(String p0,int p1,String p2){
       super(p0, p1);
       this.description = p2;
    }
    public static RtcLeaveReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RtcLeaveReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RtcLeaveReason.class, p0);
    }
    public static RtcLeaveReason[] values(){
       Object obj = PatchProxy.apply(null, null, RtcLeaveReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RtcLeaveReason.$VALUES.clone();
    }
    public final String getDescription(){
       return this.description;
    }
}
