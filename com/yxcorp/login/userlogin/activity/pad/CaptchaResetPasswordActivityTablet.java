package com.yxcorp.login.userlogin.activity.pad.CaptchaResetPasswordActivityTablet;
import com.yxcorp.login.userlogin.activity.CaptchaResetPasswordActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class CaptchaResetPasswordActivityTablet extends CaptchaResetPasswordActivity	// class@001b13
{

    public void CaptchaResetPasswordActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, CaptchaResetPasswordActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
