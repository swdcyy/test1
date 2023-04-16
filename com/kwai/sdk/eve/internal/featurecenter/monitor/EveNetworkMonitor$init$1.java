package com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor$init$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.IntentFilter;
import android.content.Context;
import com.kwai.sdk.eve.internal.featurecenter.monitor.FeatureMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor$receiver$2$1;
import android.content.BroadcastReceiver;
import android.content.Intent;

public final class EveNetworkMonitor$init$1 implements Runnable	// class@001528
{
    public final Handler $handler;
    public final EveNetworkMonitor this$0;

    public void EveNetworkMonitor$init$1(EveNetworkMonitor p0,Handler p1){
       this.this$0 = p0;
       this.$handler = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EveNetworkMonitor$init$1.class, "1")) {
          return;
       }
       this.this$0.getContext().registerReceiver(this.this$0.getReceiver(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, this.$handler);
       this.this$0.updateNetState();
       return;
    }
}
