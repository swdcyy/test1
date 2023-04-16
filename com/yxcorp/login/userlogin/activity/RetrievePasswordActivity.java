package com.yxcorp.login.userlogin.activity.RetrievePasswordActivity;
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
import com.yxcorp.login.userlogin.fragment.RetrievePasswordFragment;
import android.content.Intent;
import android.os.Bundle;

public class RetrievePasswordActivity extends SingleFragmentActivity	// class@001b0e
{

    public void RetrievePasswordActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, RetrievePasswordActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://retrivepsd";
    }
    public Fragment u3(){
       RetrievePasswordFragment obj = PatchProxy.apply(null, this, RetrievePasswordActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RetrievePasswordFragment();
       obj.setArguments(this.getIntent().getExtras());
       return obj;
    }
}
