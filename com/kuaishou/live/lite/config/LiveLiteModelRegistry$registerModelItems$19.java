package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$19;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.LiveLiteParam;
import androidx.lifecycle.LifecycleOwner;
import com.kwai.video.waynelive.LivePlayerController;
import brd.t;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import xp5.i;
import ds5.a;
import mrd.c;
import nsd.u;

public final class LiveLiteModelRegistry$registerModelItems$19 extends Lambda implements l	// class@000880
{
    public final t $enterDetailSignal;
    public final LifecycleOwner $lifecycleOwner;
    public final LivePlayerController $livePlayerController;
    public final LiveLiteParam $param;
    public final LiveLiteScatterLoadManager $scatterLoadService;

    public void LiveLiteModelRegistry$registerModelItems$19(LiveLiteParam p0,LifecycleOwner p1,LivePlayerController p2,t p3,LiveLiteScatterLoadManager p4){
       this.$param = p0;
       this.$lifecycleOwner = p1;
       this.$livePlayerController = p2;
       this.$enterDetailSignal = p3;
       this.$scatterLoadService = p4;
       super(1);
    }
    public final LiveLiteLongConnectionManager invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$19.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       Lifecycle lifecycle = this.$lifecycleOwner.getLifecycle();
       a.o(lifecycle, "lifecycleOwner.lifecycle");
       LiveLiteLongConnectionManager liveLiteLong = new LiveLiteLongConnectionManager(this.$param, lifecycle, this.$livePlayerController, p0.c(i.class, "获取直播埋点package"), p0.c(a.class, "监听playConfig更新，发起长连接"), p0.c(LiveLiteScatterLoadManager.class, "滑动过程中打散长连接建连"), this.$enterDetailSignal, this.$scatterLoadService.Xn(), this.$scatterLoadService.bj(), null, 512, null);
       return obj;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
