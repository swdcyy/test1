package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$53;
import msd.l;
import kotlin.jvm.internal.Lambda;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import com.kuaishou.live.lite.guidance.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.guidance.a;
import com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$53$a;
import uf1.a;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteCommonGuideConfig;
import java.lang.reflect.Type;
import wg3.a;
import com.kuaishou.live.lite.guidance.a$a;
import z1.k;
import com.kuaishou.live.lite.guidance.c$a;
import androidx.lifecycle.Lifecycle;
import lb3.a;
import androidx.lifecycle.LifecycleObserver;

public final class LiveLiteModelRegistry$registerModelItems$53 extends Lambda implements l	// class@0008a7
{
    public final LifecycleOwner $lifecycleOwner;

    public void LiveLiteModelRegistry$registerModelItems$53(LifecycleOwner p0){
       this.$lifecycleOwner = p0;
       super(1);
    }
    public final c invoke(LiveLiteModelManager p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteModelRegistry$registerModelItems$53 obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$53.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "provider");
       obj = this.$lifecycleOwner;
       LiveLiteModelRegistry$registerModelItems$53$a oregisterMod = new LiveLiteModelRegistry$registerModelItems$53$a(p0);
       a uoa = p0.c(a.class, "Lite和详情直播间双向数据通信");
       c uoc = PatchProxy.applyThreeRefs(obj, oregisterMod, uoa, new a(), a.class, "1");
       if (uoc != patchProxyRe) {
       }else {
          LiveConfigStartupResponse$LiveLiteCommonGuideConfig liveLiteComm = a.v(LiveConfigStartupResponse$LiveLiteCommonGuideConfig.class);
          uoc = new c(oregisterMod, new a$a(liveLiteComm, uoa, oregisterMod), liveLiteComm);
          obj.getLifecycle().addObserver(new a(uoc));
       }
       return uoc;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
