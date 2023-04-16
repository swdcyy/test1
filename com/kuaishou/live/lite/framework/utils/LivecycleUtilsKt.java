package com.kuaishou.live.lite.framework.utils.LivecycleUtilsKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$State;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.lite.framework.utils.LivecycleUtilsKt$doOnNextLifecycle$1;
import androidx.lifecycle.LifecycleObserver;

public final class LivecycleUtilsKt	// class@000979
{

    public static final void a(LifecycleOwner p0,Lifecycle$State p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, LivecycleUtilsKt.class, "1")) {
          return;
       }
       a.p(p0, "$this$doOnNextLifecycle");
       a.p(p1, "state");
       a.p(p2, "action");
       p0.getLifecycle().addObserver(new LivecycleUtilsKt$doOnNextLifecycle$1(p1, p2));
       return;
    }
}
