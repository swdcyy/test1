package com.yxcorp.gifshow.performance.monitor.memorysanitizer.MemorySanitizerInitModule$b;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import swb.a;
import com.kwai.plugin.dva.Dva;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import java.util.concurrent.ExecutorService;
import com.kwai.plugin.dva.work.WorkExecutors;
import swb.a$b;
import java.util.concurrent.Executor;
import com.kwai.plugin.dva.work.c$c;
import com.yxcorp.gifshow.performance.monitor.memorysanitizer.policy.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yf7.r;
import mwb.a;
import swb.d;
import q87.c;
import com.yxcorp.utility.AbiUtil;
import com.yxcorp.utility.SystemUtil;
import ssd.e;
import ssd.e$a;
import usd.q;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import com.yxcorp.gifshow.performance.monitor.memorysanitizer.policy.a$b;

public final class MemorySanitizerInitModule$b implements Runnable	// class@000e90
{
    public static final MemorySanitizerInitModule$b b;

    static {
       MemorySanitizerInitModule$b.b = new MemorySanitizerInitModule$b();
    }
    public void MemorySanitizerInitModule$b(){
       super();
    }
    public final void run(){
       Dva uDva;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, MemorySanitizerInitModule$b.class, str)) {
          return;
       }
       a uoa = new a();
       String str1 = "2";
       if (uoa.a()) {
          if (!PatchProxy.applyVoid(objArray, uoa, a.class, str1) && uoa.a()) {
             uDva = Dva.instance();
             a.o(uDva, "Dva.instance\(\)");
             uDva.getPluginInstallManager().j("memory_sanitizer_module").b(WorkExecutors.c(), new a$b(uoa));
          }
          return;
       }else {
          uoa = new a();
          a uoa1 = a.class;
          if (!PatchProxy.applyVoid(objArray, uoa, uoa1, str1)) {
             d obj = PatchProxy.apply(objArray, uoa, uoa1, str);
             boolean b = false;
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(r.b()){
                Object[] objArray1 = new Object[b];
                a.C().w("PLATFORM.WatermarkMonitorPolicy", uoa.a.toString(), objArray1);
                if (uoa.a.enableMonitor != null) {
                   obj = (AbiUtil.b())? uoa.a.arm64SampleRatio: uoa.a.arm32SampleRatio;
                   if (SystemUtil.J()) {
                      obj = (AbiUtil.b())? uoa.a.huiduArm64SampleRatio: uoa.a.huiduArm32SampleRatio;
                   }
                label_00ab :
                   if (e.b.j() - q.t(q.m(obj, 0), 0x3f800000) <= 0) {
                      if (AbiUtil.b()) {
                         Object obj1 = b.a(-404437045);
                         a.o(obj1, "Singleton.get\(PhoneLevelUtils::class.java\)");
                         int i = obj1.c();
                         d phoneLevelTh = uoa.a.phoneLevelThreshold;
                         if (phoneLevelTh < null || (i >= 0 && phoneLevelTh >= i)) {
                         }
                      }
                   }
                }
             }
          label_00e6 :
             if (b) {
                uDva = Dva.instance();
                a.o(uDva, "Dva.instance\(\)");
                uDva.getPluginInstallManager().j("memory_sanitizer_module").b(WorkExecutors.c(), new a$b(uoa));
             }
          }
          return;
       }
    }
}
