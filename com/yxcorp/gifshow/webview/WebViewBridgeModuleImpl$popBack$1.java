package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$popBack$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import android.app.Activity;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.webkit.WebView;

public final class WebViewBridgeModuleImpl$popBack$1 extends Lambda implements a	// class@0016e6
{
    public final Activity $act;
    public final KwaiYodaWebView $webView;

    public void WebViewBridgeModuleImpl$popBack$1(KwaiYodaWebView p0,Activity p1){
       this.$webView = p0;
       this.$act = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, WebViewBridgeModuleImpl$popBack$1.class, "1")) {
          return;
       }
       if (this.$webView.canGoBack()) {
          this.$webView.goBack();
       }else {
          WebViewBridgeModuleImpl$popBack$1 t$act = this.$act;
          if (t$act != null) {
             t$act.finish();
          }
       }
       return;
    }
}
