package com.yxcorp.login.userlogin.activity.VerifyPhoneActivity;
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
import com.yxcorp.login.bind.fragment.PhoneVerifyFragment;

public class VerifyPhoneActivity extends SingleFragmentActivity	// class@001b11
{
    public PhoneVerifyParams y;

    public void VerifyPhoneActivity(){
       super();
    }
    public int M(){
       return 3;
    }
    public int getPage(){
       return 0x7537;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, VerifyPhoneActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://verify_account_by_phone";
    }
    public Fragment u3(){
       Object obj = PatchProxy.apply(null, this, VerifyPhoneActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PhoneVerifyFragment();
    }
}
