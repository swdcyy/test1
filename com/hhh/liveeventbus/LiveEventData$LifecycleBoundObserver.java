package com.hhh.liveeventbus.LiveEventData$LifecycleBoundObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import com.hhh.liveeventbus.LiveEventData$b;
import com.hhh.liveeventbus.LiveEventData;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.Lifecycle$Event;

public class LiveEventData$LifecycleBoundObserver extends LiveEventData$b implements GenericLifecycleObserver	// class@00055a
{
    public final LifecycleOwner f;
    public final LiveEventData g;

    public void LiveEventData$LifecycleBoundObserver(LiveEventData p0,LifecycleOwner p1,Observer p2){
       this.g = p0;
       super(p0, p2);
       this.f = p1;
    }
    public void b(){
       this.f.getLifecycle().removeObserver(this);
    }
    public boolean c(LifecycleOwner p0){
       boolean b = (this.f == p0)? true: false;
       return b;
    }
    public boolean d(){
       return this.f.getLifecycle().getCurrentState().isAtLeast(Lifecycle$State.STARTED);
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (this.f.getLifecycle().getCurrentState() == Lifecycle$State.DESTROYED) {
          this.g.g(this.b);
          return;
       }else {
          this.a(this.d());
          return;
       }
    }
}
