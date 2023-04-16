package com.kuaishou.live.lite.framework.utils.LivecycleUtilsKt$doOnNextLifecycle$1;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.Lifecycle$State;
import msd.a;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public final class LivecycleUtilsKt$doOnNextLifecycle$1 implements LifecycleEventObserver	// class@000978
{
    public final Lifecycle$State b;
    public final a c;

    public void LivecycleUtilsKt$doOnNextLifecycle$1(Lifecycle$State p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivecycleUtilsKt$doOnNextLifecycle$1.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "event");
       if (p1.getTargetState() == this.b) {
          this.c.invoke();
          p0.getLifecycle().removeObserver(this);
       }
       return;
    }
}
