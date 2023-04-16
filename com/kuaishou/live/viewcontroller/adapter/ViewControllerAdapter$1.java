package com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ViewControllerAdapter$1 implements LifecycleEventObserver	// class@000fe9
{
    public final ViewControllerAdapter b;

    public void ViewControllerAdapter$1(ViewControllerAdapter p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewControllerAdapter$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       if (p1 == Lifecycle$Event.ON_DESTROY) {
          this.b.destroy();
       }
       return;
    }
}
