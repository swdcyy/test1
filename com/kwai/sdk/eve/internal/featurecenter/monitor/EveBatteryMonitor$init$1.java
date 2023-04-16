package com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor$init$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.IntentFilter;
import android.content.Context;
import com.kwai.sdk.eve.internal.featurecenter.monitor.FeatureMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor$receiver$2$1;
import android.content.BroadcastReceiver;
import android.content.Intent;

public final class EveBatteryMonitor$init$1 implements Runnable	// class@00151a
{
    public final Handler $handler;
    public final EveBatteryMonitor this$0;

    public void EveBatteryMonitor$init$1(EveBatteryMonitor p0,Handler p1){
       this.this$0 = p0;
       this.$handler = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EveBatteryMonitor$init$1.class, "1")) {
          return;
       }
       this.this$0.updateBatteryState(this.this$0.getContext().registerReceiver(this.this$0.getReceiver(), new IntentFilter("android.intent.action.BATTERY_CHANGED"), objArray, this.$handler));
       return;
    }
}
