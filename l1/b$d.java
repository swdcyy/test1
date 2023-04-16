package l1.b$d;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Activity;
import java.lang.Object;
import android.os.Bundle;
import l1.b;

public final class b$d implements Application$ActivityLifecycleCallbacks	// class@0024ef
{
    public Object b;
    public Activity c;
    public final int d;
    public boolean e;
    public boolean f;
    public boolean g;

    public void b$d(Activity p0){
       super();
       this.e = false;
       this.f = false;
       this.g = false;
       this.c = p0;
       this.d = p0.hashCode();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
    }
    public void onActivityDestroyed(Activity p0){
       if (this.c == p0) {
          this.c = null;
          this.f = true;
       }
       return;
    }
    public void onActivityPaused(Activity p0){
       if (this.f != null && (this.g == null && (this.e == null && b.h(this.b, this.d, p0)))) {
          this.g = true;
          this.b = null;
       }
    label_001c :
       return;
    }
    public void onActivityResumed(Activity p0){
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
       if (this.c == p0) {
          this.e = true;
       }
       return;
    }
    public void onActivityStopped(Activity p0){
    }
}
