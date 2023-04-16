package com.kuaishou.live.lite.eventcenter.LiveLiteEventCenterImpl$lifecycleEventObserver$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.lite.eventcenter.LiveLiteEventCenterImpl;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveLiteEventCenterImpl$lifecycleEventObserver$1 implements DefaultLifecycleObserver	// class@0008f1
{
    public final LiveLiteEventCenterImpl b;

    public void LiveLiteEventCenterImpl$lifecycleEventObserver$1(LiveLiteEventCenterImpl p0){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEventCenterImpl$lifecycleEventObserver$1.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       p0.e = true;
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEventCenterImpl$lifecycleEventObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       p0.e = false;
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
