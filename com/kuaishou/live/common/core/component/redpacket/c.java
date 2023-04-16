package com.kuaishou.live.common.core.component.redpacket.c;
import erd.g;
import java.lang.Object;
import java.lang.Long;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import tw1.f;

public final class c implements g	// class@001752
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       p0 = b.a(0x3b1f7b44).b();
       b.c0(LiveLogTag.LIVE_RED_PACKET, "asyncNtpTime success: ", "timeDiff", p0);
       if (p0 != null) {
          f.e = p0.longValue();
       }
       return;
    }
}
