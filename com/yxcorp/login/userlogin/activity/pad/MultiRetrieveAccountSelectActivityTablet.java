package com.yxcorp.login.userlogin.activity.pad.MultiRetrieveAccountSelectActivityTablet;
import com.yxcorp.login.userlogin.activity.MultiRetrieveAccountSelectActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class MultiRetrieveAccountSelectActivityTablet extends MultiRetrieveAccountSelectActivity	// class@001b18
{

    public void MultiRetrieveAccountSelectActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MultiRetrieveAccountSelectActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
