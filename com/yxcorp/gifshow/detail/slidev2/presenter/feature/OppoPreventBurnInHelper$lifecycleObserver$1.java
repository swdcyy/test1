package com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInHelper$lifecycleObserver$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInHelper;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import e8a.d1;

public final class OppoPreventBurnInHelper$lifecycleObserver$1 implements DefaultLifecycleObserver	// class@001924
{
    public final OppoPreventBurnInHelper b;

    public void OppoPreventBurnInHelper$lifecycleObserver$1(OppoPreventBurnInHelper p0){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, OppoPreventBurnInHelper$lifecycleObserver$1.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       k1.m(this.b.d());
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OppoPreventBurnInHelper$lifecycleObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       OppoPreventBurnInHelper$lifecycleObserver$1 tb = this.b;
       if (tb.b != null) {
          k1.r(tb.d(), this.b.c().b2.a);
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
