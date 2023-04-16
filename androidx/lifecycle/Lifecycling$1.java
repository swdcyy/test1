package androidx.lifecycle.Lifecycling$1;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.LifecycleEventObserver;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;

public class Lifecycling$1 implements GenericLifecycleObserver	// class@0007d4
{
    public final LifecycleEventObserver val$observer;

    public void Lifecycling$1(LifecycleEventObserver p0){
       this.val$observer = p0;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       this.val$observer.onStateChanged(p0, p1);
    }
}
