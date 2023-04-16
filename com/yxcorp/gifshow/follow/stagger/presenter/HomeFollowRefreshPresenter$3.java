package com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter$3;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;

public class HomeFollowRefreshPresenter$3 implements DefaultLifecycleObserver	// class@0011f7
{
    public final HomeFollowRefreshPresenter b;

    public void HomeFollowRefreshPresenter$3(HomeFollowRefreshPresenter p0){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowRefreshPresenter$3.class, "1")) {
          return;
       }
       p0.w = System.currentTimeMillis();
       return;
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowRefreshPresenter$3.class, "2")) {
          return;
       }
       this.b.W8(ActivityContext.g().e());
       return;
    }
}
