package com.yxcorp.plugin.setting.activity.SettingStencilRouterActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.plugin.setting.activity.SettingStencilRouterActivity$a;
import nsd.u;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.krn.model.LaunchModel$b;
import com.kuaishou.krn.model.LaunchModel;
import android.content.Context;
import com.kwai.kds.krn.api.page.KwaiRnActivity;
import rkd.b;
import com.yxcorp.plugin.setting.activity.PushSettingsActivityTablet;
import com.yxcorp.plugin.setting.activity.PushSettingsActivity;

public final class SettingStencilRouterActivity extends GifshowActivity	// class@000816
{
    public HashMap y;
    public static final SettingStencilRouterActivity$a z;

    static {
       SettingStencilRouterActivity.z = new SettingStencilRouterActivity$a(null);
    }
    public void SettingStencilRouterActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, SettingStencilRouterActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       PushSettingsActivityTablet pushSettings;
       SettingStencilRouterActivity settingStenc = SettingStencilRouterActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, settingStenc, "1")) {
          return;
       }
       super.onCreate(p0);
       boolean b = false;
       this.o3(b);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, settingStenc, "2")) {
          Intent intent = this.getIntent();
          if (intent != null) {
             Uri data = intent.getData();
             if (data != null) {
                a.o(data, "intent?.data ?: return");
                if (a.g(data.getPath(), "/push") && !PatchProxy.applyVoid(objArray, this, settingStenc, "3")) {
                   if (a.t().d("enablePushSettingStencil", b)) {
                      String str = "PushSettings";
                      if (!PatchProxy.applyVoidTwoRefs(str, "notification_setting_page", this, settingStenc, "4")) {
                         LaunchModel$b uob = new LaunchModel$b();
                         uob.i("FeedVenomSettings");
                         uob.j(str);
                         LaunchModel$b uob1 = uob.e("themeStyle", "1");
                         KwaiRnActivity.D3(this, uob1.e("pageKey", "notification_setting_page").h());
                      }
                   }else if(b.g()){
                      pushSettings = PushSettingsActivityTablet.class;
                   }else {
                      pushSettings = PushSettingsActivity.class;
                   }
                   this.startActivity(new Intent(this, pushSettings));
                }
             }
          }
       }
       this.finish();
       return;
    }
}
