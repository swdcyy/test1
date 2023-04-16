package com.yxcorp.login.userlogin.activity.pad.SwitchAccountActivityTablet;
import com.yxcorp.login.userlogin.activity.SwitchAccountActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class SwitchAccountActivityTablet extends SwitchAccountActivity	// class@001b1f
{

    public void SwitchAccountActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, SwitchAccountActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
