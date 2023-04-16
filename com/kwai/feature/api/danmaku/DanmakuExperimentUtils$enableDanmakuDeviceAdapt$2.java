package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuDeviceAdapt$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class DanmakuExperimentUtils$enableDanmakuDeviceAdapt$2 extends Lambda implements a	// class@000e4e
{
    public static final DanmakuExperimentUtils$enableDanmakuDeviceAdapt$2 INSTANCE;

    static {
       DanmakuExperimentUtils$enableDanmakuDeviceAdapt$2.INSTANCE = new DanmakuExperimentUtils$enableDanmakuDeviceAdapt$2();
    }
    public void DanmakuExperimentUtils$enableDanmakuDeviceAdapt$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$enableDanmakuDeviceAdapt$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("danmakuContentAreaAdapt", false);
    }
}
