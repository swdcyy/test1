package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveLiteModelRegistry$registerModelItems$1 extends Lambda implements l	// class@000881
{
    public final LiveLiteScatterLoadManager $scatterLoadService;

    public void LiveLiteModelRegistry$registerModelItems$1(LiveLiteScatterLoadManager p0){
       this.$scatterLoadService = p0;
       super(1);
    }
    public final LiveLiteScatterLoadManager invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return this.$scatterLoadService;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
