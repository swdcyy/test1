package com.kwai.performance.overhead.battery.monitor.BatteryMonitor$d;
import android.os.PowerManager$OnThermalStatusChangedListener;
import java.lang.Object;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor;

public final class BatteryMonitor$d implements PowerManager$OnThermalStatusChangedListener	// class@001120
{
    public static final BatteryMonitor$d a;

    static {
       BatteryMonitor$d.a = new BatteryMonitor$d();
    }
    public void BatteryMonitor$d(){
       super();
    }
    public final void onThermalStatusChanged(int p0){
       BatteryMonitor.access$setMLastThermalStatus$p(BatteryMonitor.INSTANCE, p0);
    }
}
