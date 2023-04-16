package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$43;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.video.waynelive.LivePlayerController;
import java.lang.Object;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import nd3.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveLiteModelRegistry$registerModelItems$43 extends Lambda implements l	// class@00089b
{
    public final LivePlayerController $livePlayerController;

    public void LiveLiteModelRegistry$registerModelItems$43(LivePlayerController p0){
       this.$livePlayerController = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final b invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$43.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new b(this.$livePlayerController);
    }
}
