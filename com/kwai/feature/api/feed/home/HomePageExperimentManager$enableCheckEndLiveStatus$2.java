package com.kwai.feature.api.feed.home.HomePageExperimentManager$enableCheckEndLiveStatus$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HomePageExperimentManager$enableCheckEndLiveStatus$2 extends Lambda implements a	// class@000ee1
{
    public static final HomePageExperimentManager$enableCheckEndLiveStatus$2 INSTANCE;

    static {
       HomePageExperimentManager$enableCheckEndLiveStatus$2.INSTANCE = new HomePageExperimentManager$enableCheckEndLiveStatus$2();
    }
    public void HomePageExperimentManager$enableCheckEndLiveStatus$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomePageExperimentManager$enableCheckEndLiveStatus$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableCheckEndLiveStatus", false);
    }
}
