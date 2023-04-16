package androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.FullLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

public interface abstract DefaultLifecycleObserver implements FullLifecycleObserver	// class@000240
{

    void onCreate(LifecycleOwner p0);
    void onDestroy(LifecycleOwner p0);
    void onPause(LifecycleOwner p0);
    void onResume(LifecycleOwner p0);
    void onStart(LifecycleOwner p0);
    void onStop(LifecycleOwner p0);
}
