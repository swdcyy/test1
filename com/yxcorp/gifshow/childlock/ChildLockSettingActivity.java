package com.yxcorp.gifshow.childlock.ChildLockSettingActivity;
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
import com.yxcorp.gifshow.childlock.fragment.ChildLockSettingFragment;
import android.content.Intent;
import android.os.Bundle;

public class ChildLockSettingActivity extends SingleFragmentActivity	// class@001077
{
    public static final int y;

    public void ChildLockSettingActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ChildLockSettingActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://safe_lock";
    }
    public Fragment u3(){
       ChildLockSettingFragment obj = PatchProxy.apply(null, this, ChildLockSettingActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ChildLockSettingFragment();
       obj.setArguments(this.getIntent().getExtras());
       return obj;
    }
}
