package com.yxcorp.gifshow.homepage.experiment.HotExperimentManager$enableFindNewCache$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HotExperimentManager$enableFindNewCache$2 extends Lambda implements a	// class@0016be
{
    public static final HotExperimentManager$enableFindNewCache$2 INSTANCE;

    static {
       HotExperimentManager$enableFindNewCache$2.INSTANCE = new HotExperimentManager$enableFindNewCache$2();
    }
    public void HotExperimentManager$enableFindNewCache$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HotExperimentManager$enableFindNewCache$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableHotNewCache", false);
    }
}