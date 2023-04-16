package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$setTopLeftSecondBtn$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl;
import com.yxcorp.gifshow.webview.view.c;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPageButtonParams;
import txc.b;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$setTopLeftSecondBtn$1$a;
import com.yxcorp.gifshow.webview.view.c$b;

public final class WebViewBridgeModuleImpl$setTopLeftSecondBtn$1 extends Lambda implements a	// class@0016f1
{
    public final c $actionBar;
    public final b $bridgeContext;
    public final JsPageButtonParams $pageButtonParams;
    public final KwaiYodaWebView $webView;
    public final WebViewBridgeModuleImpl this$0;

    public void WebViewBridgeModuleImpl$setTopLeftSecondBtn$1(WebViewBridgeModuleImpl p0,c p1,JsPageButtonParams p2,b p3,KwaiYodaWebView p4){
       this.this$0 = p0;
       this.$actionBar = p1;
       this.$pageButtonParams = p2;
       this.$bridgeContext = p3;
       this.$webView = p4;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, WebViewBridgeModuleImpl$setTopLeftSecondBtn$1.class, "1")) {
          return;
       }
       WebViewBridgeModuleImpl$setTopLeftSecondBtn$1 t$actionBar = this.$actionBar;
       if (t$actionBar != null) {
          t$actionBar.p(this.$pageButtonParams, new WebViewBridgeModuleImpl$setTopLeftSecondBtn$1$a(this));
       }
       return;
    }
}
