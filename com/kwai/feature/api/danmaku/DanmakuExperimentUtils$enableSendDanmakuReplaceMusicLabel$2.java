package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableSendDanmakuReplaceMusicLabel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils;

public final class DanmakuExperimentUtils$enableSendDanmakuReplaceMusicLabel$2 extends Lambda implements a	// class@000e61
{
    public static final DanmakuExperimentUtils$enableSendDanmakuReplaceMusicLabel$2 INSTANCE;

    static {
       DanmakuExperimentUtils$enableSendDanmakuReplaceMusicLabel$2.INSTANCE = new DanmakuExperimentUtils$enableSendDanmakuReplaceMusicLabel$2();
    }
    public void DanmakuExperimentUtils$enableSendDanmakuReplaceMusicLabel$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$enableSendDanmakuReplaceMusicLabel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (DanmakuExperimentUtils.U.O() == 11)? true: false;
       return b;
    }
}
