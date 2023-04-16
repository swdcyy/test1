package com.kwai.performance.overhead.traffic.monitor.TrafficMonitor$b;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.performance.overhead.traffic.monitor.TrafficMonitor;

public final class TrafficMonitor$b implements Application$ActivityLifecycleCallbacks	// class@001179
{

    public void TrafficMonitor$b(){
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
       TrafficMonitor.INSTANCE.onForeground();
    }
    public void onActivityStopped(Activity p0){
       a.q(p0, "activity");
       TrafficMonitor.INSTANCE.onBackground();
    }
}
