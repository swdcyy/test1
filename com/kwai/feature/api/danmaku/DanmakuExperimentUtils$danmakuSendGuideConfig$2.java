package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuSendGuideConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import nm5.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import nsd.u;
import java.lang.reflect.Type;

public final class DanmakuExperimentUtils$danmakuSendGuideConfig$2 extends Lambda implements a	// class@000e48
{
    public static final DanmakuExperimentUtils$danmakuSendGuideConfig$2 INSTANCE;

    static {
       DanmakuExperimentUtils$danmakuSendGuideConfig$2.INSTANCE = new DanmakuExperimentUtils$danmakuSendGuideConfig$2();
    }
    public void DanmakuExperimentUtils$danmakuSendGuideConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final r invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$danmakuSendGuideConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       r or = new r(0, 0, 0, 0, 15, null);
       return a.t().getValue("sendDanmakuGuideConfig", r.class, v9);
    }
}
