package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$d$b;
import erd.g;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$d;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;
import f55.g;

public final class WebViewBridgeModuleImpl$d$b implements g	// class@0016d5
{
    public final WebViewBridgeModuleImpl$d b;

    public void WebViewBridgeModuleImpl$d$b(WebViewBridgeModuleImpl$d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebViewBridgeModuleImpl$d$b.class, "1")) {
       }else {
          this.b.d.a(401, "no permission", null);
       }
       return;
    }
}
