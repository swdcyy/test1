package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$27;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.video.waynelive.LivePlayerController;
import java.lang.Object;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import yb3.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveLiteModelRegistry$registerModelItems$27 extends Lambda implements l	// class@000889
{
    public final LivePlayerController $livePlayerController;

    public void LiveLiteModelRegistry$registerModelItems$27(LivePlayerController p0){
       this.$livePlayerController = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final d invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$27.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new d(this.$livePlayerController);
    }
}
