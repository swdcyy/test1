package com.kwai.library.wolverine.elements.battery.helper.BatteryStatusMonitor$mBatteryLowStateReceiver$2$1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import zsd.u;
import com.kwai.library.wolverine.elements.battery.helper.BatteryStatusMonitor;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import o27.b;

public final class BatteryStatusMonitor$mBatteryLowStateReceiver$2$1 extends BroadcastReceiver	// class@000ab2
{

    public void BatteryStatusMonitor$mBatteryLowStateReceiver$2$1(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       Iterator iterator;
       a.p(p1, "intent");
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
