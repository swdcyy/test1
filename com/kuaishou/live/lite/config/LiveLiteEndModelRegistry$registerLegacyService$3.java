package com.kuaishou.live.lite.config.LiveLiteEndModelRegistry$registerLegacyService$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.LiveLiteParam;
import k2b.e0;
import java.lang.Object;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import za3.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import or5.d;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;

public final class LiveLiteEndModelRegistry$registerLegacyService$3 extends Lambda implements l	// class@000871
{
    public final e0 $logPage;
    public final LiveLiteParam $param;

    public void LiveLiteEndModelRegistry$registerLegacyService$3(LiveLiteParam p0,e0 p1){
       this.$param = p0;
       this.$logPage = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final f invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteEndModelRegistry$registerLegacyService$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       LiveStreamFeedWrapper liveStreamFe = p0.c(d.class, "").r5();
       a.o(liveStreamFe, "it.get<LiveAudienceInfoM¡­\"\"\).liveStreamFeedWrapper");
       return new f(this.$param, liveStreamFe, this.$logPage);
    }
}
