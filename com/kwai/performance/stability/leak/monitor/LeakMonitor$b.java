package com.kwai.performance.stability.leak.monitor.LeakMonitor$b;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.performance.stability.leak.monitor.LeakMonitor;
import java.lang.String;
import yf7.h;
import ah7.b;
import java.util.Objects;
import android.app.Application;
import yf7.k;
import android.app.Application$ActivityLifecycleCallbacks;
import java.util.concurrent.ConcurrentHashMap;

public final class LeakMonitor$b implements Runnable	// class@00122e
{
    public static final LeakMonitor$b b;

    static {
       LeakMonitor$b.b = new LeakMonitor$b();
    }
    public void LeakMonitor$b(){
       super();
    }
    public final void run(){
       LeakMonitor iNSTANCE = LeakMonitor.INSTANCE;
       if (!LeakMonitor.access$getMIsStart$p(iNSTANCE)) {
          h.b("NativeLeakMonitor", "LeakMonitor already stop");
          return;
       }else {
          LeakMonitor.access$setMIsStart$p(iNSTANCE, false);
          LeakMonitor.access$stopLoop$s-623650729(iNSTANCE);
          b d = b.d;
          Objects.requireNonNull(d);
          b.c = false;
          k.b().unregisterActivityLifecycleCallbacks(d);
          b.b.clear();
          LeakMonitor.nativeUninstallMonitor();
          return;
       }
    }
}
