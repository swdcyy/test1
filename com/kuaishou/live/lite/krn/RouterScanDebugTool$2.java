package com.kuaishou.live.lite.krn.RouterScanDebugTool$2;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.lite.krn.RouterScanDebugTool;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.Context;
import q2.a;
import android.content.BroadcastReceiver;

public final class RouterScanDebugTool$2 implements DefaultLifecycleObserver	// class@0009e0
{
    public final RouterScanDebugTool b;

    public void RouterScanDebugTool$2(RouterScanDebugTool p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RouterScanDebugTool$2.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       a.b(this.b.e).e(this.b.d);
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
