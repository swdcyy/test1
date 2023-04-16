package com.yxcorp.login.userlogin.activity.PhoneOneKeyLoginV4Activity;
import com.yxcorp.login.userlogin.activity.LoginActivity;
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
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.login.userlogin.fragment.PhoneOneKeyLoginV4Fragment;
import androidx.fragment.app.Fragment;
import android.os.Bundle;

public class PhoneOneKeyLoginV4Activity extends LoginActivity	// class@001b0a
{
    public Bundle A;
    public PhoneOneKeyLoginV4Fragment z;

    public void PhoneOneKeyLoginV4Activity(){
       super();
    }
    public void A3(LoginUserResponse p0,boolean p1){
       PhoneOneKeyLoginV4Activity phoneOneKeyL = PhoneOneKeyLoginV4Activity.class;
       if (PatchProxy.isSupport(phoneOneKeyL) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, phoneOneKeyL, "4")) {
          return;
       }
       LoginHelper.g(this, p0, p1, null, j0.f(this.getIntent(), "loginEntry"), false);
       this.setResult(-1);
       this.finish();
       return;
    }
    public int M(){
       return 1;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PhoneOneKeyLoginV4Activity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return false;
    }
    public String o(){
       PhoneOneKeyLoginV4Activity obj = PatchProxy.apply(null, this, PhoneOneKeyLoginV4Activity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z;
       if (obj != null) {
          return obj.o();
       }
       return "PHONE_QUICK_LOGIN_PAGE";
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, PhoneOneKeyLoginV4Activity.class, "3")) {
          return;
       }
       super.onBackPressed();
       this.finish();
       return;
    }
    public Fragment u3(){
       Bundle obj = PatchProxy.apply(null, this, PhoneOneKeyLoginV4Activity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.getIntent().getExtras() != null)? this.getIntent().getExtras(): new Bundle();
       this.A = obj;
       if (this.z == null) {
          this.z = new PhoneOneKeyLoginV4Fragment();
       }
       this.z.setArguments(this.A);
       return this.z;
    }
}
