package com.yxcorp.plugin.setting.stencil.config.SettingPageDefaultStencil;
import java.lang.Object;
import com.yxcorp.plugin.setting.stencil.config.SettingPageDefaultStencil$defaultStencil$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.plugin.setting.stencil.config.SettingPage;
import com.yxcorp.gifshow.settings.stencil.entity.SettingPageStencil;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ehd.a;
import fg6.a;
import com.google.gson.Gson;

public final class SettingPageDefaultStencil	// class@0008fb
{
    public final p a;

    public void SettingPageDefaultStencil(){
       super();
       this.a = s.c(SettingPageDefaultStencil$defaultStencil$2.INSTANCE);
    }
    public final SettingPageStencil a(SettingPage p0){
       Gson a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SettingPageDefaultStencil settingPageD = SettingPageDefaultStencil.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, settingPageD, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "page");
       if (p0 != SettingPage.SETTING) {
          return null;
       }
       a.b("setting_stencil_default", p0.getPageKey());
       a = a.a;
       Object obj1 = PatchProxy.apply(null, this, settingPageD, "2");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.a.getValue();
       }
       return a.h(obj1, SettingPageStencil.class);
    }
}
