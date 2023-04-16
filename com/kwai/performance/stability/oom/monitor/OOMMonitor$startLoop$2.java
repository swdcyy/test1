package com.kwai.performance.stability.oom.monitor.OOMMonitor$startLoop$2;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.performance.stability.oom.monitor.OOMMonitor$startLoop$2$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;

public final class OOMMonitor$startLoop$2 implements Runnable	// class@00124c
{
    public static final OOMMonitor$startLoop$2 b;

    static {
       OOMMonitor$startLoop$2.b = new OOMMonitor$startLoop$2();
    }
    public void OOMMonitor$startLoop$2(){
       super();
    }
    public final void run(){
       Monitor_ThreadKt.b(0, OOMMonitor$startLoop$2$1.INSTANCE, 1, null);
    }
}
