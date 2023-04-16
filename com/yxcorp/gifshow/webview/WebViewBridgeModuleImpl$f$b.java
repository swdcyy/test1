package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$f$b;
import erd.g;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$f;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;
import f55.g;

public final class WebViewBridgeModuleImpl$f$b implements g	// class@0016da
{
    public final WebViewBridgeModuleImpl$f b;

    public void WebViewBridgeModuleImpl$f$b(WebViewBridgeModuleImpl$f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebViewBridgeModuleImpl$f$b.class, "1")) {
       }else {
          this.b.d.a(401, "no permission", null);
       }
       return;
    }
}
