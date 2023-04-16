package com.yxcorp.gifshow.hot.spot.fragment.HotSpotExperimentUtils$hotSpotFilterDuplicatePhotosAll$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HotSpotExperimentUtils$hotSpotFilterDuplicatePhotosAll$2 extends Lambda implements a	// class@00182d
{
    public static final HotSpotExperimentUtils$hotSpotFilterDuplicatePhotosAll$2 INSTANCE;

    static {
       HotSpotExperimentUtils$hotSpotFilterDuplicatePhotosAll$2.INSTANCE = new HotSpotExperimentUtils$hotSpotFilterDuplicatePhotosAll$2();
    }
    public void HotSpotExperimentUtils$hotSpotFilterDuplicatePhotosAll$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HotSpotExperimentUtils$hotSpotFilterDuplicatePhotosAll$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("hotSpotFilterDuplicatePhotosAll", false);
    }
}
