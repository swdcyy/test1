package com.kuaishou.live.common.core.component.gift.domain.slot.logger.LiveGiftSlotLogger;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import tj1.f;
import xp5.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zj1.a;
import tj1.b;
import yj1.c;
import n2.a;
import java.util.Objects;

public final class LiveGiftSlotLogger implements DefaultLifecycleObserver	// class@001264
{
    public b b;
    public final LifecycleOwner c;
    public final f d;
    public final i e;
    public final int f;

    public void LiveGiftSlotLogger(LifecycleOwner p0,f p1,i p2,int p3){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "giftSlotVC");
       a.p(p2, "logPackageProvider");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       p0.getLifecycle().addObserver(this);
       if (PatchProxy.applyVoid(null, this, LiveGiftSlotLogger.class, "3")) {
       }else {
          a uoa = new a(this);
          this.b = uoa;
          if (!PatchProxy.applyVoidOneRefs(uoa, p1, f.class, "3")) {
             a.p(uoa, "listener");
             p1.q.j(uoa);
          }
       }
       return;
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftSlotLogger.class, str)) {
          return;
       }
       a.p(p0, "owner");
       LiveGiftSlotLogger tb = this.b;
       if (tb != null) {
          LiveGiftSlotLogger td = this.d;
          Objects.requireNonNull(td);
          if (!PatchProxy.applyVoidOneRefs(tb, td, f.class, str)) {
             a.p(tb, "listener");
             td.q.k(tb);
          }
       }
       this.c.getLifecycle().removeObserver(this);
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
