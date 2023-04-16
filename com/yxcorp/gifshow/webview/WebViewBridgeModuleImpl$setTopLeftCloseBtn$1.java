package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$setTopLeftCloseBtn$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl;
import com.yxcorp.gifshow.webview.view.c;
import txc.b;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPageButtonParams;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$setTopLeftCloseBtn$1$a;
import com.yxcorp.gifshow.webview.view.c$b;

public final class WebViewBridgeModuleImpl$setTopLeftCloseBtn$1 extends Lambda implements a	// class@0016ef
{
    public final c $actionBar;
    public final b $bridgeContext;
    public final JsPageButtonParams $pageButtonParams;
    public final KwaiYodaWebView $webView;
    public final WebViewBridgeModuleImpl this$0;

    public void WebViewBridgeModuleImpl$setTopLeftCloseBtn$1(WebViewBridgeModuleImpl p0,c p1,b p2,JsPageButtonParams p3,KwaiYodaWebView p4){
       this.this$0 = p0;
       this.$actionBar = p1;
       this.$bridgeContext = p2;
       this.$pageButtonParams = p3;
       this.$webView = p4;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, WebViewBridgeModuleImpl$setTopLeftCloseBtn$1.class, "1")) {
          return;
       }
       WebViewBridgeModuleImpl$setTopLeftCloseBtn$1 t$actionBar = this.$actionBar;
       if (t$actionBar != null) {
          t$actionBar.o(this.$bridgeContext.o(), this.$pageButtonParams, new WebViewBridgeModuleImpl$setTopLeftCloseBtn$1$a(this));
       }
       return;
    }
}
