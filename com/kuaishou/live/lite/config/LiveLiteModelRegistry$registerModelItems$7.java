package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$7;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import jc3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveLiteModelRegistry$registerModelItems$7 extends Lambda implements l	// class@0008b1
{
    public static final LiveLiteModelRegistry$registerModelItems$7 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$7.INSTANCE = new LiveLiteModelRegistry$registerModelItems$7();
    }
    public void LiveLiteModelRegistry$registerModelItems$7(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final a invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$7.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new a();
    }
}
