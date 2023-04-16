package com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$enableShowSettingPrivacyClip$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class HomeExperimentManager$enableShowSettingPrivacyClip$2 extends Lambda implements a	// class@0016b0
{
    public static final HomeExperimentManager$enableShowSettingPrivacyClip$2 INSTANCE;

    static {
       HomeExperimentManager$enableShowSettingPrivacyClip$2.INSTANCE = new HomeExperimentManager$enableShowSettingPrivacyClip$2();
    }
    public void HomeExperimentManager$enableShowSettingPrivacyClip$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomeExperimentManager$enableShowSettingPrivacyClip$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("clipboardSwitch");
    }
}
