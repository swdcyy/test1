package com.yxcorp.gifshow.relation.user.activity.PrivacyDialogRouterActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
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
import ekd.i;
import com.yxcorp.gifshow.relation.user.activity.PrivacyDialogRouterActivity$a;
import qyb.a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper;

public class PrivacyDialogRouterActivity extends GifshowActivity	// class@0019e0
{

    public void PrivacyDialogRouterActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PrivacyDialogRouterActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrivacyDialogRouterActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       boolean b = false;
       this.o3(b);
       if (this.getIntent().getData() != null) {
          this.overridePendingTransition(b, R.anim.arg_RES_7f01010d);
          i.h(this, b, b);
          SettingPluginHelper.c(this, null, new PrivacyDialogRouterActivity$a(this));
       }
       return;
    }
}
