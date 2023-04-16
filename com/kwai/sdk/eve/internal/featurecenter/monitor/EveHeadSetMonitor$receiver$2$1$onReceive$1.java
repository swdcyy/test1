package com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor$receiver$2$1$onReceive$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor$receiver$2$1;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor$receiver$2;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor;

public final class EveHeadSetMonitor$receiver$2$1$onReceive$1 implements Runnable	// class@001522
{
    public final Intent $intent;
    public final EveHeadSetMonitor$receiver$2$1 this$0;

    public void EveHeadSetMonitor$receiver$2$1$onReceive$1(EveHeadSetMonitor$receiver$2$1 p0,Intent p1){
       this.this$0 = p0;
       this.$intent = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EveHeadSetMonitor$receiver$2$1$onReceive$1.class, "1")) {
          return;
       }
       this.this$0.this$0.this$0.updateHeadSetState(this.$intent);
       return;
    }
}
