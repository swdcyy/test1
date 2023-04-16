package com.yxcorp.upgrade.impl.e$a;
import android.app.Application$ActivityLifecycleCallbacks;
import com.yxcorp.upgrade.impl.e;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e$a implements Application$ActivityLifecycleCallbacks	// class@000995
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
    }
    public void onActivityDestroyed(Activity p0){
    }
    public void onActivityPaused(Activity p0){
    }
    public void onActivityResumed(Activity p0){
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       this.b.g();
       return;
    }
    public void onActivityStopped(Activity p0){
    }
}
