package com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor$receiver$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor$receiver$2$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EveBatteryMonitor$receiver$2 extends Lambda implements a	// class@00151c
{
    public final EveBatteryMonitor this$0;

    public void EveBatteryMonitor$receiver$2(EveBatteryMonitor p0){
       this.this$0 = p0;
       super(0);
    }
    public final EveBatteryMonitor$receiver$2$1 invoke(){
       Object obj = PatchProxy.apply(null, this, EveBatteryMonitor$receiver$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EveBatteryMonitor$receiver$2$1(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
