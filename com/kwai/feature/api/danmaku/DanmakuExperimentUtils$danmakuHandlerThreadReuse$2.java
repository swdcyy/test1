package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuHandlerThreadReuse$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.l;
import com.kwai.sdk.switchconfig.a;

public final class DanmakuExperimentUtils$danmakuHandlerThreadReuse$2 extends Lambda implements a	// class@000e43
{
    public static final DanmakuExperimentUtils$danmakuHandlerThreadReuse$2 INSTANCE;

    static {
       DanmakuExperimentUtils$danmakuHandlerThreadReuse$2.INSTANCE = new DanmakuExperimentUtils$danmakuHandlerThreadReuse$2();
    }
    public void DanmakuExperimentUtils$danmakuHandlerThreadReuse$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$danmakuHandlerThreadReuse$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (l.c("ENABLE_DANMAKU_HANDLERTHREAD_OPT", b) || a.t().d("danmakuHandlerThreadReuse", b)) {
          b = true;
       }
       return b;
    }
}
