package com.kuaishou.live.viewcontroller.lifecycle.LifecyclesExt$merge$1$observer$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.viewcontroller.lifecycle.LifecyclesExt$merge$1;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import androidx.lifecycle.Lifecycle$State;
import java.util.Iterator;
import java.lang.Iterable;
import androidx.lifecycle.Lifecycle;
import java.lang.Comparable;
import usd.q;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleRegistry;

public final class LifecyclesExt$merge$1$observer$1 implements LifecycleEventObserver	// class@000ff1
{
    public final LifecyclesExt$merge$1 b;

    public void LifecyclesExt$merge$1$observer$1(LifecyclesExt$merge$1 p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LifecyclesExt$merge$1$observer$1.class, str)) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "<anonymous parameter 1>");
       LifecyclesExt$merge$1$observer$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, LifecyclesExt$merge$1.class, str)) {
          Lifecycle$State rESUMED = Lifecycle$State.RESUMED;
          Iterator iterator = tb.b.iterator();
          while (iterator.hasNext()) {
             Lifecycle lifecycle = iterator.next().getLifecycle();
             a.o(lifecycle, "it.lifecycle");
             Lifecycle$State currentState = lifecycle.getCurrentState();
             a.o(currentState, "it.lifecycle.currentState");
             rESUMED = q.w(rESUMED, currentState);
          }
          if (rESUMED == Lifecycle$State.DESTROYED) {
             iterator = tb.b.iterator();
             while (iterator.hasNext()) {
                iterator.next().getLifecycle().removeObserver(tb.d);
             }
          }
          if (tb.c.getCurrentState() != Lifecycle$State.INITIALIZED || rESUMED != Lifecycle$State.DESTROYED) {
             tb.c.setCurrentState(rESUMED);
          }
       }
       return;
    }
}
