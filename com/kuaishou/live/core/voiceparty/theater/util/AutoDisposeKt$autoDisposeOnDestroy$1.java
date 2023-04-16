package com.kuaishou.live.core.voiceparty.theater.util.AutoDisposeKt$autoDisposeOnDestroy$1;
import androidx.lifecycle.LifecycleEventObserver;
import crd.b;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class AutoDisposeKt$autoDisposeOnDestroy$1 implements LifecycleEventObserver	// class@001a4a
{
    public final b b;

    public void AutoDisposeKt$autoDisposeOnDestroy$1(b p0){
       this.b = p0;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AutoDisposeKt$autoDisposeOnDestroy$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       a.p(p1, "event");
       if (p1 == Lifecycle$Event.ON_DESTROY) {
          this.b.dispose();
       }
       return;
    }
}
