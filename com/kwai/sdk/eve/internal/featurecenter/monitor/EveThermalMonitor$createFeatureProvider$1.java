package com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor$createFeatureProvider$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor;
import java.lang.Object;
import ml5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EveThermalMonitor$createFeatureProvider$1 extends Lambda implements a	// class@001536
{
    public final EveThermalMonitor this$0;

    public void EveThermalMonitor$createFeatureProvider$1(EveThermalMonitor p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, EveThermalMonitor$createFeatureProvider$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.this$0.thermalStatus);
    }
}
