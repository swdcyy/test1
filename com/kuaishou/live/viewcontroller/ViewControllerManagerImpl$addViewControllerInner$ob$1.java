package com.kuaishou.live.viewcontroller.ViewControllerManagerImpl$addViewControllerInner$ob$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle$State;

public final class ViewControllerManagerImpl$addViewControllerInner$ob$1 implements LifecycleEventObserver	// class@000fe3
{
    public final ViewController b;

    public void ViewControllerManagerImpl$addViewControllerInner$ob$1(ViewController p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewControllerManagerImpl$addViewControllerInner$ob$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       Lifecycle$State tarState = p1.getTargetState();
       a.o(tarState, "event.targetState");
       this.b.U2(tarState);
       return;
    }
}
