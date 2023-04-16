package com.kuaishou.live.core.show.activityredpacket.condition.LiveRedPacketReservationUtils;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.live.core.show.activityredpacket.condition.LiveRedPacketReservationUtils$isQueryReservationNotifyEnable$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;

public final class LiveRedPacketReservationUtils	// class@000949
{
    public static final p a;
    public static final LiveRedPacketReservationUtils b;

    static {
       LiveRedPacketReservationUtils.b = new LiveRedPacketReservationUtils();
       LiveRedPacketReservationUtils.a = s.b(LazyThreadSafetyMode.SYNCHRONIZED, LiveRedPacketReservationUtils$isQueryReservationNotifyEnable$2.INSTANCE);
    }
    public void LiveRedPacketReservationUtils(){
       super();
    }
}
