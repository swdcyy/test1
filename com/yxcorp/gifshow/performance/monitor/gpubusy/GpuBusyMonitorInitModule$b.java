package com.yxcorp.gifshow.performance.monitor.gpubusy.GpuBusyMonitorInitModule$b;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import mwb.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class GpuBusyMonitorInitModule$b implements Runnable	// class@000e7d
{
    public static final GpuBusyMonitorInitModule$b b;

    static {
       GpuBusyMonitorInitModule$b.b = new GpuBusyMonitorInitModule$b();
    }
    public void GpuBusyMonitorInitModule$b(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GpuBusyMonitorInitModule$b.class, "1")) {
          return;
       }
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putBoolean("GpuBusyMonitorOpen", a.t().d("gpuBusyMonitorEnabled", false));
       g.a(uEditor);
       return;
    }
}
