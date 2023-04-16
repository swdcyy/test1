package com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$enableClickRemoveMenuPoint$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HomeExperimentManager$enableClickRemoveMenuPoint$2 extends Lambda implements a	// class@0016ab
{
    public static final HomeExperimentManager$enableClickRemoveMenuPoint$2 INSTANCE;

    static {
       HomeExperimentManager$enableClickRemoveMenuPoint$2.INSTANCE = new HomeExperimentManager$enableClickRemoveMenuPoint$2();
    }
    public void HomeExperimentManager$enableClickRemoveMenuPoint$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomeExperimentManager$enableClickRemoveMenuPoint$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableClickRemoveMenuPoint", false);
    }
}
