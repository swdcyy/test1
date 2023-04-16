package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$50;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.common.core.component.trigger.LiveActionTriggerManagerImpl;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lp3.a;

public final class LiveLiteModelRegistry$registerModelItems$50 extends Lambda implements l	// class@0008a3
{
    public static final LiveLiteModelRegistry$registerModelItems$50 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$50.INSTANCE = new LiveLiteModelRegistry$registerModelItems$50();
    }
    public void LiveLiteModelRegistry$registerModelItems$50(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveActionTriggerManagerImpl p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$50.class, "1")) {
          return;
       }
       a.p(p0, "it");
       p0.destroy();
       return;
    }
}
