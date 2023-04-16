package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$31;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import za3.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import v51.a;

public final class LiveLiteModelRegistry$registerModelItems$31 extends Lambda implements l	// class@00088e
{
    public static final LiveLiteModelRegistry$registerModelItems$31 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$31.INSTANCE = new LiveLiteModelRegistry$registerModelItems$31();
    }
    public void LiveLiteModelRegistry$registerModelItems$31(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final h invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$31.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new h(p0.c(a.class, "依赖长连接获取server时间戳"));
    }
}
