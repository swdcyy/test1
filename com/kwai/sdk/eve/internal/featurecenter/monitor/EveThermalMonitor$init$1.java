package com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor$init$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.PowerManager;
import android.os.PowerManager$OnThermalStatusChangedListener;

public final class EveThermalMonitor$init$1 implements Runnable	// class@001537
{
    public final EveThermalMonitor this$0;

    public void EveThermalMonitor$init$1(EveThermalMonitor p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EveThermalMonitor$init$1.class, "1")) {
          return;
       }
       this.this$0.getPowerManager().addThermalStatusListener(this.this$0.getThermalStatusChangedListener());
       return;
    }
}
