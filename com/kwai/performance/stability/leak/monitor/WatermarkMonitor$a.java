package com.kwai.performance.stability.leak.monitor.WatermarkMonitor$a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kwai.performance.stability.leak.monitor.WatermarkMonitor;
import zg7.a;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import zg7.d;

public final class WatermarkMonitor$a implements Runnable	// class@001230
{
    public final String b;

    public void WatermarkMonitor$a(String p0){
       this.b = p0;
       super();
    }
    public final void run(){
       WatermarkMonitor iNSTANCE = WatermarkMonitor.INSTANCE;
       a uoa = WatermarkMonitor.access$getMAllocationOwnerDispatcher$p(iNSTANCE);
       if (uoa != null) {
          WatermarkMonitor$a tb = this.b;
          a.q(tb, "owner");
          uoa.a(uoa.b);
          if (uoa.a.get(tb) == null) {
             uoa.a.put(tb, new ArrayList());
          }
          List list = uoa.a.get(tb);
          if (list != null) {
             long allocIndex$c = iNSTANCE.getAllocIndex$com_kwai_performance_stability_leak_monitor();
             d uod = new d(false, allocIndex$c, allocIndex$c);
             list.add(iNSTANCE);
          }
          uoa.b = tb;
       }
       return;
    }
}
