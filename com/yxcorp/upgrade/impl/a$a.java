package com.yxcorp.upgrade.impl.a$a;
import android.app.Application$ActivityLifecycleCallbacks;
import com.yxcorp.upgrade.impl.a;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a$a implements Application$ActivityLifecycleCallbacks	// class@00098b
{
    public final a b;

    public void a$a(a p0){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.b.g();
       return;
    }
    public void onActivityStopped(Activity p0){
    }
}
