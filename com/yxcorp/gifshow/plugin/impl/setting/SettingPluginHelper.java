package com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import qyb.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper$showFollowListPrivacySettingDialog$$inlined$let$lambda$2;
import android.content.Context;
import msd.a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper$showFollowListPrivacySettingDialog$$inlined$let$lambda$1;
import android.app.Activity;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper$startPrivateSettingsActivity$$inlined$let$lambda$1;
import com.google.gson.internal.LinkedTreeMap;
import com.yxcorp.gifshow.model.SwitchItem;
import n3d.a;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper$startPushDetailSettingsActivity$1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import jd6.g;
import com.kwai.plugin.dva.Dva;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper$b;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import androidx.fragment.app.FragmentActivity;
import android.content.ContextWrapper;
import com.kwai.plugin.dva.install.b;
import com.kwai.dva.design.PluginInstallerUIHandler;
import com.kwai.dva.design.PluginInstallerUIHandler$a;
import com.kwai.dva.design.PluginInstallerUIHandler$b;
import qyb.d;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper$a;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import ae6.h;
import com.kwai.plugin.dva.work.c;
import qyb.c;
import com.kwai.plugin.dva.work.c$c;

public final class SettingPluginHelper	// class@000fe8
{
    public static final SettingPluginHelper a;

    static {
       SettingPluginHelper.a = new SettingPluginHelper();
    }
    public void SettingPluginHelper(){
       super();
    }
    public static final void b(GifshowActivity p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, SettingPluginHelper.class, "6")) {
          return;
       }
       a.p(p1, "callback");
       if (p0 != null) {
          SettingPluginHelper.a.a(p0, new SettingPluginHelper$showFollowListPrivacySettingDialog$$inlined$let$lambda$2(p0, p1));
       }
       return;
    }
    public static final void c(GifshowActivity p0,a p1,PopupInterface$h p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, null, SettingPluginHelper.class, "5")) {
          return;
       }
       if (p0 != null) {
          SettingPluginHelper.a.a(p0, new SettingPluginHelper$showFollowListPrivacySettingDialog$$inlined$let$lambda$1(p0, p1, p2));
       }
       PatchProxy.onMethodExit(SettingPluginHelper.class, "5");
       return;
    }
    public static final void d(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, SettingPluginHelper.class, "2")) {
          return;
       }
       if (p0 != null) {
          SettingPluginHelper.a.a(p0, new SettingPluginHelper$startPrivateSettingsActivity$$inlined$let$lambda$1(p0));
       }
       return;
    }
    public static final void e(GifshowActivity p0,LinkedTreeMap p1,SwitchItem p2,a p3){
       if (PatchProxy.applyVoidFourRefsWithListener(p0, p1, p2, p3, null, SettingPluginHelper.class, "9")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "optionMap");
       a.p(p2, "selectedItem");
       a.p(p3, "callback");
       SettingPluginHelper.a.a(p0, new SettingPluginHelper$startPushDetailSettingsActivity$1(p0, p1, p2, p3));
       PatchProxy.onMethodExit(SettingPluginHelper.class, "9");
       return;
    }
    public final void a(Context p0,a p1){
       boolean b;
       boolean b1;
       Dva uDva;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SettingPluginHelper.class, "14")) {
          return;
       }
       Object[] objArray = null;
       SettingPluginHelper$b obj = PatchProxy.apply(objArray, this, SettingPluginHelper.class, "12");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(g.e("setting_plugin") || Dva.instance().isLoaded("setting_plugin")){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          p1.invoke();
       }else {
          obj = new SettingPluginHelper$b(p1);
          if (!PatchProxy.applyVoidTwoRefs(p0, obj, this, SettingPluginHelper.class, "15")) {
             PluginDownloadExtension.k.a("setting_plugin");
             Activity uActivity = PatchProxy.applyOneRefs(p0, this, SettingPluginHelper.class, "17");
             if (uActivity != patchProxyRe) {
             }else {
                while (true) {
                   if (p0 instanceof ContextWrapper) {
                      if (p0 instanceof FragmentActivity) {
                         uActivity = p0;
                      }else {
                         p0 = p0.getBaseContext();
                         a.o(p0, "context.baseContext");
                      }
                   }else {
                      uActivity = objArray;
                   }
                }
             }
             p0 = PatchProxy.apply(objArray, this, SettingPluginHelper.class, "13");
             if (p0 != patchProxyRe) {
                b1 = p0.booleanValue();
             }else {
                uDva = Dva.instance();
                a.o(uDva, "Dva.instance\(\)");
                b1 = uDva.getPluginInstallManager().g("setting_plugin");
             }
             if (b1 || !uActivity instanceof FragmentActivity) {
                if (!PatchProxy.applyVoidOneRefs(obj, this, SettingPluginHelper.class, "16")) {
                   uDva = Dva.instance();
                   a.o(uDva, "Dva.instance\(\)");
                   uDva.getPluginInstallManager().j("setting_plugin").a(new c(obj));
                }
             }else {
                Dva uDva1 = Dva.instance();
                a.o(uDva1, "Dva.instance\(\)");
                b pluginInstal = uDva1.getPluginInstallManager();
                a.o(pluginInstal, "Dva.instance\(\).pluginInstallManager");
                h.a(pluginInstal, "setting_plugin", PluginInstallerUIHandler.s.b(uActivity).d(new d(obj)));
             }
          }
       }
       return;
    }
}
