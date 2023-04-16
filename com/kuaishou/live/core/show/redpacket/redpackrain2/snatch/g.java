package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.g;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import e17.i;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class g implements g	// class@000f2a
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final void accept(Object p0){
       i.a(R.style.arg_RES_7f11066a, 0x7f102669);
       b.I(LiveLogTag.LIVE_RED_PACK_RAIN, "LiveRedPackRainPrepareSnatchComponent reserve failure", p0);
    }
}
