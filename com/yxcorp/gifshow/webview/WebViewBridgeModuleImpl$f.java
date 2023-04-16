package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$f;
import u07.u;
import java.lang.String;
import android.app.Activity;
import f55.g;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.location.k;
import e66.e;
import com.yxcorp.gifshow.util.PermissionUtils;
import android.os.Bundle;
import brd.t;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$f$a;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$f$b;
import erd.g;
import crd.b;

public final class WebViewBridgeModuleImpl$f implements u	// class@0016db
{
    public final String b;
    public final Activity c;
    public final g d;

    public void WebViewBridgeModuleImpl$f(String p0,Activity p1,g p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewBridgeModuleImpl$f.class, "1")) {
          return;
       }
       k.g(this.b, true);
       if (e.a()) {
          PermissionUtils.s(this.c);
          this.d.a(401, "no permission", null);
       }else {
          PermissionUtils.f(this.c, "android.permission.ACCESS_FINE_LOCATION").subscribe(new WebViewBridgeModuleImpl$f$a(this), new WebViewBridgeModuleImpl$f$b(this));
       }
       return;
    }
}
