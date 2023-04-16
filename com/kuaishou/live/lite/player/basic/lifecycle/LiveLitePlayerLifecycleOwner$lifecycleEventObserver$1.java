package com.kuaishou.live.lite.player.basic.lifecycle.LiveLitePlayerLifecycleOwner$lifecycleEventObserver$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.lite.player.basic.lifecycle.LiveLitePlayerLifecycleOwner;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import java.util.Objects;
import androidx.lifecycle.Lifecycle$State;
import java.lang.Enum;
import java.lang.Comparable;
import usd.q;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.LifecycleRegistry;

public final class LiveLitePlayerLifecycleOwner$lifecycleEventObserver$1 implements LifecycleEventObserver	// class@000a68
{
    public final LiveLitePlayerLifecycleOwner b;

    public void LiveLitePlayerLifecycleOwner$lifecycleEventObserver$1(LiveLitePlayerLifecycleOwner p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLitePlayerLifecycleOwner$lifecycleEventObserver$1.class, str)) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "event");
       LiveLitePlayerLifecycleOwner$lifecycleEventObserver$1 tb = this.b;
       Lifecycle lifecycle = tb.e.getLifecycle();
       a.o(lifecycle, "liveLiteFragmentLifecycleOwner.lifecycle");
       Lifecycle lifecycle1 = this.b.f.getLifecycle();
       a.o(lifecycle1, "rootVCLifecycleOwner.lifecycle");
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidTwoRefs(lifecycle, lifecycle1, tb, LiveLitePlayerLifecycleOwner.class, str)) {
          Lifecycle$State currentState = lifecycle1.getCurrentState();
          a.o(currentState, "rootVCLifecycle.currentState");
          Lifecycle$State cREATED = Lifecycle$State.CREATED;
          if (lifecycle.getCurrentState().compareTo(cREATED) >= 0) {
             currentState = q.p(currentState, cREATED);
          }
          Lifecycle$State dESTROYED = Lifecycle$State.DESTROYED;
          if (lifecycle.getCurrentState() == dESTROYED) {
             currentState = dESTROYED;
          }
          b.Z(LiveLiteLogTag.LIFECYCLE, tb.b+" handleLifecycleEvent "+currentState);
          tb.c.setCurrentState(currentState);
       }
       return;
    }
}
