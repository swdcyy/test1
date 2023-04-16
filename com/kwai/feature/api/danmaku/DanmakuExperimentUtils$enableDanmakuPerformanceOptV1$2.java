package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuPerformanceOptV1$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class DanmakuExperimentUtils$enableDanmakuPerformanceOptV1$2 extends Lambda implements a	// class@000e57
{
    public static final DanmakuExperimentUtils$enableDanmakuPerformanceOptV1$2 INSTANCE;

    static {
       DanmakuExperimentUtils$enableDanmakuPerformanceOptV1$2.INSTANCE = new DanmakuExperimentUtils$enableDanmakuPerformanceOptV1$2();
    }
    public void DanmakuExperimentUtils$enableDanmakuPerformanceOptV1$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$enableDanmakuPerformanceOptV1$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (a.t().a("danmakuPerformanceOptV1", i) == 1) {
          i = true;
       }
       return i;
    }
}
