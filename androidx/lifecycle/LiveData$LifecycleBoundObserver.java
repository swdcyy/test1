package androidx.lifecycle.LiveData$LifecycleBoundObserver;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LiveData$ObserverWrapper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;

public class LiveData$LifecycleBoundObserver extends LiveData$ObserverWrapper implements LifecycleEventObserver	// class@0007d8
{
    public final LifecycleOwner mOwner;
    public final LiveData this$0;

    public void LiveData$LifecycleBoundObserver(LiveData p0,LifecycleOwner p1,Observer p2){
       this.this$0 = p0;
       super(p0, p2);
       this.mOwner = p1;
    }
    public void detachObserver(){
       this.mOwner.getLifecycle().removeObserver(this);
    }
    public boolean isAttachedTo(LifecycleOwner p0){
       boolean b = (this.mOwner == p0)? true: false;
       return b;
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (this.mOwner.getLifecycle().getCurrentState() == Lifecycle$State.DESTROYED) {
          this.this$0.removeObserver(this.mObserver);
          return;
       }else {
          this.activeStateChanged(this.shouldBeActive());
          return;
       }
    }
    public boolean shouldBeActive(){
       return this.mOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle$State.STARTED);
    }
}
