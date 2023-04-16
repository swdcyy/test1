package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$f$a;
import erd.g;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$f;
import java.lang.Object;
import zq8.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cyc.c;
import f55.g;
import android.os.Bundle;

public final class WebViewBridgeModuleImpl$f$a implements g	// class@0016d9
{
    public final WebViewBridgeModuleImpl$f b;

    public void WebViewBridgeModuleImpl$f$a(WebViewBridgeModuleImpl$f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebViewBridgeModuleImpl$f$a.class, "1")) {
       }else {
          a.p(p0, "permission");
          if (p0.b != null) {
             this.b.d.onSuccess(new c(1));
          }else {
             this.b.d.a(401, "no permission", null);
          }
       }
       return;
    }
}
