package com.kuaishou.growth.pendant.ui.PendantExpHelper$enablePendantYodaAnrOptCustomEvent$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class PendantExpHelper$enablePendantYodaAnrOptCustomEvent$2 extends Lambda implements a	// class@0006ec
{
    public static final PendantExpHelper$enablePendantYodaAnrOptCustomEvent$2 INSTANCE;

    static {
       PendantExpHelper$enablePendantYodaAnrOptCustomEvent$2.INSTANCE = new PendantExpHelper$enablePendantYodaAnrOptCustomEvent$2();
    }
    public void PendantExpHelper$enablePendantYodaAnrOptCustomEvent$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, PendantExpHelper$enablePendantYodaAnrOptCustomEvent$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enablePendantYodaAnrOptCustomEvent", true);
    }
}
