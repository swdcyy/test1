package com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$enableShowFeatureBottomGuideDialog$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HomeExperimentManager$enableShowFeatureBottomGuideDialog$2 extends Lambda implements a	// class@0016af
{
    public static final HomeExperimentManager$enableShowFeatureBottomGuideDialog$2 INSTANCE;

    static {
       HomeExperimentManager$enableShowFeatureBottomGuideDialog$2.INSTANCE = new HomeExperimentManager$enableShowFeatureBottomGuideDialog$2();
    }
    public void HomeExperimentManager$enableShowFeatureBottomGuideDialog$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomeExperimentManager$enableShowFeatureBottomGuideDialog$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("isFeaturedBottomNavigationExpansion", false);
    }
}
