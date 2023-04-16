package com.yxcorp.plugin.setting.activity.UpdatesSettingPrivacyActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.setting.fragment.UpdatesSettingPrivacyFragment;

public class UpdatesSettingPrivacyActivity extends SingleFragmentActivity	// class@000819
{
    public BaseFragment y;
    public static final int z;

    public void UpdatesSettingPrivacyActivity(){
       super();
    }
    public int M(){
       return 1;
    }
    public int f(){
       UpdatesSettingPrivacyActivity obj = PatchProxy.apply(null, this, UpdatesSettingPrivacyActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       int i = (obj != null)? obj.f(): 0;
       return i;
    }
    public int getPage(){
       return 45;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, UpdatesSettingPrivacyActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       UpdatesSettingPrivacyActivity obj = PatchProxy.apply(null, this, UpdatesSettingPrivacyActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       String url = (obj != null)? obj.getUrl(): "";
       return url;
    }
    public Fragment u3(){
       UpdatesSettingPrivacyFragment obj = PatchProxy.apply(null, this, UpdatesSettingPrivacyActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, UpdatesSettingPrivacyFragment.class, "8");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = new UpdatesSettingPrivacyFragment();
       }
       this.y = obj;
       return obj;
    }
    public boolean y3(){
       return true;
    }
}
