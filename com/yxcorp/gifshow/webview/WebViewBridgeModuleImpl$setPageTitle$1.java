package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$setPageTitle$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.webview.view.c;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPageTitleParams;
import f55.g;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class WebViewBridgeModuleImpl$setPageTitle$1 extends Lambda implements a	// class@0016e8
{
    public final c $actionBar;
    public final g $callback;
    public final JsPageTitleParams $jsPageTitleParams;

    public void WebViewBridgeModuleImpl$setPageTitle$1(c p0,JsPageTitleParams p1,g p2){
       this.$actionBar = p0;
       this.$jsPageTitleParams = p1;
       this.$callback = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, WebViewBridgeModuleImpl$setPageTitle$1.class, "1")) {
          return;
       }
       this.$actionBar.l(this.$jsPageTitleParams);
       this.$callback.onSuccess(null);
       return;
    }
}
