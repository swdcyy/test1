package com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor$thermalStatusChangedListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor;
import android.os.PowerManager$OnThermalStatusChangedListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor$thermalStatusChangedListener$2$1;

public final class EveThermalMonitor$thermalStatusChangedListener$2 extends Lambda implements a	// class@00153a
{
    public final EveThermalMonitor this$0;

    public void EveThermalMonitor$thermalStatusChangedListener$2(EveThermalMonitor p0){
       this.this$0 = p0;
       super(0);
    }
    public final PowerManager$OnThermalStatusChangedListener invoke(){
       Object obj = PatchProxy.apply(null, this, EveThermalMonitor$thermalStatusChangedListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EveThermalMonitor$thermalStatusChangedListener$2$1(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
