package com.vivo.push.sdk.LinkProxyClientActivity;
import com.vivo.push.sdk.service.LinkProxyActivity;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class LinkProxyClientActivity extends LinkProxyActivity	// class@001094
{

    public void LinkProxyClientActivity(){
       super();
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
