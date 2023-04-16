package com.kwai.performance.stability.app.exit.monitor.AppExitMonitor$onApplicationPostCreate$2;
import android.app.Application$ActivityLifecycleCallbacks;
import com.kwai.performance.stability.app.exit.monitor.AppExitMonitor;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.String;
import kotlin.jvm.internal.a;
import yf7.r;
import com.kwai.performance.stability.app.exit.monitor.AppExitMonitor$onApplicationPostCreate$2$onActivityStarted$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;

public final class AppExitMonitor$onApplicationPostCreate$2 implements Application$ActivityLifecycleCallbacks	// class@001182
{
    public final AppExitMonitor b;

    public void AppExitMonitor$onApplicationPostCreate$2(AppExitMonitor p0){
       this.b = p0;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       a.q(p0, "activity");
    }
    public void onActivityDestroyed(Activity p0){
       a.q(p0, "activity");
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
       if (!r.b()) {
          return;
       }
       Monitor_ThreadKt.b(0, new AppExitMonitor$onApplicationPostCreate$2$onActivityStarted$1(this, p0), 1, null);
       return;
    }
    public void onActivityStopped(Activity p0){
       a.q(p0, "activity");
    }
}
