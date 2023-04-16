package com.kwai.sdk.eve.internal.common.utils.StopWatchKt$SYSTEM_TICKER$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import java.lang.Long;

public final class StopWatchKt$SYSTEM_TICKER$2$1 extends Lambda implements a	// class@0014a9
{
    public static final StopWatchKt$SYSTEM_TICKER$2$1 INSTANCE;

    static {
       StopWatchKt$SYSTEM_TICKER$2$1.INSTANCE = new StopWatchKt$SYSTEM_TICKER$2$1();
    }
    public void StopWatchKt$SYSTEM_TICKER$2$1(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, StopWatchKt$SYSTEM_TICKER$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return System.nanoTime();
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
