package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$disablePlayFailView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class NasaExperimentUtils$disablePlayFailView$2 extends Lambda implements a	// class@00189b
{
    public static final NasaExperimentUtils$disablePlayFailView$2 INSTANCE;

    static {
       NasaExperimentUtils$disablePlayFailView$2.INSTANCE = new NasaExperimentUtils$disablePlayFailView$2();
    }
    public void NasaExperimentUtils$disablePlayFailView$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtils$disablePlayFailView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("disablePlayFailView", false);
    }
}
