package com.kuaishou.commercial.tvc.TvcTimeUtils$TIME_INTERVAL_MIN$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.util.concurrent.TimeUnit;
import java.lang.Long;

public final class TvcTimeUtils$TIME_INTERVAL_MIN$2 extends Lambda implements a	// class@0016a4
{
    public static final TvcTimeUtils$TIME_INTERVAL_MIN$2 INSTANCE;

    static {
       TvcTimeUtils$TIME_INTERVAL_MIN$2.INSTANCE = new TvcTimeUtils$TIME_INTERVAL_MIN$2();
    }
    public void TvcTimeUtils$TIME_INTERVAL_MIN$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, TvcTimeUtils$TIME_INTERVAL_MIN$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("adTVCRequestIntervalSeconds", TimeUnit.HOURS.toSeconds(2));
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
