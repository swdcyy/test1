package com.kwai.performance.stability.leak.monitor.LeakMonitor$a;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.performance.stability.leak.monitor.LeakMonitor;
import java.lang.String;
import yf7.h;
import com.kwai.performance.monitor.base.Monitor;
import zg7.b;
import ah7.b;
import java.util.Objects;
import android.app.Application;
import yf7.k;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Activity;
import yf7.p;
import android.os.Bundle;

public final class LeakMonitor$a implements Runnable	// class@00122d
{
    public final boolean b;
    public final boolean c;
    public final long d;

    public void LeakMonitor$a(boolean p0,boolean p1,long p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       LeakMonitor iNSTANCE = LeakMonitor.INSTANCE;
       String str = "NativeLeakMonitor";
       if (LeakMonitor.access$getMIsStart$p(iNSTANCE)) {
          h.b(str, "LeakMonitor already start");
          return;
       }else {
          boolean b = true;
          LeakMonitor.access$setMIsStart$p(iNSTANCE, b);
          if (!LeakMonitor.nativeInstallMonitor$default(iNSTANCE.getMonitorConfig().a, iNSTANCE.getMonitorConfig().b, false, 4, null)) {
             LeakMonitor.access$setMIsStart$p(iNSTANCE, false);
             h.b(str, "LeakMonitor Install Fail");
             return;
          }else {
             LeakMonitor.nativeSetMonitorThreshold(iNSTANCE.getMonitorConfig().e);
             b d = b.d;
             Objects.requireNonNull(d);
             if (!b.c) {
                b.c = b;
                k.b().registerActivityLifecycleCallbacks(d);
                Activity uActivity = p.a(k.b());
                if (uActivity != null) {
                   d.onActivityCreated(uActivity, null);
                }
             }
             LeakMonitor.access$startLoop$s-623650729(iNSTANCE, this.b, this.c, this.d);
             return;
          }
       }
    }
}
