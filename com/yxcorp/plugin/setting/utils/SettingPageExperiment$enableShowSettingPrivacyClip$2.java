package com.yxcorp.plugin.setting.utils.SettingPageExperiment$enableShowSettingPrivacyClip$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class SettingPageExperiment$enableShowSettingPrivacyClip$2 extends Lambda implements a	// class@00092d
{
    public static final SettingPageExperiment$enableShowSettingPrivacyClip$2 INSTANCE;

    static {
       SettingPageExperiment$enableShowSettingPrivacyClip$2.INSTANCE = new SettingPageExperiment$enableShowSettingPrivacyClip$2();
    }
    public void SettingPageExperiment$enableShowSettingPrivacyClip$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, SettingPageExperiment$enableShowSettingPrivacyClip$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("clipboardSwitch");
    }
}
