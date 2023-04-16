package androidx.lifecycle.LifecycleService;
import androidx.lifecycle.LifecycleOwner;
import android.app.Service;
import androidx.lifecycle.ServiceLifecycleDispatcher;
import androidx.lifecycle.Lifecycle;
import android.content.Intent;
import android.os.IBinder;

public class LifecycleService extends Service implements LifecycleOwner	// class@0007d3
{
    public final ServiceLifecycleDispatcher mDispatcher;

    public void LifecycleService(){
       super();
       this.mDispatcher = new ServiceLifecycleDispatcher(this);
    }
    public Lifecycle getLifecycle(){
       return this.mDispatcher.getLifecycle();
    }
    public IBinder onBind(Intent p0){
       this.mDispatcher.onServicePreSuperOnBind();
       return null;
    }
    public void onCreate(){
       this.mDispatcher.onServicePreSuperOnCreate();
       super.onCreate();
    }
    public void onDestroy(){
       this.mDispatcher.onServicePreSuperOnDestroy();
       super.onDestroy();
    }
    public void onStart(Intent p0,int p1){
       this.mDispatcher.onServicePreSuperOnStart();
       super.onStart(p0, p1);
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       return super.onStartCommand(p0, p1, p2);
    }
}
