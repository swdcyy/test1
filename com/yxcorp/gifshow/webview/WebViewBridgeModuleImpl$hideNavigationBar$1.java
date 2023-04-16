package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$hideNavigationBar$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import txc.b;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import com.yxcorp.gifshow.webview.view.c;

public final class WebViewBridgeModuleImpl$hideNavigationBar$1 extends Lambda implements a	// class@0016e1
{
    public final b $bridgeContext;

    public void WebViewBridgeModuleImpl$hideNavigationBar$1(b p0){
       this.$bridgeContext = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, WebViewBridgeModuleImpl$hideNavigationBar$1.class, "1")) {
          return;
       }
       c actionBarMan = this.$bridgeContext.p().getActionBarManager();
       if (actionBarMan != null) {
          actionBarMan.h(8);
       }
       return;
    }
}
