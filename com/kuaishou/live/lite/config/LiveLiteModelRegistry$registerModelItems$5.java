package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$5;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import com.kuaishou.live.lite.userstatus.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import e93.a;
import rd3.b;

public final class LiveLiteModelRegistry$registerModelItems$5 extends Lambda implements l	// class@0008ae
{
    public static final LiveLiteModelRegistry$registerModelItems$5 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$5.INSTANCE = new LiveLiteModelRegistry$registerModelItems$5();
    }
    public void LiveLiteModelRegistry$registerModelItems$5(){
       super(1);
    }
    public final b invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new b(p0.c(a.class, ""), p0.c(b.class, "重要接口的流控策略"));
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
