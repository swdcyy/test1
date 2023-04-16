package com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule$c;
import android.app.Application$ActivityLifecycleCallbacks;
import com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.google.common.collect.ImmutableCollection;
import java.lang.System;
import com.yxcorp.gifshow.performance.monitor.gc.RuntimeStat;
import java.lang.Boolean;

public final class GcManageInitModule$c implements Application$ActivityLifecycleCallbacks	// class@000e79
{
    public final GcManageInitModule b;

    public void GcManageInitModule$c(GcManageInitModule p0){
       this.b = p0;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GcManageInitModule$c.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       return;
    }
    public void onActivityDestroyed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GcManageInitModule$c.class, "7")) {
          return;
       }
       a.p(p0, "activity");
       return;
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GcManageInitModule$c.class, "4")) {
          return;
       }
       a.p(p0, "activity");
       GcManageInitModule$c tb = this.b;
       if (tb.D != null && (tb.z.contains(p0.getClass().getSimpleName()) && this.b.w != null)) {
          tb = this.b;
          tb.v = tb.v - 1;
          if (this.b.v <= null) {
             tb = this.b;
             tb.p0(tb.s);
             this.b.w = false;
          }
       }
       String simpleName = p0.getClass().getSimpleName();
       GcManageInitModule.H = System.currentTimeMillis();
       this.b.q.updateRuntimeStat();
       a.o(simpleName, "it");
       this.b.r0(simpleName, this.b.q);
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GcManageInitModule$c.class, "3")) {
          return;
       }
       a.p(p0, "activity");
       GcManageInitModule$c tb = this.b;
       if (tb.D != null && (tb.z.contains(p0.getClass().getSimpleName()) && a.g(this.b.q0(), Boolean.TRUE))) {
          if (this.b.w == null) {
             this.b.x = 0x3fe0000000000000;
             tb = this.b;
             tb.o0(tb.s);
             this.b.w = true;
          }
          tb = this.b;
          tb.v = tb.v + true;
       }
    label_0053 :
       p0.getClass();
       GcManageInitModule.G = System.currentTimeMillis();
       this.b.q.updateRuntimeStat();
       this.b.q.clearStat();
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GcManageInitModule$c.class, "6")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "outState");
       return;
    }
    public void onActivityStarted(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GcManageInitModule$c.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       return;
    }
    public void onActivityStopped(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GcManageInitModule$c.class, "5")) {
          return;
       }
       a.p(p0, "activity");
       return;
    }
}
