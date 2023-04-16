package androidx.lifecycle.FullLifecycleObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

public interface abstract FullLifecycleObserver implements LifecycleObserver	// class@000241
{

    void onCreate(LifecycleOwner p0);
    void onDestroy(LifecycleOwner p0);
    void onPause(LifecycleOwner p0);
    void onResume(LifecycleOwner p0);
    void onStart(LifecycleOwner p0);
    void onStop(LifecycleOwner p0);
}
