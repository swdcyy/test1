package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$h;
import u07.u;
import java.lang.String;
import android.app.Activity;
import f55.g;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationWithCheckResult$JsLocationData;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.location.k;
import android.content.Context;
import lnc.w5;
import android.os.Bundle;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$h$a;
import java.util.concurrent.Callable;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$h$b;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$h$c;
import erd.g;
import crd.b;

public final class WebViewBridgeModuleImpl$h implements u	// class@0016e0
{
    public final String b;
    public final Activity c;
    public final g d;
    public final JsLocationWithCheckResult$JsLocationData e;

    public void WebViewBridgeModuleImpl$h(String p0,Activity p1,g p2,JsLocationWithCheckResult$JsLocationData p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewBridgeModuleImpl$h.class, "1")) {
          return;
       }
       a.p(p0, "dialog");
       a.p(p1, "view");
       k.g(this.b, true);
       if (!w5.a(this.c)) {
          this.d.a(401, "no permission", null);
          return;
       }else {
          t.fromCallable(new WebViewBridgeModuleImpl$h$a(this)).delay(1000, TimeUnit.MILLISECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(new WebViewBridgeModuleImpl$h$b(this), new WebViewBridgeModuleImpl$h$c(this));
          return;
       }
    }
}
