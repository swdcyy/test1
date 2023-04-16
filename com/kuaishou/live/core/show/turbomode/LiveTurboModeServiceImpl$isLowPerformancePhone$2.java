package com.kuaishou.live.core.show.turbomode.LiveTurboModeServiceImpl$isLowPerformancePhone$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import r91.e;
import qy1.a;
import pp.c;
import qy1.a$a;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;

public final class LiveTurboModeServiceImpl$isLowPerformancePhone$2 extends Lambda implements a	// class@001227
{
    public static final LiveTurboModeServiceImpl$isLowPerformancePhone$2 INSTANCE;

    static {
       LiveTurboModeServiceImpl$isLowPerformancePhone$2.INSTANCE = new LiveTurboModeServiceImpl$isLowPerformancePhone$2();
    }
    public void LiveTurboModeServiceImpl$isLowPerformancePhone$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiveTurboModeServiceImpl$isLowPerformancePhone$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = e.b();
       b.Z(a.K0.a(), "isLowPerformancePhone "+b);
       return b;
    }
}
