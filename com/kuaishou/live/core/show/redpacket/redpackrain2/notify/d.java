package com.kuaishou.live.core.show.redpacket.redpackrain2.notify.d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class d implements g	// class@000f10
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.LIVE_RED_PACK_RAIN, "showEnterNotice", p0);
    }
}
