package com.yxcorp.login.userlogin.activity.RegisterUserInfoSettingActivity;
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
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.userlogin.fragment.RegisterUserInfoSettingFragment;
import android.content.Intent;

public class RegisterUserInfoSettingActivity extends SingleFragmentActivity	// class@001b0c
{
    public RegisterUserInfoSettingFragment y;

    public void RegisterUserInfoSettingActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, RegisterUserInfoSettingActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://signup_profile_edit";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RegisterUserInfoSettingActivity.class, "1")) {
          return;
       }
       this.getWindow().setSoftInputMode(18);
       super.onCreate(p0);
       return;
    }
    public Fragment u3(){
       RegisterUserInfoSettingFragment obj = PatchProxy.apply(null, this, RegisterUserInfoSettingActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RegisterUserInfoSettingFragment();
       this.y = obj;
       obj.setArguments(this.getIntent().getExtras());
       return this.y;
    }
}
