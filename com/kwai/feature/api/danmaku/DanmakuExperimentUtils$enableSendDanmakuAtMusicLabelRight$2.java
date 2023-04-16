package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableSendDanmakuAtMusicLabelRight$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils;

public final class DanmakuExperimentUtils$enableSendDanmakuAtMusicLabelRight$2 extends Lambda implements a	// class@000e60
{
    public static final DanmakuExperimentUtils$enableSendDanmakuAtMusicLabelRight$2 INSTANCE;

    static {
       DanmakuExperimentUtils$enableSendDanmakuAtMusicLabelRight$2.INSTANCE = new DanmakuExperimentUtils$enableSendDanmakuAtMusicLabelRight$2();
    }
    public void DanmakuExperimentUtils$enableSendDanmakuAtMusicLabelRight$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$enableSendDanmakuAtMusicLabelRight$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (DanmakuExperimentUtils.U.O() == 5) {
          return true;
       }
       return (DanmakuExperimentUtils.I() ^ true);
    }
}
