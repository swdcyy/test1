package com.yxcorp.gifshow.performance.monitor.traffic.TrafficMonitorInitModule$mEnableMonitor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class TrafficMonitorInitModule$mEnableMonitor$2 extends Lambda implements a	// class@000ec1
{
    public static final TrafficMonitorInitModule$mEnableMonitor$2 INSTANCE;

    static {
       TrafficMonitorInitModule$mEnableMonitor$2.INSTANCE = new TrafficMonitorInitModule$mEnableMonitor$2();
    }
    public void TrafficMonitorInitModule$mEnableMonitor$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, TrafficMonitorInitModule$mEnableMonitor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("trafficMonitorEnabled", false);
    }
}