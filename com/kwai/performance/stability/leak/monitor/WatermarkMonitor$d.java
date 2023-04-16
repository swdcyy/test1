package com.kwai.performance.stability.leak.monitor.WatermarkMonitor$d;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.performance.stability.leak.monitor.WatermarkMonitor;
import java.lang.String;
import yf7.h;
import zg7.a;

public final class WatermarkMonitor$d implements Runnable	// class@001233
{
    public static final WatermarkMonitor$d b;

    static {
       WatermarkMonitor$d.b = new WatermarkMonitor$d();
    }
    public void WatermarkMonitor$d(){
       super();
    }
    public final void run(){
       WatermarkMonitor iNSTANCE = WatermarkMonitor.INSTANCE;
       if (!WatermarkMonitor.access$getMIsStart$p(iNSTANCE)) {
          h.b("WatermarkMonitor", "WatermarkMonitor already stop");
          return;
       }else {
          WatermarkMonitor.access$stopLoop$s-1481197450(iNSTANCE);
          WatermarkMonitor.access$setMAllocationOwnerDispatcher$p(iNSTANCE, null);
          iNSTANCE.nativeStop(WatermarkMonitor.access$getMNativePtr$p(iNSTANCE));
          WatermarkMonitor.access$setMNativePtr$p(iNSTANCE, 0);
          WatermarkMonitor.access$setMIsStart$p(iNSTANCE, false);
          return;
       }
    }
}
