package com.yxcorp.gifshow.hot.spot.fragment.HotSpotExperimentUtils;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotExperimentUtils$enableHotSpotStyleV2$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotExperimentUtils$hotSpotFilterDuplicatePhotosAll$2;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotExperimentUtils$hotSpotDetailExitAnchor$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class HotSpotExperimentUtils	// class@00182e
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final HotSpotExperimentUtils d;

    static {
       HotSpotExperimentUtils.d = new HotSpotExperimentUtils();
       HotSpotExperimentUtils.a = s.c(HotSpotExperimentUtils$enableHotSpotStyleV2$2.INSTANCE);
       HotSpotExperimentUtils.b = s.c(HotSpotExperimentUtils$hotSpotFilterDuplicatePhotosAll$2.INSTANCE);
       HotSpotExperimentUtils.c = s.c(HotSpotExperimentUtils$hotSpotDetailExitAnchor$2.INSTANCE);
    }
    public void HotSpotExperimentUtils(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, HotSpotExperimentUtils.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = HotSpotExperimentUtils.a.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean b(){
       Object obj = PatchProxy.apply(null, null, HotSpotExperimentUtils.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = HotSpotExperimentUtils.c.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean c(){
       Object obj = PatchProxy.apply(null, null, HotSpotExperimentUtils.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = HotSpotExperimentUtils.b.getValue();
       }
       return obj.booleanValue();
    }
}
