package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$sendDanmakuLocation$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import xf6.d;
import xf6.l;
import java.lang.Integer;
import com.kwai.sdk.switchconfig.a;

public final class DanmakuExperimentUtils$sendDanmakuLocation$2 extends Lambda implements a	// class@000e67
{
    public static final DanmakuExperimentUtils$sendDanmakuLocation$2 INSTANCE;

    static {
       DanmakuExperimentUtils$sendDanmakuLocation$2.INSTANCE = new DanmakuExperimentUtils$sendDanmakuLocation$2();
    }
    public void DanmakuExperimentUtils$sendDanmakuLocation$2(){
       super(0);
    }
    public final int invoke(){
       Object[] objArray = null;
       Integer obj = PatchProxy.apply(objArray, this, DanmakuExperimentUtils$sendDanmakuLocation$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       obj = Integer.valueOf(l.e("SEND_DANMAKU_LOCATION", i));
       String str = (obj.intValue() == i)? 1: null;
       if (!str) {
          objArray = obj;
       }
       int i1 = (objArray != null)? objArray.intValue(): a.t().a("danmakuPublishLocation", 5);
       return i1;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
