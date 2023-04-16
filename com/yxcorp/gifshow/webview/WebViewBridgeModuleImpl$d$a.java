package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$d$a;
import erd.g;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$d;
import java.lang.Object;
import zq8.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cyc.c;
import f55.g;
import android.app.Activity;
import com.yxcorp.gifshow.util.PermissionUtils;
import e66.e;
import android.os.Bundle;

public final class WebViewBridgeModuleImpl$d$a implements g	// class@0016d4
{
    public final WebViewBridgeModuleImpl$d b;

    public void WebViewBridgeModuleImpl$d$a(WebViewBridgeModuleImpl$d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebViewBridgeModuleImpl$d$a.class, "1")) {
       }else {
          a.p(p0, "permission");
          int i = 1;
          if (p0.b != null) {
             this.b.d.onSuccess(new c(i));
          }else if(!PermissionUtils.l(this.b.c, "android.permission.ACCESS_FINE_LOCATION")){
             e.c(i);
          }
          this.b.d.a(401, "no permission", null);
       }
       return;
    }
}
