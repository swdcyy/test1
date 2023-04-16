package com.kwai.edge.reco.afk.config.AFKDetectorConfig$Companion$config$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.edge.reco.afk.config.AFKDetectorConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class AFKDetectorConfig$Companion$config$2 extends Lambda implements a	// class@000d2a
{
    public static final AFKDetectorConfig$Companion$config$2 INSTANCE;

    static {
       AFKDetectorConfig$Companion$config$2.INSTANCE = new AFKDetectorConfig$Companion$config$2();
    }
    public void AFKDetectorConfig$Companion$config$2(){
       super(0);
    }
    public final AFKDetectorConfig invoke(){
       Object obj = PatchProxy.apply(null, this, AFKDetectorConfig$Companion$config$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("AFKDRuntimeConfigs", AFKDetectorConfig.class, AFKDetectorConfig.b);
    }
    public Object invoke(){
       return this.invoke();
    }
}
