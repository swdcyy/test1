package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuSpecialCharMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuSpecialCharMap$2$a;
import java.lang.reflect.Type;
import el.a;
import trd.t0;

public final class DanmakuExperimentUtils$danmakuSpecialCharMap$2 extends Lambda implements a	// class@000e4a
{
    public static final DanmakuExperimentUtils$danmakuSpecialCharMap$2 INSTANCE;

    static {
       DanmakuExperimentUtils$danmakuSpecialCharMap$2.INSTANCE = new DanmakuExperimentUtils$danmakuSpecialCharMap$2();
    }
    public void DanmakuExperimentUtils$danmakuSpecialCharMap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$danmakuSpecialCharMap$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("verticalDanmakuSpecialCharConfig", new DanmakuExperimentUtils$danmakuSpecialCharMap$2$a().getType(), t0.z());
    }
}
