package com.kwai.library.wolverine.elements.battery.helper.BatteryStatusMonitor$mBatteryChangedReceiver$2$1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.wolverine.elements.battery.helper.BatteryStatusMonitor;
import java.util.Objects;
import com.kwai.library.wolverine.elements.battery.helper.BatteryStatus;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import o27.b;

public final class BatteryStatusMonitor$mBatteryChangedReceiver$2$1 extends BroadcastReceiver	// class@000ab0
{

    public void BatteryStatusMonitor$mBatteryChangedReceiver$2$1(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       BatteryStatus nOT_CHARGING;
       a.p(p1, "intent");
       BatteryStatusMonitor f = BatteryStatusMonitor.f;
       int intExtra = p1.getIntExtra("status", -1);
       Objects.requireNonNull(f);
       if (intExtra != 1) {
          if (intExtra != 2) {
             if (intExtra != 3) {
                nOT_CHARGING = (intExtra != 5)? BatteryStatus.NOT_CHARGING: BatteryStatus.FULL;
             }else {
                nOT_CHARGING = BatteryStatus.DISCHARGING;
             }
          }else {
             nOT_CHARGING = BatteryStatus.CHARGING;
          }
       }else {
          nOT_CHARGING = BatteryStatus.UNKNOWN;
       }
       Objects.requireNonNull(f);
       a.p(nOT_CHARGING, "<set-?>");
       BatteryStatusMonitor.b = nOT_CHARGING;
       Iterator iterator = BatteryStatusMonitor.a(f).iterator();
       while (iterator.hasNext()) {
          iterator.next().c(BatteryStatusMonitor.f.c());
       }
       return;
    }
}
