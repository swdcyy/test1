package com.kwai.performance.overhead.battery.monitor.BatteryStatusMonitor;
import com.kwai.performance.overhead.battery.monitor.BatteryStatusMonitor$Status;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.lang.Object;
import java.util.Queue;
import android.content.Context;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.performance.overhead.battery.monitor.BatteryStatusMonitor$createChargingStateChangeReceiver$1;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.kwai.performance.overhead.battery.monitor.BatteryStatusMonitor$createBatteryLowStateReceiver$1;
import com.kwai.performance.overhead.battery.monitor.BatteryStatusMonitor$createBatteryConnectStateReceiver$1;

public final class BatteryStatusMonitor	// class@00112e
{
    public static boolean a;
    public static BatteryStatusMonitor$Status b;
    public static int c;
    public static int d;
    public static final Queue e;
    public static final BatteryStatusMonitor f;

    static {
       BatteryStatusMonitor.f = new BatteryStatusMonitor();
       BatteryStatusMonitor.b = BatteryStatusMonitor$Status.UNKNOWN;
       BatteryStatusMonitor.c = -1;
       BatteryStatusMonitor.d = -1;
       BatteryStatusMonitor.e = new ConcurrentLinkedQueue();
    }
    public void BatteryStatusMonitor(){
       super();
    }
    public static final Queue a(BatteryStatusMonitor p0){
       return BatteryStatusMonitor.e;
    }
    public static synchronized final void b(Context p0){
       _monitor_enter(BatteryStatusMonitor.class);
       a.q(p0, "context");
       if (BatteryStatusMonitor.a) {
          _monitor_exit(BatteryStatusMonitor.class);
          return;
       }else {
          BatteryStatusMonitor f = BatteryStatusMonitor.f;
          Objects.requireNonNull(f);
          UniversalReceiver.e(p0, new BatteryStatusMonitor$createChargingStateChangeReceiver$1(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
          Objects.requireNonNull(f);
          IntentFilter intentFilter = new IntentFilter();
          intentFilter.addAction("android.intent.action.BATTERY_LOW");
          intentFilter.addAction("android.intent.action.BATTERY_OKAY");
          UniversalReceiver.e(p0, new BatteryStatusMonitor$createBatteryLowStateReceiver$1(), intentFilter);
          Objects.requireNonNull(f);
          IntentFilter intentFilter1 = new IntentFilter();
          intentFilter1.addAction("android.intent.action.ACTION_POWER_CONNECTED");
          intentFilter1.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
          UniversalReceiver.e(p0, new BatteryStatusMonitor$createBatteryConnectStateReceiver$1(), intentFilter1);
          BatteryStatusMonitor.a = true;
          _monitor_exit(BatteryStatusMonitor.class);
          return;
       }
    }
    public final void c(Intent p0){
       BatteryStatusMonitor$Status status;
       if (p0 == null) {
          BatteryStatusMonitor.b = BatteryStatusMonitor$Status.UNKNOWN;
          return;
       }else {
          int i = -1;
          int intExtra = p0.getIntExtra("status", i);
          BatteryStatusMonitor.d = p0.getIntExtra("temperature", i);
          status = 1;
          if (intExtra == status || intExtra == i) {
             BatteryStatusMonitor.b = BatteryStatusMonitor$Status.UNKNOWN;
          }else if(intExtra == 2 || intExtra == 5){
             status = null;
          }
          if (status != null) {
             status = (intExtra == 2)? BatteryStatusMonitor$Status.CHARGING: BatteryStatusMonitor$Status.FULL;
             BatteryStatusMonitor.b = status;
          }else if(intExtra == 3){
             status = BatteryStatusMonitor$Status.DISCHARGING;
          }else {
             status = BatteryStatusMonitor$Status.NOT_CHARGING;
          }
          BatteryStatusMonitor.b = status;
          return;
       }
    }
}
