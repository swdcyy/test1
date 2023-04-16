package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$settingPositionOpt$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.d;
import com.kwai.framework.abtest.f;
import xf6.k;

public final class DanmakuExperimentUtils$settingPositionOpt$2 extends Lambda implements a	// class@000e68
{
    public static final DanmakuExperimentUtils$settingPositionOpt$2 INSTANCE;

    static {
       DanmakuExperimentUtils$settingPositionOpt$2.INSTANCE = new DanmakuExperimentUtils$settingPositionOpt$2();
    }
    public void DanmakuExperimentUtils$settingPositionOpt$2(){
       super(0);
    }
    public final Integer invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$settingPositionOpt$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.y.b(Integer.valueOf(f.e("optimizationDanmuSettingPosition")));
    }
    public Object invoke(){
       return this.invoke();
    }
}
