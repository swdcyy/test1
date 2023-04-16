package com.yxcorp.plugin.setting.cache.activity.ClearCacheActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import androidx.fragment.app.Fragment;
import com.kwai.framework.cache.initmodule.CheckDiskModule;
import x56.d;
import android.os.Bundle;
import com.yxcorp.plugin.setting.cache.fragment.ab.ClearCacheNewUiFragment;
import com.yxcorp.plugin.setting.cache.fragment.ClearCacheFragment;

public class ClearCacheActivity extends SingleFragmentActivity	// class@000829
{
    public Fragment y;
    public static boolean z = true;

    public void ClearCacheActivity(){
       super();
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, ClearCacheActivity.class, "3")) {
          return;
       }
       this.setResult(-1, new Intent());
       super.finish();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ClearCacheActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://clear_cache";
    }
    public Fragment u3(){
       d obj = PatchProxy.apply(null, this, ClearCacheActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = CheckDiskModule.t;
       if (obj != null) {
          ClearCacheActivity.z = obj.enableLowDiskModeAutoClear;
       }
       if (this.getIntent() == null || this.getIntent().getExtras() == null) {
          if (ClearCacheActivity.z) {
             return new ClearCacheNewUiFragment();
          }else {
             return new ClearCacheFragment();
          }
       }else if(ClearCacheActivity.z){
          this.y = new ClearCacheNewUiFragment();
       }else {
          this.y = new ClearCacheFragment();
       }
       this.y.setArguments(this.getIntent().getExtras());
       return this.y;
    }
    public boolean y3(){
       return true;
    }
}
