package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$similarPopShowInterval$2;
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

public final class NasaExperimentUtilOld$similarPopShowInterval$2 extends Lambda implements a	// class@001891
{
    public static final NasaExperimentUtilOld$similarPopShowInterval$2 INSTANCE;

    static {
       NasaExperimentUtilOld$similarPopShowInterval$2.INSTANCE = new NasaExperimentUtilOld$similarPopShowInterval$2();
    }
    public void NasaExperimentUtilOld$similarPopShowInterval$2(){
       super(0);
    }
    public final int invoke(){
       int i;
       JsonObject obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$similarPopShowInterval$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = NasaExperimentUtilOld.a();
       if (obj != null) {
          g og = obj.r0("showInterval");
          if (og != null) {
             i = og.p();
          label_0029 :
             return i;
          }
       }
       i = 20;
       goto label_0029 ;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
