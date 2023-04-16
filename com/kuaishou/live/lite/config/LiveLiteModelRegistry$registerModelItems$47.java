package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$47;
import msd.l;
import kotlin.jvm.internal.Lambda;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import com.kuaishou.live.lite.eventcenter.LiveLiteEventCenterImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import xp5.g;

public final class LiveLiteModelRegistry$registerModelItems$47 extends Lambda implements l	// class@00089f
{
    public final LifecycleOwner $lifecycleOwner;

    public void LiveLiteModelRegistry$registerModelItems$47(LifecycleOwner p0){
       this.$lifecycleOwner = p0;
       super(1);
    }
    public final LiveLiteEventCenterImpl invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$47.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       Lifecycle lifecycle = this.$lifecycleOwner.getLifecycle();
       a.o(lifecycle, "lifecycleOwner.lifecycle");
       return new LiveLiteEventCenterImpl(lifecycle, p0.c(g.class, ""));
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
