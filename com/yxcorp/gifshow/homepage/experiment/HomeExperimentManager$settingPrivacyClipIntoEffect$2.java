package com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$settingPrivacyClipIntoEffect$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HomeExperimentManager$settingPrivacyClipIntoEffect$2 extends Lambda implements a	// class@0016b8
{
    public static final HomeExperimentManager$settingPrivacyClipIntoEffect$2 INSTANCE;

    static {
       HomeExperimentManager$settingPrivacyClipIntoEffect$2.INSTANCE = new HomeExperimentManager$settingPrivacyClipIntoEffect$2();
    }
    public void HomeExperimentManager$settingPrivacyClipIntoEffect$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomeExperimentManager$settingPrivacyClipIntoEffect$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("pasteboardAuthorityWithoutSetting", false);
    }
}
