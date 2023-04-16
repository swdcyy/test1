package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuStatEventLogger$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ssd.e;
import ssd.e$a;
import nm5.c;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils;

public final class DanmakuExperimentUtils$enableDanmakuStatEventLogger$2 extends Lambda implements a	// class@000e58
{
    public static final DanmakuExperimentUtils$enableDanmakuStatEventLogger$2 INSTANCE;

    static {
       DanmakuExperimentUtils$enableDanmakuStatEventLogger$2.INSTANCE = new DanmakuExperimentUtils$enableDanmakuStatEventLogger$2();
    }
    public void DanmakuExperimentUtils$enableDanmakuStatEventLogger$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$enableDanmakuStatEventLogger$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       double d = 0;
       double d1 = e.b.i(d, 0x3ff0000000000000);
       c uoc = DanmakuExperimentUtils.e();
       if (uoc != null) {
          d = uoc.danmakuStatEventLoggerRatio;
       }
       boolean b = (d1 - d < 0)? true: false;
       return b;
    }
}
