package com.yxcorp.gifshow.homepage.experiment.HotExperimentManager$enableFindRefreshFailedFix$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HotExperimentManager$enableFindRefreshFailedFix$2 extends Lambda implements a	// class@0016c0
{
    public static final HotExperimentManager$enableFindRefreshFailedFix$2 INSTANCE;

    static {
       HotExperimentManager$enableFindRefreshFailedFix$2.INSTANCE = new HotExperimentManager$enableFindRefreshFailedFix$2();
    }
    public void HotExperimentManager$enableFindRefreshFailedFix$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HotExperimentManager$enableFindRefreshFailedFix$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("findRefreshFailedFix", false);
    }
}
