package com.kwai.performance.stability.leak.monitor.WatermarkMonitor$b;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kwai.performance.stability.leak.monitor.WatermarkMonitor;
import zg7.a;

public final class WatermarkMonitor$b implements Runnable	// class@001231
{
    public final String b;

    public void WatermarkMonitor$b(String p0){
       this.b = p0;
       super();
    }
    public final void run(){
       a uoa = WatermarkMonitor.access$getMAllocationOwnerDispatcher$p(WatermarkMonitor.INSTANCE);
       if (uoa != null) {
          uoa.a(this.b);
       }
       return;
    }
}
