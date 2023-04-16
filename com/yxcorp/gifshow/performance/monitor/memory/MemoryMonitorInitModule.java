package com.yxcorp.gifshow.performance.monitor.memory.MemoryMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.memory.MemoryMonitorInitModule$a;
import nsd.u;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import mwb.b;
import android.content.SharedPreferences;
import com.kwai.performance.overhead.memory.monitor.MemoryMonitorConfig$Builder;
import com.yxcorp.gifshow.performance.monitor.memory.MemoryMonitorInitModule$onLaunchFinish$memoryConfig$1;
import kotlin.jvm.internal.a;
import com.kwai.performance.overhead.memory.monitor.MemoryMonitorConfig;
import yf7.f;
import yf7.k;
import com.kwai.sdk.switchconfig.a;
import android.app.Application;
import rwb.a;
import android.app.Application$ActivityLifecycleCallbacks;
import com.kwai.performance.overhead.memory.monitor.MemoryMonitor;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import rwb.b;
import k2b.s1;
import com.yxcorp.gifshow.performance.monitor.memory.MemoryMonitorInitModule$b;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.yxcorp.gifshow.performance.monitor.memory.MemoryMonitorInitModule$c;

public final class MemoryMonitorInitModule extends PerformanceBaseInitModule	// class@000e8e
{
    public boolean q;
    public static final MemoryMonitorInitModule$a r;

    static {
       MemoryMonitorInitModule.r = new MemoryMonitorInitModule$a(null);
    }
    public void MemoryMonitorInitModule(){
       super();
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryMonitorInitModule.class, "1")) {
          return;
       }
       if (!SystemUtil.L(a.B)) {
          return;
       }
       boolean b = false;
       if (b.a.getBoolean("PageMonitorSample", b)) {
          MemoryMonitorConfig$Builder uBuilder = new MemoryMonitorConfig$Builder();
          uBuilder.a = 500;
          MemoryMonitorInitModule$onLaunchFinish$memoryConfig$1 iNSTANCE = MemoryMonitorInitModule$onLaunchFinish$memoryConfig$1.INSTANCE;
          a.q(iNSTANCE, "customParamsInvoker");
          uBuilder.b = iNSTANCE;
          k.a(uBuilder.a());
          this.q = a.t().d("PageMemMonitorSampleResume", b);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, MemoryMonitorInitModule.class, "2")) {
             a.b().registerActivityLifecycleCallbacks(new a(this));
             ActivityContext uActivityCon = ActivityContext.g();
             a.o(uActivityCon, "ActivityContext.getInstance\(\)");
             MemoryMonitor.INSTANCE.updateCurrentSession(uActivityCon.e());
          }
          if (!PatchProxy.applyVoid(objArray, this, MemoryMonitorInitModule.class, "3")) {
             b.a(0x4b316083).T0(new b(this));
          }
       }
       e.g(MemoryMonitorInitModule$b.b, "PageMonitorKswitch");
       e.g(MemoryMonitorInitModule$c.b, "CNYMemoryDegrade");
       return;
    }
    public void n(){
    }
}
