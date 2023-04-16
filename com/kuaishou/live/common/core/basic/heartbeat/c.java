package com.kuaishou.live.common.core.basic.heartbeat.c;
import erd.g;
import java.lang.Object;
import njd.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class c implements g	// class@000ea7
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       b.Z(LiveLogTag.CHAT, "heartBeat is alive");
    }
}
