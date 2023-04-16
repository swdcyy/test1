package com.kuaishou.live.core.basic.preload.LiveViewPreLoader$handleAutoClear$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.core.basic.preload.LiveViewPreLoader;
import r12.f$a;
import android.content.Context;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public final class LiveViewPreLoader$handleAutoClear$1 implements DefaultLifecycleObserver	// class@0008cb
{
    public final LiveViewPreLoader b;
    public final f$a c;
    public final Context d;

    public void LiveViewPreLoader$handleAutoClear$1(LiveViewPreLoader p0,f$a p1,Context p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveViewPreLoader$handleAutoClear$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       a.b(this, p0);
       this.b.e("auto clear task: "+this.c.b());
       this.b.a(this.c, this.d);
       this.d.getLifecycle().removeObserver(this);
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
