package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$similarPopMaxShowCountOfDay$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.google.gson.JsonObject;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld;
import zk.g;
import java.lang.Integer;

public final class NasaExperimentUtilOld$similarPopMaxShowCountOfDay$2 extends Lambda implements a	// class@001890
{
    public static final NasaExperimentUtilOld$similarPopMaxShowCountOfDay$2 INSTANCE;

    static {
       NasaExperimentUtilOld$similarPopMaxShowCountOfDay$2.INSTANCE = new NasaExperimentUtilOld$similarPopMaxShowCountOfDay$2();
    }
    public void NasaExperimentUtilOld$similarPopMaxShowCountOfDay$2(){
       super(0);
    }
    public final int invoke(){
       int i;
       JsonObject obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$similarPopMaxShowCountOfDay$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = NasaExperimentUtilOld.a();
       if (obj != null) {
          g og = obj.r0("maxShowCountOfDay");
          if (og != null) {
             i = og.p();
          label_0028 :
             return i;
          }
       }
       i = 3;
       goto label_0028 ;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
