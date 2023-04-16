package com.kwai.corona.CoronaApiExperimentUtil;
import com.kwai.corona.CoronaApiExperimentUtil$sLandscapeOptConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.corona.CoronaApiExperimentUtil$a;
import ok.x;
import com.google.common.base.Suppliers;
import com.kwai.corona.CoronaApiExperimentUtil$sEnterSerialDetailStyle$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import pi5.e;

public final class CoronaApiExperimentUtil	// class@000ce3
{
    public static final p a;
    public static final x b;
    public static final p c;
    public static final CoronaApiExperimentUtil d;

    static {
       CoronaApiExperimentUtil.d = new CoronaApiExperimentUtil();
       CoronaApiExperimentUtil.a = s.c(CoronaApiExperimentUtil$sLandscapeOptConfig$2.INSTANCE);
       CoronaApiExperimentUtil.b = Suppliers.a(CoronaApiExperimentUtil$a.b);
       CoronaApiExperimentUtil.c = s.c(CoronaApiExperimentUtil$sEnterSerialDetailStyle$1.INSTANCE);
    }
    public void CoronaApiExperimentUtil(){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, CoronaApiExperimentUtil.class, "8");
       if (obj == PatchProxyResult.class) {
          obj = CoronaApiExperimentUtil.b.get();
          a.o(obj, "sSerialPayCommercialCallback.get\(\)");
       }
       return obj.booleanValue();
    }
    public final int b(){
       Object obj = PatchProxy.apply(null, this, CoronaApiExperimentUtil.class, "9");
       if (obj == PatchProxyResult.class) {
          obj = CoronaApiExperimentUtil.c.getValue();
       }
       return obj.intValue();
    }
    public final e c(){
       Object obj = PatchProxy.apply(null, this, CoronaApiExperimentUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CoronaApiExperimentUtil.a.getValue();
    }
}
