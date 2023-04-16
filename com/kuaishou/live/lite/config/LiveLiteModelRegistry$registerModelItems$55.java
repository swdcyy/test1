package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$55;
import msd.l;
import kotlin.jvm.internal.Lambda;
import hb3.d;
import java.lang.Object;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import o63.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveLiteModelRegistry$registerModelItems$55 extends Lambda implements l	// class@0008a9
{
    public final d $jsBridgeServiceFactory;

    public void LiveLiteModelRegistry$registerModelItems$55(d p0){
       this.$jsBridgeServiceFactory = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final a invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$55.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return this.$jsBridgeServiceFactory.a(p0);
    }
}
