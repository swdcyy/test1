package com.yxcorp.login.userlogin.activity.CaptchaResetPasswordActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.userlogin.fragment.CaptchaResetPasswordFragment;
import android.content.Intent;
import android.os.Bundle;

public class CaptchaResetPasswordActivity extends SingleFragmentActivity	// class@001b02
{

    public void CaptchaResetPasswordActivity(){
       super();
    }
    public int M(){
       return 1;
    }
    public int getPage(){
       return 0x7d4b;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, CaptchaResetPasswordActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://login_reset_password";
    }
    public Fragment u3(){
       CaptchaResetPasswordFragment obj = PatchProxy.apply(null, this, CaptchaResetPasswordActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CaptchaResetPasswordFragment();
       obj.setArguments(this.getIntent().getExtras());
       return obj;
    }
}
