package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuOpenGuideConfig$2;
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

public final class DanmakuExperimentUtils$danmakuOpenGuideConfig$2 extends Lambda implements a	// class@000e45
{
    public static final DanmakuExperimentUtils$danmakuOpenGuideConfig$2 INSTANCE;

    static {
       DanmakuExperimentUtils$danmakuOpenGuideConfig$2.INSTANCE = new DanmakuExperimentUtils$danmakuOpenGuideConfig$2();
    }
    public void DanmakuExperimentUtils$danmakuOpenGuideConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final g invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$danmakuOpenGuideConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("danmakuOpenGuideConfig", g.class, new g());
    }
}
