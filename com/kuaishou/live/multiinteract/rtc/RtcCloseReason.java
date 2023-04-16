package com.kuaishou.live.multiinteract.rtc.RtcCloseReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RtcCloseReason extends Enum	// class@000cfc
{
    public final String description;
    public static final RtcCloseReason[] $VALUES;
    public static final RtcCloseReason ANCHOR_ARYA_STOP;
    public static final RtcCloseReason ANCHOR_HEART_BEAT_ERROR;
    public static final RtcCloseReason ANCHOR_INITIATIVE_LEAVE;
    public static final RtcCloseReason ANCHOR_READY_FAIL;
    public static final RtcCloseReason ANCHOR_SC_LEAVE_MSG;
    public static final RtcCloseReason CLOSE_HEARTBEAT_API;
    public static final RtcCloseReason REMATCH;
    public static final RtcCloseReason SC_CLOSE_MSG;
    public static final RtcCloseReason STREAM_TYPE_CHANGE;

    static {
       RtcCloseReason[] rtcCloseReas = new RtcCloseReason[9];
       RtcCloseReason rtcCloseReas1 = new RtcCloseReason("SC_CLOSE_MSG", 0, "SC_CLOSE_MSG");
       RtcCloseReason.SC_CLOSE_MSG = rtcCloseReas1;
       rtcCloseReas[0] = rtcCloseReas1;
       rtcCloseReas1 = new RtcCloseReason("STREAM_TYPE_CHANGE", 1, "STREAM_TYPE_CHANGE");
       RtcCloseReason.STREAM_TYPE_CHANGE = rtcCloseReas1;
       rtcCloseReas[1] = rtcCloseReas1;
       rtcCloseReas1 = new RtcCloseReason("REMATCH", 2, "REMATCH");
       RtcCloseReason.REMATCH = rtcCloseReas1;
       rtcCloseReas[2] = rtcCloseReas1;
       rtcCloseReas1 = new RtcCloseReason("ANCHOR_INITIATIVE_LEAVE", 3, "INITIATIVE_LEAVE");
       RtcCloseReason.ANCHOR_INITIATIVE_LEAVE = rtcCloseReas1;
       rtcCloseReas[3] = rtcCloseReas1;
       rtcCloseReas1 = new RtcCloseReason("ANCHOR_SC_LEAVE_MSG", 4, "SC_LEAVE_MSG");
       RtcCloseReason.ANCHOR_SC_LEAVE_MSG = rtcCloseReas1;
       rtcCloseReas[4] = rtcCloseReas1;
       rtcCloseReas1 = new RtcCloseReason("ANCHOR_ARYA_STOP", 5, "ARYA_STOP");
       RtcCloseReason.ANCHOR_ARYA_STOP = rtcCloseReas1;
       rtcCloseReas[5] = rtcCloseReas1;
       rtcCloseReas1 = new RtcCloseReason("ANCHOR_HEART_BEAT_ERROR", 6, "HEART_BEAT_ERROR");
       RtcCloseReason.ANCHOR_HEART_BEAT_ERROR = rtcCloseReas1;
       rtcCloseReas[6] = rtcCloseReas1;
       rtcCloseReas1 = new RtcCloseReason("ANCHOR_READY_FAIL", 7, "READY_FAIL");
       RtcCloseReason.ANCHOR_READY_FAIL = rtcCloseReas1;
       rtcCloseReas[7] = rtcCloseReas1;
       rtcCloseReas1 = new RtcCloseReason("CLOSE_HEARTBEAT_API", 8, "CLOSE_HEARTBEAT_API");
       RtcCloseReason.CLOSE_HEARTBEAT_API = rtcCloseReas1;
       rtcCloseReas[8] = rtcCloseReas1;
       RtcCloseReason.$VALUES = rtcCloseReas;
    }
    public void RtcCloseReason(String p0,int p1,String p2){
       super(p0, p1);
       this.description = p2;
    }
    public static RtcCloseReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RtcCloseReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RtcCloseReason.class, p0);
    }
    public static RtcCloseReason[] values(){
       Object obj = PatchProxy.apply(null, null, RtcCloseReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RtcCloseReason.$VALUES.clone();
    }
    public final String getDescription(){
       return this.description;
    }
}
