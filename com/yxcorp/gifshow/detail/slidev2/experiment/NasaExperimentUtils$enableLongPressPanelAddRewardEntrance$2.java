package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$enableLongPressPanelAddRewardEntrance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class NasaExperimentUtils$enableLongPressPanelAddRewardEntrance$2 extends Lambda implements a	// class@00189e
{
    public static final NasaExperimentUtils$enableLongPressPanelAddRewardEntrance$2 INSTANCE;

    static {
       NasaExperimentUtils$enableLongPressPanelAddRewardEntrance$2.INSTANCE = new NasaExperimentUtils$enableLongPressPanelAddRewardEntrance$2();
    }
    public void NasaExperimentUtils$enableLongPressPanelAddRewardEntrance$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtils$enableLongPressPanelAddRewardEntrance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("pressPanelFavorEntrance");
    }
}
