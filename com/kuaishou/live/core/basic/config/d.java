package com.kuaishou.live.core.basic.config.d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import java.lang.String;
import d61.g;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class d implements g	// class@00082d
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       b.Z(LiveLogTag.LIVE_PLAY_CONFIG, "result error: "+g.e(p0));
    }
}
