package com.yxcorp.login.userlogin.activity.pad.FullScreenLoginActivityTablet;
import com.yxcorp.login.userlogin.activity.FullScreenLoginActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class FullScreenLoginActivityTablet extends FullScreenLoginActivity	// class@001b14
{

    public void FullScreenLoginActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, FullScreenLoginActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
