package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuConfigInfo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import nm5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class DanmakuExperimentUtils$danmakuConfigInfo$2 extends Lambda implements a	// class@000e40
{
    public static final DanmakuExperimentUtils$danmakuConfigInfo$2 INSTANCE;

    static {
       DanmakuExperimentUtils$danmakuConfigInfo$2.INSTANCE = new DanmakuExperimentUtils$danmakuConfigInfo$2();
    }
    public void DanmakuExperimentUtils$danmakuConfigInfo$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final c invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$danmakuConfigInfo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("videoDanmakuConfigInfo", c.class, null);
    }
}
