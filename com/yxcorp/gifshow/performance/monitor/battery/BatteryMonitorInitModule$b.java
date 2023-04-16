package com.yxcorp.gifshow.performance.monitor.battery.BatteryMonitorInitModule$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.performance.monitor.battery.BatteryMonitorInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.kwai.performance.overhead.battery.monitor.BatteryStatusMonitor;
import com.kwai.sdk.switchconfig.a;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import yf7.h;
import mwb.b;

public final class BatteryMonitorInitModule$b implements Runnable	// class@000e54
{
    public final BatteryMonitorInitModule b;

    public void BatteryMonitorInitModule$b(BatteryMonitorInitModule p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BatteryMonitorInitModule$b.class, "1")) {
          return;
       }
       Application uApplication = a.b();
       a.m(uApplication);
       Context applicationC = uApplication.getApplicationContext();
       a.o(applicationC, "AppEnv.getAppContext\(\)!!.applicationContext");
       BatteryStatusMonitor.b(applicationC);
       BatteryMonitorConfig value = a.t().getValue("OverheadBatteryMonitorConfig", BatteryMonitorConfig.class, objArray);
       if (value != null && value.disable == null) {
          h.d(this.b.q, "enableFunction\(\) | interval = "+value.loopInterval);
          b.l(true);
          b.k(new Gson().q(value));
       }else if(value == null){
          h.d(this.b.q, "disableFunction\(\) | config is null");
       }else {
          h.d(this.b.q, "disableFunction\(\) | config is disable");
       }
       b.l(false);
       b.k("");
       return;
    }
}
