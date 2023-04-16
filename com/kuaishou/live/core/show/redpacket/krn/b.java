package com.kuaishou.live.core.show.redpacket.krn.b;
import erd.g;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.kuaishou.live.core.show.redpacket.krn.LiveKrnRedPacketFragment;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class b implements g	// class@000ed1
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       b.P(LiveLogTag.LIVE_KRN_RED_PACKET.appendTag("LiveKrnRedPacketFragment"), "adEventReport:success");
    }
}
