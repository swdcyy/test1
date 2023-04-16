package com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterGuidePresenter$mLifecycleObserver$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterGuidePresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class FollowFilterGuidePresenter$mLifecycleObserver$1 implements DefaultLifecycleObserver	// class@001238
{
    public final FollowFilterGuidePresenter b;

    public void FollowFilterGuidePresenter$mLifecycleObserver$1(FollowFilterGuidePresenter p0){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowFilterGuidePresenter$mLifecycleObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       this.b.P8();
       return;
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
