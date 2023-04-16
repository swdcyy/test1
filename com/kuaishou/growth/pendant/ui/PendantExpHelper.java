package com.kuaishou.growth.pendant.ui.PendantExpHelper;
import com.kuaishou.growth.pendant.model.PendantCustomEventConfig;
import com.kuaishou.growth.pendant.model.PendantCustomEventConfig$a;
import com.kuaishou.growth.pendant.ui.PendantExpHelper$enablePendantYodaAnrOpt$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.growth.pendant.ui.PendantExpHelper$pendantYodaLoadingTimeout$2;
import com.kuaishou.growth.pendant.ui.PendantExpHelper$enablePendantYodaAnrOptCustomEvent$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.a;
import com.kwai.sdk.switchconfig.a;

public final class PendantExpHelper	// class@0006ee
{
    public static PendantCustomEventConfig a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final PendantExpHelper e;

    static {
       PendantExpHelper.e = new PendantExpHelper();
       PendantExpHelper.a = PendantCustomEventConfig.Companion.a();
       PendantExpHelper.b = s.c(PendantExpHelper$enablePendantYodaAnrOpt$2.INSTANCE);
       PendantExpHelper.c = s.c(PendantExpHelper$pendantYodaLoadingTimeout$2.INSTANCE);
       PendantExpHelper.d = s.c(PendantExpHelper$enablePendantYodaAnrOptCustomEvent$2.INSTANCE);
    }
    public void PendantExpHelper(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, PendantExpHelper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.d();
       return a.t().d("enablePendantCreateInAsync", false);
    }
    public static final boolean b(){
       Object obj = PatchProxy.apply(null, null, PendantExpHelper.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = PendantExpHelper.d.getValue();
       }
       return obj.booleanValue();
    }
}
