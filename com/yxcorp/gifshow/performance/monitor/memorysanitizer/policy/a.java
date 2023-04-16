package com.yxcorp.gifshow.performance.monitor.memorysanitizer.policy.a;
import swb.c;
import com.yxcorp.gifshow.performance.monitor.memorysanitizer.policy.a$a;
import nsd.u;
import java.lang.Object;
import com.kwai.sdk.switchconfig.a;
import swb.d;
import java.lang.String;
import java.lang.reflect.Type;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yf7.r;
import mwb.a;
import q87.c;
import com.yxcorp.utility.AbiUtil;
import com.yxcorp.utility.SystemUtil;
import ssd.e;
import ssd.e$a;
import usd.q;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import java.util.concurrent.ExecutorService;
import com.kwai.plugin.dva.work.WorkExecutors;
import com.yxcorp.gifshow.performance.monitor.memorysanitizer.policy.a$b;
import java.util.concurrent.Executor;
import com.kwai.plugin.dva.work.c$c;

public final class a implements c	// class@000e96
{
    public final d a;
    public static final a$a b;

    static {
       a.b = new a$a(null);
    }
    public void a(){
       super();
       d uod = v15;
       d uod1 = v15;
       uod = new d(false, 0, null, null, 0, 0, 0, 0, 0, 0, null, 0, 4095, 0);
       Object value = a.t().getValue("watermarkMonitorRemoteConfig", d.class, uod1);
       a.o(value, "SwitchConfigManager.getI¡­nitorRemoteConfig\(\)\n    \)");
       this.a = value;
    }
    public boolean a(){
       d obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (r.b()) {
          Object[] objArray = new Object[0];
          a.C().w("PLATFORM.WatermarkMonitorPolicy", this.a.toString(), objArray);
          if (this.a.enableMonitor == null) {
             return 0;
          }else if(AbiUtil.b()){
             obj = this.a.arm64SampleRatio;
          }else {
             obj = this.a.arm32SampleRatio;
          }
          if (SystemUtil.J()) {
             obj = (AbiUtil.b())? this.a.huiduArm64SampleRatio: this.a.huiduArm32SampleRatio;
          }
       label_0057 :
          if (e.b.j() - q.t(q.m(obj, 0), 0x3f800000) > 0) {
             return 0;
          }else if(!AbiUtil.b()){
             return true;
          }else {
             Object obj1 = b.a(-404437045);
             a.o(obj1, "Singleton.get\(PhoneLevelUtils::class.java\)");
             int i = obj1.c();
             d phoneLevelTh = this.a.phoneLevelThreshold;
             if (phoneLevelTh < null || (i >= 0 && phoneLevelTh >= i)) {
                return true;
             }
          }
       }
       return 0;
    }
    public void run(){
       int b;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       Dva obj = PatchProxy.apply(objArray, this, uoa, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          int i = 0;
          if (r.b()) {
             Object[] objArray1 = new Object[i];
             a.C().w("PLATFORM.WatermarkMonitorPolicy", this.a.toString(), objArray1);
             if (this.a.enableMonitor != null) {
                d arm64SampleR = (AbiUtil.b())? this.a.arm64SampleRatio: this.a.arm32SampleRatio;
                if (SystemUtil.J()) {
                   arm64SampleR = (AbiUtil.b())? this.a.huiduArm64SampleRatio: this.a.huiduArm32SampleRatio;
                }
             label_0061 :
                if (e.b.j() - q.t(q.m(arm64SampleR, 0), 0x3f800000) <= 0) {
                   if (AbiUtil.b()) {
                      Object obj1 = b.a(-404437045);
                      a.o(obj1, "Singleton.get\(PhoneLevelUtils::class.java\)");
                      b = obj1.c();
                      d phoneLevelTh = this.a.phoneLevelThreshold;
                      if (phoneLevelTh < null || (b >= 0 && phoneLevelTh >= b)) {
                      }
                   }
                }
             }
          }
       label_009c :
          b = false;
       }
       if (!b) {
          return;
       }else {
          obj = Dva.instance();
          a.o(obj, "Dva.instance\(\)");
          obj.getPluginInstallManager().j("memory_sanitizer_module").b(WorkExecutors.c(), new a$b(this));
          return;
       }
    }
}
