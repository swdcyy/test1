package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuContentAreaPatternARatio$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Double;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class DanmakuExperimentUtils$danmakuContentAreaPatternARatio$2 extends Lambda implements a	// class@000e41
{
    public static final DanmakuExperimentUtils$danmakuContentAreaPatternARatio$2 INSTANCE;

    static {
       DanmakuExperimentUtils$danmakuContentAreaPatternARatio$2.INSTANCE = new DanmakuExperimentUtils$danmakuContentAreaPatternARatio$2();
    }
    public void DanmakuExperimentUtils$danmakuContentAreaPatternARatio$2(){
       super(0);
    }
    public final Double invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$danmakuContentAreaPatternARatio$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("danmakuContentAreaPatternARatio", Double.TYPE, Double.valueOf(0x3fc70a3d70a3d70a));
    }
    public Object invoke(){
       return this.invoke();
    }
}
