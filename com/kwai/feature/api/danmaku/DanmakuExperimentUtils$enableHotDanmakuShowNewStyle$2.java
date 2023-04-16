package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableHotDanmakuShowNewStyle$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.d;
import com.kwai.framework.abtest.f;
import xf6.k$a;

public final class DanmakuExperimentUtils$enableHotDanmakuShowNewStyle$2 extends Lambda implements a	// class@000e5b
{
    public static final DanmakuExperimentUtils$enableHotDanmakuShowNewStyle$2 INSTANCE;

    static {
       DanmakuExperimentUtils$enableHotDanmakuShowNewStyle$2.INSTANCE = new DanmakuExperimentUtils$enableHotDanmakuShowNewStyle$2();
    }
    public void DanmakuExperimentUtils$enableHotDanmakuShowNewStyle$2(){
       super(0);
    }
    public final Boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$enableHotDanmakuShowNewStyle$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.u.e(Boolean.valueOf(f.a("DanmuHighLike")));
    }
    public Object invoke(){
       return this.invoke();
    }
}
