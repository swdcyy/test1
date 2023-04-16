package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$mLifecycleObserver$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import msd.a;

public final class DanmakuElement$mLifecycleObserver$1 implements DefaultLifecycleObserver	// class@0013e6
{
    public final DanmakuElement b;

    public void DanmakuElement$mLifecycleObserver$1(DanmakuElement p0){
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
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuElement$mLifecycleObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       DanmakuElement$mLifecycleObserver$1 tb = this.b;
       if (tb.z != null) {
          DanmakuElement.J0(tb, true, null, 2, null);
          tb.z = null;
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
