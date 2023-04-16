package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$similarPopShowWithPercent$2;
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
import java.lang.Float;

public final class NasaExperimentUtilOld$similarPopShowWithPercent$2 extends Lambda implements a	// class@001892
{
    public static final NasaExperimentUtilOld$similarPopShowWithPercent$2 INSTANCE;

    static {
       NasaExperimentUtilOld$similarPopShowWithPercent$2.INSTANCE = new NasaExperimentUtilOld$similarPopShowWithPercent$2();
    }
    public void NasaExperimentUtilOld$similarPopShowWithPercent$2(){
       super(0);
    }
    public final float invoke(){
       float f;
       JsonObject obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$similarPopShowWithPercent$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = NasaExperimentUtilOld.a();
       if (obj != null) {
          g og = obj.r0("showWithPercent");
          if (og != null) {
             f = og.n();
          label_0028 :
             return f;
          }
       }
       f = 0;
       goto label_0028 ;
    }
    public Object invoke(){
       return Float.valueOf(this.invoke());
    }
}
