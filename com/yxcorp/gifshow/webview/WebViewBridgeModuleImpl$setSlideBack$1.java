package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$setSlideBack$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.app.Activity;
import com.yxcorp.gifshow.webview.jsmodel.component.JsPageSlideParams;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.kwai.yoda.bridge.YodaBaseWebView;
import px7.b;

public final class WebViewBridgeModuleImpl$setSlideBack$1 extends Lambda implements a	// class@0016eb
{
    public final Activity $act;
    public final JsPageSlideParams $pageSlideParams;
    public final KwaiYodaWebView $webView;

    public void WebViewBridgeModuleImpl$setSlideBack$1(Activity p0,JsPageSlideParams p1,KwaiYodaWebView p2){
       this.$act = p0;
       this.$pageSlideParams = p1;
       this.$webView = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       WebViewBridgeModuleImpl$setSlideBack$1 t$pageSlideP;
       boolean b;
       if (PatchProxy.applyVoid(null, this, WebViewBridgeModuleImpl$setSlideBack$1.class, "1")) {
          return;
       }
       WebViewBridgeModuleImpl$setSlideBack$1 t$act = this.$act;
       if (t$act instanceof KwaiYodaWebViewActivity) {
          t$pageSlideP = this.$pageSlideParams;
          b = (t$pageSlideP != null && t$pageSlideP.mEnabled != null)? true: false;
          Objects.requireNonNull(t$act);
          KwaiYodaWebViewActivity kwaiYodaWebV = KwaiYodaWebViewActivity.class;
          if (!PatchProxy.isSupport(kwaiYodaWebV) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), t$act, kwaiYodaWebV, "25")) {
             KwaiYodaWebViewActivity y = t$act.y;
             if (y != null) {
                y.oh(b);
             }
          }
       }else {
          t$act = this.$webView;
          t$pageSlideP = this.$pageSlideParams;
          String str = (t$pageSlideP != null && t$pageSlideP.mEnabled != null)? "default": "none";
          b.d(t$act, str);
       }
       return;
    }
}
