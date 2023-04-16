package com.kwai.feature.api.feed.home.HomePageExperimentManager$enableBlockPageshowBySplash$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HomePageExperimentManager$enableBlockPageshowBySplash$2 extends Lambda implements a	// class@000ee0
{
    public static final HomePageExperimentManager$enableBlockPageshowBySplash$2 INSTANCE;

    static {
       HomePageExperimentManager$enableBlockPageshowBySplash$2.INSTANCE = new HomePageExperimentManager$enableBlockPageshowBySplash$2();
    }
    public void HomePageExperimentManager$enableBlockPageshowBySplash$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomePageExperimentManager$enableBlockPageshowBySplash$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableBlockPageshowBySplash", false);
    }
}
