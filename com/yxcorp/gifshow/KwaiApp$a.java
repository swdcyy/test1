package com.yxcorp.gifshow.KwaiApp$a;
import com.huawei.emui.hiexperience.hwperf.prelaunch.HwPerfPrelaunch$HwPerfPrelaunchCallback;
import com.yxcorp.gifshow.KwaiApp;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.framework.app.huaweisuperapp.HuaweiSuperAppPrelaunchStage;
import p56.b;

public class KwaiApp$a implements HwPerfPrelaunch$HwPerfPrelaunchCallback	// class@0012f6
{
    public final KwaiApp a;

    public void KwaiApp$a(KwaiApp p0){
       this.a = p0;
       super();
    }
    public void hwPerfOnPrelaunchStateChanged(boolean p0){
       KwaiApp$a uoa = KwaiApp$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (!p0) {
          b.d(HuaweiSuperAppPrelaunchStage.USER_LAUNCH);
       }
       return;
    }
}
