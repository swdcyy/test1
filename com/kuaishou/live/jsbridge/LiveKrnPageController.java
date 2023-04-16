package com.kuaishou.live.jsbridge.LiveKrnPageController;
import o63.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.jsbridge.LiveKrnPageController$1;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class LiveKrnPageController implements d	// class@001d23
{
    public d b;
    public final LifecycleRegistry c;

    public void LiveKrnPageController(d p0){
       a.p(p0, "krnPage");
       super();
       this.b = p0;
       this.c = new LifecycleRegistry(this);
       p0.getLifecycle().addObserver(new LiveKrnPageController$1(this));
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, LiveKrnPageController.class, "1")) {
          return;
       }
       LiveKrnPageController tb = this.b;
       if (tb != null) {
          tb.L();
       }
       return;
    }
    public Lifecycle getLifecycle(){
       return this.c;
    }
}
