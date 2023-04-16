package com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor$init$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.IntentFilter;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import android.content.Context;
import com.kwai.sdk.eve.internal.featurecenter.monitor.FeatureMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor$receiver$2$1;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public final class EveHeadSetMonitor$init$1 implements Runnable	// class@001521
{
    public final EveHeadSetMonitor this$0;

    public void EveHeadSetMonitor$init$1(EveHeadSetMonitor p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EveHeadSetMonitor$init$1.class, "1")) {
          return;
       }
       IntentFilter intentFilter = new IntentFilter();
       Iterator iterator = this.this$0.getActions().iterator();
       while (iterator.hasNext()) {
          intentFilter.addAction(iterator.next());
       }
       UniversalReceiver.e(this.this$0.getContext(), this.this$0.getReceiver(), intentFilter);
       this.this$0.updateHeadSetState(null);
       return;
    }
}
