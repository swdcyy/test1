package com.kuaishou.live.core.show.activityredpacket.condition.LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource extends Enum	// class@000942
{
    public static final LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource[] $VALUES;
    public static final LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource REMOTE_RETURN;
    public static final LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource USER_ACTION;

    static {
       LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource reservationC1;
       LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource[] reservationC = new LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource[]{reservationC1,reservationC1};
       reservationC1 = new LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource("USER_ACTION", 0);
       LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource.USER_ACTION = reservationC1;
       reservationC1 = new LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource("REMOTE_RETURN", 1);
       LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource.REMOTE_RETURN = reservationC1;
       LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource.$VALUES = reservationC;
    }
    public void LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource(String p0,int p1){
       super(p0, p1);
    }
    public static LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource.class, p0);
    }
    public static LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource[] values(){
       Object obj = PatchProxy.apply(null, null, LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource.$VALUES.clone();
    }
}
