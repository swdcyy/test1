package com.yxcorp.gifshow.hot.spot.fragment.HotSpotExperimentUtils$enableHotSpotStyleV2$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HotSpotExperimentUtils$enableHotSpotStyleV2$2 extends Lambda implements a	// class@00182b
{
    public static final HotSpotExperimentUtils$enableHotSpotStyleV2$2 INSTANCE;

    static {
       HotSpotExperimentUtils$enableHotSpotStyleV2$2.INSTANCE = new HotSpotExperimentUtils$enableHotSpotStyleV2$2();
    }
    public void HotSpotExperimentUtils$enableHotSpotStyleV2$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HotSpotExperimentUtils$enableHotSpotStyleV2$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableTrendingStyle", false);
    }
}
