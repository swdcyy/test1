package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$13;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import hd3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import td3.o;

public final class LiveLiteModelRegistry$registerModelItems$13 extends Lambda implements l	// class@00087a
{
    public static final LiveLiteModelRegistry$registerModelItems$13 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$13.INSTANCE = new LiveLiteModelRegistry$registerModelItems$13();
    }
    public void LiveLiteModelRegistry$registerModelItems$13(){
       super(1);
    }
    public final a invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$13.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new a(p0.c(o.class, "获取信令屏蔽配置信息"));
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
