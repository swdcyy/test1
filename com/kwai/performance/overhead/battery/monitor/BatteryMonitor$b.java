package com.kwai.performance.overhead.battery.monitor.BatteryMonitor$b;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo;
import java.lang.String;
import com.kwai.performance.overhead.battery.monitor.a;

public final class BatteryMonitor$b implements Runnable	// class@00111e
{
    public static final BatteryMonitor$b b;

    static {
       BatteryMonitor$b.b = new BatteryMonitor$b();
    }
    public void BatteryMonitor$b(){
       super();
    }
    public final void run(){
       BatteryMonitor iNSTANCE = BatteryMonitor.INSTANCE;
       iNSTANCE.initSdk();
       a.c(BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE), "", null, false, false, 14, null);
    }
}
