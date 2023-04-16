package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$pauseAnimaWhenSliding$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class NasaExperimentUtils$pauseAnimaWhenSliding$2 extends Lambda implements a	// class@0018a5
{
    public static final NasaExperimentUtils$pauseAnimaWhenSliding$2 INSTANCE;

    static {
       NasaExperimentUtils$pauseAnimaWhenSliding$2.INSTANCE = new NasaExperimentUtils$pauseAnimaWhenSliding$2();
    }
    public void NasaExperimentUtils$pauseAnimaWhenSliding$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtils$pauseAnimaWhenSliding$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("pauseAnimationWhenSliding", false);
    }
}
