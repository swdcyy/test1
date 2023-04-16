package com.kwai.nearby.local.trace.NearbyPageCostHelper$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kwai.nearby.local.trace.NearbyPageCostHelper;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;

public class NearbyPageCostHelper$1 implements DefaultLifecycleObserver	// class@000ffb
{
    public final NearbyPageCostHelper b;

    public void NearbyPageCostHelper$1(NearbyPageCostHelper p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyPageCostHelper$1.class, "1")) {
          return;
       }
       b9.a(this.b.e);
       NearbyPageCostHelper d = this.b.d;
       if (d != null) {
          b9.a(d);
       }
       d = this.b.f;
       if (d != null) {
          b9.a(d);
       }
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
