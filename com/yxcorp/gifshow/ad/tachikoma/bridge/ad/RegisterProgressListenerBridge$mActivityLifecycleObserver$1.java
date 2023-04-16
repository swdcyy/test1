package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterProgressListenerBridge$mActivityLifecycleObserver$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterProgressListenerBridge;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class RegisterProgressListenerBridge$mActivityLifecycleObserver$1 implements LifecycleObserver	// class@00181d
{
    public final RegisterProgressListenerBridge b;

    public void RegisterProgressListenerBridge$mActivityLifecycleObserver$1(RegisterProgressListenerBridge p0){
       this.b = p0;
       super();
    }
    public final void onActivityResumed(){
       if (PatchProxy.applyVoid(null, this, RegisterProgressListenerBridge$mActivityLifecycleObserver$1.class, "1")) {
          return;
       }
       this.b.j();
       return;
    }
}
