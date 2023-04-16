package com.kuaishou.live.core.basic.activity.LivePlayerLoader$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.core.basic.activity.LivePlayerLoader;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.basic.player.LivePlayOptTextureView;
import com.kuaishou.live.core.basic.player.LivePlayOptTextureView$a;
import ekd.k1;

public class LivePlayerLoader$1 implements DefaultLifecycleObserver	// class@001821
{
    public final LivePlayerLoader b;

    public void LivePlayerLoader$1(LivePlayerLoader p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerLoader$1.class, "1")) {
          return;
       }
       LivePlayerLoader$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, LivePlayerLoader.class, "5")) {
          LivePlayerLoader h = tb.h;
          if (h instanceof LivePlayOptTextureView) {
             h.setTextureAvailableListener(null);
          }
          k1.n(tb);
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
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
