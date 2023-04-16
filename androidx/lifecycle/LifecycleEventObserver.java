package androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;

public interface abstract LifecycleEventObserver implements LifecycleObserver	// class@000249
{

    void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1);
}
