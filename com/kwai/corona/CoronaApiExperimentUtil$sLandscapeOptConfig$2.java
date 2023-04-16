package com.kwai.corona.CoronaApiExperimentUtil$sLandscapeOptConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import pi5.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class CoronaApiExperimentUtil$sLandscapeOptConfig$2 extends Lambda implements a	// class@000ce2
{
    public static final CoronaApiExperimentUtil$sLandscapeOptConfig$2 INSTANCE;

    static {
       CoronaApiExperimentUtil$sLandscapeOptConfig$2.INSTANCE = new CoronaApiExperimentUtil$sLandscapeOptConfig$2();
    }
    public void CoronaApiExperimentUtil$sLandscapeOptConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final e invoke(){
       Object obj = PatchProxy.apply(null, this, CoronaApiExperimentUtil$sLandscapeOptConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("landscapeOptConfig", e.class, new e());
    }
}
