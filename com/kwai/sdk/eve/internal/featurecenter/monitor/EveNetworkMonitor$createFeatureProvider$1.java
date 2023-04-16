package com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor$createFeatureProvider$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor;
import java.lang.Object;
import ml5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EveNetworkMonitor$createFeatureProvider$1 extends Lambda implements a	// class@001527
{
    public final EveNetworkMonitor this$0;

    public void EveNetworkMonitor$createFeatureProvider$1(EveNetworkMonitor p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, EveNetworkMonitor$createFeatureProvider$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.this$0.networkType);
    }
}
