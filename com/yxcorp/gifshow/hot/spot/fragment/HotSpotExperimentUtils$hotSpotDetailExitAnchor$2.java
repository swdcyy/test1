package com.yxcorp.gifshow.hot.spot.fragment.HotSpotExperimentUtils$hotSpotDetailExitAnchor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class HotSpotExperimentUtils$hotSpotDetailExitAnchor$2 extends Lambda implements a	// class@00182c
{
    public static final HotSpotExperimentUtils$hotSpotDetailExitAnchor$2 INSTANCE;

    static {
       HotSpotExperimentUtils$hotSpotDetailExitAnchor$2.INSTANCE = new HotSpotExperimentUtils$hotSpotDetailExitAnchor$2();
    }
    public void HotSpotExperimentUtils$hotSpotDetailExitAnchor$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HotSpotExperimentUtils$hotSpotDetailExitAnchor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("anchored");
    }
}
