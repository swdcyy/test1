package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$25;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import s51.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import vq5.d;

public final class LiveLiteModelRegistry$registerModelItems$25 extends Lambda implements l	// class@000887
{
    public static final LiveLiteModelRegistry$registerModelItems$25 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$25.INSTANCE = new LiveLiteModelRegistry$registerModelItems$25();
    }
    public void LiveLiteModelRegistry$registerModelItems$25(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final d invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$25.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new d(p0.c(d.class, "屏蔽部分接口，只保留跳转路由能力"));
    }
}
