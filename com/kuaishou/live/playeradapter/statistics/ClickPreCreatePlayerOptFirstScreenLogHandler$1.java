package com.kuaishou.live.playeradapter.statistics.ClickPreCreatePlayerOptFirstScreenLogHandler$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.playeradapter.statistics.ClickPreCreatePlayerOptFirstScreenLogHandler;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ClickPreCreatePlayerOptFirstScreenLogHandler$1 implements DefaultLifecycleObserver	// class@000d57
{
    public final ClickPreCreatePlayerOptFirstScreenLogHandler b;

    public void ClickPreCreatePlayerOptFirstScreenLogHandler$1(ClickPreCreatePlayerOptFirstScreenLogHandler p0){
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
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClickPreCreatePlayerOptFirstScreenLogHandler$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       ClickPreCreatePlayerOptFirstScreenLogHandler$1 tb = this.b;
       tb.e = true;
       tb.c();
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
