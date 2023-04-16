package com.kwai.performance.stability.leak.monitor.WatermarkMonitor$c;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.performance.stability.leak.monitor.WatermarkMonitor;
import java.lang.String;
import yf7.h;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.stability.leak.monitor.WatermarkMonitorConfig;
import zg7.a;

public final class WatermarkMonitor$c implements Runnable	// class@001232
{
    public static final WatermarkMonitor$c b;

    static {
       WatermarkMonitor$c.b = new WatermarkMonitor$c();
    }
    public void WatermarkMonitor$c(){
       super();
    }
    public final void run(){
       WatermarkMonitor iNSTANCE = WatermarkMonitor.INSTANCE;
       String str = "WatermarkMonitor";
       if (WatermarkMonitor.access$getMIsStart$p(iNSTANCE)) {
          h.b(str, "WatermarkMonitor already start");
          return;
       }else {
          WatermarkMonitor.access$setMNativePtr$p(iNSTANCE, iNSTANCE.nativeInit(iNSTANCE.getMonitorConfig().a, iNSTANCE.getMonitorConfig().b, iNSTANCE.getMonitorConfig().e));
          if (!WatermarkMonitor.access$getMNativePtr$p(iNSTANCE)) {
             h.b(str, "WatermarkMonitor nativeInit fail");
             return;
          }else if(!iNSTANCE.nativeStart(WatermarkMonitor.access$getMNativePtr$p(iNSTANCE))){
             h.b(str, "WatermarkMonitor nativeStart fail");
             return;
          }else {
             WatermarkMonitor.access$setMAllocationOwnerDispatcher$p(iNSTANCE, new a());
             WatermarkMonitor.access$startLoop$s-1481197450(iNSTANCE, true, false, iNSTANCE.getMonitorConfig().f);
             WatermarkMonitor.access$setMIsStart$p(iNSTANCE, true);
             return;
          }
       }
    }
}
