package com.yxcorp.gifshow.performance.monitor.battery.BatteryMonitorInitModule$execute$3;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.performance.stability.crash.monitor.util.e;

public final class BatteryMonitorInitModule$execute$3 extends Lambda implements p	// class@000e57
{
    public static final BatteryMonitorInitModule$execute$3 INSTANCE;

    static {
       BatteryMonitorInitModule$execute$3.INSTANCE = new BatteryMonitorInitModule$execute$3();
    }
    public void BatteryMonitorInitModule$execute$3(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BatteryMonitorInitModule$execute$3.class, "1")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       e.v(p0, p1);
       return;
    }
}
