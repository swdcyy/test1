package com.kuaishou.live.effect.engine.banned.LiveEffectBannedBizManager$lifecycleObserver$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.effect.engine.banned.LiveEffectBannedBizManager;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import n2.a;
import ny2.a;
import java.util.Objects;
import oy2.a;
import lf3.g;
import hf3.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class LiveEffectBannedBizManager$lifecycleObserver$1 implements DefaultLifecycleObserver	// class@001af9
{
    public final LiveEffectBannedBizManager b;
    public final LifecycleOwner c;

    public void LiveEffectBannedBizManager$lifecycleObserver$1(LiveEffectBannedBizManager p0,LifecycleOwner p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectBannedBizManager$lifecycleObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       a.a(this, p0);
       this.b.e.S0((long)0x10000);
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectBannedBizManager$lifecycleObserver$1.class, "3")) {
          return;
       }
       a.p(p0, "owner");
       a.b(this, p0);
       LiveEffectBannedBizManager b = this.b.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoid(null, b, a.class, "1")) {
          b.l.o(938, b.j);
          b.l.o(936, b.k);
       }
       this.c.getLifecycle().removeObserver(this);
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectBannedBizManager$lifecycleObserver$1.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       b.P(this.b.a, "onResume");
       this.b.e.j1((long)0x10000);
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
