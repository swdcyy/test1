package com.kuaishou.live.common.core.basic.tools.LiveBizActivationController$setupLifecycleObserver$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import va1.g;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import java.util.Objects;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveBizActivationController$setupLifecycleObserver$1 implements DefaultLifecycleObserver	// class@000ee7
{
    public final g b;

    public void LiveBizActivationController$setupLifecycleObserver$1(g p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBizActivationController$setupLifecycleObserver$1.class, "3")) {
          return;
       }
       a.p(p0, "owner");
       LiveBizActivationController$setupLifecycleObserver$1 tb = this.b;
       g g = tb.g;
       if (g != null) {
          g d = tb.d;
          if (d == null) {
             a.S("slidePlayListener");
          }
          g.d5(d);
       }
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBizActivationController$setupLifecycleObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       LiveBizActivationController$setupLifecycleObserver$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, g.class, "3")) {
          b.Z(tb.e, "onPageStarted");
          tb.b = true;
          tb.a();
       }
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBizActivationController$setupLifecycleObserver$1.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       LiveBizActivationController$setupLifecycleObserver$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, g.class, "4")) {
          b.Z(tb.e, "onPageStopped");
          tb.b = false;
          tb.b();
       }
       return;
    }
}
