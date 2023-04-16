package com.yxcorp.gifshow.performance.monitor.thread.ThreadMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.thread.ThreadMonitorInitModule$a;
import nsd.u;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import com.kwai.performance.overhead.thread.monitor.ThreadMonitor;
import com.kwai.performance.overhead.thread.monitor.ThreadMonitor$a;
import java.lang.Math;
import com.yxcorp.gifshow.performance.monitor.thread.ThreadMonitorInitModule$b;
import java.util.Objects;
import yf7.t;
import com.kwai.performance.overhead.thread.monitor.NativeHandler;
import fg7.b;
import b76.a;
import com.yxcorp.gifshow.performance.monitor.thread.ThreadMonitorInitModule$c;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public final class ThreadMonitorInitModule extends PerformanceBaseInitModule	// class@0012cd
{
    public boolean q;
    public static final ThreadMonitorInitModule$a r;

    static {
       ThreadMonitorInitModule.r = new ThreadMonitorInitModule$a(null);
    }
    public void ThreadMonitorInitModule(){
       super();
    }
    public void l0(Application p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThreadMonitorInitModule.class, "1")) {
          return;
       }
       a.p(p0, "application");
       super.l0(p0);
       if (!a.d() && (SystemUtil.N() || (!SystemUtil.I() || SystemUtil.P()))) {
          return;
       }
       ThreadMonitor$a companion = ThreadMonitor.Companion;
       if (!companion.a()) {
          return;
       }
       if (Math.random() - 0x3fb999999999999a < 0) {
          ThreadMonitorInitModule$b uob = new ThreadMonitorInitModule$b();
          Objects.requireNonNull(companion);
          a.q(uob, "iLogHelper");
          if (t.a("koom-thread")) {
             NativeHandler.getInstance().setILogHelper(uob);
             NativeHandler.getInstance().start();
             NativeHandler.getInstance().startCollect("pre_init");
          }
          this.q = true;
       }
       return;
    }
    public void n(){
    }
    public void n0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThreadMonitorInitModule.class, "2")) {
          return;
       }
       a.p(p0, "event");
       e.d(new ThreadMonitorInitModule$c(this), "ThreadMonitorLaunchFinish");
       return;
    }
}
