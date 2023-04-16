package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$h$a;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o96.u;

public final class WebViewBridgeModuleImpl$h$a implements Callable	// class@0016dd
{
    public final WebViewBridgeModuleImpl$h b;

    public void WebViewBridgeModuleImpl$h$a(WebViewBridgeModuleImpl$h p0){
       this.b = p0;
       super();
    }
    public Object call(){
       Boolean uBoolean = PatchProxy.apply(null, this, WebViewBridgeModuleImpl$h$a.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          u.k("default", "yoda_request_location", this.b.b);
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
}
