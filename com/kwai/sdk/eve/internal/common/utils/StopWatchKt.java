package com.kwai.sdk.eve.internal.common.utils.StopWatchKt;
import com.kwai.sdk.eve.internal.common.utils.StopWatchKt$SYSTEM_TICKER$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class StopWatchKt	// class@0014ac
{
    public static final p a;

    static {
       StopWatchKt.a = s.c(StopWatchKt$SYSTEM_TICKER$2.INSTANCE);
    }
    public static final a a(){
       Object obj = PatchProxy.apply(null, null, StopWatchKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StopWatchKt.a.getValue();
    }
}
