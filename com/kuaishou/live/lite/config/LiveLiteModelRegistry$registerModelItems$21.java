package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$21;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.LiveLiteParam;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import java.lang.Object;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import zb3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import or5.d;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import brd.t;

public final class LiveLiteModelRegistry$registerModelItems$21 extends Lambda implements l	// class@000883
{
    public final LiveLiteParam $param;
    public final LiveLiteScatterLoadManager $scatterLoadService;

    public void LiveLiteModelRegistry$registerModelItems$21(LiveLiteParam p0,LiveLiteScatterLoadManager p1){
       this.$param = p0;
       this.$scatterLoadService = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final a invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$21.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       LiveStreamFeedWrapper liveStreamFe = p0.c(d.class, "获取liveStreamId && 更新playConfig跑马信息").r5();
       a.o(liveStreamFe, "it.get<LiveAudienceInfoM…息\"\).liveStreamFeedWrapper");
       return new a(liveStreamFe, this.$param, this.$scatterLoadService.Xn(), this.$scatterLoadService.bj());
    }
}
