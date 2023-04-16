package ac6.d;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.String;
import ac6.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.soc.arch.rubas.base.Rubas;
import xf6.l;
import com.kwai.framework.perf.degrade.DegradeResultReason;
import com.kwai.sdk.switchconfig.a;
import nsd.u;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import na0.g;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcorp.utility.AbiUtil;
import java.lang.Long;
import kotlin.Result;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$b;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$State;
import android.app.ActivityManager$MemoryInfo;
import android.app.Application;
import o56.a;
import android.app.ActivityManager;
import java.lang.NullPointerException;
import java.lang.Throwable;
import qrd.j0;
import com.kwai.framework.perf.degrade.DegradeScenes;
import kotlin.jvm.internal.a;
import na0.h;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map;

public final class d	// class@000070
{
    public static final ConcurrentHashMap a;
    public static boolean b;
    public static final d c;

    static {
       d.c = new d();
       d.a = new ConcurrentHashMap();
    }
    public void d(){
       super();
    }
    public static final a a(String p0){
       d c;
       boolean b;
       long l;
       boolean b1;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       ConcurrentHashMap obj1 = PatchProxy.applyOneRefs(obj, null, uod, "9");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       Rubas.g("degrade_scene", obj);
       Rubas.f("perf_degrade_check_degrade", null, null, null, 14, null);
       if (l.c("memory_force_degrade", false)) {
          return new a(true, DegradeResultReason.FORCE_DEGRADE);
       }
       int i = 2;
       if (a.t().d("disableCNYDegrade", false)) {
          return new a(false, null, i, null);
       }
       obj1 = d.a;
       if (!obj1.containsKey(obj)) {
          Log.n("PerfDegradeUtils", "internalNeedDegrade scene["+obj+"] has no config");
          Rubas.f("perf_degrade_fail_degrade_no_config", null, null, null, 14, null);
          return new a(false, null, i, null);
       }else {
          g og = obj1.get(obj);
          if (og != null) {
             if (og.forceDegrade != null) {
                Log.g("PerfDegradeUtils", "internalNeedDegrade scene["+obj+"] forceDegrade");
                Rubas.f("perf_degrade_need_degrade_force", null, null, null, 14, null);
                return new a(true, DegradeResultReason.FORCE_DEGRADE);
             }else if(og.needLowDeviceDegrade != null){
                c = d.c;
                Objects.requireNonNull(c);
                Object obj2 = PatchProxy.apply(null, c, uod, "10");
                if (obj2 != patchProxyRe) {
                   b = obj2.booleanValue();
                }else if(!AbiUtil.b() || a.t().d("isLowDevice", false)){
                   b = true;
                }else {
                   b = false;
                }
                if (b) {
                   Log.g("PerfDegradeUtils", "internalNeedDegrade scene["+obj+"] lowDeviceDegrade");
                   Rubas.f("perf_degrade_need_degrade_low_device", null, null, null, 14, null);
                   return new a(true, DegradeResultReason.LOW_DEVICE_DEGRADE);
                }
             }
             if (og.a() > 0) {
                c = d.c;
                l = (long)1024;
                long l1 = (og.a() * l) * l;
                Objects.requireNonNull(c);
                if (PatchProxy.isSupport(uod)) {
                   Object obj3 = PatchProxy.applyOneRefs(Long.valueOf(l1), c, uod, "11");
                   if (obj3 != patchProxyRe) {
                      b1 = obj3.booleanValue();
                   }else if(MemoryPressureMonitor.d.a().a == MemoryPressureMonitor$State.NORMAL_MEMORY){
                      ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
                      obj3 = a.b().getSystemService("activity");
                      if (obj3 != null) {
                         obj3.getMemoryInfo(memoryInfo);
                         Object obj4 = Result.constructor-impl(memoryInfo);
                         if (Result.isSuccess-impl(obj4)) {
                            ActivityManager$MemoryInfo availMem = obj4.availMem;
                            ActivityManager$MemoryInfo threshold = obj4.threshold;
                            Objects.requireNonNull(d.c);
                            int i1 = 0x1f400000;
                            if (threshold - i1 > 0) {
                               threshold = i1;
                            }
                            if (availMem - (threshold + l1) <= 0) {
                            label_019f :
                               b1 = false;
                            }
                         }else {
                            goto label_019f ;
                         }
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                      }
                   }
                   b1 = true;
                }else {
                   goto label_0141 ;
                }
                if (!b1) {
                   Log.g("PerfDegradeUtils", "internalNeedDegrade scene["+obj+"] memoryDegrade : "+og.a()+"MB");
                   Rubas.f("perf_degrade_need_degrade_memory", null, null, null, 14, null);
                   return new a(true, DegradeResultReason.MEMORY_DEGRADE);
                }
             }
          }
          return new a(false, null, 2, null);
       }
    }
    public static final a b(DegradeScenes p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "scene");
       return d.a(p0.getValue());
    }
    public static final a c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "scene");
       return d.a(p0);
    }
    public final void d(h p0,boolean p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uod, "4")) {
          return;
       }
       if (p1) {
          d.b = true;
       }
       if (p1 || (!d.b && p0 != null)) {
          List list = p0.a();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                g og = iterator.next();
                d.a.put(og.scene, og);
             }
          }
       }
       return;
    }
}
