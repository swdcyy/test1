package com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$findLiveGapLimit$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class HomeExperimentManager$findLiveGapLimit$2 extends Lambda implements a	// class@0016b3
{
    public static final HomeExperimentManager$findLiveGapLimit$2 INSTANCE;

    static {
       HomeExperimentManager$findLiveGapLimit$2.INSTANCE = new HomeExperimentManager$findLiveGapLimit$2();
    }
    public void HomeExperimentManager$findLiveGapLimit$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, HomeExperimentManager$findLiveGapLimit$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("findLiveGapOptLimit", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
