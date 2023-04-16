package com.kwai.feature.api.corona.monitor.CoronaMonitorUtils$Companion$mStandardDevicePerformance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.devicepersona.config.DeviceConfigManager;
import java.lang.Integer;

public final class CoronaMonitorUtils$Companion$mStandardDevicePerformance$2 extends Lambda implements a	// class@000e18
{
    public static final CoronaMonitorUtils$Companion$mStandardDevicePerformance$2 INSTANCE;

    static {
       CoronaMonitorUtils$Companion$mStandardDevicePerformance$2.INSTANCE = new CoronaMonitorUtils$Companion$mStandardDevicePerformance$2();
    }
    public void CoronaMonitorUtils$Companion$mStandardDevicePerformance$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, CoronaMonitorUtils$Companion$mStandardDevicePerformance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return DeviceConfigManager.getInstance().getDeviceLevel("standandDevicePerformance");
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
