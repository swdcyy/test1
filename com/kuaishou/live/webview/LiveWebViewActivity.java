package com.kuaishou.live.webview.LiveWebViewActivity;
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
import android.os.Bundle;
import kq3.b;
import kq3.a;
import java.lang.ref.WeakReference;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import android.content.Intent;
import com.kuaishou.webkit.WebView;
import uxc.g;
import wkd.b;
import eyc.a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import o63.a;
import o63.e;
import com.kuaishou.live.webview.a;
import lp3.e;
import lp3.c;

public class LiveWebViewActivity extends KwaiYodaWebViewActivity	// class@000ffb
{
    public a J;

    public void LiveWebViewActivity(){
       super();
    }
    public static KwaiYodaWebViewActivity$c G3(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveWebViewActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiYodaWebViewActivity.F3(p0, LiveWebViewActivity.class, p1);
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LiveWebViewActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWebViewActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = null;
       p0 = PatchProxy.apply(objArray, objArray, b.class, "2");
       if (p0 != PatchProxyResult.class) {
          objArray = p0;
       }else {
          WeakReference a = b.a;
          if (a != null) {
             b.a.clear();
             b.a = objArray;
             objArray = a.get();
          }
       }
       this.J = objArray;
       return;
    }
    public Fragment u3(){
       KwaiYodaWebViewActivity obj = PatchProxy.apply(null, this, LiveWebViewActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj != null) {
          obj.lh(this);
          return this.y;
       }else {
          KwaiYodaWebViewFragment kwaiYodaWebV = new KwaiYodaWebViewFragment();
          this.y = kwaiYodaWebV;
          kwaiYodaWebV.lh(this);
          this.y.setArguments(this.getIntent().getExtras());
          return this.y;
       }
    }
    public void w1(WebViewFragment p0,WebView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveWebViewActivity.class, "3")) {
          return;
       }
       g.b(this, p0, p1);
       if (this.J != null) {
          if (!b.a(-1275906972).isKwaiUrl(this.getWebUrl())) {
             return;
          }else {
             LiveWebViewActivity tJ = this.J;
             a h = tJ.h;
             if (h != null) {
                if (p1 instanceof YodaBaseWebView) {
                   a.d(p1, h, null);
                }
             }else {
                e uoe = tJ.a();
                if (uoe == null || (!uoe.b() && p1 instanceof YodaBaseWebView)) {
                   a.d(p1, uoe.c(a.class), null);
                }
             }
          }
       }
       return;
    }
}
