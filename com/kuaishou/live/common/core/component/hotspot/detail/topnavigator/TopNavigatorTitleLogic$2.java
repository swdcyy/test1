package com.kuaishou.live.common.core.component.hotspot.detail.topnavigator.TopNavigatorTitleLogic$2;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.common.core.component.hotspot.detail.topnavigator.TopNavigatorTitleLogic;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class TopNavigatorTitleLogic$2 implements DefaultLifecycleObserver	// class@001413
{
    public final TopNavigatorTitleLogic b;

    public void TopNavigatorTitleLogic$2(TopNavigatorTitleLogic p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TopNavigatorTitleLogic$2.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       this.b.b();
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
