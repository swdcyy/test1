package com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor$receiver$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor$receiver$2$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EveNetworkMonitor$receiver$2 extends Lambda implements a	// class@00152a
{
    public final EveNetworkMonitor this$0;

    public void EveNetworkMonitor$receiver$2(EveNetworkMonitor p0){
       this.this$0 = p0;
       super(0);
    }
    public final EveNetworkMonitor$receiver$2$1 invoke(){
       Object obj = PatchProxy.apply(null, this, EveNetworkMonitor$receiver$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EveNetworkMonitor$receiver$2$1(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
