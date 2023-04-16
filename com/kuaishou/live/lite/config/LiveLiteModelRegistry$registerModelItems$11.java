package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$11;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.LiveLiteParam;
import java.lang.Object;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import rd3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;

public final class LiveLiteModelRegistry$registerModelItems$11 extends Lambda implements l	// class@000878
{
    public final LiveLiteParam $param;

    public void LiveLiteModelRegistry$registerModelItems$11(LiveLiteParam p0){
       this.$param = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final a invoke(LiveLiteModelManager p0){
       LiveStreamFeed obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$11.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       obj = this.$param.getLiveStreamFeed();
       a.o(obj, "param.liveStreamFeed");
       return new a(obj);
    }
}
