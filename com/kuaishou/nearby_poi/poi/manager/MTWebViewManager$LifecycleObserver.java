package com.kuaishou.nearby_poi.poi.manager.MTWebViewManager$LifecycleObserver;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.nearby_poi.poi.manager.MTWebViewManager;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;

public class MTWebViewManager$LifecycleObserver implements LifecycleObserver	// class@000a27
{
    public final MTWebViewManager b;

    public void MTWebViewManager$LifecycleObserver(MTWebViewManager p0){
       this.b = p0;
       super();
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MTWebViewManager$LifecycleObserver.class, "1")) {
          return;
       }
       this.b.d(null);
       if (this.b.a != null) {
          p0.getLifecycle().removeObserver(this.b.a);
       }
       return;
    }
}
