package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$showToastWithAutoRetry$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class NasaExperimentUtils$showToastWithAutoRetry$2 extends Lambda implements a	// class@0018a6
{
    public static final NasaExperimentUtils$showToastWithAutoRetry$2 INSTANCE;

    static {
       NasaExperimentUtils$showToastWithAutoRetry$2.INSTANCE = new NasaExperimentUtils$showToastWithAutoRetry$2();
    }
    public void NasaExperimentUtils$showToastWithAutoRetry$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtils$showToastWithAutoRetry$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("showToastWithAutoRetry", false);
    }
}
