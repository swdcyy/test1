package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuMaskOpenGuideConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.api.danmaku.model.DanmakuMaskOpenGuideConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class DanmakuExperimentUtils$danmakuMaskOpenGuideConfig$2 extends Lambda implements a	// class@000e44
{
    public static final DanmakuExperimentUtils$danmakuMaskOpenGuideConfig$2 INSTANCE;

    static {
       DanmakuExperimentUtils$danmakuMaskOpenGuideConfig$2.INSTANCE = new DanmakuExperimentUtils$danmakuMaskOpenGuideConfig$2();
    }
    public void DanmakuExperimentUtils$danmakuMaskOpenGuideConfig$2(){
       super(0);
    }
    public final DanmakuMaskOpenGuideConfig invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$danmakuMaskOpenGuideConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("danmakuMaskOpenGuideConfig", DanmakuMaskOpenGuideConfig.class, null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
