package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$52;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.common.core.component.datatransfer.LiveLiteBidirectionalDataTransferManagerImpl;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.Lifecycle;

public final class LiveLiteModelRegistry$registerModelItems$52 extends Lambda implements l	// class@0008a5
{
    public static final LiveLiteModelRegistry$registerModelItems$52 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$52.INSTANCE = new LiveLiteModelRegistry$registerModelItems$52();
    }
    public void LiveLiteModelRegistry$registerModelItems$52(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveLiteBidirectionalDataTransferManagerImpl p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$52.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, LiveLiteBidirectionalDataTransferManagerImpl.class, "1")) {
          p0.e.removeObserver(p0.c);
       }
       return;
    }
}
