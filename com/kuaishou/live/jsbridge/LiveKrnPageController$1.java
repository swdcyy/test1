package com.kuaishou.live.jsbridge.LiveKrnPageController$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.jsbridge.LiveKrnPageController;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleRegistry;

public final class LiveKrnPageController$1 implements LifecycleEventObserver	// class@001d22
{
    public final LiveKrnPageController b;

    public void LiveKrnPageController$1(LiveKrnPageController p0){
       this.b = p0;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveKrnPageController$1.class, "1")) {
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
