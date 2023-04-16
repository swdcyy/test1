package com.yxcorp.login.userlogin.activity.pad.SetPasswordActivityTablet;
import com.yxcorp.login.userlogin.activity.SetPasswordActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class SetPasswordActivityTablet extends SetPasswordActivity	// class@001b1e
{

    public void SetPasswordActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, SetPasswordActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
