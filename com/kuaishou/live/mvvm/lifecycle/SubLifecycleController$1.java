package com.kuaishou.live.mvvm.lifecycle.SubLifecycleController$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import androidx.lifecycle.LifecycleRegistry;
import vh3.b;
import java.lang.Enum;
import androidx.lifecycle.ViewModelStore;

public final class SubLifecycleController$1 implements LifecycleEventObserver	// class@000d0d
{
    public final SubLifecycleController b;

    public void SubLifecycleController$1(SubLifecycleController p0){
       this.b = p0;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       SubLifecycleController subLifecycle = SubLifecycleController.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SubLifecycleController$1.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "event");
       SubLifecycleController$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p1, tb, subLifecycle, "1") && p1 == Lifecycle$Event.ON_START) {
          tb.c();
       }
       this.b.c.handleLifecycleEvent(p1);
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p1, tb, subLifecycle, "2")) {
          int i = b.a[p1.ordinal()];
          if (i != 1) {
             if (i == 2) {
                tb.b();
                tb.b.clear();
             }
          }else {
             tb.d();
          }
       }
       return;
    }
}
