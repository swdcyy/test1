package androidx.lifecycle.LifecycleRegistry$ObserverWithState;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.Lifecycle$State;
import java.lang.Object;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.Lifecycling;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.LifecycleRegistry;

public class LifecycleRegistry$ObserverWithState	// class@00024d
{
    public LifecycleEventObserver mLifecycleObserver;
    public Lifecycle$State mState;

    public void LifecycleRegistry$ObserverWithState(LifecycleObserver p0,Lifecycle$State p1){
       super();
       this.mLifecycleObserver = Lifecycling.lifecycleEventObserver(p0);
       this.mState = p1;
    }
    public void dispatchEvent(LifecycleOwner p0,Lifecycle$Event p1){
       Lifecycle$State stateAfter = LifecycleRegistry.getStateAfter(p1);
       this.mState = LifecycleRegistry.min(this.mState, stateAfter);
       this.mLifecycleObserver.onStateChanged(p0, p1);
       this.mState = stateAfter;
    }
}
