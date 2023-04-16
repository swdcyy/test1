package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$sLandscapeUndispatchConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import rq9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import fg6.a;
import com.google.gson.Gson;
import cq9.a;
import q87.c;

public final class CoronaExperimentUtilKt$sLandscapeUndispatchConfig$2 extends Lambda implements a	// class@0011e8
{
    public static final CoronaExperimentUtilKt$sLandscapeUndispatchConfig$2 INSTANCE;

    static {
       CoronaExperimentUtilKt$sLandscapeUndispatchConfig$2.INSTANCE = new CoronaExperimentUtilKt$sLandscapeUndispatchConfig$2();
    }
    public void CoronaExperimentUtilKt$sLandscapeUndispatchConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       b uob;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, CoronaExperimentUtilKt$sLandscapeUndispatchConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().c("landscapeUndispatchPresenterConfig", objArray);
       if (obj != null) {
          try{
             uob = a.a.h(obj, b.class);
          }catch(java.lang.Exception e0){
             Object[] objArray1 = new Object[0];
             a.C().w("CoronaExperimentUtilKt", "---------:LandscapeUndispatchConfig parse error!!", objArray1);
          }
          if (uob != null) {
          label_003e :
             return uob;
          }
       }
       uob = new b();
       goto label_003e ;
    }
}
