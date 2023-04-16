package com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class AdDownloadProgressHelper$1 implements LifecycleObserver	// class@00153b
{
    public final AdDownloadProgressHelper b;

    public void AdDownloadProgressHelper$1(AdDownloadProgressHelper p0){
       this.b = p0;
       super();
    }
    public void onActivityDestroyed(){
       if (PatchProxy.applyVoid(null, this, AdDownloadProgressHelper$1.class, "2")) {
          return;
       }
       this.b.f();
       return;
    }
    public void onActivityResumed(){
       if (PatchProxy.applyVoid(null, this, AdDownloadProgressHelper$1.class, "1")) {
          return;
       }
       this.b.b();
       return;
    }
}
