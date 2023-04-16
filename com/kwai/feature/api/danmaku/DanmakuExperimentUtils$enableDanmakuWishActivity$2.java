package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuWishActivity$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.d;
import com.kwai.sdk.switchconfig.a;
import rkd.b;

public final class DanmakuExperimentUtils$enableDanmakuWishActivity$2 extends Lambda implements a	// class@000e59
{
    public static final DanmakuExperimentUtils$enableDanmakuWishActivity$2 INSTANCE;

    static {
       DanmakuExperimentUtils$enableDanmakuWishActivity$2.INSTANCE = new DanmakuExperimentUtils$enableDanmakuWishActivity$2();
    }
    public void DanmakuExperimentUtils$enableDanmakuWishActivity$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$enableDanmakuWishActivity$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (d.r("DANMAKU_WISH_ACTIVITY") || (a.t().d("danmakuWishActivity", b) && (!b.g() && !b.f()))) {
          b = true;
       }
    label_0036 :
       return b;
    }
}
