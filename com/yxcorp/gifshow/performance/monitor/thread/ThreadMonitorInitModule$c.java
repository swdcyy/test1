package com.yxcorp.gifshow.performance.monitor.thread.ThreadMonitorInitModule$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.performance.monitor.thread.ThreadMonitorInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.utility.AbiUtil;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import fg7.g;
import fg7.h;
import java.lang.reflect.Type;
import fg7.g$a;
import yf7.r;
import java.lang.CharSequence;
import android.text.TextUtils;
import kotlin.jvm.internal.a;
import k2b.u1;
import com.yxcorp.utility.SystemUtil;
import vwb.a;
import yf7.f;
import yf7.k;
import com.kwai.performance.overhead.thread.monitor.ThreadMonitor;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.monitor.base.loop.LoopMonitor;

public final class ThreadMonitorInitModule$c implements Runnable	// class@000ebd
{
    public final ThreadMonitorInitModule b;

    public void ThreadMonitorInitModule$c(ThreadMonitorInitModule p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ThreadMonitorInitModule$c.class, "1")) {
          return;
       }
       boolean b = false;
       boolean b1 = a.t().d("thread_monitor_enabled", b);
       if (this.b.q != null || (AbiUtil.b() && b1)) {
          ThreadMonitorInitModule$c tb = this.b;
          Objects.requireNonNull(tb);
          g og = PatchProxy.apply(objArray, tb, ThreadMonitorInitModule.class, "3");
          if (og != PatchProxyResult.class) {
          }else {
             a uoa = a.t();
             boolean b2 = uoa.d("thread_monitor_native_enabled", b);
             h value = uoa.getValue("kswitch_key_thread_over_limit_config", h.class, new h());
             Objects.toString(value);
             g$a uoa1 = new g$a();
             uoa1.b = 0x3a98;
             uoa1.c = 5;
             uoa1.o = 4;
             uoa1.m = 20;
             uoa1.n = 40;
             int i = 1;
             uoa1.h = i;
             uoa1.i = 60;
             uoa1.l = value.thresholdInterval;
             uoa1.j = value.start;
             uoa1.k = value.step;
             uoa1.q = value.traceReportCountThreshold;
             uoa1.s = value.traceReportTimeMsThreshold;
             uoa1.r = value.traceReportRate;
             String str = r.a();
             if (!TextUtils.isEmpty(str)) {
                a.m(str);
                a.q(str, "procName");
                uoa1.p = str;
             }
             if (tb.q != null || b2) {
                u1.s0("thread_random_trace_launch", "monitor_launch");
                u1.s0("thread_over_limit_trace_launch", "monitor_launch");
             }else {
                uoa1.a = i;
             }
             if (SystemUtil.I()) {
                uoa1.f = i;
             }
             a uoa2 = new a();
             a.q(uoa2, "iLogHelper");
             uoa1.u = uoa2;
             og = uoa1.a();
          }
          k.a(og);
          LoopMonitor.startLoop$default(k.d(ThreadMonitor.class), false, false, 5000, 3, null);
          u1.s0("thread_over_limit_launch", "monitor_launch");
       }
       return;
    }
}
