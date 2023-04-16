package com.yxcorp.gifshow.childlock.ChildLockSettingConfirmActivity;
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
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.childlock.fragment.ChildLockSettingConfirmFragment;
import android.content.Intent;
import android.os.Bundle;

public class ChildLockSettingConfirmActivity extends SingleFragmentActivity	// class@001078
{

    public void ChildLockSettingConfirmActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ChildLockSettingConfirmActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://safe_lock";
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, ChildLockSettingConfirmActivity.class, "2")) {
          return;
       }
       this.setResult(2);
       super.onBackPressed();
       return;
    }
    public Fragment u3(){
       ChildLockSettingConfirmFragment obj = PatchProxy.apply(null, this, ChildLockSettingConfirmActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ChildLockSettingConfirmFragment();
       obj.setArguments(this.getIntent().getExtras());
       return obj;
    }
}
