package com.yxcorp.gifshow.webview.OuterWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class OuterWebViewActivity extends KwaiYodaWebViewActivity	// class@0016d0
{

    public void OuterWebViewActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, OuterWebViewActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
