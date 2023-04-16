package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$refreshAdAvoid$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.abtest.f;
import java.lang.Integer;

public final class NasaExperimentUtilOld$refreshAdAvoid$2 extends Lambda implements a	// class@001889
{
    public static final NasaExperimentUtilOld$refreshAdAvoid$2 INSTANCE;

    static {
       NasaExperimentUtilOld$refreshAdAvoid$2.INSTANCE = new NasaExperimentUtilOld$refreshAdAvoid$2();
    }
    public void NasaExperimentUtilOld$refreshAdAvoid$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$refreshAdAvoid$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.f("refreshAdAvoid", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
