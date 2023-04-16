package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$17;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import x83.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import v51.a;
import td3.o;
import e93.a;

public final class LiveLiteModelRegistry$registerModelItems$17 extends Lambda implements l	// class@00087e
{
    public static final LiveLiteModelRegistry$registerModelItems$17 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$17.INSTANCE = new LiveLiteModelRegistry$registerModelItems$17();
    }
    public void LiveLiteModelRegistry$registerModelItems$17(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final b invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$17.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new b(p0.c(a.class, ""), p0.c(o.class, ""), p0.c(a.class, ""));
    }
}
