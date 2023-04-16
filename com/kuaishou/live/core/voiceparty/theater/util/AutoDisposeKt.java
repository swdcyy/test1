package com.kuaishou.live.core.voiceparty.theater.util.AutoDisposeKt;
import com.kuaishou.live.viewcontroller.ViewController;
import brd.x;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle$Event;
import ix2.a;
import crd.b;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.core.voiceparty.theater.util.AutoDisposeKt$autoDisposeOnDestroy$2;
import androidx.lifecycle.LifecycleObserver;

public final class AutoDisposeKt	// class@001a4e
{

    public static final x a(ViewController p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AutoDisposeKt uAutoDispose = AutoDisposeKt.class;
       Lifecycle$Event obj = PatchProxy.applyOneRefs(p0, null, uAutoDispose, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$autoDisposeOnDestroy");
       obj = Lifecycle$Event.ON_DESTROY;
       a uoa = PatchProxy.applyTwoRefs(p0, obj, null, uAutoDispose, "6");
       if (uoa != patchProxyRe) {
       }else {
          a.p(p0, "$this$autoDisposeOn");
          a.p(obj, "lifecycleEvent");
          uoa = new a(p0, obj);
       }
       return uoa;
    }
    public static final void b(b p0,ViewController p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, AutoDisposeKt.class, "8")) {
          return;
       }
       a.p(p0, "$this$autoDisposeOnDestroy");
       a.p(p1, "controller");
       p1.getLifecycle().addObserver(new AutoDisposeKt$autoDisposeOnDestroy$2(p0));
       return;
    }
}
