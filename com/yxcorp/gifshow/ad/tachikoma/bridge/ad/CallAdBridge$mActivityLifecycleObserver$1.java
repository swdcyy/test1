package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.CallAdBridge$mActivityLifecycleObserver$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.CallAdBridge;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p59.t;

public final class CallAdBridge$mActivityLifecycleObserver$1 implements LifecycleObserver	// class@00180d
{
    public final CallAdBridge b;

    public void CallAdBridge$mActivityLifecycleObserver$1(CallAdBridge p0){
       this.b = p0;
       super();
    }
    public final void onActivityResumed(){
       if (PatchProxy.applyVoid(null, this, CallAdBridge$mActivityLifecycleObserver$1.class, "1")) {
          return;
       }
       this.b.c.c();
       return;
    }
}
