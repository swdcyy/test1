package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$isFollowerCountOverThreshold$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;

public final class DanmakuExperimentUtils$isFollowerCountOverThreshold$2 extends Lambda implements a	// class@000e65
{
    public static final DanmakuExperimentUtils$isFollowerCountOverThreshold$2 INSTANCE;

    static {
       DanmakuExperimentUtils$isFollowerCountOverThreshold$2.INSTANCE = new DanmakuExperimentUtils$isFollowerCountOverThreshold$2();
    }
    public void DanmakuExperimentUtils$isFollowerCountOverThreshold$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       QCurrentUser obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$isFollowerCountOverThreshold$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = QCurrentUser.me();
       a.o(obj, "QCurrentUser.me\(\)");
       boolean b = (obj.getFollowerCount() > a.t().a("profileFansCountThreshold", 0x2710))? true: false;
       return b;
    }
}
