package com.yxcorp.gifshow.growth.uninstall.CleanCacheMiddleActivity;
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
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import ara.a;
import android.content.Context;
import n3d.a;
import e17.i;
import android.content.Intent;
import android.net.Uri;

public class CleanCacheMiddleActivity extends GifshowActivity	// class@001582
{
    public static final int y;

    public void CleanCacheMiddleActivity(){
       super();
    }
    public void f3(){
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, CleanCacheMiddleActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CleanCacheMiddleActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (QCurrentUser.me().isLogined()) {
          this.u3();
          this.finish();
       }else {
          d.a(-1712118428).x00(this, 0, new LoginParams$a().a(), new a(this));
          i.a(R.style.arg_RES_7f11066a, 0x7f10305d);
       }
       return;
    }
    public final void u3(){
       if (PatchProxy.applyVoid(null, this, CleanCacheMiddleActivity.class, "2")) {
          return;
       }
       Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("kwai://settings"));
       intent.putExtra("LONG_PRESS_APP_ICON", true);
       this.startActivity(intent);
       return;
    }
}
