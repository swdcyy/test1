package com.kwai.performance.overhead.battery.monitor.a;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo;
import org.json.JSONObject;
import java.util.Map;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$Companion;
import java.lang.Float;
import org.json.JSONArray;
import java.util.ArrayList;
import java.util.Collection;
import com.kwai.performance.monitor.base.d;
import android.app.Application;
import com.kwai.performance.overhead.battery.monitor.BatteryStatusMonitor;
import android.content.Context;
import android.os.BatteryManager;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$a;
import java.lang.Math;
import android.util.Pair;
import java.lang.Number;
import trd.t0;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Long;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import com.yxcorp.utility.AbiUtil;
import msd.a;
import kotlin.TypeCastException;
import nsd.r0;
import java.util.Locale;
import java.util.Arrays;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$b;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$d;
import java.util.List;
import com.kwai.performance.overhead.battery.monitor.BatteryStatusMonitor$Status;

public final class a	// class@001133
{

    public static final int a(BatteryInfo$c p0){
       a.q(p0, "$this$checkAvgValid");
       BatteryInfo$c h = p0.h;
       if (h - (float)0 < 0) {
          return 15;
       }
       if (h - (float)100 > 0) {
          return 16;
       }
       if (p0.s < 0 || p0.u < 0) {
          return 9;
       }
       if (p0.r < 0 || p0.t < 0) {
          return 13;
       }
       return 0;
    }
    public static final void b(BatteryInfo p0,JSONObject p1,Map p2){
       long l;
       a.q(p0, "$this$fillCommon");
       a.q(p1, "uploadJsonObj");
       BatteryMonitorConfig config = BatteryMonitor.getConfig();
       p1.put("scene", p0.b);
       p1.put("pre_scene", p0.c);
       p1.put("is_fix_page", p0.d);
       p1.put("is_exact_mode", p0.f);
       p1.put("is_manual_section", p0.e);
       p1.put("cpu_jiffies_ave", p0.o);
       p1.put("process_cpu_mills", p0.p);
       p1.put("process_cpu_mills_ave", p0.o);
       double d = (double)config.loopInterval / (double)1000;
       p1.put("process_cpu_mills_ave_per_sec", (long)((double)p0.o / d));
       p1.put("total_cpu_mills_ave", p0.q);
       BatteryInfo$Companion t = BatteryInfo.T;
       p1.put("jiffies_to_ms", t.i());
       p1.put("cpu_time_file_exist", t.e());
       p1.put("max_cpu_cores", t.j());
       p1.put("cpu_max_freq_sum", t.c());
       p1.put("cpu_usage_ave", Float.valueOf(p0.i));
       p1.put("sys_cpu_usage_ave", Float.valueOf(p0.k));
       p1.put("sample_cost_usage_avg", Float.valueOf(p0.g));
       p1.put("cpu_usage_max", Float.valueOf(p0.n));
       BatteryInfo w = p0.w;
       BroadcastReceiver uBroadcastRe = null;
       JSONObject jSONObject = (w != null)? a.d(w): uBroadcastRe;
       p1.put("cpu_usage_max_item", jSONObject);
       p1.put("cpu_policy", new JSONArray(t.d()));
       p1.put("cpu_capacity", new JSONArray(t.a()));
       p1.put("device_type", t.f());
       p1.put("rx_bytes_ave", p0.s);
       p1.put("rx_bytes_ave_per_sec", (long)((double)p0.s / d));
       p1.put("tx_bytes_ave", p0.r);
       p1.put("tx_bytes_ave_per_sec", (long)((double)p0.r / d));
       Application uApplication = BatteryMonitor.getConfigCommon().a();
       String str = "context";
       a.q(uApplication, str);
       String systemServic = uApplication.getSystemService("batterymanager");
       if (systemServic != null) {
          p1.put("battery_level", systemServic.getIntProperty(4));
          p1.put("battery_temperature", BatteryStatusMonitor.d);
          a.q(uApplication, str);
          BatteryStatusMonitor.f.c(UniversalReceiver.e(uApplication, uBroadcastRe, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
          p1.put("battery_charging_state", BatteryStatusMonitor.b);
          BatteryInfo t1 = p0.t;
          if (t1 != null) {
             String str1 = "battery_amperes";
             if ((t1.a + t1.b) > 0) {
                l = (Math.abs(t1.d) + Math.abs(t1.c)) / (t1.b + t1.a);
                p1.put(str1, l);
                if (!l) {
                   p1.put("battery_amperes_discharge_total", t1.d);
                   p1.put("battery_amperes_discharge_count", t1.b);
                   p1.put("battery_amperes_charge_total", t1.c);
                   p1.put("battery_amperes_charge_count", t1.a);
                }
             }else {
                p1.put(str1, 0);
             }
             BatteryInfo$a b = t1.b;
             if (b > 0) {
                b = Math.abs((t1.d / b));
             }
             p1.put("battery_amperes_discharge", b);
             b = t1.a;
             if (b > 0) {
                l = Math.abs((t1.c / b));
             }
             p1.put("battery_amperes_charge", l);
             p1.put("battery_charging_exchange", t1.f);
          }
          if (config.reportWithThermalStatus()) {
             Pair thermalStatu = BatteryMonitor.getThermalStatus();
             Pair second = thermalStatu.second;
             a.h(second, "pair.second");
             p1.put("thermal_status", second.intValue());
             p1.put("thermal_status_format", thermalStatu.first);
          }
          JSONObject jSONObject1 = new JSONObject();
          if (p2 == null) {
             p2 = t0.z();
          }
          Iterator iterator = p2.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             systemServic = uEntry.getKey();
             jSONObject1.put(systemServic, uEntry.getValue());
          }
          p1.put("scene_custom_info", jSONObject1);
          p1.put("sample_count", p0.y);
          p1.put("use_pre_usage_count", p0.z);
          BatteryInfo d1 = p0.D;
          if (d1 != null) {
             p1.put("usage_wall_time", d1.longValue());
          }
          p0 = p0.E;
          if (p0 != null) {
             p1.put("usage_cpu_time", p0.longValue());
          }
          p1.put("loop_internal", config.loopInterval);
          p1.put("sys_cpu_loop", config.systemCpuLoop);
          p1.put("is_sys_cpu_collect", config.enableCollectSysCpu);
          p1.put("device_cpu_platform", MonitorBuildConfig.a());
          String str2 = (AbiUtil.b())? "ARM64": "ARM";
          p1.put("device_abi", str2);
          BatteryMonitorConfig socNameProvi = config.socNameProvider;
          if (socNameProvi != null) {
             p1.put("device_soc_name", socNameProvi.invoke());
          }
          return;
       }else {
          throw new TypeCastException("null cannot be cast to non-null type android.os.BatteryManager");
       }
    }
    public static void c(BatteryInfo p0,String p1,String p2,boolean p3,boolean p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = null;
       }
       if (p5 & 0x04) {
          p3 = false;
       }
       if (p5 & 0x08) {
          p4 = false;
       }
       a.q(p0, "$this$init");
       a.q(p1, "scene");
       p0.b = p1;
       p0.c = p2;
       p0.e = p3;
       p0.f = p4;
       return;
    }
    public static final JSONObject d(BatteryInfo$c p0){
       a.q(p0, "$this$toJson");
       JSONObject jSONObject = new JSONObject();
       Locale eNGLISH = Locale.ENGLISH;
       a.h(eNGLISH, "Locale.ENGLISH");
       Object[] objArray = new Object[]{Float.valueOf(p0.h)};
       String str = String.format(eNGLISH, "%.5f", Arrays.copyOf(objArray, 1));
       a.h(str, "java.lang.String.format\(locale, format, *args\)");
       jSONObject.put("cpu_usage", str);
       a.h(eNGLISH, "Locale.ENGLISH");
       objArray = new Object[]{Float.valueOf(p0.j)};
       str = String.format(eNGLISH, "%.5f", Arrays.copyOf(objArray, 1));
       a.h(str, "java.lang.String.format\(locale, format, *args\)");
       jSONObject.put("sample_cost_usage", str);
       a.h(eNGLISH, "Locale.ENGLISH");
       objArray = new Object[]{Float.valueOf(p0.g)};
       str = String.format(eNGLISH, "%.5f", Arrays.copyOf(objArray, 1));
       a.h(str, "java.lang.String.format\(locale, format, *args\)");
       jSONObject.put("sys_cpu_usage", str);
       a.h(eNGLISH, "Locale.ENGLISH");
       Object[] objArray1 = new Object[]{Float.valueOf(p0.n)};
       String str1 = String.format(eNGLISH, "%.5f", Arrays.copyOf(objArray1, 1));
       a.h(str1, "java.lang.String.format\(locale, format, *args\)");
       jSONObject.put("available_core_rate", str1);
       jSONObject.put("real_time_diff_cpu", p0.l);
       jSONObject.put("is_use_pre_usage", p0.k);
       jSONObject.put("process_cpu_mills", p0.a);
       jSONObject.put("process_cpu_mills_diff", p0.b);
       jSONObject.put("sample_thread_cpu_mills", p0.c);
       jSONObject.put("sample_thread_cpu_mills_diff", p0.d);
       jSONObject.put("total_cpu_mills", p0.e);
       jSONObject.put("total_cpu_mills_diff", p0.f);
       jSONObject.put("elapsed_realtime_diff", p0.m);
       jSONObject.put("available_core_rate", Float.valueOf(p0.n));
       jSONObject.put("cpu_freq_used", Float.valueOf(p0.o));
       jSONObject.put("cpu_state_list", new JSONArray(p0.p));
       jSONObject.put("cpu_max_freq_list", new JSONArray(p0.q));
       jSONObject.put("rx_bytes", p0.s);
       jSONObject.put("tx_bytes", p0.u);
       jSONObject.put("time_stamp", p0.v);
       return jSONObject;
    }
    public static final void e(BatteryInfo p0,BatteryInfo$b p1,BatteryInfo$c p2,BatteryInfo$d p3){
       BatteryInfo$c g;
       a.q(p0, "$this$updateSample");
       a.q(p1, "cpuData");
       a.q(p2, "sampleData");
       BatteryInfo v = p0.v;
       a.q(p1, "cpuData");
       p2.a = p1.a;
       p2.c = p1.b;
       p2.e = p1.c;
       if (p2.p.isEmpty()) {
          p2.p.addAll(p1.f);
       }
       int i = 1;
       if (p2.k != null && v != null) {
          p2.h = v.h;
          p0.z = p0.z + i;
       }
       p0.x = p1;
       p0.v = p2;
       if (p3 != null) {
          p0.A = p3;
       }
       if (p0.a == null) {
          p0.a = i;
          p0.u = p2;
          p0.y = 0;
       }else {
          p0.y = p0.y + i;
          BatteryInfo$Companion t = BatteryInfo.T;
          if (p0.F.size() >= t.k()) {
             p0.F = new ArrayList(p0.F.subList((t.k() / 2), t.k()));
          }
          p0.F.add(p2);
          BatteryInfo$c h = p2.h;
          p0.j = p0.j + h;
          p0.h = p0.h + p2.j;
          if (p3 != null) {
             g = p2.g;
             if (g > 0) {
                p0.l = p0.l + g;
                p0.m = p0.m + i;
             }
          }
          if (h - p0.n > 0) {
             p0.n = h;
             p0.w = p2;
          }
          g = p2.w;
          if (g != null) {
             long l = g.longValue();
             BatteryInfo t1 = p0.t;
             if (t1 == null) {
                t1 = new BatteryInfo$a();
             }
             BatteryStatusMonitor$Status cHARGING = ((v3 = l - null) > 0)? BatteryStatusMonitor$Status.CHARGING: BatteryStatusMonitor$Status.DISCHARGING;
             BatteryInfo$a e = t1.e;
             if (e == BatteryStatusMonitor$Status.UNKNOWN) {
                t1.e = cHARGING;
             }else if(e != cHARGING){
                t1.f = t1.f + i;
             }
             t1.e = cHARGING;
             long l1 = 1;
             if (v3 < 0) {
                t1.b = t1.b + l1;
                t1.d = t1.d + l;
             }else {
                t1.a = t1.a + l1;
                t1.c = t1.c + l;
             }
             p0.t = t1;
          }
       }
       return;
    }
}
