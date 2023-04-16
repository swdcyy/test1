package com.kwai.performance.overhead.battery.monitor.BatteryStatusMonitor$createBatteryConnectStateReceiver$1;
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

public final class BatteryStatusMonitor$createBatteryConnectStateReceiver$1 extends BroadcastReceiver	// class@00112b
{

    public void BatteryStatusMonitor$createBatteryConnectStateReceiver$1(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       Iterator iterator;
       if (p1 == null) {
          a.L();
       }
       String action = p1.getAction();
       if (u.I1("android.intent.action.ACTION_POWER_CONNECTED", action, true)) {
          iterator = BatteryStatusMonitor.a(BatteryStatusMonitor.f).iterator();
          while (iterator.hasNext()) {
             iterator.next().d();
          }
       }else if(u.I1("android.intent.action.ACTION_POWER_DISCONNECTED", action, true)){
          iterator = BatteryStatusMonitor.a(BatteryStatusMonitor.f).iterator();
          while (iterator.hasNext()) {
             iterator.next().e();
          }
       }
       return;
    }
}
