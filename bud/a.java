package bud.a;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Activity;
import java.lang.Object;
import android.os.Bundle;
import android.app.Application;

public abstract class a implements Application$ActivityLifecycleCallbacks	// class@0002f6
{
    public final Activity b;

    public void a(Activity p0){
       super();
       this.b = p0;
    }
    public abstract void a();
    public void onActivityCreated(Activity p0,Bundle p1){
    }
    public void onActivityDestroyed(Activity p0){
       a tb = this.b;
       if (p0 == tb) {
          tb.getApplication().unregisterActivityLifecycleCallbacks(this);
          this.a();
       }
       return;
    }
    public void onActivityPaused(Activity p0){
    }
    public void onActivityResumed(Activity p0){
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
    }
    public void onActivityStopped(Activity p0){
    }
}
