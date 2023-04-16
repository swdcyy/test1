package com.kuaishou.live.playeradapter.statistics.FirstScreenLogHandler$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.playeradapter.statistics.FirstScreenLogHandler;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;

public final class FirstScreenLogHandler$1 implements DefaultLifecycleObserver	// class@000d59
{
    public final FirstScreenLogHandler b;

    public void FirstScreenLogHandler$1(FirstScreenLogHandler p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FirstScreenLogHandler$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       FirstScreenLogHandler$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, FirstScreenLogHandler.class, "3")) {
          tb.c.removeRenderListener(tb.a);
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
