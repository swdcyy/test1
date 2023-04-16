package com.yxcorp.login.userlogin.activity.pad.MultiLoginAccountSelectActivityTablet;
import com.yxcorp.login.userlogin.activity.MultiLoginAccountSelectActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class MultiLoginAccountSelectActivityTablet extends MultiLoginAccountSelectActivity	// class@001b17
{

    public void MultiLoginAccountSelectActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MultiLoginAccountSelectActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
