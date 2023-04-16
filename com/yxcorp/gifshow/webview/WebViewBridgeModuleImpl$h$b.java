package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$h$b;
import erd.g;
import com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$h;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.location.model.LocationCityInfo;
import o96.u;
import android.os.Bundle;
import f55.g;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationWithCheckResult$JsLocationData;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationWithCheckResult;

public final class WebViewBridgeModuleImpl$h$b implements g	// class@0016de
{
    public final WebViewBridgeModuleImpl$h b;

    public void WebViewBridgeModuleImpl$h$b(WebViewBridgeModuleImpl$h p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebViewBridgeModuleImpl$h$b.class, "1")) {
       }else {
          p0 = u.d();
          if (p0 == null) {
             this.b.d.a(412, "unknown error", null);
          }else {
             WebViewBridgeModuleImpl$h$b tb = this.b;
             WebViewBridgeModuleImpl$h e = tb.e;
             e.mLatitude = p0.mLatitude;
             e.mLongitude = p0.mLongitude;
             tb.d.onSuccess(new JsLocationWithCheckResult(1, e));
          }
       }
       return;
    }
}
