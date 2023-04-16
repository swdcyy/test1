package com.kwai.performance.stability.crash.monitor.LifecycleCallbacksHandler;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.StringBuilder;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.List;
import vg7.d;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import com.kwai.performance.stability.crash.monitor.LifecycleCallbacksHandler$LifeCycle;
import android.app.Activity;
import android.os.Bundle;
import com.kwai.performance.stability.crash.monitor.LifecycleCallbacksHandler$recordActivityLifeCycleLog$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import java.lang.Integer;
import yf7.r;
import msd.l;

public final class LifecycleCallbacksHandler implements Application$ActivityLifecycleCallbacks	// class@000deb
{
    public static final LifecycleCallbacksHandler b;
    public static boolean c;
    public static final StringBuilder d;
    public static final LinkedHashMap e;
    public static l f;
    public static final List g;

    static {
       LifecycleCallbacksHandler.b = new LifecycleCallbacksHandler();
       LifecycleCallbacksHandler.d = "";
       LifecycleCallbacksHandler.e = new LinkedHashMap();
       LifecycleCallbacksHandler.g = new ArrayList();
    }
    public void LifecycleCallbacksHandler(){
       super();
    }
    public static final String a(){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = LifecycleCallbacksHandler.e.entrySet().iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().getValue());
       }
       String str = d.j.q(uArrayList);
       a.o(str, "RAW_GSON.toJson\(result\)");
       return str;
    }
    public static final List b(){
       return LifecycleCallbacksHandler.g;
    }
    public static void d(LifecycleCallbacksHandler p0,LifecycleCallbacksHandler$LifeCycle p1,Activity p2,Bundle p3,boolean p4,int p5,Object p6){
       if (p5 & 0x08) {
          p4 = false;
       }
       p0.c(p1, p2, null, p4);
       return;
    }
    public final void c(LifecycleCallbacksHandler$LifeCycle p0,Activity p1,Bundle p2,boolean p3){
       Monitor_ThreadKt.b(0, new LifecycleCallbacksHandler$recordActivityLifeCycleLog$1(p1, p0, p3, p2), 1, null);
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       a.p(p0, "activity");
       String localClassNa = p0.getLocalClassName();
       a.o(localClassNa, "activity.localClassName");
       LifecycleCallbacksHandler.e.put(Integer.valueOf(p0.hashCode()), localClassNa);
       this.c(LifecycleCallbacksHandler$LifeCycle.onActivityCreated, p0, p1, true);
       if (!LifecycleCallbacksHandler.c && r.b()) {
          LifecycleCallbacksHandler.c = true;
          l f = LifecycleCallbacksHandler.f;
          if (f != null) {
             f.invoke(p0);
          }
       }
       return;
    }
    public void onActivityDestroyed(Activity p0){
       a.p(p0, "activity");
       LifecycleCallbacksHandler.e.remove(Integer.valueOf(p0.hashCode()));
       LifecycleCallbacksHandler.d(this, LifecycleCallbacksHandler$LifeCycle.onActivityDestroyed, p0, null, false, 12, null);
    }
    public void onActivityPaused(Activity p0){
       a.p(p0, "activity");
       LifecycleCallbacksHandler.d(this, LifecycleCallbacksHandler$LifeCycle.onActivityPaused, p0, null, false, 12, null);
    }
    public void onActivityResumed(Activity p0){
       a.p(p0, "activity");
       LifecycleCallbacksHandler.d(this, LifecycleCallbacksHandler$LifeCycle.onActivityResumed, p0, null, false, 12, null);
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
       a.p(p0, "activity");
       a.p(p1, "outState");
       this.c(LifecycleCallbacksHandler$LifeCycle.onActivitySaveInstanceState, p0, p1, true);
    }
    public void onActivityStarted(Activity p0){
       a.p(p0, "activity");
       LifecycleCallbacksHandler.d(this, LifecycleCallbacksHandler$LifeCycle.onActivityStarted, p0, null, false, 12, null);
    }
    public void onActivityStopped(Activity p0){
       a.p(p0, "activity");
       LifecycleCallbacksHandler.d(this, LifecycleCallbacksHandler$LifeCycle.onActivityStopped, p0, null, false, 12, null);
    }
}
