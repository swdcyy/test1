package com.kuaishou.live.core.show.activityredpacket.condition.LiveRedPacketReservationUtils$isQueryReservationNotifyEnable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import io7.c;

public final class LiveRedPacketReservationUtils$isQueryReservationNotifyEnable$2 extends Lambda implements a	// class@000948
{
    public static final LiveRedPacketReservationUtils$isQueryReservationNotifyEnable$2 INSTANCE;

    static {
       LiveRedPacketReservationUtils$isQueryReservationNotifyEnable$2.INSTANCE = new LiveRedPacketReservationUtils$isQueryReservationNotifyEnable$2();
    }
    public void LiveRedPacketReservationUtils$isQueryReservationNotifyEnable$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiveRedPacketReservationUtils$isQueryReservationNotifyEnable$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableLiveRedPacketReservationQueryNotify", false);
    }
}
