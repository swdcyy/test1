package com.kwai.performance.overhead.battery.monitor.BatteryMonitor$initSdk$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import ag7.a;
import java.util.Objects;
import org.json.JSONObject;
import java.util.TreeMap;
import java.util.Map;
import org.json.JSONArray;
import java.lang.String;
import kotlin.jvm.internal.a;
import yf7.h;
import yf7.i;
import android.app.Application;
import yf7.k;
import android.content.Context;
import ag7.a$a;
import java.lang.StringBuilder;
import ag7.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class BatteryMonitor$initSdk$1 extends Lambda implements a	// class@001125
{
    public static final BatteryMonitor$initSdk$1 INSTANCE;

    static {
       BatteryMonitor$initSdk$1.INSTANCE = new BatteryMonitor$initSdk$1();
    }
    public void BatteryMonitor$initSdk$1(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       SharedPreferences a;
       String str = "BatteryHardwareUtil";
       a f = a.f;
       Objects.requireNonNull(f);
       JSONObject jSONObject = new JSONObject();
       TreeMap treeMap = new TreeMap();
       f.e(treeMap);
       f.d(treeMap);
       jSONObject.put("gpuinfo", f.a(treeMap));
       String str1 = jSONObject.toString();
       a.h(str1, "gpuJson.toString\(\)");
       h.d(str, str1);
       str1 = jSONObject.toString();
       if (str1 != null) {
          i.a.c("battery_monitor_test_gpuinfo", str1, false);
       }
       f = a.f;
       Context baseContext = k.b().getBaseContext();
       a.h(baseContext, "MonitorManager.getApplication\(\).baseContext");
       Objects.requireNonNull(f);
       a.q(baseContext, "context");
       a$a uoa = f.b(baseContext);
       JSONObject jSONObject1 = new JSONObject();
       jSONObject1.put("status", uoa.b());
       jSONObject1.put("battery_level", uoa.a());
       jSONObject1.put("current_eve", uoa.d());
       jSONObject1.put("current_now", uoa.e());
       jSONObject1.put("charge_counter", uoa.c());
       jSONObject1.put("energy_counter", uoa.f());
       h.d(str, "BatteryMonitor batteryPropertyInfo: \n"+"Battery charge status is: "+uoa.b()+" \n"+"Remaining battery percentage is: "+uoa.a()+" \n"+"Average battery current in microamperes is: "+uoa.d()+" \n"+"Instantaneous battery current in microamperes is : "+uoa.e()+" \n "+"Battery capacity in microampere-hours is: "+uoa.c()+" \n"+"Battery remaining energy in nanowatt-hours is: "+uoa.f());
       new JSONObject().put("battery", jSONObject1);
       str1 = String.valueOf(uoa);
       if (str1 != null) {
          i.a.c("battery_monitor_test_battery", str1, false);
       }
       f = a.f;
       Objects.requireNonNull(f);
       jSONObject1 = new JSONObject();
       TreeMap treeMap1 = new TreeMap();
       f.f(treeMap1);
       jSONObject1.put("thermal", f.a(treeMap1));
       str1 = jSONObject1.toString();
       a.h(str1, "thermalJson.toString\(\)");
       h.d(str, str1);
       String str2 = jSONObject1.toString();
       if (str2 != null) {
          i.a.c("battery_monitor_test_thermal", str2, false);
       }
       Objects.requireNonNull(c.b);
       a = c.a;
       if (a == null) {
          a.S("mPreferences");
       }
       g.a(a.edit().putBoolean("gpuInfoCollected", true));
       return;
    }
}
