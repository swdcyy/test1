package com.kwai.performance.overhead.battery.monitor.BatteryMonitor$e;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor$a;
import java.lang.Object;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$Companion;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig;

public final class BatteryMonitor$e implements BatteryMonitor$a	// class@001121
{

    public void BatteryMonitor$e(){
       super();
    }
    public void onBackground(){
       BatteryMonitor iNSTANCE = BatteryMonitor.INSTANCE;
       if (iNSTANCE.isInitialized() && BatteryInfo.T.g()) {
          BatteryMonitor.access$setMIsAppInFront$p(iNSTANCE, false);
          iNSTANCE.stopFgSample();
          if (iNSTANCE.getMonitorConfig().enableBgSample != null) {
             iNSTANCE.startBgSample();
          }
       }
       return;
    }
    public void onForeground(){
       BatteryMonitor iNSTANCE = BatteryMonitor.INSTANCE;
       if (iNSTANCE.isInitialized() && BatteryInfo.T.g()) {
          BatteryMonitor.access$setMIsAppInFront$p(iNSTANCE, true);
          if (iNSTANCE.getMonitorConfig().enableBgSample != null) {
             iNSTANCE.stopBgSample();
          }
          iNSTANCE.startFgSample();
       }
       return;
    }
}
