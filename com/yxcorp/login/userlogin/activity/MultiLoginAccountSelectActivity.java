package com.yxcorp.login.userlogin.activity.MultiLoginAccountSelectActivity;
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
import com.yxcorp.login.userlogin.fragment.MultiLoginAccountSelectFragment;
import android.content.Intent;
import android.os.Bundle;

public class MultiLoginAccountSelectActivity extends SingleFragmentActivity	// class@001b07
{

    public void MultiLoginAccountSelectActivity(){
       super();
    }
    public int M(){
       return 1;
    }
    public int getPage(){
       return 201;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MultiLoginAccountSelectActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://multi_account_select";
    }
    public Fragment u3(){
       MultiLoginAccountSelectFragment obj = PatchProxy.apply(null, this, MultiLoginAccountSelectActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MultiLoginAccountSelectFragment();
       obj.setArguments(this.getIntent().getExtras());
       return obj;
    }
}
