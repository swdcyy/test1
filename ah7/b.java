package ah7.b;
import android.app.Application$ActivityLifecycleCallbacks;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.Iterator;
import ah7.a;
import com.kwai.performance.stability.leak.monitor.LeakMonitor;
import java.lang.System;
import java.util.Map;

public final class b implements Application$ActivityLifecycleCallbacks	// class@0000cd
{
    public static final ConcurrentHashMap b;
    public static boolean c;
    public static final b d;

    static {
       b.d = new b();
       b.b = new ConcurrentHashMap();
    }
    public void b(){
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       a.q(p0, "activity");
       ConcurrentHashMap b = b.b;
       if (b.containsKey(p0.toString())) {
          return;
       }
       Iterator iterator = b.values().iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (!iterator.next().d - -1) {
                b = null;
             }
          }else {
             b = 1;
          }
          if (b) {
             b.b.clear();
             break ;
          }
          break ;
       }
       String str = p0.toString();
       a.q(str, "$this$createAllocationTagInfo");
       a uoa = new a(str);
       uoa.a = LeakMonitor.INSTANCE.getAllocationIndex$com_kwai_performance_stability_leak_monitor();
       uoa.b = System.currentTimeMillis();
       uoa.c = -1;
       uoa.d = -1;
       b.b.put(p0.toString(), uoa);
       return;
    }
    public void onActivityDestroyed(Activity p0){
       a.q(p0, "activity");
       a uoa = b.b.get(p0.toString());
       if (uoa != null) {
          a.q(uoa, "$this$end");
          uoa.c = LeakMonitor.INSTANCE.getAllocationIndex$com_kwai_performance_stability_leak_monitor();
          uoa.d = System.currentTimeMillis();
       }
       return;
    }
    public void onActivityPaused(Activity p0){
       a.q(p0, "activity");
    }
    public void onActivityResumed(Activity p0){
       a.q(p0, "activity");
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
       a.q(p0, "activity");
       a.q(p1, "outState");
    }
    public void onActivityStarted(Activity p0){
       a.q(p0, "activity");
    }
    public void onActivityStopped(Activity p0){
       a.q(p0, "activity");
    }
}
