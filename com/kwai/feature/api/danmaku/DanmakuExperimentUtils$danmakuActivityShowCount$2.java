package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuActivityShowCount$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class DanmakuExperimentUtils$danmakuActivityShowCount$2 extends Lambda implements a	// class@000e3e
{
    public static final DanmakuExperimentUtils$danmakuActivityShowCount$2 INSTANCE;

    static {
       DanmakuExperimentUtils$danmakuActivityShowCount$2.INSTANCE = new DanmakuExperimentUtils$danmakuActivityShowCount$2();
    }
    public void DanmakuExperimentUtils$danmakuActivityShowCount$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$danmakuActivityShowCount$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("danmakuActivityShowCount", -1);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
