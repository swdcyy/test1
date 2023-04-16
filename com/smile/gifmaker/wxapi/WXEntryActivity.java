package com.smile.gifmaker.wxapi.WXEntryActivity;
import com.yxcorp.plugin.activity.login.WXEntryBaseActivity;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class WXEntryActivity extends WXEntryBaseActivity	// class@000c3d
{

    public void WXEntryActivity(){
       super();
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
