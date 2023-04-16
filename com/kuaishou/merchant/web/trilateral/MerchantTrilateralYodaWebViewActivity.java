package com.kuaishou.merchant.web.trilateral.MerchantTrilateralYodaWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import gr8.a;
import q74.d;
import android.content.Intent;
import ekd.j0;
import com.kuaishou.merchant.live.screenshot.b;
import androidx.lifecycle.Lifecycle$Event;
import cn4.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import z1.k;
import n04.a;
import q87.c;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.web.trilateral.MerchantTrilateralYodaWebViewFragment;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.kuaishou.webkit.WebView;
import uxc.g;
import com.kuaishou.webkit.DownloadListener;

public class MerchantTrilateralYodaWebViewActivity extends KwaiYodaWebViewActivity	// class@0009dc
{
    public boolean J;
    public b K;
    public static final int L;

    public void MerchantTrilateralYodaWebViewActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MerchantTrilateralYodaWebViewActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantTrilateralYodaWebViewActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       d.b(this);
       this.J = j0.a(this.getIntent(), "DISABLE_WEBVIEW_DOWNLOAD", false);
       b uob = new b();
       this.K = uob;
       uob.c(this, Lifecycle$Event.ON_START, 89, new b(this));
       Object[] objArray = new Object[false];
       a.C().w("MerchantTrilateralYodaWebViewActivity", "trilateral webView activity create", objArray);
       return;
    }
    public Fragment u3(){
       KwaiYodaWebViewActivity obj = PatchProxy.apply(null, this, MerchantTrilateralYodaWebViewActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj != null) {
          return obj;
       }
       MerchantTrilateralYodaWebViewFragment merchantTril = new MerchantTrilateralYodaWebViewFragment();
       this.y = merchantTril;
       merchantTril.lh(this);
       this.y.setArguments(this.getIntent().getExtras());
       return this.y;
    }
    public void w1(WebViewFragment p0,WebView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantTrilateralYodaWebViewActivity.class, "2")) {
          return;
       }
       g.b(this, p0, p1);
       if (this.J != null) {
          p1.setDownloadListener(null);
       }
       return;
    }
}
