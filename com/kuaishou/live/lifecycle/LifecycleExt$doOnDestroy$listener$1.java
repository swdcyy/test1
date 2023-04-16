package com.kuaishou.live.lifecycle.LifecycleExt$doOnDestroy$listener$1;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import msd.l;

public final class LifecycleExt$doOnDestroy$listener$1 implements LifecycleEventObserver	// class@001d61
{
    public final WeakReference b;
    public final l c;

    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LifecycleExt$doOnDestroy$listener$1.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "event");
       if (this.b.get() == null) {
          p0.getLifecycle().removeObserver(this);
       }else if(p1 == Lifecycle$Event.ON_DESTROY){
          p1 = this.b.get();
          if (p1 != null) {
             a.o(p1, "it");
             this.c.invoke(p1);
          }
          p0.getLifecycle().removeObserver(this);
       }
       return;
    }
}
