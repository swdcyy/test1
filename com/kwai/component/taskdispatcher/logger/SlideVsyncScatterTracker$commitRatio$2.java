package com.kwai.component.taskdispatcher.logger.SlideVsyncScatterTracker$commitRatio$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Float;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class SlideVsyncScatterTracker$commitRatio$2 extends Lambda implements a	// class@000b8d
{
    public static final SlideVsyncScatterTracker$commitRatio$2 INSTANCE;

    static {
       SlideVsyncScatterTracker$commitRatio$2.INSTANCE = new SlideVsyncScatterTracker$commitRatio$2();
    }
    public void SlideVsyncScatterTracker$commitRatio$2(){
       super(0);
    }
    public final Float invoke(){
       Object obj = PatchProxy.apply(null, this, SlideVsyncScatterTracker$commitRatio$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("vsyncScatterLoggerRatio", Float.TYPE, Float.valueOf(0x3a83126f));
    }
    public Object invoke(){
       return this.invoke();
    }
}
