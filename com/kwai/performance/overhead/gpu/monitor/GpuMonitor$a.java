package com.kwai.performance.overhead.gpu.monitor.GpuMonitor$a;
import android.app.Application$ActivityLifecycleCallbacks;
import cg7.a;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import java.util.List;
import com.kwai.performance.overhead.gpu.monitor.GpuMonitor;

public final class GpuMonitor$a implements Application$ActivityLifecycleCallbacks	// class@001148
{
    public final a b;

    public void GpuMonitor$a(a p0){
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
       a a;
       a.q(p0, "activity");
       String simpleName = p0.getClass().getSimpleName();
       a = this.b.a;
       a = (a == null || a.contains(simpleName))? 1: 0;
       if (!a) {
          simpleName = null;
       }
       if (simpleName != null) {
          GpuMonitor.stopSection(simpleName);
       }
       return;
    }
    public void onActivityResumed(Activity p0){
       a a;
       a.q(p0, "activity");
       String simpleName = p0.getClass().getSimpleName();
       a = this.b.a;
       a = (a == null || a.contains(simpleName))? 1: 0;
       if (!a) {
          simpleName = null;
       }
       if (simpleName != null) {
          GpuMonitor.startSection(simpleName);
       }
       return;
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
