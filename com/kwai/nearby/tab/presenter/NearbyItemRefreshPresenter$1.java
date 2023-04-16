package com.kwai.nearby.tab.presenter.NearbyItemRefreshPresenter$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kwai.nearby.tab.presenter.NearbyItemRefreshPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.util.Objects;

public class NearbyItemRefreshPresenter$1 implements DefaultLifecycleObserver	// class@001034
{
    public final NearbyItemRefreshPresenter b;

    public void NearbyItemRefreshPresenter$1(NearbyItemRefreshPresenter p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyItemRefreshPresenter$1.class, "2")) {
          return;
       }
       NearbyItemRefreshPresenter$1 tb = this.b;
       tb.t = false;
       tb.s = System.currentTimeMillis();
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyItemRefreshPresenter$1.class, "1")) {
          return;
       }
       NearbyItemRefreshPresenter$1 tb = this.b;
       tb.t = true;
       if (tb.u == null) {
          return;
       }
       if (tb.r == null) {
          tb = this.b;
          Objects.requireNonNull(tb);
          if ((System.currentTimeMillis() - tb.s) - 0x7530 <= 0) {
          label_0030 :
             return;
          }
       }
       this.b.P8();
       goto label_0030 ;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
