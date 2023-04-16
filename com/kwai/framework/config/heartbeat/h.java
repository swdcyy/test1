package com.kwai.framework.config.heartbeat.h;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.config.heartbeat.HeartbeatInitModule;
import com.kwai.framework.config.heartbeat.g;

public final class h implements Runnable	// class@00150a
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void run(){
       g.b().f();
    }
}
