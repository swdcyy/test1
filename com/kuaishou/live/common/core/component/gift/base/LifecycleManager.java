package com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import n2.a;

public abstract class LifecycleManager implements DefaultLifecycleObserver	// class@001143
{
    public final LifecycleOwner b;

    public void LifecycleManager(LifecycleOwner p0){
       a.p(p0, "lifecycleOwner");
       super();
       this.b = p0;
       p0.getLifecycle().addObserver(this);
    }
    public final LifecycleOwner a(){
       return this.b;
    }
    public final void onCreate(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LifecycleManager.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       a.a(this, p0);
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LifecycleManager.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       a.b(this, p0);
       this.b.getLifecycle().removeObserver(this);
       return;
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
       a.f(this, p0);
    }
}
