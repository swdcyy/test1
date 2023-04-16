package com.kuaishou.live.common.core.component.redpacket.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class b implements g	// class@001751
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.LIVE_RED_PACKET, "asyncNtpTime error: ", p0);
    }
}
