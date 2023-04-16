package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$49;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import com.kuaishou.live.common.core.component.trigger.LiveActionTriggerManagerImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveLiteModelRegistry$registerModelItems$49 extends Lambda implements l	// class@0008a1
{
    public static final LiveLiteModelRegistry$registerModelItems$49 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$49.INSTANCE = new LiveLiteModelRegistry$registerModelItems$49();
    }
    public void LiveLiteModelRegistry$registerModelItems$49(){
       super(1);
    }
    public final LiveActionTriggerManagerImpl invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$49.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new LiveActionTriggerManagerImpl();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
