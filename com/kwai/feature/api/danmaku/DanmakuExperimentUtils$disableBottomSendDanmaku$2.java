package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$disableBottomSendDanmaku$2;
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

public final class DanmakuExperimentUtils$disableBottomSendDanmaku$2 extends Lambda implements a	// class@000e4b
{
    public static final DanmakuExperimentUtils$disableBottomSendDanmaku$2 INSTANCE;

    static {
       DanmakuExperimentUtils$disableBottomSendDanmaku$2.INSTANCE = new DanmakuExperimentUtils$disableBottomSendDanmaku$2();
    }
    public void DanmakuExperimentUtils$disableBottomSendDanmaku$2(){
       super(0);
    }
    public final Boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$disableBottomSendDanmaku$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.t.e(Boolean.valueOf(a.t().d("disableBottomSendDanmaku", false)));
    }
    public Object invoke(){
       return this.invoke();
    }
}
