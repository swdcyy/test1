package com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor$receiver$2$1;
import android.content.BroadcastReceiver;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor$receiver$2;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor;

public final class EveNetworkMonitor$receiver$2$1 extends BroadcastReceiver	// class@001529
{
    public final EveNetworkMonitor$receiver$2 this$0;

    public void EveNetworkMonitor$receiver$2$1(EveNetworkMonitor$receiver$2 p0){
       this.this$0 = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveNetworkMonitor$receiver$2$1.class, "1")) {
          return;
       }
       this.this$0.this$0.updateNetState();
       return;
    }
}
