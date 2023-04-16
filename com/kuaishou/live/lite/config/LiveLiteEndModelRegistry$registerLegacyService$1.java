package com.kuaishou.live.lite.config.LiveLiteEndModelRegistry$registerLegacyService$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.LiveLiteParam;
import java.lang.Object;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import za3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveLiteEndModelRegistry$registerLegacyService$1 extends Lambda implements l	// class@00086f
{
    public final LiveLiteParam $param;

    public void LiveLiteEndModelRegistry$registerLegacyService$1(LiveLiteParam p0){
       this.$param = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final a invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteEndModelRegistry$registerLegacyService$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new a(this.$param);
    }
}
