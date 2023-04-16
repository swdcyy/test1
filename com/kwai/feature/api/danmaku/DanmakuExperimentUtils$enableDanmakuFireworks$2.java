package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuFireworks$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class DanmakuExperimentUtils$enableDanmakuFireworks$2 extends Lambda implements a	// class@000e52
{
    public static final DanmakuExperimentUtils$enableDanmakuFireworks$2 INSTANCE;

    static {
       DanmakuExperimentUtils$enableDanmakuFireworks$2.INSTANCE = new DanmakuExperimentUtils$enableDanmakuFireworks$2();
    }
    public void DanmakuExperimentUtils$enableDanmakuFireworks$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$enableDanmakuFireworks$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableSupportFireworks", true);
    }
}
