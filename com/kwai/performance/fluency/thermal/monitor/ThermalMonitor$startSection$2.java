package com.kwai.performance.fluency.thermal.monitor.ThermalMonitor$startSection$2;
import android.os.PowerManager$OnThermalStatusChangedListener;
import java.lang.Object;
import com.kwai.performance.fluency.thermal.monitor.ThermalMonitor;
import vf7.a;
import android.app.Application;
import yf7.k;
import android.content.Context;
import java.lang.System;
import android.app.Activity;
import yf7.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.fluency.thermal.monitor.ThermalMonitorConfig;
import msd.a;
import java.util.Map;
import com.kwai.performance.fluency.thermal.monitor.ThermalMonitor$startSection$2$1;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;

public final class ThermalMonitor$startSection$2 implements PowerManager$OnThermalStatusChangedListener	// class@0010ec
{
    public static final ThermalMonitor$startSection$2 a;

    static {
       ThermalMonitor$startSection$2.a = new ThermalMonitor$startSection$2();
    }
    public void ThermalMonitor$startSection$2(){
       super();
    }
    public final void onThermalStatusChanged(int p0){
       ThermalMonitor iNSTANCE = ThermalMonitor.INSTANCE;
       if (p0 >= ThermalMonitor.access$getMLastThermalStatus$p(iNSTANCE)) {
          a uoa = new a();
          iNSTANCE.collectBatteryStat(uoa, k.b());
          uoa.lastThermalTime = ThermalMonitor.access$getMLastThermalTime$p(iNSTANCE);
          uoa.lastThermalStatus = ThermalMonitor.access$getMLastThermalStatus$p(iNSTANCE);
          uoa.currentThermalStatus = p0;
          uoa.thermalTime = System.currentTimeMillis() - ThermalMonitor.access$getMLastThermalTime$p(iNSTANCE);
          Activity uActivity = p.a(k.b());
          String simpleName = (uActivity != null)? uActivity.getClass().getSimpleName(): "";
          uoa.currentActivity = simpleName;
          uoa.extraMap.putAll(iNSTANCE.getMonitorConfig().a.invoke());
          ThermalMonitor$startSection$2$1 ostartSectio = new ThermalMonitor$startSection$2$1(uoa);
          Monitor_ThreadKt.b(0, ostartSectio, 1, null);
       }
       ThermalMonitor.access$setMLastThermalTime$p(iNSTANCE, System.currentTimeMillis());
       ThermalMonitor.access$setMLastThermalStatus$p(iNSTANCE, p0);
       return;
    }
}
