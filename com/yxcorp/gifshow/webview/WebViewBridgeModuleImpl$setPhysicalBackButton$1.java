package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$setPhysicalBackButton$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl;
import com.yxcorp.gifshow.webview.view.c;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPhysicalBackButtonParams;
import txc.b;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$setPhysicalBackButton$1$a;
import com.yxcorp.gifshow.webview.view.c$d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.webview.view.b;
import com.yxcorp.gifshow.webview.view.c$b;
import com.yxcorp.gifshow.webview.view.c$c;

public final class WebViewBridgeModuleImpl$setPhysicalBackButton$1 extends Lambda implements a	// class@0016ea
{
    public final c $actionBar;
    public final b $bridgeContext;
    public final JsPhysicalBackButtonParams $physicalBackButtonParams;
    public final KwaiYodaWebView $webView;
    public final WebViewBridgeModuleImpl this$0;

    public void WebViewBridgeModuleImpl$setPhysicalBackButton$1(WebViewBridgeModuleImpl p0,c p1,JsPhysicalBackButtonParams p2,b p3,KwaiYodaWebView p4){
       this.this$0 = p0;
       this.$actionBar = p1;
       this.$physicalBackButtonParams = p2;
       this.$bridgeContext = p3;
       this.$webView = p4;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, WebViewBridgeModuleImpl$setPhysicalBackButton$1.class, "1")) {
          return;
       }
       WebViewBridgeModuleImpl$setPhysicalBackButton$1 t$actionBar = this.$actionBar;
       if (t$actionBar != null) {
          WebViewBridgeModuleImpl$setPhysicalBackButton$1 t$physicalBa = this.$physicalBackButtonParams;
          WebViewBridgeModuleImpl$setPhysicalBackButton$1$a osetPhysical = new WebViewBridgeModuleImpl$setPhysicalBackButton$1$a(this);
          if (!PatchProxy.applyVoidTwoRefs(t$physicalBa, osetPhysical, t$actionBar, c.class, "20")) {
             c b = t$actionBar.b;
             if (b instanceof c$d) {
                if (!TextUtils.x(t$physicalBa.mOnClick)) {
                   b.setOnBackPressedListener(new b(t$actionBar, osetPhysical, t$physicalBa));
                }else {
                   b.setOnBackPressedListener(objArray);
                }
                t$actionBar.r = true;
             }
          }
       }
       return;
    }
}
