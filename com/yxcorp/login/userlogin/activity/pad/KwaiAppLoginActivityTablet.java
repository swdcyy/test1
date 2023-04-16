package com.yxcorp.login.userlogin.activity.pad.KwaiAppLoginActivityTablet;
import com.yxcorp.login.userlogin.activity.KwaiAppLoginActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class KwaiAppLoginActivityTablet extends KwaiAppLoginActivity	// class@001b16
{

    public void KwaiAppLoginActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KwaiAppLoginActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
