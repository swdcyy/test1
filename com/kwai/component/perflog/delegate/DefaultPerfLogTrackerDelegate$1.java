package com.kwai.component.perflog.delegate.DefaultPerfLogTrackerDelegate$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kwai.component.perflog.delegate.DefaultPerfLogTrackerDelegate;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public class DefaultPerfLogTrackerDelegate$1 implements DefaultLifecycleObserver	// class@000a04
{
    public final LifecycleOwner b;
    public final DefaultPerfLogTrackerDelegate c;

    public void DefaultPerfLogTrackerDelegate$1(DefaultPerfLogTrackerDelegate p0,LifecycleOwner p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultPerfLogTrackerDelegate$1.class, "1")) {
          return;
       }
       this.b.getLifecycle().removeObserver(this);
       Log.g("PerfLogTrackerDelegate", "lifecycleOwner onStop, mSceneName = "+this.c.a);
       this.c.a();
       return;
    }
}
