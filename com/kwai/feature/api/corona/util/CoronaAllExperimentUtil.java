package com.kwai.feature.api.corona.util.CoronaAllExperimentUtil;
import com.kwai.feature.api.corona.util.CoronaAllExperimentUtil$coronaTvLiveStyle$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.kwai.feature.api.corona.util.CoronaLiveStyle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CoronaAllExperimentUtil	// class@000e36
{
    public static final p a;
    public static final CoronaAllExperimentUtil b;

    static {
       CoronaAllExperimentUtil.b = new CoronaAllExperimentUtil();
       CoronaAllExperimentUtil.a = s.c(CoronaAllExperimentUtil$coronaTvLiveStyle$2.INSTANCE);
    }
    public void CoronaAllExperimentUtil(){
       super();
    }
    public static final CoronaLiveStyle a(){
       Object obj = PatchProxy.apply(null, null, CoronaAllExperimentUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CoronaAllExperimentUtil.a.getValue();
    }
}
