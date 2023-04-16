package com.yxcorp.gifshow.performance.monitor.boost.RenderThrBoostInitModule$b;
import android.app.Application$ActivityLifecycleCallbacks;
import com.yxcorp.gifshow.performance.monitor.boost.RenderThrBoostInitModule;
import kotlin.jvm.internal.Ref$LongRef;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class RenderThrBoostInitModule$b implements Application$ActivityLifecycleCallbacks	// class@000e64
{
    public final RenderThrBoostInitModule b;
    public final Ref$LongRef c;

    public void RenderThrBoostInitModule$b(RenderThrBoostInitModule p0,Ref$LongRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RenderThrBoostInitModule$b.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       if (this.b.r == null) {
          RenderThrBoostInitModule$b tb = this.b;
          Ref$LongRef element = this.c.element;
          boolean b = true;
          if (!element - 1) {
             b = tb.p0();
          }else if(!element - 2){
             b = tb.o0();
          }else if(element - 3 || (tb.p0() && this.b.o0())){
             b = false;
          }
          tb.r = b;
       }
       return;
    }
    public void onActivityDestroyed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderThrBoostInitModule$b.class, "7")) {
          return;
       }
       a.p(p0, "activity");
       return;
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderThrBoostInitModule$b.class, "4")) {
          return;
       }
       a.p(p0, "activity");
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderThrBoostInitModule$b.class, "3")) {
          return;
       }
       a.p(p0, "activity");
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RenderThrBoostInitModule$b.class, "6")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "outState");
       return;
    }
    public void onActivityStarted(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderThrBoostInitModule$b.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       return;
    }
    public void onActivityStopped(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderThrBoostInitModule$b.class, "5")) {
          return;
       }
       a.p(p0, "activity");
       return;
    }
}
