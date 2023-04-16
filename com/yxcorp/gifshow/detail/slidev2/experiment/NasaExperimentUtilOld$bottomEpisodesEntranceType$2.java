package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$bottomEpisodesEntranceType$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import xf6.d;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class NasaExperimentUtilOld$bottomEpisodesEntranceType$2 extends Lambda implements a	// class@001869
{
    public static final NasaExperimentUtilOld$bottomEpisodesEntranceType$2 INSTANCE;

    static {
       NasaExperimentUtilOld$bottomEpisodesEntranceType$2.INSTANCE = new NasaExperimentUtilOld$bottomEpisodesEntranceType$2();
    }
    public void NasaExperimentUtilOld$bottomEpisodesEntranceType$2(){
       super(0);
    }
    public final int invoke(){
       int i;
       c obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$bottomEpisodesEntranceType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       if (obj.c()) {
          i = d.F();
          if (!i) {
             i = a.t().a("episodeType", 0);
          }
       }else {
          i = a.t().a("episodeType", 0);
       }
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
