package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$i;
import u07.u;
import f55.g;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.webview.yoda.utils.a;
import android.os.Bundle;

public final class WebViewBridgeModuleImpl$i implements u	// class@0016e2
{
    public final g b;

    public void WebViewBridgeModuleImpl$i(g p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewBridgeModuleImpl$i.class, "1")) {
          return;
       }
       a.p(p0, "dialog");
       a.p(p1, "view");
       this.b.a(a.d, "no auth", null);
       return;
    }
}
