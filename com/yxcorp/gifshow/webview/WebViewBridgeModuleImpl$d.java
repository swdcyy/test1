package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$d;
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
import com.tbruyelle.rxpermissions2.g;
import brd.t;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$d$a;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$d$b;
import erd.g;
import crd.b;

public final class WebViewBridgeModuleImpl$d implements u	// class@0016d6
{
    public final String b;
    public final Activity c;
    public final g d;

    public void WebViewBridgeModuleImpl$d(String p0,Activity p1,g p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewBridgeModuleImpl$d.class, "1")) {
          return;
       }
       k.g(this.b, true);
       if (e.a()) {
          PermissionUtils.s(this.c);
          this.d.a(401, "no permission", null);
       }else {
          String[] stringArray = new String[]{"android.permission.ACCESS_FINE_LOCATION"};
          new g(this.c).e(stringArray).subscribe(new WebViewBridgeModuleImpl$d$a(this), new WebViewBridgeModuleImpl$d$b(this));
       }
       return;
    }
}
