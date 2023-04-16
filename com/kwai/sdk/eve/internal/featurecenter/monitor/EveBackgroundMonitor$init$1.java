package com.kwai.sdk.eve.internal.featurecenter.monitor.EveBackgroundMonitor$init$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBackgroundMonitor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public final class EveBackgroundMonitor$init$1 implements Runnable	// class@001514
{
    public final EveBackgroundMonitor this$0;

    public void EveBackgroundMonitor$init$1(EveBackgroundMonitor p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EveBackgroundMonitor$init$1.class, "1")) {
          return;
       }
       LifecycleOwner lifecycleOwn = ProcessLifecycleOwner.get();
       a.o(lifecycleOwn, "ProcessLifecycleOwner.get\(\)");
       lifecycleOwn.getLifecycle().addObserver(this.this$0);
       return;
    }
}
