package androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.LifecycleEventObserver;
import java.lang.Object;
import androidx.lifecycle.ClassesInfoCache;
import java.lang.Class;
import androidx.lifecycle.ClassesInfoCache$CallbackInfo;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;

public class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver	// class@0007f1
{
    public final ClassesInfoCache$CallbackInfo mInfo;
    public final Object mWrapped;

    public void ReflectiveGenericLifecycleObserver(Object p0){
       super();
       this.mWrapped = p0;
       this.mInfo = ClassesInfoCache.sInstance.getInfo(p0.getClass());
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       this.mInfo.invokeCallbacks(p0, p1, this.mWrapped);
    }
}
