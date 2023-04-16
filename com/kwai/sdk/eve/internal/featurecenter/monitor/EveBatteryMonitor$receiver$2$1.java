package com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor$receiver$2$1;
import android.content.BroadcastReceiver;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor$receiver$2;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor;

public final class EveBatteryMonitor$receiver$2$1 extends BroadcastReceiver	// class@00151b
{
    public final EveBatteryMonitor$receiver$2 this$0;

    public void EveBatteryMonitor$receiver$2$1(EveBatteryMonitor$receiver$2 p0){
       this.this$0 = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveBatteryMonitor$receiver$2$1.class, "1")) {
          return;
       }
       this.this$0.this$0.updateBatteryState(p1);
       return;
    }
}
