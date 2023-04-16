package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$51;
import msd.l;
import kotlin.jvm.internal.Lambda;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import com.kuaishou.live.common.core.component.datatransfer.LiveLiteBidirectionalDataTransferManagerImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import e93.a;
import xp5.g;
import androidx.lifecycle.Lifecycle;

public final class LiveLiteModelRegistry$registerModelItems$51 extends Lambda implements l	// class@0008a4
{
    public final LifecycleOwner $lifecycleOwner;

    public void LiveLiteModelRegistry$registerModelItems$51(LifecycleOwner p0){
       this.$lifecycleOwner = p0;
       super(1);
    }
    public final LiveLiteBidirectionalDataTransferManagerImpl invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$51.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       Lifecycle lifecycle = this.$lifecycleOwner.getLifecycle();
       a.o(lifecycle, "lifecycleOwner.lifecycle");
       return new LiveLiteBidirectionalDataTransferManagerImpl(p0.c(a.class, ""), lifecycle);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
