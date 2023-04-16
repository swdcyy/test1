package com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketStage;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveRedPacketStage extends Enum	// class@000aaf
{
    public static final LiveRedPacketStage[] $VALUES;
    public static final LiveRedPacketStage RED_PACKET_COUNTDOWN;
    public static final LiveRedPacketStage RED_PACKET_GRABING;
    public static final LiveRedPacketStage RED_PACKET_RESULT;
    public static final LiveRedPacketStage RED_PACKET_SEND;

    static {
       LiveRedPacketStage liveRedPacke1;
       LiveRedPacketStage[] liveRedPacke = new LiveRedPacketStage[]{liveRedPacke1,liveRedPacke1,liveRedPacke1,liveRedPacke1};
       liveRedPacke1 = new LiveRedPacketStage("RED_PACKET_COUNTDOWN", 0);
       LiveRedPacketStage.RED_PACKET_COUNTDOWN = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketStage("RED_PACKET_GRABING", 1);
       LiveRedPacketStage.RED_PACKET_GRABING = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketStage("RED_PACKET_RESULT", 2);
       LiveRedPacketStage.RED_PACKET_RESULT = liveRedPacke1;
       liveRedPacke1 = new LiveRedPacketStage("RED_PACKET_SEND", 3);
       LiveRedPacketStage.RED_PACKET_SEND = liveRedPacke1;
       LiveRedPacketStage.$VALUES = liveRedPacke;
    }
    public void LiveRedPacketStage(String p0,int p1){
       super(p0, p1);
    }
    public static LiveRedPacketStage valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRedPacketStage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveRedPacketStage.class, p0);
    }
    public static LiveRedPacketStage[] values(){
       Object obj = PatchProxy.apply(null, null, LiveRedPacketStage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveRedPacketStage.$VALUES.clone();
    }
}
