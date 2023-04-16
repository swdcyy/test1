package com.yxcorp.plugin.setting.utils.SettingPageExperiment;
import com.yxcorp.plugin.setting.utils.SettingPageExperiment$enableCommentPermissionSet$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.plugin.setting.utils.SettingPageExperiment$enableShowSettingPrivacyClip$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class SettingPageExperiment	// class@00092e
{
    public static final p a;
    public static final p b;
    public static final SettingPageExperiment c;

    static {
       SettingPageExperiment.c = new SettingPageExperiment();
       SettingPageExperiment.a = s.c(SettingPageExperiment$enableCommentPermissionSet$2.INSTANCE);
       SettingPageExperiment.b = s.c(SettingPageExperiment$enableShowSettingPrivacyClip$2.INSTANCE);
    }
    public void SettingPageExperiment(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, SettingPageExperiment.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = SettingPageExperiment.a.getValue();
       }
       return obj.booleanValue();
    }
}
