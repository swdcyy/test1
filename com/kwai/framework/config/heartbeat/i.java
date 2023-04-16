package com.kwai.framework.config.heartbeat.i;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.config.heartbeat.HeartbeatInitModule;
import com.kwai.framework.config.heartbeat.g;
import com.kuaishou.gifshow.network.degrade.RequestTiming;

public final class i implements Runnable	// class@00150b
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final void run(){
       g.b().e(RequestTiming.LOGIN);
    }
}
