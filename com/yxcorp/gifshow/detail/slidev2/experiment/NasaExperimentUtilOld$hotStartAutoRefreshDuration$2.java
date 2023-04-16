package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$hotStartAutoRefreshDuration$2;
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

public final class NasaExperimentUtilOld$hotStartAutoRefreshDuration$2 extends Lambda implements a	// class@001886
{
    public static final NasaExperimentUtilOld$hotStartAutoRefreshDuration$2 INSTANCE;

    static {
       NasaExperimentUtilOld$hotStartAutoRefreshDuration$2.INSTANCE = new NasaExperimentUtilOld$hotStartAutoRefreshDuration$2();
    }
    public void NasaExperimentUtilOld$hotStartAutoRefreshDuration$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$hotStartAutoRefreshDuration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.e("hotStartAutoRefreshDuration");
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
