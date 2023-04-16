package com.yxcorp.login.userlogin.activity.pad.PhoneLoginActivityTablet;
import com.yxcorp.login.userlogin.activity.PhoneLoginActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class PhoneLoginActivityTablet extends PhoneLoginActivity	// class@001b19
{

    public void PhoneLoginActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PhoneLoginActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
