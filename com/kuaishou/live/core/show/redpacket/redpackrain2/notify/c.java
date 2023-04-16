package com.kuaishou.live.core.show.redpacket.redpackrain2.notify.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class c implements g	// class@000f0f
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.LIVE_RED_PACK_RAIN, "getAudienceStatus", p0);
    }
}
