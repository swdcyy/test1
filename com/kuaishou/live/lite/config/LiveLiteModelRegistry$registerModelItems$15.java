package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$15;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import cd3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import aq5.d;
import td3.o;

public final class LiveLiteModelRegistry$registerModelItems$15 extends Lambda implements l	// class@00087c
{
    public static final LiveLiteModelRegistry$registerModelItems$15 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$15.INSTANCE = new LiveLiteModelRegistry$registerModelItems$15();
    }
    public void LiveLiteModelRegistry$registerModelItems$15(){
       super(1);
    }
    public final a invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$15.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new a(p0.c(d.class, "设置BizRelation"), p0.c(o.class, "获取身份配置信息"));
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
