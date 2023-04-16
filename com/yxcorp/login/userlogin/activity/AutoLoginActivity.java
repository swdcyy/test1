package com.yxcorp.login.userlogin.activity.AutoLoginActivity;
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

public class AutoLoginActivity extends GifshowActivity	// class@001b01
{

    public void AutoLoginActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AutoLoginActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AutoLoginActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
}
