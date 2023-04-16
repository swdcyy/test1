package com.smile.gifmaker.wxapi.WXPayEntryActivity;
import com.yxcorp.wxapi.WXPayEntryBaseActivity;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.String;

public class WXPayEntryActivity extends WXPayEntryBaseActivity	// class@000c3e
{

    public void WXPayEntryActivity(){
       super();
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String u3(){
       return "wxaadbab9d13edff20";
    }
}
