package com.kuaishou.live.core.show.redpacket.krn.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.core.show.redpacket.krn.LiveKrnRedPacketFragment;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class c implements g	// class@000ed2
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       b.y(LiveLogTag.LIVE_KRN_RED_PACKET.appendTag("LiveKrnRedPacketFragment"), "adEventReport:fail", p0);
    }
}
