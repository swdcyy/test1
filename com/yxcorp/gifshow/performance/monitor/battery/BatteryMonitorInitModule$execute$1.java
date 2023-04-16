package com.yxcorp.gifshow.performance.monitor.battery.BatteryMonitorInitModule$execute$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.lang.System;
import o56.d;
import java.lang.Long;
import com.kwai.component.tti.monitor.TTIData;
import java.lang.Integer;
import k2b.k2;
import k2b.u1;

public final class BatteryMonitorInitModule$execute$1 extends Lambda implements l	// class@000e55
{
    public static final BatteryMonitorInitModule$execute$1 INSTANCE;

    static {
       BatteryMonitorInitModule$execute$1.INSTANCE = new BatteryMonitorInitModule$execute$1();
    }
    public void BatteryMonitorInitModule$execute$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Map invoke(String p0){
       k2 obj = PatchProxy.applyOneRefs(p0, this, BatteryMonitorInitModule$execute$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       HashMap hashMap = new HashMap();
       hashMap.put("app_usage_time", Long.valueOf((System.currentTimeMillis() - d.h)));
       int i = 3;
       if (d.a) {
          TTIData instance = TTIData.getInstance();
          a.o(instance, "TTIData.getInstance\(\)");
          if (!instance.isOverTTITime()) {
             i = 2;
          }
       }else {
          i = 1;
       }
       hashMap.put("app_status", Integer.valueOf(i));
       obj = u1.j();
       if (obj != null) {
          obj = obj.d;
          a.o(obj, "pageRecord.mPage2");
          hashMap.put("app_log_page", obj);
       }
       return hashMap;
    }
}
