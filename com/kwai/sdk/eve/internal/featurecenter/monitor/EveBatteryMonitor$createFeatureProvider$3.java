package com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor$createFeatureProvider$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor;
import java.lang.Object;
import ml5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EveBatteryMonitor$createFeatureProvider$3 extends Lambda implements a	// class@001519
{
    public final EveBatteryMonitor this$0;

    public void EveBatteryMonitor$createFeatureProvider$3(EveBatteryMonitor p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, EveBatteryMonitor$createFeatureProvider$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.this$0.batteryTemperature);
    }
}
