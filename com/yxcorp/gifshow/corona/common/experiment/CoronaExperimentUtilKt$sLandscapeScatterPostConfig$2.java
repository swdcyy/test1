package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$sLandscapeScatterPostConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ih5.z;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import fg6.a;
import com.google.gson.Gson;
import cq9.a;
import q87.c;
import nsd.u;

public final class CoronaExperimentUtilKt$sLandscapeScatterPostConfig$2 extends Lambda implements a	// class@0011e6
{
    public static final CoronaExperimentUtilKt$sLandscapeScatterPostConfig$2 INSTANCE;

    static {
       CoronaExperimentUtilKt$sLandscapeScatterPostConfig$2.INSTANCE = new CoronaExperimentUtilKt$sLandscapeScatterPostConfig$2();
    }
    public void CoronaExperimentUtilKt$sLandscapeScatterPostConfig$2(){
       super(0);
    }
    public final z invoke(){
       z oz;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, CoronaExperimentUtilKt$sLandscapeScatterPostConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().c("landscapeScatterPostConfig", objArray);
       if (obj != null) {
          try{
             oz = a.a.h(obj, z.class);
          }catch(java.lang.Exception e0){
             Object[] objArray1 = new Object[0];
             a.C().w("CoronaExperimentUtilKt", "---------:sLandscapeScatterPostConfig parse error!!", objArray1);
          }
          if (oz != null) {
          label_0048 :
             return oz;
          }
       }
       z oz1 = new z(false, 0, 0, 0, 15, null);
       goto label_0048 ;
    }
    public Object invoke(){
       return this.invoke();
    }
}
