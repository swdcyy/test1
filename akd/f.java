package akd.f;
import android.app.Application$ActivityLifecycleCallbacks;
import com.yxcorp.upgrade.impl.a;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class f implements Application$ActivityLifecycleCallbacks	// class@000051
{
    public final a b;

    public void f(a p0){
       this.b = p0;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
    }
    public void onActivityDestroyed(Activity p0){
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       f tb = this.b;
       if (tb.o == p0) {
          tb.i();
       }
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.b.l();
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
    }
    public void onActivityStopped(Activity p0){
    }
}
