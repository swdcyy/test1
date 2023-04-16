package com.yxcorp.gifshow.ad.webview.FansTopYodaActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Context;
import java.lang.String;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.kuaishou.webkit.WebView;
import android.view.View;
import java.lang.Boolean;
import java.lang.Integer;

public class FansTopYodaActivity extends KwaiYodaWebViewActivity	// class@0018a3
{
    public View J;
    public int K;

    public void FansTopYodaActivity(){
       super();
       this.K = 0;
    }
    public static KwaiYodaWebViewActivity$c G3(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FansTopYodaActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiYodaWebViewActivity.F3(p0, FansTopYodaActivity.class, p1);
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, FansTopYodaActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void w1(WebViewFragment p0,WebView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FansTopYodaActivity.class, "1")) {
          return;
       }
       this.J = this.findViewById(0x7f0a3698);
       FansTopYodaActivity tK = this.K;
       if (PatchProxy.isSupport(FansTopYodaActivity.class)) {
          PatchProxy.applyVoidTwoRefs(Boolean.FALSE, Integer.valueOf(tK), this, FansTopYodaActivity.class, "2");
       }
       return;
    }
}
