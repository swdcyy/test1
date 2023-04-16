package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$48;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.lite.eventcenter.LiveLiteEventCenterImpl;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveLiteModelRegistry$registerModelItems$48 extends Lambda implements l	// class@0008a0
{
    public static final LiveLiteModelRegistry$registerModelItems$48 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$48.INSTANCE = new LiveLiteModelRegistry$registerModelItems$48();
    }
    public void LiveLiteModelRegistry$registerModelItems$48(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveLiteEventCenterImpl p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$48.class, "1")) {
          return;
       }
       a.p(p0, "it");
       p0.destroy();
       return;
    }
}
