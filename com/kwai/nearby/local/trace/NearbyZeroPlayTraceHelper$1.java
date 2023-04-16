package com.kwai.nearby.local.trace.NearbyZeroPlayTraceHelper$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kwai.nearby.local.trace.NearbyZeroPlayTraceHelper;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;

public class NearbyZeroPlayTraceHelper$1 implements DefaultLifecycleObserver	// class@000ffd
{
    public final NearbyZeroPlayTraceHelper b;

    public void NearbyZeroPlayTraceHelper$1(NearbyZeroPlayTraceHelper p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyZeroPlayTraceHelper$1.class, "1")) {
          return;
       }
       NearbyZeroPlayTraceHelper e = this.b.e;
       if (e != null) {
          b9.a(e);
       }
       e = this.b.f;
       if (e != null) {
          b9.a(e);
       }
       e = this.b.g;
       if (e != null) {
          b9.a(e);
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
