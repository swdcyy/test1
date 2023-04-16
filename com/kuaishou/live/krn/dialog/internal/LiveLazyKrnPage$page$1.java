package com.kuaishou.live.krn.dialog.internal.LiveLazyKrnPage$page$1;
import androidx.lifecycle.LifecycleEventObserver;
import s63.s;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleRegistry;

public final class LiveLazyKrnPage$page$1 implements LifecycleEventObserver	// class@001d5f
{
    public final s b;

    public void LiveLazyKrnPage$page$1(s p0){
       this.b = p0;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLazyKrnPage$page$1.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "event");
       this.b.c.handleLifecycleEvent(p1);
       if (p1 == Lifecycle$Event.ON_DESTROY) {
          p0.b = null;
       }
       return;
    }
}
