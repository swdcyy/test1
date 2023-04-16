package com.yxcorp.gifshow.performance.monitor.thermal.ThermalMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.thermal.ThermalMonitorInitModule$a;
import nsd.u;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import com.kwai.performance.fluency.thermal.monitor.ThermalMonitorConfig$Builder;
import com.kwai.performance.fluency.thermal.monitor.ThermalMonitorConfig;
import yf7.f;
import yf7.k;
import com.kwai.performance.fluency.thermal.monitor.ThermalMonitor;

public final class ThermalMonitorInitModule extends PerformanceBaseInitModule	// class@000ebb
{
    public static final ThermalMonitorInitModule$a q;

    static {
       ThermalMonitorInitModule.q = new ThermalMonitorInitModule$a(null);
    }
    public void ThermalMonitorInitModule(){
       super();
    }
    public void n(){
    }
    public void n0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThermalMonitorInitModule.class, "1")) {
          return;
       }
       a.p(p0, "event");
       if (a.t().d("FluencyThermalRate", false)) {
          k.a(new ThermalMonitorConfig$Builder().a());
          ThermalMonitor.startSection();
       }
       return;
    }
}
