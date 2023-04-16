package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuActMockConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import nm5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class DanmakuExperimentUtils$danmakuActMockConfig$2 extends Lambda implements a	// class@000e3d
{
    public static final DanmakuExperimentUtils$danmakuActMockConfig$2 INSTANCE;

    static {
       DanmakuExperimentUtils$danmakuActMockConfig$2.INSTANCE = new DanmakuExperimentUtils$danmakuActMockConfig$2();
    }
    public void DanmakuExperimentUtils$danmakuActMockConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$danmakuActMockConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("activityDanmakuResourceTest", a.class, null);
    }
}
