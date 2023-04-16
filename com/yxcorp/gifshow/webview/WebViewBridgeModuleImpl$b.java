package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$b;
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
import com.kwai.framework.location.k;
import android.content.Context;
import lnc.w5;
import android.os.Bundle;
import com.kwai.framework.location.model.LocationCityInfo;
import o96.u;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationWithCheckResult;

public final class WebViewBridgeModuleImpl$b implements u	// class@0016d2
{
    public final String b;
    public final Activity c;
    public final g d;
    public final JsLocationWithCheckResult$JsLocationData e;

    public void WebViewBridgeModuleImpl$b(String p0,Activity p1,g p2,JsLocationWithCheckResult$JsLocationData p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewBridgeModuleImpl$b.class, "1")) {
          return;
       }
       boolean b = true;
       k.g(this.b, b);
       Bundle uBundle = null;
       if (!w5.a(this.c)) {
          this.d.a(401, "no permission", uBundle);
          return;
       }else {
          LocationCityInfo locationCity = u.d();
          if (locationCity == null) {
             this.d.a(412, "unknown error", uBundle);
             return;
          }else {
             WebViewBridgeModuleImpl$b te = this.e;
             te.mLatitude = locationCity.mLatitude;
             te.mLongitude = locationCity.mLongitude;
             this.d.onSuccess(new JsLocationWithCheckResult(b, te));
             return;
          }
       }
    }
}
