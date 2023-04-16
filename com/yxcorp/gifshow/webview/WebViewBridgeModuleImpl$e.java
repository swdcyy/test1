package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$e;
import u07.u;
import f55.g;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.yoda.utils.a;
import android.os.Bundle;

public final class WebViewBridgeModuleImpl$e implements u	// class@0016d7
{
    public final g b;

    public void WebViewBridgeModuleImpl$e(g p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewBridgeModuleImpl$e.class, "1")) {
          return;
       }
       this.b.a(a.d, "no permission", null);
       return;
    }
}
