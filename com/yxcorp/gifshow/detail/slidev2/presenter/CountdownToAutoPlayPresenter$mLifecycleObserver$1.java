package com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter$mLifecycleObserver$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class CountdownToAutoPlayPresenter$mLifecycleObserver$1 implements DefaultLifecycleObserver	// class@0018af
{
    public final CountdownToAutoPlayPresenter b;

    public void CountdownToAutoPlayPresenter$mLifecycleObserver$1(CountdownToAutoPlayPresenter p0){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, CountdownToAutoPlayPresenter$mLifecycleObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       a.c(this, p0);
       this.b.R8();
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CountdownToAutoPlayPresenter$mLifecycleObserver$1.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       a.d(this, p0);
       this.b.P8();
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
