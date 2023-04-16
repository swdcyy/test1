package com.kwai.feature.api.corona.util.CoronaAllExperimentUtil$coronaTvLiveStyle$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.api.corona.util.CoronaLiveStyle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rkd.b;
import xf6.b;
import com.kwai.sdk.switchconfig.a;

public final class CoronaAllExperimentUtil$coronaTvLiveStyle$2 extends Lambda implements a	// class@000e35
{
    public static final CoronaAllExperimentUtil$coronaTvLiveStyle$2 INSTANCE;

    static {
       CoronaAllExperimentUtil$coronaTvLiveStyle$2.INSTANCE = new CoronaAllExperimentUtil$coronaTvLiveStyle$2();
    }
    public void CoronaAllExperimentUtil$coronaTvLiveStyle$2(){
       super(0);
    }
    public final CoronaLiveStyle invoke(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, CoronaAllExperimentUtil$coronaTvLiveStyle$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.g()) {
          return CoronaLiveStyle.DEFALUT;
       }
       obj = "coronaTvLiveStyle";
       int i = b.b(obj);
       if (!i) {
          i = a.t().a(obj, 0);
       }
       CoronaLiveStyle[] uCoronaLiveS = CoronaLiveStyle.values();
       int len = uCoronaLiveS.length;
       int i1 = 0;
       while (i1 < len) {
          object oobject = uCoronaLiveS[i1];
          int i2 = (oobject.getValue() == i)? 1: 0;
          if (i2) {
             objArray = oobject;
             break ;
          }
          i1 = i1 + 1;
       }
       if (objArray == null) {
          objArray = CoronaLiveStyle.DEFALUT;
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
