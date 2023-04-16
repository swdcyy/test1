package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$supportDebugTool$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.a;
import xf6.d;
import com.kwai.sdk.switchconfig.a;

public final class DanmakuExperimentUtils$supportDebugTool$2 extends Lambda implements a	// class@000e6b
{
    public static final DanmakuExperimentUtils$supportDebugTool$2 INSTANCE;

    static {
       DanmakuExperimentUtils$supportDebugTool$2.INSTANCE = new DanmakuExperimentUtils$supportDebugTool$2();
    }
    public void DanmakuExperimentUtils$supportDebugTool$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$supportDebugTool$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!a.d() || (d.r("enableDanmakuTestTool") || a.t().d("supportDanmakuTestTool", b))) {
          b = true;
       }
       return b;
    }
}
