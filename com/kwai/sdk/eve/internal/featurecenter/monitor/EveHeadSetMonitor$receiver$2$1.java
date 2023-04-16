package com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor$receiver$2$1;
import android.content.BroadcastReceiver;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor$receiver$2;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.os.Handler;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor$receiver$2$1$onReceive$1;
import java.lang.Runnable;

public final class EveHeadSetMonitor$receiver$2$1 extends BroadcastReceiver	// class@001523
{
    public final EveHeadSetMonitor$receiver$2 this$0;

    public void EveHeadSetMonitor$receiver$2$1(EveHeadSetMonitor$receiver$2 p0){
       this.this$0 = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveHeadSetMonitor$receiver$2$1.class, "1")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "intent");
       if (!CollectionsKt___CollectionsKt.H1(this.this$0.this$0.getActions(), p1.getAction())) {
          return;
       }
       EveHeadSetMonitor.access$getHandler$p(this.this$0.this$0).post(new EveHeadSetMonitor$receiver$2$1$onReceive$1(this, p1));
       return;
    }
}
