package com.kuaishou.kotlin.livedata.ListLiveData$observeForeverSafely$1;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleObserver;

public final class ListLiveData$observeForeverSafely$1 implements LifecycleEventObserver	// class@0007a5
{
    public final b b;
    public final LifecycleOwner c;
    public final Observer d;

    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ListLiveData$observeForeverSafely$1.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "event");
       Lifecycle lifecycle = this.c.getLifecycle();
       a.o(lifecycle, "owner.lifecycle");
       if (lifecycle.getCurrentState() == Lifecycle$State.DESTROYED) {
          this.b.removeObserver(this.d);
          this.c.getLifecycle().removeObserver(this);
       }
       return;
    }
}
