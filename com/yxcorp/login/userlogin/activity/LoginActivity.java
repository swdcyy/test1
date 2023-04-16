package com.yxcorp.login.userlogin.activity.LoginActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import com.yxcorp.login.util.ActivityPendingLaunchUtil$PendingCategory;
import com.yxcorp.login.loginaction.LoginHelper;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.view.View;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import android.os.Bundle;
import rkd.b;
import android.view.Window;
import com.yxcorp.login.userlogin.loginentryhelper.LoginEntrancePageManager;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.userlogin.fragment.PhoneLoginFragment;

public class LoginActivity extends SingleFragmentActivity	// class@001b06
{
    public LoginFragment y;

    public void LoginActivity(){
       super();
    }
    public void A3(LoginUserResponse p0,boolean p1){
       LoginActivity loginActivit = LoginActivity.class;
       if (PatchProxy.isSupport(loginActivit) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, loginActivit, "5")) {
          return;
       }
       if (p0 != null || p1) {
          LoginHelper.g(this, p0, p1, null, j0.f(this.getIntent(), "loginEntry"), false);
       }
       this.setResult(-1);
       this.finish();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LoginActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://login";
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoginActivity.class, "2")) {
          return;
       }
       LoginActivity ty = this.y;
       if (ty != null) {
          ty.onClick(p0);
       }
       return;
    }
    public void onCreate(Bundle p0){
       LoginActivity loginActivit = LoginActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, loginActivit, "4")) {
          return;
       }
       if (b.g() && !PatchProxy.applyVoid(null, this, loginActivit, "7")) {
          this.setRequestedOrientation(-1);
       }
       super.onCreate(p0);
       this.getWindow().getDecorView().setBackgroundColor(-1);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LoginActivity.class, "6")) {
          return;
       }
       super.onDestroy();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LoginActivity.class, "3")) {
          return;
       }
       super.onResume();
       if (this.getIntent().getBooleanExtra("INTERRUPT_ENTER_LOGIN", false)) {
          LoginEntrancePageManager.e.b();
       }
       return;
    }
    public Fragment u3(){
       PhoneLoginFragment obj = PatchProxy.apply(null, this, LoginActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PhoneLoginFragment();
       this.y = obj;
       obj.setArguments(this.getIntent().getExtras());
       return this.y;
    }
}
