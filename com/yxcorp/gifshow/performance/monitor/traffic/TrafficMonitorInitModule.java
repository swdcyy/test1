package com.yxcorp.gifshow.performance.monitor.traffic.TrafficMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.traffic.TrafficMonitorInitModule$a;
import nsd.u;
import com.yxcorp.gifshow.performance.monitor.traffic.TrafficMonitorInitModule$mEnableMonitor$2;
import msd.a;
import qrd.p;
import qrd.s;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hg7.b;
import yf7.f;
import yf7.k;
import com.kwai.performance.overhead.traffic.monitor.TrafficMonitor;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import hg7.b$a;
import com.yxcorp.gifshow.performance.monitor.traffic.TrafficMonitorInitModule$b;
import kotlin.jvm.internal.a;
import java.util.concurrent.TimeUnit;

public final class TrafficMonitorInitModule extends PerformanceBaseInitModule	// class@000ec2
{
    public final p q;
    public boolean r;
    public static final TrafficMonitorInitModule$a s;

    static {
       TrafficMonitorInitModule.s = new TrafficMonitorInitModule$a(null);
    }
    public void TrafficMonitorInitModule(){
       super();
       this.q = s.c(TrafficMonitorInitModule$mEnableMonitor$2.INSTANCE);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TrafficMonitorInitModule.class, "3")) {
          return;
       }
       if (this.r != null) {
          return;
       }
       boolean b = true;
       this.r = b;
       if (!this.o0()) {
          b = false;
       }
       if (b) {
          k.a(this.p0());
          TrafficMonitor.beginTrafficMonitor();
       }
       return;
    }
    public void n(){
    }
    public final boolean o0(){
       Object obj = PatchProxy.apply(null, this, TrafficMonitorInitModule.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.q.getValue();
       }
       return obj.booleanValue();
    }
    public final b p0(){
       b$a obj = PatchProxy.apply(null, this, TrafficMonitorInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b$a();
       TrafficMonitorInitModule$b uob = new TrafficMonitorInitModule$b();
       a.q(uob, "freeTraffic");
       obj.b = uob;
       obj.a = TimeUnit.MINUTES.toMillis(5);
       return obj.a();
    }
}
