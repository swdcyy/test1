package com.yxcorp.login.userlogin.activity.SetPasswordActivity;
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
import com.yxcorp.login.userlogin.fragment.SetPasswordFragment;
import android.content.Intent;

public class SetPasswordActivity extends SingleFragmentActivity	// class@001b0f
{

    public void SetPasswordActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, SetPasswordActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return null;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SetPasswordActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public Fragment u3(){
       SetPasswordFragment obj = PatchProxy.apply(null, this, SetPasswordActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SetPasswordFragment();
       obj.setArguments(this.getIntent().getExtras());
       return obj;
    }
}
