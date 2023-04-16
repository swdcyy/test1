package com.kuaishou.growth.pendant.ui.PendantExpHelper$pendantYodaLoadingTimeout$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Long;

public final class PendantExpHelper$pendantYodaLoadingTimeout$2 extends Lambda implements a	// class@0006ed
{
    public static final PendantExpHelper$pendantYodaLoadingTimeout$2 INSTANCE;

    static {
       PendantExpHelper$pendantYodaLoadingTimeout$2.INSTANCE = new PendantExpHelper$pendantYodaLoadingTimeout$2();
    }
    public void PendantExpHelper$pendantYodaLoadingTimeout$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, PendantExpHelper$pendantYodaLoadingTimeout$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("pendantYodaloadingTimeout", 5000);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
