package com.yxcorp.login.userlogin.activity.SwitchAccountActivity;
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
import com.yxcorp.login.userlogin.fragment.SwitchAccountFragment;

public class SwitchAccountActivity extends SingleFragmentActivity	// class@001b10
{

    public void SwitchAccountActivity(){
       super();
    }
    public int getPage(){
       return 0x75c7;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, SwitchAccountActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "";
    }
    public Fragment u3(){
       Object obj = PatchProxy.apply(null, this, SwitchAccountActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SwitchAccountFragment();
    }
}
