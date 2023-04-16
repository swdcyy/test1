package com.yxcorp.gifshow.performance.monitor.appexit.AppExitMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.appexit.AppExitMonitorInitModule$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s66.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import android.os.Build$VERSION;
import jg7.a$a;
import jg7.a;
import yf7.f;
import yf7.k;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.gifshow.performance.monitor.appexit.AppExitMonitorInitModule$b;
import k2b.s1;
import b76.a;
import kotlin.jvm.internal.a;
import com.kwai.performance.stability.app.exit.monitor.AppExitMonitor;
import com.kwai.performance.monitor.base.Monitor;
import com.yxcorp.gifshow.performance.monitor.appexit.AppExitMonitorInitModule$c;
import java.lang.Runnable;
import com.kwai.framework.init.c;

public final class AppExitMonitorInitModule extends PerformanceBaseInitModule	// class@00129a
{
    public static final AppExitMonitorInitModule$a q;

    static {
       AppExitMonitorInitModule.q = new AppExitMonitorInitModule$a(null);
    }
    public void AppExitMonitorInitModule(){
       super();
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, AppExitMonitorInitModule.class, "1")) {
          return;
       }
       if (a.c()) {
          return;
       }
       if (SystemUtil.L(a.b()) && Build$VERSION.SDK_INT >= 30) {
          a$a uoa = new a$a();
          uoa.b(false);
          uoa.c(false);
          k.a(uoa.a());
          b.a(0x4b316083).T0(new AppExitMonitorInitModule$b(this));
          this.o0(null);
       }
       return;
    }
    public void n0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AppExitMonitorInitModule.class, "3")) {
          return;
       }
       a.p(p0, "event");
       if (SystemUtil.L(a.b()) && Build$VERSION.SDK_INT >= 30) {
          k.d(AppExitMonitor.class).uploadAppExitInfo();
       }
       return;
    }
    public final void o0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AppExitMonitorInitModule.class, "2")) {
          return;
       }
       if (SystemUtil.L(a.b()) && Build$VERSION.SDK_INT >= 30) {
          c.c(new AppExitMonitorInitModule$c(p0));
       }
       return;
    }
}
