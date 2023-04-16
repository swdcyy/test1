package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuCloseGuideConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import nm5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class DanmakuExperimentUtils$danmakuCloseGuideConfig$2 extends Lambda implements a	// class@000e3f
{
    public static final DanmakuExperimentUtils$danmakuCloseGuideConfig$2 INSTANCE;

    static {
       DanmakuExperimentUtils$danmakuCloseGuideConfig$2.INSTANCE = new DanmakuExperimentUtils$danmakuCloseGuideConfig$2();
    }
    public void DanmakuExperimentUtils$danmakuCloseGuideConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final g invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$danmakuCloseGuideConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("danmakuCloseGuideConfig", g.class, null);
    }
}
