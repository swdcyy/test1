package com.kuaishou.live.common.core.basic.heartbeat.d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class d implements g	// class@000ea8
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       b.B(LiveLogTag.CHAT, "heartBeat fail");
    }
}
