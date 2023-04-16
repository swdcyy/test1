package com.kwai.performance.overhead.battery.monitor.BatteryMonitor$c;
import android.app.Application$ActivityLifecycleCallbacks;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import java.util.List;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor;
import java.util.Map;

public final class BatteryMonitor$c implements Application$ActivityLifecycleCallbacks	// class@00111f
{
    public final BatteryMonitorConfig b;

    public void BatteryMonitor$c(BatteryMonitorConfig p0){
       this.b = p0;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       a.q(p0, "activity");
    }
    public void onActivityDestroyed(Activity p0){
       a.q(p0, "activity");
    }
    public void onActivityPaused(Activity p0){
       a.q(p0, "activity");
       String simpleName = p0.getClass().getSimpleName();
       BatteryMonitorConfig specifiedSec = this.b.specifiedSections;
       BatteryMonitor uBatteryMoni = (specifiedSec == null || specifiedSec.contains(simpleName))? 1: null;
       if (!uBatteryMoni) {
          simpleName = null;
       }
       if (simpleName != null) {
          BatteryMonitor.INSTANCE.stopSectionInner(simpleName, false, false, null);
       }
       return;
    }
    public void onActivityResumed(Activity p0){
       a.q(p0, "activity");
       String simpleName = p0.getClass().getSimpleName();
       BatteryMonitorConfig specifiedSec = this.b.specifiedSections;
       BatteryMonitor uBatteryMoni = (specifiedSec == null || specifiedSec.contains(simpleName))? 1: null;
       if (!uBatteryMoni) {
          simpleName = null;
       }
       if (simpleName != null) {
          BatteryMonitor.INSTANCE.startSectionInner(simpleName, false, false);
       }
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
       a.q(p0, "activity");
       a.q(p1, "outState");
    }
    public void onActivityStarted(Activity p0){
       a.q(p0, "activity");
    }
    public void onActivityStopped(Activity p0){
       a.q(p0, "activity");
    }
}
