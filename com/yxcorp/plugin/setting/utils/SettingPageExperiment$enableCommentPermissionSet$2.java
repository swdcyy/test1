package com.yxcorp.plugin.setting.utils.SettingPageExperiment$enableCommentPermissionSet$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class SettingPageExperiment$enableCommentPermissionSet$2 extends Lambda implements a	// class@00092c
{
    public static final SettingPageExperiment$enableCommentPermissionSet$2 INSTANCE;

    static {
       SettingPageExperiment$enableCommentPermissionSet$2.INSTANCE = new SettingPageExperiment$enableCommentPermissionSet$2();
    }
    public void SettingPageExperiment$enableCommentPermissionSet$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, SettingPageExperiment$enableCommentPermissionSet$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableCommentPermissionSet", false);
    }
}
