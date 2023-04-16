package com.yxcorp.gifshow.homepage.experiment.HotExperimentManager$enableHotCardViewPreInflate$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HotExperimentManager$enableHotCardViewPreInflate$2 extends Lambda implements a	// class@0016c2
{
    public static final HotExperimentManager$enableHotCardViewPreInflate$2 INSTANCE;

    static {
       HotExperimentManager$enableHotCardViewPreInflate$2.INSTANCE = new HotExperimentManager$enableHotCardViewPreInflate$2();
    }
    public void HotExperimentManager$enableHotCardViewPreInflate$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HotExperimentManager$enableHotCardViewPreInflate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableFindPresenterOptimization", false);
    }
}
