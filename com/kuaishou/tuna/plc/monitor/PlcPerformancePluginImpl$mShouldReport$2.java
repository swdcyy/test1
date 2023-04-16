package com.kuaishou.tuna.plc.monitor.PlcPerformancePluginImpl$mShouldReport$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class PlcPerformancePluginImpl$mShouldReport$2 extends Lambda implements a	// class@001033
{
    public static final PlcPerformancePluginImpl$mShouldReport$2 INSTANCE;

    static {
       PlcPerformancePluginImpl$mShouldReport$2.INSTANCE = new PlcPerformancePluginImpl$mShouldReport$2();
    }
    public void PlcPerformancePluginImpl$mShouldReport$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, PlcPerformancePluginImpl$mShouldReport$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.t().d("PLCMonitor", b)) {
          b = true;
       }
       return b;
    }
}
