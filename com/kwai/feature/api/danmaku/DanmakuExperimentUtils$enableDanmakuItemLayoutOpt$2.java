package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuItemLayoutOpt$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.d;
import com.kwai.sdk.switchconfig.a;
import xf6.k$a;

public final class DanmakuExperimentUtils$enableDanmakuItemLayoutOpt$2 extends Lambda implements a	// class@000e56
{
    public static final DanmakuExperimentUtils$enableDanmakuItemLayoutOpt$2 INSTANCE;

    static {
       DanmakuExperimentUtils$enableDanmakuItemLayoutOpt$2.INSTANCE = new DanmakuExperimentUtils$enableDanmakuItemLayoutOpt$2();
    }
    public void DanmakuExperimentUtils$enableDanmakuItemLayoutOpt$2(){
       super(0);
    }
    public final Boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$enableDanmakuItemLayoutOpt$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.B.e(Boolean.valueOf(a.t().d("enableDanmakuItemLayoutOpt", false)));
    }
    public Object invoke(){
       return this.invoke();
    }
}
