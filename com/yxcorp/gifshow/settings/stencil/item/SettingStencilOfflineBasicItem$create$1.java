package com.yxcorp.gifshow.settings.stencil.item.SettingStencilOfflineBasicItem$create$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import ihc.c;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.util.Objects;
import n2.a;

public final class SettingStencilOfflineBasicItem$create$1 implements DefaultLifecycleObserver	// class@001b3c
{
    public final c b;
    public final LifecycleOwner c;

    public void SettingStencilOfflineBasicItem$create$1(c p0,LifecycleOwner p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SettingStencilOfflineBasicItem$create$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       this.b.o();
       this.b.n();
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SettingStencilOfflineBasicItem$create$1.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       this.c.getLifecycle().removeObserver(this);
       Objects.requireNonNull(this.b);
       Objects.requireNonNull(this.b);
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
