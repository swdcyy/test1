package com.kwai.feature.api.feed.home.HomePageExperimentManager$enableHomeRemoveDuplicatePhoto$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.utility.SystemUtil;

public final class HomePageExperimentManager$enableHomeRemoveDuplicatePhoto$2 extends Lambda implements a	// class@000ee3
{
    public static final HomePageExperimentManager$enableHomeRemoveDuplicatePhoto$2 INSTANCE;

    static {
       HomePageExperimentManager$enableHomeRemoveDuplicatePhoto$2.INSTANCE = new HomePageExperimentManager$enableHomeRemoveDuplicatePhoto$2();
    }
    public void HomePageExperimentManager$enableHomeRemoveDuplicatePhoto$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomePageExperimentManager$enableHomeRemoveDuplicatePhoto$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!a.t().d("disableDuplication", b) || SystemUtil.P()) {
          b = false;
       }
       return b;
    }
}
