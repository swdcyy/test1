package com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor$thermalStatusChangedListener$2$1;
import android.os.PowerManager$OnThermalStatusChangedListener;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor$thermalStatusChangedListener$2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.featurecenter.monitor.FeatureMonitor;

public final class EveThermalMonitor$thermalStatusChangedListener$2$1 implements PowerManager$OnThermalStatusChangedListener	// class@001539
{
    public final EveThermalMonitor$thermalStatusChangedListener$2 this$0;

    public void EveThermalMonitor$thermalStatusChangedListener$2$1(EveThermalMonitor$thermalStatusChangedListener$2 p0){
       this.this$0 = p0;
       super();
    }
    public final void onThermalStatusChanged(int p0){
       if (PatchProxy.isSupport(EveThermalMonitor$thermalStatusChangedListener$2$1.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EveThermalMonitor$thermalStatusChangedListener$2$1.class, "1")) {
          return;
       }
       this.this$0.this$0.thermalStatus = p0;
       EveLog.i$default("EveThermalMonitor thermalStatus change to "+this.this$0.this$0.thermalStatus, false, 2, null);
       this.this$0.this$0.notifyFeatureChange("thermal_status");
       return;
    }
}
