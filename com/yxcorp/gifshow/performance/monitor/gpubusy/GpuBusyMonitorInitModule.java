package com.yxcorp.gifshow.performance.monitor.gpubusy.GpuBusyMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.gpubusy.GpuBusyMonitorInitModule$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mwb.b;
import android.content.SharedPreferences;
import com.kwai.robust.PatchProxyResult;
import cg7.a;
import cg7.a$a;
import com.yxcorp.utility.SystemUtil;
import yf7.f;
import yf7.k;
import b76.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.performance.monitor.gpubusy.GpuBusyMonitorInitModule$b;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public final class GpuBusyMonitorInitModule extends PerformanceBaseInitModule	// class@000e7e
{
    public final float q;
    public static final GpuBusyMonitorInitModule$a r;

    static {
       GpuBusyMonitorInitModule.r = new GpuBusyMonitorInitModule$a(null);
    }
    public void GpuBusyMonitorInitModule(){
       super();
       this.q = 0.35f;
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GpuBusyMonitorInitModule.class, "1")) {
          return;
       }
       if (b.a.getBoolean("GpuBusyMonitorOpen", false)) {
          a uoa = PatchProxy.apply(objArray, this, GpuBusyMonitorInitModule.class, "3");
          if (uoa != PatchProxyResult.class) {
          }else {
             a$a uoa1 = new a$a();
             uoa1.e = this.q;
             uoa1.c = 2000;
             uoa1.d = false;
             uoa1.g = SystemUtil.I();
             uoa = uoa1.a();
          }
          k.a(uoa);
       }
       return;
    }
    public void n0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GpuBusyMonitorInitModule.class, "2")) {
          return;
       }
       a.p(p0, "event");
       e.g(GpuBusyMonitorInitModule$b.b, "GpuBusy_Get_Kswitch");
       return;
    }
}
