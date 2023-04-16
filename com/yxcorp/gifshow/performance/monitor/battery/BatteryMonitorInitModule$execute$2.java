package com.yxcorp.gifshow.performance.monitor.battery.BatteryMonitorInitModule$execute$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.content.Context;
import f3b.t;
import kotlin.jvm.internal.a;

public final class BatteryMonitorInitModule$execute$2 extends Lambda implements a	// class@000e56
{
    public static final BatteryMonitorInitModule$execute$2 INSTANCE;

    static {
       BatteryMonitorInitModule$execute$2.INSTANCE = new BatteryMonitorInitModule$execute$2();
    }
    public void BatteryMonitorInitModule$execute$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String obj = PatchProxy.apply(null, this, BatteryMonitorInitModule$execute$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = t.a(a.b());
       a.o(obj, "SocUtil.getSocName\(AppEnv.getAppContext\(\)\)");
       return obj;
    }
}
