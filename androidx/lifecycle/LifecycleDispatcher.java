package androidx.lifecycle.LifecycleDispatcher;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import android.content.Context;
import android.app.Application;
import androidx.lifecycle.LifecycleDispatcher$DispatcherActivityCallback;
import android.app.Application$ActivityLifecycleCallbacks;

public class LifecycleDispatcher	// class@0007cc
{
    public static AtomicBoolean sInitialized;

    static {
       LifecycleDispatcher.sInitialized = new AtomicBoolean(false);
    }
    public void LifecycleDispatcher(){
       super();
    }
    public static void init(Context p0){
       if (LifecycleDispatcher.sInitialized.getAndSet(true)) {
          return;
       }
       p0.getApplicationContext().registerActivityLifecycleCallbacks(new LifecycleDispatcher$DispatcherActivityCallback());
       return;
    }
}
