package com.kwai.performance.overhead.battery.monitor.BatteryStatusMonitor$createChargingStateChangeReceiver$1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.performance.overhead.battery.monitor.BatteryStatusMonitor;
import java.util.Queue;
import java.util.Iterator;
import ag7.i;
import com.kwai.performance.overhead.battery.monitor.BatteryStatusMonitor$Status;

public final class BatteryStatusMonitor$createChargingStateChangeReceiver$1 extends BroadcastReceiver	// class@00112d
{

    public void BatteryStatusMonitor$createChargingStateChangeReceiver$1(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       a.q(p0, "context");
       a.q(p1, "intent");
       BatteryStatusMonitor f = BatteryStatusMonitor.f;
       f.c(p1);
       Iterator iterator = BatteryStatusMonitor.a(f).iterator();
       while (iterator.hasNext()) {
          iterator.next().c(BatteryStatusMonitor.b);
       }
       BatteryStatusMonitor.c = p1.getIntExtra("voltage", -1);
       return;
    }
}
