package com.kuaishou.live.common.core.basic.heartbeat.e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class e implements g	// class@000ea9
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       b.B(LiveLogTag.CHAT, "heartBeat fail");
    }
}
