package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$j;
import java.util.concurrent.Callable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o96.u;

public final class WebViewBridgeModuleImpl$j implements Callable	// class@0016e3
{
    public final String b;

    public void WebViewBridgeModuleImpl$j(String p0){
       this.b = p0;
       super();
    }
    public Object call(){
       Boolean uBoolean = PatchProxy.apply(null, this, WebViewBridgeModuleImpl$j.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          u.k("default", "yoda_request_location", this.b);
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
}
