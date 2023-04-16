package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$k;
import erd.g;
import f55.g;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationWithCheckResult$JsLocationData;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.location.model.LocationCityInfo;
import o96.u;
import android.os.Bundle;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationWithCheckResult;

public final class WebViewBridgeModuleImpl$k implements g	// class@0016e4
{
    public final g b;
    public final JsLocationWithCheckResult$JsLocationData c;

    public void WebViewBridgeModuleImpl$k(g p0,JsLocationWithCheckResult$JsLocationData p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebViewBridgeModuleImpl$k.class, "1")) {
       }else {
          p0 = u.d();
          if (p0 == null) {
             this.b.a(412, "unknown error", null);
          }else {
             WebViewBridgeModuleImpl$k tc = this.c;
             tc.mLatitude = p0.mLatitude;
             tc.mLongitude = p0.mLongitude;
             this.b.onSuccess(new JsLocationWithCheckResult(1, tc));
          }
       }
       return;
    }
}
