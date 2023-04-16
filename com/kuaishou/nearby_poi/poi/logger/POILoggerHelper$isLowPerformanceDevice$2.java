package com.kuaishou.nearby_poi.poi.logger.POILoggerHelper$isLowPerformanceDevice$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class POILoggerHelper$isLowPerformanceDevice$2 extends Lambda implements a	// class@000a25
{
    public static final POILoggerHelper$isLowPerformanceDevice$2 INSTANCE;

    static {
       POILoggerHelper$isLowPerformanceDevice$2.INSTANCE = new POILoggerHelper$isLowPerformanceDevice$2();
    }
    public void POILoggerHelper$isLowPerformanceDevice$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, POILoggerHelper$isLowPerformanceDevice$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("activityISLPForH5", false);
    }
}
