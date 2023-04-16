package com.kwai.performance.overhead.battery.monitor.BatteryStatusMonitor$createBatteryLowStateReceiver$1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.a;
import java.lang.String;
import zsd.u;
import com.kwai.performance.overhead.battery.monitor.BatteryStatusMonitor;
import java.util.Queue;
import java.util.Iterator;
import java.lang.Object;
import ag7.i;

public final class BatteryStatusMonitor$createBatteryLowStateReceiver$1 extends BroadcastReceiver	// class@00112c
{

    public void BatteryStatusMonitor$createBatteryLowStateReceiver$1(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       Iterator iterator;
       if (p1 == null) {
          a.L();
       }
       String action = p1.getAction();
       if (u.I1("android.intent.action.BATTERY_OKAY", action, true)) {
          iterator = BatteryStatusMonitor.a(BatteryStatusMonitor.f).iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
       }else if(u.I1("android.intent.action.BATTERY_LOW", action, true)){
          iterator = BatteryStatusMonitor.a(BatteryStatusMonitor.f).iterator();
          while (iterator.hasNext()) {
             iterator.next().b();
          }
       }
       return;
    }
}
