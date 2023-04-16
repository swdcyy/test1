package com.kwai.library.wolverine.elements.battery.helper.BatteryStatusMonitor;
import com.kwai.library.wolverine.elements.battery.helper.BatteryStatus;
import java.util.concurrent.ConcurrentLinkedQueue;
import com.kwai.library.wolverine.elements.battery.helper.BatteryStatusMonitor$mBatteryChangedReceiver$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.library.wolverine.elements.battery.helper.BatteryStatusMonitor$mBatteryLowStateReceiver$2;
import java.lang.Object;
import o27.b;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class BatteryStatusMonitor	// class@000ab4
{
    public static boolean a;
    public static BatteryStatus b;
    public static final ConcurrentLinkedQueue c;
    public static final p d;
    public static final p e;
    public static final BatteryStatusMonitor f;

    static {
       BatteryStatusMonitor.f = new BatteryStatusMonitor();
       BatteryStatusMonitor.b = BatteryStatus.UNKNOWN;
       BatteryStatusMonitor.c = new ConcurrentLinkedQueue();
       BatteryStatusMonitor.d = s.c(BatteryStatusMonitor$mBatteryChangedReceiver$2.INSTANCE);
       BatteryStatusMonitor.e = s.c(BatteryStatusMonitor$mBatteryLowStateReceiver$2.INSTANCE);
    }
    public void BatteryStatusMonitor(){
       super();
    }
    public static final ConcurrentLinkedQueue a(BatteryStatusMonitor p0){
       return BatteryStatusMonitor.c;
    }
    public final void b(b p0){
       a.p(p0, "listener");
       ConcurrentLinkedQueue c = BatteryStatusMonitor.c;
       if (c.contains(p0)) {
          return;
       }
       c.add(p0);
       return;
    }
    public final BatteryStatus c(){
       return BatteryStatusMonitor.b;
    }
}
