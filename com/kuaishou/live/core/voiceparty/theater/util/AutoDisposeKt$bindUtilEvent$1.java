package com.kuaishou.live.core.voiceparty.theater.util.AutoDisposeKt$bindUtilEvent$1;
import androidx.lifecycle.LifecycleEventObserver;
import mrd.a;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class AutoDisposeKt$bindUtilEvent$1 implements LifecycleEventObserver	// class@001a4c
{
    public final a b;

    public void AutoDisposeKt$bindUtilEvent$1(a p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AutoDisposeKt$bindUtilEvent$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       this.b.onNext(p1);
       return;
    }
}
