package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$29;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import yb3.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import or5.d;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import mq5.b;
import ac3.k;
import id3.h;

public final class LiveLiteModelRegistry$registerModelItems$29 extends Lambda implements l	// class@00088b
{
    public static final LiveLiteModelRegistry$registerModelItems$29 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$29.INSTANCE = new LiveLiteModelRegistry$registerModelItems$29();
    }
    public void LiveLiteModelRegistry$registerModelItems$29(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final b invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$29.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       LiveStreamFeedWrapper liveStreamFe = p0.c(d.class, "获取Feed").r5();
       a.o(liveStreamFe, "it.get<LiveAudienceInfoM…d\"\).liveStreamFeedWrapper");
       return new b(liveStreamFe, p0.c(b.class, "直播结束状态"), p0.d(k.class, "监听长连接异常"), p0.d(h.class, "结束后replace上下滑的feed"));
    }
}
