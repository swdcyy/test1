package com.yxcorp.login.userlogin.activity.ResetSelectedAccountPasswordActivity;
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
import androidx.fragment.app.Fragment;
import com.yxcorp.login.userlogin.fragment.ResetSelectedAccountPasswordFragment;
import android.content.Intent;

public class ResetSelectedAccountPasswordActivity extends SingleFragmentActivity	// class@001b0d
{

    public void ResetSelectedAccountPasswordActivity(){
       super();
    }
    public int M(){
       return 1;
    }
    public int getPage(){
       return 0x7d72;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ResetSelectedAccountPasswordActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://reset_password";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResetSelectedAccountPasswordActivity.class, "1")) {
          return;
       }
       this.setTheme(R.style.arg_RES_7f11017e);
       super.onCreate(p0);
       return;
    }
    public Fragment u3(){
       ResetSelectedAccountPasswordFragment obj = PatchProxy.apply(null, this, ResetSelectedAccountPasswordActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ResetSelectedAccountPasswordFragment();
       obj.setArguments(this.getIntent().getExtras());
       return obj;
    }
}
