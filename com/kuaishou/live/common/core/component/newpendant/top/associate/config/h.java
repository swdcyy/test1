package com.kuaishou.live.common.core.component.newpendant.top.associate.config.h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class h implements g	// class@0016c7
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.LIVE_TOP_PENDANT_OPTIMIZATION, "fetch server pendant config failed", p0);
    }
}
