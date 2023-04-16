package com.kuaishou.live.mvvm.MVVMLifeCycleObserver;
import androidx.lifecycle.LifecycleEventObserver;
import qh3.f;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public class MVVMLifeCycleObserver implements LifecycleEventObserver	// class@000d06
{
    public final f b;

    public void MVVMLifeCycleObserver(f p0){
       super();
       this.b = p0;
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (p1 == Lifecycle$Event.ON_DESTROY) {
          p0.getLifecycle().removeObserver(this);
          p0.a = null;
       }
       return;
    }
}
